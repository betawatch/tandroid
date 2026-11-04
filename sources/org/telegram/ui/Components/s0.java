package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                o4.b1 b1Var = (o4.b1) this.b;
                if (i3 == 6) {
                    b1Var.run();
                    break;
                }
                break;
            case 1:
                hk hkVar = (hk) this.b;
                if (i3 != 6) {
                    hkVar.getClass();
                    break;
                } else {
                    gi.d dVar = hkVar.p0;
                    if (dVar.d0) {
                        dVar.performClick();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.b).d;
                if (i3 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    break;
                }
                break;
            case 3:
                iq iqVar = (iq) this.b;
                if (i3 == 6) {
                    iqVar.run();
                    break;
                }
                break;
            case 4:
                zb0 zb0Var = (zb0) this.b;
                if (i3 != 6) {
                    zb0Var.getClass();
                    break;
                } else {
                    zb0Var.n(false);
                    break;
                }
            case 5:
                i4 i4Var = (i4) this.b;
                if (i3 == 6) {
                    i4Var.j1.a.callOnClick();
                    break;
                }
                break;
            case 6:
                bh.g gVar = ((il0) this.b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        gVar.m();
                        org.telegram.messenger.g0.v1(gVar);
                        break;
                    }
                }
                break;
            case 7:
                oo0 oo0Var = (oo0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(oo0Var.r2.r);
                        break;
                    }
                }
                break;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.b;
                if (i3 == 5) {
                    alertDialog$Builder.a.d(-1).callOnClick();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.b;
                if (i3 == 6) {
                    s1Var.d(-1).callOnClick();
                    break;
                }
                break;
            case 10:
                uz0 uz0Var = (uz0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(uz0Var.b);
                        break;
                    }
                }
                break;
            default:
                u41 u41Var = (u41) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(u41Var.K);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
