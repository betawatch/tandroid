package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.b).b;
                if (i10 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
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
                de0 de0Var = (de0) this.b;
                if (i10 != 6) {
                    de0Var.getClass();
                    break;
                } else {
                    de0Var.k(false);
                    break;
                }
            case 4:
                p4 p4Var = (p4) this.b;
                if (i10 == 6) {
                    p4Var.b.a.callOnClick();
                    break;
                }
                break;
            case 5:
                ci.h2 h2Var = ((ln0) this.b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        h2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(h2Var);
                        break;
                    }
                }
                break;
            case 6:
                wq0 wq0Var = (wq0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(wq0Var.y0.r);
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
                f21 f21Var = (f21) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(f21Var.b);
                        break;
                    }
                }
                break;
            default:
                d71 d71Var = (d71) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(d71Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
