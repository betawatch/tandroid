package fi;

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
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a5 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Activity activity, org.telegram.ui.Components.voip.i1 i1Var) {
        super(activity);
        this.a = 6;
        this.b = new RectF();
        this.c = i1Var;
        i1Var.a(this);
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
                ((my0) this.b).e(canvas, ((hb0) this.c).getX() - org.telegram.messenger.g0.L(50.0f), getHeight() / 2.0f);
                break;
            case 5:
                canvas.save();
                org.telegram.ui.Components.w5 w5Var = (org.telegram.ui.Components.w5) this.b;
                l11 l11Var = (l11) this.c;
                float d = w5Var.d(l11Var.y);
                if (d > 0.0f) {
                    if (l11Var.c == null) {
                        l11Var.c = new en0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    l11Var.c.a(canvas, d);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 6:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.c;
                i1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), i1Var.b());
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
                        List j3 = org.telegram.messenger.g0.j();
                        if (j3 != null && j3.size() > 1) {
                            for (int size = j3.size() - 2; size >= 0; size--) {
                                View view = (View) j3.get(size);
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
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.k5) this.b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((org.telegram.ui.Wallet.m9) this.c).K);
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
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.k5) this.b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((org.telegram.ui.Wallet.m9) this.c).K);
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
                o5 o5Var = (o5) this.c;
                TextView textView = (TextView) getChildAt(o5Var.H0);
                int i7 = o5Var.I0;
                TextView textView2 = i7 != -1 ? (TextView) getChildAt(i7) : null;
                paint.setColor(textView.getCurrentTextColor());
                float y10 = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + org.telegram.messenger.g0.L(3.0f);
                Layout layout = textView.getLayout();
                if (layout != null) {
                    Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                    float interpolation = layout2 == null ? 0.0f : xq.f.getInterpolation(o5Var.J0);
                    float T1 = org.telegram.messenger.g0.T1(layout.getPrimaryHorizontal(layout.getLineStart(0)) + textView.getX(), layout2 != null ? layout2.getPrimaryHorizontal(layout.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                    canvas.drawLine(T1, y10, org.telegram.messenger.g0.T1(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation) + T1, y10, paint);
                    break;
                }
                break;
            case 3:
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
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
                tg.g0 g0Var = (tg.g0) this.c;
                TextView textView3 = (TextView) getChildAt(g0Var.P0);
                int i10 = g0Var.Q0;
                TextView textView4 = i10 != -1 ? (TextView) getChildAt(i10) : null;
                paint3.setColor(textView3.getCurrentTextColor());
                float y11 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + org.telegram.messenger.g0.L(3.0f);
                Layout layout3 = textView3.getLayout();
                Layout layout4 = textView4 != null ? textView4.getLayout() : null;
                float interpolation2 = layout4 == null ? 0.0f : xq.f.getInterpolation(g0Var.R0);
                float T12 = org.telegram.messenger.g0.T1(layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView3.getX(), textView4 != null ? layout4.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX() : 0.0f, interpolation2);
                canvas.drawLine(T12, y11, org.telegram.messenger.g0.T1(layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0)), layout4 != null ? layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0)) : 0.0f, interpolation2) + T12, y11, paint3);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                View view = (View) this.b;
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.c;
                r0Var.b.measure(i7, i10);
                if (r0Var.b.getSwipeBack() != null) {
                    view.getLayoutParams().width = r0Var.b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = r0Var.b.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f);
                }
                super.onMeasure(i7, i10);
                break;
            case 3:
                super.onMeasure(i7, i10);
                Path path = (Path) this.c;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f));
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                break;
            case 7:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(org.telegram.ui.ActionBar.r0 r0Var, Context context, View view) {
        super(context);
        this.a = 1;
        this.c = r0Var;
        this.b = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(org.telegram.ui.Wallet.m9 m9Var, Context context) {
        super(context);
        this.a = 7;
        this.c = m9Var;
        this.b = new org.telegram.ui.Wallet.k5(3, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(tg.g0 g0Var, Context context) {
        super(context);
        this.a = 8;
        this.c = g0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(l11 l11Var, Context context) {
        super(context);
        this.a = 5;
        this.c = l11Var;
        this.b = new org.telegram.ui.Components.w5(this, 360L, xq.h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
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
    public a5(o5 o5Var, Context context) {
        super(context);
        this.a = 0;
        this.c = o5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Context context, my0 my0Var, hb0 hb0Var) {
        super(context);
        this.a = 4;
        this.b = my0Var;
        this.c = hb0Var;
    }
}
