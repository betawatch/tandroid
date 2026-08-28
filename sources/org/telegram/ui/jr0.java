package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ jr0(pr0 pr0Var, boolean z10, int i9) {
        this.a = i9;
        this.b = pr0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.oc.F(this.b.b.a0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.oc.F(this.b.b.a0, this.c).j();
                break;
        }
    }
}
