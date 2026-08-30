package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt b;

    public /* synthetic */ wt(xt xtVar, int i10) {
        this.a = i10;
        this.b = xtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xt xtVar = this.b;
                xtVar.post(new wt(xtVar, 1));
                break;
            case 1:
                xt xtVar2 = this.b;
                xtVar2.invalidateSpoilers();
                xtVar2.b();
                break;
            case 2:
                xt.a(this.b);
                break;
            case 3:
                xt xtVar3 = this.b;
                xtVar3.post(new wt(xtVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
