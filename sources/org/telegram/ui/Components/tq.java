package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tq extends View {
    public final sq a;

    public tq(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setVisibility(8);
        sq sqVar = new sq(this, true, f6Var);
        this.a = sqVar;
        sqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        sq sqVar = this.a;
        float f10 = sqVar.l;
        return (f10 == 1.0f || !((i10 = sqVar.c) == 0 || i10 == 1)) ? sqVar.h == 0 ? 0.0f : 1.0f : i10 == 0 ? f10 : 1.0f - f10;
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
