package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
