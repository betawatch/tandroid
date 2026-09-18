package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ms0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ms0(ss0 ss0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = ss0Var;
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
