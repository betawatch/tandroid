package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zv extends w9 {
    public final /* synthetic */ cw G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(cw cwVar, Context context) {
        super(context);
        this.G = cwVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (yg.f0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (yg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
