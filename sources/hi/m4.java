package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa b;

    public /* synthetic */ m4(pa paVar, int i7) {
        this.a = i7;
        this.b = paVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j5 j5Var = this.b.Y1;
                if (j5Var != null) {
                    j5Var.O0();
                    break;
                }
                break;
            default:
                this.b.o2.q1.setVisibility(8);
                break;
        }
    }
}
