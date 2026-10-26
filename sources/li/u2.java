package li;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ u2(g1 g1Var, int i10, int i11) {
        this.a = i11;
        this.b = g1Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = this.b;
                g1Var.r();
                g1Var.setSelection(Math.max(0, Math.min(this.c, g1Var.length())));
                break;
            case 1:
                g1 g1Var2 = this.b;
                g1Var2.r();
                g1Var2.setSelection(Math.max(0, Math.min(this.c, g1Var2.length())));
                break;
            case 2:
                g1 g1Var3 = this.b;
                g1Var3.r();
                g1Var3.setSelection(Math.max(0, Math.min(this.c, g1Var3.length())));
                break;
            case 3:
                g1 g1Var4 = this.b;
                g1Var4.r();
                g1Var4.setSelection(Math.min(this.c, g1Var4.length()));
                break;
            default:
                g1 g1Var5 = this.b;
                g1Var5.r();
                g1Var5.setSelection(Math.max(0, Math.min(this.c, g1Var5.length())));
                break;
        }
    }
}
