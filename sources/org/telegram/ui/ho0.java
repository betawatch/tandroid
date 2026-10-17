package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp0 b;

    public /* synthetic */ ho0(jp0 jp0Var, int i10) {
        this.a = i10;
        this.b = jp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                jp0 jp0Var = this.b;
                jp0Var.r = false;
                jp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    jp0Var.x0();
                    jp0Var.finishFragment();
                    jp0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                ei.h1 h1Var = this.b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    break;
                }
                break;
        }
    }
}
