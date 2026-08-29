package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.ui.gg ggVar = (org.telegram.ui.gg) this.b;
                if (i10 == 6) {
                    ggVar.run();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.e3 e3Var = ((org.telegram.ui.Cells.g3) this.b).b;
                if (i10 == 5) {
                    e3Var.requestFocus();
                    e3Var.setSelection(e3Var.length());
                    break;
                }
                break;
            case 2:
                rq rqVar = (rq) this.b;
                if (i10 == 6) {
                    rqVar.run();
                    break;
                }
                break;
            case 3:
                nd0 nd0Var = (nd0) this.b;
                if (i10 != 6) {
                    nd0Var.getClass();
                    break;
                } else {
                    nd0Var.k(false);
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
                ig.f fVar = ((um0) this.b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        fVar.hideActionMode();
                        AndroidUtilities.hideKeyboard(fVar);
                        break;
                    }
                }
                break;
            case 6:
                dq0 dq0Var = (dq0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(dq0Var.u0.r);
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
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                if (i10 == 6) {
                    c2Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 9:
                h11 h11Var = (h11) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(h11Var.b);
                        break;
                    }
                }
                break;
            default:
                e61 e61Var = (e61) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(e61Var.F);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
