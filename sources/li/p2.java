package li;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.rj0;
import org.telegram.ui.rq0;
import org.telegram.ui.vj0;
import org.telegram.ui.xj0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.a = 4;
        this.d = activity;
        this.b = i10;
        this.e = inputGroupCall;
        this.c = z10;
        this.f = groupCall;
        this.h = hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0440, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0731 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x071c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:468:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x06a5 A[Catch: Exception -> 0x061f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x061f, blocks: (B:477:0x062d, B:503:0x06a5), top: B:470:0x061d }] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x06a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x077d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:519:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0778 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        String extensionFromMimeType;
        String str2;
        int i10;
        int i11;
        int i12;
        int i13;
        final int i14;
        final int i15;
        MediaMetadataRetriever mediaMetadataRetriever;
        int ceil;
        int i16;
        final int i17;
        final int i18;
        final int i19;
        final int i20;
        final String str3;
        int i21;
        String readRes;
        boolean z10;
        int i22;
        int i23;
        TL_feed.FeedPosition feedPosition;
        int i24;
        int i25;
        int i26;
        r71 r71Var;
        wz wzVar;
        r71 r71Var2;
        boolean z11;
        int i27;
        TLRPC.Message message;
        int i28;
        boolean z12;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                final v3 v3Var = (v3) this.d;
                Uri uri = (Uri) this.e;
                String str4 = (String) this.f;
                final a aVar = (a) this.h;
                InputStream inputStream2 = null;
                r5 = null;
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e) {
                    FileLog.e(e);
                    str = null;
                }
                final boolean z13 = this.c;
                int i29 = this.b;
                if (str == null || !b10.t(str)) {
                    Context context = v3Var.getContext();
                    try {
                        if (context != null) {
                            try {
                                inputStream = context.getContentResolver().openInputStream(uri);
                            } catch (Exception e10) {
                                e = e10;
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = null;
                                if (inputStream2 != null) {
                                }
                                if (fileOutputStream == null) {
                                }
                            }
                            if (inputStream != null) {
                                if (str4 != null) {
                                    try {
                                        extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str4);
                                    } catch (Exception e11) {
                                        e = e11;
                                        fileOutputStream = null;
                                        FileLog.e(e);
                                        if (inputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        str = null;
                                        str2 = str;
                                        if (str2 == null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream = null;
                                        inputStream2 = inputStream;
                                        if (inputStream2 != null) {
                                        }
                                        if (fileOutputStream == null) {
                                        }
                                    }
                                } else {
                                    extensionFromMimeType = null;
                                }
                                if (TextUtils.isEmpty(extensionFromMimeType)) {
                                    extensionFromMimeType = z13 ? "mp4" : "jpg";
                                }
                                File file = new File(FileLoader.getDirectory(4), "rich_external_" + (-i29) + "_" + SharedConfig.getLastLocalId() + "." + extensionFromMimeType);
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    try {
                                        AndroidUtilities.copyFile(inputStream, fileOutputStream);
                                        str = file.getAbsolutePath();
                                        try {
                                            inputStream.close();
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        FileLog.e(e);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        str = null;
                                        str2 = str;
                                        if (str2 == null) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStream2 = inputStream;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Exception unused4) {
                                        }
                                    }
                                    if (fileOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (Exception unused5) {
                                        throw th;
                                    }
                                }
                            } else if (inputStream != null) {
                                inputStream.close();
                            }
                        }
                    } catch (Exception unused6) {
                    }
                    str = null;
                }
                str2 = str;
                if (str2 == null || !b10.t(str2)) {
                    return;
                }
                if (z13) {
                    try {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                        } catch (Exception e13) {
                            e = e13;
                            i10 = 0;
                            i11 = 0;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(str2);
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                            i11 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                            if (extractMetadata2 != null) {
                                try {
                                    i12 = Integer.parseInt(extractMetadata2);
                                } catch (Exception e14) {
                                    e = e14;
                                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                                    i10 = 0;
                                    FileLog.e(e);
                                    if (mediaMetadataRetriever2 != null) {
                                        try {
                                            mediaMetadataRetriever2.release();
                                        } catch (Exception unused7) {
                                        }
                                    }
                                    i12 = i10;
                                    i13 = 0;
                                    i14 = i29;
                                    i15 = 0;
                                    if (z13) {
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: li.t2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            v3 v3Var2 = v3.this;
                                            v3Var2.getClass();
                                            boolean z14 = z13;
                                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z14 ? i15 : 0, z14, i18, i20, 0L);
                                            photoEntry.setOrientation(i19, i17);
                                            a aVar2 = aVar;
                                            if (aVar2 == null || !v3.J3(aVar2.b)) {
                                                v3Var2.l2(photoEntry);
                                            } else {
                                                v3Var2.Z1(aVar2, photoEntry);
                                            }
                                        }
                                    });
                                    return;
                                }
                            } else {
                                i12 = 0;
                            }
                            if (extractMetadata3 != null) {
                                try {
                                    ceil = (int) Math.ceil(Long.parseLong(extractMetadata3) / 1000.0d);
                                } catch (Exception e15) {
                                    e = e15;
                                    i10 = i12;
                                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                                    FileLog.e(e);
                                    if (mediaMetadataRetriever2 != null) {
                                    }
                                    i12 = i10;
                                    i13 = 0;
                                    i14 = i29;
                                    i15 = 0;
                                    if (z13) {
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: li.t2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            v3 v3Var2 = v3.this;
                                            v3Var2.getClass();
                                            boolean z14 = z13;
                                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z14 ? i15 : 0, z14, i18, i20, 0L);
                                            photoEntry.setOrientation(i19, i17);
                                            a aVar2 = aVar;
                                            if (aVar2 == null || !v3.J3(aVar2.b)) {
                                                v3Var2.l2(photoEntry);
                                            } else {
                                                v3Var2.Z1(aVar2, photoEntry);
                                            }
                                        }
                                    });
                                    return;
                                }
                            } else {
                                ceil = 0;
                            }
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Exception unused8) {
                            }
                            i13 = 0;
                            i14 = i29;
                            i15 = ceil;
                        } catch (Exception e16) {
                            e = e16;
                            i11 = 0;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            i10 = 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                        if (mediaMetadataRetriever2 != null) {
                            try {
                                mediaMetadataRetriever2.release();
                            } catch (Exception unused9) {
                            }
                        }
                        throw th;
                    }
                } else {
                    i12 = 0;
                    i13 = 0;
                    i11 = 0;
                    i14 = i29;
                    i15 = 0;
                }
                if (z13) {
                    i20 = i12;
                    i17 = i13;
                    str3 = str2;
                    i18 = i11;
                    i19 = i17;
                } else {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str2, options);
                        i11 = options.outWidth;
                        i12 = options.outHeight;
                    } catch (Exception e17) {
                        FileLog.e(e17);
                    }
                    try {
                        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str2);
                        i16 = ((Integer) imageOrientation.first).intValue();
                        try {
                            i17 = ((Integer) imageOrientation.second).intValue();
                        } catch (Exception e18) {
                            e = e18;
                            FileLog.e(e);
                            i17 = i13;
                            i18 = i11;
                            i19 = i16;
                            i20 = i12;
                            str3 = str2;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: li.t2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    v3 v3Var2 = v3.this;
                                    v3Var2.getClass();
                                    boolean z14 = z13;
                                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z14 ? i15 : 0, z14, i18, i20, 0L);
                                    photoEntry.setOrientation(i19, i17);
                                    a aVar2 = aVar;
                                    if (aVar2 == null || !v3.J3(aVar2.b)) {
                                        v3Var2.l2(photoEntry);
                                    } else {
                                        v3Var2.Z1(aVar2, photoEntry);
                                    }
                                }
                            });
                            return;
                        }
                    } catch (Exception e19) {
                        e = e19;
                        i16 = i13;
                    }
                    i18 = i11;
                    i19 = i16;
                    i20 = i12;
                    str3 = str2;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: li.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        v3 v3Var2 = v3.this;
                        v3Var2.getClass();
                        boolean z14 = z13;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i14, 0L, str3, z14 ? i15 : 0, z14, i18, i20, 0L);
                        photoEntry.setOrientation(i19, i17);
                        a aVar2 = aVar;
                        if (aVar2 == null || !v3.J3(aVar2.b)) {
                            v3Var2.l2(photoEntry);
                        } else {
                            v3Var2.Z1(aVar2, photoEntry);
                        }
                    }
                });
                return;
            case 1:
                ((ContactsController) this.d).lambda$processLoadedContacts$36(this.b, (ArrayList) this.e, (ArrayList) this.f, (a0.h) this.h, this.c);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$performSendMessageRequestMulti$68((TLObject) this.e, this.b, (SendMessagesHelper.DelayedMessage) this.f, (ArrayList) this.h, this.c);
                return;
            case 3:
                dx0 dx0Var = (dx0) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.h;
                RLottieNative[] rLottieNativeArr = dx0Var.f1;
                RLottieNative[] rLottieNativeArr2 = dx0Var.i1;
                int[] iArr = dx0Var.e;
                if (dx0Var.W0) {
                    AndroidUtilities.runOnUIThread(new bx0(dx0Var, 0));
                    return;
                }
                boolean z14 = false;
                int i30 = 0;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i31 = this.b;
                    if (i30 >= length) {
                        if (z14) {
                            AndroidUtilities.runOnUIThread(new bx0(dx0Var, 1));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j0(dx0Var, this.c, i31, s1Var));
                            return;
                        }
                    }
                    if (i30 <= 2) {
                        if (rLottieNativeArr2[i30] == null) {
                            if (i30 == 0) {
                                int i32 = dx0Var.b1;
                                i21 = i32 == 1 ? 5 : i32 == 2 ? 6 : i32 == 3 ? 7 : i32 == 4 ? 4 : 3;
                            } else if (i30 == 1) {
                                int i33 = dx0Var.c1;
                                i21 = i33 == 1 ? 11 : i33 == 2 ? 12 : i33 == 3 ? 13 : i33 == 4 ? 10 : 9;
                            } else {
                                int i34 = dx0Var.d1;
                                i21 = i34 == 1 ? 17 : i34 == 2 ? 18 : i34 == 3 ? 19 : i34 == 4 ? 16 : 15;
                            }
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i21);
                            readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                RLottieNative b10 = RLottieNative.b(readRes, iArr, null, null);
                                if (i30 <= 2) {
                                    rLottieNativeArr2[i30] = b10;
                                    dx0Var.j1[i30] = iArr[0];
                                } else {
                                    rLottieNativeArr[i30 == 3 ? (char) 0 : (char) 4] = b10;
                                    dx0Var.g1[i30 == 3 ? (char) 0 : (char) 4] = iArr[0];
                                }
                            } else {
                                AndroidUtilities.runOnUIThread(new cx0(document, i31, messageObject, s1Var, tL_messages_stickerSet, 0));
                                z14 = true;
                            }
                        }
                    } else if (rLottieNativeArr[i30] == null) {
                        i21 = i30 == 3 ? 1 : 2;
                        TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i21);
                        readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true), 0);
                        if (TextUtils.isEmpty(readRes)) {
                        }
                    }
                    i30++;
                }
            case 4:
                Activity activity = (Activity) this.d;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) this.e;
                TLRPC.GroupCall groupCall = (TLRPC.GroupCall) this.f;
                HashSet hashSet = (HashSet) this.h;
                org.telegram.ui.Components.voip.g2.a = 0L;
                org.telegram.ui.Components.voip.g2.g(activity, this.b, inputGroupCall, this.c, groupCall, hashSet);
                return;
            case 5:
                xj0 xj0Var = (xj0) this.d;
                vj0 vj0Var = (vj0) this.e;
                String str5 = (String) this.f;
                TLObject tLObject = (TLObject) this.h;
                if (xj0Var.h) {
                    return;
                }
                int i35 = 0;
                vj0Var.h = false;
                ArrayList arrayList = vj0Var.a;
                boolean z15 = vj0Var.l;
                int i36 = this.b;
                if (z15) {
                    vj0Var.l = false;
                    xj0Var.l0(i36, true);
                    return;
                }
                if (i36 == 2 && !str5.equals(xj0Var.N)) {
                    if (TextUtils.isEmpty(xj0Var.N) || xj0Var.O != null) {
                        xj0.o0(vj0Var);
                        return;
                    } else {
                        xj0Var.l0(i36, true);
                        return;
                    }
                }
                boolean z16 = this.c;
                boolean z17 = z16 || !vj0Var.i;
                vj0Var.i = true;
                vj0Var.m = false;
                if (z16 && ((tLObject instanceof TL_feed.ForYouFeed) || (tLObject instanceof TL_feed.TL_feedMessages))) {
                    arrayList.clear();
                    vj0Var.b.clear();
                    vj0Var.c.clear();
                    vj0Var.f = null;
                    vj0Var.g = Utilities.random.nextInt(3);
                    vj0Var.o = null;
                    vj0Var.j = false;
                }
                int i37 = -1;
                if (tLObject instanceof TL_feed.ForYouFeed) {
                    TL_feed.ForYouFeed forYouFeed = (TL_feed.ForYouFeed) tLObject;
                    ArrayList<TLRPC.User> arrayList2 = forYouFeed.users;
                    ArrayList<TLRPC.Chat> arrayList3 = forYouFeed.chats;
                    xj0Var.getMessagesController().putUsers(arrayList2, false);
                    xj0Var.getMessagesController().putChats(arrayList3, false);
                    xj0Var.getMessagesStorage().putUsersAndChats(arrayList2, arrayList3, true, true);
                    i22 = forYouFeed.items.size();
                    ArrayList<TL_feed.FeedItem> arrayList4 = forYouFeed.items;
                    int size = arrayList4.size();
                    int i38 = 0;
                    i23 = 0;
                    while (i38 < size) {
                        TL_feed.FeedItem feedItem = arrayList4.get(i38);
                        i38++;
                        TL_feed.FeedItem feedItem2 = feedItem;
                        if (feedItem2 instanceof TL_feed.TL_feedItemMessage) {
                            if (xj0Var.c0(vj0Var, ((TL_feed.TL_feedItemMessage) feedItem2).message, i37)) {
                                i23++;
                            }
                            z11 = z16;
                        } else if (feedItem2 instanceof TL_feed.TL_feedItemMessageGroup) {
                            ArrayList<TLRPC.Message> arrayList5 = ((TL_feed.TL_feedItemMessageGroup) feedItem2).messages;
                            if (arrayList5 == null || arrayList5.isEmpty()) {
                                z11 = z16;
                                i27 = -1;
                                message = null;
                            } else {
                                int size2 = arrayList5.size();
                                int i39 = i35;
                                while (true) {
                                    if (i39 < size2) {
                                        TLRPC.Message message2 = arrayList5.get(i39);
                                        i39++;
                                        message = message2;
                                        z11 = z16;
                                        if (message == null || TextUtils.isEmpty(message.message)) {
                                            z16 = z11;
                                            i35 = 0;
                                        }
                                    } else {
                                        z11 = z16;
                                        message = arrayList5.get(i35);
                                    }
                                }
                                i27 = -1;
                            }
                            if (xj0Var.c0(vj0Var, message, i27)) {
                                i23++;
                            }
                            if (arrayList5 != null) {
                                int size3 = arrayList5.size();
                                int i40 = 0;
                                while (i40 < size3) {
                                    TLRPC.Message message3 = arrayList5.get(i40);
                                    i40++;
                                    TLRPC.Message message4 = message3;
                                    int i41 = size3;
                                    if (message4 != message) {
                                        xj0Var.c0(vj0Var, message4, -1);
                                    }
                                    size3 = i41;
                                }
                            }
                        } else {
                            z11 = z16;
                            if ((feedItem2 instanceof TL_feed.TL_feedItemInterestCategories) && i36 == 0 && !xj0Var.s) {
                                int size4 = arrayList.size();
                                int i42 = 0;
                                while (true) {
                                    if (i42 < size4) {
                                        Object obj = arrayList.get(i42);
                                        i42++;
                                        if (obj instanceof TL_feed.TL_feedItemInterestCategories) {
                                            break;
                                        }
                                    } else {
                                        arrayList.add(feedItem2);
                                    }
                                }
                            }
                        }
                        z16 = z11;
                        i35 = 0;
                        i37 = -1;
                    }
                    z10 = z16;
                } else {
                    z10 = z16;
                    if (tLObject instanceof TL_feed.TL_feedMessages) {
                        TL_feed.TL_feedMessages tL_feedMessages = (TL_feed.TL_feedMessages) tLObject;
                        ArrayList<TLRPC.User> arrayList6 = tL_feedMessages.users;
                        ArrayList<TLRPC.Chat> arrayList7 = tL_feedMessages.chats;
                        xj0Var.getMessagesController().putUsers(arrayList6, false);
                        xj0Var.getMessagesController().putChats(arrayList7, false);
                        xj0Var.getMessagesStorage().putUsersAndChats(arrayList6, arrayList7, true, true);
                        TL_feed.FeedPosition feedPosition2 = tL_feedMessages.read_max_position;
                        if (feedPosition2 != null && ((feedPosition = vj0Var.p) == null || (i24 = feedPosition2.date) > (i25 = feedPosition.date) || (i24 == i25 && feedPosition2.id > feedPosition.id))) {
                            vj0Var.p = feedPosition2;
                        }
                        i22 = tL_feedMessages.messages.size();
                        ArrayList<TLRPC.Message> arrayList8 = tL_feedMessages.messages;
                        int size5 = arrayList8.size();
                        int i43 = 0;
                        i23 = 0;
                        while (i43 < size5) {
                            TLRPC.Message message5 = arrayList8.get(i43);
                            i43++;
                            if (xj0Var.c0(vj0Var, message5, -1)) {
                                i23++;
                            }
                        }
                        TL_feed.FeedPosition feedPosition3 = tL_feedMessages.min_position;
                        if (feedPosition3 != null) {
                            vj0Var.o = feedPosition3;
                        } else if (!tL_feedMessages.messages.isEmpty()) {
                            TLRPC.Message message6 = (TLRPC.Message) ic.a.g(1, tL_feedMessages.messages);
                            TL_feed.FeedPosition feedPosition4 = new TL_feed.FeedPosition();
                            vj0Var.o = feedPosition4;
                            feedPosition4.date = message6.date;
                            feedPosition4.peer = message6.peer_id;
                            feedPosition4.id = message6.id;
                        }
                    } else {
                        if (!(tLObject instanceof TL_feed.TL_feedMessagesNotModified)) {
                            vj0Var.k = true;
                        }
                        i22 = 0;
                        i23 = 0;
                    }
                }
                boolean z18 = vj0Var.k;
                if (!z18) {
                    if (i36 != 0) {
                        break;
                    }
                    boolean z19 = false;
                    vj0Var.j = z19;
                }
                boolean z20 = ((z18 || vj0Var.d == null) ? false : true) & z17;
                if (z20) {
                    i26 = 0;
                    vj0Var.d.g3.O(false);
                } else {
                    i26 = 0;
                    xj0.o0(vj0Var);
                }
                if (z10 && !vj0Var.k && (r71Var2 = vj0Var.d) != null) {
                    r71Var2.v0(i26);
                }
                if (z20) {
                    xj0.e0(vj0Var.d);
                }
                if (z10 && (wzVar = vj0Var.e) != null) {
                    wzVar.setRefreshing(false);
                }
                if (i36 != 1 || (r71Var = vj0Var.d) == null) {
                    return;
                }
                r71Var.post(new rj0(xj0Var, vj0Var, 0));
                return;
            case 6:
                rq0 rq0Var = (rq0) this.d;
                String str6 = (String) this.f;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                HashMap hashMap = rq0Var.h;
                ArrayList arrayList9 = rq0Var.f;
                ArrayList arrayList10 = rq0Var.n;
                int size6 = arrayList10.size();
                int i44 = 0;
                int i45 = 0;
                while (true) {
                    if (i45 < size6) {
                        if (((String) arrayList10.get(i45)).equalsIgnoreCase(str6)) {
                            arrayList10.remove(i45);
                        } else {
                            i45++;
                        }
                    }
                }
                arrayList10.add(0, str6);
                while (arrayList10.size() > 20) {
                    a1.g.A(1, arrayList10);
                }
                rq0Var.d0();
                if (this.b != rq0Var.y) {
                    return;
                }
                int size7 = arrayList9.size();
                if (tLObject2 != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                    rq0Var.w = messages_botresults.next_offset;
                    int size8 = messages_botresults.results.size();
                    int i46 = 0;
                    i28 = 0;
                    while (i46 < size8) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i46);
                        boolean z21 = this.c;
                        if ((z21 || "photo".equals(botInlineResult.type)) && ((!z21 || "gif".equals(botInlineResult.type)) && !hashMap.containsKey(botInlineResult.id))) {
                            MediaController.SearchImage searchImage = new MediaController.SearchImage();
                            if (z21 && botInlineResult.document != null) {
                                for (int i47 = i44; i47 < botInlineResult.document.attributes.size(); i47++) {
                                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i47);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        searchImage.width = documentAttribute.w;
                                        searchImage.height = documentAttribute.h;
                                        searchImage.document = botInlineResult.document;
                                        searchImage.size = 0;
                                        photo2 = botInlineResult.photo;
                                        if (photo2 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, rq0Var.R, true)) != null) {
                                            botInlineResult.document.thumbs.add(closestPhotoSizeWithSize);
                                            botInlineResult.document.flags |= 1;
                                        }
                                    }
                                }
                                searchImage.document = botInlineResult.document;
                                searchImage.size = 0;
                                photo2 = botInlineResult.photo;
                                if (photo2 != null) {
                                    botInlineResult.document.thumbs.add(closestPhotoSizeWithSize);
                                    botInlineResult.document.flags |= 1;
                                }
                            } else if (!z21 && (photo = botInlineResult.photo) != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                if (closestPhotoSizeWithSize2 != null) {
                                    searchImage.width = closestPhotoSizeWithSize2.w;
                                    searchImage.height = closestPhotoSizeWithSize2.h;
                                    searchImage.photoSize = closestPhotoSizeWithSize2;
                                    searchImage.photo = botInlineResult.photo;
                                    searchImage.size = closestPhotoSizeWithSize2.size;
                                    searchImage.thumbPhotoSize = closestPhotoSizeWithSize3;
                                }
                            } else if (botInlineResult.content != null) {
                                int i48 = 0;
                                while (true) {
                                    if (i48 < botInlineResult.content.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i48);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute2.w;
                                            searchImage.height = documentAttribute2.h;
                                        } else {
                                            i48++;
                                        }
                                    }
                                }
                                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                if (webDocument != null) {
                                    searchImage.thumbUrl = webDocument.url;
                                } else {
                                    searchImage.thumbUrl = null;
                                }
                                TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                searchImage.imageUrl = webDocument2.url;
                                searchImage.size = z21 ? 0 : webDocument2.size;
                            }
                            searchImage.id = botInlineResult.id;
                            searchImage.type = z21 ? 1 : 0;
                            searchImage.inlineResult = botInlineResult;
                            HashMap<String, String> hashMap2 = new HashMap<>();
                            searchImage.params = hashMap2;
                            hashMap2.put("id", botInlineResult.id);
                            searchImage.params.put("query_id", "" + messages_botresults.query_id);
                            searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                            arrayList9.add(searchImage);
                            hashMap.put(searchImage.id, searchImage);
                            i28++;
                        }
                        i46++;
                        i44 = 0;
                    }
                    rq0Var.s = size7 == arrayList9.size() || rq0Var.w == null;
                } else {
                    i28 = 0;
                }
                rq0Var.r = false;
                if (i28 != 0) {
                    rq0Var.L.s(size7, i28);
                } else if (rq0Var.s) {
                    z12 = true;
                    rq0Var.L.u(arrayList9.size() - 1);
                    if (arrayList9.size() > 0) {
                        rq0Var.N.e(false, z12);
                        return;
                    }
                    return;
                }
                z12 = true;
                if (arrayList9.size() > 0) {
                }
                break;
            default:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.d;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.e;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) this.f;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.h;
                boolean z22 = this.c;
                int i49 = this.b;
                WalletEngine2.ImportedWalletProof importedWalletProof = null;
                try {
                    try {
                        WalletEngine2.ImportedWalletProof createImportProof = z22 ? WalletEngine2.createImportProof(i0Var, proofchallenge.domain, proofchallenge.payload, i49) : WalletEngine2.createOwnershipProof(i0Var, proofchallenge.domain, proofchallenge.payload, i49);
                        i0Var.close();
                        importedWalletProof = createImportProof;
                        e = null;
                    } catch (Exception e20) {
                        e = e20;
                        org.telegram.ui.Wallet.l0.j("createImportProof", e);
                        i0Var.close();
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(l0Var, importedWalletProof, e, callback2));
                    return;
                } catch (Throwable th7) {
                    i0Var.close();
                    throw th7;
                }
        }
    }

    public /* synthetic */ p2(Object obj, TLObject tLObject, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.b = i10;
        this.f = obj2;
        this.h = obj3;
        this.c = z10;
    }

    public /* synthetic */ p2(v3 v3Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.a = 0;
        this.d = v3Var;
        this.e = uri;
        this.c = z10;
        this.f = str;
        this.b = i10;
        this.h = aVar;
    }

    public /* synthetic */ p2(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.a = 1;
        this.d = contactsController;
        this.b = i10;
        this.e = arrayList;
        this.f = arrayList2;
        this.h = hVar;
        this.c = z10;
    }

    public /* synthetic */ p2(xj0 xj0Var, vj0 vj0Var, int i10, String str, boolean z10, TLObject tLObject) {
        this.a = 5;
        this.d = xj0Var;
        this.e = vj0Var;
        this.b = i10;
        this.f = str;
        this.c = z10;
        this.h = tLObject;
    }

    public /* synthetic */ p2(rq0 rq0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.a = 6;
        this.d = rq0Var;
        this.f = str;
        this.b = i10;
        this.e = tLObject;
        this.c = z10;
        this.h = user;
    }

    public /* synthetic */ p2(org.telegram.ui.Wallet.l0 l0Var, boolean z10, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.proofChallenge proofchallenge, int i10, Utilities.Callback2 callback2) {
        this.a = 7;
        this.d = l0Var;
        this.c = z10;
        this.e = i0Var;
        this.f = proofchallenge;
        this.b = i10;
        this.h = callback2;
    }
}
