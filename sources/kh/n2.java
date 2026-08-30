package kh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n2(n3 n3Var, int i10, int i11) {
        this.a = i11;
        this.b = n3Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                h3 h3Var = this.b.f;
                if (h3Var != null) {
                    h3Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
