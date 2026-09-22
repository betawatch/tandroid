package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wq extends View {
    public final vq a;

    public wq(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setVisibility(8);
        vq vqVar = new vq(this, true, e6Var);
        this.a = vqVar;
        vqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        vq vqVar = this.a;
        float f7 = vqVar.l;
        return (f7 == 1.0f || !((i10 = vqVar.c) == 0 || i10 == 1)) ? vqVar.h == 0 ? 0.0f : 1.0f : i10 == 0 ? f7 : 1.0f - f7;
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
