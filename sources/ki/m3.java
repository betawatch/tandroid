package ki;

import org.telegram.messenger.i9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements org.telegram.ui.ActionBar.r1, r3, i9 {
    public final /* synthetic */ t3 a;

    public /* synthetic */ m3(t3 t3Var) {
        this.a = t3Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        return Boolean.valueOf(this.a.b.p3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }

    @Override // ki.r3
    public void s(boolean z10) {
        t3 t3Var = this.a;
        if (t3Var.P()) {
            return;
        }
        t3Var.K.e(0.0f);
    }
}
