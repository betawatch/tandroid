package hi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
