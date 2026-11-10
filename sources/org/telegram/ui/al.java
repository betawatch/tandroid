package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class al extends org.telegram.ui.Components.d10 {
    public final /* synthetic */ cn m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(cn cnVar, Activity activity, org.telegram.ui.ActionBar.f2 f2Var) {
        super(activity, f2Var);
        this.m1 = cnVar;
    }

    @Override // org.telegram.ui.Components.d10
    public final void I0() {
        cn cnVar = this.m1;
        cnVar.g8();
        UndoView undoView = cnVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        cnVar.getMessagesController().k4(cnVar.j6, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.d10
    public final void J0() {
        cn cnVar = this.m1;
        cnVar.getMessagesController().S(cnVar.getParentActivity(), cnVar.e, cnVar, new w0(this, 21));
    }
}
