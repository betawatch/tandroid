package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.a40;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
