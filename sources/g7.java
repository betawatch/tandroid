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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class g7 extends LinearLayout {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(wy5 wy5Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = wy5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(hl.L(2.0f));
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
                ((pkb) this.b).e(canvas, ((hq7) this.c).getX() - hl.L(50.0f), getHeight() / 2.0f);
                break;
            case 3:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                kjc kjcVar = (kjc) this.c;
                kjcVar.d(getX(), getY());
                canvas.drawRoundRect(rectF, hl.L(20.0f), hl.L(20.0f), kjcVar.b());
                super.dispatchDraw(canvas);
                break;
            case 7:
                canvas.save();
                mm mmVar = (mm) this.b;
                k1c k1cVar = (k1c) this.c;
                float d = mmVar.d(k1cVar.y);
                if (d > 0.0f) {
                    if (k1cVar.c == null) {
                        k1cVar.c = new tca(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    k1cVar.c.a(canvas, d);
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
                        List j = hl.j();
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
                getViewTreeObserver().addOnPreDrawListener((es1) this.b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((euc) this.c).L);
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
                getViewTreeObserver().removeOnPreDrawListener((es1) this.b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((euc) this.c).L);
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
                int w0 = aob.w0(null, aob.d6, false);
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
                wy5 wy5Var = (wy5) this.c;
                TextView textView = (TextView) getChildAt(wy5Var.Q0);
                int i = wy5Var.R0;
                TextView textView2 = i != -1 ? (TextView) getChildAt(i) : null;
                paint2.setColor(textView.getCurrentTextColor());
                float y = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + hl.L(3.0f);
                Layout layout2 = textView.getLayout();
                layout = textView2 != null ? textView2.getLayout() : null;
                float interpolation = layout == null ? 0.0f : k43.f.getInterpolation(wy5Var.S0);
                float R1 = hl.R1(layout2.getPrimaryHorizontal(layout2.getLineStart(0)) + textView.getX(), textView2 != null ? layout.getPrimaryHorizontal(layout2.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                canvas.drawLine(R1, y, hl.R1(layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)), layout != null ? layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)) : 0.0f, interpolation) + R1, y, paint2);
                break;
            case 6:
                Paint paint3 = (Paint) this.b;
                super.onDraw(canvas);
                dx7 dx7Var = (dx7) this.c;
                TextView textView3 = (TextView) getChildAt(dx7Var.I0);
                int i2 = dx7Var.J0;
                TextView textView4 = i2 != -1 ? (TextView) getChildAt(i2) : null;
                paint3.setColor(textView3.getCurrentTextColor());
                float y2 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + hl.L(3.0f);
                Layout layout3 = textView3.getLayout();
                if (layout3 != null) {
                    layout = textView4 != null ? textView4.getLayout() : null;
                    float interpolation2 = layout == null ? 0.0f : k43.f.getInterpolation(dx7Var.K0);
                    float R12 = hl.R1(layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView3.getX(), layout != null ? layout.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX() : 0.0f, interpolation2);
                    canvas.drawLine(R12, y2, hl.R1(layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0)), layout != null ? layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)) : 0.0f, interpolation2) + R12, y2, paint3);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) this.c;
                s7Var.b.measure(i, i2);
                fj8 swipeBack = s7Var.b.getSwipeBack();
                View view = (View) this.b;
                if (swipeBack != null) {
                    view.getLayoutParams().width = s7Var.b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = s7Var.b.getMeasuredWidth() - hl.L(16.0f);
                }
                super.onMeasure(i, i2);
                break;
            case 2:
                super.onMeasure(i, i2);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = hl.P;
                rectF.set(hl.L(12.0f), hl.L(6.0f), getMeasuredWidth() - hl.L(12.0f), getMeasuredHeight() - hl.L(12.0f));
                path.addRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), Path.Direction.CW);
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
    public g7(s7 s7Var, Context context, View view) {
        super(context);
        this.a = (byte) 0;
        this.c = s7Var;
        this.b = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(euc eucVar, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = eucVar;
        this.b = new es1(this, (byte) 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(k1c k1cVar, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = k1cVar;
        this.b = new mm(360L, this, k43.h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(Activity activity, kjc kjcVar) {
        super(activity);
        this.a = (byte) 3;
        this.b = new RectF();
        this.c = kjcVar;
        kjcVar.a(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(Context context, byte b) {
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
    public g7(dx7 dx7Var, Context context) {
        super(context);
        this.a = (byte) 6;
        this.c = dx7Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(Context context, pkb pkbVar, hq7 hq7Var) {
        super(context);
        this.a = (byte) 1;
        this.b = pkbVar;
        this.c = hq7Var;
    }
}
