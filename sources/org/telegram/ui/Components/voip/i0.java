package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.v30;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
