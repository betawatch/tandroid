package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                ec0 ec0Var = (ec0) this.b;
                if (i7 != 6) {
                    ec0Var.getClass();
                    break;
                } else {
                    ec0Var.n(false);
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
                ah.i iVar = ((el0) this.b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        iVar.m();
                        org.telegram.messenger.g0.v1(iVar);
                        break;
                    }
                }
                break;
            case 7:
                mo0 mo0Var = (mo0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(mo0Var.q2.r);
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
                vz0 vz0Var = (vz0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(vz0Var.b);
                        break;
                    }
                }
                break;
            default:
                a51 a51Var = (a51) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(a51Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
