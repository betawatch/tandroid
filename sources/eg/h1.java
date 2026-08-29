package eg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j1 b;

    public /* synthetic */ h1(j1 j1Var, int i10) {
        this.a = i10;
        this.b = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j1.e0(this.b);
                break;
            default:
                j1.d0(this.b);
                break;
        }
    }
}
