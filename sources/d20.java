// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class d20 extends FrameLayout {
    public final TextView[] a;
    public final float[] b;
    public final int c;
    public final Matrix d;
    public final Paint e;
    public final Paint f;
    public boolean h;
    public AnimatorSet n;
    public LinearGradient r;
    public int s;
    public final RectF w;
    public int x;
    public boolean y;

    public d20(Context context) {
        super(context);
        this.a = new TextView[2];
        this.b = new float[]{0.0f, 0.75f};
        this.c = hl.L(24.0f);
        this.s = -1;
        this.w = new RectF();
        for (int i = 0; i < 2; i++) {
            this.a[i] = a();
            if (i == 1) {
                this.a[i].setAlpha(0.0f);
                this.a[i].setVisibility(8);
            }
            addView(this.a[i], tre.c(-1.0f, -2));
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

    public final void b(CharSequence charSequence, boolean z) {
        final byte b;
        boolean z2 = this.h;
        TextView[] textViewArr = this.a;
        CharSequence text = textViewArr[z2 ? 1 : 0].getText();
        if (TextUtils.isEmpty(text) || !z) {
            textViewArr[this.h ? 1 : 0].setText(charSequence);
            return;
        }
        if (TextUtils.equals(charSequence, text)) {
            return;
        }
        final byte b2 = 0;
        this.s = 0;
        int min = Math.min(charSequence.length(), text.length());
        int i = 0;
        while (true) {
            b = 1;
            if (i >= min || charSequence.charAt(i) != text.charAt(i)) {
                break;
            }
            this.s++;
            i++;
        }
        byte b3 = 3;
        if (this.s <= 3) {
            this.s = -1;
        }
        boolean z3 = this.h;
        boolean z4 = !z3;
        this.h = z4;
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.addListener(new z7(this, z3 ? 1 : 0, b3));
        textViewArr[z4 ? 1 : 0].setText(charSequence);
        textViewArr[z4 ? 1 : 0].bringToFront();
        textViewArr[z4 ? 1 : 0].setVisibility(0);
        float[] fArr = this.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[z3 ? 1 : 0], 0.75f);
        ofFloat.setDuration(200L);
        final int i2 = z3 ? 1 : 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: c20
            public final /* synthetic */ d20 b;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b4 = b2;
                boolean z5 = i2;
                d20 d20Var = this.b;
                switch (b4) {
                    case 0:
                        d20Var.b[z5 ? 1 : 0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        d20Var.invalidate();
                        break;
                    default:
                        d20Var.b[z5 ? 1 : 0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        d20Var.invalidate();
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr[z4 ? 1 : 0], 0.0f);
        ofFloat2.setStartDelay(100L);
        ofFloat2.setDuration(200L);
        final int i3 = z4 ? 1 : 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: c20
            public final /* synthetic */ d20 b;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b4 = b;
                boolean z5 = i3;
                d20 d20Var = this.b;
                switch (b4) {
                    case 0:
                        d20Var.b[z5 ? 1 : 0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        d20Var.invalidate();
                        break;
                    default:
                        d20Var.b[z5 ? 1 : 0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        d20Var.invalidate();
                        break;
                }
            }
        });
        Property property = View.ALPHA;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[z3 ? 1 : 0], (Property<TextView, Float>) property, 0.0f);
        ofFloat3.setStartDelay(75L);
        ofFloat3.setDuration(150L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[z4 ? 1 : 0], (Property<TextView, Float>) property, 1.0f);
        ofFloat4.setStartDelay(75L);
        ofFloat4.setDuration(150L);
        this.n.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        this.n.start();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        Canvas canvas2;
        Paint paint;
        TextView[] textViewArr = this.a;
        boolean z2 = true;
        char c = view == textViewArr[0] ? (char) 0 : (char) 1;
        if (this.y) {
            this.s = -1;
        }
        if (this.s > 0) {
            int length = textViewArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                TextView textView = textViewArr[i];
                if ((textView instanceof hl6) && ((hl6) textView).d) {
                    this.s = -1;
                    break;
                }
                i++;
            }
        }
        int i2 = this.s;
        RectF rectF = this.w;
        if (i2 <= 0 || textViewArr[this.h ? 1 : 0].getAlpha() == 1.0f || textViewArr[this.h ? 1 : 0].getLayout() == null) {
            z = false;
        } else {
            float primaryHorizontal = textViewArr[this.h ? 1 : 0].getLayout().getPrimaryHorizontal(0);
            float primaryHorizontal2 = textViewArr[this.h ? 1 : 0].getLayout().getPrimaryHorizontal(this.s);
            if (primaryHorizontal == primaryHorizontal2) {
                z2 = false;
            } else if (primaryHorizontal2 > primaryHorizontal) {
                rectF.set(primaryHorizontal, 0.0f, primaryHorizontal2, getMeasuredHeight());
            } else {
                rectF.set(primaryHorizontal2, 0.0f, primaryHorizontal, getMeasuredHeight());
            }
            if (z2 && c == this.h) {
                canvas.save();
                canvas.clipRect(rectF);
                textViewArr[0].draw(canvas);
                canvas.restore();
            }
            z = z2;
        }
        float[] fArr = this.b;
        if (fArr[c] <= 0.0f && !z) {
            return super.drawChild(canvas, view, j);
        }
        float min = Math.min(view.getWidth(), getWidth());
        float min2 = Math.min(view.getHeight(), getHeight());
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, min, min2, null, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        float f = (1.0f - fArr[c]) * min;
        float f2 = this.c + f;
        Matrix matrix = this.d;
        matrix.setTranslate(f, 0.0f);
        this.r.setLocalMatrix(matrix);
        canvas.drawRect(f, 0.0f, f2, min2, this.e);
        Paint paint2 = this.f;
        if (min > f2) {
            paint = paint2;
            canvas.drawRect(f2, 0.0f, min, min2, paint);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            paint = paint2;
        }
        if (z) {
            canvas2.drawRect(rectF, paint);
        }
        canvas2.restoreToCount(saveLayer);
        return drawChild;
    }

    public int getCustomPaddingRight() {
        return this.x;
    }

    public TextView getNextTextView() {
        return this.a[!this.h ? 1 : 0];
    }

    public TextView getTextView() {
        return this.a[this.h ? 1 : 0];
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.y) {
            return;
        }
        int i5 = 0;
        while (true) {
            TextView[] textViewArr = this.a;
            if (i5 >= textViewArr.length) {
                return;
            }
            TextView textView = textViewArr[i5];
            if (textView != null && textView.getMeasuredWidth() < getMeasuredWidth()) {
                int measuredWidth = (getMeasuredWidth() - textView.getMeasuredWidth()) / 2;
                textView.layout(measuredWidth, 0, textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight());
            }
            i5++;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LinearGradient linearGradient = new LinearGradient(this.c, 0.0f, 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.r = linearGradient;
        this.e.setShader(linearGradient);
    }

    public void setCustomPaddingRight(int i) {
        this.x = i;
        for (TextView textView : this.a) {
            if (textView instanceof hl6) {
                ((hl6) textView).setCustomPaddingRight(i);
            }
        }
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        b(charSequence, true);
    }
}
