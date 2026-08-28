package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.g30;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g0 extends UndoView {
    public final /* synthetic */ g30 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(g30 g30Var, Context context) {
        super(context);
        this.b0 = g30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.b0.invalidate();
    }
}
