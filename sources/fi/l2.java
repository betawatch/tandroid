package fi;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
