// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class eb0 extends wma {
    public final m09 g0;
    public final /* synthetic */ ob0 h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public float l0;
    public final /* synthetic */ ob0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(ob0 ob0Var, Context context) {
        super(context, null);
        this.m0 = ob0Var;
        this.h0 = ob0Var;
        this.g0 = new m09((byte) 3);
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        ob0 ob0Var = this.m0;
        if (!ob0Var.V) {
            if (!ob0Var.h) {
                canvas.save();
                float x = ob0Var.a.getX() + ob0Var.r.getX();
                float y = ob0Var.a.getY() + ob0Var.r.getY();
                int i = ob0Var.d - ob0Var.c;
                float R1 = hl.R1(y, hl.m + ((a.getCurrentActionBarHeight() - ob0Var.c) >> 1), ob0Var.O);
                canvas.translate(x, R1);
                ob0Var.a.draw(canvas);
                RectF rectF = hl.P;
                float f = i / 2.0f;
                rectF.set(x, R1 - (ob0Var.F * f), ob0Var.a.getMeasuredWidth() + x, (f * ob0Var.F) + ob0Var.a.getMeasuredHeight() + R1);
                fb0 fb0Var = ob0Var.a;
                float f2 = x + fb0Var.E;
                float f3 = R1 + fb0Var.F;
                za1 za1Var = ob0Var.L;
                float f4 = fb0Var.y;
                za1Var.getClass();
                rectF.set((int) (f2 - f4), (int) (f3 - f4), (int) (f2 + f4), (int) (f3 + f4));
                za1Var.i = false;
                za1Var.c = 0;
                za1Var.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (ob0Var.e.getVisibility() == 0 ? ob0Var.e.getAlpha() : 0.0f)) * ob0Var.a.s.c;
            a aVar = ob0Var.I;
            if (alpha != 0.0f) {
                aVar.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(ob0Var.I.getX(), ob0Var.I.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ob0Var.I.getMeasuredWidth(), ob0Var.I.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                ob0Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                aVar.setVisibility(8);
            }
        }
        if (ob0Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        Canvas canvas2;
        ob0 ob0Var = this.m0;
        Paint paint = ob0Var.P;
        if (view == ob0Var.I) {
            return true;
        }
        aVar = ((e) ob0Var).actionBar;
        if (view != aVar || ob0Var.O <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(aob.w0(null, aob.d6, false));
            paint.setAlpha((int) (ob0Var.O * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) ob0Var.getParentLayout()).n(canvas2, (int) (ob0Var.O * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.g0.b();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.m0.O == 0.0f) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        a aVar;
        Q();
        boolean z = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2) + this.f;
        ob0 ob0Var = this.m0;
        float f = 0.0f;
        if (z != ob0Var.V) {
            ob0Var.V = z;
            hl.B2(ob0Var.a);
            hl.U2(ob0Var.getParentActivity(), ob0Var.getClassGuid());
            if (ob0Var.V) {
                ob0Var.m0(false, 0.0f);
                ob0Var.a.setExpanded(false);
                addView(ob0Var.a, 0, tre.c(-1.0f, -1));
            } else {
                ob0Var.r.addView(ob0Var.a, 0, tre.c(-2.0f, -1));
            }
            hl.V2(ob0Var.getParentActivity(), ob0Var.getClassGuid());
        }
        if (ob0Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i) * 0.55f);
            ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i) * 0.45f);
            ((ViewGroup.MarginLayoutParams) ob0Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) ob0Var.y.getLayoutParams()).rightMargin = hl.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) ob0Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) ob0Var.W.getLayoutParams()).topMargin = hl.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).bottomMargin = hl.L(64.0f);
            ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) ob0Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) ob0Var.y.getLayoutParams()).rightMargin = hl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) ob0Var.X.getLayoutParams()).topMargin = hl.L(10.0f);
            ((ViewGroup.MarginLayoutParams) ob0Var.W.getLayoutParams()).topMargin = hl.L(18.0f);
        }
        boolean z2 = ob0Var.M;
        boolean z3 = this.f >= hl.L(20.0f);
        ob0Var.M = z3;
        if (z2 != z3) {
            super.onMeasure(i, i2);
            if (ob0Var.M) {
                int i4 = -ob0Var.b.getTop();
                aVar = ((e) ob0Var).actionBar;
                i3 = hl.L(8.0f) + aVar.getMeasuredHeight() + i4;
            } else {
                i3 = 0;
            }
            oob oobVar = ob0Var.r;
            oobVar.setTranslationY((oobVar.getTranslationY() + ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).topMargin) - i3);
            ((ViewGroup.MarginLayoutParams) ob0Var.r.getLayoutParams()).topMargin = i3;
            boolean z4 = ob0Var.M;
            if (!ob0Var.V) {
                ob0Var.N = ValueAnimator.ofFloat(ob0Var.O, z4 ? 1.0f : 0.0f);
                float f2 = ((ob0Var.d - ob0Var.c) - hl.m) * ob0Var.F;
                if (z4) {
                    ob0Var.a.setExpanded(false);
                    f2 = ob0Var.r.getTranslationY();
                } else {
                    f = ob0Var.r.getTranslationY();
                }
                if (!ob0Var.G || z4) {
                    ob0Var.G = false;
                } else {
                    ob0Var.a.setExpanded(true);
                }
                ob0Var.N.addUpdateListener(new ib0(ob0Var, f2, f, z4));
                ob0Var.N.addListener(new bb0(ob0Var, (byte) 1));
                ob0Var.N.setDuration(250L);
                ob0Var.N.setInterpolator(hb.w);
                ob0Var.N.start();
            }
        }
        super.onMeasure(i, i2);
        ob0Var.c = ob0Var.a.getMeasuredHeight();
        ob0Var.d = ob0Var.a.getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        ob0 ob0Var = this.h0;
        if (ob0Var.O > 0.0f || ob0Var.V || i2 <= 0 || ob0Var.F <= 0.0f) {
            return;
        }
        ob0Var.g0();
        ob0Var.m0(true, Utilities.i(ob0Var.F - (i2 / ob0Var.d), 1.0f, 0.0f));
        iArr[1] = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        ob0 ob0Var = this.h0;
        if (ob0Var.O > 0.0f || ob0Var.V || i4 == 0) {
            return;
        }
        ob0Var.g0();
        ob0Var.m0(true, Utilities.i(ob0Var.F - (i4 / ob0Var.d), 1.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.g0.b = i;
        this.h0.g0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        ob0 ob0Var = this.h0;
        return ob0Var.O <= 0.0f && !ob0Var.V;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g0.b = 0;
        ob0 ob0Var = this.h0;
        ob0Var.k0(ob0Var.F > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ob0 ob0Var = this.m0;
        if (!ob0Var.L.b(motionEvent)) {
            if (!ob0Var.V) {
                if (motionEvent.getAction() == 0) {
                    hb0 hb0Var = ob0Var.b;
                    Rect rect = hl.Q;
                    hb0Var.getHitRect(rect);
                    rect.offset(0, (int) ob0Var.r.getY());
                    if (ob0Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.i0 = true;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z = this.i0) || this.j0)) {
                    float f = this.l0;
                    if (!z) {
                        ob0Var.m0(true, Utilities.i(((-(f - motionEvent.getY())) / ob0Var.d) + this.k0, 1.0f, 0.0f));
                    } else if (Math.abs(f - motionEvent.getY()) > hl.e) {
                        this.i0 = false;
                        this.j0 = true;
                        this.k0 = ob0Var.F;
                        motionEvent.getX();
                        this.l0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.j0) {
                        ob0Var.k0(ob0Var.F > 0.5f, false, false);
                    }
                    this.i0 = false;
                    this.j0 = false;
                }
            }
            if (!this.j0 && !super.onTouchEvent(motionEvent) && !this.i0) {
                return false;
            }
        }
        return true;
    }
}
