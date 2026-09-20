package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
