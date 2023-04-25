package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import androidx.core.content.pm.ShortcutManagerCompat;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC$TL_help_appUpdate;
import org.telegram.tgnet.TLRPC$help_AppUpdate;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.LaunchActivity;
/* loaded from: classes.dex */
public class SharedConfig {
    private static final int[] LOW_SOC;
    public static final int PASSCODE_TYPE_PASSWORD = 1;
    public static final int PASSCODE_TYPE_PIN = 0;
    public static final int PERFORMANCE_CLASS_AVERAGE = 1;
    public static final int PERFORMANCE_CLASS_HIGH = 2;
    public static final int PERFORMANCE_CLASS_LOW = 0;
    private static final int PROXY_CURRENT_SCHEMA_VERSION = 2;
    private static final int PROXY_SCHEMA_V2 = 2;
    public static final int SAVE_TO_GALLERY_FLAG_CHANNELS = 4;
    public static final int SAVE_TO_GALLERY_FLAG_GROUP = 2;
    public static final int SAVE_TO_GALLERY_FLAG_PEER = 1;
    public static boolean allowBigEmoji = false;
    public static boolean allowScreenCapture = false;
    private static Boolean animationsEnabled = null;
    public static boolean appLocked = false;
    public static boolean archiveHidden = false;
    public static int autoLockIn = 3600;
    public static int badPasscodeTries = 0;
    public static boolean bigCameraForRound = false;
    public static int bubbleRadius = 0;
    public static boolean chatBubbles = false;
    private static int chatSwipeAction = 0;
    private static boolean configLoaded = false;
    public static ProxyInfo currentProxy = null;
    public static boolean customTabs = false;
    public static int dayNightThemeSwitchHintCount = 0;
    public static int dayNightWallpaperSwitchHint = 0;
    public static boolean debugWebView = false;
    private static int devicePerformanceClass = 0;
    public static boolean directShare = false;
    public static String directShareHash = null;
    public static boolean disableVoiceAudioEffects = false;
    public static int distanceSystemType = 0;
    public static boolean dontAskManageStorage = false;
    public static boolean drawDialogIcons = false;
    public static int emojiInteractionsHintCount = 0;
    public static int fastScrollHintCount = 0;
    public static int fontSize = 0;
    public static boolean fontSizeIsDefault = false;
    public static boolean forceDisableTabletMode = false;
    public static boolean forwardingOptionsHintShown = false;
    public static boolean hasCameraCache = false;
    public static boolean hasEmailLogin = false;
    public static boolean inappCamera = false;
    public static boolean isFloatingDebugActive = false;
    public static boolean isWaitingForPasscodeEnter = false;
    public static int ivFontSize = 0;
    public static int lastKeepMediaCheckTime = 0;
    public static int lastLogsCheckTime = 0;
    public static int lastPauseTime = 0;
    public static long lastUpdateCheckTime = 0;
    public static String lastUpdateVersion = null;
    public static long lastUptimeMillis = 0;
    private static int legacyDevicePerformanceClass = -1;
    public static LiteMode liteMode = null;
    public static int lockRecordAudioVideoHint = 0;
    public static int mediaColumnsCount = 0;
    public static int messageSeenHintCount = 0;
    public static boolean nextMediaTap = false;
    public static boolean noSoundHintShowed = false;
    public static final boolean noStatusBar = true;
    public static boolean noiseSupression = false;
    private static int overrideDevicePerformanceClass = 0;
    public static String passcodeHash = "";
    public static long passcodeRetryInMs = 0;
    public static int passcodeType = 0;
    public static int passportConfigHash = 0;
    private static HashMap<String, String> passportConfigMap = null;
    public static boolean pauseMusicOnMedia = false;
    public static boolean pauseMusicOnRecord = false;
    public static TLRPC$TL_help_appUpdate pendingAppUpdate = null;
    public static int pendingAppUpdateBuildVersion = 0;
    public static boolean playOrderReversed = false;
    public static ArrayList<ProxyInfo> proxyList = null;
    private static boolean proxyListLoaded = false;
    public static boolean proxyRotationEnabled = false;
    public static int proxyRotationTimeout = 0;
    public static byte[] pushAuthKey = null;
    public static byte[] pushAuthKeyId = null;
    public static boolean pushStatSent = false;
    public static String pushString = "";
    public static long pushStringGetTimeEnd = 0;
    public static long pushStringGetTimeStart = 0;
    public static String pushStringStatus = "";
    public static int pushType = 2;
    public static boolean raiseToListen = false;
    public static boolean raiseToSpeak = false;
    public static boolean readOnlyStorageDirAlertShowed = false;
    public static boolean recordViaSco = false;
    public static int repeatMode = 0;
    public static boolean roundCamera16to9 = false;
    public static boolean saveIncomingPhotos = false;
    public static boolean saveStreamMedia = false;
    public static int scheduledOrNoSoundHintShows = 0;
    public static int searchMessagesAsListHintShows = 0;
    public static boolean searchMessagesAsListUsed = false;
    public static boolean showNotificationsForAllAccounts = false;
    public static boolean shuffleMusic = false;
    public static boolean sortContactsByName = false;
    public static boolean sortFilesByName = false;
    public static boolean stickersReorderingHintUsed = false;
    public static String storageCacheDir = null;
    public static boolean streamAllVideo = false;
    public static boolean streamMedia = false;
    public static boolean streamMkv = false;
    public static boolean suggestAnimatedEmoji = false;
    public static int suggestStickers = 0;
    public static int textSelectionHintShows = 0;
    public static boolean translateChats = false;
    public static boolean useFingerprint = true;
    public static boolean useSystemEmoji;
    public static boolean useThreeLinesLayout;
    public static byte[] passcodeSalt = new byte[0];
    public static int keepMedia = CacheByChatsController.KEEP_MEDIA_ONE_MONTH;
    public static boolean updateStickersOrderOnSend = true;
    private static int lastLocalId = -210000;
    private static String passportConfigJson = "";
    private static final Object sync = new Object();
    private static final Object localIdSync = new Object();
    public static int mapPreviewType = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PasscodeType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PerformanceClass {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkSdCard$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkSdCard$1(DialogInterface dialogInterface, int i) {
    }

    public static String performanceClassName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "HIGH" : "AVERAGE" : "LOW";
    }

    public static boolean loopStickers() {
        return LiteMode.isEnabled(2);
    }

