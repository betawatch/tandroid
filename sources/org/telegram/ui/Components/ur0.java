package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lu0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ur0(lu0 lu0Var, int i10, int i11) {
        this.a = i11;
        this.b = lu0Var;
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
