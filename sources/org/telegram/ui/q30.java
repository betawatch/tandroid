package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q30 extends UndoView {
    public final /* synthetic */ c60 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.c0 = c60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.c0.w0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
