package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
