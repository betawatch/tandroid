package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class q30 extends UndoView {
    public final /* synthetic */ d60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = d60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
