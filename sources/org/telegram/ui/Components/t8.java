package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9 b;

    public /* synthetic */ t8(c9 c9Var, int i10) {
        this.a = i10;
        this.b = c9Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    c9.U(this.b);
                    break;
                }
                break;
            default:
                c9 c9Var = this.b;
                if (i10 == -1) {
                    c9.U(c9Var);
                }
                if (i10 == 1) {
                    c9Var.f0();
                    break;
                }
                break;
        }
    }
}
