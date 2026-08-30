package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qv extends p9 {
    public final /* synthetic */ tv D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(tv tvVar, Context context) {
        super(context);
        this.D = tvVar;
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
