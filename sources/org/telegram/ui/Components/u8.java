package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u8 extends a9 {
    public final /* synthetic */ t8 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(b9 b9Var, Activity activity, t8 t8Var) {
        super(b9Var, activity);
        this.C = t8Var;
    }

    @Override // org.telegram.ui.Components.a9, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.C.invalidate();
    }
}
