package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p10 extends UndoView {
    public final /* synthetic */ x30 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = x30Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i3, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.k0.r2 != null) {
            return;
        }
        super.k(j10, i3, obj, obj2, runnable, runnable2);
    }
}
