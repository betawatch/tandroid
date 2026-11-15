package di;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ long c;

    public /* synthetic */ m1(c6 c6Var, long j3, int i7) {
        this.a = i7;
        this.b = c6Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        c6 c6Var = this.b;
        switch (i7) {
            case 0:
                c6Var.V1(j3);
                break;
            case 1:
                c6Var.V1(j3);
                break;
            case 2:
                l1 l1Var = c6Var.q3;
                c6Var.t2(1, true, null);
                if (j3 > 0) {
                    org.telegram.messenger.g0.r(l1Var);
                    org.telegram.messenger.g0.h3(l1Var);
                    break;
                }
                break;
            case 3:
                c6Var.V1(j3);
                break;
            case 4:
                c6Var.V1(j3);
                break;
            case 5:
                c6Var.U1(j3);
                break;
            case 6:
                bb bbVar = new bb(c6Var.getContext(), c6Var.J0, this.c, 10, null, new s2(4, c6Var, new boolean[]{false}), 0L);
                bbVar.setOnDismissListener(new k3(c6Var, 0));
                bbVar.show();
                break;
            case 7:
                c6Var.V1(j3);
                break;
            case 8:
                c6Var.U1(j3);
                break;
            case 9:
                c6Var.V1(j3);
                break;
            case 10:
                c6Var.U1(j3);
                break;
            case 11:
                c6Var.V1(j3);
                break;
            default:
                c6Var.U1(j3);
                break;
        }
    }
}
