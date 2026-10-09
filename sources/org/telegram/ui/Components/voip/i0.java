package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.y30;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i0 extends UndoView {
    public final /* synthetic */ y30 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(y30 y30Var, Context context) {
        super(context);
        this.f0 = y30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
