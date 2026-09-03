package androidx.biometric;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ g(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = this.b.i0;
                if (zVar.e == null) {
                    zVar.e = new w();
                }
                zVar.e.b();
                break;
            default:
                this.b.i0.w = false;
                break;
        }
    }
}
