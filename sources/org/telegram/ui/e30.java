package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e30 extends UndoView {
    public final /* synthetic */ r50 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e30(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.b0 = r50Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.b0.v0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
