package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.b;
                if (i7 == 6) {
                    l5Var.run();
                    break;
                }
                break;
            case 1:
                qk qkVar = (qk) this.b;
                if (i7 != 6) {
                    qkVar.getClass();
                    break;
                } else {
                    hi.d dVar = qkVar.p0;
                    if (dVar.d0) {
                        dVar.performClick();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.b).d;
                if (i7 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    break;
                }
                break;
            case 3:
                pq pqVar = (pq) this.b;
                if (i7 == 6) {
                    pqVar.run();
                    break;
                }
                break;
            case 4:
                fc0 fc0Var = (fc0) this.b;
                if (i7 != 6) {
                    fc0Var.getClass();
                    break;
                } else {
                    fc0Var.n(false);
                    break;
                }
            case 5:
                i4 i4Var = (i4) this.b;
                if (i7 == 6) {
                    i4Var.m1.a.callOnClick();
                    break;
                }
                break;
            case 6:
                ah.i iVar = ((jl0) this.b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        iVar.m();
                        org.telegram.messenger.g0.v1(iVar);
                        break;
                    }
                }
                break;
            case 7:
                po0 po0Var = (po0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(po0Var.u2.r);
                        break;
                    }
                }
                break;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.b;
                if (i7 == 5) {
                    alertDialog$Builder.a.d(-1).callOnClick();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                if (i7 == 6) {
                    t1Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 10:
                xz0 xz0Var = (xz0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(xz0Var.b);
                        break;
                    }
                }
                break;
            default:
                d51 d51Var = (d51) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(d51Var.K);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
