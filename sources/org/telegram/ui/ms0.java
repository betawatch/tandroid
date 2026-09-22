package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ms0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ms0(ss0 ss0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = ss0Var;
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
