package androidx.biometric;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ q d;

    public /* synthetic */ f(q qVar, int i7, CharSequence charSequence, int i10) {
        this.a = i10;
        this.d = qVar;
        this.b = i7;
        this.c = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = this.d.l0;
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
