package hi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class l9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;

    public /* synthetic */ l9(ta taVar, int i7) {
        this.a = i7;
        this.b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ta taVar = this.b;
                taVar.getClass();
                taVar.f(1.0f, true, new s8(taVar, 6));
                taVar.c1.b(true, true);
                break;
            default:
                ta taVar2 = this.b;
                taVar2.e(false);
                taVar2.n2 = null;
                break;
        }
    }
}
