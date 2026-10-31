package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t0 extends RadioButton {
    public final /* synthetic */ u0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, Context context) {
        super(context);
        this.y = u0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }
}
