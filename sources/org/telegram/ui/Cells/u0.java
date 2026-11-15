package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u0 extends RadioButton {
    public final /* synthetic */ v0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, Context context) {
        super(context);
        this.y = v0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }
}
