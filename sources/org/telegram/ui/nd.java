package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nd(int i7, Object obj, Object obj2) {
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
                zd zdVar = (zd) this.b;
                e51 e51Var = (e51) this.c;
                if (i7 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    id idVar = new id(zdVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.b0 = idVar;
                    zdVar.G0.setLoading(true);
                    twoStepVerificationActivity.x0(new jd(zdVar, e51Var, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.b;
                hi.n1 n1Var = (hi.n1) this.c;
                if ((i7 == 6 || keyEvent.getKeyCode() == 66) && u1Var.isShowing()) {
                    n1Var.g(u1Var, 0);
                    break;
                }
                break;
            case 2:
                l4 l4Var = (l4) this.b;
                org.telegram.ui.Components.ym ymVar = (org.telegram.ui.Components.ym) this.c;
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) l4Var.e;
                g61 g61Var = anVar.s;
                if (i7 == 5) {
                    View F = g61Var.F(ymVar);
                    v4.d1 T = F == null ? null : g61Var.T(F);
                    if (T != null && (b10 = T.b()) != -1) {
                        int i10 = b10 - anVar.t0;
                        int i11 = anVar.M;
                        int i12 = i11 - 1;
                        if (i10 == i12 && i11 < anVar.J) {
                            anVar.T();
                            break;
                        } else if (i10 != i12) {
                            v4.d1 K = g61Var.K(b10 + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof org.telegram.ui.Cells.a6) {
                                    ((org.telegram.ui.Cells.a6) view).getTextView().requestFocus();
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
                qr0 qr0Var = (qr0) this.b;
                pr0 pr0Var = (pr0) this.c;
                sr0 sr0Var = qr0Var.d;
                if (i7 == 5) {
                    g61 g61Var2 = sr0Var.c;
                    View F2 = g61Var2.F(pr0Var);
                    v4.d1 T2 = F2 == null ? null : g61Var2.T(F2);
                    if (T2 != null && (b11 = T2.b()) != -1) {
                        int i13 = b11 - sr0Var.n0;
                        int i14 = sr0Var.D;
                        int i15 = i14 - 1;
                        if (i13 == i15 && i14 < sr0Var.n) {
                            sr0Var.k0();
                            break;
                        } else if (i13 != i15) {
                            v4.d1 K2 = sr0Var.c.K(b11 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                    ((org.telegram.ui.Cells.a6) view2).getTextView().requestFocus();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.v1(pr0Var.getTextView());
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
