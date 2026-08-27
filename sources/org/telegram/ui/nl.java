package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nl extends org.telegram.ui.Components.b20 {
    public final /* synthetic */ rn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl(rn rnVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.b = rnVar;
    }

    @Override // org.telegram.ui.Components.b20
    public final void m() {
        rn rnVar = this.b;
        rnVar.Q7();
        UndoView undoView = rnVar.u3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        rnVar.getMessagesController().removeSuggestion(rnVar.P5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.b20
    public final void n() {
        rn rnVar = this.b;
        rnVar.getMessagesController().convertToGigaGroup(rnVar.getParentActivity(), rnVar.e, rnVar, new c1(this, 19));
    }
}
