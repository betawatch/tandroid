package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
