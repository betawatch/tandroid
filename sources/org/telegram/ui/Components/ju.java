package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ku b;

    public /* synthetic */ ju(ku kuVar, int i10) {
        this.a = i10;
        this.b = kuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ku kuVar = this.b;
                kuVar.post(new ju(kuVar, 1));
                break;
            case 1:
                ku kuVar2 = this.b;
                kuVar2.invalidateSpoilers();
                kuVar2.b();
                break;
            case 2:
                ku.a(this.b);
                break;
            case 3:
                ku kuVar3 = this.b;
                kuVar3.post(new ju(kuVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
