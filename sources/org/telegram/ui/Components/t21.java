package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m31 b;

    public /* synthetic */ t21(m31 m31Var, int i10) {
        this.a = i10;
        this.b = m31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m31 m31Var = this.b;
                c31 c31Var = m31Var.G;
                c31Var.x1(true);
                a31 a31Var = m31Var.s;
                a31Var.x1(true);
                m31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(a31Var);
                AndroidUtilities.updateVisibleRows(c31Var);
                break;
            default:
                m31 m31Var2 = this.b;
                if (m31Var2.k()) {
                    m31Var2.l();
                    break;
                }
                break;
        }
    }
}
