package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h30 extends UndoView {
    public final /* synthetic */ v50 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = v50Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.j0.z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
