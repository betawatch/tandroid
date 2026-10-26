package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lu b;

    public /* synthetic */ ku(lu luVar, int i10) {
        this.a = i10;
        this.b = luVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lu luVar = this.b;
                luVar.post(new ku(luVar, 1));
                break;
            case 1:
                lu luVar2 = this.b;
                luVar2.invalidateSpoilers();
                luVar2.b();
                break;
            case 2:
                lu.a(this.b);
                break;
            case 3:
                lu luVar3 = this.b;
                luVar3.post(new ku(luVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
