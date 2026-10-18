package androidx.biometric;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ q d;

    public /* synthetic */ g(q qVar, int i10, CharSequence charSequence, int i11) {
        this.a = i11;
        this.d = qVar;
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
