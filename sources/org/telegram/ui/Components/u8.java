package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class u8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ u8(d9 d9Var, int i10) {
        this.a = i10;
        this.b = d9Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    d9.U(this.b);
                    break;
                }
                break;
            default:
                d9 d9Var = this.b;
                if (i10 == -1) {
                    d9.U(d9Var);
                }
                if (i10 == 1) {
                    d9Var.f0();
                    break;
                }
                break;
        }
    }
}
