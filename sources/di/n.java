package di;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        oi.d1 d1Var;
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
                kg.t0 t0Var = (kg.t0) this.b;
                kg.n0 n0Var = t0Var.G;
                boolean z10 = false;
                if (i7 == 6) {
                    t0Var.y = false;
                    org.telegram.messenger.g0.r(n0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(t0Var.f.getText())) {
                        t0Var.E = null;
                        t0Var.d.b();
                        t0Var.c.g3.O(true);
                    } else {
                        org.telegram.messenger.g0.g3(n0Var);
                    }
                    t0Var.g0();
                    break;
                }
                break;
            case 2:
                oi.e1 e1Var = (oi.e1) this.b;
                if (i7 == 5 && (d1Var = e1Var.e2) != null && !e1Var.n2) {
                    if (!e1Var.k2) {
                        d1Var.x0(e1Var);
                        break;
                    } else {
                        e1Var.M();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(r0Var.e);
                        org.telegram.ui.ActionBar.n0 n0Var2 = r0Var.I;
                        if (n0Var2 != null) {
                            n0Var2.k(r0Var.e);
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.a5.i((org.telegram.ui.ActionBar.a5) this.b, i7, keyEvent);
                break;
        }
        return false;
    }
}
