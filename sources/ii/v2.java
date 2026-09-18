package ii;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ v2(i1 i1Var, int i10, int i11) {
        this.a = i11;
        this.b = i1Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i1 i1Var = this.b;
                i1Var.r();
                i1Var.setSelection(Math.max(0, Math.min(this.c, i1Var.length())));
                break;
            case 1:
                i1 i1Var2 = this.b;
                i1Var2.r();
                i1Var2.setSelection(Math.max(0, Math.min(this.c, i1Var2.length())));
                break;
            case 2:
                i1 i1Var3 = this.b;
                i1Var3.r();
                i1Var3.setSelection(Math.max(0, Math.min(this.c, i1Var3.length())));
                break;
            case 3:
                i1 i1Var4 = this.b;
                i1Var4.r();
                i1Var4.setSelection(Math.min(this.c, i1Var4.length()));
                break;
            default:
                i1 i1Var5 = this.b;
                i1Var5.r();
                i1Var5.setSelection(Math.max(0, Math.min(this.c, i1Var5.length())));
                break;
        }
    }
}
