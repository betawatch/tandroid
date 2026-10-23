package ei;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ rg.d2 c;

    public /* synthetic */ m4(f6 f6Var, rg.d2 d2Var, int i10) {
        this.a = i10;
        this.b = f6Var;
        this.c = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0(this.c, true);
                break;
            default:
                this.b.A0(this.c);
                break;
        }
    }
}
