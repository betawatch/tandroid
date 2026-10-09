package ci;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ra(lc lcVar, boolean z10, int i10) {
        this.a = i10;
        this.b = lcVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                lc lcVar = this.b;
                if (!this.c) {
                    lcVar.J0.b(false, false);
                    break;
                } else {
                    lcVar.getClass();
                    break;
                }
            default:
                lc lcVar2 = this.b;
                lcVar2.R = null;
                lcVar2.e = false;
                lcVar2.p(this.c);
                break;
        }
    }
}
