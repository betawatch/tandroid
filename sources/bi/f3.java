package bi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f3(i3 i3Var, boolean z10, int i7) {
        this.a = i7;
        this.b = i3Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                i3 i3Var = this.b;
                if (!z10) {
                    i3Var.H.setVisibility(8);
                    break;
                } else {
                    i3Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                i3 i3Var2 = this.b;
                if (!z11) {
                    i3Var2.w.setVisibility(8);
                    break;
                } else {
                    i3Var2.getClass();
                    break;
                }
        }
    }
}
