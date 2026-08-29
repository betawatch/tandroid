package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m21 b;

    public /* synthetic */ v11(m21 m21Var, int i10) {
        this.a = i10;
        this.b = m21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m21 m21Var = this.b;
                c21 c21Var = m21Var.C;
                c21Var.w1(true);
                a21 a21Var = m21Var.s;
                a21Var.w1(true);
                m21Var.F.a(true, true);
                AndroidUtilities.updateVisibleRows(a21Var);
                AndroidUtilities.updateVisibleRows(c21Var);
                break;
            default:
                m21 m21Var2 = this.b;
                if (m21Var2.k()) {
                    m21Var2.l();
                    break;
                }
                break;
        }
    }
}
