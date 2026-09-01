package lh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ m2(n3 n3Var, int i10, int i11) {
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
