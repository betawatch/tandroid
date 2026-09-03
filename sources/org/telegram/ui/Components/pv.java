package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pv extends p9 {
    public final /* synthetic */ sv D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(sv svVar, Context context) {
        super(context);
        this.D = svVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate();
        this.D.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
