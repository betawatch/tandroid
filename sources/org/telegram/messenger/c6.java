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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ c6(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.e2 Q;
        int i7 = 4;
        switch (this.a) {
            case 0:
                ns.e().k(ns.i4, new Object[0]);
                return;
            case 1:
                KeepAliveJob.a();
                return;
            case 2:
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
            case 3:
                int i10 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) t0.b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i10 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                qc.l = SystemClock.elapsedRealtime();
                qc.m = false;
                if (i10 < 0 || i10 > 100) {
                    return;
                }
                qc.l = SystemClock.elapsedRealtime();
                if (qc.k == i10) {
                    return;
                }
                qc.k = i10;
                g0.h3(new c6(i7));
                return;
            case 4:
                qc.d(false);
                return;
            case 5:
                ns.e().k(ns.x4, new Object[0]);
                return;
            case 6:
                ns.e().k(ns.E4, new Object[0]);
                return;
            case 7:
                int i11 = LocationSharingService.d;
                for (int i12 = 0; i12 < 4; i12++) {
                    rd.f(i12).t();
                }
                return;
            case 8:
                MediaController.Z1 = null;
                MediaController.O(0);
                return;
            case 9:
                try {
                    g0.f.n(t0.b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.j6.F(false);
                return;
            case 11:
                ns.e().k(ns.d4, new Object[0]);
                return;
            case 12:
                gz.y();
                return;
            case 13:
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
            case 14:
                if (gz.b || (Q = LaunchActivity.Q()) == null || Q.getParentActivity() == null) {
                    return;
                }
                gz.h0 = null;
                gz.y();
                int i13 = 15;
                fc.D().i(new c6(i13));
                gz.b = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                alertDialog$Builder.a.S = hd.M0(2131745838, null);
                alertDialog$Builder.a.T = hd.M0(2131745837, null);
                alertDialog$Builder.k(hd.M0(2131751355, null), new fd(i13));
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.setCanceledOnTouchOutside(false);
                t1Var.show();
                return;
            case 15:
                int i14 = gz.a;
                return;
            case 16:
                pz.y = null;
                return;
            case 17:
                org.telegram.ui.ActionBar.j6.F(false);
                return;
            case 18:
                int i15 = org.telegram.ui.an.ld;
                return;
            case 19:
                ch.l0.b(true);
                return;
            case 20:
                ns e11 = ns.e();
                Boolean bool = Boolean.TRUE;
                e11.k(ns.n4, Boolean.FALSE, bool, bool);
                return;
            case 21:
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                c2Var.a = true;
                T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), c2Var);
                return;
            case 22:
                Pattern pattern = org.telegram.ui.Components.t4.a;
                return;
            case 23:
                g0.r(org.telegram.ui.Components.g5.w);
                try {
                    if (org.telegram.ui.Components.g5.r != null) {
                        for (int i16 = 0; i16 < org.telegram.ui.Components.g5.r.size(); i16++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.g5.r.valueAt(i16);
                            int i17 = 0;
                            while (i17 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.g5) longSparseArray.valueAt(i17)).a) {
                                    longSparseArray.removeAt(i17);
                                    i17--;
                                }
                                i17++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    boolean z10 = r2.a;
                    return;
                }
            case 24:
                org.telegram.ui.Components.y7 y7Var = org.telegram.ui.Components.y7.T2;
                return;
            case 25:
                tv.h();
                return;
            case 26:
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.isFinishing()) {
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                intent.setFlags(268468224);
                LaunchActivity.H1.startActivity(intent);
                return;
            case 27:
                org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                if (Q2 == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", m10.i(Q2.getCurrentAccount()).e());
                bundle.putInt("chatMode", 1);
                Q2.presentFragment(new org.telegram.ui.an(bundle));
                return;
            case 28:
                MediaController.B().B0(0, 0, false, false);
                return;
            default:
                MediaController.B().B0(0, 0, false, false);
                return;
        }
    }
}
