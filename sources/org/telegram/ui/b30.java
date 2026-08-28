package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b30 extends UndoView {
    public final /* synthetic */ o50 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.b0 = o50Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i9, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.b0.v0 != null) {
            return;
        }
        super.k(j10, i9, obj, obj2, runnable, runnable2);
    }
}
