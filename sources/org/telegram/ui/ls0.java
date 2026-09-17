package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
