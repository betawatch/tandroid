package hi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c9(ta taVar, boolean z10, int i7) {
        this.a = i7;
        this.b = taVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                ta taVar = this.b;
                if (!this.c) {
                    taVar.K0.b(false, false);
                    break;
                } else {
                    taVar.getClass();
                    break;
                }
            default:
                ta taVar2 = this.b;
                taVar2.S = null;
                taVar2.e = false;
                taVar2.p(this.c);
                break;
        }
    }
}
