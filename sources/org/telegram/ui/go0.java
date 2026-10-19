package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class go0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip0 b;

    public /* synthetic */ go0(ip0 ip0Var, int i10) {
        this.a = i10;
        this.b = ip0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ip0 ip0Var = this.b;
                ip0Var.r = false;
                ip0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    ip0Var.x0();
                    ip0Var.finishFragment();
                    ip0Var.E0();
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
