package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y21 b;

    public /* synthetic */ f21(y21 y21Var, int i10) {
        this.a = i10;
        this.b = y21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y21 y21Var = this.b;
                o21 o21Var = y21Var.G;
                o21Var.x1(true);
                m21 m21Var = y21Var.s;
                m21Var.x1(true);
                y21Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(m21Var);
                AndroidUtilities.updateVisibleRows(o21Var);
                break;
            default:
                y21 y21Var2 = this.b;
                if (y21Var2.k()) {
                    y21Var2.l();
                    break;
                }
                break;
        }
    }
}
