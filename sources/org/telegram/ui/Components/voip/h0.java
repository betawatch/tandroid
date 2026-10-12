package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ e40 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e40 e40Var, Context context) {
        super(context);
        this.f0 = e40Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
