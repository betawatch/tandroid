package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ e40 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e40 e40Var, Context context) {
        super(context);
        this.f0 = e40Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
