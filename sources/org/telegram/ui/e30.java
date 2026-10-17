package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class e30 extends UndoView {
    public final /* synthetic */ s50 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = s50Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
