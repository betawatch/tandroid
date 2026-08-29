package nh;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ q9(gb gbVar, boolean z10, int i10) {
        this.a = i10;
        this.b = gbVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            case 1:
                gb gbVar = this.b;
                if (!this.c) {
                    gbVar.F0.b(false, false);
                    break;
                } else {
                    gbVar.getClass();
                    break;
                }
            default:
                gb gbVar2 = this.b;
                gbVar2.N = null;
                gbVar2.e = false;
                gbVar2.q(this.c);
                break;
        }
    }
}
