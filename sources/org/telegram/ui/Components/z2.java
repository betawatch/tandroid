package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi.l3 b;

    public /* synthetic */ z2(gi.l3 l3Var, int i3) {
        this.a = i3;
        this.b = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        gi.l3 l3Var = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.E2(l3Var);
                break;
            default:
                float[] fArr = FragmentContextView.X0;
                org.telegram.messenger.g0.E2(l3Var);
                break;
        }
    }
}
