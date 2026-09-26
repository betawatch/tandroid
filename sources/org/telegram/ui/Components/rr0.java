package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.Cells.t7 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ rr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.a = t7Var;
        this.b = f7;
        this.c = f10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.n(this.b, this.c);
    }
}
