package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class ob implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb b;

    public /* synthetic */ ob(xb xbVar, int i7) {
        this.a = i7;
        this.b = xbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xb xbVar = this.b;
                vb vbVar = xbVar.N;
                if (vbVar != null) {
                    long j3 = vbVar.a;
                    if (j3 > 0) {
                        xbVar.I = j3;
                        break;
                    }
                }
                break;
            case 1:
                rb rbVar = this.b.a;
                if (rbVar != null) {
                    rbVar.p0();
                    break;
                }
                break;
            default:
                rb rbVar2 = this.b.a;
                if (rbVar2 != null) {
                    rbVar2.t();
                    break;
                }
                break;
        }
    }
}
