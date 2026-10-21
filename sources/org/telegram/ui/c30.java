package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class c30 extends UndoView {
    public final /* synthetic */ q50 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = q50Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
