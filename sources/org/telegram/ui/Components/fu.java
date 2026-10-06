package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
