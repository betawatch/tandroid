package ci;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        mi.g1 g1Var;
        switch (this.a) {
            case 0:
                v vVar = (v) this.b;
                if (i3 != 5) {
                    vVar.getClass();
                    break;
                } else {
                    vVar.y0();
                    break;
                }
            case 1:
                lg.r0 r0Var = (lg.r0) this.b;
                lg.l0 l0Var = r0Var.G;
                boolean z10 = false;
                if (i3 == 6) {
                    r0Var.y = false;
                    org.telegram.messenger.g0.r(l0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(r0Var.f.getText())) {
                        r0Var.E = null;
                        r0Var.d.b();
                        r0Var.c.g3.O(true);
                    } else {
                        org.telegram.messenger.g0.h3(l0Var);
                    }
                    r0Var.g0();
                    break;
                }
                break;
            case 2:
                mi.h1 h1Var = (mi.h1) this.b;
                if (i3 == 5 && (g1Var = h1Var.Z1) != null && !h1Var.i2) {
                    if (!h1Var.f2) {
                        g1Var.V0(h1Var);
                        break;
                    } else {
                        h1Var.L();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(q0Var.e);
                        org.telegram.ui.ActionBar.m0 m0Var = q0Var.I;
                        if (m0Var != null) {
                            m0Var.k(q0Var.e);
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.y4.e((org.telegram.ui.ActionBar.y4) this.b, i3, keyEvent);
                break;
        }
        return false;
    }
}
