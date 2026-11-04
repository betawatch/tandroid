package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class su extends k9 {
    public final /* synthetic */ vu H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(vu vuVar, Context context) {
        super(context);
        this.H = vuVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override // android.view.View
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate(i3, i10, i11, i12);
    }
}
