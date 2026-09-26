package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class wv extends w9 {
    public final /* synthetic */ zv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(zv zvVar, Context context) {
        super(context);
        this.G = zvVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
