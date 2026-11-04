package ci;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ long c;

    public /* synthetic */ t1(l6 l6Var, long j10, int i3) {
        this.a = i3;
        this.b = l6Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 1;
        long j10 = this.c;
        l6 l6Var = this.b;
        switch (i3) {
            case 0:
                l6Var.U1(j10);
                break;
            case 1:
                l6Var.U1(j10);
                break;
            case 2:
                s1 s1Var = l6Var.n3;
                l6Var.s2(1, true, null);
                if (j10 > 0) {
                    org.telegram.messenger.g0.r(s1Var);
                    org.telegram.messenger.g0.h3(s1Var);
                    break;
                }
                break;
            case 3:
                l6Var.U1(j10);
                break;
            case 4:
                l6Var.U1(j10);
                break;
            case 5:
                new ai.b3(l6Var.getContext(), l6Var.a, this.c, null, new k3(l6Var, i10)).show();
                break;
            case 6:
                mb mbVar = new mb(l6Var.getContext(), l6Var.J0, this.c, 10, null, new e0(9, l6Var, new boolean[]{false}), 0L);
                mbVar.setOnDismissListener(new t3(l6Var, 0));
                mbVar.show();
                break;
            case 7:
                l6Var.U1(j10);
                break;
            case 8:
                new ai.b3(l6Var.getContext(), l6Var.a, this.c, null, new k3(l6Var, i10)).show();
                break;
            case 9:
                l6Var.U1(j10);
                break;
            case 10:
                new ai.b3(l6Var.getContext(), l6Var.a, this.c, null, new k3(l6Var, i10)).show();
                break;
            case 11:
                l6Var.U1(j10);
                break;
            default:
                new ai.b3(l6Var.getContext(), l6Var.a, this.c, null, new k3(l6Var, i10)).show();
                break;
        }
    }
}
