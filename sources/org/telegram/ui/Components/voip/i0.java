package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i0 extends UndoView {
    public final /* synthetic */ c40 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(c40 c40Var, Context context) {
        super(context);
        this.f0 = c40Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
