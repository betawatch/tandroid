package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ld(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        int b10;
        int b11;
        switch (this.a) {
            case 0:
                xd xdVar = (xd) this.b;
                r41 r41Var = (r41) this.c;
                if (i3 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    hd hdVar = new hd(xdVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.a0 = 1;
                    twoStepVerificationActivity.c0 = hdVar;
                    xdVar.H0.setLoading(true);
                    twoStepVerificationActivity.x0(new id(xdVar, r41Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.b;
                ii.o1 o1Var = (ii.o1) this.c;
                if ((i3 == 6 || keyEvent.getKeyCode() == 66) && s1Var.isShowing()) {
                    o1Var.g(s1Var, 0);
                    break;
                }
                break;
            case 2:
                n4 n4Var = (n4) this.b;
                org.telegram.ui.Components.ym ymVar = (org.telegram.ui.Components.ym) this.c;
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) n4Var.e;
                u51 u51Var = anVar.s;
                if (i3 == 5) {
                    View F = u51Var.F(ymVar);
                    u4.d1 T = F == null ? null : u51Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i10 = b10 - anVar.u0;
                        int i11 = anVar.N;
                        int i12 = i11 - 1;
                        if (i10 == i12 && i11 < anVar.K) {
                            anVar.T();
                            break;
                        } else if (i10 != i12) {
                            u4.d1 K = u51Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.z5) {
                                    ((org.telegram.ui.Cells.z5) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.v1(ymVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                dr0 dr0Var = (dr0) this.b;
                cr0 cr0Var = (cr0) this.c;
                fr0 fr0Var = dr0Var.d;
                if (i3 == 5) {
                    u51 u51Var2 = fr0Var.c;
                    View F2 = u51Var2.F(cr0Var);
                    u4.d1 T2 = F2 == null ? null : u51Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i13 = b11 - fr0Var.o0;
                        int i14 = fr0Var.E;
                        int i15 = i14 - 1;
                        if (i13 == i15 && i14 < fr0Var.n) {
                            fr0Var.k0();
                            break;
                        } else if (i13 != i15) {
                            u4.d1 K2 = fr0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                    ((org.telegram.ui.Cells.z5) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.v1(cr0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
