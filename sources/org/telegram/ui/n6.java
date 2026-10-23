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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class n6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final /* synthetic */ c7 E;
    public final org.telegram.ui.Components.q6 a;
    public final TextView[] b;
    public final RectF c;
    public final org.telegram.ui.Components.ca0 d;
    public Float e;
    public Float f;
    public final org.telegram.ui.Components.f6 h;
    public final org.telegram.ui.Components.f6 n;
    public final org.telegram.ui.Components.f6 r;
    public final Paint s;
    public final Paint v;
    public final Paint w;
    public Path x;
    public float[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(c7 c7Var, Context context) {
        super(context);
        this.E = c7Var;
        this.b = new TextView[3];
        this.c = new RectF();
        this.d = new org.telegram.ui.Components.ca0();
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.h = new org.telegram.ui.Components.f6(this, 450L, bsVar);
        this.n = new org.telegram.ui.Components.f6(this, 450L, bsVar);
        this.r = new org.telegram.ui.Components.f6(this, 450L, bsVar);
        this.s = new Paint(1);
        this.v = new Paint(1);
        this.w = new Paint(1);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.a = q6Var;
        q6Var.b(0.35f, 350L, bsVar);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextSize(AndroidUtilities.dp(20.0f));
        q6Var.setText(LocaleController.getString(R.string.StorageUsage));
        q6Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.a0(q6Var, org.telegram.ui.ActionBar.k6.G6, null);
        addView(q6Var, w7.z5.e(-2, 26, 49));
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
            org.telegram.ui.ActionBar.r6.W(this.b[i10], org.telegram.ui.ActionBar.k6.B6, null);
            addView(this.b[i10], w7.z5.d(-2, -2.0f, 17, 0.0f, i10 == 2 ? 12.0f : -6.0f, 0.0f, 0.0f));
            i10++;
        }
        this.d.f(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z8, false), org.telegram.ui.ActionBar.k6.o1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false)));
        this.d.k(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
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
        fArr[7] = f7;
        fArr[6] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        this.x.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.x, paint);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z8));
    }

    public final void b(float f7, float f10, boolean z10) {
        this.a.setText(z10 ? LocaleController.getString(R.string.StorageUsage) : LocaleController.getString(R.string.StorageCleared));
        if (z10) {
            c7 c7Var = this.E;
            TextView[] textViewArr = this.b;
            if (f7 < 0.01f) {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegramLess, c7.c0(c7Var, f7)));
            } else {
                textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegram, c7.c0(c7Var, f7)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f7);
        this.f = Float.valueOf(f10);
        invalidate();
    }

    public final void c(int i10) {
        boolean z10 = System.currentTimeMillis() - this.E.U > 40;
        TextView[] textViewArr = this.b;
        d(textViewArr[0], i10 == 0, z10);
        d(textViewArr[1], i10 == 1, z10);
        d(textViewArr[2], i10 == 2, z10);
    }

    public final void d(TextView textView, boolean z10, boolean z11) {
        if (textView == null) {
            return;
        }
        if (textView.getParent() == null) {
            z11 = false;
        }
        textView.animate().setListener(null).cancel();
        if (!z11) {
            textView.setVisibility(z10 ? 0 : 4);
            textView.setTag(z10 ? 1 : null);
            textView.setAlpha(z10 ? 1.0f : 0.0f);
            textView.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
            invalidate();
            return;
        }
        if (!z10) {
            final int i10 = 1;
            textView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(8.0f)).setListener(new ho(textView)).setInterpolator(org.telegram.ui.Components.bs.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.m6
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
        textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.m6
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
        Float f7 = this.e;
        float floatValue = f7 == null ? 0.0f : f7.floatValue();
        org.telegram.ui.Components.f6 f6Var = this.h;
        float d10 = f6Var.d(floatValue, false);
        Float f10 = this.f;
        float d11 = this.n.d(f10 == null ? 0.0f : f10.floatValue(), false);
        int i11 = org.telegram.ui.ActionBar.k6.z8;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        Paint paint = this.s;
        paint.setColor(x02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = AndroidUtilities.rectTmp;
        RectF rectF3 = this.c;
        float f11 = 1.0f - d;
        rectF2.set(Math.max((Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d11) * f11) + rectF3.left, (Math.max(AndroidUtilities.dp(4.0f), rectF3.width() * d10) * f11) + rectF3.left) + AndroidUtilities.dp(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left >= rectF2.right || rectF2.width() <= AndroidUtilities.dp(3.0f)) {
            rectF = rectF3;
        } else {
            rectF = rectF3;
            a(AndroidUtilities.dp(AndroidUtilities.lerp(1, 2, d)), AndroidUtilities.dp(2.0f), canvas, paint, rectF2);
        }
        org.telegram.ui.Components.ca0 ca0Var = this.d;
        ca0Var.e(rectF);
        ca0Var.setAlpha((int) (255.0f * alpha * d));
        ca0Var.draw(canvas);
        int i12 = org.telegram.ui.ActionBar.k6.h7;
        int f12 = i0.a.f(0.75f, org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        Paint paint2 = this.w;
        paint2.setColor(f12);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d10) * f11) + rectF.left + AndroidUtilities.dp(1.0f), rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d11) * f11) + rectF.left, rectF.bottom);
        if (rectF2.width() > AndroidUtilities.dp(3.0f)) {
            i10 = i12;
            a(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(d11 > 0.97f ? 2.0f : 1.0f), canvas, paint2, rectF2);
        } else {
            i10 = i12;
        }
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        Paint paint3 = this.v;
        paint3.setColor(x03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f13 = rectF.left;
        rectF2.set(f13, rectF.top, (Math.max(AndroidUtilities.dp(4.0f), rectF.width() * d10) * f11) + f13, rectF.bottom);
        a(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(d10 > 0.97f ? 2.0f : 1.0f), canvas, paint3, rectF2);
        if (d > 0.0f || f6Var.i) {
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            org.telegram.ui.Components.ca0 ca0Var = this.d;
            if (ca0Var != null) {
                ca0Var.f(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z8, false), org.telegram.ui.ActionBar.k6.o1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false)));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
