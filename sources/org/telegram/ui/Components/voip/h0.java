package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.k30;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ k30 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k30 k30Var, Context context) {
        super(context);
        this.j0 = k30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.j0.invalidate();
    }
}
