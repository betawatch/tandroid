package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k11 b;
    public final /* synthetic */ j11 c;

    public /* synthetic */ h11(k11 k11Var, j11 j11Var, int i10) {
        this.a = i10;
        this.b = k11Var;
        this.c = j11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
