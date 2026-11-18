package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class as extends View implements org.telegram.ui.ActionBar.c6 {
    public final te.a a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final mo f;

    public as(Context context) {
        super(context);
        this.a = new te.a(this, lr.h, 380L);
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new mo(this, 7);
        updateColors();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(this.f, 3000L);
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
    public final void onMeasure(int i7, int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, TLObject.FLAG_30));
        this.c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        this.d.set(org.telegram.messenger.g0.L(12.0f), ((currentActionBarHeight / 2) + paddingTop) - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(30.0f) + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f) + r6);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.b.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yl, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
