// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t5b b;

    public /* synthetic */ l5b(t5b t5bVar, byte b) {
        this.a = b;
        this.b = t5bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t5b t5bVar = this.b;
        switch (b) {
            case 0:
                y5b y5bVar = t5bVar.a0;
                m21.h(y5bVar.c);
                super/*fx0*/.dismiss();
                break;
            case 1:
                t5bVar.w.setLoading(false);
                y5b y5bVar2 = t5bVar.a0;
                y5bVar2.F0();
                y5bVar2.l1.E(0);
                break;
            case 2:
                t5bVar.V = false;
                break;
            case 3:
                y5b y5bVar3 = t5bVar.a0;
                y5bVar3.G1 = 6;
                y5bVar3.l1.E(1);
                break;
            case 4:
                t5bVar.n.g(2);
                t5bVar.f.forceLayout();
                t5bVar.k();
                break;
            default:
                int i = t5bVar.a;
                y5b y5bVar4 = t5bVar.a0;
                if (i != 0) {
                    y5bVar4.onBackPressed();
                    break;
                } else {
                    y5bVar4.dismiss();
                    break;
                }
        }
    }
}
