package kh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n5 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Context context, Object obj, LinearLayout linearLayout, int i9) {
        super(context);
        this.a = i9;
        this.b = obj;
        this.c = linearLayout;
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
                ((nz0) this.b).e(canvas, ((bc0) this.c).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
                break;
            case 5:
                canvas.save();
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) this.b;
                a21 a21Var = (a21) this.c;
                float e10 = y5Var.e(a21Var.w);
                if (e10 > 0.0f) {
                    if (a21Var.c == null) {
                        a21Var.c = new ho0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    a21Var.c.a(canvas, e10);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 6:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.c;
                n1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), n1Var.b());
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
                        List<View> allGlobalViews = AndroidUtilities.allGlobalViews();
                        if (allGlobalViews != null && allGlobalViews.size() > 1) {
                            for (int size = allGlobalViews.size() - 2; size >= 0; size--) {
                                View view = allGlobalViews.get(size);
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

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                super.onDraw(canvas);
                g6 g6Var = (g6) this.c;
                TextView textView = (TextView) getChildAt(g6Var.U0);
                int i9 = g6Var.V0;
                TextView textView2 = i9 != -1 ? (TextView) getChildAt(i9) : null;
                paint.setColor(textView.getCurrentTextColor());
                float y10 = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout = textView.getLayout();
                if (layout != null) {
                    Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                    float interpolation = layout2 == null ? 0.0f : gr.f.getInterpolation(g6Var.W0);
                    float lerp = AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineStart(0)) + textView.getX(), layout2 != null ? layout2.getPrimaryHorizontal(layout.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                    canvas.drawLine(lerp, y10, AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation) + lerp, y10, paint);
                    break;
                }
                break;
            case 3:
                canvas.drawPath((Path) this.c, (Paint) this.b);
                super.onDraw(canvas);
                break;
            case 8:
                Paint paint2 = (Paint) this.b;
                super.onDraw(canvas);
                yf.l0 l0Var = (yf.l0) this.c;
                TextView textView3 = (TextView) getChildAt(l0Var.c1);
                int i10 = l0Var.d1;
                TextView textView4 = i10 != -1 ? (TextView) getChildAt(i10) : null;
                paint2.setColor(textView3.getCurrentTextColor());
                float y11 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout3 = textView3.getLayout();
                Layout layout4 = textView4 != null ? textView4.getLayout() : null;
                float interpolation2 = layout4 == null ? 0.0f : gr.f.getInterpolation(l0Var.e1);
                float lerp2 = AndroidUtilities.lerp(layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView3.getX(), textView4 != null ? layout4.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX() : 0.0f, interpolation2);
                canvas.drawLine(lerp2, y11, AndroidUtilities.lerp(layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0)), layout4 != null ? layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0)) : 0.0f, interpolation2) + lerp2, y11, paint2);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 1:
                View view = (View) this.b;
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.c;
                w0Var.b.measure(i9, i10);
                if (w0Var.b.getSwipeBack() != null) {
                    view.getLayoutParams().width = w0Var.b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = w0Var.b.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                }
                super.onMeasure(i9, i10);
                break;
            case 3:
                super.onMeasure(i9, i10);
                Path path = (Path) this.c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            case 7:
                int size = View.MeasureSpec.getSize(i9);
                LinearLayout linearLayout = (LinearLayout) this.b;
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout2 = (LinearLayout) this.c;
                if (linearLayout2 == null) {
                    setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
                    break;
                } else {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                    setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredHeight() + linearLayout.getMeasuredHeight());
                    break;
                }
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Activity activity, org.telegram.ui.Components.voip.n1 n1Var) {
        super(activity);
        this.a = 6;
        this.b = new RectF();
        this.c = n1Var;
        n1Var.a(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(org.telegram.ui.ActionBar.w0 w0Var, Context context, View view) {
        super(context);
        this.a = 1;
        this.c = w0Var;
        this.b = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(a21 a21Var, Context context) {
        super(context);
        this.a = 5;
        this.c = a21Var;
        this.b = new org.telegram.ui.Components.y5(this, 360L, gr.h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(yf.l0 l0Var, Context context) {
        super(context);
        this.a = 8;
        this.c = l0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Context context, int i9) {
        super(context);
        this.a = i9;
        switch (i9) {
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
    public n5(g6 g6Var, Context context) {
        super(context);
        this.a = 0;
        this.c = g6Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }
}
