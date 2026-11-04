package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 d;

    public /* synthetic */ y0(s4 s4Var, org.telegram.ui.ActionBar.s1 s1Var, org.telegram.ui.ActionBar.d2 d2Var, int i3) {
        this.a = i3;
        this.b = s4Var;
        this.c = s1Var;
        this.d = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new y0(this.b, this.c, this.d, 1));
                break;
            default:
                t4.d0(this.b, this.c, this.d);
                break;
        }
    }
}
