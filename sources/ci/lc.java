package ci;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class lc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc b;

    public /* synthetic */ lc(vc vcVar, int i10) {
        this.a = i10;
        this.b = vcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vc vcVar = this.b;
                tc tcVar = vcVar.M;
                if (tcVar != null) {
                    long j3 = tcVar.a;
                    if (j3 > 0) {
                        vcVar.H = j3;
                        break;
                    }
                }
                break;
            case 1:
                oc ocVar = this.b.a;
                if (ocVar != null) {
                    ocVar.m0();
                    break;
                }
                break;
            default:
                oc ocVar2 = this.b.a;
                if (ocVar2 != null) {
                    ocVar2.s();
                    break;
                }
                break;
        }
    }
}
