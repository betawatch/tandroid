package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class es0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ es0(ks0 ks0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = ks0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.b.b.e0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.xc.F(this.b.b.e0, this.c).j();
                break;
        }
    }
}
