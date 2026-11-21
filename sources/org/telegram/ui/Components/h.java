package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                if (i7 == 3) {
                    org.telegram.messenger.g0.v1(editTextBoldCursor);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) this.b;
                if (i7 == 6) {
                    iVar.run();
                    break;
                }
                break;
            case 2:
                zk zkVar = (zk) this.b;
                if (i7 != 6) {
                    zkVar.getClass();
                    break;
                } else {
                    hi.e eVar = zkVar.p0;
                    if (eVar.e0) {
                        eVar.performClick();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.j3 j3Var = ((org.telegram.ui.Cells.l3) this.b).d;
                if (i7 == 5) {
                    j3Var.requestFocus();
                    j3Var.setSelection(j3Var.length());
                    break;
                }
                break;
            case 4:
                yq yqVar = (yq) this.b;
                if (i7 == 6) {
                    yqVar.run();
                    break;
                }
                break;
            case 5:
                qc0 qc0Var = (qc0) this.b;
                if (i7 != 6) {
                    qc0Var.getClass();
                    break;
                } else {
                    qc0Var.n(false);
                    break;
                }
            case 6:
                r4 r4Var = (r4) this.b;
                if (i7 == 6) {
                    r4Var.m1.a.callOnClick();
                    break;
                }
                break;
            case 7:
                ah.i iVar2 = ((tl0) this.b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        iVar2.m();
                        org.telegram.messenger.g0.v1(iVar2);
                        break;
                    }
                }
                break;
            case 8:
                ap0 ap0Var = (ap0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(ap0Var.u2.r);
                        break;
                    }
                }
                break;
            case 9:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.b;
                if (i7 == 5) {
                    alertDialog$Builder.a.d(-1).callOnClick();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                if (i7 == 6) {
                    t1Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 11:
                g01 g01Var = (g01) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(g01Var.b);
                        break;
                    }
                }
                break;
            default:
                q51 q51Var = (q51) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(q51Var.K);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
