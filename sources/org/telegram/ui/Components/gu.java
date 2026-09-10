package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu b;

    public /* synthetic */ gu(hu huVar, int i10) {
        this.a = i10;
        this.b = huVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hu huVar = this.b;
                huVar.post(new gu(huVar, 1));
                break;
            case 1:
                hu huVar2 = this.b;
                huVar2.invalidateSpoilers();
                huVar2.b();
                break;
            case 2:
                hu.a(this.b);
                break;
            case 3:
                hu huVar3 = this.b;
                huVar3.post(new gu(huVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
