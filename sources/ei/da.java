package ei;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ da(vb vbVar, boolean z10, int i10) {
        this.a = i10;
        this.b = vbVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                vb vbVar = this.b;
                if (!this.c) {
                    vbVar.J0.b(false, false);
                    break;
                } else {
                    vbVar.getClass();
                    break;
                }
            default:
                vb vbVar2 = this.b;
                vbVar2.R = null;
                vbVar2.e = false;
                vbVar2.p(this.c);
                break;
        }
    }
}
