package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bm extends org.telegram.ui.Components.a30 {
    public final /* synthetic */ fo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(fo foVar, Activity activity, org.telegram.ui.ActionBar.m2 m2Var) {
        super(activity, m2Var);
        this.b = foVar;
    }

    @Override // org.telegram.ui.Components.a30
    public final void n() {
        fo foVar = this.b;
        foVar.T7();
        UndoView undoView = foVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        foVar.getMessagesController().removeSuggestion(foVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.a30
    public final void o() {
        fo foVar = this.b;
        foVar.getMessagesController().convertToGigaGroup(foVar.getParentActivity(), foVar.e, foVar, new b1(this, 19));
    }
}
