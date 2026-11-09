package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.b;
                if (i7 == 6) {
                    m6Var.run();
                    break;
                }
                break;
            case 1:
                ik ikVar = (ik) this.b;
                if (i7 != 6) {
                    ikVar.getClass();
                    break;
                } else {
                    fi.d dVar = ikVar.o0;
                    if (dVar.c0) {
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
                iq iqVar = (iq) this.b;
                if (i7 == 6) {
                    iqVar.run();
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
                k4 k4Var = (k4) this.b;
                if (i7 == 6) {
                    k4Var.i1.a.callOnClick();
                    break;
                }
                break;
            case 6:
                ah.i iVar = ((fl0) this.b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        iVar.m();
                        org.telegram.messenger.g0.v1(iVar);
                        break;
                    }
                }
                break;
            case 7:
                no0 no0Var = (no0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(no0Var.q2.r);
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
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.b;
                if (i7 == 6) {
                    u1Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 10:
                wz0 wz0Var = (wz0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(wz0Var.b);
                        break;
                    }
                }
                break;
            default:
                b51 b51Var = (b51) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(b51Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
