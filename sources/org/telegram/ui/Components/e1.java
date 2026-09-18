package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                org.telegram.ui.ActionBar.o5 o5Var = (org.telegram.ui.ActionBar.o5) this.b;
                if (i10 == 6) {
                    o5Var.run();
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
                ci.h2 h2Var = ((xm0) this.b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        h2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(h2Var);
                        break;
                    }
                }
                break;
            case 6:
                iq0 iq0Var = (iq0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(iq0Var.y0.r);
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
                q11 q11Var = (q11) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(q11Var.b);
                        break;
                    }
                }
                break;
            default:
                o61 o61Var = (o61) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(o61Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
