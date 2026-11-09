package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class al extends org.telegram.ui.Components.e10 {
    public final /* synthetic */ cn j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(cn cnVar, Activity activity, org.telegram.ui.ActionBar.f2 f2Var) {
        super(activity, f2Var);
        this.j1 = cnVar;
    }

    @Override // org.telegram.ui.Components.e10
    public final void I0() {
        cn cnVar = this.j1;
        cnVar.g8();
        UndoView undoView = cnVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        cnVar.getMessagesController().k4(cnVar.j6, "CONVERT_GIGAGROUP");
    }

    @Override // org.telegram.ui.Components.e10
    public final void J0() {
        cn cnVar = this.j1;
        cnVar.getMessagesController().S(cnVar.getParentActivity(), cnVar.e, cnVar, new w0(this, 21));
    }
}
