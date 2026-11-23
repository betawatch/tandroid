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
import org.telegram.messenger.a8;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class p1 extends LinearLayout implements b6 {
    public boolean a;
    public final org.telegram.ui.Components.d6 b;
    public final Paint c;
    public final /* synthetic */ t1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(t1 t1Var, Context context) {
        super(context);
        this.d = t1Var;
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6();
        d6Var.f = 0L;
        d6Var.g = 200L;
        d6Var.h = nr.f;
        d6Var.a = this;
        d6Var.d = 0.0f;
        d6Var.c = 0.0f;
        d6Var.e = false;
        this.b = d6Var;
        this.c = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.d.getClass();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float L;
        t1 t1Var = this.d;
        if (t1Var.U0) {
            if (t1Var.g0 != 3 || t1Var.r == null) {
                L = org.telegram.messenger.g0.L(20.0f);
                org.telegram.messenger.g0.P.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                L = org.telegram.messenger.g0.L(18.0f);
                float scaleX = t1Var.r.getScaleX() * t1Var.r.getWidth();
                float scaleY = t1Var.r.getScaleY() * t1Var.r.getHeight();
                org.telegram.messenger.g0.P.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float e10 = this.b.e(false, t1Var.G0 != null ? 1.0f : 0.0f);
            Paint paint = t1Var.G0;
            if (paint != null) {
                paint.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(org.telegram.messenger.g0.P, L, L, t1Var.G0);
            }
            if (t1Var.H0 == null) {
                Paint paint2 = new Paint(1);
                t1Var.H0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (t1Var.R0 * 255.0f)));
            }
            RectF rectF = org.telegram.messenger.g0.P;
            canvas.drawRoundRect(rectF, L, L, t1Var.H0);
            int i7 = t1Var.V0;
            Paint paint3 = this.c;
            paint3.setColor(i7);
            paint3.setAlpha((int) ((((t1Var.C0 - 1.0f) * e10) + 1.0f) * paint3.getAlpha()));
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
        t1 t1Var = this.d;
        if (!t1Var.I) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        t1Var.q();
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.ui.ActionBar.o1] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        t1 t1Var = this.d;
        int[] iArr = t1Var.y0;
        if (t1Var.g0 == 3) {
            int measuredWidth = ((i11 - i7) - t1Var.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i12 - i10) - t1Var.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = t1Var.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, t1Var.r.getMeasuredHeight() + measuredHeight);
        } else {
            l1 l1Var = t1Var.w;
            if (l1Var != null) {
                if (t1Var.y == null) {
                    t1Var.y = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.ActionBar.o1
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            t1 t1Var2 = p1.this.d;
                            boolean z11 = false;
                            t1.a(t1Var2, 0, t1Var2.f != null && t1Var2.w.getScrollY() > t1Var2.x.getTop());
                            if (t1Var2.u0 != null) {
                                if (t1Var2.w.getHeight() + t1Var2.w.getScrollY() < t1Var2.x.getBottom()) {
                                    z11 = true;
                                }
                            }
                            t1.a(t1Var2, 1, z11);
                            t1Var2.w.invalidate();
                        }
                    };
                    l1Var.getViewTreeObserver().addOnScrollChangedListener(t1Var.y);
                }
                t1Var.y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = t1Var.E0;
        if (matrix == null || t1Var.F0 == null) {
            return;
        }
        matrix.reset();
        t1Var.E0.postScale(8.0f, 8.0f);
        t1Var.E0.postTranslate(-iArr[0], -iArr[1]);
        t1Var.F0.setLocalMatrix(t1Var.E0);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int i11;
        int measuredHeight;
        int i12;
        x70 x70Var;
        float f10;
        t1 t1Var = this.d;
        int i13 = t1Var.g0;
        if (i13 == 3) {
            t1Var.r.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = t1Var.a;
        if (i14 > 0) {
            Rect rect = t1Var.B0;
            size = rect.right + i14 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int c10 = o10.c(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup = t1Var.u0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = t1Var.u0.getChildAt(i15);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(org.telegram.messenger.g0.L(o10.z(24.0f, paddingLeft, 2)));
                }
            }
            t1Var.u0.measure(makeMeasureSpec, i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t1Var.u0.getLayoutParams();
            i11 = paddingTop - ((t1Var.u0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i11 = paddingTop;
        }
        xh.l lVar = t1Var.f;
        if (lVar != null) {
            lVar.measure(c10, i10);
        }
        FrameLayout frameLayout = t1Var.s;
        if (frameLayout != null) {
            frameLayout.measure(c10, i10);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) t1Var.s.getLayoutParams();
            i11 -= (t1Var.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = t1Var.h;
        if (textView != null) {
            textView.measure(c10, i10);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) t1Var.h.getLayoutParams();
            i11 -= (t1Var.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        rh0 rh0Var = t1Var.l0;
        if (rh0Var != null) {
            rh0Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(t1Var.b0), TLObject.FLAG_30));
            i11 -= t1Var.l0.getMeasuredHeight();
        }
        View view = t1Var.W;
        if (view != null) {
            float f11 = t1Var.P0;
            if (f11 >= 0.0f) {
                if (f11 == 0.0f) {
                    f10 = size / 936.0f;
                    f11 = 354.0f;
                } else {
                    f10 = size;
                }
                int i16 = (int) (f10 * f11);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30));
                t1Var.W.getLayoutParams().height = i16;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
            }
            i11 -= t1Var.W.getMeasuredHeight();
        }
        if (i13 == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) t1Var.w.getLayoutParams();
            if (t1Var.b != null) {
                layoutParams4.topMargin = (t1Var.f == null && t1Var.n.getVisibility() == 8 && t1Var.Q == null) ? org.telegram.messenger.g0.L(16.0f) : 0;
                layoutParams4.bottomMargin = t1Var.u0 == null ? org.telegram.messenger.g0.L(8.0f) : 0;
            } else if (t1Var.Q != null) {
                layoutParams4.topMargin = (t1Var.f == null && t1Var.n.getVisibility() == 8) ? org.telegram.messenger.g0.L(8.0f) : 0;
                layoutParams4.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            } else if (t1Var.n.getVisibility() == 0) {
                layoutParams4.topMargin = t1Var.f == null ? org.telegram.messenger.g0.L(19.0f) : 0;
                layoutParams4.bottomMargin = org.telegram.messenger.g0.L(20.0f);
            }
            int i17 = i11 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            t1Var.w.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
            i11 = i17 - t1Var.w.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = t1Var.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(c10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) t1Var.r.getLayoutParams();
                measuredHeight = t1Var.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i12 = layoutParams5.topMargin;
            } else {
                zt ztVar = t1Var.n;
                if (ztVar != null) {
                    ztVar.measure(c10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                    if (t1Var.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) t1Var.n.getLayoutParams();
                        measuredHeight = t1Var.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i12 = layoutParams6.topMargin;
                    }
                }
                x70Var = t1Var.v0;
                if (x70Var != null) {
                    x70Var.measure(c10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) t1Var.v0.getLayoutParams();
                    int measuredHeight2 = i11 - ((t1Var.v0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    t1Var.w0.measure(c10, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) t1Var.w0.getLayoutParams();
                    i11 = measuredHeight2 - ((t1Var.w0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i11 -= measuredHeight + i12;
            x70Var = t1Var.v0;
            if (x70Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i11))) - (t1Var.X ? org.telegram.messenger.g0.L(8.0f) : 0));
        this.a = false;
        if (t1Var.M != org.telegram.messenger.g0.q.x) {
            org.telegram.messenger.g0.g3(new oi.c2(this, 6));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t1 t1Var = this.d;
        if (t1Var.I) {
            t1Var.q();
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int f10;
        int f11;
        t1 t1Var = this.d;
        try {
            t1Var.s();
            int i7 = t1Var.c1;
            if (i7 >= 0 && (f11 = t1Var.f(i7)) != t1Var.V0) {
                t1Var.V0 = f11;
                Drawable drawable = t1Var.A0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(t1Var.V0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = t1Var.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    m6.C1(t1Var.V0, t1Var.r.getBackground());
                }
                p1 p1Var = t1Var.b1;
                if (p1Var != null) {
                    p1Var.invalidate();
                }
            }
            x70 x70Var = t1Var.v0;
            if (x70Var != null) {
                x70Var.setProgressColor(t1Var.f(m6.F5));
                t1Var.v0.setBackColor(t1Var.f(m6.G5));
                t1Var.v0.invalidate();
            }
            if (t1Var.w != null && (f10 = t1Var.f(m6.A5)) != t1Var.e1) {
                t1Var.e1 = f10;
                org.telegram.messenger.g0.x3(t1Var.w, f10);
            }
            if (t1Var.h1) {
                return;
            }
            xh.l lVar = t1Var.f;
            if (lVar != null && lVar.getCurrentTextColor() == t1Var.f1) {
                xh.l lVar2 = t1Var.f;
                int f12 = t1Var.f(m6.j5);
                t1Var.f1 = f12;
                lVar2.setTextColor(f12);
            }
            zt ztVar = t1Var.n;
            if (ztVar == null || ztVar.getCurrentTextColor() != t1Var.g1) {
                return;
            }
            zt ztVar2 = t1Var.n;
            int f13 = t1Var.f(t1Var.X ? m6.y6 : m6.j5);
            t1Var.g1 = f13;
            ztVar2.setTextColor(f13);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
