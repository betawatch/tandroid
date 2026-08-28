package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mq extends View {
    public final lq a;

    public mq(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        setVisibility(8);
        lq lqVar = new lq(this, true, b6Var);
        this.a = lqVar;
        lqVar.G = true;
    }

    public float getEnterProgress() {
        int i9;
        lq lqVar = this.a;
        float f10 = lqVar.l;
        return (f10 == 1.0f || !((i9 = lqVar.c) == 0 || i9 == 1)) ? lqVar.h == 0 ? 0.0f : 1.0f : i9 == 0 ? f10 : 1.0f - f10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.a.a(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i9) {
        this.a.z = i9;
    }

    public void setReverse(boolean z10) {
        this.a.D = z10;
    }
}
