package ai;

import org.telegram.messenger.y10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ y10 c;

    public /* synthetic */ i0(String str, y10 y10Var) {
        this.b = str;
        this.c = y10Var;
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

    public /* synthetic */ i0(y10 y10Var, String str) {
        this.c = y10Var;
        this.b = str;
    }
}
