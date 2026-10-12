package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ou implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pu b;

    public /* synthetic */ ou(pu puVar, int i10) {
        this.a = i10;
        this.b = puVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pu puVar = this.b;
                puVar.post(new ou(puVar, 1));
                break;
            case 1:
                pu puVar2 = this.b;
                puVar2.invalidateSpoilers();
                puVar2.b();
                break;
            case 2:
                pu.a(this.b);
                break;
            case 3:
                pu puVar3 = this.b;
                puVar3.post(new ou(puVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
