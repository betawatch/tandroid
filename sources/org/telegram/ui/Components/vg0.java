package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg0 b;

    public /* synthetic */ vg0(yg0 yg0Var, int i10) {
        this.a = i10;
        this.b = yg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            default:
                this.b.d();
                break;
        }
    }
}
