package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jr extends View {
    public final ir a;

    public jr(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setVisibility(8);
        ir irVar = new ir(this, true, c6Var);
        this.a = irVar;
        irVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        ir irVar = this.a;
        float f7 = irVar.l;
        return (f7 == 1.0f || !((i10 = irVar.c) == 0 || i10 == 1)) ? irVar.h == 0 ? 0.0f : 1.0f : i10 == 0 ? f7 : 1.0f - f7;
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
