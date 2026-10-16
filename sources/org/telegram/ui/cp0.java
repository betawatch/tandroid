package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ eq0 b;

    public /* synthetic */ cp0(eq0 eq0Var, int i10) {
        this.a = i10;
        this.b = eq0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                eq0 eq0Var = this.b;
                eq0Var.r = false;
                eq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    eq0Var.x0();
                    eq0Var.finishFragment();
                    eq0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                di.h1 h1Var = this.b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    break;
                }
                break;
        }
    }
}
