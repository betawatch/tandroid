package org.telegram.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.LongSparseArray;
import java.io.File;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ rc(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.a) {
            case 0:
                sc.d(false);
                break;
            case 1:
                qs.e().k(qs.x4, new Object[0]);
                break;
            case 2:
                qs.e().k(qs.E4, new Object[0]);
                break;
            case 3:
                int i7 = LocationSharingService.d;
                for (int i10 = 0; i10 < 4; i10++) {
                    sd.f(i10).t();
                }
                break;
            case 4:
                MediaController.Y1 = null;
                MediaController.O(0);
                break;
            case 5:
                try {
                    g0.f.n(t0.b);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 6:
                org.telegram.ui.ActionBar.k6.F(false);
                break;
            case 7:
                qs.e().k(qs.d4, new Object[0]);
                break;
            case 8:
                iz.y();
                break;
            case 9:
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
                            break;
                        }
                    } else {
                        if (file2.isDirectory()) {
                            new File(file2, ".nomedia").delete();
                        }
                        if (file3.isDirectory()) {
                            new File(file3, ".nomedia").delete();
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
                break;
            case 10:
                if (!iz.b && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    iz.h0 = null;
                    iz.y();
                    int i11 = 11;
                    gc.D().i(new rc(i11));
                    iz.b = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.a.R = id.M0(2131745841, null);
                    alertDialog$Builder.a.S = id.M0(2131745840, null);
                    alertDialog$Builder.k(id.M0(2131751356, null), new ch(i11));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.setCanceledOnTouchOutside(false);
                    u1Var.show();
                    break;
                }
                break;
            case 11:
                int i12 = iz.a;
                break;
            case 12:
                rz.y = null;
                break;
            case 13:
                org.telegram.ui.ActionBar.k6.F(false);
                break;
            case 14:
                int i13 = org.telegram.ui.an.id;
                break;
            case 15:
                ch.k0.b(true);
                break;
            case 16:
                qs e11 = qs.e();
                Boolean bool = Boolean.TRUE;
                e11.k(qs.n4, Boolean.FALSE, bool, bool);
                break;
            case 17:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), d2Var);
                    break;
                }
                break;
            case 18:
                Pattern pattern = org.telegram.ui.Components.v4.a;
                break;
            case 19:
                g0.r(org.telegram.ui.Components.i5.w);
                try {
                    if (org.telegram.ui.Components.i5.r != null) {
                        for (int i14 = 0; i14 < org.telegram.ui.Components.i5.r.size(); i14++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.i5.r.valueAt(i14);
                            int i15 = 0;
                            while (i15 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.i5) longSparseArray.valueAt(i15)).a) {
                                    longSparseArray.removeAt(i15);
                                    i15--;
                                }
                                i15++;
                            }
                        }
                        break;
                    }
                } catch (Exception unused) {
                    boolean z9 = r2.a;
                    return;
                }
                break;
            case 20:
                org.telegram.ui.Components.b8 b8Var = org.telegram.ui.Components.b8.P2;
                break;
            case 21:
                vv.h();
                break;
            case 22:
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.G1.startActivity(intent);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", p10.i(Q2.getCurrentAccount()).e());
                    bundle.putInt("chatMode", 1);
                    Q2.presentFragment(new org.telegram.ui.an(bundle));
                    break;
                }
                break;
            case 24:
                MediaController.B().B0(0, 0, false, false);
                break;
            case 25:
                MediaController.B().B0(0, 0, false, false);
                break;
            case 26:
                break;
            case 27:
                int i16 = org.telegram.ui.Components.bn.r1;
                break;
            case 28:
                PhotoViewer.p1().z0(false, false);
                break;
            default:
                PhotoViewer.p1().z0(false, false);
                break;
        }
    }

    private final void a() {
    }
}
