package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks0 b;

    public /* synthetic */ as0(ks0 ks0Var, int i10) {
        this.a = i10;
        this.b = ks0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.xc(this.b.b.e0, null).m(org.telegram.ui.Components.wc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.xc(this.b.b.e0, null).m(org.telegram.ui.Components.wc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
