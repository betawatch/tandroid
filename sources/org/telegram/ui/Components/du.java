package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class du implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eu b;

    public /* synthetic */ du(eu euVar, int i10) {
        this.a = i10;
        this.b = euVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eu euVar = this.b;
                euVar.post(new du(euVar, 1));
                break;
            case 1:
                eu euVar2 = this.b;
                euVar2.invalidateSpoilers();
                euVar2.b();
                break;
            case 2:
                eu.a(this.b);
                break;
            case 3:
                eu euVar3 = this.b;
                euVar3.post(new du(euVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
