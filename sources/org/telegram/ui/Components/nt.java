package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ot b;

    public /* synthetic */ nt(ot otVar, int i9) {
        this.a = i9;
        this.b = otVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ot otVar = this.b;
                otVar.post(new nt(otVar, 1));
                break;
            case 1:
                ot otVar2 = this.b;
                otVar2.invalidateSpoilers();
                otVar2.b();
                break;
            case 2:
                ot.a(this.b);
                break;
            case 3:
                ot otVar3 = this.b;
                otVar3.post(new nt(otVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
