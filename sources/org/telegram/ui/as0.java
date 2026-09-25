package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
