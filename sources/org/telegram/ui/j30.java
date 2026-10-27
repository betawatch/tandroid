package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j30 extends UndoView {
    public final /* synthetic */ x50 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = x50Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.j0.z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
