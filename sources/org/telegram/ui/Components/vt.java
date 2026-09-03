package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wt b;

    public /* synthetic */ vt(wt wtVar, int i10) {
        this.a = i10;
        this.b = wtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wt wtVar = this.b;
                wtVar.post(new vt(wtVar, 1));
                break;
            case 1:
                wt wtVar2 = this.b;
                wtVar2.invalidateSpoilers();
                wtVar2.b();
                break;
            case 2:
                wt.a(this.b);
                break;
            case 3:
                wt wtVar3 = this.b;
                wtVar3.post(new vt(wtVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
