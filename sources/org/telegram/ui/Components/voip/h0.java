package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.h30;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ h30 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(h30 h30Var, Context context) {
        super(context);
        this.f0 = h30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
