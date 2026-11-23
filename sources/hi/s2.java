package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;
    public final /* synthetic */ c7 c;

    public /* synthetic */ s2(w2 w2Var, c7 c7Var, int i7) {
        this.a = i7;
        this.b = w2Var;
        this.c = c7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                w2Var.getClass();
                org.telegram.messenger.g0.h3(new s2(w2Var, this.c, 1), 320L);
                break;
            default:
                w2 w2Var2 = this.b;
                w2Var2.getClass();
                this.c.a(new ai.d0(w2Var2, 24));
                break;
        }
    }
}
