package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ or0 b;

    public /* synthetic */ fr0(or0 or0Var, int i10) {
        this.a = i10;
        this.b = or0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.tc(this.b.b.a0, null).m(org.telegram.ui.Components.sc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.tc(this.b.b.a0, null).m(org.telegram.ui.Components.sc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
