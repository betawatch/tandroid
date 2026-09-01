package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class l01 extends View {
    public final RectF a;
    public final TextPaint b;
    public final Paint c;
    public final ValueAnimator d;
    public final float[] e;
    public final m2.a f;
    public boolean h;
    public final /* synthetic */ ProfileActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.n = profileActivity;
        this.a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        m2.a adapter = profileActivity.k0.getAdapter();
        this.f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.pr.j);
        ofFloat.addUpdateListener(new e3(this, 29));
        ofFloat.addListener(new org.telegram.ui.Components.x20(25, this, profileActivity.k1));
        profileActivity.k0.b(new k01(this));
        adapter.a.registerObserver(new h1.a(this, 3));
    }

    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.n;
        if (z4) {
            j01 j01Var = profileActivity.K;
            j01Var.G = j01Var.I;
            j01Var.H = j01Var.J;
            j01Var.K = 0.0f;
            j01Var.L = 1;
        }
        profileActivity.K.invalidate();
        float measureText = this.b.measureText(((String) this.f.d(profileActivity.k0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
                float dp = AndroidUtilities.dp(15.0f) + i10;
                rectF.top = dp;
                rectF.bottom = dp + AndroidUtilities.dp(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i10 = 0;
        float dp2 = AndroidUtilities.dp(15.0f) + i10;
        rectF.top = dp2;
        rectF.bottom = dp2 + AndroidUtilities.dp(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f10) {
        ProfileActivity profileActivity = this.n;
        boolean z4 = profileActivity.m2 && profileActivity.k0.getRealCount() > 20;
        if (z4 != this.h) {
            this.h = z4;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.e;
            float lerp = AndroidUtilities.lerp(fArr, animatedFraction);
            if (f10 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z4) {
                valueAnimator.setDuration((long) (((1.0f - lerp) * 250.0f) / f10));
            } else {
                valueAnimator.setDuration((long) ((250.0f * lerp) / f10));
            }
            fArr[0] = lerp;
            fArr[1] = z4 ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    public final void c() {
        zy0 zy0Var;
        ProfileActivity profileActivity = this.n;
        if (profileActivity.Q0 == null || (zy0Var = profileActivity.k0) == null || !profileActivity.m2) {
            return;
        }
        if (zy0Var.getRealPosition() == 0) {
            profileActivity.Q0.r(33);
            profileActivity.Q0.K(36);
        } else {
            profileActivity.Q0.K(33);
            profileActivity.Q0.r(36);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        Paint paint = this.c;
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f.d(this.n.k0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.b);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
