package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i90 b;
    public final /* synthetic */ m90 c;

    public /* synthetic */ h90(i90 i90Var, m90 m90Var, int i10) {
        this.a = i10;
        this.b = i90Var;
        this.c = m90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k(this.c, false);
                break;
            default:
                this.b.k(this.c, false);
                break;
        }
    }
}
