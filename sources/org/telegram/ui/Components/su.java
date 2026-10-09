package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class su implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu b;

    public /* synthetic */ su(tu tuVar, int i10) {
        this.a = i10;
        this.b = tuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tu tuVar = this.b;
                tuVar.post(new su(tuVar, 1));
                break;
            case 1:
                tu tuVar2 = this.b;
                tuVar2.invalidateSpoilers();
                tuVar2.b();
                break;
            case 2:
                tu.a(this.b);
                break;
            case 3:
                tu tuVar3 = this.b;
                tuVar3.post(new su(tuVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
