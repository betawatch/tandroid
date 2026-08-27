package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr0 b;

    public /* synthetic */ hr0(qr0 qr0Var, int i10) {
        this.a = i10;
        this.b = qr0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.mc(this.b.b.a0, null).m(org.telegram.ui.Components.lc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.mc(this.b.b.a0, null).m(org.telegram.ui.Components.lc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
