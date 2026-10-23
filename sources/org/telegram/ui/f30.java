package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class f30 extends UndoView {
    public final /* synthetic */ u50 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = u50Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.j0.z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
