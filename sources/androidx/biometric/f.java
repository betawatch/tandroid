package androidx.biometric;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ q d;

    public /* synthetic */ f(q qVar, int i10, CharSequence charSequence, int i11) {
        this.a = i11;
        this.d = qVar;
        this.b = i10;
        this.c = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = this.d.i0;
                if (zVar.e == null) {
                    zVar.e = new w();
                }
                zVar.e.a(this.b, this.c);
                break;
            default:
                this.d.T(this.b, this.c);
                break;
        }
    }
}
