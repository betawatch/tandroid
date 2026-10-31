package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gw0 implements org.telegram.ui.Components.ik0 {
    public int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ProfileActivity c;

    public gw0(ProfileActivity profileActivity, Context context) {
        this.c = profileActivity;
        this.b = context;
    }

    public static void a(gw0 gw0Var, Context context, int i10) {
        int i11;
        int i12;
        Long l4;
        Long l10;
        int i13;
        long j10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = org.telegram.messenger.zs.s1;
        int i20 = 0;
        if (i10 == 0) {
            gw0Var.c.getUserConfig().U = true;
            gw0Var.c.getUserConfig().v(false);
            ProfileActivity profileActivity = gw0Var.c;
            RectF rectF = ProfileActivity.R6;
            profileActivity.getContactsController().l();
            return;
        }
        if (i10 == 1) {
            ProfileActivity profileActivity2 = gw0Var.c;
            RectF rectF2 = ProfileActivity.R6;
            profileActivity2.getContactsController().A(0L, false);
            return;
        }
        if (i10 == 2) {
            ProfileActivity profileActivity3 = gw0Var.c;
            RectF rectF3 = ProfileActivity.R6;
            profileActivity3.getContactsController().K();
            return;
        }
        int i21 = 3;
        if (i10 == 3) {
            gw0Var.c.getMessagesController().A0();
            return;
        }
        if (i10 == 4) {
            org.telegram.messenger.v2.a = !org.telegram.messenger.v2.a;
            org.telegram.messenger.w0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.v2.a).commit();
            ProfileActivity profileActivity4 = gw0Var.c;
            RectF rectF4 = ProfileActivity.R6;
            profileActivity4.I5();
            gw0Var.c.d.f();
            if (org.telegram.messenger.v2.a) {
                i0.a.q(org.telegram.messenger.w0.s, new StringBuilder("app start time = "));
                try {
                    org.telegram.messenger.f8.b("buildVersion = " + org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            }
            return;
        }
        if (i10 == 5) {
            org.telegram.messenger.tz.y0 = !org.telegram.messenger.tz.y0;
            SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
            edit.putBoolean("inappCamera", org.telegram.messenger.tz.y0);
            edit.apply();
            return;
        }
        int i22 = 11;
        if (i10 == 6) {
            org.telegram.messenger.hs messagesStorage = gw0Var.c.getMessagesStorage();
            messagesStorage.a.c(new org.telegram.messenger.br(messagesStorage, i22));
            org.telegram.messenger.tz.D(false);
            org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.m5.d(org.telegram.messenger.vp.d1().edit().remove("archivehint").remove("proximityhint"), "archivehint_l", "searchpostsnew", "speedhint", "gifhint"), "reminderhint", "soundHint", "themehint", "bganimationhint"), "filterhint", "n_0", "storyprvhint", "storyhint"), "storyhint2", "storydualhint", "storysvddualhint", "stories_camera"), "dualcam", "dualmatrix", "dual_available", "archivehint"), "askNotificationsAfter", "askNotificationsDuration", "viewoncehint", "voicepausehint"), "taptostorysoundhint", "nothanos", "voiceoncehint", "savedhint"), "savedsearchhint", "savedsearchtaghint", "newppsms", "monetizationadshint"), "seekSpeedHintShowed", "unsupport_video/av01", "statusgiftpage", "multistorieshint").remove("trimvoicehint").remove("taptostoryhighlighthint").apply();
            w7.a6.a();
            i14 = ((org.telegram.ui.ActionBar.k2) gw0Var.c).currentAccount;
            org.telegram.messenger.vp.r1(i14).g7.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            org.telegram.messenger.tz.J = 0;
            org.telegram.messenger.tz.O = 0;
            org.telegram.messenger.tz.R = false;
            org.telegram.messenger.tz.P = false;
            org.telegram.messenger.tz.Q = false;
            org.telegram.messenger.tz.c1 = 3;
            org.telegram.messenger.tz.d1 = 3;
            org.telegram.messenger.tz.e1 = 3;
            org.telegram.messenger.tz.v1 = 3;
            org.telegram.messenger.tz.e0 = 2;
            org.telegram.messenger.tz.T(2);
            org.telegram.messenger.tz.H(false);
            org.telegram.messenger.tz.G(false);
            org.telegram.messenger.tz.C(false);
            i15 = ((org.telegram.ui.ActionBar.k2) gw0Var.c).currentAccount;
            org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(i15);
            f7.c = 0L;
            f7.d = 0L;
            f7.h().edit().clear().apply();
            gw0Var.c.getNotificationCenter().k(i19, new Object[0]);
            e01.a0();
            i16 = ((org.telegram.ui.ActionBar.k2) gw0Var.c).currentAccount;
            ig.s0.e(i16).a();
            SharedPreferences sharedPreferences = gw0Var.c.getMessagesController().f7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            org.telegram.messenger.m5.d(edit2, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : sharedPreferences.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    edit2.remove(str);
                }
            }
            edit2.apply();
            i17 = ((org.telegram.ui.ActionBar.k2) gw0Var.c).currentAccount;
            SharedPreferences.Editor edit3 = org.telegram.messenger.vp.r1(i17).e7.edit();
            i18 = ((org.telegram.ui.ActionBar.k2) gw0Var.c).currentAccount;
            for (String str2 : org.telegram.messenger.vp.r1(i18).e7.getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    edit3.remove(str2);
                }
            }
            edit3.apply();
            return;
        }
        if (i10 == 7) {
            org.telegram.ui.Components.voip.m1.i(gw0Var.c.getParentActivity());
            return;
        }
        if (i10 == 8) {
            org.telegram.messenger.tz.z0 = !org.telegram.messenger.tz.z0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.vp.d1().edit();
            edit4.putBoolean("roundCamera16to9", org.telegram.messenger.tz.z0);
            edit4.apply();
            return;
        }
        if (i10 == 9) {
            ((LaunchActivity) gw0Var.c.getParentActivity()).z(true);
            return;
        }
        if (i10 == 10) {
            org.telegram.messenger.hs messagesStorage2 = gw0Var.c.getMessagesStorage();
            messagesStorage2.a.c(new org.telegram.messenger.yp(messagesStorage2, -1, i21));
            return;
        }
        if (i10 == 11) {
            org.telegram.messenger.tz.V = !org.telegram.messenger.tz.V;
            SharedPreferences.Editor edit5 = org.telegram.messenger.vp.d1().edit();
            edit5.putBoolean("disableVoiceAudioEffects", org.telegram.messenger.tz.V);
            edit5.apply();
            return;
        }
        if (i10 == 12) {
            org.telegram.messenger.tz.j1 = null;
            org.telegram.messenger.tz.y();
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.Q4, new Object[0]);
            return;
        }
        if (i10 == 13) {
            Set set = gw0Var.c.getMessagesController().U3;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            gw0Var.c.getNotificationCenter().k(i19, new Object[0]);
            return;
        }
        try {
            if (i10 == 14) {
                org.telegram.messenger.w0.b.deleteDatabase("webview.db");
                org.telegram.messenger.w0.b.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(org.telegram.messenger.w0.b);
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
                org.telegram.messenger.tz.K();
                Toast.makeText(gw0Var.c.getParentActivity(), org.telegram.messenger.cd.L0(org.telegram.messenger.tz.J0 ? 2131751619 : 2131751620, null), 0).show();
                return;
            }
            if (i10 == 17) {
                org.telegram.messenger.tz.W = !org.telegram.messenger.tz.W;
                SharedPreferences.Editor edit6 = org.telegram.messenger.vp.d1().edit();
                edit6.putBoolean("forceDisableTabletMode", org.telegram.messenger.tz.W);
                edit6.apply();
                Activity W = org.telegram.messenger.i0.W(context);
                Intent launchIntentForPackage = W.getPackageManager().getLaunchIntentForPackage(W.getPackageName());
                W.finishAffinity();
                W.startActivity(launchIntentForPackage);
                System.exit(0);
                return;
            }
            if (i10 == 18) {
                v7.h7.a((LaunchActivity) gw0Var.c.getParentActivity(), !org.telegram.messenger.tz.x1, true);
                return;
            }
            if (i10 == 19) {
                gw0Var.c.getMessagesController().P2(true);
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                gw0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ew0(gw0Var, i20));
                return;
            }
            if (i10 != 20) {
                if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gw0Var.c.getParentActivity(), gw0Var.c.z0);
                    alertDialog$Builder.a.R = "Force performance class";
                    int o10 = org.telegram.messenger.tz.o();
                    int v = org.telegram.messenger.tz.v();
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.i0.W2((o10 == 2 ? "**HIGH**" : "HIGH").concat(v == 2 ? " (measured)" : "")), org.telegram.messenger.i0.W2((o10 == 1 ? "**AVERAGE**" : "AVERAGE").concat(v == 1 ? " (measured)" : "")), org.telegram.messenger.i0.W2((o10 == 0 ? "**LOW**" : "LOW").concat(v == 0 ? " (measured)" : ""))}, new qu(v, 1));
                    i0.a.s("Cancel", 2131752589, alertDialog$Builder, null);
                    return;
                }
                if (i10 == 22) {
                    org.telegram.messenger.tz.N();
                    return;
                }
                if (i10 == 23) {
                    boolean q6 = vh.u0.q(gw0Var.c.getParentActivity());
                    org.telegram.messenger.vp.d1().edit().putBoolean("dual_available", !q6).apply();
                    Toast.makeText(gw0Var.c.getParentActivity(), org.telegram.messenger.cd.L0(!q6 ? 2131751634 : 2131751636, null), 0).show();
                    return;
                }
                if (i10 == 24) {
                    org.telegram.messenger.tz.O();
                    for (int i23 = 0; i23 < gw0Var.c.getParentLayout().getFragmentStack().size(); i23++) {
                        ((org.telegram.ui.ActionBar.k2) gw0Var.c.getParentLayout().getFragmentStack().get(i23)).clearSheets();
                    }
                    return;
                }
                if (i10 == 25) {
                    org.telegram.messenger.tz.M();
                    return;
                }
                if (i10 == 26) {
                    org.telegram.messenger.tz.L();
                    return;
                }
                if (i10 == 27) {
                    gw0Var.c.getMediaDataController().E0(false, true, null);
                    return;
                }
                if (i10 == 28) {
                    i12 = ((org.telegram.ui.ActionBar.k2) gw0Var.c).currentAccount;
                    org.telegram.messenger.tz.Q(i12);
                    return;
                }
                if (i10 == 29) {
                    xh.n.b();
                    xh.o0.c();
                    xh.f0.a();
                    xh.q3.c();
                    return;
                }
                if (i10 == 30) {
                    org.telegram.messenger.y0.a();
                    return;
                }
                if (i10 == 31) {
                    org.telegram.messenger.tz.R();
                    return;
                }
                if (i10 == 32) {
                    org.telegram.messenger.tz.J();
                    return;
                }
                if (i10 == 33) {
                    org.telegram.messenger.tz.R0 = !org.telegram.messenger.tz.R0;
                    SharedPreferences.Editor edit7 = org.telegram.messenger.vp.d1().edit();
                    edit7.putBoolean("debugVideoQualities", org.telegram.messenger.tz.R0);
                    edit7.apply();
                    return;
                }
                if (i10 == 34) {
                    org.telegram.messenger.tz.V0 = !org.telegram.messenger.tz.V0;
                    org.telegram.messenger.i0.a = null;
                    SharedPreferences.Editor edit8 = org.telegram.messenger.vp.d1().edit();
                    edit8.putBoolean("useSystemBoldFont", org.telegram.messenger.tz.V0);
                    edit8.apply();
                    return;
                }
                if (i10 == 35) {
                    i11 = ((org.telegram.ui.ActionBar.k2) gw0Var.c).currentAccount;
                    org.telegram.messenger.vp.r1(i11).P2(true);
                    return;
                }
                if (i10 == 36) {
                    org.telegram.messenger.tz.n = !org.telegram.messenger.tz.n;
                    SharedPreferences.Editor edit9 = org.telegram.messenger.vp.d1().edit();
                    edit9.putBoolean("forceForumTabs", org.telegram.messenger.tz.n);
                    edit9.apply();
                    return;
                }
                if (i10 == 37) {
                    org.telegram.messenger.f8.j();
                    org.telegram.messenger.f8.c(true);
                    return;
                } else {
                    if (i10 == 38) {
                        org.telegram.messenger.tz.o = !org.telegram.messenger.tz.o;
                        SharedPreferences.Editor edit10 = org.telegram.messenger.vp.d1().edit();
                        edit10.putBoolean("fastWallpaperDisabled", org.telegram.messenger.tz.o);
                        edit10.apply();
                        return;
                    }
                    return;
                }
            }
            int i24 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) org.telegram.messenger.w0.b.getSystemService("activity")).getMemoryClass();
            StringBuilder sb2 = new StringBuilder();
            int i25 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            while (i25 < i24) {
                Long i110 = org.telegram.messenger.i0.i1("/sys/devices/system/cpu/cpu" + i25 + "/cpufreq/cpuinfo_min_freq");
                Long i111 = org.telegram.messenger.i0.i1("/sys/devices/system/cpu/cpu" + i25 + "/cpufreq/cpuinfo_cur_freq");
                Long i112 = org.telegram.messenger.i0.i1("/sys/devices/system/cpu/cpu" + i25 + "/cpufreq/cpuinfo_max_freq");
                Long i113 = org.telegram.messenger.i0.i1("/sys/devices/system/cpu/cpu" + i25 + "/cpu_capacity");
                sb2.append("#");
                sb2.append(i25);
                sb2.append(" ");
                if (i110 != null) {
                    sb2.append("min=");
                    long longValue = i110.longValue();
                    i13 = i25;
                    sb2.append(longValue / 1000);
                    sb2.append(" ");
                    j12++;
                    j11 = (i110.longValue() / 1000) + j11;
                } else {
                    i13 = i25;
                }
                if (i111 != null) {
                    sb2.append("cur=");
                    j10 = j11;
                    sb2.append(i111.longValue() / 1000);
                    sb2.append(" ");
                    j13 += i111.longValue() / 1000;
                    j14++;
                } else {
                    j10 = j11;
                }
                if (i112 != null) {
                    sb2.append("max=");
                    sb2.append(i112.longValue() / 1000);
                    sb2.append(" ");
                    j15 = (i112.longValue() / 1000) + j15;
                    j16++;
                }
                if (i113 != null) {
                    sb2.append("cpc=");
                    sb2.append(i113);
                    sb2.append(" ");
                    j17 = i113.longValue() + j17;
                    j18++;
                }
                sb2.append("\n");
                i25 = i13 + 1;
                j11 = j10;
            }
            long j19 = j11;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Build.MANUFACTURER);
            sb3.append(", ");
            sb3.append(Build.MODEL);
            sb3.append(" (");
            sb3.append(Build.PRODUCT);
            sb3.append(", ");
            sb3.append(Build.DEVICE);
            sb3.append(")  (android ");
            int i26 = Build.VERSION.SDK_INT;
            sb3.append(i26);
            sb3.append(")\n");
            if (i26 >= 31) {
                sb3.append("SoC: ");
                sb3.append(Build.SOC_MANUFACTURER);
                sb3.append(", ");
                sb3.append(Build.SOC_MODEL);
                sb3.append("\n");
            }
            String j110 = org.telegram.messenger.i0.j1("/sys/kernel/gpu/gpu_model");
            if (j110 != null) {
                sb3.append("GPU: ");
                sb3.append(j110);
                Long i114 = org.telegram.messenger.i0.i1("/sys/kernel/gpu/gpu_min_clock");
                Long i115 = org.telegram.messenger.i0.i1("/sys/kernel/gpu/gpu_mm_min_clock");
                Long i116 = org.telegram.messenger.i0.i1("/sys/kernel/gpu/gpu_max_clock");
                if (i114 != null) {
                    sb3.append(", min=");
                    long longValue2 = i114.longValue();
                    l4 = i115;
                    l10 = i116;
                    sb3.append(longValue2 / 1000);
                } else {
                    l4 = i115;
                    l10 = i116;
                }
                if (l4 != null) {
                    sb3.append(", mmin=");
                    sb3.append(l4.longValue() / 1000);
                }
                if (l10 != null) {
                    sb3.append(", max=");
                    sb3.append(l10.longValue() / 1000);
                }
                sb3.append("\n");
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) org.telegram.messenger.w0.b.getSystemService("activity")).getDeviceConfigurationInfo();
            sb3.append("GLES Version: ");
            sb3.append(deviceConfigurationInfo.getGlEsVersion());
            sb3.append("\nMemory: class=");
            sb3.append(org.telegram.messenger.i0.i0(memoryClass * 1048576, false, false));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) org.telegram.messenger.w0.b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb3.append(", total=");
            sb3.append(org.telegram.messenger.i0.i0(memoryInfo.totalMem, false, false));
            sb3.append(", avail=");
            sb3.append(org.telegram.messenger.i0.i0(memoryInfo.availMem, false, false));
            sb3.append(", low?=");
            sb3.append(memoryInfo.lowMemory);
            sb3.append(" (threshold=");
            sb3.append(org.telegram.messenger.i0.i0(memoryInfo.threshold, false, false));
            sb3.append(")\nCurrent class: ");
            sb3.append(org.telegram.messenger.tz.x(org.telegram.messenger.tz.o()));
            sb3.append(", measured: ");
            sb3.append(org.telegram.messenger.tz.x(org.telegram.messenger.tz.v()));
            if (i26 >= 31) {
                sb3.append(", suggest=");
                sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb3.append("\n");
            sb3.append(i24);
            sb3.append(" CPUs");
            if (j12 > 0) {
                sb3.append(", avgMinFreq=");
                sb3.append(j19 / j12);
            }
            if (j14 > 0) {
                sb3.append(", avgCurFreq=");
                sb3.append(j13 / j14);
            }
            if (j16 > 0) {
                sb3.append(", avgMaxFreq=");
                sb3.append(j15 / j16);
            }
            if (j18 > 0) {
                sb3.append(", avgCapacity=");
                sb3.append(j17 / j18);
            }
            sb3.append("\n");
            sb3.append((CharSequence) sb2);
            ProfileActivity.Z0(gw0Var.c, "video/avc", sb3);
            ProfileActivity.Z0(gw0Var.c, "video/hevc", sb3);
            ProfileActivity.Z0(gw0Var.c, "video/x-vnd.on2.vp8", sb3);
            ProfileActivity.Z0(gw0Var.c, "video/x-vnd.on2.vp9", sb3);
            gw0Var.c.showDialog(new fw0(gw0Var, gw0Var.c.getParentActivity(), sb3.toString()));
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public final boolean f(int i10, View view) {
        String str;
        int i11;
        int i12;
        char c10;
        String str2;
        ProfileActivity profileActivity = this.c;
        ArrayList arrayList = profileActivity.Q4;
        if (i10 != profileActivity.y3) {
            if (i10 >= profileActivity.t4 && i10 < profileActivity.u4) {
                return profileActivity.h(!profileActivity.B2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) profileActivity.B2.get(i10 - profileActivity.t4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i10 - profileActivity.t4), true, false, view);
            }
            if (i10 != profileActivity.T2) {
                if (i10 == profileActivity.G3) {
                    profileActivity.X3(i10, view);
                    return true;
                }
                if (profileActivity.Y3(i10, view)) {
                    return true;
                }
                return profileActivity.P4(view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f), i10, view);
            }
            if (profileActivity.Y3(i10, view)) {
                return true;
            }
            TLRPC.UserFull userFull = profileActivity.u2;
            if (userFull == null) {
                return false;
            }
            try {
                org.telegram.messenger.i0.g(UserInfoActivity.d0(userFull.birthday));
                org.telegram.ui.Components.cc.a0(profileActivity).i(org.telegram.messenger.cd.L0(2131753716, null)).j();
                return true;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return true;
            }
        }
        int i13 = this.a + 1;
        this.a = i13;
        if (i13 < 2) {
            boolean z10 = org.telegram.messenger.v2.a;
            try {
                Toast.makeText(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131751626, "DebugMenuLongPress"), 0).show();
                return true;
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
        String L0 = org.telegram.messenger.cd.L0(2131751647, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        String L02 = org.telegram.messenger.cd.L0(2131751630, null);
        String L03 = org.telegram.messenger.cd.L0(2131751624, null);
        String L04 = org.telegram.messenger.cd.L0(2131751623, null);
        String L05 = org.telegram.messenger.cd.L0(2131751622, null);
        boolean z11 = org.telegram.messenger.v2.a;
        if (org.telegram.messenger.tz.y0) {
            str = "DebugMenuDisableCamera";
            i11 = 2131751641;
        } else {
            str = "DebugMenuEnableCamera";
            i11 = 2131751633;
        }
        String L06 = org.telegram.messenger.cd.L0(i11, str);
        String L07 = org.telegram.messenger.cd.L0(2131751644, "DebugMenuClearMediaCache");
        String L08 = org.telegram.messenger.cd.L0(2131751646, null);
        org.telegram.messenger.w0.u();
        org.telegram.messenger.w0.n();
        String L09 = org.telegram.messenger.cd.L0(2131751645, "DebugMenuCheckAppUpdate");
        String L010 = org.telegram.messenger.cd.L0(2131751625, "DebugMenuReadAllDialogs");
        String L011 = org.telegram.messenger.cd.L0(2131751642, null);
        String L012 = org.telegram.messenger.cd.L0(org.telegram.messenger.tz.J0 ? 2131751639 : 2131751631, null);
        org.telegram.messenger.i0.R1();
        String M0 = org.telegram.messenger.cd.M0(vh.u0.q(profileActivity.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        String str3 = org.telegram.messenger.tz.b0 ? "back to TextureView in stories" : "use SurfaceView in stories";
        String str4 = !org.telegram.messenger.tz.d0 ? "Enable Invoice Payment" : "Disable Invoice Payment";
        i12 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
        String str5 = !org.telegram.messenger.tz.s(i12) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str6 = (!org.telegram.messenger.tz.e() || Build.VERSION.SDK_INT < 31) ? null : org.telegram.messenger.tz.a0 ? "back to cpu blur" : "use new gpu blur";
        String str7 = org.telegram.messenger.tz.v0 ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
        String str8 = org.telegram.messenger.tz.R0 ? "Disable video qualities debug" : "Enable video qualities debug";
        String str9 = str6;
        if (Build.VERSION.SDK_INT >= 28) {
            c10 = 28;
            str2 = org.telegram.messenger.cd.L0(org.telegram.messenger.tz.V0 ? 2131751638 : 2131751621, null);
        } else {
            c10 = 28;
            str2 = null;
        }
        String str10 = !org.telegram.messenger.tz.n ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
        CharSequence[] charSequenceArr = new CharSequence[39];
        charSequenceArr[0] = L02;
        charSequenceArr[1] = L03;
        charSequenceArr[2] = L04;
        charSequenceArr[3] = L05;
        charSequenceArr[4] = null;
        charSequenceArr[5] = L06;
        charSequenceArr[6] = L07;
        charSequenceArr[7] = L08;
        charSequenceArr[8] = null;
        charSequenceArr[9] = L09;
        charSequenceArr[10] = L010;
        charSequenceArr[11] = null;
        charSequenceArr[12] = null;
        charSequenceArr[13] = null;
        charSequenceArr[14] = null;
        charSequenceArr[15] = L011;
        charSequenceArr[16] = L012;
        charSequenceArr[17] = null;
        charSequenceArr[18] = null;
        charSequenceArr[19] = null;
        charSequenceArr[20] = null;
        charSequenceArr[21] = null;
        charSequenceArr[22] = null;
        charSequenceArr[23] = M0;
        charSequenceArr[24] = str3;
        charSequenceArr[25] = null;
        charSequenceArr[26] = str4;
        charSequenceArr[27] = null;
        charSequenceArr[c10] = str5;
        charSequenceArr[29] = "Clear Mini Apps Permissions and Files";
        charSequenceArr[30] = null;
        charSequenceArr[31] = str9;
        charSequenceArr[32] = str7;
        charSequenceArr[33] = str8;
        charSequenceArr[34] = str2;
        charSequenceArr[35] = "Reload app config";
        charSequenceArr[36] = str10;
        charSequenceArr[37] = "Make Memory Dump";
        charSequenceArr[38] = null;
        alertDialog$Builder.f(charSequenceArr, new eg.j(11, this, this.b));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
        profileActivity.showDialog(x1Var);
        return true;
    }
}
