package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ or0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ir0(or0 or0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = or0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.tc.F(this.b.b.a0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.tc.F(this.b.b.a0, this.c).j();
                break;
        }
    }
}
