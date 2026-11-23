package hi;

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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.z11;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class x4 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Activity activity, org.telegram.ui.Components.voip.l1 l1Var) {
        super(activity);
        this.a = 6;
        this.b = new RectF();
        this.c = l1Var;
        l1Var.a(this);
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
                ((xy0) this.b).e(canvas, ((tb0) this.c).getX() - org.telegram.messenger.g0.L(50.0f), getHeight() / 2.0f);
                break;
            case 5:
                canvas.save();
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.b;
                z11 z11Var = (z11) this.c;
                float d = d6Var.d(z11Var.y);
                if (d > 0.0f) {
                    if (z11Var.c == null) {
                        z11Var.c = new tn0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    z11Var.c.a(canvas, d);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 6:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.l1 l1Var = (org.telegram.ui.Components.voip.l1) this.c;
                l1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), l1Var.b());
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
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.a6) this.b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((org.telegram.ui.Wallet.da) this.c).L);
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
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.a6) this.b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((org.telegram.ui.Wallet.da) this.c).L);
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
                k5 k5Var = (k5) this.c;
                TextView textView = (TextView) getChildAt(k5Var.I0);
                int i7 = k5Var.J0;
                TextView textView2 = i7 != -1 ? (TextView) getChildAt(i7) : null;
                paint.setColor(textView.getCurrentTextColor());
                float y10 = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + org.telegram.messenger.g0.L(3.0f);
                Layout layout = textView.getLayout();
                if (layout != null) {
                    Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                    float interpolation = layout2 == null ? 0.0f : nr.f.getInterpolation(k5Var.K0);
                    float T1 = org.telegram.messenger.g0.T1(layout.getPrimaryHorizontal(layout.getLineStart(0)) + textView.getX(), layout2 != null ? layout2.getPrimaryHorizontal(layout.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                    canvas.drawLine(T1, y10, org.telegram.messenger.g0.T1(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation) + T1, y10, paint);
                    break;
                }
                break;
            case 3:
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false);
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
                tg.h0 h0Var = (tg.h0) this.c;
                TextView textView3 = (TextView) getChildAt(h0Var.Q0);
                int i10 = h0Var.R0;
                TextView textView4 = i10 != -1 ? (TextView) getChildAt(i10) : null;
                paint3.setColor(textView3.getCurrentTextColor());
                float y11 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + org.telegram.messenger.g0.L(3.0f);
                Layout layout3 = textView3.getLayout();
                Layout layout4 = textView4 != null ? textView4.getLayout() : null;
                float interpolation2 = layout4 == null ? 0.0f : nr.f.getInterpolation(h0Var.S0);
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
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.c;
                q0Var.b.measure(i7, i10);
                if (q0Var.b.getSwipeBack() != null) {
                    view.getLayoutParams().width = q0Var.b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = q0Var.b.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f);
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
    public x4(org.telegram.ui.ActionBar.q0 q0Var, Context context, View view) {
        super(context);
        this.a = 1;
        this.c = q0Var;
        this.b = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(org.telegram.ui.Wallet.da daVar, Context context) {
        super(context);
        this.a = 7;
        this.c = daVar;
        this.b = new org.telegram.ui.Wallet.a6(3, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(tg.h0 h0Var, Context context) {
        super(context);
        this.a = 8;
        this.c = h0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(z11 z11Var, Context context) {
        super(context);
        this.a = 5;
        this.c = z11Var;
        this.b = new org.telegram.ui.Components.d6(this, 360L, nr.h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Context context, int i7) {
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
    public x4(k5 k5Var, Context context) {
        super(context);
        this.a = 0;
        this.c = k5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Context context, xy0 xy0Var, tb0 tb0Var) {
        super(context);
        this.a = 4;
        this.b = xy0Var;
        this.c = tb0Var;
    }
}
