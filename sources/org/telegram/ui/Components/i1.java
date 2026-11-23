package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 d;

    public /* synthetic */ i1(b5 b5Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.a = i7;
        this.b = b5Var;
        this.c = t1Var;
        this.d = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new i1(this.b, this.c, this.d, 1));
                break;
            default:
                c5.b0(this.b, this.c, this.d);
                break;
        }
    }
}
