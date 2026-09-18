package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
