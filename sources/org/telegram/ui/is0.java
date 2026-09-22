package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                new org.telegram.ui.Components.vc(this.b.b.e0, null).m(org.telegram.ui.Components.uc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.vc(this.b.b.e0, null).m(org.telegram.ui.Components.uc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
