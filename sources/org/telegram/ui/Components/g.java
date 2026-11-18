package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) this.b;
                if (i7 == 6) {
                    iVar.run();
                    break;
                }
                break;
            case 2:
                xk xkVar = (xk) this.b;
                if (i7 != 6) {
                    xkVar.getClass();
                    break;
                } else {
                    hi.d dVar = xkVar.p0;
                    if (dVar.e0) {
                        dVar.performClick();
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
                wq wqVar = (wq) this.b;
                if (i7 == 6) {
                    wqVar.run();
                    break;
                }
                break;
            case 5:
                pc0 pc0Var = (pc0) this.b;
                if (i7 != 6) {
                    pc0Var.getClass();
                    break;
                } else {
                    pc0Var.n(false);
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
                ah.i iVar2 = ((rl0) this.b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        iVar2.m();
                        org.telegram.messenger.g0.v1(iVar2);
                        break;
                    }
                }
                break;
            case 8:
                yo0 yo0Var = (yo0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(yo0Var.u2.r);
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
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.b;
                if (i7 == 6) {
                    u1Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 11:
                e01 e01Var = (e01) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(e01Var.b);
                        break;
                    }
                }
                break;
            default:
                n51 n51Var = (n51) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(n51Var.K);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
