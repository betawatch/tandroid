package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                if (i7 == 3) {
                    org.telegram.messenger.g0.v1(editTextBoldCursor);
                    break;
                }
                break;
            case 1:
                oi.h hVar = (oi.h) this.b;
                if (i7 == 6) {
                    hVar.run();
                    break;
                }
                break;
            case 2:
                xk xkVar = (xk) this.b;
                if (i7 != 6) {
                    xkVar.getClass();
                    break;
                } else {
                    hi.e eVar = xkVar.p0;
                    if (eVar.e0) {
                        eVar.performClick();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.j3 j3Var = ((org.telegram.ui.Cells.l3) this.b).d;
                if (i7 == 5) {
                    j3Var.requestFocus();
                    j3Var.setSelection(j3Var.length());
                    break;
                }
                break;
            case 4:
                vq vqVar = (vq) this.b;
                if (i7 == 6) {
                    vqVar.run();
                    break;
                }
                break;
            case 5:
                oc0 oc0Var = (oc0) this.b;
                if (i7 != 6) {
                    oc0Var.getClass();
                    break;
                } else {
                    oc0Var.n(false);
                    break;
                }
            case 6:
                q4 q4Var = (q4) this.b;
                if (i7 == 6) {
                    q4Var.m1.a.callOnClick();
                    break;
                }
                break;
            case 7:
                ah.i iVar = ((tl0) this.b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        iVar.m();
                        org.telegram.messenger.g0.v1(iVar);
                        break;
                    }
                }
                break;
            case 8:
                zo0 zo0Var = (zo0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(zo0Var.u2.r);
                        break;
                    }
                }
                break;
            case 9:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.b;
                if (i7 == 5) {
                    alertDialog$Builder.a.d(-1).callOnClick();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                if (i7 == 6) {
                    t1Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 11:
                f01 f01Var = (f01) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(f01Var.b);
                        break;
                    }
                }
                break;
            default:
                p51 p51Var = (p51) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(p51Var.K);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
