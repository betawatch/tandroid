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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ pd(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.a) {
            case 0:
                qs.e().k(qs.E4, new Object[0]);
                break;
            case 1:
                int i7 = LocationSharingService.d;
                for (int i10 = 0; i10 < 4; i10++) {
                    sd.f(i10).t();
                }
                break;
            case 2:
                MediaController.Y1 = null;
                MediaController.O(0);
                break;
            case 3:
                try {
                    g0.f.n(t0.b);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 4:
                org.telegram.ui.ActionBar.k6.F(false);
                break;
            case 5:
                qs.e().k(qs.d4, new Object[0]);
                break;
            case 6:
                iz.y();
                break;
            case 7:
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
            case 8:
                if (!iz.b && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    iz.h0 = null;
                    iz.y();
                    gc.D().i(new pd(9));
                    iz.b = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                    alertDialog$Builder.a.R = hd.M0(2131745839, null);
                    alertDialog$Builder.a.S = hd.M0(2131745838, null);
                    alertDialog$Builder.k(hd.M0(2131751356, null), new ch(11));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.setCanceledOnTouchOutside(false);
                    u1Var.show();
                    break;
                }
                break;
            case 9:
                int i11 = iz.a;
                break;
            case 10:
                rz.y = null;
                break;
            case 11:
                org.telegram.ui.ActionBar.k6.F(false);
                break;
            case 12:
                int i12 = org.telegram.ui.an.id;
                break;
            case 13:
                ch.k0.b(true);
                break;
            case 14:
                qs e11 = qs.e();
                Boolean bool = Boolean.TRUE;
                e11.k(qs.n4, Boolean.FALSE, bool, bool);
                break;
            case 15:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), d2Var);
                    break;
                }
                break;
            case 16:
                Pattern pattern = org.telegram.ui.Components.v4.a;
                break;
            case 17:
                g0.r(org.telegram.ui.Components.i5.w);
                try {
                    if (org.telegram.ui.Components.i5.r != null) {
                        for (int i13 = 0; i13 < org.telegram.ui.Components.i5.r.size(); i13++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.i5.r.valueAt(i13);
                            int i14 = 0;
                            while (i14 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.i5) longSparseArray.valueAt(i14)).a) {
                                    longSparseArray.removeAt(i14);
                                    i14--;
                                }
                                i14++;
                            }
                        }
                        break;
                    }
                } catch (Exception unused) {
                    boolean z9 = r2.a;
                    return;
                }
                break;
            case 18:
                org.telegram.ui.Components.b8 b8Var = org.telegram.ui.Components.b8.P2;
                break;
            case 19:
                vv.h();
                break;
            case 20:
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.G1.startActivity(intent);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", p10.i(Q2.getCurrentAccount()).e());
                    bundle.putInt("chatMode", 1);
                    Q2.presentFragment(new org.telegram.ui.an(bundle));
                    break;
                }
                break;
            case 22:
                MediaController.B().B0(0, 0, false, false);
                break;
            case 23:
                MediaController.B().B0(0, 0, false, false);
                break;
            case 24:
                break;
            case 25:
                int i15 = org.telegram.ui.Components.bn.r1;
                break;
            case 26:
                PhotoViewer.p1().z0(false, false);
                break;
            case 27:
                PhotoViewer.p1().z0(false, false);
                break;
            case 28:
                int[] iArr = org.telegram.ui.Components.ys.X1;
                break;
            default:
                qs.e().k(qs.F2, new Object[0]);
                break;
        }
    }

    private final void a() {
    }
}
