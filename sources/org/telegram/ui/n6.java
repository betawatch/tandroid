package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n6 extends FrameLayout {
    public final /* synthetic */ b7 B;
    public final org.telegram.ui.Components.k6 a;
    public final TextView[] b;
    public final RectF c;
    public final org.telegram.ui.Components.k90 d;
    public Float e;
    public Float f;
    public final org.telegram.ui.Components.z5 h;
    public final org.telegram.ui.Components.z5 n;
    public final org.telegram.ui.Components.z5 r;
    public final Paint s;
    public final Paint v;
    public final Paint w;
    public Path x;
    public float[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(b7 b7Var, Context context) {
        super(context);
        this.B = b7Var;
        this.b = new TextView[3];
        this.c = new RectF();
        this.d = new org.telegram.ui.Components.k90();
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.h = new org.telegram.ui.Components.z5(this, 450L, prVar);
        this.n = new org.telegram.ui.Components.z5(this, 450L, prVar);
        this.r = new org.telegram.ui.Components.z5(this, 450L, prVar);
        this.s = new Paint(1);
        this.v = new Paint(1);
        this.w = new Paint(1);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.a = k6Var;
        k6Var.b(0.35f, 350L, prVar);
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextSize(AndroidUtilities.dp(20.0f));
        k6Var.setText(LocaleController.getString(R.string.StorageUsage));
        k6Var.setGravity(17);
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        addView(k6Var, k7.c6.e(-2, 26, 49));
        int i10 = 0;
        while (i10 < 3) {
            this.b[i10] = new TextView(context);
            this.b[i10].setTextSize(1, 13.0f);
            this.b[i10].setGravity(17);
            this.b[i10].setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            if (i10 == 0) {
                this.b[i10].setText(LocaleController.getString(R.string.StorageUsageCalculating));
            } else if (i10 == 1) {
                this.b[i10].setAlpha(0.0f);
                this.b[i10].setText(LocaleController.getString(R.string.StorageUsageTelegram));
                this.b[i10].setVisibility(4);
            } else if (i10 == 2) {
                this.b[i10].setText(LocaleController.getString(R.string.StorageCleared2));
                this.b[i10].setAlpha(0.0f);
                this.b[i10].setVisibility(4);
            }
            this.b[i10].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B6, false));
            addView(this.b[i10], k7.c6.d(-2, -2.0f, 17, 0.0f, i10 == 2 ? 12.0f : -6.0f, 0.0f, 0.0f));
            i10++;
        }
        this.d.e(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.z8, false), org.telegram.ui.ActionBar.k6.l1(0.2f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B6, false)));
        this.d.j(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.x;
        if (path == null) {
            this.x = new Path();
        } else {
            path.rewind();
        }
        if (this.y == null) {
            this.y = new float[8];
        }
        float[] fArr = this.y;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
        this.x.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.x, paint);
    }

    public final void b(float f10, float f11, boolean z4) {
        this.a.setText(z4 ? LocaleController.getString(R.string.StorageUsage) : LocaleController.getString(R.string.StorageCleared));
        if (z4) {
            b7 b7Var = this.B;
            TextView[] textViewArr = this.b;
            if (f10 < 0.01f) {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegramLess, b7.c0(b7Var, f10)));
            } else {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegram, b7.c0(b7Var, f10)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f10);
        this.f = Float.valueOf(f11);
        invalidate();
    }

    public final void c(int i10) {
        boolean z4 = System.currentTimeMillis() - this.B.R > 40;
        TextView[] textViewArr = this.b;
        d(textViewArr[0], i10 == 0, z4);
        d(textViewArr[1], i10 == 1, z4);
        d(textViewArr[2], i10 == 2, z4);
    }

    public final void d(TextView textView, boolean z4, boolean z10) {
        if (textView == null) {
            return;
        }
        if (textView.getParent() == null) {
            z10 = false;
        }
        textView.animate().setListener(null).cancel();
        if (!z10) {
            textView.setVisibility(z4 ? 0 : 4);
            textView.setTag(z4 ? 1 : null);
            textView.setAlpha(z4 ? 1.0f : 0.0f);
            textView.setTranslationY(z4 ? 0.0f : AndroidUtilities.dp(8.0f));
            invalidate();
            return;
        }
        if (!z4) {
            final int i10 = 1;
            textView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(8.0f)).setListener(new org.telegram.ui.Components.x20(textView)).setInterpolator(org.telegram.ui.Components.pr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.m6
                public final /* synthetic */ n6 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            this.b.invalidate();
                            break;
                        default:
                            this.b.invalidate();
                            break;
                    }
                }
            }).start();
            return;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
            textView.setTranslationY(AndroidUtilities.dp(8.0f));
        }
        final int i11 = 0;
        textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.m6
            public final /* synthetic */ n6 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        }).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        float alpha = 1.0f - this.b[2].getAlpha();
        float d = this.r.d(this.e == null ? 1.0f : 0.0f, false);
        Float f10 = this.e;
        float floatValue = f10 == null ? 0.0f : f10.floatValue();
        org.telegram.ui.Components.z5 z5Var = this.h;
        float d10 = z5Var.d(floatValue, false);
        Float f11 = this.f;
        float d11 = this.n.d(f11 == null ? 0.0f : f11.floatValue(), false);
        int i11 = org.telegram.ui.ActionBar.k6.z8;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        Paint paint = this.s;
        paint.setColor(w02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = AndroidUtilities.rectTmp;
        RectF rectF3 = this.c;
        float f12 = 1.0f - d;
        rectF2.set(Math.max((Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d11) * f12) + rectF3.left, (Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d10) * f12) + rectF3.left) + AndroidUtilities.dp(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left >= rectF2.right || rectF2.width() <= AndroidUtilities.dp(3.0f)) {
            rectF = rectF3;
        } else {
            rectF = rectF3;
            a(AndroidUtilities.dp(AndroidUtilities.lerp(1, 2, d)), AndroidUtilities.dp(2.0f), canvas, paint, rectF2);
        }
        org.telegram.ui.Components.k90 k90Var = this.d;
        k90Var.d(rectF);
        k90Var.setAlpha((int) (255.0f * alpha * d));
        k90Var.draw(canvas);
        int i12 = org.telegram.ui.ActionBar.k6.h7;
        int d12 = i0.a.d(0.75f, org.telegram.ui.ActionBar.k6.w0(null, i12, false), org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        Paint paint2 = this.w;
        paint2.setColor(d12);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d10) * f12) + rectF.left + AndroidUtilities.dp(1.0f), rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d11) * f12) + rectF.left, rectF.bottom);
        if (rectF2.width() > AndroidUtilities.dp(3.0f)) {
            i10 = i12;
            a(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(d11 > 0.97f ? 2.0f : 1.0f), canvas, paint2, rectF2);
        } else {
            i10 = i12;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        Paint paint3 = this.v;
        paint3.setColor(w03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f13 = rectF.left;
        rectF2.set(f13, rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d10) * f12) + f13, rectF.bottom);
        a(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(d10 > 0.97f ? 2.0f : 1.0f), canvas, paint3, rectF2);
        if (d > 0.0f || z5Var.i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int min = (int) Math.min(AndroidUtilities.dp(174.0f), size * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
        int dp = AndroidUtilities.dp(72.0f);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            TextView[] textViewArr = this.b;
            if (i12 >= textViewArr.length) {
                setMeasuredDimension(size, dp + i13);
                this.c.set((size - min) / 2.0f, r8 - AndroidUtilities.dp(30.0f), (size + min) / 2.0f, r8 - AndroidUtilities.dp(26.0f));
                return;
            }
            i13 = Math.max(i13, textViewArr[i12].getMeasuredHeight() - (i12 == 2 ? AndroidUtilities.dp(16.0f) : 0));
            i12++;
        }
    }
}
