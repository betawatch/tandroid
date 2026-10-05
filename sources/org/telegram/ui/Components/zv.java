package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        if (zg.c0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.c0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
