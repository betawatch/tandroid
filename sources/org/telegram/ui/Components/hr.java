package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hr extends View {
    public final gr a;

    public hr(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        setVisibility(8);
        gr grVar = new gr(this, true, u6Var);
        this.a = grVar;
        grVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        gr grVar = this.a;
        float f7 = grVar.l;
        return (f7 == 1.0f || !((i10 = grVar.c) == 0 || i10 == 1)) ? grVar.h == 0 ? 0.0f : 1.0f : i10 == 0 ? f7 : 1.0f - f7;
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
