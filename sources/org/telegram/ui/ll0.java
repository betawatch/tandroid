package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm0 b;

    public /* synthetic */ ll0(jm0 jm0Var, int i7) {
        this.a = i7;
        this.b = jm0Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                hi.q1 q1Var = this.b.J;
                if (q1Var != null) {
                    q1Var.C(num.intValue());
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
