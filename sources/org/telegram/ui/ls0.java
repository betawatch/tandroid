package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ls0(rs0 rs0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = rs0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.b.b.e0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.yc.F(this.b.b.e0, this.c).j();
                break;
        }
    }
}
