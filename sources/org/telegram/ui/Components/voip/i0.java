package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.a40;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
