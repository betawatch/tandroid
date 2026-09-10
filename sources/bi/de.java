package bi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class de implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;

    public /* synthetic */ de(me meVar, int i10) {
        this.a = i10;
        this.b = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                me meVar = this.b;
                ke keVar = meVar.M;
                if (keVar != null) {
                    long j3 = keVar.a;
                    if (j3 > 0) {
                        meVar.H = j3;
                        break;
                    }
                }
                break;
            case 1:
                ge geVar = this.b.a;
                if (geVar != null) {
                    geVar.h0();
                    break;
                }
                break;
            default:
                ge geVar2 = this.b.a;
                if (geVar2 != null) {
                    geVar2.r();
                    break;
                }
                break;
        }
    }
}
