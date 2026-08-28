package c2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.emoji2.text.o b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(androidx.emoji2.text.o oVar, int i9, int i10) {
        this.a = i10;
        this.b = oVar;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = ((e) ((a5.m) this.b.f).d).d;
                if (a0Var != null) {
                    a0Var.j(this.c);
                    break;
                }
                break;
            default:
                a0 a0Var2 = ((e) ((a5.m) this.b.f).d).d;
                if (a0Var2 != null) {
                    a0Var2.k(this.c);
                    break;
                }
                break;
        }
    }
}
