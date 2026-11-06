package li;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ h2(t3 t3Var, int i7, int i10) {
        this.a = i10;
        this.b = t3Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g4(this.c);
                break;
            case 1:
                this.b.i4(this.c);
                break;
            case 2:
                this.b.scrollBy(0, this.c);
                break;
            default:
                this.b.h4(this.c);
                break;
        }
    }
}
