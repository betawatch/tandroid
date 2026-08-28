package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public static boolean adaptableColorInBrowser = false;
    public static boolean allowBigEmoji = false;
    static Boolean allowPreparingHevcPlayers = null;
    public static boolean allowScreenCapture = false;
    private static Boolean animationsEnabled = null;
    public static boolean appLocked = false;
    public static boolean archiveHidden = false;
    public static int autoLockIn = 0;
    public static int badPasscodeTries = 0;
    public static boolean bigCameraForRound = false;
    public static int bubbleRadius = 0;
    public static int callEncryptionHintDisplayedCount = 0;
    public static boolean chatBubbles = false;
    private static int chatSwipeAction = 0;
    private static boolean configLoaded = false;
    public static ProxyInfo currentProxy = null;
    public static int dayNightThemeSwitchHintCount = 0;
    public static int dayNightWallpaperSwitchHint = 0;
    public static boolean debugVideoQualities = false;
    public static boolean debugViewMetrics = false;
    public static boolean debugWebView = false;
    private static int devicePerformanceClass = 0;
    public static boolean directShare = false;
    public static String directShareHash = null;
    public static boolean disableVoiceAudioEffects = false;
    public static int distanceSystemType = 0;
    public static boolean dontAskManageStorage = false;
    public static boolean drawActionBarShadow = false;
    public static boolean drawDialogIcons = false;
    public static int emojiInteractionsHintCount = 0;
    public static int fastScrollHintCount = 0;
    public static boolean fastWallpaperDisabled = false;
    public static int fontSize = 0;
    public static boolean fontSizeIsDefault = false;
    public static boolean forceDisableTabletMode = false;
    public static boolean forceForumTabs = false;
    public static boolean forwardingOptionsHintShown = false;
    public static boolean frameMetricsEnabled = false;
    private static String goodHevcEncoder = null;
    public static boolean hasCameraCache = false;
    public static boolean hasEmailLogin = false;
    private static HashSet<String> hevcEncoderWhitelist = null;
    public static boolean inappCamera = false;
    public static boolean isFloatingDebugActive = false;
    public static boolean isWaitingForPasscodeEnter = false;
    public static int ivFontSize = 0;
    public static int keepMedia = 0;
    public static int lastKeepMediaCheckTime = 0;
    private static int lastLocalId = 0;
    public static int lastLogsCheckTime = 0;
    public static int lastPauseTime = 0;
    public static long lastUpdateCheckTime = 0;
    public static long lastUptimeMillis = 0;
    private static int legacyDevicePerformanceClass = -1;
    public static LiteMode liteMode;
    private static final Object localIdSync;
    public static int lockRecordAudioVideoHint;
    public static int mapPreviewType;
    public static int mediaColumnsCount;
    public static int messageSeenHintCount;
    public static boolean multipleReactionsPromoShowed;
    public static boolean nextMediaTap;
    public static boolean noSoundHintShowed;
    public static boolean noiseSupression;
    public static boolean onlyLocalInstantView;
    private static int overrideDevicePerformanceClass;
    public static String passcodeHash;
    public static long passcodeRetryInMs;
    public static byte[] passcodeSalt;
    public static int passcodeType;
    public static int passportConfigHash;
    private static String passportConfigJson;
    private static HashMap<String, String> passportConfigMap;
    public static boolean pauseMusicOnMedia;
    public static boolean pauseMusicOnRecord;
    public static boolean payByInvoice;
    public static TLRPC.TL_help_appUpdate pendingAppUpdate;
    public static int pendingAppUpdateBuildVersion;
    public static boolean photoHighQualityDefault;
    public static boolean photoLiveDefault;
    public static boolean photoViewerBlur;
    public static boolean playOrderReversed;
    public static ArrayList<ProxyInfo> proxyList;
    private static boolean proxyListLoaded;
    public static boolean proxyRotationEnabled;
    public static int proxyRotationTimeout;
    public static byte[] pushAuthKey;
    public static byte[] pushAuthKeyId;
    public static boolean pushStatSent;
    public static String pushString;
    public static long pushStringGetTimeEnd;
    public static long pushStringGetTimeStart;
    public static String pushStringStatus;
    public static int pushType;
    public static boolean raiseToListen;
    public static boolean raiseToSpeak;
    public static boolean readOnlyStorageDirAlertShowed;
    public static boolean recordViaSco;
    public static int repeatMode;
    public static boolean replyingOptionsHintShown;
    public static boolean roundCamera16to9;
    public static boolean saveIncomingPhotos;
    public static boolean saveStreamMedia;
    public static long scheduledHintSeenAt;
    public static int scheduledHintShows;
    public static long scheduledOrNoSoundHintSeenAt;
    public static int scheduledOrNoSoundHintShows;
    public static String searchEngineCustomURLAutocomplete;
    public static String searchEngineCustomURLQuery;
    public static int searchEngineType;
    public static boolean searchMessagesAsListUsed;
    public static boolean shadowsInSections;
    public static boolean showNotificationsForAllAccounts;
    public static boolean shuffleMusic;
    public static boolean sortContactsByName;
    public static boolean sortFilesByName;
    public static int stealthModeSendMessageConfirm;
    public static boolean stickersReorderingHintUsed;
    public static String storageCacheDir;
    public static int storiesColumnsCount;
    public static boolean storiesIntroShown;
    public static boolean storyReactionsLongPressHint;
    public static boolean streamAllVideo;
    public static boolean streamMedia;
    public static boolean streamMkv;
    public static boolean suggestAnimatedEmoji;
    public static int suggestStickers;
    private static final Object sync;
    public static int textSelectionHintShows;
    public static boolean updateStickersOrderOnSend;
    public static Boolean useCamera2Force;
    public static boolean useFaceLock;
    public static boolean useFingerprintLock;
    public static boolean useNewBlur;
    public static boolean useSurfaceInStories;
    public static boolean useSystemBoldFont;
    public static boolean useSystemEmoji;
    public static boolean useThreeLinesLayout;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class BackgroundActivityPrefs {
        private static SharedPreferences prefs;

        public static int getDismissedCount() {
            return prefs.getInt("dismissed_count", 0);
        }

        public static long getLastCheckedBackgroundActivity() {
            return prefs.getLong("last_checked", 0L);
        }

        public static void increaseDismissedCount() {
            prefs.edit().putInt("dismissed_count", getDismissedCount() + 1).apply();
        }

        public static void setLastCheckedBackgroundActivity(long j10) {
            prefs.edit().putLong("last_checked", j10).apply();
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PasscodeType {
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PerformanceClass {
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

        public ProxyInfo(String str, int i9, String str2, String str3, String str4) {
            this.address = str;
            this.port = i9;
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
            StringBuilder sb2 = new StringBuilder(!TextUtils.isEmpty(this.secret) ? "https://t.me/proxy?" : "https://t.me/socks?");
            try {
                sb2.append("server=");
                sb2.append(URLEncoder.encode(this.address, "UTF-8"));
                sb2.append("&");
                sb2.append("port=");
                sb2.append(this.port);
                if (!TextUtils.isEmpty(this.username)) {
                    sb2.append("&user=");
                    sb2.append(URLEncoder.encode(this.username, "UTF-8"));
                }
                if (!TextUtils.isEmpty(this.password)) {
                    sb2.append("&pass=");
                    sb2.append(URLEncoder.encode(this.password, "UTF-8"));
                }
                if (!TextUtils.isEmpty(this.secret)) {
                    sb2.append("&secret=");
                    sb2.append(URLEncoder.encode(this.secret, "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return sb2.toString();
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hevcEncoderWhitelist = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hevcEncoderWhitelist.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        pushType = 2;
        pushString = "";
        pushStringStatus = "";
        passcodeHash = "";
        passcodeSalt = new byte[0];
        autoLockIn = 3600;
        useFingerprintLock = true;
        useFaceLock = true;
        keepMedia = CacheByChatsController.KEEP_MEDIA_ONE_MONTH;
        updateStickersOrderOnSend = true;
        photoViewerBlur = true;
        stealthModeSendMessageConfirm = 2;
        lastLocalId = -210000;
        passportConfigJson = "";
        sync = new Object();
        localIdSync = new Object();
        mapPreviewType = 2;
        searchEngineType = 0;
        chatBubbles = Build.VERSION.SDK_INT >= 30;
        raiseToSpeak = false;
        raiseToListen = true;
        nextMediaTap = true;
        recordViaSco = false;
        adaptableColorInBrowser = true;
        onlyLocalInstantView = false;
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
        debugVideoQualities = false;
        fontSize = 16;
        bubbleRadius = 17;
        ivFontSize = 16;
        mediaColumnsCount = 3;
        storiesColumnsCount = 3;
        fastScrollHintCount = 3;
        LOW_SOC = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        loadConfig();
        proxyList = new ArrayList<>();
        drawActionBarShadow = true;
    }

    public static ProxyInfo addProxy(ProxyInfo proxyInfo) {
        loadProxyList();
        int size = proxyList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ProxyInfo proxyInfo2 = proxyList.get(i9);
            if (proxyInfo.address.equals(proxyInfo2.address) && proxyInfo.port == proxyInfo2.port && proxyInfo.username.equals(proxyInfo2.username) && proxyInfo.password.equals(proxyInfo2.password) && proxyInfo.secret.equals(proxyInfo2.secret)) {
                return proxyInfo2;
            }
        }
        proxyList.add(0, proxyInfo);
        saveProxyList();
        return proxyInfo;
    }

    public static boolean allowPreparingHevcPlayers() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        if (allowPreparingHevcPlayers == null) {
            int codecCount = MediaCodecList.getCodecCount();
            int i9 = 0;
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (!codecInfoAt.isEncoder()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= codecInfoAt.getSupportedTypes().length) {
                            break;
                        }
                        if (codecInfoAt.getSupportedTypes()[i11].contains("video/hevc")) {
                            int maxSupportedInstances = codecInfoAt.getCapabilitiesForType("video/hevc").getMaxSupportedInstances();
                            if (maxSupportedInstances > i9) {
                                i9 = maxSupportedInstances;
                            }
                        } else {
                            i11++;
                        }
                    }
                }
            }
            allowPreparingHevcPlayers = Boolean.valueOf(i9 >= 8);
        }
        return allowPreparingHevcPlayers.booleanValue();
    }

    public static boolean animationsEnabled() {
        if (animationsEnabled == null) {
            animationsEnabled = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
        return animationsEnabled.booleanValue();
    }

    public static int buildVersion() {
        try {
            return ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            FileLog.e(e10);
            return 0;
        }
    }

    public static boolean canBlurChat() {
        return getDevicePerformanceClass() >= (Build.VERSION.SDK_INT >= 31 ? 1 : 2) || BuildVars.DEBUG_PRIVATE_VERSION;
    }

    public static boolean chatBlurEnabled() {
        return canBlurChat() && LiteMode.isEnabled(256);
    }

    public static void checkLogsToDelete() {
        if (BuildVars.LOGS_ENABLED) {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis - lastLogsCheckTime) < 3600) {
                return;
            }
            lastLogsCheckTime = currentTimeMillis;
            Utilities.cacheClearQueue.postRunnable(new mh.k2(currentTimeMillis, 6));
        }
    }

    public static boolean checkPasscode(String str) {
        if (passcodeSalt.length != 0) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(passcodeSalt, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(passcodeSalt, 0, bArr, bytes.length + 16, 16);
                return passcodeHash.equals(Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length)));
            } catch (Exception e10) {
                FileLog.e(e10);
                return false;
            }
        }
        boolean equals = Utilities.MD5(str).equals(passcodeHash);
        if (equals) {
            try {
                passcodeSalt = new byte[16];
                Utilities.random.nextBytes(passcodeSalt);
                byte[] bytes2 = str.getBytes("UTF-8");
                int length2 = bytes2.length + 32;
                byte[] bArr2 = new byte[length2];
                System.arraycopy(passcodeSalt, 0, bArr2, 0, 16);
                System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
                System.arraycopy(passcodeSalt, 0, bArr2, bytes2.length + 16, 16);
                passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr2, 0, length2));
                saveConfig();
                return equals;
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        return equals;
    }

    public static void checkSaveToGalleryFiles() {
        Utilities.globalQueue.postRunnable(new w1(21));
    }

    public static void checkSdCard(File file) {
        if (file == null || storageCacheDir == null || readOnlyStorageDirAlertShowed || !file.getPath().startsWith(storageCacheDir)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new w1(20));
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
        useFingerprintLock = true;
        isWaitingForPasscodeEnter = false;
        allowScreenCapture = false;
        textSelectionHintShows = 0;
        scheduledOrNoSoundHintShows = 0;
        scheduledOrNoSoundHintSeenAt = 0L;
        scheduledHintShows = 0;
        scheduledHintSeenAt = 0L;
        lockRecordAudioVideoHint = 0;
        forwardingOptionsHintShown = false;
        replyingOptionsHintShown = false;
        messageSeenHintCount = 3;
        emojiInteractionsHintCount = 3;
        dayNightThemeSwitchHintCount = 3;
        stealthModeSendMessageConfirm = 2;
        dayNightWallpaperSwitchHint = 0;
        saveConfig();
    }

    public static void deleteProxy(ProxyInfo proxyInfo) {
        if (currentProxy == proxyInfo) {
            currentProxy = null;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            edit.putString("proxy_ip", "");
            edit.putString("proxy_pass", "");
            edit.putString("proxy_user", "");
            edit.putString("proxy_secret", "");
            edit.putInt("proxy_port", 1080);
            edit.putBoolean("proxy_enabled", false);
            edit.putBoolean("proxy_enabled_calls", false);
            edit.apply();
            if (z10) {
                ConnectionsManager.setProxySettings(false, "", 0, "", "", "");
            }
        }
        proxyList.remove(proxyInfo);
        saveProxyList();
    }

    public static boolean deviceIsAboveAverage() {
        return getDevicePerformanceClass() >= 1;
    }

    public static boolean deviceIsAverage() {
        return getDevicePerformanceClass() <= 1;
    }

    public static boolean deviceIsHigh() {
        return getDevicePerformanceClass() >= 2;
    }

    public static boolean deviceIsLow() {
        return getDevicePerformanceClass() == 0;
    }

    public static boolean enabledRaiseTo(boolean z10) {
        if (raiseToListen) {
            return !z10 || raiseToSpeak;
        }
        return false;
    }

    public static String findGoodHevcEncoder() {
        if (goodHevcEncoder == null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i9 = 0; i9 < codecCount; i9++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i9);
                if (codecInfoAt.isEncoder()) {
                    for (int i10 = 0; i10 < codecInfoAt.getSupportedTypes().length; i10++) {
                        if (codecInfoAt.getSupportedTypes()[i10].contains("video/hevc") && codecInfoAt.isHardwareAccelerated() && isWhitelisted(codecInfoAt)) {
                            String name = codecInfoAt.getName();
                            goodHevcEncoder = name;
                            return name;
                        }
                    }
                }
            }
            goodHevcEncoder = "";
        }
        if (TextUtils.isEmpty(goodHevcEncoder)) {
            return null;
        }
        return goodHevcEncoder;
    }

    public static void forwardingOptionsHintHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        forwardingOptionsHintShown = true;
        edit.putBoolean("forwardingOptionsHintShown", true);
        edit.apply();
    }

    public static int getChatSwipeAction(int i9) {
        int i10 = chatSwipeAction;
        if (i10 < 0) {
            return !MessagesController.getInstance(i9).dialogFilters.isEmpty() ? 5 : 2;
        }
        if (i10 == 5 && MessagesController.getInstance(i9).dialogFilters.isEmpty()) {
            return 2;
        }
        return chatSwipeAction;
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

    public static int getDevicePerformanceClass() {
        int i9 = overrideDevicePerformanceClass;
        if (i9 != -1) {
            return i9;
        }
        if (devicePerformanceClass == -1) {
            devicePerformanceClass = measureDevicePerformanceClass();
        }
        return devicePerformanceClass;
    }

    public static int getLastLocalId() {
        int i9;
        synchronized (localIdSync) {
            i9 = lastLocalId;
            lastLocalId = i9 - 1;
        }
        return i9;
    }

    @Deprecated
    public static int getLegacyDevicePerformanceClass() {
        if (legacyDevicePerformanceClass == -1) {
            int i9 = Build.VERSION.SDK_INT;
            int i10 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                try {
                    Locale locale = Locale.ENGLISH;
                    RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_max_freq", "r");
                    String readLine = randomAccessFile.readLine();
                    if (readLine != null) {
                        i12 += Utilities.parseInt((CharSequence) readLine).intValue() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                        i11++;
                    }
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            }
            int ceil = i11 == 0 ? -1 : (int) Math.ceil(i12 / i11);
            if (i10 <= 2 || memoryClass <= 100 || ((i10 <= 4 && ceil != -1 && ceil <= 1250) || ((i10 <= 4 && ceil <= 1600 && memoryClass <= 128 && i9 <= 21) || (i10 <= 4 && ceil <= 1300 && memoryClass <= 128 && i9 <= 24)))) {
                legacyDevicePerformanceClass = 0;
            } else if (i10 < 8 || memoryClass <= 160 || ((ceil != -1 && ceil <= 2050) || (ceil == -1 && i10 == 8 && i9 <= 23))) {
                legacyDevicePerformanceClass = 1;
            } else {
                legacyDevicePerformanceClass = 2;
            }
        }
        return legacyDevicePerformanceClass;
    }

    public static SharedPreferences getPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0);
    }

    public static void increaseBadPasscodeTries() {
        int i9 = badPasscodeTries + 1;
        badPasscodeTries = i9;
        if (i9 >= 3) {
            if (i9 == 3) {
                passcodeRetryInMs = 5000L;
            } else if (i9 == 4) {
                passcodeRetryInMs = 10000L;
            } else if (i9 == 5) {
                passcodeRetryInMs = 15000L;
            } else if (i9 == 6) {
                passcodeRetryInMs = 20000L;
            } else if (i9 != 7) {
                passcodeRetryInMs = 30000L;
            } else {
                passcodeRetryInMs = 25000L;
            }
            lastUptimeMillis = SystemClock.elapsedRealtime();
        }
        saveConfig();
    }

    public static void increaseDayNightWallpaperSiwtchHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i9 = dayNightWallpaperSwitchHint + 1;
        dayNightWallpaperSwitchHint = i9;
        edit.putInt("dayNightWallpaperSwitchHint", i9);
        edit.apply();
    }

    public static void increaseLockRecordAudioVideoHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i9 = lockRecordAudioVideoHint + 1;
        lockRecordAudioVideoHint = i9;
        edit.putInt("lockRecordAudioVideoHint", i9);
        edit.apply();
    }

    public static void increaseScheduledHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        scheduledHintSeenAt = System.currentTimeMillis();
        int i9 = scheduledHintShows + 1;
        scheduledHintShows = i9;
        edit.putInt("scheduledHintShows", i9);
        edit.putLong("scheduledHintSeenAt", scheduledHintSeenAt);
        edit.apply();
    }

    public static void increaseScheduledOrNoSoundHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        scheduledOrNoSoundHintSeenAt = System.currentTimeMillis();
        int i9 = scheduledOrNoSoundHintShows + 1;
        scheduledOrNoSoundHintShows = i9;
        edit.putInt("scheduledOrNoSoundHintShows", i9);
        edit.putLong("scheduledOrNoSoundHintSeenAt", scheduledOrNoSoundHintSeenAt);
        edit.apply();
    }

    public static void increaseTextSelectionHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i9 = textSelectionHintShows + 1;
        textSelectionHintShows = i9;
        edit.putInt("textSelectionHintShows", i9);
        edit.apply();
    }

    public static void incrementCallEncryptionHintDisplayed(int i9) {
        callEncryptionHintDisplayedCount += i9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("callEncryptionHintDisplayedCount", callEncryptionHintDisplayedCount);
        edit.apply();
    }

    public static boolean isAppUpdateAvailable() {
        int buildVersion;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = pendingAppUpdate;
        if (tL_help_appUpdate == null || tL_help_appUpdate.document == null || !ApplicationLoader.isStandaloneBuild()) {
            return false;
        }
        try {
            buildVersion = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            FileLog.e(e10);
            buildVersion = buildVersion();
        }
        return pendingAppUpdateBuildVersion == buildVersion;
    }

    public static boolean isAutoplayGifs() {
        return LiteMode.isEnabled(2048);
    }

    public static boolean isAutoplayVideo() {
        return LiteMode.isEnabled(1024);
    }

    public static boolean isPassportConfigLoaded() {
        return passportConfigMap != null;
    }

    public static boolean isProxyEnabled() {
        return MessagesController.getGlobalMainSettings().getBoolean("proxy_enabled", false) && currentProxy != null;
    }

    public static boolean isSecretMapPreviewSet() {
        return MessagesController.getGlobalMainSettings().contains("mapPreviewType");
    }

    public static boolean isUsingCamera2(int i9) {
        Boolean bool = useCamera2Force;
        return bool == null ? !MessagesController.getInstance(i9).androidDisableRoundCamera2 : bool.booleanValue();
    }

    private static boolean isWhitelisted(MediaCodecInfo mediaCodecInfo) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return true;
        }
        return hevcEncoderWhitelist.contains(mediaCodecInfo.getName().toLowerCase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkLogsToDelete$3(int i9) {
        File logsDir;
        long j10 = i9 - 864000;
        try {
            logsDir = AndroidUtilities.getLogsDir();
        } catch (Throwable th) {
            FileLog.e(th);
        }
        if (logsDir == null) {
            return;
        }
        Utilities.clearDir(logsDir.getAbsolutePath(), 0, j10, false);
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("lastLogsCheckTime", lastLogsCheckTime);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkSaveToGalleryFiles$5() {
        try {
            File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
            File file2 = new File(file, "Telegram Images");
            file2.mkdir();
            File file3 = new File(file, "Telegram Video");
            file3.mkdir();
            if (BuildVars.NO_SCOPED_STORAGE) {
                if (file2.isDirectory()) {
                    AndroidUtilities.createEmptyFile(new File(file2, ".nomedia"));
                }
                if (file3.isDirectory()) {
                    AndroidUtilities.createEmptyFile(new File(file3, ".nomedia"));
                    return;
                }
                return;
            }
            if (file2.isDirectory()) {
                new File(file2, ".nomedia").delete();
            }
            if (file3.isDirectory()) {
                new File(file3, ".nomedia").delete();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$checkSdCard$2() {
        org.telegram.ui.ActionBar.o2 R;
        if (readOnlyStorageDirAlertShowed || (R = LaunchActivity.R()) == null || R.getParentActivity() == null) {
            return;
        }
        storageCacheDir = null;
        saveConfig();
        ImageLoader.getInstance().checkMediaPaths(new w1(19));
        readOnlyStorageDirAlertShowed = true;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.SdCardError);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.SdCardErrorDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.DoNotUseSDCard), new rg());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.setCanceledOnTouchOutside(false);
        c2Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$saveProxyList$4(ProxyInfo proxyInfo, ProxyInfo proxyInfo2) {
        ProxyInfo proxyInfo3 = currentProxy;
        long j10 = proxyInfo3 == proxyInfo ? -200000L : 0L;
        if (!proxyInfo.available) {
            j10 += 100000;
        }
        long j11 = proxyInfo3 == proxyInfo2 ? -200000L : 0L;
        if (!proxyInfo2.available) {
            j11 += 100000;
        }
        return Long.compare(proxyInfo.ping + j10, proxyInfo2.ping + j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x02b0 A[Catch: all -> 0x00f3, TryCatch #1 {all -> 0x00f3, Exception -> 0x0164, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x00ec, B:12:0x00f6, B:14:0x00fe, B:16:0x0102, B:17:0x010f, B:19:0x011e, B:20:0x0129, B:22:0x0135, B:24:0x013d, B:26:0x014f, B:27:0x0166, B:57:0x016a, B:59:0x017c, B:61:0x0189, B:63:0x018f, B:64:0x0191, B:66:0x0195, B:68:0x019b, B:70:0x01a1, B:72:0x01a5, B:76:0x0183, B:29:0x01b5, B:31:0x021b, B:34:0x0227, B:36:0x024c, B:39:0x0257, B:41:0x02b0, B:42:0x02b2, B:45:0x0481, B:48:0x048f, B:49:0x04f7, B:53:0x0476, B:82:0x01b2, B:83:0x0125, B:84:0x04f9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0476 A[Catch: all -> 0x00f3, TryCatch #1 {all -> 0x00f3, Exception -> 0x0164, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x00ec, B:12:0x00f6, B:14:0x00fe, B:16:0x0102, B:17:0x010f, B:19:0x011e, B:20:0x0129, B:22:0x0135, B:24:0x013d, B:26:0x014f, B:27:0x0166, B:57:0x016a, B:59:0x017c, B:61:0x0189, B:63:0x018f, B:64:0x0191, B:66:0x0195, B:68:0x019b, B:70:0x01a1, B:72:0x01a5, B:76:0x0183, B:29:0x01b5, B:31:0x021b, B:34:0x0227, B:36:0x024c, B:39:0x0257, B:41:0x02b0, B:42:0x02b2, B:45:0x0481, B:48:0x048f, B:49:0x04f7, B:53:0x0476, B:82:0x01b2, B:83:0x0125, B:84:0x04f9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189 A[Catch: all -> 0x00f3, Exception -> 0x0164, Merged into TryCatch #1 {all -> 0x00f3, Exception -> 0x0164, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x00ec, B:12:0x00f6, B:14:0x00fe, B:16:0x0102, B:17:0x010f, B:19:0x011e, B:20:0x0129, B:22:0x0135, B:24:0x013d, B:26:0x014f, B:27:0x0166, B:57:0x016a, B:59:0x017c, B:61:0x0189, B:63:0x018f, B:64:0x0191, B:66:0x0195, B:68:0x019b, B:70:0x01a1, B:72:0x01a5, B:76:0x0183, B:29:0x01b5, B:31:0x021b, B:34:0x0227, B:36:0x024c, B:39:0x0257, B:41:0x02b0, B:42:0x02b2, B:45:0x0481, B:48:0x048f, B:49:0x04f7, B:53:0x0476, B:82:0x01b2, B:83:0x0125, B:84:0x04f9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f A[Catch: all -> 0x00f3, Exception -> 0x0164, Merged into TryCatch #1 {all -> 0x00f3, Exception -> 0x0164, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x00ec, B:12:0x00f6, B:14:0x00fe, B:16:0x0102, B:17:0x010f, B:19:0x011e, B:20:0x0129, B:22:0x0135, B:24:0x013d, B:26:0x014f, B:27:0x0166, B:57:0x016a, B:59:0x017c, B:61:0x0189, B:63:0x018f, B:64:0x0191, B:66:0x0195, B:68:0x019b, B:70:0x01a1, B:72:0x01a5, B:76:0x0183, B:29:0x01b5, B:31:0x021b, B:34:0x0227, B:36:0x024c, B:39:0x0257, B:41:0x02b0, B:42:0x02b2, B:45:0x0481, B:48:0x048f, B:49:0x04f7, B:53:0x0476, B:82:0x01b2, B:83:0x0125, B:84:0x04f9), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void loadConfig() {
        SharedPreferences sharedPreferences;
        int i9;
        String str;
        String str2;
        synchronized (sync) {
            try {
            } catch (Exception e10) {
                FileLog.e(e10);
            } finally {
            }
            if (!configLoaded && ApplicationLoader.applicationContext != null) {
                SharedPreferences unused = BackgroundActivityPrefs.prefs = ApplicationLoader.applicationContext.getSharedPreferences("background_activity", 0);
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0);
                saveIncomingPhotos = sharedPreferences2.getBoolean("saveIncomingPhotos", false);
                passcodeHash = sharedPreferences2.getString("passcodeHash1", "");
                appLocked = sharedPreferences2.getBoolean("appLocked", false);
                passcodeType = sharedPreferences2.getInt("passcodeType", 0);
                passcodeRetryInMs = sharedPreferences2.getLong("passcodeRetryInMs", 0L);
                lastUptimeMillis = sharedPreferences2.getLong("lastUptimeMillis", 0L);
                badPasscodeTries = sharedPreferences2.getInt("badPasscodeTries", 0);
                autoLockIn = sharedPreferences2.getInt("autoLockIn", 3600);
                lastPauseTime = sharedPreferences2.getInt("lastPauseTime", 0);
                useFingerprintLock = sharedPreferences2.getBoolean("useFingerprint", true);
                allowScreenCapture = sharedPreferences2.getBoolean("allowScreenCapture", false);
                lastLocalId = sharedPreferences2.getInt("lastLocalId", -210000);
                pushString = sharedPreferences2.getString("pushString2", "");
                pushType = sharedPreferences2.getInt("pushType", 2);
                pushStatSent = sharedPreferences2.getBoolean("pushStatSent", false);
                passportConfigJson = sharedPreferences2.getString("passportConfigJson", "");
                passportConfigHash = sharedPreferences2.getInt("passportConfigHash", 0);
                Boolean bool = null;
                storageCacheDir = sharedPreferences2.getString("storageCacheDir", null);
                proxyRotationEnabled = sharedPreferences2.getBoolean("proxyRotationEnabled", false);
                proxyRotationTimeout = sharedPreferences2.getInt("proxyRotationTimeout", 1);
                String string = sharedPreferences2.getString("pushAuthKey", null);
                if (!TextUtils.isEmpty(string)) {
                    pushAuthKey = Base64.decode(string, 0);
                }
                if (passcodeHash.length() > 0 && lastPauseTime == 0) {
                    lastPauseTime = (int) ((SystemClock.elapsedRealtime() / 1000) - 600);
                }
                String string2 = sharedPreferences2.getString("passcodeSalt", "");
                if (string2.length() > 0) {
                    passcodeSalt = Base64.decode(string2, 0);
                } else {
                    passcodeSalt = new byte[0];
                }
                lastUpdateCheckTime = sharedPreferences2.getLong("appUpdateCheckTime", System.currentTimeMillis());
                String string3 = sharedPreferences2.getString("appUpdate", null);
                if (string3 != null) {
                    pendingAppUpdateBuildVersion = sharedPreferences2.getInt("appUpdateBuild", buildVersion());
                    byte[] decode = Base64.decode(string3, 0);
                    if (decode != null) {
                        SerializedData serializedData = new SerializedData(decode);
                        pendingAppUpdate = (TLRPC.TL_help_appUpdate) TLRPC.help_AppUpdate.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                        serializedData.cleanup();
                    }
                }
                if (pendingAppUpdate != null) {
                    try {
                        PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                        i9 = packageInfo.versionCode;
                        try {
                            str = packageInfo.versionName;
                        } catch (Exception e11) {
                            e = e11;
                            FileLog.e(e);
                            str = null;
                            if (i9 == 0) {
                            }
                            if (str == null) {
                            }
                            if (pendingAppUpdateBuildVersion == i9) {
                            }
                            pendingAppUpdate = null;
                            AndroidUtilities.runOnUIThread(new w1(18));
                            sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                            SaveToGallerySettingsHelper.load(sharedPreferences);
                            mapPreviewType = sharedPreferences.getInt("mapPreviewType", 2);
                            searchEngineType = sharedPreferences.getInt("searchEngineType", 0);
                            raiseToListen = sharedPreferences.getBoolean("raise_to_listen", true);
                            raiseToSpeak = sharedPreferences.getBoolean("raise_to_speak", false);
                            nextMediaTap = sharedPreferences.getBoolean("next_media_on_tap", true);
                            recordViaSco = sharedPreferences.getBoolean("record_via_sco", false);
                            adaptableColorInBrowser = sharedPreferences.getBoolean("adaptableBrowser", false);
                            onlyLocalInstantView = sharedPreferences.getBoolean("onlyLocalInstantView", BuildVars.DEBUG_PRIVATE_VERSION);
                            directShare = sharedPreferences.getBoolean("direct_share", true);
                            boolean z10 = sharedPreferences.getBoolean("shuffleMusic", false);
                            shuffleMusic = z10;
                            playOrderReversed = z10 && sharedPreferences.getBoolean("playOrderReversed", false);
                            inappCamera = sharedPreferences.getBoolean("inappCamera", true);
                            hasCameraCache = sharedPreferences.contains("cameraCache");
                            roundCamera16to9 = true;
                            repeatMode = sharedPreferences.getInt("repeatMode", 0);
                            fontSize = sharedPreferences.getInt("fons_size", (AndroidUtilities.isTablet() || AndroidUtilities.isFold()) ? 16 : 18);
                            fontSizeIsDefault = !sharedPreferences.contains("fons_size");
                            bubbleRadius = sharedPreferences.getInt("bubbleRadius", 17);
                            ivFontSize = sharedPreferences.getInt("iv_font_size", fontSize);
                            allowBigEmoji = sharedPreferences.getBoolean("allowBigEmoji", true);
                            useSystemEmoji = sharedPreferences.getBoolean("useSystemEmoji", false);
                            useSystemBoldFont = sharedPreferences.getBoolean("useSystemBoldFont", false);
                            forceForumTabs = sharedPreferences.getBoolean("forceForumTabs", false);
                            fastWallpaperDisabled = sharedPreferences.getBoolean("fastWallpaperDisabled", false);
                            frameMetricsEnabled = sharedPreferences.getBoolean("frameMetricsEnabled", false);
                            if (useSystemBoldFont) {
                            }
                            streamMedia = sharedPreferences.getBoolean("streamMedia", true);
                            saveStreamMedia = sharedPreferences.getBoolean("saveStreamMedia", true);
                            pauseMusicOnRecord = sharedPreferences.getBoolean("pauseMusicOnRecord", true);
                            pauseMusicOnMedia = sharedPreferences.getBoolean("pauseMusicOnMedia", false);
                            forceDisableTabletMode = sharedPreferences.getBoolean("forceDisableTabletMode", false);
                            streamAllVideo = sharedPreferences.getBoolean("streamAllVideo", BuildVars.DEBUG_VERSION);
                            streamMkv = sharedPreferences.getBoolean("streamMkv", false);
                            suggestStickers = sharedPreferences.getInt("suggestStickers", 0);
                            suggestAnimatedEmoji = sharedPreferences.getBoolean("suggestAnimatedEmoji", true);
                            overrideDevicePerformanceClass = sharedPreferences.getInt("overrideDevicePerformanceClass", -1);
                            devicePerformanceClass = sharedPreferences.getInt("devicePerformanceClass", -1);
                            sortContactsByName = sharedPreferences.getBoolean("sortContactsByName", false);
                            sortFilesByName = sharedPreferences.getBoolean("sortFilesByName", false);
                            noSoundHintShowed = sharedPreferences.getBoolean("noSoundHintShowed", false);
                            directShareHash = sharedPreferences.getString("directShareHash2", null);
                            useThreeLinesLayout = sharedPreferences.getBoolean("useThreeLinesLayout", false);
                            archiveHidden = sharedPreferences.getBoolean("archiveHidden", false);
                            distanceSystemType = sharedPreferences.getInt("distanceSystemType", 0);
                            keepMedia = sharedPreferences.getInt("keep_media", CacheByChatsController.KEEP_MEDIA_ONE_MONTH);
                            debugWebView = sharedPreferences.getBoolean("debugWebView", false);
                            lastKeepMediaCheckTime = sharedPreferences.getInt("lastKeepMediaCheckTime", 0);
                            lastLogsCheckTime = sharedPreferences.getInt("lastLogsCheckTime", 0);
                            searchMessagesAsListUsed = sharedPreferences.getBoolean("searchMessagesAsListUsed", false);
                            stickersReorderingHintUsed = sharedPreferences.getBoolean("stickersReorderingHintUsed", false);
                            storyReactionsLongPressHint = sharedPreferences.getBoolean("storyReactionsLongPressHint", false);
                            storiesIntroShown = sharedPreferences.getBoolean("storiesIntroShown", false);
                            textSelectionHintShows = sharedPreferences.getInt("textSelectionHintShows", 0);
                            scheduledOrNoSoundHintShows = sharedPreferences.getInt("scheduledOrNoSoundHintShows", 0);
                            scheduledOrNoSoundHintSeenAt = sharedPreferences.getLong("scheduledOrNoSoundHintSeenAt", 0L);
                            scheduledHintShows = sharedPreferences.getInt("scheduledHintShows", 0);
                            scheduledHintSeenAt = sharedPreferences.getLong("scheduledHintSeenAt", 0L);
                            forwardingOptionsHintShown = sharedPreferences.getBoolean("forwardingOptionsHintShown", false);
                            replyingOptionsHintShown = sharedPreferences.getBoolean("replyingOptionsHintShown", false);
                            lockRecordAudioVideoHint = sharedPreferences.getInt("lockRecordAudioVideoHint", 0);
                            disableVoiceAudioEffects = sharedPreferences.getBoolean("disableVoiceAudioEffects", false);
                            noiseSupression = sharedPreferences.getBoolean("noiseSupression", false);
                            chatSwipeAction = sharedPreferences.getInt("ChatSwipeAction", -1);
                            messageSeenHintCount = sharedPreferences.getInt("messageSeenCount", 3);
                            emojiInteractionsHintCount = sharedPreferences.getInt("emojiInteractionsHintCount", 3);
                            dayNightThemeSwitchHintCount = sharedPreferences.getInt("dayNightThemeSwitchHintCount", 3);
                            stealthModeSendMessageConfirm = sharedPreferences.getInt("stealthModeSendMessageConfirm", 2);
                            mediaColumnsCount = sharedPreferences.getInt("mediaColumnsCount", 3);
                            storiesColumnsCount = sharedPreferences.getInt("storiesColumnsCount", 3);
                            fastScrollHintCount = sharedPreferences.getInt("fastScrollHintCount", 3);
                            dontAskManageStorage = sharedPreferences.getBoolean("dontAskManageStorage", false);
                            hasEmailLogin = sharedPreferences.getBoolean("hasEmailLogin", false);
                            isFloatingDebugActive = sharedPreferences.getBoolean("floatingDebugActive", false);
                            updateStickersOrderOnSend = sharedPreferences.getBoolean("updateStickersOrderOnSend", true);
                            dayNightWallpaperSwitchHint = sharedPreferences.getInt("dayNightWallpaperSwitchHint", 0);
                            bigCameraForRound = sharedPreferences.getBoolean("bigCameraForRound", false);
                            useNewBlur = sharedPreferences.getBoolean("useNewBlur", true);
                            if (!sharedPreferences.contains("useCamera2Force_2")) {
                            }
                            useCamera2Force = bool;
                            useSurfaceInStories = sharedPreferences.getBoolean("useSurfaceInStories", Build.VERSION.SDK_INT < 30);
                            payByInvoice = sharedPreferences.getBoolean("payByInvoice", false);
                            photoViewerBlur = sharedPreferences.getBoolean("photoViewerBlur", true);
                            multipleReactionsPromoShowed = sharedPreferences.getBoolean("multipleReactionsPromoShowed", false);
                            callEncryptionHintDisplayedCount = sharedPreferences.getInt("callEncryptionHintDisplayedCount", 0);
                            debugVideoQualities = sharedPreferences.getBoolean("debugVideoQualities", false);
                            shadowsInSections = sharedPreferences.getBoolean("shadowsInSections", false);
                            debugViewMetrics = sharedPreferences.getBoolean("debugViewMetrics", false);
                            photoHighQualityDefault = sharedPreferences.getBoolean("photoHighQualityDefault", false);
                            photoLiveDefault = sharedPreferences.getBoolean("photoLiveDefault", false);
                            loadDebugConfig(sharedPreferences);
                            showNotificationsForAllAccounts = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
                            configLoaded = true;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        i9 = 0;
                    }
                    if (i9 == 0) {
                        i9 = buildVersion();
                    }
                    if (str == null) {
                        str = BuildVars.BUILD_VERSION_STRING;
                    }
                    if (pendingAppUpdateBuildVersion == i9 || (str2 = pendingAppUpdate.version) == null || str.compareTo(str2) >= 0 || BuildVars.DEBUG_PRIVATE_VERSION) {
                        pendingAppUpdate = null;
                        AndroidUtilities.runOnUIThread(new w1(18));
                    }
                }
                sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                SaveToGallerySettingsHelper.load(sharedPreferences);
                mapPreviewType = sharedPreferences.getInt("mapPreviewType", 2);
                searchEngineType = sharedPreferences.getInt("searchEngineType", 0);
                raiseToListen = sharedPreferences.getBoolean("raise_to_listen", true);
                raiseToSpeak = sharedPreferences.getBoolean("raise_to_speak", false);
                nextMediaTap = sharedPreferences.getBoolean("next_media_on_tap", true);
                recordViaSco = sharedPreferences.getBoolean("record_via_sco", false);
                adaptableColorInBrowser = sharedPreferences.getBoolean("adaptableBrowser", false);
                onlyLocalInstantView = sharedPreferences.getBoolean("onlyLocalInstantView", BuildVars.DEBUG_PRIVATE_VERSION);
                directShare = sharedPreferences.getBoolean("direct_share", true);
                boolean z102 = sharedPreferences.getBoolean("shuffleMusic", false);
                shuffleMusic = z102;
                playOrderReversed = z102 && sharedPreferences.getBoolean("playOrderReversed", false);
                inappCamera = sharedPreferences.getBoolean("inappCamera", true);
                hasCameraCache = sharedPreferences.contains("cameraCache");
                roundCamera16to9 = true;
                repeatMode = sharedPreferences.getInt("repeatMode", 0);
                fontSize = sharedPreferences.getInt("fons_size", (AndroidUtilities.isTablet() || AndroidUtilities.isFold()) ? 16 : 18);
                fontSizeIsDefault = !sharedPreferences.contains("fons_size");
                bubbleRadius = sharedPreferences.getInt("bubbleRadius", 17);
                ivFontSize = sharedPreferences.getInt("iv_font_size", fontSize);
                allowBigEmoji = sharedPreferences.getBoolean("allowBigEmoji", true);
                useSystemEmoji = sharedPreferences.getBoolean("useSystemEmoji", false);
                useSystemBoldFont = sharedPreferences.getBoolean("useSystemBoldFont", false);
                forceForumTabs = sharedPreferences.getBoolean("forceForumTabs", false);
                fastWallpaperDisabled = sharedPreferences.getBoolean("fastWallpaperDisabled", false);
                frameMetricsEnabled = sharedPreferences.getBoolean("frameMetricsEnabled", false);
                if (useSystemBoldFont) {
                    AndroidUtilities.mediumTypeface = null;
                }
                streamMedia = sharedPreferences.getBoolean("streamMedia", true);
                saveStreamMedia = sharedPreferences.getBoolean("saveStreamMedia", true);
                pauseMusicOnRecord = sharedPreferences.getBoolean("pauseMusicOnRecord", true);
                pauseMusicOnMedia = sharedPreferences.getBoolean("pauseMusicOnMedia", false);
                forceDisableTabletMode = sharedPreferences.getBoolean("forceDisableTabletMode", false);
                streamAllVideo = sharedPreferences.getBoolean("streamAllVideo", BuildVars.DEBUG_VERSION);
                streamMkv = sharedPreferences.getBoolean("streamMkv", false);
                suggestStickers = sharedPreferences.getInt("suggestStickers", 0);
                suggestAnimatedEmoji = sharedPreferences.getBoolean("suggestAnimatedEmoji", true);
                overrideDevicePerformanceClass = sharedPreferences.getInt("overrideDevicePerformanceClass", -1);
                devicePerformanceClass = sharedPreferences.getInt("devicePerformanceClass", -1);
                sortContactsByName = sharedPreferences.getBoolean("sortContactsByName", false);
                sortFilesByName = sharedPreferences.getBoolean("sortFilesByName", false);
                noSoundHintShowed = sharedPreferences.getBoolean("noSoundHintShowed", false);
                directShareHash = sharedPreferences.getString("directShareHash2", null);
                useThreeLinesLayout = sharedPreferences.getBoolean("useThreeLinesLayout", false);
                archiveHidden = sharedPreferences.getBoolean("archiveHidden", false);
                distanceSystemType = sharedPreferences.getInt("distanceSystemType", 0);
                keepMedia = sharedPreferences.getInt("keep_media", CacheByChatsController.KEEP_MEDIA_ONE_MONTH);
                debugWebView = sharedPreferences.getBoolean("debugWebView", false);
                lastKeepMediaCheckTime = sharedPreferences.getInt("lastKeepMediaCheckTime", 0);
                lastLogsCheckTime = sharedPreferences.getInt("lastLogsCheckTime", 0);
                searchMessagesAsListUsed = sharedPreferences.getBoolean("searchMessagesAsListUsed", false);
                stickersReorderingHintUsed = sharedPreferences.getBoolean("stickersReorderingHintUsed", false);
                storyReactionsLongPressHint = sharedPreferences.getBoolean("storyReactionsLongPressHint", false);
                storiesIntroShown = sharedPreferences.getBoolean("storiesIntroShown", false);
                textSelectionHintShows = sharedPreferences.getInt("textSelectionHintShows", 0);
                scheduledOrNoSoundHintShows = sharedPreferences.getInt("scheduledOrNoSoundHintShows", 0);
                scheduledOrNoSoundHintSeenAt = sharedPreferences.getLong("scheduledOrNoSoundHintSeenAt", 0L);
                scheduledHintShows = sharedPreferences.getInt("scheduledHintShows", 0);
                scheduledHintSeenAt = sharedPreferences.getLong("scheduledHintSeenAt", 0L);
                forwardingOptionsHintShown = sharedPreferences.getBoolean("forwardingOptionsHintShown", false);
                replyingOptionsHintShown = sharedPreferences.getBoolean("replyingOptionsHintShown", false);
                lockRecordAudioVideoHint = sharedPreferences.getInt("lockRecordAudioVideoHint", 0);
                disableVoiceAudioEffects = sharedPreferences.getBoolean("disableVoiceAudioEffects", false);
                noiseSupression = sharedPreferences.getBoolean("noiseSupression", false);
                chatSwipeAction = sharedPreferences.getInt("ChatSwipeAction", -1);
                messageSeenHintCount = sharedPreferences.getInt("messageSeenCount", 3);
                emojiInteractionsHintCount = sharedPreferences.getInt("emojiInteractionsHintCount", 3);
                dayNightThemeSwitchHintCount = sharedPreferences.getInt("dayNightThemeSwitchHintCount", 3);
                stealthModeSendMessageConfirm = sharedPreferences.getInt("stealthModeSendMessageConfirm", 2);
                mediaColumnsCount = sharedPreferences.getInt("mediaColumnsCount", 3);
                storiesColumnsCount = sharedPreferences.getInt("storiesColumnsCount", 3);
                fastScrollHintCount = sharedPreferences.getInt("fastScrollHintCount", 3);
                dontAskManageStorage = sharedPreferences.getBoolean("dontAskManageStorage", false);
                hasEmailLogin = sharedPreferences.getBoolean("hasEmailLogin", false);
                isFloatingDebugActive = sharedPreferences.getBoolean("floatingDebugActive", false);
                updateStickersOrderOnSend = sharedPreferences.getBoolean("updateStickersOrderOnSend", true);
                dayNightWallpaperSwitchHint = sharedPreferences.getInt("dayNightWallpaperSwitchHint", 0);
                bigCameraForRound = sharedPreferences.getBoolean("bigCameraForRound", false);
                useNewBlur = sharedPreferences.getBoolean("useNewBlur", true);
                if (!sharedPreferences.contains("useCamera2Force_2")) {
                    bool = Boolean.valueOf(sharedPreferences.getBoolean("useCamera2Force_2", false));
                }
                useCamera2Force = bool;
                useSurfaceInStories = sharedPreferences.getBoolean("useSurfaceInStories", Build.VERSION.SDK_INT < 30);
                payByInvoice = sharedPreferences.getBoolean("payByInvoice", false);
                photoViewerBlur = sharedPreferences.getBoolean("photoViewerBlur", true);
                multipleReactionsPromoShowed = sharedPreferences.getBoolean("multipleReactionsPromoShowed", false);
                callEncryptionHintDisplayedCount = sharedPreferences.getInt("callEncryptionHintDisplayedCount", 0);
                debugVideoQualities = sharedPreferences.getBoolean("debugVideoQualities", false);
                shadowsInSections = sharedPreferences.getBoolean("shadowsInSections", false);
                debugViewMetrics = sharedPreferences.getBoolean("debugViewMetrics", false);
                photoHighQualityDefault = sharedPreferences.getBoolean("photoHighQualityDefault", false);
                photoLiveDefault = sharedPreferences.getBoolean("photoLiveDefault", false);
                loadDebugConfig(sharedPreferences);
                showNotificationsForAllAccounts = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
                configLoaded = true;
            }
        }
    }

    private static void loadDebugConfig(SharedPreferences sharedPreferences) {
        drawActionBarShadow = sharedPreferences.getBoolean("drawActionBarShadow", true);
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
        int i9 = sharedPreferences.getInt("proxy_port", 1080);
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
                    for (int i10 = 0; i10 < readInt322; i10++) {
                        ProxyInfo proxyInfo = new ProxyInfo(serializedData.readString(false), serializedData.readInt32(false), serializedData.readString(false), serializedData.readString(false), serializedData.readString(false));
                        proxyInfo.ping = serializedData.readInt64(false);
                        proxyInfo.availableCheckTime = serializedData.readInt64(false);
                        proxyList.add(0, proxyInfo);
                        if (currentProxy == null && !TextUtils.isEmpty(string) && string.equals(proxyInfo.address) && i9 == proxyInfo.port && string2.equals(proxyInfo.username) && string3.equals(proxyInfo.password)) {
                            currentProxy = proxyInfo;
                        }
                    }
                } else {
                    FileLog.e("Unknown proxy schema version: " + ((int) readByte));
                }
            } else {
                for (int i11 = 0; i11 < readInt32; i11++) {
                    ProxyInfo proxyInfo2 = new ProxyInfo(serializedData.readString(false), serializedData.readInt32(false), serializedData.readString(false), serializedData.readString(false), serializedData.readString(false));
                    proxyList.add(0, proxyInfo2);
                    if (currentProxy == null && !TextUtils.isEmpty(string) && string.equals(proxyInfo2.address) && i9 == proxyInfo2.port && string2.equals(proxyInfo2.username) && string3.equals(proxyInfo2.password)) {
                        currentProxy = proxyInfo2;
                    }
                }
            }
            serializedData.cleanup();
        }
        if (currentProxy != null || TextUtils.isEmpty(string)) {
            return;
        }
        ProxyInfo proxyInfo3 = new ProxyInfo(string, i9, string2, string3, string4);
        currentProxy = proxyInfo3;
        proxyList.add(0, proxyInfo3);
    }

    public static boolean loopStickers() {
        return LiteMode.isEnabled(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0017, code lost:
    
        r4 = android.os.Build.SOC_MODEL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int measureDevicePerformanceClass() {
        long j10;
        String str;
        int i9 = Build.VERSION.SDK_INT;
        int i10 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
        int i11 = 0;
        if (i9 >= 31 && str != null) {
            int hashCode = str.toUpperCase().hashCode();
            int i12 = 0;
            while (true) {
                int[] iArr = LOW_SOC;
                if (i12 >= iArr.length) {
                    break;
                }
                if (iArr[i12] == hashCode) {
                    return 0;
                }
                i12++;
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            try {
                Locale locale = Locale.ENGLISH;
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i15 + "/cpufreq/cpuinfo_max_freq", "r");
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    i14 += Utilities.parseInt((CharSequence) readLine).intValue() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i13++;
                }
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
        int ceil = i13 == 0 ? -1 : (int) Math.ceil(i14 / i13);
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j10 = -1;
        }
        if (i10 > 2 && memoryClass > 100 && ((i10 > 4 || ceil == -1 || ceil > 1250) && ((i10 > 4 || ceil > 1600 || memoryClass > 128 || i9 > 21) && ((i10 > 4 || ceil > 1300 || memoryClass > 128 || i9 > 24) && (j10 == -1 || j10 >= 2147483648L))))) {
            i11 = (i10 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i10 == 8 && i9 <= 23)) ? 1 : 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder o6 = e2.c.o("device performance info selected_class = ", i11, " (cpu_count = ", i10, ", freq = ");
            j3.r0.y(o6, ceil, ", memoryClass = ", memoryClass, ", android version ");
            o6.append(i9);
            o6.append(", manufacture ");
            o6.append(Build.MANUFACTURER);
            o6.append(", screenRefreshRate=");
            o6.append(AndroidUtilities.screenRefreshRate);
            o6.append(", screenMaxRefreshRate=");
            o6.append(AndroidUtilities.screenMaxRefreshRate);
            o6.append(")");
            FileLog.d(o6.toString());
        }
        return i11;
    }

    public static void overrideDevicePerformanceClass(int i9) {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        overrideDevicePerformanceClass = i9;
        edit.putInt("overrideDevicePerformanceClass", i9).remove("lite_mode").apply();
        if (liteMode != null) {
            LiteMode.loadPreference();
        }
    }

    public static String performanceClassName(int i9) {
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? "UNKNOWN" : "HIGH" : "AVERAGE" : "LOW";
    }

    public static void removeLockRecordAudioVideoHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
    }

    public static void removeScheduledHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("scheduledHintShows", 3);
        edit.apply();
    }

    public static void removeScheduledOrNoSoundHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("scheduledOrNoSoundHintShows", 3);
        edit.apply();
    }

    public static void removeTextSelectionHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public static void replyingOptionsHintHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        replyingOptionsHintShown = true;
        edit.putBoolean("replyingOptionsHintShown", true);
        edit.apply();
    }

    public static void saveConfig() {
        synchronized (sync) {
            try {
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
                    edit.putBoolean("useFingerprint", useFingerprintLock);
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
                    edit.putLong("scheduledOrNoSoundHintSeenAt", scheduledOrNoSoundHintSeenAt);
                    edit.putInt("scheduledHintShows", scheduledHintShows);
                    edit.putLong("scheduledHintSeenAt", scheduledHintSeenAt);
                    edit.putBoolean("forwardingOptionsHintShown", forwardingOptionsHintShown);
                    edit.putBoolean("replyingOptionsHintShown", replyingOptionsHintShown);
                    edit.putInt("lockRecordAudioVideoHint", lockRecordAudioVideoHint);
                    edit.putString("storageCacheDir", !TextUtils.isEmpty(storageCacheDir) ? storageCacheDir : "");
                    edit.putBoolean("proxyRotationEnabled", proxyRotationEnabled);
                    edit.putInt("proxyRotationTimeout", proxyRotationTimeout);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = pendingAppUpdate;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void saveDebugConfig() {
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", drawActionBarShadow);
    }

    public static void saveProxyList() {
        ArrayList arrayList = new ArrayList(proxyList);
        Collections.sort(arrayList, new sh(3));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(2);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        for (int i9 = size - 1; i9 >= 0; i9--) {
            ProxyInfo proxyInfo = (ProxyInfo) arrayList.get(i9);
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

    public static void setAnimationsEnabled(boolean z10) {
        animationsEnabled = Boolean.valueOf(z10);
    }

    public static void setDistanceSystemType(int i9) {
        distanceSystemType = i9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("distanceSystemType", distanceSystemType);
        edit.apply();
        LocaleController.resetImperialSystemType();
    }

    public static void setDontAskManageStorage(boolean z10) {
        dontAskManageStorage = z10;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("dontAskManageStorage", dontAskManageStorage).apply();
    }

    public static void setFastScrollHintCount(int i9) {
        if (fastScrollHintCount != i9) {
            fastScrollHintCount = i9;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", fastScrollHintCount).apply();
        }
    }

    public static void setKeepMedia(int i9) {
        keepMedia = i9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("keep_media", keepMedia);
        edit.apply();
    }

    public static void setMediaColumnsCount(int i9) {
        if (mediaColumnsCount != i9) {
            mediaColumnsCount = i9;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", mediaColumnsCount).apply();
        }
    }

    public static void setMultipleReactionsPromoShowed(boolean z10) {
        multipleReactionsPromoShowed = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("multipleReactionsPromoShowed", multipleReactionsPromoShowed);
        edit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean setNewAppVersionAvailable(TLRPC.TL_help_appUpdate tL_help_appUpdate) {
        int i9;
        String str;
        String str2;
        PackageInfo packageInfo;
        try {
            packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            i9 = packageInfo.versionCode;
        } catch (Exception e10) {
            e = e10;
            i9 = 0;
        }
        try {
            str = packageInfo.versionName;
        } catch (Exception e11) {
            e = e11;
            FileLog.e(e);
            str = null;
            if (i9 == 0) {
            }
            if (str == null) {
            }
            str2 = tL_help_appUpdate.version;
            if (str2 != null) {
            }
            return false;
        }
        if (i9 == 0) {
            i9 = buildVersion();
        }
        if (str == null) {
            str = BuildVars.BUILD_VERSION_STRING;
        }
        str2 = tL_help_appUpdate.version;
        if (str2 != null || versionBiggerOrEqual(str, str2)) {
            return false;
        }
        pendingAppUpdate = tL_help_appUpdate;
        pendingAppUpdateBuildVersion = i9;
        saveConfig();
        return true;
    }

    public static void setNoSoundHintShowed(boolean z10) {
        if (noSoundHintShowed == z10) {
            return;
        }
        noSoundHintShowed = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("noSoundHintShowed", noSoundHintShowed);
        edit.apply();
    }

    public static void setPassportConfig(String str, int i9) {
        passportConfigMap = null;
        passportConfigJson = str;
        passportConfigHash = i9;
        saveConfig();
        getCountryLangs();
    }

    public static void setPlaybackOrderType(int i9) {
        if (i9 == 2) {
            shuffleMusic = true;
            playOrderReversed = false;
        } else if (i9 == 1) {
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

    public static void setRepeatMode(int i9) {
        repeatMode = i9;
        if (i9 < 0 || i9 > 2) {
            repeatMode = 0;
        }
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("repeatMode", repeatMode);
        edit.apply();
    }

    public static void setSearchEngineType(int i9) {
        searchEngineType = i9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("searchEngineType", searchEngineType);
        edit.apply();
    }

    public static void setSearchMessagesAsListUsed(boolean z10) {
        searchMessagesAsListUsed = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("searchMessagesAsListUsed", searchMessagesAsListUsed);
        edit.apply();
    }

    public static void setSecretMapPreviewType(int i9) {
        mapPreviewType = i9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("mapPreviewType", mapPreviewType);
        edit.apply();
    }

    public static void setStickersReorderingHintUsed(boolean z10) {
        stickersReorderingHintUsed = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("stickersReorderingHintUsed", stickersReorderingHintUsed);
        edit.apply();
    }

    public static void setStoriesColumnsCount(int i9) {
        if (storiesColumnsCount != i9) {
            storiesColumnsCount = i9;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", storiesColumnsCount).apply();
        }
    }

    public static void setStoriesIntroShown(boolean z10) {
        storiesIntroShown = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("storiesIntroShown", storiesIntroShown);
        edit.apply();
    }

    public static void setStoriesReactionsLongPressHintUsed(boolean z10) {
        storyReactionsLongPressHint = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("storyReactionsLongPressHint", storyReactionsLongPressHint);
        edit.apply();
    }

    public static void setSuggestStickers(int i9) {
        suggestStickers = i9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("suggestStickers", suggestStickers);
        edit.apply();
    }

    public static void setUseThreeLinesLayout(boolean z10) {
        useThreeLinesLayout = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("useThreeLinesLayout", useThreeLinesLayout);
        edit.apply();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public static void toggleArchiveHidden() {
        archiveHidden = !archiveHidden;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("archiveHidden", archiveHidden);
        edit.apply();
    }

    public static void toggleAutoplayGifs() {
        LiteMode.toggleFlag(2048);
    }

    public static void toggleAutoplayVideo() {
        LiteMode.toggleFlag(1024);
    }

    public static void toggleBigEmoji() {
        allowBigEmoji = !allowBigEmoji;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("allowBigEmoji", allowBigEmoji);
        edit.apply();
    }

    public static void toggleBrowserAdaptableColors() {
        adaptableColorInBrowser = !adaptableColorInBrowser;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("adaptableBrowser", adaptableColorInBrowser);
        edit.apply();
    }

    public static void toggleChatBlur() {
        LiteMode.toggleFlag(256);
    }

    public static void toggleDebugVideoQualities() {
        debugVideoQualities = !debugVideoQualities;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("debugVideoQualities", debugVideoQualities);
        edit.apply();
    }

    public static void toggleDebugWebView() {
        debugWebView = !debugWebView;
        WebView.setWebContentsDebuggingEnabled(debugWebView);
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("debugWebView", debugWebView);
        edit.apply();
    }

    public static void toggleDirectShare() {
        directShare = !directShare;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("direct_share", directShare);
        edit.apply();
        g0.f.n(ApplicationLoader.applicationContext);
        MediaDataController.getInstance(UserConfig.selectedAccount).buildShortcuts();
    }

    public static void toggleDisableVoiceAudioEffects() {
        disableVoiceAudioEffects = !disableVoiceAudioEffects;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("disableVoiceAudioEffects", disableVoiceAudioEffects);
        edit.apply();
    }

    public static void toggleFastWallpaperDisabled() {
        fastWallpaperDisabled = !fastWallpaperDisabled;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("fastWallpaperDisabled", fastWallpaperDisabled);
        edit.apply();
    }

    public static void toggleForceDisableTabletMode() {
        forceDisableTabletMode = !forceDisableTabletMode;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("forceDisableTabletMode", forceDisableTabletMode);
        edit.apply();
    }

    public static void toggleForceForumTabs() {
        forceForumTabs = !forceForumTabs;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("forceForumTabs", forceForumTabs);
        edit.apply();
    }

    public static void toggleFrameMetricsEnabled() {
        frameMetricsEnabled = !frameMetricsEnabled;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("frameMetricsEnabled", frameMetricsEnabled);
        edit.apply();
    }

    public static void toggleInappCamera() {
        inappCamera = !inappCamera;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("inappCamera", inappCamera);
        edit.apply();
    }

    public static void toggleLocalInstantView() {
        onlyLocalInstantView = !onlyLocalInstantView;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("onlyLocalInstantView", onlyLocalInstantView);
        edit.apply();
    }

    public static void toggleLoopStickers() {
        LiteMode.toggleFlag(2);
    }

    public static void toggleNextMediaTap() {
        nextMediaTap = !nextMediaTap;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("next_media_on_tap", nextMediaTap);
        edit.apply();
    }

    public static void toggleNoiseSupression() {
        noiseSupression = !noiseSupression;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("noiseSupression", noiseSupression);
        edit.apply();
    }

    public static void togglePauseMusicOnMedia() {
        pauseMusicOnMedia = !pauseMusicOnMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("pauseMusicOnMedia", pauseMusicOnMedia);
        edit.apply();
    }

    public static void togglePauseMusicOnRecord() {
        pauseMusicOnRecord = !pauseMusicOnRecord;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("pauseMusicOnRecord", pauseMusicOnRecord);
        edit.apply();
    }

    public static void togglePaymentByInvoice() {
        payByInvoice = !payByInvoice;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", payByInvoice).apply();
    }

    public static void togglePhotoViewerBlur() {
        photoViewerBlur = !photoViewerBlur;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", photoViewerBlur).apply();
    }

    public static void toggleRaiseToListen() {
        raiseToListen = !raiseToListen;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("raise_to_listen", raiseToListen);
        edit.apply();
    }

    public static void toggleRaiseToSpeak() {
        raiseToSpeak = !raiseToSpeak;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("raise_to_speak", raiseToSpeak);
        edit.apply();
    }

    public static void toggleRoundCamera() {
        bigCameraForRound = !bigCameraForRound;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", bigCameraForRound).apply();
    }

    public static void toggleRoundCamera16to9() {
        roundCamera16to9 = !roundCamera16to9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("roundCamera16to9", roundCamera16to9);
        edit.apply();
    }

    public static void toggleSaveStreamMedia() {
        saveStreamMedia = !saveStreamMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("saveStreamMedia", saveStreamMedia);
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

    public static void toggleStreamMedia() {
        streamMedia = !streamMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamMedia", streamMedia);
        edit.apply();
    }

    public static void toggleStreamMkv() {
        streamMkv = !streamMkv;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamMkv", streamMkv);
        edit.apply();
    }

    public static void toggleSuggestAnimatedEmoji() {
        suggestAnimatedEmoji = !suggestAnimatedEmoji;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("suggestAnimatedEmoji", suggestAnimatedEmoji);
        edit.apply();
    }

    public static void toggleSurfaceInStories() {
        useSurfaceInStories = !useSurfaceInStories;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", useSurfaceInStories).apply();
    }

    public static void toggleUpdateStickersOrderOnSend() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        boolean z10 = !updateStickersOrderOnSend;
        updateStickersOrderOnSend = z10;
        edit.putBoolean("updateStickersOrderOnSend", z10);
        edit.apply();
    }

    public static void toggleUseCamera2(int i9) {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
        boolean z10 = !isUsingCamera2(i9);
        useCamera2Force = Boolean.valueOf(z10);
        edit.putBoolean("useCamera2Force_2", z10).apply();
    }

    public static void toggleUseNewBlur() {
        useNewBlur = !useNewBlur;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", useNewBlur).apply();
    }

    public static void toggleUseSystemBoldFont() {
        useSystemBoldFont = !useSystemBoldFont;
        AndroidUtilities.mediumTypeface = null;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("useSystemBoldFont", useSystemBoldFont);
        edit.apply();
    }

    public static void updateChatListSwipeSetting(int i9) {
        chatSwipeAction = i9;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", chatSwipeAction).apply();
    }

    public static void updateDayNightThemeSwitchHintCount(int i9) {
        dayNightThemeSwitchHintCount = i9;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", dayNightThemeSwitchHintCount).apply();
    }

    public static void updateEmojiInteractionsHintCount(int i9) {
        emojiInteractionsHintCount = i9;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", emojiInteractionsHintCount).apply();
    }

    public static void updateMessageSeenHintCount(int i9) {
        messageSeenHintCount = i9;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", messageSeenHintCount).apply();
    }

    public static void updateStealthModeSendMessageConfirm(int i9) {
        stealthModeSendMessageConfirm = i9;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", stealthModeSendMessageConfirm).apply();
    }

    public static void updateTabletConfig() {
        if (fontSizeIsDefault) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            int i9 = sharedPreferences.getInt("fons_size", (!AndroidUtilities.isTablet() || AndroidUtilities.isFold()) ? 16 : 18);
            fontSize = i9;
            ivFontSize = sharedPreferences.getInt("iv_font_size", i9);
        }
    }

    public static boolean versionBiggerOrEqual(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i9 = 0; i9 < Math.min(split.length, split2.length); i9++) {
            int parseInt = Integer.parseInt(split[i9]);
            int parseInt2 = Integer.parseInt(split2[i9]);
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkSdCard$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkSdCard$1(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
    }
}
