package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dq extends View {
    public final cq a;

    public dq(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setVisibility(8);
        cq cqVar = new cq(this, true, e6Var);
        this.a = cqVar;
        cqVar.G = true;
    }

    public float getEnterProgress() {
        int i3;
        cq cqVar = this.a;
        float f10 = cqVar.l;
        return (f10 == 1.0f || !((i3 = cqVar.c) == 0 || i3 == 1)) ? cqVar.h == 0 ? 0.0f : 1.0f : i3 == 0 ? f10 : 1.0f - f10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.a.a(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i3) {
        this.a.z = i3;
    }

    public void setReverse(boolean z10) {
        this.a.D = z10;
    }
}
