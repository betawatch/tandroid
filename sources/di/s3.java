package di;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ s3(a4 a4Var, int i7) {
        this.a = i7;
        this.b = a4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((h9) this.b.x.z1).g(false);
                break;
            case 1:
                j4 j4Var = this.b.x;
                c4 c4Var = j4Var.z1;
                if (c4Var != null) {
                    q9 q9Var = ((h9) c4Var).d;
                    q9Var.Y0 = false;
                    q9Var.V();
                }
                j4Var.d1(false);
                j4Var.Q2 = true;
                j4Var.t0.E(true);
                break;
            case 2:
                j4 j4Var2 = this.b.x;
                j4Var2.D3 = true;
                j4Var2.setActive(false);
                break;
            default:
                j4 j4Var3 = this.b.x;
                j4Var3.D3 = true;
                j4Var3.setActive(false);
                break;
        }
    }
}
