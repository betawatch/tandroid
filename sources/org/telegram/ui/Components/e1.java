package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.b;
                if (i10 == 6) {
                    l5Var.run();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.b).b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    break;
                }
                break;
            case 2:
                yq yqVar = (yq) this.b;
                if (i10 == 6) {
                    yqVar.run();
                    break;
                }
                break;
            case 3:
                ce0 ce0Var = (ce0) this.b;
                if (i10 != 6) {
                    ce0Var.getClass();
                    break;
                } else {
                    ce0Var.k(false);
                    break;
                }
            case 4:
                q4 q4Var = (q4) this.b;
                if (i10 == 6) {
                    q4Var.b.a.callOnClick();
                    break;
                }
                break;
            case 5:
                ci.h2 h2Var = ((jn0) this.b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        h2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(h2Var);
                        break;
                    }
                }
                break;
            case 6:
                uq0 uq0Var = (uq0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(uq0Var.y0.r);
                        break;
                    }
                }
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.b;
                if (i10 == 5) {
                    alertDialog$Builder.a.d(-1).callOnClick();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.b;
                if (i10 == 6) {
                    a2Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 9:
                c21 c21Var = (c21) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(c21Var.b);
                        break;
                    }
                }
                break;
            default:
                a71 a71Var = (a71) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(a71Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
