package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                m4.v0 v0Var = (m4.v0) this.b;
                if (i10 == 6) {
                    v0Var.run();
                    break;
                }
                break;
            case 1:
                al alVar = (al) this.b;
                if (i10 != 6) {
                    alVar.getClass();
                    break;
                } else {
                    fi.d dVar = alVar.o0;
                    if (dVar.c0) {
                        dVar.performClick();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Cells.e3 e3Var = ((org.telegram.ui.Cells.g3) this.b).d;
                if (i10 == 5) {
                    e3Var.requestFocus();
                    e3Var.setSelection(e3Var.length());
                    break;
                }
                break;
            case 3:
                mr mrVar = (mr) this.b;
                if (i10 == 6) {
                    mrVar.run();
                    break;
                }
                break;
            case 4:
                me0 me0Var = (me0) this.b;
                if (i10 != 6) {
                    me0Var.getClass();
                    break;
                } else {
                    me0Var.n(false);
                    break;
                }
            case 5:
                s4 s4Var = (s4) this.b;
                if (i10 == 6) {
                    s4Var.b.a.callOnClick();
                    break;
                }
                break;
            case 6:
                fi.c2 c2Var = ((eo0) this.b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        c2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(c2Var);
                        break;
                    }
                }
                break;
            case 7:
                nr0 nr0Var = (nr0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(nr0Var.z0.r);
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
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.b;
                if (i10 == 6) {
                    e2Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 10:
                z21 z21Var = (z21) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(z21Var.b);
                        break;
                    }
                }
                break;
            default:
                b81 b81Var = (b81) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(b81Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
