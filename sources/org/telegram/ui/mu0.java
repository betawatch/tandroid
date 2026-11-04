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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mu0 implements org.telegram.ui.Components.hj0 {
    public int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ProfileActivity c;

    public mu0(ProfileActivity profileActivity, Context context) {
        this.c = profileActivity;
        this.b = context;
    }

    public static void a(mu0 mu0Var, Context context, int i3) {
        int i10;
        int i11;
        Long l10;
        Long l11;
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = org.telegram.messenger.hs.s1;
        int i19 = 0;
        if (i3 == 0) {
            mu0Var.c.getUserConfig().V = true;
            mu0Var.c.getUserConfig().v(false);
            ProfileActivity profileActivity = mu0Var.c;
            RectF rectF = ProfileActivity.T6;
            profileActivity.getContactsController().l();
            return;
        }
        if (i3 == 1) {
            ProfileActivity profileActivity2 = mu0Var.c;
            RectF rectF2 = ProfileActivity.T6;
            profileActivity2.getContactsController().A(0L, false);
            return;
        }
        if (i3 == 2) {
            ProfileActivity profileActivity3 = mu0Var.c;
            RectF rectF3 = ProfileActivity.T6;
            profileActivity3.getContactsController().K();
            return;
        }
        int i20 = 3;
        if (i3 == 3) {
            mu0Var.c.getMessagesController().A0();
            return;
        }
        if (i3 == 4) {
            org.telegram.messenger.r2.a = !org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.a).commit();
            ProfileActivity profileActivity4 = mu0Var.c;
            RectF rectF4 = ProfileActivity.T6;
            profileActivity4.J5();
            mu0Var.c.d.f();
            if (org.telegram.messenger.r2.a) {
                k2.p1.r(org.telegram.messenger.t0.s, new StringBuilder("app start time = "));
                try {
                    org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            return;
        }
        if (i3 == 5) {
            org.telegram.messenger.az.y0 = !org.telegram.messenger.az.y0;
            SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
            edit.putBoolean("inappCamera", org.telegram.messenger.az.y0);
            edit.apply();
            return;
        }
        int i21 = 11;
        if (i3 == 6) {
            org.telegram.messenger.qr messagesStorage = mu0Var.c.getMessagesStorage();
            messagesStorage.a.c(new org.telegram.messenger.hq(messagesStorage, i21));
            org.telegram.messenger.az.D(false);
            org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.hp.e1().edit().remove("archivehint").remove("proximityhint"), "archivehint_l", "searchpostsnew", "speedhint", "gifhint"), "reminderhint", "soundHint", "themehint", "bganimationhint"), "filterhint", "n_0", "storyprvhint", "storyhint"), "storyhint2", "storydualhint", "storysvddualhint", "stories_camera"), "dualcam", "dualmatrix", "dual_available", "archivehint"), "askNotificationsAfter", "askNotificationsDuration", "viewoncehint", "voicepausehint"), "taptostorysoundhint", "nothanos", "voiceoncehint", "savedhint"), "savedsearchhint", "savedsearchtaghint", "newppsms", "monetizationadshint"), "seekSpeedHintShowed", "unsupport_video/av01", "statusgiftpage", "multistorieshint").remove("trimvoicehint").remove("taptostoryhighlighthint").apply();
            b8.lf.a();
            i13 = ((org.telegram.ui.ActionBar.d2) mu0Var.c).currentAccount;
            org.telegram.messenger.hp.s1(i13).f7.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            org.telegram.messenger.az.J = 0;
            org.telegram.messenger.az.O = 0;
            org.telegram.messenger.az.R = false;
            org.telegram.messenger.az.P = false;
            org.telegram.messenger.az.Q = false;
            org.telegram.messenger.az.c1 = 3;
            org.telegram.messenger.az.d1 = 3;
            org.telegram.messenger.az.e1 = 3;
            org.telegram.messenger.az.v1 = 3;
            org.telegram.messenger.az.e0 = 2;
            org.telegram.messenger.az.T(2);
            org.telegram.messenger.az.H(false);
            org.telegram.messenger.az.G(false);
            org.telegram.messenger.az.C(false);
            i14 = ((org.telegram.ui.ActionBar.d2) mu0Var.c).currentAccount;
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i14);
            f10.c = 0L;
            f10.d = 0L;
            f10.h().edit().clear().apply();
            mu0Var.c.getNotificationCenter().k(i18, new Object[0]);
            gy0.b0();
            i15 = ((org.telegram.ui.ActionBar.d2) mu0Var.c).currentAccount;
            tg.k0.e(i15).a();
            SharedPreferences sharedPreferences = mu0Var.c.getMessagesController().e7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            org.telegram.messenger.k5.d(edit2, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : sharedPreferences.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    edit2.remove(str);
                }
            }
            edit2.apply();
            i16 = ((org.telegram.ui.ActionBar.d2) mu0Var.c).currentAccount;
            SharedPreferences.Editor edit3 = org.telegram.messenger.hp.s1(i16).d7.edit();
            i17 = ((org.telegram.ui.ActionBar.d2) mu0Var.c).currentAccount;
            for (String str2 : org.telegram.messenger.hp.s1(i17).d7.getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    edit3.remove(str2);
                }
            }
            edit3.apply();
            return;
        }
        if (i3 == 7) {
            org.telegram.ui.Components.voip.n1.i(mu0Var.c.getParentActivity());
            return;
        }
        if (i3 == 8) {
            org.telegram.messenger.az.z0 = !org.telegram.messenger.az.z0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.hp.e1().edit();
            edit4.putBoolean("roundCamera16to9", org.telegram.messenger.az.z0);
            edit4.apply();
            return;
        }
        if (i3 == 9) {
            ((LaunchActivity) mu0Var.c.getParentActivity()).z(true);
            return;
        }
        if (i3 == 10) {
            org.telegram.messenger.qr messagesStorage2 = mu0Var.c.getMessagesStorage();
            messagesStorage2.a.c(new org.telegram.messenger.kp(messagesStorage2, -1, i20));
            return;
        }
        if (i3 == 11) {
            org.telegram.messenger.az.V = !org.telegram.messenger.az.V;
            SharedPreferences.Editor edit5 = org.telegram.messenger.hp.e1().edit();
            edit5.putBoolean("disableVoiceAudioEffects", org.telegram.messenger.az.V);
            edit5.apply();
            return;
        }
        if (i3 == 12) {
            org.telegram.messenger.az.j1 = null;
            org.telegram.messenger.az.y();
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.Q4, new Object[0]);
            return;
        }
        if (i3 == 13) {
            Set set = mu0Var.c.getMessagesController().T3;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            mu0Var.c.getNotificationCenter().k(i18, new Object[0]);
            return;
        }
        try {
            if (i3 == 14) {
                org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(org.telegram.messenger.t0.b);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i3 == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i3 == 16) {
                org.telegram.messenger.az.K();
                Toast.makeText(mu0Var.c.getParentActivity(), org.telegram.messenger.bd.M0(org.telegram.messenger.az.J0 ? 2131751619 : 2131751620, null), 0).show();
                return;
            }
            if (i3 == 17) {
                org.telegram.messenger.az.W = !org.telegram.messenger.az.W;
                SharedPreferences.Editor edit6 = org.telegram.messenger.hp.e1().edit();
                edit6.putBoolean("forceDisableTabletMode", org.telegram.messenger.az.W);
                edit6.apply();
                Activity W = org.telegram.messenger.g0.W(context);
                Intent launchIntentForPackage = W.getPackageManager().getLaunchIntentForPackage(W.getPackageName());
                W.finishAffinity();
                W.startActivity(launchIntentForPackage);
                System.exit(0);
                return;
            }
            if (i3 == 18) {
                n9.b.a((LaunchActivity) mu0Var.c.getParentActivity(), !org.telegram.messenger.az.x1, true);
                return;
            }
            if (i3 == 19) {
                mu0Var.c.getMessagesController().R2(true);
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                mu0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ku0(mu0Var, i19));
                return;
            }
            if (i3 != 20) {
                if (i3 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu0Var.c.getParentActivity(), mu0Var.c.A0);
                    alertDialog$Builder.a.S = "Force performance class";
                    int o10 = org.telegram.messenger.az.o();
                    int v = org.telegram.messenger.az.v();
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.g0.X2((o10 == 2 ? "**HIGH**" : "HIGH").concat(v == 2 ? " (measured)" : "")), org.telegram.messenger.g0.X2((o10 == 1 ? "**AVERAGE**" : "AVERAGE").concat(v == 1 ? " (measured)" : "")), org.telegram.messenger.g0.X2((o10 == 0 ? "**LOW**" : "LOW").concat(v == 0 ? " (measured)" : ""))}, new mt(v, 1));
                    k2.p1.v("Cancel", 2131752589, alertDialog$Builder, null);
                    return;
                }
                if (i3 == 22) {
                    org.telegram.messenger.az.N();
                    return;
                }
                if (i3 == 23) {
                    boolean q10 = gi.b1.q(mu0Var.c.getParentActivity());
                    org.telegram.messenger.hp.e1().edit().putBoolean("dual_available", !q10).apply();
                    Toast.makeText(mu0Var.c.getParentActivity(), org.telegram.messenger.bd.M0(!q10 ? 2131751634 : 2131751636, null), 0).show();
                    return;
                }
                if (i3 == 24) {
                    org.telegram.messenger.az.O();
                    for (int i22 = 0; i22 < mu0Var.c.getParentLayout().getFragmentStack().size(); i22++) {
                        ((org.telegram.ui.ActionBar.d2) mu0Var.c.getParentLayout().getFragmentStack().get(i22)).clearSheets();
                    }
                    return;
                }
                if (i3 == 25) {
                    org.telegram.messenger.az.M();
                    return;
                }
                if (i3 == 26) {
                    org.telegram.messenger.az.L();
                    return;
                }
                if (i3 == 27) {
                    mu0Var.c.getMediaDataController().E0(false, true, null);
                    return;
                }
                if (i3 == 28) {
                    i11 = ((org.telegram.ui.ActionBar.d2) mu0Var.c).currentAccount;
                    org.telegram.messenger.az.Q(i11);
                    return;
                }
                if (i3 == 29) {
                    ii.r.b();
                    ii.s0.c();
                    ii.i0.a();
                    ii.o4.c();
                    return;
                }
                if (i3 == 30) {
                    org.telegram.messenger.v0.a();
                    return;
                }
                if (i3 == 31) {
                    org.telegram.messenger.az.R();
                    return;
                }
                if (i3 == 32) {
                    org.telegram.messenger.az.J();
                    return;
                }
                if (i3 == 33) {
                    org.telegram.messenger.az.R0 = !org.telegram.messenger.az.R0;
                    SharedPreferences.Editor edit7 = org.telegram.messenger.hp.e1().edit();
                    edit7.putBoolean("debugVideoQualities", org.telegram.messenger.az.R0);
                    edit7.apply();
                    return;
                }
                if (i3 == 34) {
                    org.telegram.messenger.az.V0 = !org.telegram.messenger.az.V0;
                    org.telegram.messenger.g0.a = null;
                    SharedPreferences.Editor edit8 = org.telegram.messenger.hp.e1().edit();
                    edit8.putBoolean("useSystemBoldFont", org.telegram.messenger.az.V0);
                    edit8.apply();
                    return;
                }
                if (i3 == 35) {
                    i10 = ((org.telegram.ui.ActionBar.d2) mu0Var.c).currentAccount;
                    org.telegram.messenger.hp.s1(i10).R2(true);
                    return;
                }
                if (i3 == 36) {
                    org.telegram.messenger.az.n = !org.telegram.messenger.az.n;
                    SharedPreferences.Editor edit9 = org.telegram.messenger.hp.e1().edit();
                    edit9.putBoolean("forceForumTabs", org.telegram.messenger.az.n);
                    edit9.apply();
                    return;
                }
                if (i3 == 37) {
                    org.telegram.messenger.a8.j();
                    org.telegram.messenger.a8.c(true);
                    return;
                } else {
                    if (i3 == 38) {
                        org.telegram.messenger.az.o = !org.telegram.messenger.az.o;
                        SharedPreferences.Editor edit10 = org.telegram.messenger.hp.e1().edit();
                        edit10.putBoolean("fastWallpaperDisabled", org.telegram.messenger.az.o);
                        edit10.apply();
                        return;
                    }
                    return;
                }
            }
            int i23 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) org.telegram.messenger.t0.b.getSystemService("activity")).getMemoryClass();
            StringBuilder sb2 = new StringBuilder();
            int i24 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            while (i24 < i23) {
                Long i110 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i24 + "/cpufreq/cpuinfo_min_freq");
                Long i111 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i24 + "/cpufreq/cpuinfo_cur_freq");
                Long i112 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i24 + "/cpufreq/cpuinfo_max_freq");
                Long i113 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i24 + "/cpu_capacity");
                sb2.append("#");
                sb2.append(i24);
                sb2.append(" ");
                if (i110 != null) {
                    sb2.append("min=");
                    long longValue = i110.longValue();
                    i12 = i24;
                    sb2.append(longValue / 1000);
                    sb2.append(" ");
                    j12++;
                    j11 = (i110.longValue() / 1000) + j11;
                } else {
                    i12 = i24;
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
                i24 = i12 + 1;
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
            int i25 = Build.VERSION.SDK_INT;
            sb3.append(i25);
            sb3.append(")\n");
            if (i25 >= 31) {
                sb3.append("SoC: ");
                sb3.append(Build.SOC_MANUFACTURER);
                sb3.append(", ");
                sb3.append(Build.SOC_MODEL);
                sb3.append("\n");
            }
            String j110 = org.telegram.messenger.g0.j1("/sys/kernel/gpu/gpu_model");
            if (j110 != null) {
                sb3.append("GPU: ");
                sb3.append(j110);
                Long i114 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_min_clock");
                Long i115 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_mm_min_clock");
                Long i116 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_max_clock");
                if (i114 != null) {
                    sb3.append(", min=");
                    long longValue2 = i114.longValue();
                    l10 = i115;
                    l11 = i116;
                    sb3.append(longValue2 / 1000);
                } else {
                    l10 = i115;
                    l11 = i116;
                }
                if (l10 != null) {
                    sb3.append(", mmin=");
                    sb3.append(l10.longValue() / 1000);
                }
                if (l11 != null) {
                    sb3.append(", max=");
                    sb3.append(l11.longValue() / 1000);
                }
                sb3.append("\n");
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) org.telegram.messenger.t0.b.getSystemService("activity")).getDeviceConfigurationInfo();
            sb3.append("GLES Version: ");
            sb3.append(deviceConfigurationInfo.getGlEsVersion());
            sb3.append("\nMemory: class=");
            sb3.append(org.telegram.messenger.g0.i0(memoryClass * 1048576, false, false));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) org.telegram.messenger.t0.b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb3.append(", total=");
            sb3.append(org.telegram.messenger.g0.i0(memoryInfo.totalMem, false, false));
            sb3.append(", avail=");
            sb3.append(org.telegram.messenger.g0.i0(memoryInfo.availMem, false, false));
            sb3.append(", low?=");
            sb3.append(memoryInfo.lowMemory);
            sb3.append(" (threshold=");
            sb3.append(org.telegram.messenger.g0.i0(memoryInfo.threshold, false, false));
            sb3.append(")\nCurrent class: ");
            sb3.append(org.telegram.messenger.az.x(org.telegram.messenger.az.o()));
            sb3.append(", measured: ");
            sb3.append(org.telegram.messenger.az.x(org.telegram.messenger.az.v()));
            if (i25 >= 31) {
                sb3.append(", suggest=");
                sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb3.append("\n");
            sb3.append(i23);
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
            ProfileActivity.a1(mu0Var.c, "video/avc", sb3);
            ProfileActivity.a1(mu0Var.c, "video/hevc", sb3);
            ProfileActivity.a1(mu0Var.c, "video/x-vnd.on2.vp8", sb3);
            ProfileActivity.a1(mu0Var.c, "video/x-vnd.on2.vp9", sb3);
            mu0Var.c.showDialog(new lu0(mu0Var, mu0Var.c.getParentActivity(), sb3.toString()));
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public final boolean f(int i3, View view) {
        String str;
        int i10;
        int i11;
        char c2;
        String str2;
        ProfileActivity profileActivity = this.c;
        ArrayList arrayList = profileActivity.R4;
        if (i3 != profileActivity.z3) {
            if (i3 >= profileActivity.u4 && i3 < profileActivity.v4) {
                return profileActivity.h(!profileActivity.C2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) profileActivity.C2.get(i3 - profileActivity.u4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i3 - profileActivity.u4), true, false, view);
            }
            if (i3 != profileActivity.U2) {
                if (i3 == profileActivity.H3) {
                    profileActivity.Y3(i3, view);
                    return true;
                }
                if (profileActivity.Z3(i3, view)) {
                    return true;
                }
                return profileActivity.Q4(view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f), i3, view);
            }
            if (profileActivity.Z3(i3, view)) {
                return true;
            }
            TLRPC.UserFull userFull = profileActivity.v2;
            if (userFull == null) {
                return false;
            }
            try {
                org.telegram.messenger.g0.g(UserInfoActivity.e0(userFull.birthday));
                org.telegram.ui.Components.fc.a0(profileActivity).i(org.telegram.messenger.bd.M0(2131753716, null)).j();
                return true;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return true;
            }
        }
        int i12 = this.a + 1;
        this.a = i12;
        if (i12 < 2) {
            boolean z10 = org.telegram.messenger.r2.a;
            try {
                Toast.makeText(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131751626, "DebugMenuLongPress"), 0).show();
                return true;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
        String M0 = org.telegram.messenger.bd.M0(2131751647, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        String M02 = org.telegram.messenger.bd.M0(2131751630, null);
        String M03 = org.telegram.messenger.bd.M0(2131751624, null);
        String M04 = org.telegram.messenger.bd.M0(2131751623, null);
        String M05 = org.telegram.messenger.bd.M0(2131751622, null);
        boolean z11 = org.telegram.messenger.r2.a;
        if (org.telegram.messenger.az.y0) {
            str = "DebugMenuDisableCamera";
            i10 = 2131751641;
        } else {
            str = "DebugMenuEnableCamera";
            i10 = 2131751633;
        }
        String M06 = org.telegram.messenger.bd.M0(i10, str);
        String M07 = org.telegram.messenger.bd.M0(2131751644, "DebugMenuClearMediaCache");
        String M08 = org.telegram.messenger.bd.M0(2131751646, null);
        org.telegram.messenger.t0.u();
        org.telegram.messenger.t0.n();
        String M09 = org.telegram.messenger.bd.M0(2131751645, "DebugMenuCheckAppUpdate");
        String M010 = org.telegram.messenger.bd.M0(2131751625, "DebugMenuReadAllDialogs");
        String M011 = org.telegram.messenger.bd.M0(2131751642, null);
        String M012 = org.telegram.messenger.bd.M0(org.telegram.messenger.az.J0 ? 2131751639 : 2131751631, null);
        org.telegram.messenger.g0.R1();
        String N0 = org.telegram.messenger.bd.N0(gi.b1.q(profileActivity.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        String str3 = org.telegram.messenger.az.b0 ? "back to TextureView in stories" : "use SurfaceView in stories";
        String str4 = !org.telegram.messenger.az.d0 ? "Enable Invoice Payment" : "Disable Invoice Payment";
        i11 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
        String str5 = !org.telegram.messenger.az.s(i11) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str6 = (!org.telegram.messenger.az.e() || Build.VERSION.SDK_INT < 31) ? null : org.telegram.messenger.az.a0 ? "back to cpu blur" : "use new gpu blur";
        String str7 = org.telegram.messenger.az.v0 ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
        String str8 = org.telegram.messenger.az.R0 ? "Disable video qualities debug" : "Enable video qualities debug";
        String str9 = str6;
        if (Build.VERSION.SDK_INT >= 28) {
            c2 = 28;
            str2 = org.telegram.messenger.bd.M0(org.telegram.messenger.az.V0 ? 2131751638 : 2131751621, null);
        } else {
            c2 = 28;
            str2 = null;
        }
        String str10 = !org.telegram.messenger.az.n ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
        CharSequence[] charSequenceArr = new CharSequence[39];
        charSequenceArr[0] = M02;
        charSequenceArr[1] = M03;
        charSequenceArr[2] = M04;
        charSequenceArr[3] = M05;
        charSequenceArr[4] = null;
        charSequenceArr[5] = M06;
        charSequenceArr[6] = M07;
        charSequenceArr[7] = M08;
        charSequenceArr[8] = null;
        charSequenceArr[9] = M09;
        charSequenceArr[10] = M010;
        charSequenceArr[11] = null;
        charSequenceArr[12] = null;
        charSequenceArr[13] = null;
        charSequenceArr[14] = null;
        charSequenceArr[15] = M011;
        charSequenceArr[16] = M012;
        charSequenceArr[17] = null;
        charSequenceArr[18] = null;
        charSequenceArr[19] = null;
        charSequenceArr[20] = null;
        charSequenceArr[21] = null;
        charSequenceArr[22] = null;
        charSequenceArr[23] = N0;
        charSequenceArr[24] = str3;
        charSequenceArr[25] = null;
        charSequenceArr[26] = str4;
        charSequenceArr[27] = null;
        charSequenceArr[c2] = str5;
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
        alertDialog$Builder.f(charSequenceArr, new u(9, this, this.b));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
        profileActivity.showDialog(s1Var);
        return true;
    }
}
