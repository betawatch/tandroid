package di;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ long c;

    public /* synthetic */ m1(f6 f6Var, long j3, int i7) {
        this.a = i7;
        this.b = f6Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        f6 f6Var = this.b;
        switch (i7) {
            case 0:
                f6Var.h2(j3);
                break;
            case 1:
                f6Var.h2(j3);
                break;
            case 2:
                k1 k1Var = f6Var.t3;
                f6Var.H2(1, true, null);
                if (j3 > 0) {
                    org.telegram.messenger.g0.r(k1Var);
                    org.telegram.messenger.g0.g3(k1Var);
                    break;
                }
                break;
            case 3:
                f6Var.h2(j3);
                break;
            case 4:
                f6Var.h2(j3);
                break;
            case 5:
                f6Var.d2(j3);
                break;
            case 6:
                fb fbVar = new fb(f6Var.getContext(), f6Var.J0, this.c, 10, null, new f2(6, f6Var, new boolean[]{false}), 0L);
                fbVar.setOnDismissListener(new n3(f6Var, 0));
                fbVar.show();
                break;
            case 7:
                f6Var.h2(j3);
                break;
            case 8:
                f6Var.d2(j3);
                break;
            case 9:
                f6Var.h2(j3);
                break;
            case 10:
                f6Var.d2(j3);
                break;
            case 11:
                f6Var.h2(j3);
                break;
            default:
                f6Var.d2(j3);
                break;
        }
    }
}
