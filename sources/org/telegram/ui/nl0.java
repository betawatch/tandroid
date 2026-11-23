package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lm0 b;

    public /* synthetic */ nl0(lm0 lm0Var, int i7) {
        this.a = i7;
        this.b = lm0Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                hi.i1 i1Var = this.b.J;
                if (i1Var != null) {
                    i1Var.A(num.intValue());
                    break;
                }
                break;
            default:
                lm0 lm0Var = this.b;
                lm0Var.r = false;
                lm0Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    lm0Var.C0();
                    lm0Var.finishFragment();
                    lm0Var.I0();
                    break;
                }
                break;
        }
    }
}
