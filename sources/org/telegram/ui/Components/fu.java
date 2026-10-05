package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu b;

    public /* synthetic */ fu(gu guVar, int i10) {
        this.a = i10;
        this.b = guVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gu guVar = this.b;
                guVar.post(new fu(guVar, 1));
                break;
            case 1:
                gu guVar2 = this.b;
                guVar2.invalidateSpoilers();
                guVar2.b();
                break;
            case 2:
                gu.a(this.b);
                break;
            case 3:
                gu guVar3 = this.b;
                guVar3.post(new fu(guVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
