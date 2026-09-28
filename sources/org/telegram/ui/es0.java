package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class es0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ es0(ks0 ks0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = ks0Var;
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
