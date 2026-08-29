package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ut b;

    public /* synthetic */ tt(ut utVar, int i10) {
        this.a = i10;
        this.b = utVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ut utVar = this.b;
                utVar.post(new tt(utVar, 1));
                break;
            case 1:
                ut utVar2 = this.b;
                utVar2.invalidateSpoilers();
                utVar2.b();
                break;
            case 2:
                ut.a(this.b);
                break;
            case 3:
                ut utVar3 = this.b;
                utVar3.post(new tt(utVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
