package ki;

import org.telegram.messenger.j9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements org.telegram.ui.ActionBar.q1, w3, j9 {
    public final /* synthetic */ y3 a;

    public /* synthetic */ r3(y3 y3Var) {
        this.a = y3Var;
    }

    @Override // ki.w3
    public void b(boolean z10) {
        y3 y3Var = this.a;
        if (y3Var.P()) {
            return;
        }
        y3Var.K.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        return Boolean.valueOf(this.a.b.p3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }
}
