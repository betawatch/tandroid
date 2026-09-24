package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                new org.telegram.ui.Components.yc(this.b.b.e0, null).m(org.telegram.ui.Components.xc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.yc(this.b.b.e0, null).m(org.telegram.ui.Components.xc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
