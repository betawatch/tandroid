package bi;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ a2(k7 k7Var, long j3, int i7) {
        this.a = i7;
        this.b = k7Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 1;
        long j3 = this.c;
        k7 k7Var = this.b;
        switch (i7) {
            case 0:
                k7Var.T1(j3);
                break;
            case 1:
                k7Var.T1(j3);
                break;
            case 2:
                z1 z1Var = k7Var.p3;
                k7Var.s2(1, true, null);
                if (j3 > 0) {
                    org.telegram.messenger.g0.r(z1Var);
                    org.telegram.messenger.g0.h3(z1Var);
                    break;
                }
                break;
            case 3:
                k7Var.T1(j3);
                break;
            case 4:
                k7Var.T1(j3);
                break;
            case 5:
                new zh.g1(k7Var.getContext(), k7Var.a, this.c, null, new y3(k7Var, i10)).show();
                break;
            case 6:
                tc tcVar = new tc(k7Var.getContext(), k7Var.I0, this.c, 10, null, new a4(2, k7Var, new boolean[]{false}), 0L);
                tcVar.setOnDismissListener(new j4(k7Var, 0));
                tcVar.show();
                break;
            case 7:
                k7Var.T1(j3);
                break;
            case 8:
                new zh.g1(k7Var.getContext(), k7Var.a, this.c, null, new y3(k7Var, i10)).show();
                break;
            case 9:
                k7Var.T1(j3);
                break;
            case 10:
                new zh.g1(k7Var.getContext(), k7Var.a, this.c, null, new y3(k7Var, i10)).show();
                break;
            case 11:
                k7Var.T1(j3);
                break;
            default:
                new zh.g1(k7Var.getContext(), k7Var.a, this.c, null, new y3(k7Var, i10)).show();
                break;
        }
    }
}
