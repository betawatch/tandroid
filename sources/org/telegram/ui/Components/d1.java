package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                org.telegram.ui.kh khVar = (org.telegram.ui.kh) this.b;
                if (i10 == 6) {
                    khVar.run();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.f3 f3Var = ((org.telegram.ui.Cells.h3) this.b).b;
                if (i10 == 5) {
                    f3Var.requestFocus();
                    f3Var.setSelection(f3Var.length());
                    break;
                }
                break;
            case 2:
                uq uqVar = (uq) this.b;
                if (i10 == 6) {
                    uqVar.run();
                    break;
                }
                break;
            case 3:
                wd0 wd0Var = (wd0) this.b;
                if (i10 != 6) {
                    wd0Var.getClass();
                    break;
                } else {
                    wd0Var.k(false);
                    break;
                }
            case 4:
                l4 l4Var = (l4) this.b;
                if (i10 == 6) {
                    l4Var.b.a.callOnClick();
                    break;
                }
                break;
            case 5:
                kg.f fVar = ((dn0) this.b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        fVar.hideActionMode();
                        AndroidUtilities.hideKeyboard(fVar);
                        break;
                    }
                }
                break;
            case 6:
                lq0 lq0Var = (lq0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(lq0Var.v0.r);
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
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                if (i10 == 6) {
                    d2Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 9:
                s11 s11Var = (s11) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(s11Var.b);
                        break;
                    }
                }
                break;
            default:
                p61 p61Var = (p61) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(p61Var.G);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
