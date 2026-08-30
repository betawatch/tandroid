package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.v30;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g0 extends UndoView {
    public final /* synthetic */ v30 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(v30 v30Var, Context context) {
        super(context);
        this.c0 = v30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.c0.invalidate();
    }
}
