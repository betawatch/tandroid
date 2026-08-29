package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ol extends org.telegram.ui.Components.j20 {
    public final /* synthetic */ tn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(tn tnVar, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        super(activity, o2Var);
        this.b = tnVar;
    }

    @Override // org.telegram.ui.Components.j20
    public final void m() {
        tn tnVar = this.b;
        tnVar.Q7();
        UndoView undoView = tnVar.u3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        tnVar.getMessagesController().removeSuggestion(tnVar.P5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.j20
    public final void n() {
        tn tnVar = this.b;
        tnVar.getMessagesController().convertToGigaGroup(tnVar.getParentActivity(), tnVar.e, tnVar, new c1(this, 19));
    }
}
