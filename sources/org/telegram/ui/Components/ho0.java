package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;

    public /* synthetic */ ho0(op0 op0Var, int i10) {
        this.a = i10;
        this.b = op0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        op0 op0Var = this.b;
        switch (i10) {
            case 0:
                op0Var.V0(true);
                break;
            case 1:
                op0Var.W1.a(!r7.a.q, true);
                op0Var.a1();
                break;
            case 2:
                org.telegram.ui.ActionBar.k1 k1Var = op0Var.B2;
                if (k1Var != null && k1Var.isShowing()) {
                    op0Var.B2.d(true);
                }
                op0Var.V0(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.k1 k1Var2 = op0Var.B2;
                if (k1Var2 != null && k1Var2.isShowing()) {
                    op0Var.B2.d(true);
                }
                op0Var.V0(true);
                break;
            case 4:
                String[] strArr = op0Var.g2;
                if (op0Var.M1.m() == 0) {
                    if (op0Var.f2 || strArr[0] != null) {
                        op0Var.dismiss();
                        PhotoViewer.v1().H0(true, false);
                        if (strArr[0] != null || !op0Var.d2) {
                            op0Var.getContext();
                            op0Var.M0();
                            break;
                        } else {
                            op0Var.e2 = true;
                            Toast.makeText(op0Var.getContext(), org.telegram.messenger.cd.L0(2131748789, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = op0Var.g2;
                if (op0Var.M1.m() == 0) {
                    if (op0Var.f2 || strArr2[0] != null) {
                        op0Var.dismiss();
                        if (strArr2[0] != null || !op0Var.d2) {
                            op0Var.getContext();
                            op0Var.M0();
                            break;
                        } else {
                            op0Var.e2 = true;
                            Toast.makeText(op0Var.getContext(), org.telegram.messenger.cd.L0(2131748789, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = op0Var.g2;
                if (op0Var.M1.m() == 0) {
                    if (op0Var.f2 || strArr3[0] != null) {
                        op0Var.dismiss();
                        if (strArr3[0] != null || !op0Var.d2) {
                            op0Var.getContext();
                            op0Var.M0();
                            break;
                        } else {
                            op0Var.e2 = true;
                            Toast.makeText(op0Var.getContext(), org.telegram.messenger.cd.L0(2131748789, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
