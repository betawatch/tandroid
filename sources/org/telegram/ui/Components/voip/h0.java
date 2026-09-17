package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.a40;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ a40 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(a40 a40Var, Context context) {
        super(context);
        this.f0 = a40Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
