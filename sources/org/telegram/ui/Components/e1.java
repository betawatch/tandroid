package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.b;
                if (i10 == 6) {
                    m5Var.run();
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
                yq yqVar = (yq) this.b;
                if (i10 == 6) {
                    yqVar.run();
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
                q4 q4Var = (q4) this.b;
                if (i10 == 6) {
                    q4Var.b.a.callOnClick();
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
                o11 o11Var = (o11) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(o11Var.b);
                        break;
                    }
                }
                break;
            default:
                m61 m61Var = (m61) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(m61Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
