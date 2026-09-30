package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.v30;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class i0 extends UndoView {
    public final /* synthetic */ v30 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(v30 v30Var, Context context) {
        super(context);
        this.f0 = v30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
