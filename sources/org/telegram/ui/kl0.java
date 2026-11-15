package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ im0 b;

    public /* synthetic */ kl0(im0 im0Var, int i7) {
        this.a = i7;
        this.b = im0Var;
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
                im0 im0Var = this.b;
                im0Var.r = false;
                im0Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    im0Var.C0();
                    im0Var.finishFragment();
                    im0Var.I0();
                    break;
                }
                break;
        }
    }
}
