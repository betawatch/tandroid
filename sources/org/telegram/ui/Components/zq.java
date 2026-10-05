package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zq extends View {
    public final yq a;

    public zq(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setVisibility(8);
        yq yqVar = new yq(this, true, d6Var);
        this.a = yqVar;
        yqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        yq yqVar = this.a;
        float f7 = yqVar.l;
        return (f7 == 1.0f || !((i10 = yqVar.c) == 0 || i10 == 1)) ? yqVar.h == 0 ? 0.0f : 1.0f : i10 == 0 ? f7 : 1.0f - f7;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.a.a(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.a.z = i10;
    }

    public void setReverse(boolean z10) {
        this.a.D = z10;
    }
}
