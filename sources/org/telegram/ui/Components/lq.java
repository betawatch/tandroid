package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lq extends View {
    public final kq a;

    public lq(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        setVisibility(8);
        kq kqVar = new kq(this, true, p6Var);
        this.a = kqVar;
        kqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        kq kqVar = this.a;
        float f7 = kqVar.l;
        return (f7 == 1.0f || !((i10 = kqVar.c) == 0 || i10 == 1)) ? kqVar.h == 0 ? 0.0f : 1.0f : i10 == 0 ? f7 : 1.0f - f7;
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
