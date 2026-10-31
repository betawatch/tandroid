package jg;

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
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.n21;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Wallet.n5;
import org.telegram.ui.Wallet.r9;
import vh.b4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d0 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Activity activity, org.telegram.ui.Components.voip.x0 x0Var) {
        super(activity);
        this.a = 6;
        this.b = new RectF();
        this.c = x0Var;
        x0Var.a(this);
    }

    public static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view.getParent() == null) {
            return false;
        }
        return view.getParent() instanceof View ? a((View) view.getParent(), view2) : view.getParent() == view2 || view.getRootView() == view2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                super.dispatchDraw(canvas);
                ((qz0) this.b).e(canvas, ((ac0) this.c).getX() - org.telegram.messenger.i0.L(50.0f), getHeight() / 2.0f);
                break;
            case 5:
                canvas.save();
                t5 t5Var = (t5) this.b;
                n21 n21Var = (n21) this.c;
                float d = t5Var.d(n21Var.y);
                if (d > 0.0f) {
                    if (n21Var.c == null) {
                        n21Var.c = new fo0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    n21Var.c.a(canvas, d);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 6:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.c;
                x0Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), x0Var.b());
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                int[] iArr = (int[]) this.b;
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (!dispatchTouchEvent) {
                    getLocationOnScreen(iArr);
                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        List j10 = org.telegram.messenger.i0.j();
                        if (j10 != null && j10.size() > 1) {
                            for (int size = j10.size() - 2; size >= 0; size--) {
                                View view = (View) j10.get(size);
                                if (!a(this, view)) {
                                    view.getLocationOnScreen(iArr);
                                    motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                    dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                    if (dispatchTouchEvent) {
                                        this.c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.c = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 7:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((n5) this.b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((r9) this.c).K);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 7:
                getViewTreeObserver().removeOnPreDrawListener((n5) this.b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((r9) this.c).K);
                super.onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                super.onDraw(canvas);
                r0 r0Var = (r0) this.c;
                TextView textView = (TextView) getChildAt(r0Var.P0);
                int i10 = r0Var.Q0;
                TextView textView2 = i10 != -1 ? (TextView) getChildAt(i10) : null;
                paint.setColor(textView.getCurrentTextColor());
                float y3 = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + org.telegram.messenger.i0.L(3.0f);
                Layout layout = textView.getLayout();
                Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                float interpolation = layout2 == null ? 0.0f : gr.f.getInterpolation(r0Var.R0);
                float T1 = org.telegram.messenger.i0.T1(layout.getPrimaryHorizontal(layout.getLineStart(0)) + textView.getX(), textView2 != null ? layout2.getPrimaryHorizontal(layout.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                canvas.drawLine(T1, y3, org.telegram.messenger.i0.T1(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation) + T1, y3, paint);
                break;
            case 3:
                int x02 = t6.x0(null, t6.d6, false);
                Paint paint2 = (Paint) this.b;
                if (paint2.getColor() != x02) {
                    paint2.setColor(x02);
                }
                canvas.drawPath((Path) this.c, paint2);
                super.onDraw(canvas);
                break;
            case 8:
                Paint paint3 = (Paint) this.b;
                super.onDraw(canvas);
                b4 b4Var = (b4) this.c;
                TextView textView3 = (TextView) getChildAt(b4Var.H0);
                int i11 = b4Var.I0;
                TextView textView4 = i11 != -1 ? (TextView) getChildAt(i11) : null;
                paint3.setColor(textView3.getCurrentTextColor());
                float y10 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + org.telegram.messenger.i0.L(3.0f);
                Layout layout3 = textView3.getLayout();
                if (layout3 != null) {
                    Layout layout4 = textView4 != null ? textView4.getLayout() : null;
                    float interpolation2 = layout4 == null ? 0.0f : gr.f.getInterpolation(b4Var.J0);
                    float T12 = org.telegram.messenger.i0.T1(layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView3.getX(), layout4 != null ? layout4.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX() : 0.0f, interpolation2);
                    canvas.drawLine(T12, y10, org.telegram.messenger.i0.T1(layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0)), layout4 != null ? layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0)) : 0.0f, interpolation2) + T12, y10, paint3);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                View view = (View) this.b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.c;
                t0Var.b.measure(i10, i11);
                if (t0Var.b.getSwipeBack() != null) {
                    view.getLayoutParams().width = t0Var.b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = t0Var.b.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f);
                }
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(i10, i11);
                Path path = (Path) this.c;
                path.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(12.0f));
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), Path.Direction.CW);
                break;
            case 7:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(org.telegram.ui.ActionBar.t0 t0Var, Context context, View view) {
        super(context);
        this.a = 1;
        this.c = t0Var;
        this.b = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(r9 r9Var, Context context) {
        super(context);
        this.a = 7;
        this.c = r9Var;
        this.b = new n5(3, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(r0 r0Var, Context context) {
        super(context);
        this.a = 0;
        this.c = r0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(n21 n21Var, Context context) {
        super(context);
        this.a = 5;
        this.c = n21Var;
        this.b = new t5(this, 360L, gr.h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 3:
                super(context);
                break;
            default:
                this.b = new int[2];
                this.c = null;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b4 b4Var, Context context) {
        super(context);
        this.a = 8;
        this.c = b4Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, qz0 qz0Var, ac0 ac0Var) {
        super(context);
        this.a = 4;
        this.b = qz0Var;
        this.c = ac0Var;
    }
}
