package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g0 extends UndoView {
    public final /* synthetic */ x30 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(x30 x30Var, Context context) {
        super(context);
        this.c0 = x30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.c0.invalidate();
    }
}
