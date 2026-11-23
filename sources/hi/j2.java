package hi;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;
    public final /* synthetic */ s6 c;

    public /* synthetic */ j2(n2 n2Var, s6 s6Var, int i7) {
        this.a = i7;
        this.b = n2Var;
        this.c = s6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n2 n2Var = this.b;
                n2Var.getClass();
                org.telegram.messenger.g0.h3(new j2(n2Var, this.c, 1), 320L);
                break;
            default:
                n2 n2Var2 = this.b;
                n2Var2.getClass();
                this.c.a(new ai.h0(n2Var2, 24));
                break;
        }
    }
}
