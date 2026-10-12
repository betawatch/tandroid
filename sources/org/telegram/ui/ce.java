package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ce(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int b10;
        int b11;
        switch (this.a) {
            case 0:
                qe qeVar = (qe) this.b;
                hb1 hb1Var = (hb1) this.c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    yd ydVar = new yd(qeVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = ydVar;
                    qeVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new zd(qeVar, hb1Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.b;
                fi.t1 t1Var = (fi.t1) this.c;
                if ((i10 == 6 || keyEvent.getKeyCode() == 66) && a2Var.isShowing()) {
                    t1Var.g(a2Var, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.go goVar = (org.telegram.ui.Components.go) this.b;
                org.telegram.ui.Components.fo foVar = (org.telegram.ui.Components.fo) this.c;
                org.telegram.ui.Components.io ioVar = goVar.d;
                kc1 kc1Var = ioVar.s;
                if (i10 == 5) {
                    View F = kc1Var.F(foVar);
                    s4.b1 T = F == null ? null : kc1Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i11 = b10 - ioVar.t0;
                        int i12 = ioVar.M;
                        int i13 = i12 - 1;
                        if (i11 == i13 && i12 < ioVar.J) {
                            ioVar.S();
                            break;
                        } else if (i11 != i13) {
                            s4.b1 K = kc1Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(foVar.getTextView());
                            break;
                        }
                    }
                }
                break;
            default:
                ew0 ew0Var = (ew0) this.b;
                dw0 dw0Var = (dw0) this.c;
                gw0 gw0Var = ew0Var.d;
                if (i10 == 5) {
                    kc1 kc1Var2 = gw0Var.c;
                    View F2 = kc1Var2.F(dw0Var);
                    s4.b1 T2 = F2 == null ? null : kc1Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i14 = b11 - gw0Var.n0;
                        int i15 = gw0Var.y;
                        int i16 = i15 - 1;
                        if (i14 == i16 && i15 < gw0Var.n) {
                            gw0Var.f0();
                            break;
                        } else if (i14 != i16) {
                            s4.b1 K2 = gw0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.hideKeyboard(dw0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
