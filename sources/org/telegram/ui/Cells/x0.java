package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class x0 extends RadioButton {
    public final /* synthetic */ y0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, Context context) {
        super(context);
        this.x = y0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.x.invalidate();
    }
}
