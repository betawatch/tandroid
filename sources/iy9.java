// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class iy9 extends FrameLayout {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy9(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 3:
                super(context);
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, tre.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(hl.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, tre.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                break;
            default:
                break;
        }
    }

    public final void a(int i, CharSequence charSequence, boolean z) {
        ImageView imageView = (ImageView) this.b;
        if (z) {
            hl.L3(imageView, i);
        } else {
            imageView.setImageResource(i);
        }
        ((TextView) this.c).setText(charSequence);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
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
                Path path = (Path) this.b;
                ky9 ky9Var = (ky9) this.c;
                RectF rectF = ky9Var.S;
                if (view == ky9Var.O || view == ky9Var.y) {
                    canvas.save();
                    canvas.clipRect(0.0f, hl.R1(ky9Var.U, 0.0f, ky9Var.s), getWidth(), hl.R1(ky9Var.V, getHeight(), ky9Var.s));
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
                if (view != ky9Var.Q) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                path.rewind();
                path.addCircle(rectF.centerX() + ky9Var.O.getX(), rectF.centerY() + ky9Var.O.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.clipRect(0.0f, hl.R1(ky9Var.U, 0.0f, ky9Var.s), getWidth(), hl.R1(ky9Var.V, getHeight(), ky9Var.s));
                canvas.translate(-ky9Var.Q.getX(), -ky9Var.Q.getY());
                canvas.translate(ky9Var.O.getX() + rectF.left, ky9Var.O.getY() + rectF.top);
                canvas.scale(rectF.width() / ky9Var.Q.getMeasuredWidth(), rectF.height() / ky9Var.Q.getMeasuredHeight(), ky9Var.Q.getX(), ky9Var.Q.getY());
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            case 1:
                if (view != ((n1a) this.c).i0 || !ri5.b || !ri5.f) {
                    return super.drawChild(canvas, view, j);
                }
                for (int i = 0; i < ((n1a) this.c).i0.getChildCount(); i++) {
                    View childAt = ((n1a) this.c).i0.getChildAt(i);
                    if (childAt instanceof w0a) {
                        w0a w0aVar = (w0a) childAt;
                        if (w0aVar.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j);
                            canvas.restore();
                        } else if (w0aVar.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r5.centerX() - (w0aVar.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (w0aVar.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((w0aVar.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((w0aVar.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(w0aVar.getAnimatedScale(), w0aVar.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof r0a) || (childAt instanceof q0a) || (childAt instanceof s0a)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j);
                        canvas.restore();
                    }
                }
                return false;
            case 7:
                uqc uqcVar = (uqc) this.c;
                if (view != uqcVar.v0 || !uqcVar.G) {
                    return super.drawChild(canvas, view, j);
                }
                int save = canvas.save();
                canvas.concat(uqcVar.J);
                boolean drawChild3 = super.drawChild(canvas, view, j);
                canvas.restoreToCount(save);
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.a) {
            case 5:
                super.invalidate();
                l7 l7Var = ((pqb) this.c).v0;
                if (l7Var != null) {
                    l7Var.invalidate();
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
            case 7:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((es1) this.b);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 7:
                getViewTreeObserver().removeOnPreDrawListener((es1) this.b);
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
            case 4:
                int intrinsicHeight = aob.i3.getIntrinsicHeight();
                aob.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                aob.i3.draw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(((pqb) this.c).getThemedColor(aob.Je));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                break;
            case 5:
                int[] iArr = (int[]) this.b;
                pqb pqbVar = (pqb) this.c;
                if (!hl.D) {
                    getLocationInWindow(iArr);
                    if (pqbVar.u0.getTranslationY() != iArr[1]) {
                        pqbVar.u0.setTranslationY(-r9);
                        pqbVar.v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < pqbVar.R) {
                        invalidate();
                        break;
                    }
                }
                break;
            case 6:
                canvas.save();
                clc clcVar = ((dlc) this.c).b;
                canvas.scale(clcVar.getScaleX(), clcVar.getScaleY(), clcVar.getPivotX() + clcVar.getLeft(), clcVar.getPivotY() + clcVar.getTop());
                Drawable drawable = (Drawable) this.b;
                drawable.setBounds(clcVar.getLeft() - hl.L(2.0f), clcVar.getTop() - hl.L(2.0f), hl.L(2.0f) + clcVar.getRight(), hl.L(2.0f) + clcVar.getBottom());
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
            case 3:
                int size = View.MeasureSpec.getSize(i) - hl.L(8.0f);
                TextView textView = (TextView) this.c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(hl.L(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f3 = size;
                    if (measureText > f3) {
                        textPaint.setTextSize(hl.L(11.0f));
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
                    layoutParams.topMargin = hl.L(i4 == i3 ? 29.0f : 35.0f);
                    ((FrameLayout.LayoutParams) ((ImageView) this.b).getLayoutParams()).topMargin = hl.L(i4 == i3 ? 4.0f : 8.0f);
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy9(dlc dlcVar, Context context, Drawable drawable) {
        super(context);
        this.a = (byte) 6;
        this.c = dlcVar;
        this.b = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy9(uqc uqcVar, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = uqcVar;
        this.b = new es1(this, (byte) 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy9(n1a n1aVar, Context context) {
        super(context);
        this.a = (byte) 1;
        this.c = n1aVar;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy9(pqb pqbVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 5:
                this.c = pqbVar;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = pqbVar;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy9(ky9 ky9Var, Activity activity) {
        super(activity);
        this.a = (byte) 0;
        this.c = ky9Var;
        this.b = new Path();
    }
}
