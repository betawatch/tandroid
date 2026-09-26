package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.v30;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
