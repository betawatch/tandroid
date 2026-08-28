package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.ui.k6 k6Var = (org.telegram.ui.k6) this.b;
                if (i9 == 6) {
                    k6Var.run();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.b).b;
                if (i9 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    break;
                }
                break;
            case 2:
                nq nqVar = (nq) this.b;
                if (i9 == 6) {
                    nqVar.run();
                    break;
                }
                break;
            case 3:
                yc0 yc0Var = (yc0) this.b;
                if (i9 != 6) {
                    yc0Var.getClass();
                    break;
                } else {
                    yc0Var.k(false);
                    break;
                }
            case 4:
                k4 k4Var = (k4) this.b;
                if (i9 == 6) {
                    k4Var.b.a.callOnClick();
                    break;
                }
                break;
            case 5:
                fg.g gVar = ((hm0) this.b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        gVar.hideActionMode();
                        AndroidUtilities.hideKeyboard(gVar);
                        break;
                    }
                }
                break;
            case 6:
                rp0 rp0Var = (rp0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(rp0Var.u0.r);
                        break;
                    }
                }
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.b;
                if (i9 == 5) {
                    alertDialog$Builder.a.d(-1).callOnClick();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                if (i9 == 6) {
                    c2Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 9:
                v01 v01Var = (v01) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(v01Var.b);
                        break;
                    }
                }
                break;
            default:
                r51 r51Var = (r51) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(r51Var.F);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
