package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.messenger.wallpaper.WallpaperGiftPatternPosition;
import org.telegram.messenger.wallpaper.pgm.PGMImage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.ChatBackgroundDrawable;

/* loaded from: classes3.dex */
public class ChatThemeController extends BaseController {
    public static final int THEME_LIST_WITH_DEFAULT = 1;
    public static final int THEME_LIST_WITH_EMOJI = 2;
    public static final int THEME_LIST_WITH_GIFTS = 4;
    public static volatile DispatchQueue chatThemeQueue = new DispatchQueue("chatThemeQueue");
    private static final ChatThemeController[] instances = new ChatThemeController[4];
    private final Map<String, EmojiThemes> allChatGiftThemes;
    private List<EmojiThemes> allChatThemes;
    private final LongSparseArray<ThemeKey> dialogEmoticonsMap;
    private final ThemeList giftsThemeList;
    private volatile long lastReloadTimeMs;
    private final long reloadTimeoutMs;
    private final HashMap<Long, Bitmap> themeIdWallpaperThumbMap;
    private volatile long themesHash;
    private final Map<String, Long> usedGiftThemesBySlug;
    private final Map<Long, String> usedGiftThemesByUsers;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearWallpaper$15(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void clearWallpaperImages() {
    }

    private static class ThemeList {
        private boolean completed;
        private long hash;
        private long lastReloadTimeMs;
        private String offset;
        private List<EmojiThemes> themes;

        private ThemeList() {
        }
    }

    private ChatThemeController(int i) {
        super(i);
        this.reloadTimeoutMs = 7200000L;
        this.themeIdWallpaperThumbMap = new HashMap<>();
        this.allChatGiftThemes = new HashMap();
        this.giftsThemeList = new ThemeList();
        this.dialogEmoticonsMap = new LongSparseArray<>();
        this.usedGiftThemesByUsers = new HashMap();
        this.usedGiftThemesBySlug = new HashMap();
        init();
    }

    private void init() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.themesHash = 0L;
        this.lastReloadTimeMs = 0L;
        try {
            this.themesHash = sharedPreferences.getLong("hash", 0L);
            this.lastReloadTimeMs = sharedPreferences.getLong("lastReload", 0L);
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.allChatThemes = getAllChatThemesFromPrefs();
        getMessagesStorage().loadGiftChatTheme(new Utilities.Callback() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda15
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ChatThemeController.this.lambda$init$0((List) obj);
            }
        });
        preloadSticker("❌");
        if (this.allChatThemes.isEmpty()) {
            return;
        }
        Iterator<EmojiThemes> it = this.allChatThemes.iterator();
        while (it.hasNext()) {
            preloadSticker(it.next().getEmoticon());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) it.next();
                this.allChatGiftThemes.put(tL_chatThemeUniqueGift.gift.slug, new EmojiThemes(this.currentAccount, tL_chatThemeUniqueGift));
            }
        }
    }

    public void putThemeIfNeeded(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            if (this.allChatGiftThemes.containsKey(tL_chatThemeUniqueGift.gift.slug)) {
                return;
            }
            EmojiThemes emojiThemes = new EmojiThemes(this.currentAccount, tL_chatThemeUniqueGift);
            emojiThemes.initColors();
            this.allChatGiftThemes.put(tL_chatThemeUniqueGift.gift.slug, emojiThemes);
            getMessagesStorage().putGiftChatTheme(chatTheme);
        }
    }

    private void preloadSticker(String str) {
        new ImageReceiver().setImage(ImageLocation.getForDocument(MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker(str)), "50_50", null, null, null, 0);
        Emoji.preloadEmoji(str);
    }

    public void requestAllChatThemes(final ResultCallback<List<EmojiThemes>> resultCallback, final boolean z) {
        if (this.themesHash == 0 || this.lastReloadTimeMs == 0) {
            init();
        }
        boolean z2 = System.currentTimeMillis() - this.lastReloadTimeMs > 7200000;
        List<EmojiThemes> list = this.allChatThemes;
        if (list == null || list.isEmpty() || z2) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.themesHash;
            ConnectionsManager connectionsManager = getConnectionsManager();
            DispatchQueue dispatchQueue = chatThemeQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(getchatthemes, new ChatThemeController$$ExternalSyntheticLambda10(dispatchQueue), new Utilities.Callback2() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda21
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    ChatThemeController.this.lambda$requestAllChatThemes$3(resultCallback, z, (TL_account.Themes) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
        List<EmojiThemes> list2 = this.allChatThemes;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        resultCallback.onComplete(getEmojiThemes((z ? 1 : 0) | 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestAllChatThemes$3(final ResultCallback resultCallback, final boolean z, TL_account.Themes themes, final TLRPC.TL_error tL_error) {
        final List<EmojiThemes> list;
        boolean z2 = false;
        if (themes instanceof TL_account.TL_themes) {
            TL_account.TL_themes tL_themes = (TL_account.TL_themes) themes;
            this.themesHash = tL_themes.hash;
            this.lastReloadTimeMs = System.currentTimeMillis();
            SharedPreferences.Editor edit = getSharedPreferences().edit();
            edit.clear();
            edit.putLong("hash", this.themesHash);
            edit.putLong("lastReload", this.lastReloadTimeMs);
            edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, tL_themes.themes.size());
            list = new ArrayList<>(tL_themes.themes.size());
            for (int i = 0; i < tL_themes.themes.size(); i++) {
                TLRPC.TL_theme tL_theme = tL_themes.themes.get(i);
                Emoji.preloadEmoji(tL_theme.emoticon);
                SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                tL_theme.serializeToStream(serializedData);
                edit.putString("theme_" + i, Utilities.bytesToHex(serializedData.toByteArray()));
                EmojiThemes emojiThemes = new EmojiThemes(this.currentAccount, tL_theme, false);
                emojiThemes.preloadWallpaper();
                list.add(emojiThemes);
            }
            edit.apply();
        } else if (themes instanceof TL_account.TL_themesNotModified) {
            list = getAllChatThemesFromPrefs();
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ResultCallback.this.onError(tL_error);
                }
            });
            z2 = true;
            list = null;
        }
        if (z2) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ChatThemeController.this.lambda$requestAllChatThemes$2(list, resultCallback, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestAllChatThemes$2(List list, ResultCallback resultCallback, boolean z) {
        this.allChatThemes = new ArrayList(list);
        resultCallback.onComplete(getEmojiThemes((z ? 1 : 0) | 2));
    }

    public void loadNextChatThemes(ResultCallback<Void> resultCallback) {
        requestNextChatThemes(resultCallback);
    }

    private SharedPreferences getSharedPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("chatthemeconfig_" + this.currentAccount, 0);
    }

    private SharedPreferences getEmojiSharedPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("chatthemeconfig_emoji", 0);
    }

    private List<EmojiThemes> getAllChatThemesFromPrefs() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        int i = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i2, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new EmojiThemes(this.currentAccount, TLdeserialize, false));
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        return arrayList;
    }

    public void requestChatTheme(final ThemeKey themeKey, final ResultCallback<EmojiThemes> resultCallback) {
        if (themeKey == null || themeKey.isEmpty()) {
            resultCallback.onComplete(null);
            return;
        }
        if (!TextUtils.isEmpty(themeKey.giftSlug)) {
            EmojiThemes emojiThemes = this.allChatGiftThemes.get(themeKey.giftSlug);
            if (emojiThemes != null) {
                emojiThemes.initColors();
                resultCallback.onComplete(emojiThemes);
                return;
            } else {
                resultCallback.onComplete(null);
                return;
            }
        }
        requestAllChatThemes(new ResultCallback<List<EmojiThemes>>() { // from class: org.telegram.messenger.ChatThemeController.1
            @Override // org.telegram.tgnet.ResultCallback
            public /* synthetic */ void onError(Throwable th) {
                ResultCallback.-CC.$default$onError(this, th);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public void onComplete(List<EmojiThemes> list) {
                for (EmojiThemes emojiThemes2 : list) {
                    if (themeKey.equals(emojiThemes2.getThemeKey())) {
                        emojiThemes2.initColors();
                        resultCallback.onComplete(emojiThemes2);
                        return;
                    }
                }
                resultCallback.onComplete(null);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public void onError(TLRPC.TL_error tL_error) {
                resultCallback.onComplete(null);
            }
        }, false);
    }

    public static ChatThemeController getInstance(int i) {
        ChatThemeController[] chatThemeControllerArr = instances;
        ChatThemeController chatThemeController = chatThemeControllerArr[i];
        if (chatThemeController == null) {
            synchronized (ChatThemeController.class) {
                try {
                    chatThemeController = chatThemeControllerArr[i];
                    if (chatThemeController == null) {
                        chatThemeController = new ChatThemeController(i);
                        chatThemeControllerArr[i] = chatThemeController;
                    }
                } finally {
                }
            }
        }
        return chatThemeController;
    }

    public static boolean equals(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if (wallPaper == null || wallPaper2 == null) {
            return false;
        }
        String str = wallPaper.uploadingImage;
        if (str != null) {
            return TextUtils.equals(wallPaper2.uploadingImage, str);
        }
        return wallPaper.id == wallPaper2.id && TextUtils.equals(ChatBackgroundDrawable.hash(wallPaper.settings), ChatBackgroundDrawable.hash(wallPaper2.settings)) && TextUtils.equals(getWallpaperEmoticon(wallPaper), getWallpaperEmoticon(wallPaper2));
    }

    public void setDialogTheme(long j, TLRPC.ChatTheme chatTheme, boolean z) {
        setDialogTheme(j, ThemeKey.of(chatTheme), chatTheme, z);
    }

    public void setDialogTheme(long j, ThemeKey themeKey) {
        setDialogTheme(j, themeKey, null, true);
    }

    private void setDialogTheme(long j, ThemeKey themeKey, TLRPC.ChatTheme chatTheme, boolean z) {
        if (ThemeKey.equals(this.dialogEmoticonsMap.get(j), themeKey)) {
            return;
        }
        if (themeKey == null) {
            this.dialogEmoticonsMap.delete(j);
        } else {
            this.dialogEmoticonsMap.put(j, themeKey);
        }
        setGiftThemeUser(themeKey != null ? themeKey.giftSlug : null, j);
        if (j >= 0) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
            if (userFull != null && (themeKey == null || themeKey.isEmpty() || chatTheme != null)) {
                userFull.theme = chatTheme;
                getMessagesStorage().updateUserInfo(userFull, true);
            }
        } else {
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
            if (chatFull != null) {
                chatFull.theme_emoticon = themeKey != null ? themeKey.emoticon : null;
                getMessagesStorage().updateChatInfo(chatFull, true);
            }
        }
        getEmojiSharedPreferences().edit().putString("chatTheme_" + this.currentAccount + "_" + j, themeKey != null ? themeKey.toSavedString() : null).apply();
        if (z) {
            TLRPC.TL_messages_setChatTheme tL_messages_setChatTheme = new TLRPC.TL_messages_setChatTheme();
            tL_messages_setChatTheme.theme = ThemeKey.toInputTheme(themeKey);
            tL_messages_setChatTheme.peer = getMessagesController().getInputPeer(j);
            getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new Utilities.Callback2() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda14
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    ChatThemeController.this.lambda$setDialogTheme$4((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDialogTheme$4(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().processUpdates(updates, false);
        }
    }

    public EmojiThemes getDialogTheme(long j) {
        ThemeKey themeKey = this.dialogEmoticonsMap.get(j);
        if (themeKey == null) {
            themeKey = ThemeKey.fromSavedString(getEmojiSharedPreferences().getString("chatTheme_" + this.currentAccount + "_" + j, null));
            this.dialogEmoticonsMap.put(j, themeKey);
        }
        return getTheme(themeKey);
    }

    public EmojiThemes getTheme(ThemeKey themeKey) {
        if (themeKey == null) {
            return null;
        }
        if (!TextUtils.isEmpty(themeKey.giftSlug)) {
            return this.allChatGiftThemes.get(themeKey.giftSlug);
        }
        for (EmojiThemes emojiThemes : this.allChatThemes) {
            if (themeKey.equals(emojiThemes.getThemeKey())) {
                return emojiThemes;
            }
        }
        return null;
    }

    public void saveChatWallpaper(long j, TLRPC.WallPaper wallPaper) {
        if (wallPaper != null) {
            if (wallPaper.document == null) {
                return;
            }
            SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
            wallPaper.serializeToStream(serializedData);
            String bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
            getEmojiSharedPreferences().edit().putString("chatWallpaper_" + this.currentAccount + "_" + j, bytesToHex).apply();
            return;
        }
        getEmojiSharedPreferences().edit().remove("chatWallpaper_" + this.currentAccount + "_" + j).apply();
    }

    public TLRPC.WallPaper getDialogWallpaper(long j) {
        if (j >= 0) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
            if (userFull != null) {
                return userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
            if (chatFull != null) {
                return chatFull.wallpaper;
            }
        }
        String string = getEmojiSharedPreferences().getString("chatWallpaper_" + this.currentAccount + "_" + j, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        return null;
    }

    public void preloadAllWallpaperImages(boolean z) {
        for (EmojiThemes emojiThemes : this.allChatThemes) {
            long themeId = emojiThemes.getThemeId(z ? 1 : 0);
            if (themeId != 0 && !getPatternFile(themeId).exists()) {
                emojiThemes.loadWallpaper(z ? 1 : 0, null);
            }
        }
    }

    public void preloadAllWallpaperThumbs(boolean z) {
        for (EmojiThemes emojiThemes : this.allChatThemes) {
            long themeId = emojiThemes.getThemeId(z ? 1 : 0);
            if (themeId != 0 && !this.themeIdWallpaperThumbMap.containsKey(Long.valueOf(themeId))) {
                emojiThemes.loadWallpaperThumb(z ? 1 : 0, new ResultCallback() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda22
                    @Override // org.telegram.tgnet.ResultCallback
                    public final void onComplete(Object obj) {
                        ChatThemeController.this.lambda$preloadAllWallpaperThumbs$5((Pair) obj);
                    }

                    @Override // org.telegram.tgnet.ResultCallback
                    public /* synthetic */ void onError(Throwable th) {
                        ResultCallback.-CC.$default$onError(this, th);
                    }

                    @Override // org.telegram.tgnet.ResultCallback
                    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                        ResultCallback.-CC.$default$onError(this, tL_error);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preloadAllWallpaperThumbs$5(Pair pair) {
        if (pair != null) {
            this.themeIdWallpaperThumbMap.put((Long) pair.first, (Bitmap) pair.second);
        }
    }

    public void clearWallpaperThumbImages() {
        this.themeIdWallpaperThumbMap.clear();
    }

    private void getWallpaperBitmap(long j, final ResultCallback<Bitmap> resultCallback) {
        if (this.themesHash == 0) {
            resultCallback.onComplete(null);
        } else {
            final File patternFile = getPatternFile(j);
            chatThemeQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    ChatThemeController.lambda$getWallpaperBitmap$7(patternFile, resultCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$getWallpaperBitmap$7(File file, final ResultCallback resultCallback) {
        final Bitmap bitmap;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (file.exists()) {
            bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            if (resultCallback == null) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda13
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResultCallback.this.onComplete(bitmap);
                    }
                });
                return;
            }
            return;
        }
        bitmap = null;
        if (resultCallback == null) {
        }
    }

    private File getPatternFile(long j) {
        return new File(ApplicationLoader.getFilesDirFixed(), String.format(Locale.US, "%d_%d.jpg", Long.valueOf(j), Long.valueOf(this.themesHash)));
    }

    private void saveWallpaperBitmap(final Bitmap bitmap, long j) {
        final File patternFile = getPatternFile(j);
        chatThemeQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                ChatThemeController.lambda$saveWallpaperBitmap$8(patternFile, bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveWallpaperBitmap$8(File file, Bitmap bitmap) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void saveWallpaperBitmap(WallpaperBitmapHolder wallpaperBitmapHolder, long j) {
        Bitmap bitmap = wallpaperBitmapHolder.bitmap;
        int i = wallpaperBitmapHolder.mode;
        if (i == 0) {
            saveWallpaperBitmap(bitmap, j);
        } else if (i == 1) {
            saveWallpaperPatternBitmap(bitmap, wallpaperBitmapHolder.giftPatternPositions, j);
        }
    }

    public void loadWallpaperBitmap(long j, int i, final Utilities.Callback<WallpaperBitmapHolder> callback) {
        if (i == 0) {
            getWallpaperBitmap(j, new ResultCallback() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda17
                @Override // org.telegram.tgnet.ResultCallback
                public final void onComplete(Object obj) {
                    ChatThemeController.lambda$loadWallpaperBitmap$9(Utilities.Callback.this, (Bitmap) obj);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public /* synthetic */ void onError(Throwable th) {
                    ResultCallback.-CC.$default$onError(this, th);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                    ResultCallback.-CC.$default$onError(this, tL_error);
                }
            });
        } else if (i == 1) {
            loadWallpaperPatternBitmap(j, callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadWallpaperBitmap$9(Utilities.Callback callback, Bitmap bitmap) {
        if (bitmap != null) {
            callback.run(new WallpaperBitmapHolder(bitmap, 0));
        } else {
            callback.run(null);
        }
    }

    private void loadWallpaperPatternBitmap(long j, final Utilities.Callback<WallpaperBitmapHolder> callback) {
        final File file = new File(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper"), String.format(Locale.US, "pattern_%d.pgm.gz", Long.valueOf(j)));
        chatThemeQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                ChatThemeController.lambda$loadWallpaperPatternBitmap$11(file, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$loadWallpaperPatternBitmap$11(File file, final Utilities.Callback callback) {
        ArrayList arrayList;
        Bitmap bitmap;
        ArrayList arrayList2;
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
                    try {
                        ArrayList arrayList3 = new ArrayList(1);
                        bitmap = PGMImage.read(gZIPInputStream, arrayList3);
                        try {
                            Iterator it = arrayList3.iterator();
                            arrayList = null;
                            while (it.hasNext()) {
                                try {
                                    String str = (String) it.next();
                                    if (str.startsWith("patterns = ")) {
                                        byte[] hexToBytes = Utilities.hexToBytes(str.substring(11));
                                        int length = hexToBytes.length / 52;
                                        SerializedData serializedData = new SerializedData(hexToBytes);
                                        arrayList2 = new ArrayList(length);
                                        for (int i = 0; i < length; i++) {
                                            try {
                                                arrayList2.add(WallpaperGiftPatternPosition.deserialize(serializedData));
                                            } catch (Throwable th) {
                                                th = th;
                                                try {
                                                    try {
                                                        gZIPInputStream.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    arrayList = arrayList2;
                                                    try {
                                                        fileInputStream.close();
                                                    } catch (Throwable th4) {
                                                        th.addSuppressed(th4);
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                        serializedData.cleanup();
                                        arrayList = arrayList2;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    arrayList2 = arrayList;
                                    gZIPInputStream.close();
                                    throw th;
                                }
                            }
                            try {
                                gZIPInputStream.close();
                                fileInputStream.close();
                            } catch (Throwable th6) {
                                th = th6;
                                fileInputStream.close();
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            arrayList = null;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        bitmap = null;
                        arrayList = null;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    bitmap = null;
                    arrayList = null;
                }
            } catch (Exception e) {
                e = e;
                bitmap = null;
                arrayList = null;
                FileLog.e(e);
                if (bitmap != null) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda19
                    @Override // java.lang.Runnable
                    public final void run() {
                        Utilities.Callback.this.run(r2);
                    }
                });
            }
        } catch (Exception e2) {
            e = e2;
            FileLog.e(e);
            if (bitmap != null) {
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    Utilities.Callback.this.run(r2);
                }
            });
        }
        final WallpaperBitmapHolder wallpaperBitmapHolder = bitmap != null ? new WallpaperBitmapHolder(bitmap, 1, arrayList) : null;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                Utilities.Callback.this.run(wallpaperBitmapHolder);
            }
        });
    }

    private void saveWallpaperPatternBitmap(final Bitmap bitmap, final List<WallpaperGiftPatternPosition> list, long j) {
        final File file = new File(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper"), String.format(Locale.US, "pattern_%d.pgm.gz", Long.valueOf(j)));
        chatThemeQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                ChatThemeController.lambda$saveWallpaperPatternBitmap$12(file, list, bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:16:0x000c, B:18:0x0012, B:19:0x0021, B:21:0x0027, B:23:0x0033, B:7:0x0056, B:9:0x005e, B:14:0x0062), top: B:15:0x000c, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005e A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:16:0x000c, B:18:0x0012, B:19:0x0021, B:21:0x0027, B:23:0x0033, B:7:0x0056, B:9:0x005e, B:14:0x0062), top: B:15:0x000c, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$saveWallpaperPatternBitmap$12(File file, List list, Bitmap bitmap) {
        List singletonList;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            SerializedData serializedData = new SerializedData(list.size() * 52);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((WallpaperGiftPatternPosition) it.next()).serialize(serializedData);
                            }
                            singletonList = Collections.singletonList("patterns = " + Utilities.bytesToHex(serializedData.toByteArray()));
                            serializedData.cleanup();
                            if (bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
                                PGMImage.write(bitmap, gZIPOutputStream, singletonList);
                            } else {
                                Bitmap extractAlpha = bitmap.extractAlpha();
                                PGMImage.write(extractAlpha, gZIPOutputStream, singletonList);
                                extractAlpha.recycle();
                            }
                            gZIPOutputStream.close();
                            fileOutputStream.close();
                        }
                    } finally {
                    }
                }
                singletonList = null;
                if (bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
                }
                gZIPOutputStream.close();
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public Bitmap getWallpaperThumbBitmap(long j) {
        return this.themeIdWallpaperThumbMap.get(Long.valueOf(j));
    }

    public void clearCache() {
        this.themesHash = 0L;
        this.lastReloadTimeMs = 0L;
        getSharedPreferences().edit().clear().apply();
    }

    public void processUpdate(TLRPC.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser) {
            final TLRPC.UserFull userFull = getMessagesController().getUserFull(tL_updatePeerWallpaper.peer.user_id);
            if (userFull == null || wallpaperEquals(userFull.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                return;
            }
            final long j = userFull.id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                userFull.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
                userFull.wallpaper = tL_updatePeerWallpaper.wallpaper;
                userFull.flags |= 16777216;
            } else {
                userFull.wallpaper_overridden = false;
                userFull.wallpaper = null;
                userFull.flags &= -16777217;
            }
            getMessagesStorage().updateUserInfo(userFull, false);
            saveChatWallpaper(j, userFull.wallpaper);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ChatThemeController.this.lambda$processUpdate$13(j, userFull);
                }
            });
            return;
        }
        final TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-DialogObject.getPeerDialogId(tL_updatePeerWallpaper.peer));
        if (chatFull == null || wallpaperEquals(chatFull.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            return;
        }
        long j2 = -chatFull.id;
        if ((tL_updatePeerWallpaper.flags & 1) != 0) {
            chatFull.wallpaper = tL_updatePeerWallpaper.wallpaper;
            chatFull.flags2 |= 128;
        } else {
            chatFull.wallpaper = null;
            chatFull.flags2 &= -129;
        }
        getMessagesStorage().updateChatInfo(chatFull, false);
        saveChatWallpaper(j2, chatFull.wallpaper);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ChatThemeController.this.lambda$processUpdate$14(chatFull);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processUpdate$13(long j, TLRPC.UserFull userFull) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processUpdate$14(TLRPC.ChatFull chatFull) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, chatFull, 0, bool, bool);
    }

    public static boolean wallpaperEquals(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            return wallPaper.id == wallPaper2.id;
        }
        if (!(wallPaper instanceof TLRPC.TL_wallPaperNoFile) || !(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            return false;
        }
        if (wallPaper.settings == null || wallPaper2.settings == null) {
            return wallPaper.id == wallPaper2.id;
        }
        return TextUtils.equals(getWallpaperEmoticon(wallPaper), getWallpaperEmoticon(wallPaper2));
    }

    public static String getWallpaperEmoticon(TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            return null;
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        if (wallPaperSettings != null && !TextUtils.isEmpty(wallPaperSettings.emoticon)) {
            return wallPaper.settings.emoticon;
        }
        return "";
    }

    public static boolean isNotEmoticonWallpaper(TLRPC.WallPaper wallPaper) {
        String wallpaperEmoticon = getWallpaperEmoticon(wallPaper);
        return wallpaperEmoticon != null && wallpaperEmoticon.length() == 0;
    }

    public void clearWallpaper(long j, boolean z) {
        clearWallpaper(j, z, false);
    }

    public void clearWallpaper(long j, boolean z, boolean z2) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j >= 0) {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
            tL_messages_setChatWallPaper.revert = z2;
            if (!z2) {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
                if (userFull != null) {
                    userFull.wallpaper = null;
                    userFull.flags &= -16777217;
                    getMessagesStorage().updateUserInfo(userFull, false);
                }
                saveChatWallpaper(j, null);
                if (z) {
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
                }
            }
        } else {
            long j2 = -j;
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2)));
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j2);
            if (chatFull != null) {
                chatFull.wallpaper = null;
                chatFull.flags2 &= -129;
                getMessagesStorage().updateChatInfo(chatFull, false);
            }
            saveChatWallpaper(j, null);
            if (z) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i = NotificationCenter.chatInfoDidLoad;
                Boolean bool = Boolean.FALSE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i, chatFull, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda4
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatThemeController.lambda$clearWallpaper$15(tLObject, tL_error);
            }
        });
    }

    public int setWallpaperToPeer(final long j, final String str, Theme.OverrideWallpaperInfo overrideWallpaperInfo, MessageObject messageObject, final Runnable runnable) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper;
        boolean z;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        String str2;
        ChatThemeController chatThemeController = this;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper2 = new TLRPC.TL_messages_setChatWallPaper();
        if (j >= 0) {
            tL_messages_setChatWallPaper2.peer = MessagesController.getInputPeer(MessagesController.getInstance(chatThemeController.currentAccount).getUser(Long.valueOf(j)));
        } else {
            tL_messages_setChatWallPaper2.peer = MessagesController.getInputPeer(MessagesController.getInstance(chatThemeController.currentAccount).getChat(Long.valueOf(-j)));
        }
        tL_messages_setChatWallPaper2.for_both = overrideWallpaperInfo.forBoth;
        if (messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper2.flags |= 2;
            tL_messages_setChatWallPaper2.id = messageObject.getId();
            TLRPC.WallPaper wallPaper = null;
            if (j >= 0) {
                userFull = MessagesController.getInstance(chatThemeController.currentAccount).getUserFull(j);
                chatFull = null;
            } else {
                chatFull = MessagesController.getInstance(chatThemeController.currentAccount).getChatFull(-j);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageObject.messageOwner.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.id = wallPaper2.id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (overrideWallpaperInfo.intensity * 100.0f);
            tL_wallPaperSettings.motion = overrideWallpaperInfo.isMotion;
            tL_wallPaperSettings.blur = overrideWallpaperInfo.isBlurred;
            tL_wallPaperSettings.background_color = overrideWallpaperInfo.color;
            tL_wallPaperSettings.second_background_color = overrideWallpaperInfo.gradientColor1;
            tL_wallPaperSettings.third_background_color = overrideWallpaperInfo.gradientColor2;
            tL_wallPaperSettings.fourth_background_color = overrideWallpaperInfo.gradientColor3;
            tL_wallPaperSettings.rotation = overrideWallpaperInfo.rotation;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper.stripedThumb;
            }
            tL_wallPaper.settings.flags |= 121;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            tL_wallPaper2.id = wallPaper3.id;
            tL_wallPaper2.document = wallPaper3.document;
            int i = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i | 4;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().updateUserInfo(userFull, false);
                chatThemeController = this;
                NotificationCenter.getInstance(chatThemeController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
            } else {
                chatThemeController = this;
                if (chatFull != null) {
                    chatFull.wallpaper = tL_wallPaper2;
                    chatFull.flags2 |= 128;
                    getMessagesStorage().updateChatInfo(chatFull, false);
                    NotificationCenter notificationCenter = NotificationCenter.getInstance(chatThemeController.currentAccount);
                    int i2 = NotificationCenter.chatInfoDidLoad;
                    Boolean bool = Boolean.FALSE;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, chatFull, 0, bool, bool);
                }
            }
            if (runnable != null) {
                runnable.run();
            }
            tL_messages_setChatWallPaper = tL_messages_setChatWallPaper2;
            z = false;
        } else {
            tL_messages_setChatWallPaper = tL_messages_setChatWallPaper2;
            z = true;
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = MessagesController.getInputWallpaper(overrideWallpaperInfo);
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = MessagesController.getWallpaperSetting(overrideWallpaperInfo);
        final boolean z2 = z;
        return ConnectionsManager.getInstance(chatThemeController.currentAccount).sendRequest(tL_messages_setChatWallPaper, new RequestDelegate() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda16
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatThemeController.this.lambda$setWallpaperToPeer$17(j, z2, str, runnable, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWallpaperToPeer$17(final long j, final boolean z, final String str, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                ChatThemeController.this.lambda$setWallpaperToPeer$16(tLObject, j, z, str, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWallpaperToPeer$16(TLObject tLObject, long j, boolean z, String str, Runnable runnable) {
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        String str2;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            TLRPC.WallPaper wallPaper = null;
            if (j >= 0) {
                userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j);
                chatFull = null;
            } else {
                chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j);
                userFull = null;
            }
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
            int i = 0;
            while (true) {
                if (i >= updates.updates.size()) {
                    break;
                }
                if (updates.updates.get(i) instanceof TLRPC.TL_updateNewMessage) {
                    TLRPC.MessageAction messageAction = ((TLRPC.TL_updateNewMessage) updates.updates.get(i)).message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                        if (z) {
                            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                            tL_messageActionSetChatWallPaper.wallpaper.uploadingImage = str;
                            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                                tL_messageActionSetChatWallPaper.wallpaper.stripedThumb = wallPaper.stripedThumb;
                            }
                            if (userFull != null) {
                                TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
                                userFull.wallpaper = wallPaper2;
                                userFull.flags |= 16777216;
                                saveChatWallpaper(j, wallPaper2);
                                getMessagesStorage().updateUserInfo(userFull, false);
                                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
                            } else if (chatFull != null) {
                                TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                chatFull.wallpaper = wallPaper3;
                                chatFull.flags2 |= 128;
                                saveChatWallpaper(j, wallPaper3);
                                getMessagesStorage().updateChatInfo(chatFull, false);
                                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                                int i2 = NotificationCenter.chatInfoDidLoad;
                                Boolean bool = Boolean.FALSE;
                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, chatFull, 0, bool, bool);
                            }
                        }
                    }
                }
                i++;
            }
            MessagesController.getInstance(this.currentAccount).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
            if (runnable != null) {
                runnable.run();
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.wallpaperSettedToUser, new Object[0]);
        }
    }

    private void setGiftThemeUser(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            String remove = this.usedGiftThemesByUsers.remove(Long.valueOf(j));
            if (remove != null) {
                this.usedGiftThemesBySlug.remove(remove);
                return;
            }
            return;
        }
        if (j == 0) {
            Long remove2 = this.usedGiftThemesBySlug.remove(str);
            if (remove2 != null) {
                this.usedGiftThemesByUsers.remove(remove2);
                return;
            }
            return;
        }
        String put = this.usedGiftThemesByUsers.put(Long.valueOf(j), str);
        Long put2 = this.usedGiftThemesBySlug.put(str, Long.valueOf(j));
        if (put != null && !TextUtils.equals(str, put)) {
            this.usedGiftThemesBySlug.remove(put);
        }
        if (put2 == null || put2.longValue() == j) {
            return;
        }
        this.usedGiftThemesByUsers.remove(put2);
    }

    public long getGiftThemeUser(String str) {
        Long l = this.usedGiftThemesBySlug.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public List<EmojiThemes> getEmojiThemes(int i) {
        List<EmojiThemes> list;
        boolean hasFlag = TLObject.hasFlag(i, 1);
        boolean hasFlag2 = TLObject.hasFlag(i, 2);
        boolean hasFlag3 = TLObject.hasFlag(i, 4);
        ArrayList arrayList = new ArrayList();
        if (hasFlag3 && this.giftsThemeList.themes != null) {
            arrayList.addAll(this.giftsThemeList.themes);
        }
        if (hasFlag2 && (list = this.allChatThemes) != null) {
            arrayList.addAll(list);
        }
        if (hasFlag && (arrayList.isEmpty() || !((EmojiThemes) arrayList.get(0)).showAsDefaultStub)) {
            arrayList.add(0, EmojiThemes.createChatThemesDefault(this.currentAccount));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((EmojiThemes) it.next()).initColors();
        }
        return arrayList;
    }

    public boolean isAllThemesFullyLoaded() {
        List<EmojiThemes> list;
        return (!isGiftThemesFullyLoaded() || (list = this.allChatThemes) == null || list.isEmpty()) ? false : true;
    }

    public boolean isGiftThemesFullyLoaded() {
        return this.giftsThemeList.completed;
    }

    private void requestNextChatThemes(final ResultCallback<Void> resultCallback) {
        if (this.giftsThemeList.hash != 0) {
            long unused = this.giftsThemeList.lastReloadTimeMs;
        }
        boolean z = System.currentTimeMillis() - this.giftsThemeList.lastReloadTimeMs > 7200000;
        if (this.giftsThemeList.themes == null || !this.giftsThemeList.completed || z) {
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            tl_getUniqueGiftChatThemes.offset = this.giftsThemeList.offset;
            tl_getUniqueGiftChatThemes.hash = this.giftsThemeList.hash;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = getConnectionsManager();
            DispatchQueue dispatchQueue = chatThemeQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new ChatThemeController$$ExternalSyntheticLambda10(dispatchQueue), new Utilities.Callback2() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda11
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    ChatThemeController.this.lambda$requestNextChatThemes$21(resultCallback, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestNextChatThemes$21(final ResultCallback resultCallback, TL_account.ChatThemes chatThemes, final TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ResultCallback.this.onError(tL_error);
                }
            });
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (chatThemes instanceof TL_account.Tl_chatThemes) {
            final TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
            getMessagesStorage().putGiftChatThemes(tl_chatThemes.themes);
            getMessagesStorage().putUsersAndChats(tl_chatThemes.users, tl_chatThemes.chats, true, true);
            getMessagesController().putUsers(tl_chatThemes.users, false);
            getMessagesController().putChats(tl_chatThemes.chats, false);
            Iterator<TLRPC.ChatTheme> it = tl_chatThemes.themes.iterator();
            while (it.hasNext()) {
                TLRPC.ChatTheme next = it.next();
                if (next instanceof TLRPC.TL_chatThemeUniqueGift) {
                    arrayList.add((TLRPC.TL_chatThemeUniqueGift) next);
                }
            }
            final ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                EmojiThemes emojiThemes = new EmojiThemes(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i));
                emojiThemes.preloadWallpaper();
                arrayList2.add(emojiThemes);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    ChatThemeController.this.lambda$requestNextChatThemes$19(tl_chatThemes, arrayList2, arrayList, resultCallback);
                }
            });
            return;
        }
        if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    ChatThemeController.this.lambda$requestNextChatThemes$20(resultCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestNextChatThemes$19(TL_account.Tl_chatThemes tl_chatThemes, List list, List list2, ResultCallback resultCallback) {
        this.giftsThemeList.offset = tl_chatThemes.next_offset;
        this.giftsThemeList.hash = tl_chatThemes.hash;
        this.giftsThemeList.lastReloadTimeMs = System.currentTimeMillis();
        if (this.giftsThemeList.themes != null) {
            this.giftsThemeList.themes.addAll(list);
        } else {
            this.giftsThemeList.themes = new ArrayList(list);
        }
        if (TextUtils.isEmpty(tl_chatThemes.next_offset)) {
            this.giftsThemeList.completed = true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EmojiThemes emojiThemes = (EmojiThemes) it.next();
            this.allChatGiftThemes.put(emojiThemes.getEmoticonOrSlug(), emojiThemes);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) it2.next();
            setGiftThemeUser(tL_chatThemeUniqueGift.gift.slug, DialogObject.getPeerDialogId(tL_chatThemeUniqueGift.gift.theme_peer));
        }
        resultCallback.onComplete(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestNextChatThemes$20(ResultCallback resultCallback) {
        this.giftsThemeList.lastReloadTimeMs = System.currentTimeMillis();
        this.giftsThemeList.completed = true;
        resultCallback.onComplete(null);
    }
}
