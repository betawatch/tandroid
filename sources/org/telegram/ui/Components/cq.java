package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cq extends View {
    public final bq a;

    public cq(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setVisibility(8);
        bq bqVar = new bq(this, true, f6Var);
        this.a = bqVar;
        bqVar.G = true;
    }

    public float getEnterProgress() {
        int i7;
        bq bqVar = this.a;
        float f10 = bqVar.l;
        return (f10 == 1.0f || !((i7 = bqVar.c) == 0 || i7 == 1)) ? bqVar.h == 0 ? 0.0f : 1.0f : i7 == 0 ? f10 : 1.0f - f10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.a.a(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i7) {
        this.a.z = i7;
    }

    public void setReverse(boolean z9) {
        this.a.D = z9;
    }
}
