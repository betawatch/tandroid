package ai;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ z10 c;

    public /* synthetic */ h0(String str, z10 z10Var) {
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

    public /* synthetic */ h0(z10 z10Var, String str) {
        this.c = z10Var;
        this.b = str;
    }
}
