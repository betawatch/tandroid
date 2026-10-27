package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc0 b;

    public /* synthetic */ uc0(vc0 vc0Var, int i10) {
        this.a = i10;
        this.b = vc0Var;
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
