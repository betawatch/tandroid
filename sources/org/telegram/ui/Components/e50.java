package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e50 extends m50 {
    public final /* synthetic */ s50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(s50 s50Var, Context context) {
        super(s50Var, context);
        this.d = s50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f9) {
        super.setAlpha(f9);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f9) {
        super.setRotationY(f9);
        this.d.invalidate();
    }
}
