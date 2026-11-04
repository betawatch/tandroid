package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nr extends View implements org.telegram.ui.ActionBar.z5 {
    public final qe.a a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final gp f;

    public nr(Context context) {
        super(context);
        this.a = new qe.a(this, xq.h, 380L);
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new gp(this, 5);
        updateColors();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.i3(this.f, 3000L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10 = this.a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.c;
        RectF rectF3 = this.e;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f10, rectF3);
        float W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, W1, W1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, TLObject.FLAG_30));
        this.c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        this.d.set(org.telegram.messenger.g0.L(12.0f), ((currentActionBarHeight / 2) + paddingTop) - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(30.0f) + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f) + r6);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        this.b.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vl, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
