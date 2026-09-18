package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ du b;

    public /* synthetic */ cu(du duVar, int i10) {
        this.a = i10;
        this.b = duVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                du duVar = this.b;
                duVar.post(new cu(duVar, 1));
                break;
            case 1:
                du duVar2 = this.b;
                duVar2.invalidateSpoilers();
                duVar2.b();
                break;
            case 2:
                du.a(this.b);
                break;
            case 3:
                du duVar3 = this.b;
                duVar3.post(new cu(duVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
