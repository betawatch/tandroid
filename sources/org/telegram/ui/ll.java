package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ll extends org.telegram.ui.Components.y10 {
    public final /* synthetic */ qn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(qn qnVar, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        super(activity, o2Var);
        this.b = qnVar;
    }

    @Override // org.telegram.ui.Components.y10
    public final void m() {
        qn qnVar = this.b;
        qnVar.Q7();
        UndoView undoView = qnVar.u3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        qnVar.getMessagesController().removeSuggestion(qnVar.P5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.y10
    public final void n() {
        qn qnVar = this.b;
        qnVar.getMessagesController().convertToGigaGroup(qnVar.getParentActivity(), qnVar.e, qnVar, new b1(this, 19));
    }
}
