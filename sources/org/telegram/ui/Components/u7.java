package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class u7 extends FrameLayout {
    public final TextView[] a;
    public final float[] b;
    public final int c;
    public final Matrix d;
    public final Paint e;
    public final Paint f;
    public int h;
    public AnimatorSet n;
    public LinearGradient r;
    public int s;
    public final RectF w;
    public int x;
    public boolean y;

    public u7(Context context) {
        super(context);
        this.a = new TextView[2];
        this.b = new float[]{0.0f, 0.75f};
        this.c = org.telegram.messenger.g0.L(24.0f);
        this.s = -1;
        this.w = new RectF();
        for (int i3 = 0; i3 < 2; i3++) {
            this.a[i3] = a();
            if (i3 == 1) {
                this.a[i3].setAlpha(0.0f);
                this.a[i3].setVisibility(8);
            }
            addView(this.a[i3], b8.mf.c(-1.0f, -2));
        }
        this.d = new Matrix();
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public abstract TextView a();

    public final void b(CharSequence charSequence, boolean z10) {
        final int i3;
        int i10 = this.h;
        TextView[] textViewArr = this.a;
        CharSequence text = textViewArr[i10].getText();
        if (TextUtils.isEmpty(text) || !z10) {
            textViewArr[this.h].setText(charSequence);
            return;
        }
        if (TextUtils.equals(charSequence, text)) {
            return;
        }
        final int i11 = 0;
        this.s = 0;
        int min = Math.min(charSequence.length(), text.length());
        int i12 = 0;
        while (true) {
            i3 = 1;
            if (i12 >= min || charSequence.charAt(i12) != text.charAt(i12)) {
                break;
            }
            this.s++;
            i12++;
        }
        if (this.s <= 3) {
            this.s = -1;
        }
        final int i13 = this.h;
        final int i14 = i13 == 0 ? 1 : 0;
        this.h = i14;
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.addListener(new ii.m2(this, i13, 8));
        textViewArr[i14].setText(charSequence);
        textViewArr[i14].bringToFront();
        textViewArr[i14].setVisibility(0);
        float[] fArr = this.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i13], 0.75f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.t7
            public final /* synthetic */ u7 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        u7 u7Var = this.b;
                        u7Var.b[i13] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        u7Var.invalidate();
                        break;
                    default:
                        u7 u7Var2 = this.b;
                        u7Var2.b[i13] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        u7Var2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr[i14], 0.0f);
        ofFloat2.setStartDelay(100L);
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.t7
            public final /* synthetic */ u7 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        u7 u7Var = this.b;
                        u7Var.b[i14] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        u7Var.invalidate();
                        break;
                    default:
                        u7 u7Var2 = this.b;
                        u7Var2.b[i14] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        u7Var2.invalidate();
                        break;
                }
            }
        });
        Property property = View.ALPHA;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[i13], (Property<TextView, Float>) property, 0.0f);
        ofFloat3.setStartDelay(75L);
        ofFloat3.setDuration(150L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[i14], (Property<TextView, Float>) property, 1.0f);
        ofFloat4.setStartDelay(75L);
        ofFloat4.setDuration(150L);
        this.n.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        this.n.start();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        Canvas canvas2;
        TextView[] textViewArr = this.a;
        boolean z11 = true;
        int i3 = view == textViewArr[0] ? 0 : 1;
        if (this.y) {
            this.s = -1;
        }
        if (this.s > 0) {
            int length = textViewArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                TextView textView = textViewArr[i10];
                if ((textView instanceof l80) && ((l80) textView).d) {
                    this.s = -1;
                    break;
                }
                i10++;
            }
        }
        int i11 = this.s;
        RectF rectF = this.w;
        if (i11 <= 0 || textViewArr[this.h].getAlpha() == 1.0f || textViewArr[this.h].getLayout() == null) {
            z10 = false;
        } else {
            float primaryHorizontal = textViewArr[this.h].getLayout().getPrimaryHorizontal(0);
            float primaryHorizontal2 = textViewArr[this.h].getLayout().getPrimaryHorizontal(this.s);
            if (primaryHorizontal == primaryHorizontal2) {
                z11 = false;
            } else if (primaryHorizontal2 > primaryHorizontal) {
                rectF.set(primaryHorizontal, 0.0f, primaryHorizontal2, getMeasuredHeight());
            } else {
                rectF.set(primaryHorizontal2, 0.0f, primaryHorizontal, getMeasuredHeight());
            }
            if (z11 && i3 == this.h) {
                canvas.save();
                canvas.clipRect(rectF);
                textViewArr[0].draw(canvas);
                canvas.restore();
            }
            z10 = z11;
        }
        float[] fArr = this.b;
        if (fArr[i3] <= 0.0f && !z10) {
            return super.drawChild(canvas, view, j10);
        }
        float min = Math.min(view.getWidth(), getWidth());
        float min2 = Math.min(view.getHeight(), getHeight());
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, min, min2, null, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        float f10 = (1.0f - fArr[i3]) * min;
        float f11 = f10 + this.c;
        Matrix matrix = this.d;
        matrix.setTranslate(f10, 0.0f);
        this.r.setLocalMatrix(matrix);
        canvas.drawRect(f10, 0.0f, f11, min2, this.e);
        Paint paint = this.f;
        if (min > f11) {
            canvas2 = canvas;
            canvas2.drawRect(f11, 0.0f, min, min2, paint);
        } else {
            canvas2 = canvas;
        }
        if (z10) {
            canvas2.drawRect(rectF, paint);
        }
        canvas2.restoreToCount(saveLayer);
        return drawChild;
    }

    public int getCustomPaddingRight() {
        return this.x;
    }

    public TextView getNextTextView() {
        return this.a[this.h == 0 ? (char) 1 : (char) 0];
    }

    public TextView getTextView() {
        return this.a[this.h];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (!this.y) {
            return;
        }
        int i13 = 0;
        while (true) {
            TextView[] textViewArr = this.a;
            if (i13 >= textViewArr.length) {
                return;
            }
            TextView textView = textViewArr[i13];
            if (textView != null && textView.getMeasuredWidth() < getMeasuredWidth()) {
                int measuredWidth = (getMeasuredWidth() - textView.getMeasuredWidth()) / 2;
                textView.layout(measuredWidth, 0, textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight());
            }
            i13++;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        LinearGradient linearGradient = new LinearGradient(this.c, 0.0f, 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.r = linearGradient;
        this.e.setShader(linearGradient);
    }

    public void setCustomPaddingRight(int i3) {
        this.x = i3;
        for (TextView textView : this.a) {
            if (textView instanceof l80) {
                ((l80) textView).setCustomPaddingRight(i3);
            }
        }
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        b(charSequence, true);
    }
}
