package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.xt;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t1 extends LinearLayout implements k6 {
    public boolean a;
    public final org.telegram.ui.Components.t5 b;
    public final Paint c;
    public final /* synthetic */ x1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(x1 x1Var, Context context) {
        super(context);
        this.d = x1Var;
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5();
        t5Var.f = 0L;
        t5Var.g = 200L;
        t5Var.h = gr.f;
        t5Var.a = this;
        t5Var.d = 0.0f;
        t5Var.c = 0.0f;
        t5Var.e = false;
        this.b = t5Var;
        this.c = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x1 x1Var = this.d;
        Drawable drawable = x1Var.B0;
        if (x1Var.k0 && !x1Var.V0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = x1Var.V;
            if (view == null || !x1Var.l0) {
                drawable.draw(canvas);
            } else {
                int bottom = view.getBottom();
                canvas.save();
                canvas.clipRect(0, bottom, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float L;
        x1 x1Var = this.d;
        if (x1Var.V0) {
            if (x1Var.f0 != 3 || x1Var.r == null) {
                L = org.telegram.messenger.i0.L(20.0f);
                org.telegram.messenger.i0.P.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                L = org.telegram.messenger.i0.L(18.0f);
                float scaleX = x1Var.r.getScaleX() * x1Var.r.getWidth();
                float scaleY = x1Var.r.getScaleY() * x1Var.r.getHeight();
                org.telegram.messenger.i0.P.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float e = this.b.e(false, x1Var.H0 != null ? 1.0f : 0.0f);
            Paint paint = x1Var.H0;
            if (paint != null) {
                paint.setAlpha((int) (e * 255.0f));
                canvas.drawRoundRect(org.telegram.messenger.i0.P, L, L, x1Var.H0);
            }
            if (x1Var.I0 == null) {
                Paint paint2 = new Paint(1);
                x1Var.I0 = paint2;
                paint2.setColor(i0.b.o(-16777216, (int) (x1Var.S0 * 255.0f)));
            }
            RectF rectF = org.telegram.messenger.i0.P;
            canvas.drawRoundRect(rectF, L, L, x1Var.I0);
            int i10 = x1Var.W0;
            Paint paint3 = this.c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((x1Var.D0 - 1.0f) * e) + 1.0f) * paint3.getAlpha()));
            canvas.drawRoundRect(rectF, L, L, paint3);
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x1 x1Var = this.d;
        if (!x1Var.H) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        x1Var.q();
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.ui.ActionBar.s1] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        x1 x1Var = this.d;
        int[] iArr = x1Var.z0;
        if (x1Var.f0 == 3) {
            int measuredWidth = ((i12 - i10) - x1Var.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - x1Var.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = x1Var.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, x1Var.r.getMeasuredHeight() + measuredHeight);
        } else {
            p1 p1Var = x1Var.w;
            if (p1Var != null) {
                if (x1Var.y == null) {
                    x1Var.y = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.ActionBar.s1
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            x1 x1Var2 = t1.this.d;
                            boolean z11 = false;
                            x1.a(x1Var2, 0, x1Var2.f != null && x1Var2.w.getScrollY() > x1Var2.x.getTop());
                            if (x1Var2.v0 != null) {
                                if (x1Var2.w.getHeight() + x1Var2.w.getScrollY() < x1Var2.x.getBottom()) {
                                    z11 = true;
                                }
                            }
                            x1.a(x1Var2, 1, z11);
                            x1Var2.w.invalidate();
                        }
                    };
                    p1Var.getViewTreeObserver().addOnScrollChangedListener(x1Var.y);
                }
                x1Var.y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = x1Var.F0;
        if (matrix == null || x1Var.G0 == null) {
            return;
        }
        matrix.reset();
        x1Var.F0.postScale(8.0f, 8.0f);
        x1Var.F0.postTranslate(-iArr[0], -iArr[1]);
        x1Var.G0.setLocalMatrix(x1Var.F0);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int measuredHeight;
        int i13;
        a80 a80Var;
        float f7;
        x1 x1Var = this.d;
        int i14 = x1Var.f0;
        if (i14 == 3) {
            x1Var.r.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = x1Var.a;
        if (i15 > 0) {
            Rect rect = x1Var.C0;
            size = rect.right + i15 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int c10 = z20.c(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup = x1Var.v0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = x1Var.v0.getChildAt(i16);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(org.telegram.messenger.i0.L(z20.y(24.0f, paddingLeft, 2)));
                }
            }
            x1Var.v0.measure(makeMeasureSpec, i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) x1Var.v0.getLayoutParams();
            i12 = paddingTop - ((x1Var.v0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i12 = paddingTop;
        }
        nh.p pVar = x1Var.f;
        if (pVar != null) {
            pVar.measure(c10, i11);
        }
        FrameLayout frameLayout = x1Var.s;
        if (frameLayout != null) {
            frameLayout.measure(c10, i11);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) x1Var.s.getLayoutParams();
            i12 -= (x1Var.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = x1Var.h;
        if (textView != null) {
            textView.measure(c10, i11);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) x1Var.h.getLayoutParams();
            i12 -= (x1Var.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        ei0 ei0Var = x1Var.m0;
        if (ei0Var != null) {
            ei0Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(x1Var.a0), TLObject.FLAG_30));
            i12 -= x1Var.m0.getMeasuredHeight();
        }
        View view = x1Var.V;
        if (view != null) {
            float f10 = x1Var.Q0;
            if (f10 >= 0.0f) {
                if (f10 == 0.0f) {
                    f7 = size / 936.0f;
                    f10 = 354.0f;
                } else {
                    f7 = size;
                }
                int i17 = (int) (f7 * f10);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                x1Var.V.getLayoutParams().height = i17;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
            }
            i12 -= x1Var.V.getMeasuredHeight();
        }
        if (i14 == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) x1Var.w.getLayoutParams();
            if (x1Var.b != null) {
                layoutParams4.topMargin = (x1Var.f == null && x1Var.n.getVisibility() == 8 && x1Var.P == null) ? org.telegram.messenger.i0.L(16.0f) : 0;
                layoutParams4.bottomMargin = x1Var.v0 == null ? org.telegram.messenger.i0.L(8.0f) : 0;
            } else if (x1Var.P != null) {
                layoutParams4.topMargin = (x1Var.f == null && x1Var.n.getVisibility() == 8) ? org.telegram.messenger.i0.L(8.0f) : 0;
                layoutParams4.bottomMargin = org.telegram.messenger.i0.L(8.0f);
            } else if (x1Var.n.getVisibility() == 0) {
                layoutParams4.topMargin = x1Var.f == null ? org.telegram.messenger.i0.L(19.0f) : 0;
                layoutParams4.bottomMargin = org.telegram.messenger.i0.L(20.0f);
            }
            int i18 = i12 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            x1Var.w.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31));
            i12 = i18 - x1Var.w.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = x1Var.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(c10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) x1Var.r.getLayoutParams();
                measuredHeight = x1Var.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i13 = layoutParams5.topMargin;
            } else {
                xt xtVar = x1Var.n;
                if (xtVar != null) {
                    xtVar.measure(c10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                    if (x1Var.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) x1Var.n.getLayoutParams();
                        measuredHeight = x1Var.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i13 = layoutParams6.topMargin;
                    }
                }
                a80Var = x1Var.w0;
                if (a80Var != null) {
                    a80Var.measure(c10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) x1Var.w0.getLayoutParams();
                    int measuredHeight2 = i12 - ((x1Var.w0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    x1Var.x0.measure(c10, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) x1Var.x0.getLayoutParams();
                    i12 = measuredHeight2 - ((x1Var.x0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i12 -= measuredHeight + i13;
            a80Var = x1Var.w0;
            if (a80Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i12))) - (x1Var.W ? org.telegram.messenger.i0.L(8.0f) : 0));
        this.a = false;
        if (x1Var.L != org.telegram.messenger.i0.q.x) {
            org.telegram.messenger.i0.g3(new lg.s(this, 19));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x1 x1Var = this.d;
        if (x1Var.H) {
            x1Var.q();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int f7;
        int f10;
        x1 x1Var = this.d;
        try {
            x1Var.s();
            int i10 = x1Var.d1;
            if (i10 >= 0 && (f10 = x1Var.f(i10)) != x1Var.W0) {
                x1Var.W0 = f10;
                Drawable drawable = x1Var.B0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(x1Var.W0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = x1Var.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    t6.C1(x1Var.W0, x1Var.r.getBackground());
                }
                t1 t1Var = x1Var.c1;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            a80 a80Var = x1Var.w0;
            if (a80Var != null) {
                a80Var.setProgressColor(x1Var.f(t6.F5));
                x1Var.w0.setBackColor(x1Var.f(t6.G5));
                x1Var.w0.invalidate();
            }
            if (x1Var.w != null && (f7 = x1Var.f(t6.A5)) != x1Var.f1) {
                x1Var.f1 = f7;
                org.telegram.messenger.i0.y3(x1Var.w, f7);
            }
            if (x1Var.i1) {
                return;
            }
            nh.p pVar = x1Var.f;
            if (pVar != null && pVar.getCurrentTextColor() == x1Var.g1) {
                nh.p pVar2 = x1Var.f;
                int f11 = x1Var.f(t6.j5);
                x1Var.g1 = f11;
                pVar2.setTextColor(f11);
            }
            xt xtVar = x1Var.n;
            if (xtVar == null || xtVar.getCurrentTextColor() != x1Var.h1) {
                return;
            }
            xt xtVar2 = x1Var.n;
            int f12 = x1Var.f(x1Var.W ? t6.y6 : t6.j5);
            x1Var.h1 = f12;
            xtVar2.setTextColor(f12);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
