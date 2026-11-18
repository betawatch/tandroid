package bi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ k5(j6 j6Var, int i7, int i10) {
        this.a = i10;
        this.b = j6Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                c6 c6Var = this.b.f;
                if (c6Var != null) {
                    c6Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
