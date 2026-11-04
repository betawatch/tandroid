package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    public /* synthetic */ jn0(oo0 oo0Var, int i3) {
        this.a = i3;
        this.b = oo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        oo0 oo0Var = this.b;
        switch (i3) {
            case 0:
                oo0Var.V0(true);
                break;
            case 1:
                oo0Var.X1.a(!r7.a.q, true);
                oo0Var.a1();
                break;
            case 2:
                org.telegram.ui.ActionBar.f1 f1Var = oo0Var.C2;
                if (f1Var != null && f1Var.isShowing()) {
                    oo0Var.C2.d(true);
                }
                oo0Var.V0(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var2 = oo0Var.C2;
                if (f1Var2 != null && f1Var2.isShowing()) {
                    oo0Var.C2.d(true);
                }
                oo0Var.V0(true);
                break;
            case 4:
                String[] strArr = oo0Var.h2;
                if (oo0Var.N1.m() == 0) {
                    if (oo0Var.g2 || strArr[0] != null) {
                        oo0Var.dismiss();
                        PhotoViewer.v1().H0(true, false);
                        if (strArr[0] != null || !oo0Var.e2) {
                            oo0Var.getContext();
                            oo0Var.M0();
                            break;
                        } else {
                            oo0Var.f2 = true;
                            Toast.makeText(oo0Var.getContext(), org.telegram.messenger.bd.M0(2131748787, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = oo0Var.h2;
                if (oo0Var.N1.m() == 0) {
                    if (oo0Var.g2 || strArr2[0] != null) {
                        oo0Var.dismiss();
                        if (strArr2[0] != null || !oo0Var.e2) {
                            oo0Var.getContext();
                            oo0Var.M0();
                            break;
                        } else {
                            oo0Var.f2 = true;
                            Toast.makeText(oo0Var.getContext(), org.telegram.messenger.bd.M0(2131748787, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = oo0Var.h2;
                if (oo0Var.N1.m() == 0) {
                    if (oo0Var.g2 || strArr3[0] != null) {
                        oo0Var.dismiss();
                        if (strArr3[0] != null || !oo0Var.e2) {
                            oo0Var.getContext();
                            oo0Var.M0();
                            break;
                        } else {
                            oo0Var.f2 = true;
                            Toast.makeText(oo0Var.getContext(), org.telegram.messenger.bd.M0(2131748787, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
