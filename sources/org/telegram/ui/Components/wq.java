package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wq extends View {
    public final vq a;

    public wq(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setVisibility(8);
        vq vqVar = new vq(this, true, g6Var);
        this.a = vqVar;
        vqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        vq vqVar = this.a;
        float f10 = vqVar.l;
        return (f10 == 1.0f || !((i10 = vqVar.c) == 0 || i10 == 1)) ? vqVar.h == 0 ? 0.0f : 1.0f : i10 == 0 ? f10 : 1.0f - f10;
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
