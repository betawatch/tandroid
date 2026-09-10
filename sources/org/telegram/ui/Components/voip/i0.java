package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.b40;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i0 extends UndoView {
    public final /* synthetic */ b40 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(b40 b40Var, Context context) {
        super(context);
        this.f0 = b40Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f0.invalidate();
    }
}