    public static void checkSdCard(File file) {
        if (file == null || storageCacheDir == null || readOnlyStorageDirAlertShowed || !file.getPath().startsWith(storageCacheDir)) {
            return;
        }
        AndroidUtilities.runOnUIThread(SharedConfig$$ExternalSyntheticLambda3.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkSdCard$2() {
        BaseFragment lastFragment;
        if (readOnlyStorageDirAlertShowed || (lastFragment = LaunchActivity.getLastFragment()) == null || lastFragment.getParentActivity() == null) {
            return;
        }
        storageCacheDir = null;
        saveConfig();
        ImageLoader.getInstance().checkMediaPaths(SharedConfig$$ExternalSyntheticLambda2.INSTANCE);
        readOnlyStorageDirAlertShowed = true;
        AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getParentActivity());
        builder.setTitle(LocaleController.getString("SdCardError", R.string.SdCardError));
        builder.setSubtitle(LocaleController.getString("SdCardErrorDescription", R.string.SdCardErrorDescription));
        builder.setPositiveButton(LocaleController.getString("DoNotUseSDCard", R.string.DoNotUseSDCard), SharedConfig$$ExternalSyntheticLambda0.INSTANCE);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.show();
    }

    static {
        chatBubbles = Build.VERSION.SDK_INT >= 30;
        raiseToSpeak = false;
        raiseToListen = true;
        nextMediaTap = true;
        recordViaSco = false;
        customTabs = true;
        directShare = true;
        inappCamera = true;
        roundCamera16to9 = true;
        noSoundHintShowed = false;
        streamMedia = true;
        streamAllVideo = false;
        streamMkv = false;
        saveStreamMedia = true;
        pauseMusicOnRecord = false;
        pauseMusicOnMedia = false;
        showNotificationsForAllAccounts = true;
        fontSize = 16;
        bubbleRadius = 17;
        ivFontSize = 16;
        mediaColumnsCount = 3;
        fastScrollHintCount = 3;
        translateChats = true;
        LOW_SOC = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        loadConfig();
        proxyList = new ArrayList<>();
    }

    /* loaded from: classes.dex */
    public static class ProxyInfo {
        public String address;
        public boolean available;
        public long availableCheckTime;
        public boolean checking;
        public String password;
        public long ping;
        public int port;
        public long proxyCheckPingId;
        public String secret;
        public String username;

        public ProxyInfo(String str, int i, String str2, String str3, String str4) {
            this.address = str;
            this.port = i;
            this.username = str2;
            this.password = str3;
            this.secret = str4;
            if (str == null) {
                this.address = "";
            }
            if (str3 == null) {
                this.password = "";
            }
            if (str2 == null) {
                this.username = "";
            }
            if (str4 == null) {
                this.secret = "";
            }
        }

        public String getLink() {
            StringBuilder sb = new StringBuilder(!TextUtils.isEmpty(this.secret) ? "https://t.me/proxy?" : "https://t.me/socks?");
            try {
                sb.append("server=");
                sb.append(URLEncoder.encode(this.address, "UTF-8"));
                sb.append("&");
                sb.append("port=");
                sb.append(this.port);
                if (!TextUtils.isEmpty(this.username)) {
                    sb.append("&user=");
                    sb.append(URLEncoder.encode(this.username, "UTF-8"));
                }
                if (!TextUtils.isEmpty(this.password)) {
                    sb.append("&pass=");
                    sb.append(URLEncoder.encode(this.password, "UTF-8"));
                }
                if (!TextUtils.isEmpty(this.secret)) {
                    sb.append("&secret=");
                    sb.append(URLEncoder.encode(this.secret, "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return sb.toString();
        }
    }

    public static void saveConfig() {
        synchronized (sync) {
            try {
                SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0).edit();
                edit.putBoolean("saveIncomingPhotos", saveIncomingPhotos);
                edit.putString("passcodeHash1", passcodeHash);
                byte[] bArr = passcodeSalt;
                edit.putString("passcodeSalt", bArr.length > 0 ? Base64.encodeToString(bArr, 0) : "");
                edit.putBoolean("appLocked", appLocked);
                edit.putInt("passcodeType", passcodeType);
                edit.putLong("passcodeRetryInMs", passcodeRetryInMs);
                edit.putLong("lastUptimeMillis", lastUptimeMillis);
                edit.putInt("badPasscodeTries", badPasscodeTries);
                edit.putInt("autoLockIn", autoLockIn);
                edit.putInt("lastPauseTime", lastPauseTime);
                edit.putString("lastUpdateVersion2", lastUpdateVersion);
                edit.putBoolean("useFingerprint", useFingerprint);
                edit.putBoolean("allowScreenCapture", allowScreenCapture);
                edit.putString("pushString2", pushString);
                edit.putInt("pushType", pushType);
                edit.putBoolean("pushStatSent", pushStatSent);
                byte[] bArr2 = pushAuthKey;
                edit.putString("pushAuthKey", bArr2 != null ? Base64.encodeToString(bArr2, 0) : "");
                edit.putInt("lastLocalId", lastLocalId);
                edit.putString("passportConfigJson", passportConfigJson);
                edit.putInt("passportConfigHash", passportConfigHash);
                edit.putBoolean("sortContactsByName", sortContactsByName);
                edit.putBoolean("sortFilesByName", sortFilesByName);
                edit.putInt("textSelectionHintShows", textSelectionHintShows);
                edit.putInt("scheduledOrNoSoundHintShows", scheduledOrNoSoundHintShows);
                edit.putBoolean("forwardingOptionsHintShown", forwardingOptionsHintShown);
                edit.putInt("lockRecordAudioVideoHint", lockRecordAudioVideoHint);
                edit.putString("storageCacheDir", !TextUtils.isEmpty(storageCacheDir) ? storageCacheDir : "");
                edit.putBoolean("proxyRotationEnabled", proxyRotationEnabled);
                edit.putInt("proxyRotationTimeout", proxyRotationTimeout);
                TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate = pendingAppUpdate;
                if (tLRPC$TL_help_appUpdate != null) {
                    try {
                        SerializedData serializedData = new SerializedData(tLRPC$TL_help_appUpdate.getObjectSize());
                        pendingAppUpdate.serializeToStream(serializedData);
                        edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                        edit.putInt("appUpdateBuild", pendingAppUpdateBuildVersion);
                        serializedData.cleanup();
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove("appUpdate");
                }
                edit.putLong("appUpdateCheckTime", lastUpdateCheckTime);
                edit.apply();
                SharedPreferences.Editor edit2 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                edit2.putBoolean("hasEmailLogin", hasEmailLogin);
                edit2.putBoolean("floatingDebugActive", isFloatingDebugActive);
                edit2.putBoolean("record_via_sco", recordViaSco);
                edit2.apply();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static int getLastLocalId() {
        int i;
        synchronized (localIdSync) {
            i = lastLocalId;
            lastLocalId = i - 1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x017d A[Catch: Exception -> 0x019f, all -> 0x03ee, TryCatch #0 {Exception -> 0x019f, blocks: (B:22:0x012e, B:24:0x0136, B:26:0x0146, B:27:0x015a, B:38:0x017d, B:40:0x0181, B:41:0x0183, B:43:0x0187, B:45:0x018d, B:47:0x0193, B:49:0x0197, B:36:0x0177), top: B:83:0x012e, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0181 A[Catch: Exception -> 0x019f, all -> 0x03ee, TryCatch #0 {Exception -> 0x019f, blocks: (B:22:0x012e, B:24:0x0136, B:26:0x0146, B:27:0x015a, B:38:0x017d, B:40:0x0181, B:41:0x0183, B:43:0x0187, B:45:0x018d, B:47:0x0193, B:49:0x0197, B:36:0x0177), top: B:83:0x012e, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void loadConfig() {
        int i;
        String str;
        String str2;
        PackageInfo packageInfo;
        synchronized (sync) {
            if (!configLoaded && ApplicationLoader.applicationContext != null) {
                SharedPreferences unused = BackgroundActivityPrefs.prefs = ApplicationLoader.applicationContext.getSharedPreferences("background_activity", 0);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0);
                saveIncomingPhotos = sharedPreferences.getBoolean("saveIncomingPhotos", false);
                passcodeHash = sharedPreferences.getString("passcodeHash1", "");
                appLocked = sharedPreferences.getBoolean("appLocked", false);
                passcodeType = sharedPreferences.getInt("passcodeType", 0);
                passcodeRetryInMs = sharedPreferences.getLong("passcodeRetryInMs", 0L);
                lastUptimeMillis = sharedPreferences.getLong("lastUptimeMillis", 0L);
                badPasscodeTries = sharedPreferences.getInt("badPasscodeTries", 0);
                autoLockIn = sharedPreferences.getInt("autoLockIn", 3600);
                lastPauseTime = sharedPreferences.getInt("lastPauseTime", 0);
                useFingerprint = sharedPreferences.getBoolean("useFingerprint", true);
                lastUpdateVersion = sharedPreferences.getString("lastUpdateVersion2", "3.5");
                allowScreenCapture = sharedPreferences.getBoolean("allowScreenCapture", false);
                lastLocalId = sharedPreferences.getInt("lastLocalId", -210000);
                pushString = sharedPreferences.getString("pushString2", "");
                pushType = sharedPreferences.getInt("pushType", 2);
                pushStatSent = sharedPreferences.getBoolean("pushStatSent", false);
                passportConfigJson = sharedPreferences.getString("passportConfigJson", "");
                passportConfigHash = sharedPreferences.getInt("passportConfigHash", 0);
                storageCacheDir = sharedPreferences.getString("storageCacheDir", null);
                proxyRotationEnabled = sharedPreferences.getBoolean("proxyRotationEnabled", false);
                proxyRotationTimeout = sharedPreferences.getInt("proxyRotationTimeout", 1);
                String string = sharedPreferences.getString("pushAuthKey", null);
                if (!TextUtils.isEmpty(string)) {
                    pushAuthKey = Base64.decode(string, 0);
                }
                if (passcodeHash.length() > 0 && lastPauseTime == 0) {
                    lastPauseTime = (int) ((SystemClock.elapsedRealtime() / 1000) - 600);
                }
                String string2 = sharedPreferences.getString("passcodeSalt", "");
                if (string2.length() > 0) {
                    passcodeSalt = Base64.decode(string2, 0);
                } else {
                    passcodeSalt = new byte[0];
                }
                lastUpdateCheckTime = sharedPreferences.getLong("appUpdateCheckTime", System.currentTimeMillis());
                try {
                    String string3 = sharedPreferences.getString("appUpdate", null);
                    if (string3 != null) {
                        pendingAppUpdateBuildVersion = sharedPreferences.getInt("appUpdateBuild", BuildVars.BUILD_VERSION);
                        byte[] decode = Base64.decode(string3, 0);
                        if (decode != null) {
                            SerializedData serializedData = new SerializedData(decode);
                            pendingAppUpdate = (TLRPC$TL_help_appUpdate) TLRPC$help_AppUpdate.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                            serializedData.cleanup();
                        }
                    }
                    if (pendingAppUpdate != null) {
                        try {
                            packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            i = packageInfo.versionCode;
                        } catch (Exception e) {
                            e = e;
                            i = 0;
                        }
                        try {
                            str = packageInfo.versionName;
                        } catch (Exception e2) {
                            e = e2;
                            FileLog.e(e);
                            str = null;
                            if (i == 0) {
                            }
                            if (str == null) {
                            }
                            if (pendingAppUpdateBuildVersion == i) {
                            }
                            pendingAppUpdate = null;
                            AndroidUtilities.runOnUIThread(SharedConfig$$ExternalSyntheticLambda5.INSTANCE);
                            SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                            SaveToGallerySettingsHelper.load(sharedPreferences2);
                            mapPreviewType = sharedPreferences2.getInt("mapPreviewType", 2);
                            raiseToListen = sharedPreferences2.getBoolean("raise_to_listen", true);
                            raiseToSpeak = sharedPreferences2.getBoolean("raise_to_speak", false);
                            nextMediaTap = sharedPreferences2.getBoolean("next_media_on_tap", true);
                            recordViaSco = sharedPreferences2.getBoolean("record_via_sco", false);
                            customTabs = sharedPreferences2.getBoolean("custom_tabs", true);
                            directShare = sharedPreferences2.getBoolean("direct_share", true);
                            boolean z = sharedPreferences2.getBoolean("shuffleMusic", false);
                            shuffleMusic = z;
                            playOrderReversed = z && sharedPreferences2.getBoolean("playOrderReversed", false);
                            inappCamera = sharedPreferences2.getBoolean("inappCamera", true);
                            hasCameraCache = sharedPreferences2.contains("cameraCache");
                            roundCamera16to9 = true;
                            repeatMode = sharedPreferences2.getInt("repeatMode", 0);
                            fontSize = sharedPreferences2.getInt("fons_size", !AndroidUtilities.isTablet() ? 18 : 16);
                            fontSizeIsDefault = sharedPreferences2.contains("fons_size");
                            bubbleRadius = sharedPreferences2.getInt("bubbleRadius", 17);
                            ivFontSize = sharedPreferences2.getInt("iv_font_size", fontSize);
                            allowBigEmoji = sharedPreferences2.getBoolean("allowBigEmoji", true);
                            useSystemEmoji = sharedPreferences2.getBoolean("useSystemEmoji", false);
                            streamMedia = sharedPreferences2.getBoolean("streamMedia", true);
                            saveStreamMedia = sharedPreferences2.getBoolean("saveStreamMedia", true);
                            pauseMusicOnRecord = sharedPreferences2.getBoolean("pauseMusicOnRecord", false);
                            pauseMusicOnMedia = sharedPreferences2.getBoolean("pauseMusicOnMedia", false);
                            forceDisableTabletMode = sharedPreferences2.getBoolean("forceDisableTabletMode", false);
                            streamAllVideo = sharedPreferences2.getBoolean("streamAllVideo", BuildVars.DEBUG_VERSION);
                            streamMkv = sharedPreferences2.getBoolean("streamMkv", false);
                            suggestStickers = sharedPreferences2.getInt("suggestStickers", 0);
                            suggestAnimatedEmoji = sharedPreferences2.getBoolean("suggestAnimatedEmoji", true);
                            overrideDevicePerformanceClass = sharedPreferences2.getInt("overrideDevicePerformanceClass", -1);
                            devicePerformanceClass = sharedPreferences2.getInt("devicePerformanceClass", -1);
                            sortContactsByName = sharedPreferences2.getBoolean("sortContactsByName", false);
                            sortFilesByName = sharedPreferences2.getBoolean("sortFilesByName", false);
                            noSoundHintShowed = sharedPreferences2.getBoolean("noSoundHintShowed", false);
                            directShareHash = sharedPreferences2.getString("directShareHash2", null);
                            useThreeLinesLayout = sharedPreferences2.getBoolean("useThreeLinesLayout", false);
                            archiveHidden = sharedPreferences2.getBoolean("archiveHidden", false);
                            distanceSystemType = sharedPreferences2.getInt("distanceSystemType", 0);
                            keepMedia = sharedPreferences2.getInt("keep_media", CacheByChatsController.KEEP_MEDIA_ONE_MONTH);
                            debugWebView = sharedPreferences2.getBoolean("debugWebView", false);
                            lastKeepMediaCheckTime = sharedPreferences2.getInt("lastKeepMediaCheckTime", 0);
                            lastLogsCheckTime = sharedPreferences2.getInt("lastLogsCheckTime", 0);
                            searchMessagesAsListHintShows = sharedPreferences2.getInt("searchMessagesAsListHintShows", 0);
                            searchMessagesAsListUsed = sharedPreferences2.getBoolean("searchMessagesAsListUsed", false);
                            stickersReorderingHintUsed = sharedPreferences2.getBoolean("stickersReorderingHintUsed", false);
                            textSelectionHintShows = sharedPreferences2.getInt("textSelectionHintShows", 0);
                            scheduledOrNoSoundHintShows = sharedPreferences2.getInt("scheduledOrNoSoundHintShows", 0);
                            forwardingOptionsHintShown = sharedPreferences2.getBoolean("forwardingOptionsHintShown", false);
                            lockRecordAudioVideoHint = sharedPreferences2.getInt("lockRecordAudioVideoHint", 0);
                            disableVoiceAudioEffects = sharedPreferences2.getBoolean("disableVoiceAudioEffects", false);
                            noiseSupression = sharedPreferences2.getBoolean("noiseSupression", false);
                            chatSwipeAction = sharedPreferences2.getInt("ChatSwipeAction", -1);
                            messageSeenHintCount = sharedPreferences2.getInt("messageSeenCount", 3);
                            emojiInteractionsHintCount = sharedPreferences2.getInt("emojiInteractionsHintCount", 3);
                            dayNightThemeSwitchHintCount = sharedPreferences2.getInt("dayNightThemeSwitchHintCount", 3);
                            mediaColumnsCount = sharedPreferences2.getInt("mediaColumnsCount", 3);
                            fastScrollHintCount = sharedPreferences2.getInt("fastScrollHintCount", 3);
                            dontAskManageStorage = sharedPreferences2.getBoolean("dontAskManageStorage", false);
                            hasEmailLogin = sharedPreferences2.getBoolean("hasEmailLogin", false);
                            isFloatingDebugActive = sharedPreferences2.getBoolean("floatingDebugActive", false);
                            updateStickersOrderOnSend = sharedPreferences2.getBoolean("updateStickersOrderOnSend", true);
                            dayNightWallpaperSwitchHint = sharedPreferences2.getInt("dayNightWallpaperSwitchHint", 0);
                            bigCameraForRound = sharedPreferences2.getBoolean("bigCameraForRound", false);
                            showNotificationsForAllAccounts = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
                            configLoaded = true;
                            if (Build.VERSION.SDK_INT >= 19) {
                                WebView.setWebContentsDebuggingEnabled(true);
                            }
                        }
                        if (i == 0) {
                            i = BuildVars.BUILD_VERSION;
                        }
                        if (str == null) {
                            str = BuildVars.BUILD_VERSION_STRING;
                        }
                        if (pendingAppUpdateBuildVersion == i || (str2 = pendingAppUpdate.version) == null || str.compareTo(str2) >= 0 || BuildVars.DEBUG_PRIVATE_VERSION) {
                            pendingAppUpdate = null;
                            AndroidUtilities.runOnUIThread(SharedConfig$$ExternalSyntheticLambda5.INSTANCE);
                        }
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                SharedPreferences sharedPreferences22 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                SaveToGallerySettingsHelper.load(sharedPreferences22);
                mapPreviewType = sharedPreferences22.getInt("mapPreviewType", 2);
                raiseToListen = sharedPreferences22.getBoolean("raise_to_listen", true);
                raiseToSpeak = sharedPreferences22.getBoolean("raise_to_speak", false);
                nextMediaTap = sharedPreferences22.getBoolean("next_media_on_tap", true);
                recordViaSco = sharedPreferences22.getBoolean("record_via_sco", false);
                customTabs = sharedPreferences22.getBoolean("custom_tabs", true);
                directShare = sharedPreferences22.getBoolean("direct_share", true);
                boolean z2 = sharedPreferences22.getBoolean("shuffleMusic", false);
                shuffleMusic = z2;
                playOrderReversed = z2 && sharedPreferences22.getBoolean("playOrderReversed", false);
                inappCamera = sharedPreferences22.getBoolean("inappCamera", true);
                hasCameraCache = sharedPreferences22.contains("cameraCache");
                roundCamera16to9 = true;
                repeatMode = sharedPreferences22.getInt("repeatMode", 0);
                fontSize = sharedPreferences22.getInt("fons_size", !AndroidUtilities.isTablet() ? 18 : 16);
                fontSizeIsDefault = sharedPreferences22.contains("fons_size");
                bubbleRadius = sharedPreferences22.getInt("bubbleRadius", 17);
                ivFontSize = sharedPreferences22.getInt("iv_font_size", fontSize);
                allowBigEmoji = sharedPreferences22.getBoolean("allowBigEmoji", true);
                useSystemEmoji = sharedPreferences22.getBoolean("useSystemEmoji", false);
                streamMedia = sharedPreferences22.getBoolean("streamMedia", true);
                saveStreamMedia = sharedPreferences22.getBoolean("saveStreamMedia", true);
                pauseMusicOnRecord = sharedPreferences22.getBoolean("pauseMusicOnRecord", false);
                pauseMusicOnMedia = sharedPreferences22.getBoolean("pauseMusicOnMedia", false);
                forceDisableTabletMode = sharedPreferences22.getBoolean("forceDisableTabletMode", false);
                streamAllVideo = sharedPreferences22.getBoolean("streamAllVideo", BuildVars.DEBUG_VERSION);
                streamMkv = sharedPreferences22.getBoolean("streamMkv", false);
                suggestStickers = sharedPreferences22.getInt("suggestStickers", 0);
                suggestAnimatedEmoji = sharedPreferences22.getBoolean("suggestAnimatedEmoji", true);
                overrideDevicePerformanceClass = sharedPreferences22.getInt("overrideDevicePerformanceClass", -1);
                devicePerformanceClass = sharedPreferences22.getInt("devicePerformanceClass", -1);
                sortContactsByName = sharedPreferences22.getBoolean("sortContactsByName", false);
                sortFilesByName = sharedPreferences22.getBoolean("sortFilesByName", false);
                noSoundHintShowed = sharedPreferences22.getBoolean("noSoundHintShowed", false);
                directShareHash = sharedPreferences22.getString("directShareHash2", null);
                useThreeLinesLayout = sharedPreferences22.getBoolean("useThreeLinesLayout", false);
                archiveHidden = sharedPreferences22.getBoolean("archiveHidden", false);
                distanceSystemType = sharedPreferences22.getInt("distanceSystemType", 0);
                keepMedia = sharedPreferences22.getInt("keep_media", CacheByChatsController.KEEP_MEDIA_ONE_MONTH);
                debugWebView = sharedPreferences22.getBoolean("debugWebView", false);
                lastKeepMediaCheckTime = sharedPreferences22.getInt("lastKeepMediaCheckTime", 0);
                lastLogsCheckTime = sharedPreferences22.getInt("lastLogsCheckTime", 0);
                searchMessagesAsListHintShows = sharedPreferences22.getInt("searchMessagesAsListHintShows", 0);
                searchMessagesAsListUsed = sharedPreferences22.getBoolean("searchMessagesAsListUsed", false);
                stickersReorderingHintUsed = sharedPreferences22.getBoolean("stickersReorderingHintUsed", false);
                textSelectionHintShows = sharedPreferences22.getInt("textSelectionHintShows", 0);
                scheduledOrNoSoundHintShows = sharedPreferences22.getInt("scheduledOrNoSoundHintShows", 0);
                forwardingOptionsHintShown = sharedPreferences22.getBoolean("forwardingOptionsHintShown", false);
                lockRecordAudioVideoHint = sharedPreferences22.getInt("lockRecordAudioVideoHint", 0);
                disableVoiceAudioEffects = sharedPreferences22.getBoolean("disableVoiceAudioEffects", false);
                noiseSupression = sharedPreferences22.getBoolean("noiseSupression", false);
                chatSwipeAction = sharedPreferences22.getInt("ChatSwipeAction", -1);
                messageSeenHintCount = sharedPreferences22.getInt("messageSeenCount", 3);
                emojiInteractionsHintCount = sharedPreferences22.getInt("emojiInteractionsHintCount", 3);
                dayNightThemeSwitchHintCount = sharedPreferences22.getInt("dayNightThemeSwitchHintCount", 3);
                mediaColumnsCount = sharedPreferences22.getInt("mediaColumnsCount", 3);
                fastScrollHintCount = sharedPreferences22.getInt("fastScrollHintCount", 3);
                dontAskManageStorage = sharedPreferences22.getBoolean("dontAskManageStorage", false);
                hasEmailLogin = sharedPreferences22.getBoolean("hasEmailLogin", false);
                isFloatingDebugActive = sharedPreferences22.getBoolean("floatingDebugActive", false);
                updateStickersOrderOnSend = sharedPreferences22.getBoolean("updateStickersOrderOnSend", true);
                dayNightWallpaperSwitchHint = sharedPreferences22.getInt("dayNightWallpaperSwitchHint", 0);
                bigCameraForRound = sharedPreferences22.getBoolean("bigCameraForRound", false);
                showNotificationsForAllAccounts = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
                configLoaded = true;
                try {
                    if (Build.VERSION.SDK_INT >= 19 && debugWebView) {
                        WebView.setWebContentsDebuggingEnabled(true);
                    }
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            }
        }
    }

    public static void updateTabletConfig() {
        if (fontSizeIsDefault) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            int i = sharedPreferences.getInt("fons_size", AndroidUtilities.isTablet() ? 18 : 16);
            fontSize = i;
            ivFontSize = sharedPreferences.getInt("iv_font_size", i);
        }
    }

    public static void increaseBadPasscodeTries() {
        int i = badPasscodeTries + 1;
        badPasscodeTries = i;
        if (i >= 3) {
            if (i == 3) {
                passcodeRetryInMs = 5000L;
            } else if (i == 4) {
                passcodeRetryInMs = 10000L;
            } else if (i == 5) {
                passcodeRetryInMs = 15000L;
            } else if (i == 6) {
                passcodeRetryInMs = 20000L;
            } else if (i == 7) {
                passcodeRetryInMs = 25000L;
            } else {
                passcodeRetryInMs = 30000L;
            }
            lastUptimeMillis = SystemClock.elapsedRealtime();
        }
        saveConfig();
    }

    public static boolean isAutoplayVideo() {
        return LiteMode.isEnabled(1024);
    }

    public static boolean isAutoplayGifs() {
        return LiteMode.isEnabled(LiteMode.FLAG_AUTOPLAY_GIFS);
    }

    public static boolean isPassportConfigLoaded() {
        return passportConfigMap != null;
    }

    public static void setPassportConfig(String str, int i) {
        passportConfigMap = null;
        passportConfigJson = str;
        passportConfigHash = i;
        saveConfig();
        getCountryLangs();
    }

    public static HashMap<String, String> getCountryLangs() {
        if (passportConfigMap == null) {
            passportConfigMap = new HashMap<>();
            try {
                JSONObject jSONObject = new JSONObject(passportConfigJson);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    passportConfigMap.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        return passportConfigMap;
    }

    public static boolean isAppUpdateAvailable() {
        int i;
        TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate = pendingAppUpdate;
        if (tLRPC$TL_help_appUpdate == null || tLRPC$TL_help_appUpdate.document == null || !BuildVars.isStandaloneApp()) {
            return false;
        }
        try {
            i = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            FileLog.e(e);
            i = BuildVars.BUILD_VERSION;
        }
        return pendingAppUpdateBuildVersion == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean setNewAppVersionAvailable(TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate) {
        int i;
        String str;
        String str2;
        PackageInfo packageInfo;
        try {
            packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            i = packageInfo.versionCode;
        } catch (Exception e) {
            e = e;
            i = 0;
        }
        try {
            str = packageInfo.versionName;
        } catch (Exception e2) {
            e = e2;
            FileLog.e(e);
            str = null;
            if (i == 0) {
            }
            if (str == null) {
            }
            str2 = tLRPC$TL_help_appUpdate.version;
            if (str2 != null) {
            }
            return false;
        }
        if (i == 0) {
            i = BuildVars.BUILD_VERSION;
        }
        if (str == null) {
            str = BuildVars.BUILD_VERSION_STRING;
        }
        str2 = tLRPC$TL_help_appUpdate.version;
        if (str2 != null || str.compareTo(str2) >= 0) {
            return false;
        }
        pendingAppUpdate = tLRPC$TL_help_appUpdate;
        pendingAppUpdateBuildVersion = i;
        saveConfig();
        return true;
    }

    public static boolean checkPasscode(String str) {
        if (passcodeSalt.length == 0) {
            boolean equals = Utilities.MD5(str).equals(passcodeHash);
            if (equals) {
                try {
                    passcodeSalt = new byte[16];
                    Utilities.random.nextBytes(passcodeSalt);
                    byte[] bytes = str.getBytes("UTF-8");
                    int length = bytes.length + 32;
                    byte[] bArr = new byte[length];
                    System.arraycopy(passcodeSalt, 0, bArr, 0, 16);
                    System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                    System.arraycopy(passcodeSalt, 0, bArr, bytes.length + 16, 16);
                    passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length));
                    saveConfig();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return equals;
        }
        try {
            byte[] bytes2 = str.getBytes("UTF-8");
            int length2 = bytes2.length + 32;
            byte[] bArr2 = new byte[length2];
            System.arraycopy(passcodeSalt, 0, bArr2, 0, 16);
            System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
            System.arraycopy(passcodeSalt, 0, bArr2, bytes2.length + 16, 16);
            return passcodeHash.equals(Utilities.bytesToHex(Utilities.computeSHA256(bArr2, 0, length2)));
        } catch (Exception e2) {
            FileLog.e(e2);
            return false;
        }
    }

    public static void clearConfig() {
        saveIncomingPhotos = false;
        appLocked = false;
        passcodeType = 0;
        passcodeRetryInMs = 0L;
        lastUptimeMillis = 0L;
        badPasscodeTries = 0;
        passcodeHash = "";
        passcodeSalt = new byte[0];
        autoLockIn = 3600;
        lastPauseTime = 0;
        useFingerprint = true;
        isWaitingForPasscodeEnter = false;
        allowScreenCapture = false;
        lastUpdateVersion = BuildVars.BUILD_VERSION_STRING;
        textSelectionHintShows = 0;
        scheduledOrNoSoundHintShows = 0;
        lockRecordAudioVideoHint = 0;
        forwardingOptionsHintShown = false;
        messageSeenHintCount = 3;
        emojiInteractionsHintCount = 3;
        dayNightThemeSwitchHintCount = 3;
        dayNightWallpaperSwitchHint = 0;
        saveConfig();
    }

    public static void setSuggestStickers(int i) {
        suggestStickers = i;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("suggestStickers", suggestStickers);
        edit.apply();
    }

    public static void setSearchMessagesAsListUsed(boolean z) {
        searchMessagesAsListUsed = z;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("searchMessagesAsListUsed", searchMessagesAsListUsed);
        edit.apply();
    }

    public static void setStickersReorderingHintUsed(boolean z) {
        stickersReorderingHintUsed = z;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("stickersReorderingHintUsed", stickersReorderingHintUsed);
        edit.apply();
    }

    public static void increaseTextSelectionHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i = textSelectionHintShows + 1;
        textSelectionHintShows = i;
        edit.putInt("textSelectionHintShows", i);
        edit.apply();
    }

    public static void increaseDayNightWallpaperSiwtchHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i = dayNightWallpaperSwitchHint + 1;
        dayNightWallpaperSwitchHint = i;
        edit.putInt("dayNightWallpaperSwitchHint", i);
        edit.apply();
    }

    public static void removeTextSelectionHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public static void increaseScheduledOrNoSuoundHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i = scheduledOrNoSoundHintShows + 1;
        scheduledOrNoSoundHintShows = i;
        edit.putInt("scheduledOrNoSoundHintShows", i);
        edit.apply();
    }

    public static void forwardingOptionsHintHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        forwardingOptionsHintShown = true;
        edit.putBoolean("forwardingOptionsHintShown", true);
        edit.apply();
    }

    public static void removeScheduledOrNoSoundHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("scheduledOrNoSoundHintShows", 3);
        edit.apply();
    }

    public static void increaseLockRecordAudioVideoHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i = lockRecordAudioVideoHint + 1;
        lockRecordAudioVideoHint = i;
        edit.putInt("lockRecordAudioVideoHint", i);
        edit.apply();
    }

    public static void removeLockRecordAudioVideoHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
    }

    public static void increaseSearchAsListHintShows() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i = searchMessagesAsListHintShows + 1;
        searchMessagesAsListHintShows = i;
        edit.putInt("searchMessagesAsListHintShows", i);
        edit.apply();
    }

    public static void setKeepMedia(int i) {
        keepMedia = i;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("keep_media", keepMedia);
        edit.apply();
    }

    public static void toggleUpdateStickersOrderOnSend() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        boolean z = !updateStickersOrderOnSend;
        updateStickersOrderOnSend = z;
        edit.putBoolean("updateStickersOrderOnSend", z);
        edit.apply();
    }

    public static void checkLogsToDelete() {
        if (BuildVars.LOGS_ENABLED) {
            final int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis - lastLogsCheckTime) < 3600) {
                return;
            }
            lastLogsCheckTime = currentTimeMillis;
            Utilities.cacheClearQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SharedConfig$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SharedConfig.lambda$checkLogsToDelete$3(currentTimeMillis);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkLogsToDelete$3(int i) {
        File logsDir;
        long j = i - 864000;
        try {
            logsDir = AndroidUtilities.getLogsDir();
        } catch (Throwable th) {
            FileLog.e(th);
        }
        if (logsDir == null) {
            return;
        }
        Utilities.clearDir(logsDir.getAbsolutePath(), 0, j, false);
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("lastLogsCheckTime", lastLogsCheckTime);
        edit.apply();
    }

    public static void toggleDisableVoiceAudioEffects() {
        disableVoiceAudioEffects = !disableVoiceAudioEffects;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("disableVoiceAudioEffects", disableVoiceAudioEffects);
        edit.apply();
    }

    public static void toggleNoiseSupression() {
        noiseSupression = !noiseSupression;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("noiseSupression", noiseSupression);
        edit.apply();
    }

    public static void toggleDebugWebView() {
        boolean z = !debugWebView;
        debugWebView = z;
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(z);
        }
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("debugWebView", debugWebView);
        edit.apply();
    }

    public static void toggleLoopStickers() {
        LiteMode.toggleFlag(2);
    }

    public static void toggleBigEmoji() {
        allowBigEmoji = !allowBigEmoji;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("allowBigEmoji", allowBigEmoji);
        edit.apply();
    }

    public static void toggleSuggestAnimatedEmoji() {
        suggestAnimatedEmoji = !suggestAnimatedEmoji;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("suggestAnimatedEmoji", suggestAnimatedEmoji);
        edit.apply();
    }

    public static void setPlaybackOrderType(int i) {
        if (i == 2) {
            shuffleMusic = true;
            playOrderReversed = false;
        } else if (i == 1) {
            playOrderReversed = true;
            shuffleMusic = false;
        } else {
            playOrderReversed = false;
            shuffleMusic = false;
        }
        MediaController.getInstance().checkIsNextMediaFileDownloaded();
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("shuffleMusic", shuffleMusic);
        edit.putBoolean("playOrderReversed", playOrderReversed);
        edit.apply();
    }

    public static void setRepeatMode(int i) {
        repeatMode = i;
        if (i < 0 || i > 2) {
            repeatMode = 0;
        }
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("repeatMode", repeatMode);
        edit.apply();
    }

    public static void overrideDevicePerformanceClass(int i) {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        overrideDevicePerformanceClass = i;
        edit.putInt("overrideDevicePerformanceClass", i).remove("lite_mode").apply();
        if (liteMode != null) {
            LiteMode.loadPreference();
        }
    }

    public static void toggleAutoplayGifs() {
        LiteMode.toggleFlag(LiteMode.FLAG_AUTOPLAY_GIFS);
    }

    public static void setUseThreeLinesLayout(boolean z) {
        useThreeLinesLayout = z;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("useThreeLinesLayout", useThreeLinesLayout);
        edit.apply();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public static void toggleArchiveHidden() {
        archiveHidden = !archiveHidden;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("archiveHidden", archiveHidden);
        edit.apply();
    }

    public static void toggleAutoplayVideo() {
        LiteMode.toggleFlag(1024);
    }

    public static boolean isSecretMapPreviewSet() {
        return MessagesController.getGlobalMainSettings().contains("mapPreviewType");
    }

    public static void setSecretMapPreviewType(int i) {
        mapPreviewType = i;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("mapPreviewType", mapPreviewType);
        edit.apply();
    }

    public static void setNoSoundHintShowed(boolean z) {
        if (noSoundHintShowed == z) {
            return;
        }
        noSoundHintShowed = z;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("noSoundHintShowed", noSoundHintShowed);
        edit.apply();
    }

    public static void toggleRaiseToSpeak() {
        raiseToSpeak = !raiseToSpeak;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("raise_to_speak", raiseToSpeak);
        edit.apply();
    }

    public static void toggleRaiseToListen() {
        raiseToListen = !raiseToListen;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("raise_to_listen", raiseToListen);
        edit.apply();
    }

    public static void toggleNextMediaTap() {
        nextMediaTap = !nextMediaTap;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("next_media_on_tap", nextMediaTap);
        edit.apply();
    }

    public static boolean enabledRaiseTo(boolean z) {
        return raiseToListen && (!z || raiseToSpeak);
    }

    public static void toggleCustomTabs() {
        customTabs = !customTabs;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("custom_tabs", customTabs);
        edit.apply();
    }

    public static void toggleDirectShare() {
        directShare = !directShare;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("direct_share", directShare);
        edit.apply();
        ShortcutManagerCompat.removeAllDynamicShortcuts(ApplicationLoader.applicationContext);
        MediaDataController.getInstance(UserConfig.selectedAccount).buildShortcuts();
    }

    public static void toggleStreamMedia() {
        streamMedia = !streamMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamMedia", streamMedia);
        edit.apply();
    }

    public static void toggleSortContactsByName() {
        sortContactsByName = !sortContactsByName;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("sortContactsByName", sortContactsByName);
        edit.apply();
    }

    public static void toggleSortFilesByName() {
        sortFilesByName = !sortFilesByName;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("sortFilesByName", sortFilesByName);
        edit.apply();
    }

    public static void toggleStreamAllVideo() {
        streamAllVideo = !streamAllVideo;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamAllVideo", streamAllVideo);
        edit.apply();
    }

    public static void toggleStreamMkv() {
        streamMkv = !streamMkv;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamMkv", streamMkv);
        edit.apply();
    }

    public static void toggleSaveStreamMedia() {
        saveStreamMedia = !saveStreamMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("saveStreamMedia", saveStreamMedia);
        edit.apply();
    }

    public static void togglePauseMusicOnRecord() {
        pauseMusicOnRecord = !pauseMusicOnRecord;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("pauseMusicOnRecord", pauseMusicOnRecord);
        edit.apply();
    }

    public static void togglePauseMusicOnMedia() {
        pauseMusicOnMedia = !pauseMusicOnMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("pauseMusicOnMedia", pauseMusicOnMedia);
        edit.apply();
    }

    public static void toggleChatBlur() {
        LiteMode.toggleFlag(LiteMode.FLAG_CHAT_BLUR);
    }

    public static void toggleForceDisableTabletMode() {
        forceDisableTabletMode = !forceDisableTabletMode;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("forceDisableTabletMode", forceDisableTabletMode);
        edit.apply();
    }

    public static void toggleInappCamera() {
        inappCamera = !inappCamera;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("inappCamera", inappCamera);
        edit.apply();
    }

    public static void toggleRoundCamera16to9() {
        roundCamera16to9 = !roundCamera16to9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("roundCamera16to9", roundCamera16to9);
        edit.apply();
    }

    public static void setDistanceSystemType(int i) {
        distanceSystemType = i;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("distanceSystemType", distanceSystemType);
        edit.apply();
        LocaleController.resetImperialSystemType();
    }

    public static void loadProxyList() {
        if (proxyListLoaded) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i = sharedPreferences.getInt("proxy_port", 1080);
        proxyListLoaded = true;
        proxyList.clear();
        currentProxy = null;
        String string5 = sharedPreferences.getString("proxy_list", null);
        if (!TextUtils.isEmpty(string5)) {
            SerializedData serializedData = new SerializedData(Base64.decode(string5, 0));
            int readInt32 = serializedData.readInt32(false);
            if (readInt32 == -1) {
                byte readByte = serializedData.readByte(false);
                if (readByte == 2) {
                    int readInt322 = serializedData.readInt32(false);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        ProxyInfo proxyInfo = new ProxyInfo(serializedData.readString(false), serializedData.readInt32(false), serializedData.readString(false), serializedData.readString(false), serializedData.readString(false));
                        proxyInfo.ping = serializedData.readInt64(false);
                        proxyInfo.availableCheckTime = serializedData.readInt64(false);
                        proxyList.add(0, proxyInfo);
                        if (currentProxy == null && !TextUtils.isEmpty(string) && string.equals(proxyInfo.address) && i == proxyInfo.port && string2.equals(proxyInfo.username) && string3.equals(proxyInfo.password)) {
                            currentProxy = proxyInfo;
                        }
                    }
                } else {
                    FileLog.e("Unknown proxy schema version: " + ((int) readByte));
                }
            } else {
                for (int i3 = 0; i3 < readInt32; i3++) {
                    ProxyInfo proxyInfo2 = new ProxyInfo(serializedData.readString(false), serializedData.readInt32(false), serializedData.readString(false), serializedData.readString(false), serializedData.readString(false));
                    proxyList.add(0, proxyInfo2);
                    if (currentProxy == null && !TextUtils.isEmpty(string) && string.equals(proxyInfo2.address) && i == proxyInfo2.port && string2.equals(proxyInfo2.username) && string3.equals(proxyInfo2.password)) {
                        currentProxy = proxyInfo2;
                    }
                }
            }
            serializedData.cleanup();
        }
        if (currentProxy != null || TextUtils.isEmpty(string)) {
            return;
        }
        ProxyInfo proxyInfo3 = new ProxyInfo(string, i, string2, string3, string4);
        currentProxy = proxyInfo3;
        proxyList.add(0, proxyInfo3);
    }

    public static void saveProxyList() {
        ArrayList arrayList = new ArrayList(proxyList);
        Collections.sort(arrayList, SharedConfig$$ExternalSyntheticLambda6.INSTANCE);
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(2);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        for (int i = size - 1; i >= 0; i--) {
            ProxyInfo proxyInfo = (ProxyInfo) arrayList.get(i);
            String str = proxyInfo.address;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            serializedData.writeString(str);
            serializedData.writeInt32(proxyInfo.port);
            String str3 = proxyInfo.username;
            if (str3 == null) {
                str3 = "";
            }
            serializedData.writeString(str3);
            String str4 = proxyInfo.password;
            if (str4 == null) {
                str4 = "";
            }
            serializedData.writeString(str4);
            String str5 = proxyInfo.secret;
            if (str5 != null) {
                str2 = str5;
            }
            serializedData.writeString(str2);
            serializedData.writeInt64(proxyInfo.ping);
            serializedData.writeInt64(proxyInfo.availableCheckTime);
        }
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
        serializedData.cleanup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$saveProxyList$4(ProxyInfo proxyInfo, ProxyInfo proxyInfo2) {
        ProxyInfo proxyInfo3 = currentProxy;
        long j = proxyInfo3 == proxyInfo ? -200000L : 0L;
        if (!proxyInfo.available) {
            j += 100000;
        }
        long j2 = proxyInfo3 != proxyInfo2 ? 0L : -200000L;
        if (!proxyInfo2.available) {
            j2 += 100000;
        }
        return Long.compare(proxyInfo.ping + j, proxyInfo2.ping + j2);
    }

    public static ProxyInfo addProxy(ProxyInfo proxyInfo) {
        loadProxyList();
        int size = proxyList.size();
        for (int i = 0; i < size; i++) {
            ProxyInfo proxyInfo2 = proxyList.get(i);
            if (proxyInfo.address.equals(proxyInfo2.address) && proxyInfo.port == proxyInfo2.port && proxyInfo.username.equals(proxyInfo2.username) && proxyInfo.password.equals(proxyInfo2.password) && proxyInfo.secret.equals(proxyInfo2.secret)) {
                return proxyInfo2;
            }
        }
        proxyList.add(0, proxyInfo);
        saveProxyList();
        return proxyInfo;
    }

    public static boolean isProxyEnabled() {
        return MessagesController.getGlobalMainSettings().getBoolean("proxy_enabled", false) && currentProxy != null;
    }

    public static void deleteProxy(ProxyInfo proxyInfo) {
        if (currentProxy == proxyInfo) {
            currentProxy = null;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            edit.putString("proxy_ip", "");
            edit.putString("proxy_pass", "");
            edit.putString("proxy_user", "");
            edit.putString("proxy_secret", "");
            edit.putInt("proxy_port", 1080);
            edit.putBoolean("proxy_enabled", false);
            edit.putBoolean("proxy_enabled_calls", false);
            edit.apply();
            if (z) {
                ConnectionsManager.setProxySettings(false, "", 0, "", "", "");
            }
        }
        proxyList.remove(proxyInfo);
        saveProxyList();
    }

    public static void checkSaveToGalleryFiles() {
        Utilities.globalQueue.postRunnable(SharedConfig$$ExternalSyntheticLambda4.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkSaveToGalleryFiles$5() {
        try {
            File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
            File file2 = new File(file, "Telegram Images");
            file2.mkdir();
            File file3 = new File(file, "Telegram Video");
            file3.mkdir();
            if (!BuildVars.NO_SCOPED_STORAGE) {
                if (file2.isDirectory()) {
                    new File(file2, ".nomedia").delete();
                }
                if (file3.isDirectory()) {
                    new File(file3, ".nomedia").delete();
                    return;
                }
                return;
            }
            if (file2.isDirectory()) {
                AndroidUtilities.createEmptyFile(new File(file2, ".nomedia"));
            }
            if (file3.isDirectory()) {
                AndroidUtilities.createEmptyFile(new File(file3, ".nomedia"));
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static int getChatSwipeAction(int i) {
        int i2 = chatSwipeAction;
        if (i2 < 0) {
            return !MessagesController.getInstance(i).dialogFilters.isEmpty() ? 5 : 2;
        } else if (i2 == 5 && MessagesController.getInstance(i).dialogFilters.isEmpty()) {
            return 2;
        } else {
            return chatSwipeAction;
        }
    }

    public static void updateChatListSwipeSetting(int i) {
        chatSwipeAction = i;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", chatSwipeAction).apply();
    }

    public static void updateMessageSeenHintCount(int i) {
        messageSeenHintCount = i;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", messageSeenHintCount).apply();
    }

    public static void updateEmojiInteractionsHintCount(int i) {
        emojiInteractionsHintCount = i;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", emojiInteractionsHintCount).apply();
    }

    public static void updateDayNightThemeSwitchHintCount(int i) {
        dayNightThemeSwitchHintCount = i;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", dayNightThemeSwitchHintCount).apply();
    }

    public static int getDevicePerformanceClass() {
        int i = overrideDevicePerformanceClass;
        if (i != -1) {
            return i;
        }
        if (devicePerformanceClass == -1) {
            devicePerformanceClass = measureDevicePerformanceClass();
        }
        return devicePerformanceClass;
    }

    public static int measureDevicePerformanceClass() {
        long j;
        String str;
        int i = Build.VERSION.SDK_INT;
        int i2 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
        int i3 = 0;
        if (i >= 31 && (str = Build.SOC_MODEL) != null) {
            int hashCode = str.toUpperCase().hashCode();
            int i4 = 0;
            while (true) {
                int[] iArr = LOW_SOC;
                if (i4 >= iArr.length) {
                    break;
                } else if (iArr[i4] == hashCode) {
                    return 0;
                } else {
                    i4++;
                }
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(String.format(Locale.ENGLISH, "/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i7)), "r");
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    i6 += Utilities.parseInt((CharSequence) readLine).intValue() / 1000;
                    i5++;
                }
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
        int ceil = i5 == 0 ? -1 : (int) Math.ceil(i6 / i5);
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j = -1;
        }
        if (i >= 21 && i2 > 2 && memoryClass > 100 && ((i2 > 4 || ceil == -1 || ceil > 1250) && ((i2 > 4 || ceil > 1600 || memoryClass > 128 || i > 21) && ((i2 > 4 || ceil > 1300 || memoryClass > 128 || i > 24) && (j == -1 || j >= 2147483648L))))) {
            i3 = (i2 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i2 == 8 && i <= 23)) ? 1 : 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("device performance info selected_class = " + i3 + " (cpu_count = " + i2 + ", freq = " + ceil + ", memoryClass = " + memoryClass + ", android version " + i + ", manufacture " + Build.MANUFACTURER + ", screenRefreshRate=" + AndroidUtilities.screenRefreshRate + ")");
        }
        return i3;
    }

    public static void setMediaColumnsCount(int i) {
        if (mediaColumnsCount != i) {
            mediaColumnsCount = i;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", mediaColumnsCount).apply();
        }
    }

    public static void setFastScrollHintCount(int i) {
        if (fastScrollHintCount != i) {
            fastScrollHintCount = i;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", fastScrollHintCount).apply();
        }
    }

    public static void setDontAskManageStorage(boolean z) {
        dontAskManageStorage = z;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("dontAskManageStorage", dontAskManageStorage).apply();
    }

    public static boolean canBlurChat() {
        return getDevicePerformanceClass() == 2;
    }

    public static boolean chatBlurEnabled() {
        return canBlurChat() && LiteMode.isEnabled(LiteMode.FLAG_CHAT_BLUR);
    }

    /* loaded from: classes.dex */
    public static class BackgroundActivityPrefs {
        private static SharedPreferences prefs;

        public static long getLastCheckedBackgroundActivity() {
            return prefs.getLong("last_checked", 0L);
        }

        public static void setLastCheckedBackgroundActivity(long j) {
            prefs.edit().putLong("last_checked", j).apply();
        }

        public static int getDismissedCount() {
            return prefs.getInt("dismissed_count", 0);
        }

        public static void increaseDismissedCount() {
            prefs.edit().putInt("dismissed_count", getDismissedCount() + 1).apply();
        }
    }

    public static void setAnimationsEnabled(boolean z) {
        animationsEnabled = Boolean.valueOf(z);
    }

    public static boolean animationsEnabled() {
        if (animationsEnabled == null) {
            animationsEnabled = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
        return animationsEnabled.booleanValue();
    }

    public static SharedPreferences getPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0);
    }

    public static boolean deviceIsLow() {
        return getDevicePerformanceClass() == 0;
    }

    public static boolean deviceIsAboveAverage() {
        return getDevicePerformanceClass() >= 1;
    }

    public static boolean deviceIsHigh() {
        return getDevicePerformanceClass() >= 2;
    }

    public static boolean deviceIsAverage() {
        return getDevicePerformanceClass() <= 1;
    }

    public static void toggleRoundCamera() {
        bigCameraForRound = !bigCameraForRound;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", bigCameraForRound).apply();
    }

    @Deprecated
    public static int getLegacyDevicePerformanceClass() {
        if (legacyDevicePerformanceClass == -1) {
            int i = Build.VERSION.SDK_INT;
            int i2 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(String.format(Locale.ENGLISH, "/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i5)), "r");
                    String readLine = randomAccessFile.readLine();
                    if (readLine != null) {
                        i4 += Utilities.parseInt((CharSequence) readLine).intValue() / 1000;
                        i3++;
                    }
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            }
            int ceil = i3 == 0 ? -1 : (int) Math.ceil(i4 / i3);
            if (i < 21 || i2 <= 2 || memoryClass <= 100 || ((i2 <= 4 && ceil != -1 && ceil <= 1250) || ((i2 <= 4 && ceil <= 1600 && memoryClass <= 128 && i <= 21) || (i2 <= 4 && ceil <= 1300 && memoryClass <= 128 && i <= 24)))) {
                legacyDevicePerformanceClass = 0;
            } else if (i2 < 8 || memoryClass <= 160 || ((ceil != -1 && ceil <= 2050) || (ceil == -1 && i2 == 8 && i <= 23))) {
                legacyDevicePerformanceClass = 1;
            } else {
                legacyDevicePerformanceClass = 2;
            }
        }
        return legacyDevicePerformanceClass;
    }
}
