package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ j7(h8 h8Var, int i10) {
        this.a = i10;
        this.b = h8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h8.n(this.b);
                break;
            default:
                h8.G(this.b);
                break;
        }
    }
}
