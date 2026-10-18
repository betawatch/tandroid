package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wc0 b;

    public /* synthetic */ vc0(wc0 wc0Var, int i10) {
        this.a = i10;
        this.b = wc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.y();
                break;
            default:
                this.b.m(true);
                break;
        }
    }
}
