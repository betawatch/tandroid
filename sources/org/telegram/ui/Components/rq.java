package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class rq extends View {
    public final qq a;

    public rq(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setVisibility(8);
        qq qqVar = new qq(this, true, i6Var);
        this.a = qqVar;
        qqVar.G = true;
    }

    public float getEnterProgress() {
        int i7;
        qq qqVar = this.a;
        float f10 = qqVar.l;
        return (f10 == 1.0f || !((i7 = qqVar.c) == 0 || i7 == 1)) ? qqVar.h == 0 ? 0.0f : 1.0f : i7 == 0 ? f10 : 1.0f - f10;
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
