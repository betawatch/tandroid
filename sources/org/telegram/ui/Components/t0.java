package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.ui.fp fpVar = (org.telegram.ui.fp) this.b;
                if (i10 == 6) {
                    fpVar.run();
                    break;
                }
                break;
            case 1:
                kk kkVar = (kk) this.b;
                if (i10 != 6) {
                    kkVar.getClass();
                    break;
                } else {
                    vh.d dVar = kkVar.o0;
                    if (dVar.c0) {
                        dVar.performClick();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Cells.k3 k3Var = ((org.telegram.ui.Cells.m3) this.b).d;
                if (i10 == 5) {
                    k3Var.requestFocus();
                    k3Var.setSelection(k3Var.length());
                    break;
                }
                break;
            case 3:
                sq sqVar = (sq) this.b;
                if (i10 == 6) {
                    sqVar.run();
                    break;
                }
                break;
            case 4:
                zc0 zc0Var = (zc0) this.b;
                if (i10 != 6) {
                    zc0Var.getClass();
                    break;
                } else {
                    zc0Var.n(false);
                    break;
                }
            case 5:
                h4 h4Var = (h4) this.b;
                if (i10 == 6) {
                    h4Var.i1.a.callOnClick();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.n0 n0Var = ((hm0) this.b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        n0Var.m();
                        org.telegram.messenger.i0.v1(n0Var);
                        break;
                    }
                }
                break;
            case 7:
                op0 op0Var = (op0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.i0.v1(op0Var.q2.r);
                        break;
                    }
                }
                break;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.b;
                if (i10 == 5) {
                    alertDialog$Builder.a.d(-1).callOnClick();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.b;
                if (i10 == 6) {
                    x1Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 10:
                z01 z01Var = (z01) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.i0.v1(z01Var.b);
                        break;
                    }
                }
                break;
            default:
                d61 d61Var = (d61) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.i0.v1(d61Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
