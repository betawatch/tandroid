package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class os0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ us0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ os0(us0 us0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = us0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.vc.F(this.b.b.e0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.vc.F(this.b.b.e0, this.c).j();
                break;
        }
    }
}
