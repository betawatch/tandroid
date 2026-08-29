package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qq extends View {
    public final pq a;

    public qq(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setVisibility(8);
        pq pqVar = new pq(this, true, c6Var);
        this.a = pqVar;
        pqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        pq pqVar = this.a;
        float f9 = pqVar.l;
        return (f9 == 1.0f || !((i10 = pqVar.c) == 0 || i10 == 1)) ? pqVar.h == 0 ? 0.0f : 1.0f : i10 == 0 ? f9 : 1.0f - f9;
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
