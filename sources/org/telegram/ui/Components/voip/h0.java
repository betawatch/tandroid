package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.m30;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ m30 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m30 m30Var, Context context) {
        super(context);
        this.j0 = m30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.j0.invalidate();
    }
}
