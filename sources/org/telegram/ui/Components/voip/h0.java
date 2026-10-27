package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.o30;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h0 extends UndoView {
    public final /* synthetic */ o30 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(o30 o30Var, Context context) {
        super(context);
        this.j0 = o30Var;
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.j0.invalidate();
    }
}
