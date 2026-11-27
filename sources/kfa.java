// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class kfa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eja b;
    public final /* synthetic */ int c;

    public /* synthetic */ kfa(eja ejaVar, int i, byte b) {
        this.a = b;
        this.b = ejaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        eja ejaVar = this.b;
        switch (b) {
            case 0:
                ejaVar.U0(i, ejaVar.m1, ejaVar.y1);
                break;
            case 1:
                ejaVar.n1(i, false);
                break;
            case 2:
                ejaVar.o1(i);
                break;
            case 3:
                ejaVar.V0(i, ejaVar.m1, ejaVar.y1);
                break;
            default:
                ejaVar.o1(i);
                break;
        }
    }
}
