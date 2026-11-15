package di;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                cb cbVar = new cb(c6Var.getContext(), c6Var.J0, this.c, 10, null, new s2(4, c6Var, new boolean[]{false}), 0L);
                cbVar.setOnDismissListener(new k3(c6Var, 0));
                cbVar.show();
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
