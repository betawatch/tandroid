package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.j30;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ j30 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j30 j30Var, Context context) {
        super(context);
        this.b0 = j30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.b0.invalidate();
    }
}
