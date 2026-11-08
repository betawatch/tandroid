package fi;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;
    public final /* synthetic */ ai.i c;

    public /* synthetic */ l2(p2 p2Var, ai.i iVar, int i7) {
        this.a = i7;
        this.b = p2Var;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                p2Var.getClass();
                org.telegram.messenger.g0.i3(new l2(p2Var, this.c, 1), 320L);
                break;
            default:
                p2 p2Var2 = this.b;
                p2Var2.getClass();
                this.c.a(new ai.i(p2Var2, 19));
                break;
        }
    }
}
