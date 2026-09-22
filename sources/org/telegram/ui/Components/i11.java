package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class i11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l11 b;
    public final /* synthetic */ k11 c;

    public /* synthetic */ i11(l11 l11Var, k11 k11Var, int i10) {
        this.a = i10;
        this.b = l11Var;
        this.c = k11Var;
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
