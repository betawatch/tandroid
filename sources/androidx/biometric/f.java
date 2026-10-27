package androidx.biometric;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                x xVar = this.d.l0;
                if (xVar.e == null) {
                    xVar.e = new u();
                }
                xVar.e.a(this.b, this.c);
                break;
            default:
                this.d.T(this.b, this.c);
                break;
        }
    }
}
