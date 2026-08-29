package l4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ n0(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.l();
                break;
            case 1:
                r0 r0Var = this.b;
                if (!r0Var.X) {
                    y yVar = r0Var.C;
                    yVar.getClass();
                    yVar.a(r0Var);
                    break;
                }
                break;
            default:
                this.b.R = true;
                break;
        }
    }
}
