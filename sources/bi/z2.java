package bi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z2(c3 c3Var, boolean z10, int i7) {
        this.a = i7;
        this.b = c3Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                c3 c3Var = this.b;
                if (!z10) {
                    c3Var.H.setVisibility(8);
                    break;
                } else {
                    c3Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                c3 c3Var2 = this.b;
                if (!z11) {
                    c3Var2.w.setVisibility(8);
                    break;
                } else {
                    c3Var2.getClass();
                    break;
                }
        }
    }
}
