package ai;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ x10 c;

    public /* synthetic */ i0(String str, x10 x10Var) {
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
                org.telegram.messenger.g0.g3(new c1.a(19, this.c, ci.f.c(this.b, org.telegram.messenger.g0.L(240.0f), gc.b.c, 0.75f, null)));
                break;
        }
    }

    public /* synthetic */ i0(x10 x10Var, String str) {
        this.c = x10Var;
        this.b = str;
    }
}
