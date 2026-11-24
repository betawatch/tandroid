// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f7 extends LinearLayout {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(ry5 ry5Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = ry5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view.getParent() != null) {
            return view.getParent() instanceof View ? a((View) view.getParent(), view2) : view.getParent() == view2 || view.getRootView() == view2;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                ((uib) this.b).e(canvas, ((lp7) this.c).getX() - gm.L(50.0f), getHeight() / 2.0f);
                break;
            case 3:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                lhc lhcVar = (lhc) this.c;
                lhcVar.d(getX(), getY());
                canvas.drawRoundRect(rectF, gm.L(20.0f), gm.L(20.0f), lhcVar.b());
                super.dispatchDraw(canvas);
                break;
            case 7:
                canvas.save();
                ln lnVar = (ln) this.b;
                lzb lzbVar = (lzb) this.c;
                float d = lnVar.d(lzbVar.y);
                if (d > 0.0f) {
                    if (lzbVar.c == null) {
                        lzbVar.c = new cba(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    lzbVar.c.a(canvas, d);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                int[] iArr = (int[]) this.c;
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (!dispatchTouchEvent) {
                    getLocationOnScreen(iArr);
                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        List j = gm.j();
                        if (j != null && j.size() > 1) {
                            for (int size = j.size() - 2; size >= 0; size--) {
                                View view = (View) j.get(size);
                                if (!a(this, view)) {
                                    view.getLocationOnScreen(iArr);
                                    motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                    dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                    if (dispatchTouchEvent) {
                                        this.b = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.b;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.b = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 8:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((cc) this.b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((rrc) this.c).L);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 8:
                getViewTreeObserver().removeOnPreDrawListener((cc) this.b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((rrc) this.c).L);
                super.onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout;
        switch (this.a) {
            case 2:
                int w0 = cmb.w0(null, cmb.c6, false);
                Paint paint = (Paint) this.c;
                if (paint.getColor() != w0) {
                    paint.setColor(w0);
                }
                canvas.drawPath((Path) this.b, paint);
                super.onDraw(canvas);
                break;
            case 3:
            case 4:
            default:
                super.onDraw(canvas);
                break;
            case 5:
                Paint paint2 = (Paint) this.b;
                super.onDraw(canvas);
                ry5 ry5Var = (ry5) this.c;
                TextView textView = (TextView) getChildAt(ry5Var.W0);
                int i = ry5Var.X0;
                TextView textView2 = i != -1 ? (TextView) getChildAt(i) : null;
                paint2.setColor(textView.getCurrentTextColor());
                float y = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + gm.L(3.0f);
                Layout layout2 = textView.getLayout();
                layout = textView2 != null ? textView2.getLayout() : null;
                float interpolation = layout == null ? 0.0f : d53.f.getInterpolation(ry5Var.Y0);
                float R1 = gm.R1(layout2.getPrimaryHorizontal(layout2.getLineStart(0)) + textView.getX(), textView2 != null ? layout.getPrimaryHorizontal(layout2.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                canvas.drawLine(R1, y, gm.R1(layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)), layout != null ? layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)) : 0.0f, interpolation) + R1, y, paint2);
                break;
            case 6:
                Paint paint3 = (Paint) this.b;
                super.onDraw(canvas);
                xv7 xv7Var = (xv7) this.c;
                TextView textView3 = (TextView) getChildAt(xv7Var.O0);
                int i2 = xv7Var.P0;
                TextView textView4 = i2 != -1 ? (TextView) getChildAt(i2) : null;
                paint3.setColor(textView3.getCurrentTextColor());
                float y2 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + gm.L(3.0f);
                Layout layout3 = textView3.getLayout();
                if (layout3 != null) {
                    layout = textView4 != null ? textView4.getLayout() : null;
                    float interpolation2 = layout == null ? 0.0f : d53.f.getInterpolation(xv7Var.Q0);
                    float R12 = gm.R1(layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView3.getX(), layout != null ? layout.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX() : 0.0f, interpolation2);
                    canvas.drawLine(R12, y2, gm.R1(layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0)), layout != null ? layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)) : 0.0f, interpolation2) + R12, y2, paint3);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.c;
                r7Var.b.measure(i, i2);
                th8 swipeBack = r7Var.b.getSwipeBack();
                View view = (View) this.b;
                if (swipeBack != null) {
                    view.getLayoutParams().width = r7Var.b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = r7Var.b.getMeasuredWidth() - gm.L(16.0f);
                }
                super.onMeasure(i, i2);
                break;
            case 2:
                super.onMeasure(i, i2);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = gm.P;
                rectF.set(gm.L(12.0f), gm.L(6.0f), getMeasuredWidth() - gm.L(12.0f), getMeasuredHeight() - gm.L(12.0f));
                path.addRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), Path.Direction.CW);
                break;
            case 8:
                super.onMeasure(i, 0);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(r7 r7Var, Context context, View view) {
        super(context);
        this.a = (byte) 0;
        this.c = r7Var;
        this.b = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(rrc rrcVar, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = rrcVar;
        this.b = new cc(this, (byte) 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(lzb lzbVar, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = lzbVar;
        this.b = new ln(360L, this, d53.h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(Activity activity, lhc lhcVar) {
        super(activity);
        this.a = (byte) 3;
        this.b = new RectF();
        this.c = lhcVar;
        lhcVar.a(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 4:
                super(context);
                this.c = new int[2];
                this.b = null;
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(xv7 xv7Var, Context context) {
        super(context);
        this.a = (byte) 6;
        this.c = xv7Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(Context context, uib uibVar, lp7 lp7Var) {
        super(context);
        this.a = (byte) 1;
        this.b = uibVar;
        this.c = lp7Var;
    }
}
