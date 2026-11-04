package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2.p0 b;
    public final /* synthetic */ t70 c;

    public /* synthetic */ p70(m2.p0 p0Var, t70 t70Var, int i3) {
        this.a = i3;
        this.b = p0Var;
        this.c = t70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m(this.c, false);
                break;
            default:
                this.b.m(this.c, false);
                break;
        }
    }
}
