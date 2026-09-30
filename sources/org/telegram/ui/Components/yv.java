package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class yv extends w9 {
    public final /* synthetic */ bw G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(bw bwVar, Context context) {
        super(context);
        this.G = bwVar;
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
