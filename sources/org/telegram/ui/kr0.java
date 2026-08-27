package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kr0(qr0 qr0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = qr0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.mc.F(this.b.b.a0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.mc.F(this.b.b.a0, this.c).j();
                break;
        }
    }
}
