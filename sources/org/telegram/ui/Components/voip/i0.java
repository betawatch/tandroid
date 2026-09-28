package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.v30;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
