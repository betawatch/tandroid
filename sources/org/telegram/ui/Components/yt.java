package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt b;

    public /* synthetic */ yt(zt ztVar, int i10) {
        this.a = i10;
        this.b = ztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zt ztVar = this.b;
                ztVar.post(new yt(ztVar, 1));
                break;
            case 1:
                zt ztVar2 = this.b;
                ztVar2.invalidateSpoilers();
                ztVar2.b();
                break;
            case 2:
                zt.a(this.b);
                break;
            case 3:
                zt ztVar3 = this.b;
                ztVar3.post(new yt(ztVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
