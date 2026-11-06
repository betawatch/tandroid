package hi;

import org.telegram.messenger.k9;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements org.telegram.ui.ActionBar.r1, a4, k9 {
    public final /* synthetic */ c4 a;

    public /* synthetic */ u3(c4 c4Var) {
        this.a = c4Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        return Boolean.valueOf(this.a.b.l3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }

    @Override // hi.a4
    public void q(boolean z9) {
        c4 c4Var = this.a;
        if (c4Var.O()) {
            return;
        }
        c4Var.J.e(0.0f);
    }
}
