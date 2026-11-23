package di;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        oi.e1 e1Var;
        switch (this.a) {
            case 0:
                t tVar = (t) this.b;
                if (i7 != 5) {
                    tVar.getClass();
                    break;
                } else {
                    tVar.z0();
                    break;
                }
            case 1:
                kg.s0 s0Var = (kg.s0) this.b;
                kg.m0 m0Var = s0Var.G;
                boolean z10 = false;
                if (i7 == 6) {
                    s0Var.y = false;
                    org.telegram.messenger.g0.r(m0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(s0Var.f.getText())) {
                        s0Var.E = null;
                        s0Var.d.b();
                        s0Var.c.g3.O(true);
                    } else {
                        org.telegram.messenger.g0.g3(m0Var);
                    }
                    s0Var.g0();
                    break;
                }
                break;
            case 2:
                oi.f1 f1Var = (oi.f1) this.b;
                if (i7 == 5 && (e1Var = f1Var.e2) != null && !f1Var.n2) {
                    if (!f1Var.k2) {
                        e1Var.x0(f1Var);
                        break;
                    } else {
                        f1Var.M();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(q0Var.e);
                        org.telegram.ui.ActionBar.m0 m0Var2 = q0Var.I;
                        if (m0Var2 != null) {
                            m0Var2.k(q0Var.e);
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.z4.i((org.telegram.ui.ActionBar.z4) this.b, i7, keyEvent);
                break;
        }
        return false;
    }
}
