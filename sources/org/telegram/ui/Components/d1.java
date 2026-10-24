package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) this.b;
                if (i10 == 6) {
                    iVar.run();
                    break;
                }
                break;
            case 1:
                al alVar = (al) this.b;
                if (i10 != 6) {
                    alVar.getClass();
                    break;
                } else {
                    ei.d dVar = alVar.o0;
                    if (dVar.c0) {
                        dVar.performClick();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Cells.f3 f3Var = ((org.telegram.ui.Cells.h3) this.b).d;
                if (i10 == 5) {
                    f3Var.requestFocus();
                    f3Var.setSelection(f3Var.length());
                    break;
                }
                break;
            case 3:
                kr krVar = (kr) this.b;
                if (i10 == 6) {
                    krVar.run();
                    break;
                }
                break;
            case 4:
                pe0 pe0Var = (pe0) this.b;
                if (i10 != 6) {
                    pe0Var.getClass();
                    break;
                } else {
                    pe0Var.n(false);
                    break;
                }
            case 5:
                q4 q4Var = (q4) this.b;
                if (i10 == 6) {
                    q4Var.b.a.callOnClick();
                    break;
                }
                break;
            case 6:
                ei.e2 e2Var = ((yn0) this.b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        e2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(e2Var);
                        break;
                    }
                }
                break;
            case 7:
                ir0 ir0Var = (ir0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(ir0Var.z0.r);
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
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                if (i10 == 6) {
                    c2Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 10:
                q21 q21Var = (q21) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(q21Var.b);
                        break;
                    }
                }
                break;
            default:
                r71 r71Var = (r71) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(r71Var.J);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
