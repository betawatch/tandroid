package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.ui.yf yfVar = (org.telegram.ui.yf) this.b;
                if (i10 == 6) {
                    yfVar.run();
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
                lq lqVar = (lq) this.b;
                if (i10 == 6) {
                    lqVar.run();
                    break;
                }
                break;
            case 3:
                dd0 dd0Var = (dd0) this.b;
                if (i10 != 6) {
                    dd0Var.getClass();
                    break;
                } else {
                    dd0Var.k(false);
                    break;
                }
            case 4:
                k4 k4Var = (k4) this.b;
                if (i10 == 6) {
                    k4Var.b.a.callOnClick();
                    break;
                }
                break;
            case 5:
                gg.g gVar = ((km0) this.b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        gVar.hideActionMode();
                        AndroidUtilities.hideKeyboard(gVar);
                        break;
                    }
                }
                break;
            case 6:
                sp0 sp0Var = (sp0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(sp0Var.u0.r);
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
                x01 x01Var = (x01) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(x01Var.b);
                        break;
                    }
                }
                break;
            default:
                t51 t51Var = (t51) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(t51Var.F);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
