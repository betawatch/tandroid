package ki;

import org.telegram.messenger.j9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements org.telegram.ui.ActionBar.q1, q3, j9 {
    public final /* synthetic */ s3 a;

    public /* synthetic */ l3(s3 s3Var) {
        this.a = s3Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.j9
    public Object m(Object obj) {
        return Boolean.valueOf(this.a.b.p3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }

    @Override // ki.q3
    public void s(boolean z10) {
        s3 s3Var = this.a;
        if (s3Var.P()) {
            return;
        }
        s3Var.K.e(0.0f);
    }
}
