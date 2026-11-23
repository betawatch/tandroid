package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                b51 b51Var = (b51) this.c;
                if (i7 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    hd hdVar = new hd(xdVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.a0 = 1;
                    twoStepVerificationActivity.c0 = hdVar;
                    xdVar.H0.setLoading(true);
                    twoStepVerificationActivity.x0(new id(xdVar, b51Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                ki.l1 l1Var = (ki.l1) this.c;
                if ((i7 == 6 || keyEvent.getKeyCode() == 66) && t1Var.isShowing()) {
                    l1Var.i(t1Var, 0);
                    break;
                }
                break;
            case 2:
                l4 l4Var = (l4) this.b;
                org.telegram.ui.Components.on onVar = (org.telegram.ui.Components.on) this.c;
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) l4Var.e;
                d61 d61Var = qnVar.s;
                if (i7 == 5) {
                    View F = d61Var.F(onVar);
                    v4.f1 T = F == null ? null : d61Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i10 = b10 - qnVar.u0;
                        int i11 = qnVar.N;
                        int i12 = i11 - 1;
                        if (i10 == i12 && i11 < qnVar.K) {
                            qnVar.U();
                            break;
                        } else if (i10 != i12) {
                            v4.f1 K = d61Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.a6) {
                                    ((org.telegram.ui.Cells.a6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.v1(onVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                nr0 nr0Var = (nr0) this.b;
                mr0 mr0Var = (mr0) this.c;
                pr0 pr0Var = nr0Var.d;
                if (i7 == 5) {
                    d61 d61Var2 = pr0Var.c;
                    View F2 = d61Var2.F(mr0Var);
                    v4.f1 T2 = F2 == null ? null : d61Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i13 = b11 - pr0Var.o0;
                        int i14 = pr0Var.E;
                        int i15 = i14 - 1;
                        if (i13 == i15 && i14 < pr0Var.n) {
                            pr0Var.k0();
                            break;
                        } else if (i13 != i15) {
                            v4.f1 K2 = pr0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                    ((org.telegram.ui.Cells.a6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.v1(mr0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
