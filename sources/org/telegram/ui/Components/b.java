package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements org.telegram.messenger.rc {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ b(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // org.telegram.messenger.rc
    public final void a(String str) {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                g0Var.j2 = str;
                g0Var.G2.O(true);
                break;
            default:
                g0 g0Var2 = this.b;
                g0Var2.j2 = str;
                g0Var2.G2.O(true);
                break;
        }
    }
}
