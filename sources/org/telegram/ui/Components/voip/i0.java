package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.a40;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class i0 extends UndoView {
    public final /* synthetic */ a40 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(a40 a40Var, Context context) {
        super(context);
        this.f0 = a40Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
