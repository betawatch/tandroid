package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class qq extends View {
    public final pq a;

    public qq(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setVisibility(8);
        pq pqVar = new pq(this, true, i6Var);
        this.a = pqVar;
        pqVar.G = true;
    }

    public float getEnterProgress() {
        int i7;
        pq pqVar = this.a;
        float f10 = pqVar.l;
        return (f10 == 1.0f || !((i7 = pqVar.c) == 0 || i7 == 1)) ? pqVar.h == 0 ? 0.0f : 1.0f : i7 == 0 ? f10 : 1.0f - f10;
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
