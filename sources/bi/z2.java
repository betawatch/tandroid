package bi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
