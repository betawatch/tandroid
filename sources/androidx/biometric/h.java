package androidx.biometric;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ h(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y yVar = this.b.l0;
                if (yVar.e == null) {
                    yVar.e = new v();
                }
                yVar.e.b();
                break;
            default:
                this.b.l0.w = false;
                break;
        }
    }
}
