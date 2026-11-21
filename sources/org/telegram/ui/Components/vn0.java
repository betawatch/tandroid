package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ vn0(ap0 ap0Var, int i7) {
        this.a = i7;
        this.b = ap0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        ap0 ap0Var = this.b;
        switch (i7) {
            case 0:
                ap0Var.W0(true);
                break;
            case 1:
                ap0Var.a2.a(!r7.a.q, true);
                ap0Var.b1();
                break;
            case 2:
                org.telegram.ui.ActionBar.g1 g1Var = ap0Var.F2;
                if (g1Var != null && g1Var.isShowing()) {
                    ap0Var.F2.d(true);
                }
                ap0Var.W0(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var2 = ap0Var.F2;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    ap0Var.F2.d(true);
                }
                ap0Var.W0(true);
                break;
            case 4:
                String[] strArr = ap0Var.k2;
                if (ap0Var.Q1.m() == 0) {
                    if (ap0Var.j2 || strArr[0] != null) {
                        ap0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] != null || !ap0Var.h2) {
                            ap0Var.getContext();
                            ap0Var.N0();
                            break;
                        } else {
                            ap0Var.i2 = true;
                            Toast.makeText(ap0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                String[] strArr2 = ap0Var.k2;
                if (ap0Var.Q1.m() == 0) {
                    if (ap0Var.j2 || strArr2[0] != null) {
                        ap0Var.dismiss();
                        if (strArr2[0] != null || !ap0Var.h2) {
                            ap0Var.getContext();
                            ap0Var.N0();
                            break;
                        } else {
                            ap0Var.i2 = true;
                            Toast.makeText(ap0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                String[] strArr3 = ap0Var.k2;
                if (ap0Var.Q1.m() == 0) {
                    if (ap0Var.j2 || strArr3[0] != null) {
                        ap0Var.dismiss();
                        if (strArr3[0] != null || !ap0Var.h2) {
                            ap0Var.getContext();
                            ap0Var.N0();
                            break;
                        } else {
                            ap0Var.i2 = true;
                            Toast.makeText(ap0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
