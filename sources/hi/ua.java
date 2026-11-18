package hi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ db b;

    public /* synthetic */ ua(db dbVar, int i7) {
        this.a = i7;
        this.b = dbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                db dbVar = this.b;
                bb bbVar = dbVar.N;
                if (bbVar != null) {
                    long j3 = bbVar.a;
                    if (j3 > 0) {
                        dbVar.I = j3;
                        break;
                    }
                }
                break;
            case 1:
                xa xaVar = this.b.a;
                if (xaVar != null) {
                    xaVar.N1();
                    break;
                }
                break;
            default:
                xa xaVar2 = this.b.a;
                if (xaVar2 != null) {
                    xaVar2.f0();
                    break;
                }
                break;
        }
    }
}
