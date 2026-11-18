package bi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ z7(g8 g8Var, int i7) {
        this.a = i7;
        this.b = g8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e1();
                break;
            default:
                g8 g8Var = this.b;
                g8Var.e2.O(true);
                org.telegram.messenger.g0.h3(new z7(g8Var, 0), 150L);
                break;
        }
    }
}
