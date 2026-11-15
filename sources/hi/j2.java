package hi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;
    public final /* synthetic */ g7 c;

    public /* synthetic */ j2(n2 n2Var, g7 g7Var, int i7) {
        this.a = i7;
        this.b = n2Var;
        this.c = g7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n2 n2Var = this.b;
                n2Var.getClass();
                org.telegram.messenger.g0.i3(new j2(n2Var, this.c, 1), 320L);
                break;
            default:
                n2 n2Var2 = this.b;
                n2Var2.getClass();
                this.c.a(new ai.g0(n2Var2, 23));
                break;
        }
    }
}
