package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nt b;

    public /* synthetic */ mt(nt ntVar, int i10) {
        this.a = i10;
        this.b = ntVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nt ntVar = this.b;
                ntVar.post(new mt(ntVar, 1));
                break;
            case 1:
                nt ntVar2 = this.b;
                ntVar2.invalidateSpoilers();
                ntVar2.b();
                break;
            case 2:
                nt.a(this.b);
                break;
            case 3:
                nt ntVar3 = this.b;
                ntVar3.post(new mt(ntVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
