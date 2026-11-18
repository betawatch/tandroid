package ai;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ x10 c;

    public /* synthetic */ h0(String str, x10 x10Var) {
        this.b = str;
        this.c = x10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.a(this.b);
                break;
            default:
                org.telegram.messenger.g0.g3(new c1.c(17, this.c, ci.f.c(this.b, org.telegram.messenger.g0.L(240.0f), gc.b.c, 0.75f, null)));
                break;
        }
    }

    public /* synthetic */ h0(x10 x10Var, String str) {
        this.c = x10Var;
        this.b = str;
    }
}
