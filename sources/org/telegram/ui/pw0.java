package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pw0 extends View {
    public final RectF a;
    public final TextPaint b;
    public final Paint c;
    public final ValueAnimator d;
    public final float[] e;
    public final c5.a f;
    public boolean h;
    public final /* synthetic */ ProfileActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.n = profileActivity;
        this.a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        c5.a adapter = profileActivity.n0.getAdapter();
        this.f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.wq.j);
        ofFloat.addUpdateListener(new a3(this, 27));
        ofFloat.addListener(new c50(5, this, profileActivity.m1));
        profileActivity.n0.b(new ow0(this));
        adapter.a.registerObserver(new c5.h(this, 3));
    }

    public final void a(boolean z9) {
        org.telegram.ui.ActionBar.l lVar;
        int i7;
        org.telegram.ui.ActionBar.l lVar2;
        ProfileActivity profileActivity = this.n;
        if (z9) {
            nw0 nw0Var = profileActivity.M;
            nw0Var.J = nw0Var.L;
            nw0Var.K = nw0Var.M;
            nw0Var.N = 0.0f;
            nw0Var.O = 1;
        }
        profileActivity.M.invalidate();
        float measureText = this.b.measureText(((String) this.f.d(profileActivity.n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(54.0f);
        RectF rectF = this.a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (org.telegram.messenger.g0.N(16.0f) + measureText);
        lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            if (lVar2.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.m;
                float L = org.telegram.messenger.g0.L(15.0f) + i7;
                rectF.top = L;
                rectF.bottom = L + org.telegram.messenger.g0.L(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i7 = 0;
        float L2 = org.telegram.messenger.g0.L(15.0f) + i7;
        rectF.top = L2;
        rectF.bottom = L2 + org.telegram.messenger.g0.L(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f10) {
        ProfileActivity profileActivity = this.n;
        boolean z9 = profileActivity.o2 && profileActivity.n0.getRealCount() > 20;
        if (z9 != this.h) {
            this.h = z9;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.e;
            float U1 = org.telegram.messenger.g0.U1(animatedFraction, fArr);
            if (f10 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z9) {
                valueAnimator.setDuration((long) (((1.0f - U1) * 250.0f) / f10));
            } else {
                valueAnimator.setDuration((long) ((250.0f * U1) / f10));
            }
            fArr[0] = U1;
            fArr[1] = z9 ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    public final void c() {
        dv0 dv0Var;
        ProfileActivity profileActivity = this.n;
        if (profileActivity.S0 == null || (dv0Var = profileActivity.n0) == null || !profileActivity.o2) {
            return;
        }
        if (dv0Var.getRealPosition() == 0) {
            profileActivity.S0.t(33);
            profileActivity.S0.S(36);
        } else {
            profileActivity.S0.S(33);
            profileActivity.S0.t(36);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float N = org.telegram.messenger.g0.N(12.0f);
        Paint paint = this.c;
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f.d(this.n.n0.getCurrentItem())).toString(), rectF.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF.top, this.b);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        a(false);
    }
}
