package ag;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.i5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        bi.m1 m1Var;
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                l1 l1Var = t1Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    t1Var.y = false;
                    org.telegram.messenger.i0.r(l1Var);
                    z10 = true;
                    if (TextUtils.isEmpty(t1Var.f.getText())) {
                        t1Var.D = null;
                        t1Var.d.b();
                        t1Var.c.f3.O(true);
                    } else {
                        org.telegram.messenger.i0.g3(l1Var);
                    }
                    t1Var.f0();
                    break;
                }
                break;
            case 1:
                bi.n1 n1Var = (bi.n1) this.b;
                if (i10 == 5 && (m1Var = n1Var.Y1) != null && !n1Var.h2) {
                    if (!n1Var.e2) {
                        m1Var.e(n1Var);
                        break;
                    } else {
                        n1Var.L();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.i0.v1(t0Var.e);
                        org.telegram.ui.ActionBar.p0 p0Var = t0Var.H;
                        if (p0Var != null) {
                            p0Var.k(t0Var.e);
                            break;
                        }
                    }
                }
                break;
            case 3:
                i5.e((i5) this.b, i10, keyEvent);
                break;
            default:
                rh.i iVar = (rh.i) this.b;
                if (i10 != 5) {
                    iVar.getClass();
                    break;
                } else {
                    iVar.x0();
                    break;
                }
        }
        return false;
    }
}
