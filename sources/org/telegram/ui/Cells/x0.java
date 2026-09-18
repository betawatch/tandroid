package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
