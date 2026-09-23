package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class i0 extends UndoView {
    public final /* synthetic */ x30 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(x30 x30Var, Context context) {
        super(context);
        this.f0 = x30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
