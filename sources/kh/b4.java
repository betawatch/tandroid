package kh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ b4(q5 q5Var, int i10) {
        this.a = i10;
        this.b = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a5 a5Var = this.b.d;
                if (!a5Var.l.isEmpty()) {
                    a5Var.l.clear();
                    a5Var.h();
                    break;
                }
                break;
            case 1:
                a5 a5Var2 = this.b.d;
                if (!a5Var2.k.isEmpty()) {
                    a5Var2.k.clear();
                    a5Var2.h();
                    break;
                }
                break;
            case 2:
                a5 a5Var3 = this.b.d;
                if (!a5Var3.j.isEmpty()) {
                    a5Var3.j.clear();
                    a5Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.d.i(z4.b);
                break;
            case 4:
                this.b.d.i(z4.c);
                break;
            default:
                this.b.d.i(z4.d);
                break;
        }
    }
}
