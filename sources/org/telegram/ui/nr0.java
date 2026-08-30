package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wr0 b;

    public /* synthetic */ nr0(wr0 wr0Var, int i10) {
        this.a = i10;
        this.b = wr0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.qc(this.b.b.b0, null).m(org.telegram.ui.Components.pc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.qc(this.b.b.b0, null).m(org.telegram.ui.Components.pc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
