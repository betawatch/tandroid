package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr0 b;

    public /* synthetic */ fr0(pr0 pr0Var, int i9) {
        this.a = i9;
        this.b = pr0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                new org.telegram.ui.Components.oc(this.b.b.a0, null).m(org.telegram.ui.Components.nc.r, 1, -115203550, -1, null).j();
                break;
            default:
                new org.telegram.ui.Components.oc(this.b.b.a0, null).m(org.telegram.ui.Components.nc.r, 1, -115203550, -1, null).j();
                break;
        }
    }
}
