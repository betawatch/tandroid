package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ us0 b;

    public /* synthetic */ ls0(us0 us0Var, int i10) {
        this.a = i10;
        this.b = us0Var;
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
