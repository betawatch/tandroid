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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cb0 extends cja {
    public final zw8 m0;
    public final /* synthetic */ mb0 n0;
    public boolean o0;
    public boolean p0;
    public float q0;
    public float r0;
    public final /* synthetic */ mb0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(mb0 mb0Var, Context context) {
        super(context, null);
        this.s0 = mb0Var;
        this.n0 = mb0Var;
        this.m0 = new zw8((byte) 3);
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int save = canvas.save();
        super.dispatchDraw(canvas);
        mb0 mb0Var = this.s0;
        if (!mb0Var.V) {
            if (!mb0Var.h) {
                canvas.save();
                float x = mb0Var.a.getX() + mb0Var.r.getX();
                float y = mb0Var.a.getY() + mb0Var.r.getY();
                int i = mb0Var.d - mb0Var.c;
                float R1 = gl.R1(y, gl.m + ((a.getCurrentActionBarHeight() - mb0Var.c) >> 1), mb0Var.O);
                canvas.translate(x, R1);
                mb0Var.a.draw(canvas);
                RectF rectF = gl.P;
                float f = i / 2.0f;
                rectF.set(x, R1 - (mb0Var.F * f), mb0Var.a.getMeasuredWidth() + x, (f * mb0Var.F) + mb0Var.a.getMeasuredHeight() + R1);
                db0 db0Var = mb0Var.a;
                float f2 = x + db0Var.E;
                float f3 = R1 + db0Var.F;
                ra1 ra1Var = mb0Var.L;
                float f4 = db0Var.y;
                ra1Var.getClass();
                rectF.set((int) (f2 - f4), (int) (f3 - f4), (int) (f2 + f4), (int) (f3 + f4));
                ra1Var.i = false;
                ra1Var.c = 0;
                ra1Var.a(rectF);
                canvas.restore();
            }
            canvas.restoreToCount(save);
            float alpha = (1.0f - (mb0Var.e.getVisibility() == 0 ? mb0Var.e.getAlpha() : 0.0f)) * mb0Var.a.s.c;
            a aVar = mb0Var.I;
            if (alpha != 0.0f) {
                aVar.setVisibility(0);
                int save2 = canvas.save();
                canvas.translate(mb0Var.I.getX(), mb0Var.I.getY());
                if (alpha != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, mb0Var.I.getMeasuredWidth(), mb0Var.I.getMeasuredHeight(), (int) (alpha * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                mb0Var.I.draw(canvas2);
                canvas2.restoreToCount(save2);
            } else {
                aVar.setVisibility(8);
            }
        }
        if (mb0Var.f) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        Canvas canvas2;
        mb0 mb0Var = this.s0;
        Paint paint = mb0Var.P;
        if (view == mb0Var.I) {
            return true;
        }
        aVar = ((d) mb0Var).actionBar;
        if (view != aVar || mb0Var.O <= 0.0f) {
            canvas2 = canvas;
        } else {
            paint.setColor(bkb.w0(null, bkb.c6, false));
            paint.setAlpha((int) (mb0Var.O * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), paint);
            ((ActionBarLayout) mb0Var.getParentLayout()).n(canvas2, (int) (mb0Var.O * 255.0f), view.getMeasuredHeight());
        }
        return super.drawChild(canvas2, view, j);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.m0.b();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s0.O == 0.0f) {
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
        mb0 mb0Var = this.s0;
        float f = 0.0f;
        if (z != mb0Var.V) {
            mb0Var.V = z;
            gl.B2(mb0Var.a);
            gl.U2(mb0Var.getParentActivity(), mb0Var.getClassGuid());
            if (mb0Var.V) {
                mb0Var.m0(false, 0.0f);
                mb0Var.a.setExpanded(false);
                addView(mb0Var.a, 0, nme.c(-1.0f, -1));
            } else {
                mb0Var.r.addView(mb0Var.a, 0, nme.c(-2.0f, -1));
            }
            gl.V2(mb0Var.getParentActivity(), mb0Var.getClassGuid());
        }
        if (mb0Var.V) {
            int size = (int) (View.MeasureSpec.getSize(i) * 0.55f);
            ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).leftMargin = (int) (View.MeasureSpec.getSize(i) * 0.45f);
            ((ViewGroup.MarginLayoutParams) mb0Var.a.getLayoutParams()).rightMargin = size;
            ((ViewGroup.MarginLayoutParams) mb0Var.y.getLayoutParams()).rightMargin = gl.L(16.0f) + size;
            ((ViewGroup.MarginLayoutParams) mb0Var.X.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) mb0Var.W.getLayoutParams()).topMargin = gl.L(10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).bottomMargin = gl.L(64.0f);
            ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) mb0Var.a.getLayoutParams()).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) mb0Var.y.getLayoutParams()).rightMargin = gl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) mb0Var.X.getLayoutParams()).topMargin = gl.L(10.0f);
            ((ViewGroup.MarginLayoutParams) mb0Var.W.getLayoutParams()).topMargin = gl.L(18.0f);
        }
        boolean z2 = mb0Var.M;
        boolean z3 = this.f >= gl.L(20.0f);
        mb0Var.M = z3;
        if (z2 != z3) {
            super.onMeasure(i, i2);
            if (mb0Var.M) {
                int i4 = -mb0Var.b.getTop();
                aVar = ((d) mb0Var).actionBar;
                i3 = gl.L(8.0f) + aVar.getMeasuredHeight() + i4;
            } else {
                i3 = 0;
            }
            pkb pkbVar = mb0Var.r;
            pkbVar.setTranslationY((pkbVar.getTranslationY() + ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).topMargin) - i3);
            ((ViewGroup.MarginLayoutParams) mb0Var.r.getLayoutParams()).topMargin = i3;
            boolean z4 = mb0Var.M;
            if (!mb0Var.V) {
                mb0Var.N = ValueAnimator.ofFloat(mb0Var.O, z4 ? 1.0f : 0.0f);
                float f2 = ((mb0Var.d - mb0Var.c) - gl.m) * mb0Var.F;
                if (z4) {
                    mb0Var.a.setExpanded(false);
                    f2 = mb0Var.r.getTranslationY();
                } else {
                    f = mb0Var.r.getTranslationY();
                }
                if (!mb0Var.G || z4) {
                    mb0Var.G = false;
                } else {
                    mb0Var.a.setExpanded(true);
                }
                mb0Var.N.addUpdateListener(new gb0(mb0Var, f2, f, z4));
                mb0Var.N.addListener(new za0(mb0Var, (byte) 1));
                mb0Var.N.setDuration(250L);
                mb0Var.N.setInterpolator(gb.w);
                mb0Var.N.start();
            }
        }
        super.onMeasure(i, i2);
        mb0Var.c = mb0Var.a.getMeasuredHeight();
        mb0Var.d = mb0Var.a.getMeasuredWidth();
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
        mb0 mb0Var = this.n0;
        if (mb0Var.O > 0.0f || mb0Var.V || i2 <= 0 || mb0Var.F <= 0.0f) {
            return;
        }
        mb0Var.g0();
        mb0Var.m0(true, Utilities.i(mb0Var.F - (i2 / mb0Var.d), 1.0f, 0.0f));
        iArr[1] = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mb0 mb0Var = this.n0;
        if (mb0Var.O > 0.0f || mb0Var.V || i4 == 0) {
            return;
        }
        mb0Var.g0();
        mb0Var.m0(true, Utilities.i(mb0Var.F - (i4 / mb0Var.d), 1.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.m0.b = i;
        this.n0.g0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        mb0 mb0Var = this.n0;
        return mb0Var.O <= 0.0f && !mb0Var.V;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.m0.b = 0;
        mb0 mb0Var = this.n0;
        mb0Var.k0(mb0Var.F > 0.5f, false, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        mb0 mb0Var = this.s0;
        if (!mb0Var.L.b(motionEvent)) {
            if (!mb0Var.V) {
                if (motionEvent.getAction() == 0) {
                    fb0 fb0Var = mb0Var.b;
                    Rect rect = gl.Q;
                    fb0Var.getHitRect(rect);
                    rect.offset(0, (int) mb0Var.r.getY());
                    if (mb0Var.O == 0.0f && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.o0 = true;
                        motionEvent.getX();
                        this.r0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 2 && ((z = this.o0) || this.p0)) {
                    float f = this.r0;
                    if (!z) {
                        mb0Var.m0(true, Utilities.i(((-(f - motionEvent.getY())) / mb0Var.d) + this.q0, 1.0f, 0.0f));
                    } else if (Math.abs(f - motionEvent.getY()) > gl.e) {
                        this.o0 = false;
                        this.p0 = true;
                        this.q0 = mb0Var.F;
                        motionEvent.getX();
                        this.r0 = motionEvent.getY();
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.p0) {
                        mb0Var.k0(mb0Var.F > 0.5f, false, false);
                    }
                    this.o0 = false;
                    this.p0 = false;
                }
            }
            if (!this.p0 && !super.onTouchEvent(motionEvent) && !this.o0) {
                return false;
            }
        }
        return true;
    }
}
