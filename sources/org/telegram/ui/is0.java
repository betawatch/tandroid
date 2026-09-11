package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class is0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs0 b;

    public /* synthetic */ is0(rs0 rs0Var, int i10) {
        this.a = i10;
        this.b = rs0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.yc(this.b.b.e0, null).m(org.telegram.ui.Components.xc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.yc(this.b.b.e0, null).m(org.telegram.ui.Components.xc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
