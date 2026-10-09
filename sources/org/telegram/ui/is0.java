package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class is0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss0 b;

    public /* synthetic */ is0(ss0 ss0Var, int i10) {
        this.a = i10;
        this.b = ss0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.ad(this.b.b.e0, null).m(org.telegram.ui.Components.zc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.ad(this.b.b.e0, null).m(org.telegram.ui.Components.zc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
