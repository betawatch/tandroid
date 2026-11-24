// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gw9 extends FrameLayout {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw9(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 2:
                super(context);
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, nme.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(gl.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, nme.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                break;
            default:
                break;
        }
    }

    public final void a(int i, CharSequence charSequence, boolean z) {
        ImageView imageView = (ImageView) this.b;
        if (z) {
            gl.L3(imageView, i);
        } else {
            imageView.setImageResource(i);
        }
        ((TextView) this.c).setText(charSequence);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 6:
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                if (view != ((tx9) this.c).i0 || !pg5.b || !pg5.f) {
                    return super.drawChild(canvas, view, j);
                }
                for (int i = 0; i < ((tx9) this.c).i0.getChildCount(); i++) {
                    View childAt = ((tx9) this.c).i0.getChildAt(i);
                    if (childAt instanceof dx9) {
                        dx9 dx9Var = (dx9) childAt;
                        if (dx9Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j);
                            canvas.restore();
                        } else if (dx9Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (dx9Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (dx9Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((dx9Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((dx9Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(dx9Var.getAnimatedScale(), dx9Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof yw9) || (childAt instanceof xw9) || (childAt instanceof zw9)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j);
                        canvas.restore();
                    }
                }
                return false;
            case 6:
                hmc hmcVar = (hmc) this.c;
                if (view != hmcVar.v0 || !hmcVar.G) {
                    return super.drawChild(canvas, view, j);
                }
                int save = canvas.save();
                canvas.concat(hmcVar.J);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restoreToCount(save);
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.a) {
            case 4:
                super.invalidate();
                k7 k7Var = ((qmb) this.c).v0;
                if (k7Var != null) {
                    k7Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 6:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((qr1) this.b);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 6:
                getViewTreeObserver().removeOnPreDrawListener((qr1) this.b);
                super.onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                int intrinsicHeight = bkb.h3.getIntrinsicHeight();
                bkb.h3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                bkb.h3.draw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(((qmb) this.c).getThemedColor(bkb.Ie));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                break;
            case 4:
                int[] iArr = (int[]) this.b;
                qmb qmbVar = (qmb) this.c;
                if (!gl.D) {
                    getLocationInWindow(iArr);
                    if (qmbVar.u0.getTranslationY() != iArr[1]) {
                        qmbVar.u0.setTranslationY(-r9);
                        qmbVar.v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < qmbVar.R) {
                        invalidate();
                        break;
                    }
                }
                break;
            case 5:
                canvas.save();
                wgc wgcVar = ((xgc) this.c).b;
                canvas.scale(wgcVar.getScaleX(), wgcVar.getScaleY(), wgcVar.getPivotX() + wgcVar.getLeft(), wgcVar.getPivotY() + wgcVar.getTop());
                Drawable drawable = (Drawable) this.b;
                drawable.setBounds(wgcVar.getLeft() - gl.L(2.0f), wgcVar.getTop() - gl.L(2.0f), gl.L(2.0f) + wgcVar.getRight(), gl.L(2.0f) + wgcVar.getBottom());
                drawable.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float f;
        StaticLayout staticLayout;
        float f2;
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i) - gl.L(8.0f);
                TextView textView = (TextView) this.c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(gl.L(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f3 = size;
                    if (measureText > f3) {
                        textPaint.setTextSize(gl.L(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                f2 = 12.0f;
                                z = true;
                                i3 = 2;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            } else if (textPaint.measureText(split[i5]) > f3) {
                                staticLayout = null;
                                z = true;
                                f2 = 12.0f;
                                i3 = 2;
                            } else {
                                i5++;
                            }
                        }
                        if (staticLayout == null || staticLayout.getLineCount() > i3) {
                            f = Math.max(8.0f, (f3 * f2) / measureText);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i3;
                            f = 11.0f;
                        }
                    } else {
                        z = true;
                        i3 = 2;
                        i4 = 1;
                        f = 12.0f;
                    }
                    textView.setTextSize(z ? 1 : 0, f);
                    textView.setMaxLines(i4);
                    textView.setSingleLine(i4 == z ? z ? 1 : 0 : false);
                    textView.setLineSpacing(0.0f, i4 == i3 ? 0.85f : 1.0f);
                    if (i4 == i3) {
                        z = false;
                    }
                    textView.setIncludeFontPadding(z);
                    layoutParams.topMargin = gl.L(i4 == i3 ? 29.0f : 35.0f);
                    ((FrameLayout.LayoutParams) ((ImageView) this.b).getLayoutParams()).topMargin = gl.L(i4 == i3 ? 4.0f : 8.0f);
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw9(hmc hmcVar, Context context) {
        super(context);
        this.a = (byte) 6;
        this.c = hmcVar;
        this.b = new qr1(this, (byte) 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw9(tx9 tx9Var, Context context) {
        super(context);
        this.a = (byte) 0;
        this.c = tx9Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw9(qmb qmbVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 4:
                this.c = qmbVar;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = qmbVar;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw9(xgc xgcVar, Context context, Drawable drawable) {
        super(context);
        this.a = (byte) 5;
        this.c = xgcVar;
        this.b = drawable;
    }
}
