package bi;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;
    public final /* synthetic */ s4.l0 c;

    public /* synthetic */ g3(d4 d4Var, s4.l0 l0Var, int i10) {
        this.a = i10;
        this.b = d4Var;
        this.c = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.setItemAnimator(this.c);
                break;
            default:
                this.b.setItemAnimator(this.c);
                break;
        }
    }
}
