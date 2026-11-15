package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm0 b;

    public /* synthetic */ ll0(jm0 jm0Var, int i7) {
        this.a = i7;
        this.b = jm0Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                hi.i1 i1Var = this.b.J;
                if (i1Var != null) {
                    i1Var.C(num.intValue());
                    break;
                }
                break;
            default:
                jm0 jm0Var = this.b;
                jm0Var.r = false;
                jm0Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    jm0Var.C0();
                    jm0Var.finishFragment();
                    jm0Var.I0();
                    break;
                }
                break;
        }
    }
}
