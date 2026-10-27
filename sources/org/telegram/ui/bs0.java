package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bs0(hs0 hs0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = hs0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.wc.F(this.b.b.e0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.wc.F(this.b.b.e0, this.c).j();
                break;
        }
    }
}
