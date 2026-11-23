package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class tq extends View {
    public final sq a;

    public tq(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setVisibility(8);
        sq sqVar = new sq(this, true, h6Var);
        this.a = sqVar;
        sqVar.G = true;
    }

    public float getEnterProgress() {
        int i7;
        sq sqVar = this.a;
        float f10 = sqVar.l;
        return (f10 == 1.0f || !((i7 = sqVar.c) == 0 || i7 == 1)) ? sqVar.h == 0 ? 0.0f : 1.0f : i7 == 0 ? f10 : 1.0f - f10;
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

    public void setReverse(boolean z10) {
        this.a.D = z10;
    }
}
