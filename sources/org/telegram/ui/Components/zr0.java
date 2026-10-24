package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qu0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ zr0(qu0 qu0Var, int i10, int i11) {
        this.a = i11;
        this.b = qu0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.scrollBy(0, this.c);
                break;
            default:
                this.b.h.scrollBy(0, this.c);
                break;
        }
    }
}
