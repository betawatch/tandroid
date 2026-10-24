package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.k30;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
