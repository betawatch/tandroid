package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class hs0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs0 b;

    public /* synthetic */ hs0(rs0 rs0Var, int i10) {
        this.a = i10;
        this.b = rs0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.wc(this.b.b.e0, null).m(org.telegram.ui.Components.vc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.wc(this.b.b.e0, null).m(org.telegram.ui.Components.vc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
