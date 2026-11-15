package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;

    public /* synthetic */ kn0(po0 po0Var, int i7) {
        this.a = i7;
        this.b = po0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        po0 po0Var = this.b;
        switch (i7) {
            case 0:
                po0Var.V0(true);
                break;
            case 1:
                po0Var.a2.a(!r7.a.q, true);
                po0Var.a1();
                break;
            case 2:
                org.telegram.ui.ActionBar.g1 g1Var = po0Var.F2;
                if (g1Var != null && g1Var.isShowing()) {
                    po0Var.F2.d(true);
                }
                po0Var.V0(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var2 = po0Var.F2;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    po0Var.F2.d(true);
                }
                po0Var.V0(true);
                break;
            case 4:
                String[] strArr = po0Var.k2;
                if (po0Var.Q1.m() == 0) {
                    if (po0Var.j2 || strArr[0] != null) {
                        po0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] != null || !po0Var.h2) {
                            po0Var.getContext();
                            po0Var.M0();
                            break;
                        } else {
                            po0Var.i2 = true;
                            Toast.makeText(po0Var.getContext(), org.telegram.messenger.hd.M0(2131748779, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = po0Var.k2;
                if (po0Var.Q1.m() == 0) {
                    if (po0Var.j2 || strArr2[0] != null) {
                        po0Var.dismiss();
                        if (strArr2[0] != null || !po0Var.h2) {
                            po0Var.getContext();
                            po0Var.M0();
                            break;
                        } else {
                            po0Var.i2 = true;
                            Toast.makeText(po0Var.getContext(), org.telegram.messenger.hd.M0(2131748779, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = po0Var.k2;
                if (po0Var.Q1.m() == 0) {
                    if (po0Var.j2 || strArr3[0] != null) {
                        po0Var.dismiss();
                        if (strArr3[0] != null || !po0Var.h2) {
                            po0Var.getContext();
                            po0Var.M0();
                            break;
                        } else {
                            po0Var.i2 = true;
                            Toast.makeText(po0Var.getContext(), org.telegram.messenger.hd.M0(2131748779, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
