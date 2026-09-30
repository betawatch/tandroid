package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fu b;

    public /* synthetic */ eu(fu fuVar, int i10) {
        this.a = i10;
        this.b = fuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fu fuVar = this.b;
                fuVar.post(new eu(fuVar, 1));
                break;
            case 1:
                fu fuVar2 = this.b;
                fuVar2.invalidateSpoilers();
                fuVar2.b();
                break;
            case 2:
                fu.a(this.b);
                break;
            case 3:
                fu fuVar3 = this.b;
                fuVar3.post(new eu(fuVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
