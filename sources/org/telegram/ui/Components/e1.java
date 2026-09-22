package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) this.b;
                if (i10 == 6) {
                    n5Var.run();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.b).b;
                if (i10 == 5) {
                    g3Var.requestFocus();
                    g3Var.setSelection(g3Var.length());
                    break;
                }
                break;
            case 2:
                xq xqVar = (xq) this.b;
                if (i10 == 6) {
                    xqVar.run();
                    break;
                }
                break;
            case 3:
                sd0 sd0Var = (sd0) this.b;
                if (i10 != 6) {
                    sd0Var.getClass();
                    break;
                } else {
                    sd0Var.k(false);
                    break;
                }
            case 4:
                o4 o4Var = (o4) this.b;
                if (i10 == 6) {
                    o4Var.b.a.callOnClick();
                    break;
                }
                break;
            case 5:
                ci.h2 h2Var = ((wm0) this.b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        h2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(h2Var);
                        break;
                    }
                }
                break;
            case 6:
                hq0 hq0Var = (hq0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(hq0Var.y0.r);
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
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.b;
                if (i10 == 6) {
                    b2Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 9:
                p11 p11Var = (p11) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(p11Var.b);
                        break;
                    }
                }
                break;
            default:
                n61 n61Var = (n61) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(n61Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
