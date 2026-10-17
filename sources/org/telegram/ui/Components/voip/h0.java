package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.j30;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ j30 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j30 j30Var, Context context) {
        super(context);
        this.f0 = j30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
