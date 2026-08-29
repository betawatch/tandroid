package nh;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ x9(gb gbVar, int i10) {
        this.a = i10;
        this.b = gbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gb gbVar = this.b;
                gbVar.getClass();
                gbVar.g(1.0f, true, new g9(gbVar, 6));
                gbVar.X0.b(true, true);
                break;
            default:
                gb gbVar2 = this.b;
                gbVar2.f(false);
                gbVar2.i2 = null;
                break;
        }
    }
}
