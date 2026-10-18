package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.j30;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
