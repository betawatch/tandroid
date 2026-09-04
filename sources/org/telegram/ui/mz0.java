package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.os.Build;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class mz0 implements org.telegram.ui.Components.bl0 {
    public int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ProfileActivity c;

    public mz0(ProfileActivity profileActivity, Context context) {
        this.c = profileActivity;
        this.b = context;
    }

    public static void b(mz0 mz0Var, Context context, int i10) {
        int i11;
        int i12;
        long j3;
        Long l4;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        if (i10 == 0) {
            mz0Var.c.getUserConfig().syncContacts = true;
            mz0Var.c.getUserConfig().saveConfig(false);
            mz0Var.c.getContactsController().forceImportContacts();
            return;
        }
        long j10 = 0;
        if (i10 == 1) {
            mz0Var.c.getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i10 == 2) {
            mz0Var.c.getContactsController().resetImportedContacts();
            return;
        }
        if (i10 == 3) {
            mz0Var.c.getMessagesController().forceResetDialogs();
            return;
        }
        if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            mz0Var.c.j5();
            mz0Var.c.d.l();
            if (BuildVars.LOGS_ENABLED) {
                i2.g.w(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            return;
        }
        if (i10 == 5) {
            SharedConfig.toggleInappCamera();
            return;
        }
        if (i10 == 6) {
            mz0Var.c.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.w1.d(org.telegram.messenger.w1.d(org.telegram.messenger.w1.d(org.telegram.messenger.w1.d(org.telegram.messenger.w1.d(org.telegram.messenger.w1.d(org.telegram.messenger.w1.d(org.telegram.messenger.w1.d(org.telegram.messenger.w1.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint").remove("taptostoryhighlighthint").apply();
            w7.w5.a();
            i13 = ((org.telegram.ui.ActionBar.n2) mz0Var.c).currentAccount;
            MessagesController.getEmojiSettings(i13).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            SharedConfig.textSelectionHintShows = 0;
            SharedConfig.lockRecordAudioVideoHint = 0;
            SharedConfig.stickersReorderingHintUsed = false;
            SharedConfig.forwardingOptionsHintShown = false;
            SharedConfig.replyingOptionsHintShown = false;
            SharedConfig.messageSeenHintCount = 3;
            SharedConfig.emojiInteractionsHintCount = 3;
            SharedConfig.dayNightThemeSwitchHintCount = 3;
            SharedConfig.fastScrollHintCount = 3;
            SharedConfig.stealthModeSendMessageConfirm = 2;
            SharedConfig.updateStealthModeSendMessageConfirm(2);
            SharedConfig.setStoriesReactionsLongPressHintUsed(false);
            SharedConfig.setStoriesIntroShown(false);
            SharedConfig.setMultipleReactionsPromoShowed(false);
            i14 = ((org.telegram.ui.ActionBar.n2) mz0Var.c).currentAccount;
            ChatThemeController.getInstance(i14).clearCache();
            mz0Var.c.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            h41.W();
            i15 = ((org.telegram.ui.ActionBar.n2) mz0Var.c).currentAccount;
            qg.s0.e(i15).a();
            SharedPreferences mainSettings = mz0Var.c.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.w1.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    edit.remove(str);
                }
            }
            edit.apply();
            i16 = ((org.telegram.ui.ActionBar.n2) mz0Var.c).currentAccount;
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(i16).edit();
            i17 = ((org.telegram.ui.ActionBar.n2) mz0Var.c).currentAccount;
            for (String str2 : MessagesController.getNotificationsSettings(i17).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    edit2.remove(str2);
                }
            }
            edit2.apply();
            return;
        }
        if (i10 == 7) {
            org.telegram.ui.Components.voip.d2.i(mz0Var.c.getParentActivity());
            return;
        }
        if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i10 == 9) {
            ((LaunchActivity) mz0Var.c.getParentActivity()).z(true);
            return;
        }
        if (i10 == 10) {
            mz0Var.c.getMessagesStorage().readAllDialogs(-1);
            return;
        }
        if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
            return;
        }
        if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (i10 == 13) {
            Set<String> set = mz0Var.c.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            mz0Var.c.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            return;
        }
        try {
            if (i10 == 14) {
                ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(ApplicationLoader.applicationContext);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i10 == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i10 == 16) {
                SharedConfig.toggleDebugWebView();
                Toast.makeText(mz0Var.c.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i10 == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity findActivity = AndroidUtilities.findActivity(context);
                Intent launchIntentForPackage = findActivity.getPackageManager().getLaunchIntentForPackage(findActivity.getPackageName());
                findActivity.finishAffinity();
                findActivity.startActivity(launchIntentForPackage);
                System.exit(0);
                return;
            }
            if (i10 == 18) {
                w7.c0.a((LaunchActivity) mz0Var.c.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i10 == 19) {
                mz0Var.c.getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                mz0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new jz0(mz0Var, i18));
                return;
            }
            if (i10 != 20) {
                if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mz0Var.c.getParentActivity(), 0, mz0Var.c.z0);
                    alertDialog$Builder.a.R = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    alertDialog$Builder.f(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(measureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(measureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(measureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new kz0(measureDevicePerformanceClass, 0));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                    return;
                }
                if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i10 == 23) {
                    boolean q6 = di.d1.q(mz0Var.c.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q6).apply();
                    Toast.makeText(mz0Var.c.getParentActivity(), LocaleController.getString(!q6 ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i18 < mz0Var.c.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.n2) mz0Var.c.getParentLayout().getFragmentStack().get(i18)).clearSheets();
                        i18++;
                    }
                    return;
                }
                if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                    return;
                }
                if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                    return;
                }
                if (i10 == 27) {
                    mz0Var.c.getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i10 == 28) {
                    i12 = ((org.telegram.ui.ActionBar.n2) mz0Var.c).currentAccount;
                    SharedConfig.toggleUseCamera2(i12);
                    return;
                }
                if (i10 == 29) {
                    fi.s.b();
                    fi.w0.c();
                    fi.l0.a();
                    fi.d5.c();
                    return;
                }
                if (i10 == 30) {
                    AuthTokensHelper.clearLogInTokens();
                    return;
                }
                if (i10 == 31) {
                    SharedConfig.toggleUseNewBlur();
                    return;
                }
                if (i10 == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                    return;
                }
                if (i10 == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                    return;
                }
                if (i10 == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                    return;
                }
                if (i10 == 35) {
                    i11 = ((org.telegram.ui.ActionBar.n2) mz0Var.c).currentAccount;
                    MessagesController.getInstance(i11).loadAppConfig(true);
                    return;
                } else if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                    return;
                } else if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                    return;
                } else {
                    if (i10 == 38) {
                        SharedConfig.toggleFastWallpaperDisabled();
                        return;
                    }
                    return;
                }
            }
            int i19 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb2 = new StringBuilder();
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            while (i18 < i19) {
                long j19 = j10;
                Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i18 + "/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i18 + "/cpufreq/cpuinfo_cur_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i18 + "/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i18 + "/cpu_capacity");
                sb2.append("#");
                sb2.append(i18);
                sb2.append(" ");
                int i20 = i18;
                if (sysInfoLong != null) {
                    sb2.append("min=");
                    l4 = sysInfoLong3;
                    sb2.append(sysInfoLong.longValue() / 1000);
                    sb2.append(" ");
                    j11 += sysInfoLong.longValue() / 1000;
                    j12++;
                } else {
                    l4 = sysInfoLong3;
                }
                if (sysInfoLong2 != null) {
                    sb2.append("cur=");
                    sb2.append(sysInfoLong2.longValue() / 1000);
                    sb2.append(" ");
                    j13 += sysInfoLong2.longValue() / 1000;
                    j14++;
                }
                if (l4 != null) {
                    sb2.append("max=");
                    sb2.append(l4.longValue() / 1000);
                    sb2.append(" ");
                    j15 = (l4.longValue() / 1000) + j15;
                    j16++;
                }
                if (sysInfoLong4 != null) {
                    sb2.append("cpc=");
                    sb2.append(sysInfoLong4);
                    sb2.append(" ");
                    j17 = sysInfoLong4.longValue() + j17;
                    j18++;
                }
                sb2.append("\n");
                i18 = i20 + 1;
                j10 = j19;
            }
            long j20 = j10;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Build.MANUFACTURER);
            sb3.append(", ");
            sb3.append(Build.MODEL);
            sb3.append(" (");
            sb3.append(Build.PRODUCT);
            sb3.append(", ");
            sb3.append(Build.DEVICE);
            sb3.append(")  (android ");
            int i21 = Build.VERSION.SDK_INT;
            sb3.append(i21);
            sb3.append(")\n");
            if (i21 >= 31) {
                sb3.append("SoC: ");
                sb3.append(Build.SOC_MANUFACTURER);
                sb3.append(", ");
                sb3.append(Build.SOC_MODEL);
                sb3.append("\n");
            }
            String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
            if (sysInfoString != null) {
                sb3.append("GPU: ");
                sb3.append(sysInfoString);
                Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                if (sysInfoLong5 != null) {
                    sb3.append(", min=");
                    j3 = j11;
                    sb3.append(sysInfoLong5.longValue() / 1000);
                } else {
                    j3 = j11;
                }
                if (sysInfoLong6 != null) {
                    sb3.append(", mmin=");
                    sb3.append(sysInfoLong6.longValue() / 1000);
                }
                if (sysInfoLong7 != null) {
                    sb3.append(", max=");
                    sb3.append(sysInfoLong7.longValue() / 1000);
                }
                sb3.append("\n");
            } else {
                j3 = j11;
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
            sb3.append("GLES Version: ");
            sb3.append(deviceConfigurationInfo.getGlEsVersion());
            sb3.append("\nMemory: class=");
            sb3.append(AndroidUtilities.formatFileSize(memoryClass * 1048576));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb3.append(", total=");
            sb3.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
            sb3.append(", avail=");
            sb3.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
            sb3.append(", low?=");
            sb3.append(memoryInfo.lowMemory);
            sb3.append(" (threshold=");
            sb3.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
            sb3.append(")\nCurrent class: ");
            sb3.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
            sb3.append(", measured: ");
            sb3.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
            if (i21 >= 31) {
                sb3.append(", suggest=");
                sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb3.append("\n");
            sb3.append(i19);
            sb3.append(" CPUs");
            if (j12 > j20) {
                sb3.append(", avgMinFreq=");
                sb3.append(j3 / j12);
            }
            if (j14 > j20) {
                sb3.append(", avgCurFreq=");
                sb3.append(j13 / j14);
            }
            if (j16 > j20) {
                sb3.append(", avgMaxFreq=");
                sb3.append(j15 / j16);
            }
            if (j18 > j20) {
                sb3.append(", avgCapacity=");
                sb3.append(j17 / j18);
            }
            sb3.append("\n");
            sb3.append((CharSequence) sb2);
            ProfileActivity.S0(mz0Var.c, MediaController.VIDEO_MIME_TYPE, sb3);
            ProfileActivity.S0(mz0Var.c, "video/hevc", sb3);
            ProfileActivity.S0(mz0Var.c, "video/x-vnd.on2.vp8", sb3);
            ProfileActivity.S0(mz0Var.c, "video/x-vnd.on2.vp9", sb3);
            mz0Var.c.showDialog(new lz0(mz0Var, mz0Var.c.getParentActivity(), sb3.toString()));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e5  */
    @Override // org.telegram.ui.Components.bl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i10, View view) {
        String str;
        int i11;
        String string;
        String str2;
        int i12;
        char c10;
        char c11;
        String string2;
        String str3;
        int i13;
        String str4;
        String str5;
        String str6;
        ProfileActivity profileActivity = this.c;
        ArrayList arrayList = profileActivity.Q4;
        if (i10 != profileActivity.z3) {
            if (i10 >= profileActivity.u4 && i10 < profileActivity.v4) {
                return profileActivity.h(!profileActivity.C2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) profileActivity.C2.get(i10 - profileActivity.u4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i10 - profileActivity.u4), true, false, view);
            }
            if (i10 != profileActivity.U2) {
                if (i10 == profileActivity.H3) {
                    profileActivity.I3(i10, view);
                    return true;
                }
                if (profileActivity.J3(i10, view)) {
                    return true;
                }
                return profileActivity.C4(view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f), i10, view);
            }
            if (profileActivity.J3(i10, view)) {
                return true;
            }
            TLRPC.UserFull userFull = profileActivity.v2;
            if (userFull == null) {
                return false;
            }
            try {
                AndroidUtilities.addToClipboard(UserInfoActivity.Z(userFull.birthday));
                org.telegram.ui.Components.yc.a0(profileActivity).i(LocaleController.getString(R.string.BirthdayCopied)).j();
                return true;
            } catch (Exception e7) {
                FileLog.e(e7);
                return true;
            }
        }
        int i14 = this.a + 1;
        this.a = i14;
        if (i14 < 2 && !BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                Toast.makeText(profileActivity.getParentActivity(), LocaleController.getString("DebugMenuLongPress", R.string.DebugMenuLongPress), 0).show();
                return true;
            } catch (Exception e10) {
                FileLog.e(e10);
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
        String string3 = LocaleController.getString(R.string.DebugMenu);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string3;
        String string4 = LocaleController.getString(R.string.DebugMenuImportContacts);
        String string5 = LocaleController.getString(R.string.DebugMenuReloadContacts);
        String string6 = LocaleController.getString(R.string.DebugMenuResetContacts);
        String string7 = LocaleController.getString(R.string.DebugMenuResetDialogs);
        if (BuildVars.DEBUG_VERSION) {
            string = null;
        } else {
            if (BuildVars.LOGS_ENABLED) {
                str = "DebugMenuDisableLogs";
                i11 = R.string.DebugMenuDisableLogs;
            } else {
                str = "DebugMenuEnableLogs";
                i11 = R.string.DebugMenuEnableLogs;
            }
            string = LocaleController.getString(str, i11);
        }
        if (SharedConfig.inappCamera) {
            str2 = "DebugMenuDisableCamera";
            i12 = R.string.DebugMenuDisableCamera;
        } else {
            str2 = "DebugMenuEnableCamera";
            i12 = R.string.DebugMenuEnableCamera;
        }
        String string8 = LocaleController.getString(str2, i12);
        String string9 = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
        String string10 = LocaleController.getString(R.string.DebugMenuCallSettings);
        if (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            c10 = 2;
            c11 = 0;
            string2 = LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate);
        } else {
            c10 = 2;
            string2 = null;
            c11 = 0;
        }
        String string11 = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
        String str7 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects" : null;
        boolean z10 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str8 = z10 ? "Clean app update" : null;
        String str9 = z10 ? "Reset suggestions" : null;
        String string12 = z10 ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
        String string13 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
        String string14 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
        String str10 = (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) ? SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode" : null;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str3 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
        } else {
            str3 = null;
        }
        boolean z11 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str11 = z11 ? "Force remove premium suggestions" : null;
        String str12 = z11 ? "Share device info" : null;
        String str13 = z11 ? "Force performance class" : null;
        String str14 = (!z11 || org.telegram.ui.Components.w50.c()) ? null : !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
        String string15 = LocaleController.getString(di.d1.q(profileActivity.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        String str15 = BuildVars.DEBUG_VERSION ? SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories" : null;
        String str16 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer" : null;
        String str17 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
        String str18 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
        i13 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
        String str19 = !SharedConfig.isUsingCamera2(i13) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str20 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : null;
        String str21 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
        if (SharedConfig.canBlurChat()) {
            str4 = string2;
            if (Build.VERSION.SDK_INT >= 31) {
                str5 = SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
                String str22 = !SharedConfig.adaptableColorInBrowser ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
                String str23 = !SharedConfig.debugVideoQualities ? "Disable video qualities debug" : "Enable video qualities debug";
                String str24 = str5;
                if (Build.VERSION.SDK_INT < 28) {
                    str6 = LocaleController.getString(SharedConfig.useSystemBoldFont ? R.string.DebugMenuDontUseSystemBoldFont : R.string.DebugMenuUseSystemBoldFont);
                } else {
                    str6 = null;
                }
                String str25 = SharedConfig.forceForumTabs ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
                String str26 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.fastWallpaperDisabled ? "enable wallpaper shader" : "disable wallpaper shader" : null;
                CharSequence[] charSequenceArr = new CharSequence[39];
                charSequenceArr[c11] = string4;
                charSequenceArr[1] = string5;
                charSequenceArr[c10] = string6;
                charSequenceArr[3] = string7;
                charSequenceArr[4] = string;
                charSequenceArr[5] = string8;
                charSequenceArr[6] = string9;
                charSequenceArr[7] = string10;
                charSequenceArr[8] = null;
                charSequenceArr[9] = str4;
                charSequenceArr[10] = string11;
                charSequenceArr[11] = str7;
                charSequenceArr[12] = str8;
                charSequenceArr[13] = str9;
                charSequenceArr[14] = string12;
                charSequenceArr[15] = string13;
                charSequenceArr[16] = string14;
                charSequenceArr[17] = str10;
                charSequenceArr[18] = str3;
                charSequenceArr[19] = str11;
                charSequenceArr[20] = str12;
                charSequenceArr[21] = str13;
                charSequenceArr[22] = str14;
                charSequenceArr[23] = string15;
                charSequenceArr[24] = str15;
                charSequenceArr[25] = str16;
                charSequenceArr[26] = str17;
                charSequenceArr[27] = str18;
                charSequenceArr[28] = str19;
                charSequenceArr[29] = str20;
                charSequenceArr[30] = str21;
                charSequenceArr[31] = str24;
                charSequenceArr[32] = str22;
                charSequenceArr[33] = str23;
                charSequenceArr[34] = str6;
                charSequenceArr[35] = "Reload app config";
                charSequenceArr[36] = str25;
                charSequenceArr[37] = "Make Memory Dump";
                charSequenceArr[38] = str26;
                alertDialog$Builder.f(charSequenceArr, new mg.j(10, this, this.b));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                profileActivity.showDialog(b2Var);
                return true;
            }
        } else {
            str4 = string2;
        }
        str5 = null;
        if (!SharedConfig.adaptableColorInBrowser) {
        }
        if (!SharedConfig.debugVideoQualities) {
        }
        String str242 = str5;
        if (Build.VERSION.SDK_INT < 28) {
        }
        if (SharedConfig.forceForumTabs) {
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        CharSequence[] charSequenceArr2 = new CharSequence[39];
        charSequenceArr2[c11] = string4;
        charSequenceArr2[1] = string5;
        charSequenceArr2[c10] = string6;
        charSequenceArr2[3] = string7;
        charSequenceArr2[4] = string;
        charSequenceArr2[5] = string8;
        charSequenceArr2[6] = string9;
        charSequenceArr2[7] = string10;
        charSequenceArr2[8] = null;
        charSequenceArr2[9] = str4;
        charSequenceArr2[10] = string11;
        charSequenceArr2[11] = str7;
        charSequenceArr2[12] = str8;
        charSequenceArr2[13] = str9;
        charSequenceArr2[14] = string12;
        charSequenceArr2[15] = string13;
        charSequenceArr2[16] = string14;
        charSequenceArr2[17] = str10;
        charSequenceArr2[18] = str3;
        charSequenceArr2[19] = str11;
        charSequenceArr2[20] = str12;
        charSequenceArr2[21] = str13;
        charSequenceArr2[22] = str14;
        charSequenceArr2[23] = string15;
        charSequenceArr2[24] = str15;
        charSequenceArr2[25] = str16;
        charSequenceArr2[26] = str17;
        charSequenceArr2[27] = str18;
        charSequenceArr2[28] = str19;
        charSequenceArr2[29] = str20;
        charSequenceArr2[30] = str21;
        charSequenceArr2[31] = str242;
        charSequenceArr2[32] = str22;
        charSequenceArr2[33] = str23;
        charSequenceArr2[34] = str6;
        charSequenceArr2[35] = "Reload app config";
        charSequenceArr2[36] = str25;
        charSequenceArr2[37] = "Make Memory Dump";
        charSequenceArr2[38] = str26;
        alertDialog$Builder.f(charSequenceArr2, new mg.j(10, this, this.b));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        profileActivity.showDialog(b2Var);
        return true;
    }
}
