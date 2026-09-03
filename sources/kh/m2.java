package kh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ m2(m3 m3Var, int i10, int i11) {
        this.a = i11;
        this.b = m3Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                g3 g3Var = this.b.f;
                if (g3Var != null) {
                    g3Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
