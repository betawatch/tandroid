package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wv extends v9 {
    public final /* synthetic */ zv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(zv zvVar, Context context) {
        super(context);
        this.G = zvVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
