package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.b;
                if (i10 == 6) {
                    p6Var.run();
                    break;
                }
                break;
            case 1:
                dl dlVar = (dl) this.b;
                if (i10 != 6) {
                    dlVar.getClass();
                    break;
                } else {
                    di.d dVar = dlVar.l0;
                    if (dVar.W) {
                        dVar.performClick();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.b).b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    break;
                }
                break;
            case 3:
                or orVar = (or) this.b;
                if (i10 == 6) {
                    orVar.run();
                    break;
                }
                break;
            case 4:
                re0 re0Var = (re0) this.b;
                if (i10 != 6) {
                    re0Var.getClass();
                    break;
                } else {
                    re0Var.m(false);
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
                di.g2 g2Var = ((zn0) this.b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        g2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(g2Var);
                        break;
                    }
                }
                break;
            case 7:
                jr0 jr0Var = (jr0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(jr0Var.y0.r);
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
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.b;
                if (i10 == 6) {
                    a2Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 10:
                r21 r21Var = (r21) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(r21Var.b);
                        break;
                    }
                }
                break;
            default:
                p71 p71Var = (p71) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(p71Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
