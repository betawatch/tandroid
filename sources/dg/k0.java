package dg;

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
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.v21;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.z5;
import ph.c5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k0 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Context context, Object obj, LinearLayout linearLayout, int i10) {
        super(context);
        this.a = i10;
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
                ((k01) this.b).e(canvas, ((wc0) this.c).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
                break;
            case 5:
                canvas.save();
                z5 z5Var = (z5) this.b;
                v21 v21Var = (v21) this.c;
                float e = z5Var.e(v21Var.w);
                if (e > 0.0f) {
                    if (v21Var.c == null) {
                        v21Var.c = new cp0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    v21Var.c.a(canvas, e);
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
                e1 e1Var = (e1) this.c;
                TextView textView = (TextView) getChildAt(e1Var.d1);
                int i10 = e1Var.e1;
                TextView textView2 = i10 != -1 ? (TextView) getChildAt(i10) : null;
                paint.setColor(textView.getCurrentTextColor());
                float y10 = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout = textView.getLayout();
                Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                float interpolation = layout2 == null ? 0.0f : nr.f.getInterpolation(e1Var.f1);
                float lerp = AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineStart(0)) + textView.getX(), textView2 != null ? layout2.getPrimaryHorizontal(layout.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                canvas.drawLine(lerp, y10, AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation) + lerp, y10, paint);
                break;
            case 3:
                canvas.drawPath((Path) this.c, (Paint) this.b);
                super.onDraw(canvas);
                break;
            case 8:
                Paint paint2 = (Paint) this.b;
                super.onDraw(canvas);
                c5 c5Var = (c5) this.c;
                TextView textView3 = (TextView) getChildAt(c5Var.V0);
                int i11 = c5Var.W0;
                TextView textView4 = i11 != -1 ? (TextView) getChildAt(i11) : null;
                paint2.setColor(textView3.getCurrentTextColor());
                float y11 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout3 = textView3.getLayout();
                if (layout3 != null) {
                    Layout layout4 = textView4 != null ? textView4.getLayout() : null;
                    float interpolation2 = layout4 == null ? 0.0f : nr.f.getInterpolation(c5Var.X0);
                    float lerp2 = AndroidUtilities.lerp(layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView3.getX(), layout4 != null ? layout4.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX() : 0.0f, interpolation2);
                    canvas.drawLine(lerp2, y11, AndroidUtilities.lerp(layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0)), layout4 != null ? layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0)) : 0.0f, interpolation2) + lerp2, y11, paint2);
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
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.c;
                w0Var.b.measure(i10, i11);
                if (w0Var.b.getSwipeBack() != null) {
                    view.getLayoutParams().width = w0Var.b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = w0Var.b.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                }
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(i10, i11);
                Path path = (Path) this.c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            case 7:
                int size = View.MeasureSpec.getSize(i10);
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
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Activity activity, org.telegram.ui.Components.voip.n1 n1Var) {
        super(activity);
        this.a = 6;
        this.b = new RectF();
        this.c = n1Var;
        n1Var.a(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(org.telegram.ui.ActionBar.w0 w0Var, Context context, View view) {
        super(context);
        this.a = 1;
        this.c = w0Var;
        this.b = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(v21 v21Var, Context context) {
        super(context);
        this.a = 5;
        this.c = v21Var;
        this.b = new z5(this, 360L, nr.h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e1 e1Var, Context context) {
        super(context);
        this.a = 0;
        this.c = e1Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, int i10) {
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
    public k0(c5 c5Var, Context context) {
        super(context);
        this.a = 8;
        this.c = c5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }
}
