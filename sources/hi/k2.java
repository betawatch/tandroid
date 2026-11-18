package hi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;
    public final /* synthetic */ t6 c;

    public /* synthetic */ k2(o2 o2Var, t6 t6Var, int i7) {
        this.a = i7;
        this.b = o2Var;
        this.c = t6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o2 o2Var = this.b;
                o2Var.getClass();
                org.telegram.messenger.g0.h3(new k2(o2Var, this.c, 1), 320L);
                break;
            default:
                o2 o2Var2 = this.b;
                o2Var2.getClass();
                this.c.a(new ai.g0(o2Var2, 24));
                break;
        }
    }
}
