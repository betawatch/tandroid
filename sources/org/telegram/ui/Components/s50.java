package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class s50 extends b60 {
    public final /* synthetic */ o60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(o60 o60Var, Context context) {
        super(o60Var, context);
        this.d = o60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f7) {
        super.setRotationY(f7);
        this.d.invalidate();
    }
}
