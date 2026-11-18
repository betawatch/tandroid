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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ j2(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.h2 Q;
        int i7 = 3;
        int i10 = 0;
        switch (this.a) {
            case 0:
                return;
            case 1:
                break;
            case 2:
                ks.e().k(ks.k4, new Object[0]);
                return;
            case 3:
                KeepAliveJob.a();
                return;
            case 4:
                if (KeepAliveJob.b || KeepAliveJob.a != null) {
                    return;
                }
                try {
                    if (s2.a) {
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
            case 5:
                int i11 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) t0.b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i11 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                pc.l = SystemClock.elapsedRealtime();
                pc.m = false;
                if (i11 < 0 || i11 > 100) {
                    return;
                }
                pc.l = SystemClock.elapsedRealtime();
                if (pc.k == i11) {
                    return;
                }
                pc.k = i11;
                g0.g3(new j2(6));
                return;
            case 6:
                pc.d(false);
                return;
            case 7:
                ks.e().k(ks.z4, new Object[0]);
                return;
            case 8:
                ks.e().k(ks.G4, new Object[0]);
                return;
            case 9:
                int i12 = LocationSharingService.d;
                while (i10 < 4) {
                    qd.f(i10).t();
                    i10++;
                }
                return;
            case 10:
                MediaController.Z1 = null;
                MediaController.O(0);
                return;
            case 11:
                try {
                    g0.f.n(t0.b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 12:
                org.telegram.ui.ActionBar.n6.F(false);
                return;
            case 13:
                ks.e().k(256, new Object[0]);
                return;
            case 14:
                bz.y();
                return;
            case 15:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (s2.b) {
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
            case 16:
                if (bz.b || (Q = LaunchActivity.Q()) == null || Q.getParentActivity() == null) {
                    return;
                }
                bz.h0 = null;
                bz.y();
                ec.D().i(new j2(17));
                bz.b = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                alertDialog$Builder.a.S = gd.M0(2131745643, null);
                alertDialog$Builder.a.T = gd.M0(2131745642, null);
                alertDialog$Builder.k(gd.M0(2131751344, null), new ed(16));
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.setCanceledOnTouchOutside(false);
                u1Var.show();
                return;
            case 17:
                int i13 = bz.a;
                return;
            case 18:
                lz.y = null;
                return;
            case 19:
                org.telegram.ui.ActionBar.n6.F(false);
                return;
            case 20:
                int i14 = org.telegram.ui.bn.md;
                return;
            case 21:
                ch.l0.b(true);
                return;
            case 22:
                ks e11 = ks.e();
                Boolean bool = Boolean.TRUE;
                e11.k(ks.p4, Boolean.FALSE, bool, bool);
                return;
            case 23:
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                f2Var.a = true;
                T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), f2Var);
                return;
            case 24:
                Pattern pattern = org.telegram.ui.Components.b5.a;
                return;
            case 25:
                g0.r(org.telegram.ui.Components.o5.w);
                try {
                    if (org.telegram.ui.Components.o5.r != null) {
                        for (int i15 = 0; i15 < org.telegram.ui.Components.o5.r.size(); i15++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.o5.r.valueAt(i15);
                            int i16 = 0;
                            while (i16 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.o5) longSparseArray.valueAt(i16)).a) {
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
                    boolean z10 = s2.a;
                    return;
                }
            case 26:
                org.telegram.ui.Components.g8 g8Var = org.telegram.ui.Components.g8.T2;
                return;
            case 27:
                pv.h();
                return;
            case 28:
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.isFinishing()) {
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                intent.setFlags(268468224);
                LaunchActivity.H1.startActivity(intent);
                return;
            default:
                org.telegram.ui.ActionBar.h2 Q2 = LaunchActivity.Q();
                if (Q2 == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10.i(Q2.getCurrentAccount()).e());
                bundle.putInt("chatMode", 1);
                Q2.presentFragment(new org.telegram.ui.bn(bundle));
                return;
        }
        while (i10 < 4) {
            if (j10.i(i10).p()) {
                ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
                Utilities.e.c(new m4(i5.r(i10), i7));
            }
            i10++;
        }
    }

    private final void a() {
    }
}
