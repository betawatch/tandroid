package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ no0 b;

    public /* synthetic */ hn0(no0 no0Var, int i7) {
        this.a = i7;
        this.b = no0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        no0 no0Var = this.b;
        switch (i7) {
            case 0:
                no0Var.V0(true);
                break;
            case 1:
                no0Var.W1.a(!r7.a.q, true);
                no0Var.a1();
                break;
            case 2:
                org.telegram.ui.ActionBar.g1 g1Var = no0Var.B2;
                if (g1Var != null && g1Var.isShowing()) {
                    no0Var.B2.d(true);
                }
                no0Var.V0(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var2 = no0Var.B2;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    no0Var.B2.d(true);
                }
                no0Var.V0(true);
                break;
            case 4:
                String[] strArr = no0Var.g2;
                if (no0Var.M1.m() == 0) {
                    if (no0Var.f2 || strArr[0] != null) {
                        no0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] != null || !no0Var.d2) {
                            no0Var.getContext();
                            no0Var.M0();
                            break;
                        } else {
                            no0Var.e2 = true;
                            Toast.makeText(no0Var.getContext(), org.telegram.messenger.id.M0(2131748779, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = no0Var.g2;
                if (no0Var.M1.m() == 0) {
                    if (no0Var.f2 || strArr2[0] != null) {
                        no0Var.dismiss();
                        if (strArr2[0] != null || !no0Var.d2) {
                            no0Var.getContext();
                            no0Var.M0();
                            break;
                        } else {
                            no0Var.e2 = true;
                            Toast.makeText(no0Var.getContext(), org.telegram.messenger.id.M0(2131748779, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = no0Var.g2;
                if (no0Var.M1.m() == 0) {
                    if (no0Var.f2 || strArr3[0] != null) {
                        no0Var.dismiss();
                        if (strArr3[0] != null || !no0Var.d2) {
                            no0Var.getContext();
                            no0Var.M0();
                            break;
                        } else {
                            no0Var.e2 = true;
                            Toast.makeText(no0Var.getContext(), org.telegram.messenger.id.M0(2131748779, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
