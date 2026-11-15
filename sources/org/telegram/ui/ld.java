package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ld(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        int b10;
        int b11;
        switch (this.a) {
            case 0:
                xd xdVar = (xd) this.b;
                z41 z41Var = (z41) this.c;
                if (i7 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    hd hdVar = new hd(xdVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.a0 = 1;
                    twoStepVerificationActivity.c0 = hdVar;
                    xdVar.H0.setLoading(true);
                    twoStepVerificationActivity.x0(new id(xdVar, z41Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                ki.o1 o1Var = (ki.o1) this.c;
                if ((i7 == 6 || keyEvent.getKeyCode() == 66) && t1Var.isShowing()) {
                    o1Var.h(t1Var, 0);
                    break;
                }
                break;
            case 2:
                l4 l4Var = (l4) this.b;
                org.telegram.ui.Components.hn hnVar = (org.telegram.ui.Components.hn) this.c;
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) l4Var.e;
                b61 b61Var = jnVar.s;
                if (i7 == 5) {
                    View F = b61Var.F(hnVar);
                    v4.e1 T = F == null ? null : b61Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i10 = b10 - jnVar.u0;
                        int i11 = jnVar.N;
                        int i12 = i11 - 1;
                        if (i10 == i12 && i11 < jnVar.K) {
                            jnVar.U();
                            break;
                        } else if (i10 != i12) {
                            v4.e1 K = b61Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.z5) {
                                    ((org.telegram.ui.Cells.z5) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.v1(hnVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                lr0 lr0Var = (lr0) this.b;
                kr0 kr0Var = (kr0) this.c;
                nr0 nr0Var = lr0Var.d;
                if (i7 == 5) {
                    b61 b61Var2 = nr0Var.c;
                    View F2 = b61Var2.F(kr0Var);
                    v4.e1 T2 = F2 == null ? null : b61Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i13 = b11 - nr0Var.o0;
                        int i14 = nr0Var.E;
                        int i15 = i14 - 1;
                        if (i13 == i15 && i14 < nr0Var.n) {
                            nr0Var.k0();
                            break;
                        } else if (i13 != i15) {
                            v4.e1 K2 = nr0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                    ((org.telegram.ui.Cells.z5) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.v1(kr0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
