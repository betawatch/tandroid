package bi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d3(g3 g3Var, boolean z10, int i7) {
        this.a = i7;
        this.b = g3Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                g3 g3Var = this.b;
                if (!z10) {
                    g3Var.H.setVisibility(8);
                    break;
                } else {
                    g3Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                g3 g3Var2 = this.b;
                if (!z11) {
                    g3Var2.w.setVisibility(8);
                    break;
                } else {
                    g3Var2.getClass();
                    break;
                }
        }
    }
}
