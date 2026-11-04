package org.telegram.messenger;

import android.content.Intent;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.util.LongSparseArray;
import java.io.File;
import java.util.regex.Pattern;
import org.telegram.messenger.support.JobIntentService;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hc implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ hc(int i3) {
        this.a = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.d2 Q;
        int i3 = 1;
        switch (this.a) {
            case 0:
                if (KeepAliveJob.b || KeepAliveJob.a != null) {
                    return;
                }
                try {
                    if (r2.a) {
                        a8.b("starting keep-alive job");
                    }
                    synchronized (KeepAliveJob.c) {
                        KeepAliveJob.b = true;
                    }
                    JobIntentService.enqueueWork(t0.b, KeepAliveJob.class, 1000, new Intent());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                lc.d(false);
                return;
            case 2:
                int i10 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) t0.b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i10 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                lc.l = SystemClock.elapsedRealtime();
                lc.m = false;
                if (i10 < 0 || i10 > 100) {
                    return;
                }
                lc.l = SystemClock.elapsedRealtime();
                if (lc.k == i10) {
                    return;
                }
                lc.k = i10;
                g0.h3(new hc(i3));
                return;
            case 3:
                hs.e().k(hs.x4, new Object[0]);
                return;
            case 4:
                hs.e().k(hs.E4, new Object[0]);
                return;
            case 5:
                int i11 = LocationSharingService.d;
                for (int i12 = 0; i12 < 4; i12++) {
                    ld.f(i12).t();
                }
                return;
            case 6:
                MediaController.Z1 = null;
                MediaController.O(0);
                return;
            case 7:
                try {
                    g0.f.n(t0.b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 8:
                org.telegram.ui.ActionBar.k6.F(false);
                return;
            case 9:
                hs.e().k(hs.d4, new Object[0]);
                return;
            case 10:
                az.y();
                return;
            case 11:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (r2.b) {
                        if (file2.isDirectory()) {
                            g0.G(new File(file2, ".nomedia"));
                        }
                        if (file3.isDirectory()) {
                            g0.G(new File(file3, ".nomedia"));
                            return;
                        }
                        return;
                    }
                    if (file2.isDirectory()) {
                        new File(file2, ".nomedia").delete();
                    }
                    if (file3.isDirectory()) {
                        new File(file3, ".nomedia").delete();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    return;
                }
            case 12:
                if (az.b || (Q = LaunchActivity.Q()) == null || Q.getParentActivity() == null) {
                    return;
                }
                az.h0 = null;
                az.y();
                zb.D().i(new hc(13));
                az.b = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                alertDialog$Builder.a.S = bd.M0(2131745848, null);
                alertDialog$Builder.a.T = bd.M0(2131745847, null);
                alertDialog$Builder.k(bd.M0(2131751356, null), new go(8));
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.setCanceledOnTouchOutside(false);
                s1Var.show();
                return;
            case 13:
                int i13 = az.a;
                return;
            case 14:
                jz.y = null;
                return;
            case 15:
                org.telegram.ui.ActionBar.k6.F(false);
                return;
            case 16:
                int i14 = org.telegram.ui.wm.jd;
                return;
            case 17:
                dh.j0.b(true);
                return;
            case 18:
                hs e11 = hs.e();
                Boolean bool = Boolean.TRUE;
                e11.k(hs.n4, Boolean.FALSE, bool, bool);
                return;
            case 19:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                b2Var.a = true;
                T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), b2Var);
                return;
            case 20:
                Pattern pattern = org.telegram.ui.Components.t4.a;
                return;
            case 21:
                g0.r(org.telegram.ui.Components.g5.w);
                try {
                    if (org.telegram.ui.Components.g5.r != null) {
                        for (int i15 = 0; i15 < org.telegram.ui.Components.g5.r.size(); i15++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.g5.r.valueAt(i15);
                            int i16 = 0;
                            while (i16 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.g5) longSparseArray.valueAt(i16)).a) {
                                    longSparseArray.removeAt(i16);
                                    i16--;
                                }
                                i16++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    boolean z10 = r2.a;
                    return;
                }
            case 22:
                org.telegram.ui.Components.z7 z7Var = org.telegram.ui.Components.z7.Q2;
                return;
            case 23:
                nv.h();
                return;
            case 24:
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity == null || launchActivity.isFinishing()) {
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                intent.setFlags(268468224);
                LaunchActivity.K1.startActivity(intent);
                return;
            case 25:
                org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                if (Q2 == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", h10.i(Q2.getCurrentAccount()).e());
                bundle.putInt("chatMode", 1);
                Q2.presentFragment(new org.telegram.ui.wm(bundle));
                return;
            case 26:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 27:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 28:
                return;
            default:
                int i17 = org.telegram.ui.Components.an.s1;
                return;
        }
    }

    private final void a() {
    }
}
