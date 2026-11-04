package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ew0 extends View {
    public final RectF a;
    public final TextPaint b;
    public final Paint c;
    public final ValueAnimator d;
    public final float[] e;
    public final b5.a f;
    public boolean h;
    public final /* synthetic */ ProfileActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.n = profileActivity;
        this.a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        b5.a adapter = profileActivity.o0.getAdapter();
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
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.j);
        ofFloat.addUpdateListener(new b3(this, 27));
        ofFloat.addListener(new u40(5, this, profileActivity.n1));
        profileActivity.o0.b(new dw0(this));
        adapter.a.registerObserver(new b5.i(this, 3));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i3;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.n;
        if (z10) {
            cw0 cw0Var = profileActivity.N;
            cw0Var.K = cw0Var.M;
            cw0Var.L = cw0Var.N;
            cw0Var.O = 0.0f;
            cw0Var.P = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.b.measureText(((String) this.f.d(profileActivity.o0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(54.0f);
        RectF rectF = this.a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (org.telegram.messenger.g0.N(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i3 = org.telegram.messenger.g0.m;
                float L = org.telegram.messenger.g0.L(15.0f) + i3;
                rectF.top = L;
                rectF.bottom = L + org.telegram.messenger.g0.L(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i3 = 0;
        float L2 = org.telegram.messenger.g0.L(15.0f) + i3;
        rectF.top = L2;
        rectF.bottom = L2 + org.telegram.messenger.g0.L(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f10) {
        ProfileActivity profileActivity = this.n;
        boolean z10 = profileActivity.p2 && profileActivity.o0.getRealCount() > 20;
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.e;
            float U1 = org.telegram.messenger.g0.U1(animatedFraction, fArr);
            if (f10 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration((long) (((1.0f - U1) * 250.0f) / f10));
            } else {
                valueAnimator.setDuration((long) ((250.0f * U1) / f10));
            }
            fArr[0] = U1;
            fArr[1] = z10 ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    public final void c() {
        ru0 ru0Var;
        ProfileActivity profileActivity = this.n;
        if (profileActivity.T0 == null || (ru0Var = profileActivity.o0) == null || !profileActivity.p2) {
            return;
        }
        if (ru0Var.getRealPosition() == 0) {
            profileActivity.T0.t(33);
            profileActivity.T0.S(36);
        } else {
            profileActivity.T0.S(33);
            profileActivity.T0.t(36);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float N = org.telegram.messenger.g0.N(12.0f);
        Paint paint = this.c;
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f.d(this.n.o0.getCurrentItem())).toString(), rectF.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF.top, this.b);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        a(false);
    }
}
