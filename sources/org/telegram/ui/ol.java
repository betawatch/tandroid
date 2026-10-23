package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ol extends org.telegram.ui.Components.w20 {
    public final /* synthetic */ qn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(qn qnVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.b = qnVar;
    }

    @Override // org.telegram.ui.Components.w20
    public final void n() {
        qn qnVar = this.b;
        qnVar.T7();
        UndoView undoView = qnVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        qnVar.getMessagesController().removeSuggestion(qnVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.w20
    public final void o() {
        qn qnVar = this.b;
        qnVar.getMessagesController().convertToGigaGroup(qnVar.getParentActivity(), qnVar.e, qnVar, new b1(this, 19));
    }
}
