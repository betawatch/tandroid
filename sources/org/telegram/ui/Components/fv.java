package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fv extends g9 {
    public final /* synthetic */ iv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(iv ivVar, Context context) {
        super(context);
        this.G = ivVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
