package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ k7(g8 g8Var, int i10) {
        this.a = i10;
        this.b = g8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g8.n(this.b);
                break;
            default:
                g8.F(this.b);
                break;
        }
    }
}
