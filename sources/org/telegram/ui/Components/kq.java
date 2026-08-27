package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kq extends View {
    public final jq a;

    public kq(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setVisibility(8);
        jq jqVar = new jq(this, true, c6Var);
        this.a = jqVar;
        jqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        jq jqVar = this.a;
        float f10 = jqVar.l;
        return (f10 == 1.0f || !((i10 = jqVar.c) == 0 || i10 == 1)) ? jqVar.h == 0 ? 0.0f : 1.0f : i10 == 0 ? f10 : 1.0f - f10;
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
