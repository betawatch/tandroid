package ih;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ c4(r5 r5Var, int i10) {
        this.a = i10;
        this.b = r5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b5 b5Var = this.b.d;
                if (!b5Var.l.isEmpty()) {
                    b5Var.l.clear();
                    b5Var.h();
                    break;
                }
                break;
            case 1:
                b5 b5Var2 = this.b.d;
                if (!b5Var2.k.isEmpty()) {
                    b5Var2.k.clear();
                    b5Var2.h();
                    break;
                }
                break;
            case 2:
                b5 b5Var3 = this.b.d;
                if (!b5Var3.j.isEmpty()) {
                    b5Var3.j.clear();
                    b5Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.d.i(a5.b);
                break;
            case 4:
                this.b.d.i(a5.c);
                break;
            default:
                this.b.d.i(a5.d);
                break;
        }
    }
}
