package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kq extends View {
    public final jq a;

    public kq(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setVisibility(8);
        jq jqVar = new jq(this, true, e6Var);
        this.a = jqVar;
        jqVar.G = true;
    }

    public float getEnterProgress() {
        int i7;
        jq jqVar = this.a;
        float f10 = jqVar.l;
        return (f10 == 1.0f || !((i7 = jqVar.c) == 0 || i7 == 1)) ? jqVar.h == 0 ? 0.0f : 1.0f : i7 == 0 ? f10 : 1.0f - f10;
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
