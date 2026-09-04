package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class CacheByChatsController {
    public static int KEEP_MEDIA_DELETE = 4;
    public static int KEEP_MEDIA_FOREVER = 2;
    public static int KEEP_MEDIA_ONE_DAY = 3;
    public static int KEEP_MEDIA_ONE_MINUTE = 5;
    public static int KEEP_MEDIA_ONE_MONTH = 1;
    public static int KEEP_MEDIA_ONE_WEEK = 0;
    public static int KEEP_MEDIA_TWO_DAY = 6;
    public static final int KEEP_MEDIA_TYPE_CHANNEL = 2;
    public static final int KEEP_MEDIA_TYPE_GROUP = 1;
    public static final int KEEP_MEDIA_TYPE_STORIES = 3;
    public static final int KEEP_MEDIA_TYPE_USER = 0;
    private final int currentAccount;
    private boolean gotKeepMediaByTypes = false;
    private final int[] keepMediaByTypes = {-1, -1, -1, -1};

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public static class KeepMediaException {
        public final long dialogId;
        public int keepMedia;

        public KeepMediaException(long j3, int i10) {
            this.dialogId = j3;
            this.keepMedia = i10;
        }
    }

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public static class KeepMediaFile {
        final File file;
        boolean isStory;
        int keepMedia = -1;
        int dialogType = 2;

        public KeepMediaFile(File file) {
            this.file = file;
        }
    }

    public CacheByChatsController(int i10) {
        this.currentAccount = i10;
    }

    public static long getDaysInSeconds(int i10) {
        if (i10 == KEEP_MEDIA_ONE_WEEK) {
            return 604800L;
        }
        if (i10 == KEEP_MEDIA_ONE_MONTH) {
            return 2592000L;
        }
        if (i10 == KEEP_MEDIA_ONE_DAY) {
            return 86400L;
        }
        if (i10 == KEEP_MEDIA_TWO_DAY) {
            return 172800L;
        }
        return (i10 == KEEP_MEDIA_ONE_MINUTE && BuildVars.DEBUG_PRIVATE_VERSION) ? 60L : Long.MAX_VALUE;
    }

    public static int getDefault(int i10) {
        return i10 == 0 ? KEEP_MEDIA_FOREVER : i10 == 1 ? KEEP_MEDIA_ONE_MONTH : i10 == 2 ? KEEP_MEDIA_ONE_WEEK : i10 == 3 ? KEEP_MEDIA_TWO_DAY : SharedConfig.keepMedia;
    }

    public static String getKeepMediaString(int i10) {
        return i10 == KEEP_MEDIA_ONE_MINUTE ? LocaleController.formatPluralString("Minutes", 1, new Object[0]) : i10 == KEEP_MEDIA_ONE_DAY ? LocaleController.formatPluralString("Days", 1, new Object[0]) : i10 == KEEP_MEDIA_TWO_DAY ? LocaleController.formatPluralString("Days", 2, new Object[0]) : i10 == KEEP_MEDIA_ONE_WEEK ? LocaleController.formatPluralString("Weeks", 1, new Object[0]) : i10 == KEEP_MEDIA_ONE_MONTH ? LocaleController.formatPluralString("Months", 1, new Object[0]) : LocaleController.getString(R.string.AutoDeleteMediaNever);
    }

    public int getKeepMedia(int i10) {
        if (!this.gotKeepMediaByTypes) {
            this.gotKeepMediaByTypes = true;
            for (int i11 = 0; i11 < 4; i11++) {
                this.keepMediaByTypes[i11] = SharedConfig.getPreferences().getInt(i2.g.i(i11, "keep_media_type_"), getDefault(i11));
            }
        }
        int i12 = this.keepMediaByTypes[i10];
        return i12 == -1 ? SharedConfig.keepMedia : i12;
    }

    public ArrayList<KeepMediaException> getKeepMediaExceptions(int i10) {
        ArrayList<KeepMediaException> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        String string = UserConfig.getInstance(this.currentAccount).getPreferences().getString("keep_media_exceptions_" + i10, "");
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Utilities.hexToBytes(string));
        int i11 = wrap.getInt();
        for (int i12 = 0; i12 < i11; i12++) {
            KeepMediaException keepMediaException = new KeepMediaException(wrap.getLong(), wrap.getInt());
            if (!hashSet.contains(Long.valueOf(keepMediaException.dialogId))) {
                hashSet.add(Long.valueOf(keepMediaException.dialogId));
                arrayList.add(keepMediaException);
            }
        }
        wrap.clear();
        return arrayList;
    }

    public LongSparseArray<KeepMediaException> getKeepMediaExceptionsByDialogs() {
        LongSparseArray<KeepMediaException> longSparseArray = new LongSparseArray<>();
        for (int i10 = 0; i10 < 3; i10++) {
            ArrayList<KeepMediaException> keepMediaExceptions = getKeepMediaExceptions(i10);
            if (keepMediaExceptions != null) {
                for (int i11 = 0; i11 < keepMediaExceptions.size(); i11++) {
                    longSparseArray.put(keepMediaExceptions.get(i11).dialogId, keepMediaExceptions.get(i11));
                }
            }
        }
        return longSparseArray;
    }

    public void lookupFiles(ArrayList<? extends KeepMediaFile> arrayList) {
        int i10;
        LongSparseArray<ArrayList<KeepMediaFile>> lookupFiles = FileLoader.getInstance(this.currentAccount).getFileDatabase().lookupFiles(arrayList);
        LongSparseArray<KeepMediaException> keepMediaExceptionsByDialogs = getKeepMediaExceptionsByDialogs();
        for (int i11 = 0; i11 < lookupFiles.size(); i11++) {
            long keyAt = lookupFiles.keyAt(i11);
            ArrayList<KeepMediaFile> valueAt = lookupFiles.valueAt(i11);
            if (keyAt >= 0) {
                i10 = 0;
            } else {
                long j3 = -keyAt;
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
                if (chat == null) {
                    chat = MessagesStorage.getInstance(this.currentAccount).getChatSync(j3);
                }
                i10 = chat == null ? -1 : ChatObject.isChannel(chat) ? 2 : 1;
            }
            KeepMediaException keepMediaException = keepMediaExceptionsByDialogs.get(keyAt);
            for (int i12 = 0; i12 < valueAt.size(); i12++) {
                KeepMediaFile keepMediaFile = valueAt.get(i12);
                if (i10 >= 0) {
                    keepMediaFile.dialogType = i10;
                }
                if (keepMediaException != null) {
                    keepMediaFile.keepMedia = keepMediaException.keepMedia;
                }
            }
        }
    }

    public void saveKeepMediaExceptions(int i10, ArrayList<KeepMediaException> arrayList) {
        String i11 = i2.g.i(i10, "keep_media_exceptions_");
        if (arrayList.isEmpty()) {
            UserConfig.getInstance(this.currentAccount).getPreferences().edit().remove(i11).apply();
            return;
        }
        int size = arrayList.size();
        ByteBuffer allocate = ByteBuffer.allocate((size * 12) + 4);
        allocate.putInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            allocate.putLong(arrayList.get(i12).dialogId);
            allocate.putInt(arrayList.get(i12).keepMedia);
        }
        UserConfig.getInstance(this.currentAccount).getPreferences().edit().putString(i11, Utilities.bytesToHex(allocate.array())).apply();
        allocate.clear();
    }

    public void setKeepMedia(int i10, int i11) {
        if (!this.gotKeepMediaByTypes) {
            this.gotKeepMediaByTypes = true;
            for (int i12 = 0; i12 < 4; i12++) {
                this.keepMediaByTypes[i12] = SharedConfig.getPreferences().getInt(i2.g.i(i12, "keep_media_type_"), getDefault(i12));
            }
        }
        this.keepMediaByTypes[i10] = i11;
        SharedConfig.getPreferences().edit().putInt("keep_media_type_" + i10, i11).apply();
    }
}
