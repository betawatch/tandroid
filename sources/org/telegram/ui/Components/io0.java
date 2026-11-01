package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp0 b;

    public /* synthetic */ io0(pp0 pp0Var, int i10) {
        this.a = i10;
        this.b = pp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        pp0 pp0Var = this.b;
        switch (i10) {
            case 0:
                pp0Var.V0(true);
                break;
            case 1:
                pp0Var.W1.a(!r7.a.q, true);
                pp0Var.a1();
                break;
            case 2:
                org.telegram.ui.ActionBar.k1 k1Var = pp0Var.B2;
                if (k1Var != null && k1Var.isShowing()) {
                    pp0Var.B2.d(true);
                }
                pp0Var.V0(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.k1 k1Var2 = pp0Var.B2;
                if (k1Var2 != null && k1Var2.isShowing()) {
                    pp0Var.B2.d(true);
                }
                pp0Var.V0(true);
                break;
            case 4:
                String[] strArr = pp0Var.g2;
                if (pp0Var.M1.m() == 0) {
                    if (pp0Var.f2 || strArr[0] != null) {
                        pp0Var.dismiss();
                        PhotoViewer.v1().H0(true, false);
                        if (strArr[0] != null || !pp0Var.d2) {
                            pp0Var.getContext();
                            pp0Var.M0();
                            break;
                        } else {
                            pp0Var.e2 = true;
                            Toast.makeText(pp0Var.getContext(), org.telegram.messenger.dd.L0(2131748789, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = pp0Var.g2;
                if (pp0Var.M1.m() == 0) {
                    if (pp0Var.f2 || strArr2[0] != null) {
                        pp0Var.dismiss();
                        if (strArr2[0] != null || !pp0Var.d2) {
                            pp0Var.getContext();
                            pp0Var.M0();
                            break;
                        } else {
                            pp0Var.e2 = true;
                            Toast.makeText(pp0Var.getContext(), org.telegram.messenger.dd.L0(2131748789, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = pp0Var.g2;
                if (pp0Var.M1.m() == 0) {
                    if (pp0Var.f2 || strArr3[0] != null) {
                        pp0Var.dismiss();
                        if (strArr3[0] != null || !pp0Var.d2) {
                            pp0Var.getContext();
                            pp0Var.M0();
                            break;
                        } else {
                            pp0Var.e2 = true;
                            Toast.makeText(pp0Var.getContext(), org.telegram.messenger.dd.L0(2131748789, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
