package androidx.biometric;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ p d;

    public /* synthetic */ f(p pVar, int i10, CharSequence charSequence, int i11) {
        this.a = i11;
        this.d = pVar;
        this.b = i10;
        this.c = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y yVar = this.d.l0;
                if (yVar.e == null) {
                    yVar.e = new v();
                }
                yVar.e.a(this.b, this.c);
                break;
            default:
                this.d.T(this.b, this.c);
                break;
        }
    }
}
