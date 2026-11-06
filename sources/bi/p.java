package bi;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        li.f1 f1Var;
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                if (i7 != 5) {
                    zVar.getClass();
                    break;
                } else {
                    zVar.y0();
                    break;
                }
            case 1:
                kg.q0 q0Var = (kg.q0) this.b;
                kg.k0 k0Var = q0Var.F;
                boolean z9 = false;
                if (i7 == 6) {
                    q0Var.y = false;
                    org.telegram.messenger.g0.r(k0Var);
                    z9 = true;
                    if (TextUtils.isEmpty(q0Var.f.getText())) {
                        q0Var.D = null;
                        q0Var.d.b();
                        q0Var.c.f3.O(true);
                    } else {
                        org.telegram.messenger.g0.h3(k0Var);
                    }
                    q0Var.g0();
                    break;
                }
                break;
            case 2:
                li.g1 g1Var = (li.g1) this.b;
                if (i7 == 5 && (f1Var = g1Var.Y1) != null && !g1Var.h2) {
                    if (!g1Var.e2) {
                        f1Var.F(g1Var);
                        break;
                    } else {
                        g1Var.L();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(r0Var.e);
                        org.telegram.ui.ActionBar.n0 n0Var = r0Var.H;
                        if (n0Var != null) {
                            n0Var.k(r0Var.e);
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.y4.e((org.telegram.ui.ActionBar.y4) this.b, i7, keyEvent);
                break;
        }
        return false;
    }
}
