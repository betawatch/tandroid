package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v0 extends RadioButton {
    public final /* synthetic */ w0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, Context context) {
        super(context);
        this.y = w0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }
}
