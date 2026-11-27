// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ap1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ byte b;
    public final /* synthetic */ zu1 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ap1(int i, zu1 zu1Var, boolean z) {
        this.b = i;
        this.c = zu1Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        zu1 zu1Var = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                zu1Var.gd(b2, z);
                break;
            default:
                if (b2 != 2) {
                    zu1Var.ka();
                    zu1Var.Dc();
                }
                gp2.f(d31.b0(zu1Var), b2, z);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ap1(zu1 zu1Var, boolean z, int i) {
        this.c = zu1Var;
        this.d = z;
        this.b = i;
    }
}
