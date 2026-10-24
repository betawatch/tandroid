package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class pl extends org.telegram.ui.Components.w20 {
    public final /* synthetic */ sn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(sn snVar, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        super(activity, o2Var);
        this.b = snVar;
    }

    @Override // org.telegram.ui.Components.w20
    public final void m() {
        sn snVar = this.b;
        snVar.T7();
        UndoView undoView = snVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        snVar.getMessagesController().removeSuggestion(snVar.f6, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.w20
    public final void n() {
        sn snVar = this.b;
        snVar.getMessagesController().convertToGigaGroup(snVar.getParentActivity(), snVar.e, snVar, new a1(this, 19));
    }
}
