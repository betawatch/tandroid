package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mv extends t9 {
    public final /* synthetic */ pv C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(pv pvVar, Context context) {
        super(context);
        this.C = pvVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (kg.g0.b(this)) {
            return;
        }
        super.invalidate();
        this.C.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (kg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
