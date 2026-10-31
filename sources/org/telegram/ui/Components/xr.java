package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xr extends View implements org.telegram.ui.ActionBar.k6 {
    public final fe.b a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final ho f;

    public xr(Context context) {
        super(context);
        this.a = new fe.b(this, gr.h, 380L);
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new ho(this, 7);
        updateColors();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.h3(this.f, 3000L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.r(this.f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7 = this.a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.c;
        RectF rectF3 = this.e;
        org.telegram.messenger.i0.Z1(rectF, rectF2, f7, rectF3);
        float W1 = org.telegram.messenger.i0.W1(f7, org.telegram.messenger.i0.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, W1, W1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, TLObject.FLAG_30));
        this.c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        this.d.set(org.telegram.messenger.i0.L(12.0f), ((currentActionBarHeight / 2) + paddingTop) - org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(30.0f) + org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(30.0f) + r6);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.b.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vl, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
