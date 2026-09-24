package ci;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class mc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wc b;

    public /* synthetic */ mc(wc wcVar, int i10) {
        this.a = i10;
        this.b = wcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wc wcVar = this.b;
                uc ucVar = wcVar.M;
                if (ucVar != null) {
                    long j3 = ucVar.a;
                    if (j3 > 0) {
                        wcVar.H = j3;
                        break;
                    }
                }
                break;
            case 1:
                pc pcVar = this.b.a;
                if (pcVar != null) {
                    pcVar.b0();
                    break;
                }
                break;
            default:
                pc pcVar2 = this.b.a;
                if (pcVar2 != null) {
                    pcVar2.r();
                    break;
                }
                break;
        }
    }
}
