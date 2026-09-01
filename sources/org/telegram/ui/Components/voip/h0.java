package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.w30;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ w30 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(w30 w30Var, Context context) {
        super(context);
        this.c0 = w30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.c0.invalidate();
    }
}
