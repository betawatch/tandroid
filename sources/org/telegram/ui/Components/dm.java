package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ int c;

    public /* synthetic */ dm(bn bnVar, int i7, int i10) {
        this.a = i10;
        this.b = bnVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, null);
                break;
            case 1:
                this.b.g0(this.c);
                break;
            default:
                this.b.j0(this.c, null);
                break;
        }
    }
}
