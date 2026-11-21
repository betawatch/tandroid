package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class i40 extends q40 {
    public final /* synthetic */ c50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(c50 c50Var, Context context) {
        super(c50Var, context);
        this.d = c50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f10) {
        super.setRotationY(f10);
        this.d.invalidate();
    }
}
