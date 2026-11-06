package li;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ v4.l0 c;

    public /* synthetic */ w2(t3 t3Var, v4.l0 l0Var, int i7) {
        this.a = i7;
        this.b = t3Var;
        this.c = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.setItemAnimator(this.c);
                break;
            case 1:
                this.b.setItemAnimator(this.c);
                break;
            default:
                this.b.setItemAnimator(this.c);
                break;
        }
    }
}
