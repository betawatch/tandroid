package gi;

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
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y4 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(Activity activity, org.telegram.ui.Components.voip.x0 x0Var) {
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
                ((ly0) this.b).e(canvas, ((cb0) this.c).getX() - org.telegram.messenger.g0.L(50.0f), getHeight() / 2.0f);
                break;
            case 5:
                canvas.save();
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.b;
                f11 f11Var = (f11) this.c;
                float d = u5Var.d(f11Var.y);
                if (d > 0.0f) {
                    if (f11Var.c == null) {
                        f11Var.c = new hn0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    f11Var.c.a(canvas, d);
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
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), x0Var.b());
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
                        List j10 = org.telegram.messenger.g0.j();
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
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.j5) this.b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((org.telegram.ui.Wallet.m9) this.c).L);
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
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.j5) this.b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((org.telegram.ui.Wallet.m9) this.c).L);
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
                m5 m5Var = (m5) this.c;
                TextView textView = (TextView) getChildAt(m5Var.I0);
                int i3 = m5Var.J0;
                TextView textView2 = i3 != -1 ? (TextView) getChildAt(i3) : null;
                paint.setColor(textView.getCurrentTextColor());
                float y9 = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + org.telegram.messenger.g0.L(3.0f);
                Layout layout = textView.getLayout();
                if (layout != null) {
                    Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                    float interpolation = layout2 == null ? 0.0f : xq.f.getInterpolation(m5Var.K0);
                    float T1 = org.telegram.messenger.g0.T1(layout.getPrimaryHorizontal(layout.getLineStart(0)) + textView.getX(), layout2 != null ? layout2.getPrimaryHorizontal(layout.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                    canvas.drawLine(T1, y9, org.telegram.messenger.g0.T1(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation) + T1, y9, paint);
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
                ug.f0 f0Var = (ug.f0) this.c;
                TextView textView3 = (TextView) getChildAt(f0Var.Q0);
                int i10 = f0Var.R0;
                TextView textView4 = i10 != -1 ? (TextView) getChildAt(i10) : null;
                paint3.setColor(textView3.getCurrentTextColor());
                float y10 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + org.telegram.messenger.g0.L(3.0f);
                Layout layout3 = textView3.getLayout();
                Layout layout4 = textView4 != null ? textView4.getLayout() : null;
                float interpolation2 = layout4 == null ? 0.0f : xq.f.getInterpolation(f0Var.S0);
                float T12 = org.telegram.messenger.g0.T1(layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView3.getX(), textView4 != null ? layout4.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX() : 0.0f, interpolation2);
                canvas.drawLine(T12, y10, org.telegram.messenger.g0.T1(layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0)), layout4 != null ? layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0)) : 0.0f, interpolation2) + T12, y10, paint3);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 1:
                View view = (View) this.b;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.c;
                q0Var.b.measure(i3, i10);
                if (q0Var.b.getSwipeBack() != null) {
                    view.getLayoutParams().width = q0Var.b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = q0Var.b.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f);
                }
                super.onMeasure(i3, i10);
                break;
            case 3:
                super.onMeasure(i3, i10);
                Path path = (Path) this.c;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f));
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                break;
            case 7:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(org.telegram.ui.ActionBar.q0 q0Var, Context context, View view) {
        super(context);
        this.a = 1;
        this.c = q0Var;
        this.b = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(org.telegram.ui.Wallet.m9 m9Var, Context context) {
        super(context);
        this.a = 7;
        this.c = m9Var;
        this.b = new org.telegram.ui.Wallet.j5(3, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(ug.f0 f0Var, Context context) {
        super(context);
        this.a = 8;
        this.c = f0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(f11 f11Var, Context context) {
        super(context);
        this.a = 5;
        this.c = f11Var;
        this.b = new org.telegram.ui.Components.u5(this, 360L, xq.h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
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
    public y4(m5 m5Var, Context context) {
        super(context);
        this.a = 0;
        this.c = m5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(Context context, ly0 ly0Var, cb0 cb0Var) {
        super(context);
        this.a = 4;
        this.b = ly0Var;
        this.c = cb0Var;
    }
}
