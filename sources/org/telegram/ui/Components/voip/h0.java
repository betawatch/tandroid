package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.j30;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ j30 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j30 j30Var, Context context) {
        super(context);
        this.f0 = j30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
