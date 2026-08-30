package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uq extends View {
    public final tq a;

    public uq(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setVisibility(8);
        tq tqVar = new tq(this, true, f6Var);
        this.a = tqVar;
        tqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        tq tqVar = this.a;
        float f10 = tqVar.l;
        return (f10 == 1.0f || !((i10 = tqVar.c) == 0 || i10 == 1)) ? tqVar.h == 0 ? 0.0f : 1.0f : i10 == 0 ? f10 : 1.0f - f10;
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

    public void setReverse(boolean z4) {
        this.a.D = z4;
    }
}
