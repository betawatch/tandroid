package ai;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ z10 c;

    public /* synthetic */ g0(String str, z10 z10Var) {
        this.b = str;
        this.c = z10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.a(this.b);
                break;
            default:
                org.telegram.messenger.g0.h3(new c1.c(18, this.c, ci.f.c(this.b, org.telegram.messenger.g0.L(240.0f), gc.c.c, 0.75f, null)));
                break;
        }
    }

    public /* synthetic */ g0(z10 z10Var, String str) {
        this.c = z10Var;
        this.b = str;
    }
}
