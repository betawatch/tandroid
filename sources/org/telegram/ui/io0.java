package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp0 b;

    public /* synthetic */ io0(kp0 kp0Var, int i10) {
        this.a = i10;
        this.b = kp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                kp0 kp0Var = this.b;
                kp0Var.r = false;
                kp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    kp0Var.x0();
                    kp0Var.finishFragment();
                    kp0Var.E0();
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
