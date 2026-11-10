package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s0(Object obj, int i7) {
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
                hk hkVar = (hk) this.b;
                if (i7 != 6) {
                    hkVar.getClass();
                    break;
                } else {
                    fi.d dVar = hkVar.o0;
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
                hq hqVar = (hq) this.b;
                if (i7 == 6) {
                    hqVar.run();
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
                j4 j4Var = (j4) this.b;
                if (i7 == 6) {
                    j4Var.l1.a.callOnClick();
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
                        org.telegram.messenger.g0.v1(mo0Var.t2.r);
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
