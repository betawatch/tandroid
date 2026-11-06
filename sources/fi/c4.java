package fi;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;
    public final /* synthetic */ tg.r1 c;

    public /* synthetic */ c4(o5 o5Var, tg.r1 r1Var, int i7) {
        this.a = i7;
        this.b = o5Var;
        this.c = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.A0(this.c, true);
                break;
            default:
                this.b.z0(this.c);
                break;
        }
    }
}
