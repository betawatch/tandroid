package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.w30;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
