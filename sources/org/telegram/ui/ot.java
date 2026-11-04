package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ot extends org.telegram.ui.Components.h41 {
    public static void d0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i10].equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i3));
                        } else {
                            i10++;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sb2.append("\n");
            sb2.append(arrayList.size());
            sb2.append("+");
            sb2.append(arrayList2.size());
            sb2.append(" ");
            sb2.append(str.substring(6));
            sb2.append(" codecs:\n");
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i11 > 0) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i11)).intValue());
                sb2.append("{d} ");
                sb2.append(codecInfoAt2.getName());
                sb2.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt2.isHardwareAccelerated()) {
                        sb2.append("gpu");
                    }
                    if (codecInfoAt2.isSoftwareOnly()) {
                        sb2.append("cpu");
                    }
                    if (codecInfoAt2.isVendor()) {
                        sb2.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                sb2.append("; mi=");
                sb2.append(capabilitiesForType.getMaxSupportedInstances());
                sb2.append(")");
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (i12 > 0 || !arrayList.isEmpty()) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
                sb2.append("{e} ");
                sb2.append(codecInfoAt3.getName());
                sb2.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt3.isHardwareAccelerated()) {
                        sb2.append("gpu");
                    }
                    if (codecInfoAt3.isSoftwareOnly()) {
                        sb2.append("cpu");
                    }
                    if (codecInfoAt3.isVendor()) {
                        sb2.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                sb2.append("; mi=");
                sb2.append(capabilitiesForType2.getMaxSupportedInstances());
                sb2.append(")");
            }
            sb2.append("\n");
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.f41 f41Var) {
        arrayList.add(org.telegram.ui.Components.r31.u("Contacts and chats"));
        arrayList.add(org.telegram.ui.Components.r31.e(1, org.telegram.messenger.bd.M0(2131751630, null)));
        arrayList.add(org.telegram.ui.Components.r31.e(2, org.telegram.messenger.bd.M0(2131751624, null)));
        arrayList.add(org.telegram.ui.Components.r31.e(3, org.telegram.messenger.bd.M0(2131751623, null)));
        arrayList.add(org.telegram.ui.Components.r31.e(4, org.telegram.messenger.bd.M0(2131751622, null)));
        arrayList.add(org.telegram.ui.Components.r31.e(5, org.telegram.messenger.bd.M0(2131751625, null)));
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        arrayList.add(org.telegram.ui.Components.r31.u("Data"));
        arrayList.add(org.telegram.ui.Components.r31.e(8, org.telegram.messenger.bd.M0(2131751644, null)));
        arrayList.add(org.telegram.ui.Components.r31.e(45, "Forget all hints"));
        arrayList.add(org.telegram.ui.Components.r31.e(35, "Reload app config"));
        boolean z10 = org.telegram.messenger.r2.a;
        arrayList.add(org.telegram.ui.Components.r31.e(29, "Clear Mini Apps Permissions and Files"));
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        arrayList.add(org.telegram.ui.Components.r31.u("App"));
        org.telegram.messenger.t0.u();
        org.telegram.messenger.t0.n();
        arrayList.add(org.telegram.ui.Components.r31.e(10, org.telegram.messenger.bd.M0(2131751645, null)));
        arrayList.add(org.telegram.ui.Components.r31.e(37, "Make Memory Dump"));
        org.telegram.ui.Components.r31 i3 = org.telegram.ui.Components.r31.i(42, "Experimental settings");
        xi.a aVar = xi.e.a;
        aVar.a();
        i3.L(aVar.d);
        arrayList.add(i3);
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        arrayList.add(org.telegram.ui.Components.r31.u("Interface"));
        org.telegram.messenger.g0.R1();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            org.telegram.ui.Components.r31 i11 = org.telegram.ui.Components.r31.i(34, org.telegram.messenger.bd.M0(2131751621, null));
            i11.L(org.telegram.messenger.az.V0);
            arrayList.add(i11);
        }
        if (org.telegram.messenger.az.e() && i10 >= 31) {
            org.telegram.ui.Components.r31 i12 = org.telegram.ui.Components.r31.i(31, "New GPU blur");
            i12.L(org.telegram.messenger.az.a0);
            arrayList.add(i12);
        }
        org.telegram.ui.Components.r31 i13 = org.telegram.ui.Components.r31.i(36, "Force Forum Tabs");
        i13.L(org.telegram.messenger.az.n);
        arrayList.add(i13);
        org.telegram.ui.Components.r31 i14 = org.telegram.ui.Components.r31.i(39, "Frame metrics");
        i14.L(org.telegram.messenger.az.p);
        arrayList.add(i14);
        org.telegram.ui.Components.r31 i15 = org.telegram.ui.Components.r31.i(46, org.telegram.messenger.bd.M0(2131751832, null));
        i15.L(org.telegram.messenger.az.H0);
        arrayList.add(i15);
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        arrayList.add(org.telegram.ui.Components.r31.u("Camera and media"));
        org.telegram.ui.Components.r31 i16 = org.telegram.ui.Components.r31.i(7, org.telegram.messenger.bd.M0(2131751633, null));
        i16.L(org.telegram.messenger.az.y0);
        arrayList.add(i16);
        org.telegram.ui.Components.r31 i17 = org.telegram.ui.Components.r31.i(28, "Use Camera 2 API");
        i17.L(org.telegram.messenger.az.s(this.currentAccount));
        arrayList.add(i17);
        org.telegram.ui.Components.r31 i18 = org.telegram.ui.Components.r31.i(23, org.telegram.messenger.bd.M0(2131751635, null));
        i18.L(gi.b1.q(getParentActivity()));
        arrayList.add(i18);
        org.telegram.ui.Components.r31 i19 = org.telegram.ui.Components.r31.i(24, "SurfaceView in stories");
        i19.L(org.telegram.messenger.az.b0);
        arrayList.add(i19);
        org.telegram.ui.Components.r31 i20 = org.telegram.ui.Components.r31.i(33, "Video qualities debug");
        i20.L(org.telegram.messenger.az.R0);
        arrayList.add(i20);
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        arrayList.add(org.telegram.ui.Components.r31.u("Calls"));
        arrayList.add(org.telegram.ui.Components.r31.e(9, org.telegram.messenger.bd.M0(2131751646, null)));
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        arrayList.add(org.telegram.ui.Components.r31.u("WebView"));
        arrayList.add(org.telegram.ui.Components.r31.e(15, org.telegram.messenger.bd.M0(2131751642, null)));
        org.telegram.ui.Components.r31 i21 = org.telegram.ui.Components.r31.i(16, org.telegram.messenger.bd.M0(2131751631, null));
        i21.L(org.telegram.messenger.az.J0);
        arrayList.add(i21);
        org.telegram.ui.Components.r31 i22 = org.telegram.ui.Components.r31.i(32, "Adaptive browser colors");
        i22.L(org.telegram.messenger.az.v0);
        arrayList.add(i22);
        org.telegram.ui.Components.r31 i23 = org.telegram.ui.Components.r31.i(26, "Invoice Payment");
        i23.L(org.telegram.messenger.az.d0);
        arrayList.add(i23);
        arrayList.add(org.telegram.ui.Components.r31.C(null));
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return org.telegram.messenger.bd.M0(2131751647, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0913  */
    @Override // org.telegram.ui.Components.h41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(org.telegram.ui.Components.r31 r31Var, View view) {
        boolean z10;
        Long l10;
        int i3 = 3;
        int i10 = 0;
        switch (r31Var.d) {
            case 1:
                z10 = true;
                getUserConfig().V = true;
                getUserConfig().v(false);
                getContactsController().l();
                if (r31Var.a == 4) {
                    this.a.g3.O(z10);
                    return;
                }
                return;
            case 2:
                getContactsController().A(0L, false);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 3:
                getContactsController().K();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 4:
                getMessagesController().A0();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 5:
                org.telegram.messenger.qr messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.kp(messagesStorage, -1, i3));
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 6:
                org.telegram.messenger.r2.a = !org.telegram.messenger.r2.a;
                org.telegram.messenger.t0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.a).commit();
                if (org.telegram.messenger.r2.a) {
                    k2.p1.r(org.telegram.messenger.t0.s, new StringBuilder("app start time = "));
                    try {
                        org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0).versionCode);
                    } catch (Exception e10) {
                        z10 = true;
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 7:
                org.telegram.messenger.az.y0 = !org.telegram.messenger.az.y0;
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                edit.putBoolean("inappCamera", org.telegram.messenger.az.y0);
                edit.apply();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 8:
                org.telegram.messenger.qr messagesStorage2 = getMessagesStorage();
                messagesStorage2.a.c(new org.telegram.messenger.hq(messagesStorage2, 11));
                org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.currentAccount);
                f10.c = 0L;
                f10.d = 0L;
                f10.h().edit().clear().apply();
                getMessagesController().e7.edit().remove("peerColors").remove("profilePeerColors").apply();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 9:
                org.telegram.ui.Components.voip.n1.i(getParentActivity());
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 10:
                z10 = true;
                ((LaunchActivity) getParentActivity()).z(true);
                if (r31Var.a == 4) {
                }
                break;
            case 11:
                z10 = true;
                org.telegram.messenger.az.V = !org.telegram.messenger.az.V;
                SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
                edit2.putBoolean("disableVoiceAudioEffects", org.telegram.messenger.az.V);
                edit2.apply();
                if (r31Var.a == 4) {
                }
                break;
            case 12:
                org.telegram.messenger.az.j1 = null;
                org.telegram.messenger.az.y();
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.Q4, new Object[0]);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 13:
                Set set = getMessagesController().T3;
                set.add("VALIDATE_PHONE_NUMBER");
                set.add("VALIDATE_PASSWORD");
                getNotificationCenter().k(org.telegram.messenger.hs.s1, new Object[0]);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 14:
                org.telegram.messenger.t0.b.deleteDatabase("webview.db");
                org.telegram.messenger.t0.b.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                try {
                    WebView webView = new WebView(org.telegram.messenger.t0.b);
                    webView.clearHistory();
                    webView.destroy();
                } catch (Exception unused) {
                }
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 15:
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 16:
                org.telegram.messenger.az.K();
                Toast.makeText(getParentActivity(), org.telegram.messenger.bd.M0(org.telegram.messenger.az.J0 ? 2131751619 : 2131751620, null), 0).show();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 17:
                org.telegram.messenger.az.W = !org.telegram.messenger.az.W;
                SharedPreferences.Editor edit3 = org.telegram.messenger.hp.e1().edit();
                edit3.putBoolean("forceDisableTabletMode", org.telegram.messenger.az.W);
                edit3.apply();
                Activity parentActivity = getParentActivity();
                if (parentActivity != null) {
                    Intent launchIntentForPackage = parentActivity.getPackageManager().getLaunchIntentForPackage(parentActivity.getPackageName());
                    parentActivity.finishAffinity();
                    parentActivity.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 18:
                n9.b.a((LaunchActivity) getParentActivity(), !org.telegram.messenger.az.x1, true);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 19:
                getMessagesController().R2(true);
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new lt(this, 0));
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 20:
                int i11 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) org.telegram.messenger.t0.b.getSystemService("activity")).getMemoryClass();
                StringBuilder sb2 = new StringBuilder();
                long j10 = 0;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                long j15 = 0;
                long j16 = 0;
                long j17 = 0;
                for (int i12 = 0; i12 < i11; i12++) {
                    Long i13 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_min_freq");
                    Long i14 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_cur_freq");
                    Long i15 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                    Long i16 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i12 + "/cpu_capacity");
                    sb2.append("#");
                    sb2.append(i12);
                    sb2.append(" ");
                    if (i13 != null) {
                        sb2.append("min=");
                        l10 = i14;
                        sb2.append(i13.longValue() / 1000);
                        sb2.append(" ");
                        j10 = (i13.longValue() / 1000) + j10;
                        j11++;
                    } else {
                        l10 = i14;
                    }
                    if (l10 != null) {
                        sb2.append("cur=");
                        sb2.append(l10.longValue() / 1000);
                        sb2.append(" ");
                        j12 = (l10.longValue() / 1000) + j12;
                        j13++;
                    }
                    if (i15 != null) {
                        sb2.append("max=");
                        sb2.append(i15.longValue() / 1000);
                        sb2.append(" ");
                        j14 = (i15.longValue() / 1000) + j14;
                        j15++;
                    }
                    if (i16 != null) {
                        sb2.append("cpc=");
                        sb2.append(i16);
                        sb2.append(" ");
                        j16 = i16.longValue() + j16;
                        j17++;
                    }
                    sb2.append("\n");
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Build.MANUFACTURER);
                sb3.append(", ");
                sb3.append(Build.MODEL);
                sb3.append(" (");
                sb3.append(Build.PRODUCT);
                sb3.append(", ");
                sb3.append(Build.DEVICE);
                sb3.append(")  (android ");
                int i17 = Build.VERSION.SDK_INT;
                sb3.append(i17);
                sb3.append(")\n");
                if (i17 >= 31) {
                    sb3.append("SoC: ");
                    sb3.append(Build.SOC_MANUFACTURER);
                    sb3.append(", ");
                    sb3.append(Build.SOC_MODEL);
                    sb3.append("\n");
                }
                String j18 = org.telegram.messenger.g0.j1("/sys/kernel/gpu/gpu_model");
                if (j18 != null) {
                    sb3.append("GPU: ");
                    sb3.append(j18);
                    Long i18 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_min_clock");
                    Long i19 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_mm_min_clock");
                    Long i110 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_max_clock");
                    if (i18 != null) {
                        sb3.append(", min=");
                        sb3.append(i18.longValue() / 1000);
                    }
                    if (i19 != null) {
                        sb3.append(", mmin=");
                        sb3.append(i19.longValue() / 1000);
                    }
                    if (i110 != null) {
                        sb3.append(", max=");
                        sb3.append(i110.longValue() / 1000);
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
                if (i17 >= 31) {
                    sb3.append(", suggest=");
                    sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                }
                sb3.append("\n");
                sb3.append(i11);
                sb3.append(" CPUs");
                if (j11 > 0) {
                    sb3.append(", avgMinFreq=");
                    sb3.append(j10 / j11);
                }
                if (j13 > 0) {
                    sb3.append(", avgCurFreq=");
                    sb3.append(j12 / j13);
                }
                if (j15 > 0) {
                    sb3.append(", avgMaxFreq=");
                    sb3.append(j14 / j15);
                }
                if (j17 > 0) {
                    sb3.append(", avgCapacity=");
                    sb3.append(j16 / j17);
                }
                sb3.append("\n");
                sb3.append((CharSequence) sb2);
                d0("video/avc", sb3);
                d0("video/hevc", sb3);
                d0("video/x-vnd.on2.vp8", sb3);
                d0("video/x-vnd.on2.vp9", sb3);
                showDialog(new nt(this, getParentActivity(), sb3.toString()));
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 21:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                alertDialog$Builder.a.S = "Force performance class";
                int o10 = org.telegram.messenger.az.o();
                int v = org.telegram.messenger.az.v();
                alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.g0.X2((o10 == 2 ? "**HIGH**" : "HIGH").concat(v == 2 ? " (measured)" : "")), org.telegram.messenger.g0.X2((o10 == 1 ? "**AVERAGE**" : "AVERAGE").concat(v == 1 ? " (measured)" : "")), org.telegram.messenger.g0.X2((o10 == 0 ? "**LOW**" : "LOW").concat(v == 0 ? " (measured)" : ""))}, new mt(v, 0));
                k2.p1.v(null, 2131752589, alertDialog$Builder, null);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 22:
                org.telegram.messenger.az.N();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 23:
                boolean q10 = gi.b1.q(getParentActivity());
                org.telegram.messenger.hp.e1().edit().putBoolean("dual_available", !q10).apply();
                try {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.bd.M0(!q10 ? 2131751634 : 2131751636, null), 0).show();
                } catch (Exception unused2) {
                }
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 24:
                org.telegram.messenger.az.O();
                while (i10 < getParentLayout().getFragmentStack().size()) {
                    ((org.telegram.ui.ActionBar.d2) getParentLayout().getFragmentStack().get(i10)).clearSheets();
                    i10++;
                }
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 25:
                org.telegram.messenger.az.M();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 26:
                org.telegram.messenger.az.L();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 27:
                getMediaDataController().E0(false, true, null);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 28:
                org.telegram.messenger.az.Q(this.currentAccount);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 29:
                ii.r.b();
                ii.s0.c();
                ii.i0.a();
                ii.o4.c();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case org.telegram.messenger.hs.T /* 30 */:
                org.telegram.messenger.v0.a();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case org.telegram.messenger.hs.U /* 31 */:
                org.telegram.messenger.az.R();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 32:
                org.telegram.messenger.az.J();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 33:
                org.telegram.messenger.az.R0 = !org.telegram.messenger.az.R0;
                SharedPreferences.Editor edit4 = org.telegram.messenger.hp.e1().edit();
                edit4.putBoolean("debugVideoQualities", org.telegram.messenger.az.R0);
                edit4.apply();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 34:
                org.telegram.messenger.az.V0 = !org.telegram.messenger.az.V0;
                org.telegram.messenger.g0.a = null;
                SharedPreferences.Editor edit5 = org.telegram.messenger.hp.e1().edit();
                edit5.putBoolean("useSystemBoldFont", org.telegram.messenger.az.V0);
                edit5.apply();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 35:
                org.telegram.messenger.hp.s1(this.currentAccount).R2(true);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 36:
                org.telegram.messenger.az.n = !org.telegram.messenger.az.n;
                SharedPreferences.Editor edit6 = org.telegram.messenger.hp.e1().edit();
                edit6.putBoolean("forceForumTabs", org.telegram.messenger.az.n);
                edit6.apply();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 37:
                org.telegram.messenger.a8.j();
                org.telegram.messenger.a8.c(true);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 38:
                org.telegram.messenger.az.o = !org.telegram.messenger.az.o;
                SharedPreferences.Editor edit7 = org.telegram.messenger.hp.e1().edit();
                edit7.putBoolean("fastWallpaperDisabled", org.telegram.messenger.az.o);
                edit7.apply();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 39:
                org.telegram.messenger.az.p = !org.telegram.messenger.az.p;
                SharedPreferences.Editor edit8 = org.telegram.messenger.hp.e1().edit();
                edit8.putBoolean("frameMetricsEnabled", org.telegram.messenger.az.p);
                edit8.apply();
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity != null) {
                    launchActivity.B();
                }
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 40:
            default:
                return;
            case 41:
                SharedPreferences.Editor edit9 = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                boolean z11 = !org.telegram.messenger.az.g1;
                org.telegram.messenger.az.g1 = z11;
                edit9.putBoolean("debugViewMetrics", z11).apply();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 42:
                xi.a aVar = xi.e.a;
                synchronized (aVar) {
                    if (!aVar.b) {
                        SharedPreferences sharedPreferences = xi.d.a;
                        aVar.c = sharedPreferences.contains("experimental_settings_allowed");
                        aVar.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                        aVar.b = true;
                    }
                    boolean z12 = !aVar.d;
                    aVar.d = z12;
                    aVar.c = true;
                    aVar.b = true;
                    xi.d.a.edit().putBoolean("experimental_settings_allowed", z12).apply();
                }
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 43:
                for (int i20 = 0; i20 < 4; i20++) {
                    if (org.telegram.messenger.h10.i(i20).p()) {
                        org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i20);
                        a02.a.c(new org.telegram.messenger.hq(a02, i10));
                    }
                }
                org.telegram.ui.Components.fc.a0(this).Q(R.raw.done, 36, "Widget heights cleared").j();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 44:
                org.telegram.messenger.az.K0 = !org.telegram.messenger.az.K0;
                org.telegram.messenger.hp.e1().edit().putBoolean("widgetStaticLayers", org.telegram.messenger.az.K0).apply();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 45:
                org.telegram.messenger.az.D(false);
                org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.hp.e1().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("searchpostsnew"), "speedhint", "gifhint", "reminderhint", "soundHint"), "themehint", "bganimationhint", "filterhint", "n_0"), "storyprvhint", "storyhint", "storyhint2", "storydualhint"), "storysvddualhint", "stories_camera", "dualcam", "dualmatrix"), "dual_available", "archivehint", "askNotificationsAfter", "askNotificationsDuration"), "viewoncehint", "voicepausehint", "taptostorysoundhint", "nothanos"), "voiceoncehint", "savedhint", "savedsearchhint", "savedsearchtaghint"), "newppsms", "monetizationadshint", "seekSpeedHintShowed", "unsupport_video/av01"), "statusgiftpage", "multistorieshint", "trimvoicehint", "taptostoryhighlighthint"), "proxycheckstatusip", "callmiconstart", "showchattagsinfo", "language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
                b8.lf.a();
                org.telegram.messenger.b6.a(this.currentAccount);
                org.telegram.messenger.hp.s1(this.currentAccount).f7.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
                org.telegram.messenger.hp.f1().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
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
                getNotificationCenter().k(org.telegram.messenger.hs.s1, new Object[0]);
                gy0.b0();
                tg.k0.e(this.currentAccount).a();
                SharedPreferences sharedPreferences2 = getMessagesController().e7;
                SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                edit10.remove("boostingappearance").remove("bizbothint").remove("movecaptionhint");
                for (String str : sharedPreferences2.getAll().keySet()) {
                    if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                        edit10.remove(str);
                    }
                }
                edit10.apply();
                SharedPreferences.Editor edit11 = org.telegram.messenger.hp.s1(this.currentAccount).d7.edit();
                for (String str2 : org.telegram.messenger.hp.s1(this.currentAccount).d7.getAll().keySet()) {
                    if (str2.startsWith("dialog_bar_botver")) {
                        edit11.remove(str2);
                    }
                }
                edit11.apply();
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
            case 46:
                org.telegram.messenger.az.H0 = !org.telegram.messenger.az.H0;
                SharedPreferences.Editor edit12 = org.telegram.messenger.hp.e1().edit();
                edit12.putBoolean("compactMode", org.telegram.messenger.az.H0);
                edit12.apply();
                org.telegram.ui.ActionBar.k6.k(false, false);
                z10 = true;
                if (r31Var.a == 4) {
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(org.telegram.ui.Components.r31 r31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
