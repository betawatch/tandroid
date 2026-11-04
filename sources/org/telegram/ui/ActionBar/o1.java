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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o1 extends LinearLayout implements z5 {
    public boolean a;
    public final org.telegram.ui.Components.u5 b;
    public final Paint c;
    public final /* synthetic */ s1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(s1 s1Var, Context context) {
        super(context);
        this.d = s1Var;
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5();
        u5Var.f = 0L;
        u5Var.g = 200L;
        u5Var.h = xq.f;
        u5Var.a = this;
        u5Var.d = 0.0f;
        u5Var.c = 0.0f;
        u5Var.e = false;
        this.b = u5Var;
        this.c = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s1 s1Var = this.d;
        Drawable drawable = s1Var.C0;
        if (s1Var.l0 && !s1Var.W0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = s1Var.W;
            if (view == null || !s1Var.m0) {
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
        s1 s1Var = this.d;
        if (s1Var.W0) {
            if (s1Var.g0 != 3 || s1Var.r == null) {
                L = org.telegram.messenger.g0.L(20.0f);
                org.telegram.messenger.g0.P.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                L = org.telegram.messenger.g0.L(18.0f);
                float scaleX = s1Var.r.getScaleX() * s1Var.r.getWidth();
                float scaleY = s1Var.r.getScaleY() * s1Var.r.getHeight();
                org.telegram.messenger.g0.P.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float e10 = this.b.e(false, s1Var.I0 != null ? 1.0f : 0.0f);
            Paint paint = s1Var.I0;
            if (paint != null) {
                paint.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(org.telegram.messenger.g0.P, L, L, s1Var.I0);
            }
            if (s1Var.J0 == null) {
                Paint paint2 = new Paint(1);
                s1Var.J0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (s1Var.T0 * 255.0f)));
            }
            RectF rectF = org.telegram.messenger.g0.P;
            canvas.drawRoundRect(rectF, L, L, s1Var.J0);
            int i3 = s1Var.X0;
            Paint paint3 = this.c;
            paint3.setColor(i3);
            paint3.setAlpha((int) ((((s1Var.E0 - 1.0f) * e10) + 1.0f) * paint3.getAlpha()));
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
        s1 s1Var = this.d;
        if (!s1Var.I) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        s1Var.q();
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.ui.ActionBar.n1] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        s1 s1Var = this.d;
        int[] iArr = s1Var.A0;
        if (s1Var.g0 == 3) {
            int measuredWidth = ((i11 - i3) - s1Var.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i12 - i10) - s1Var.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = s1Var.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, s1Var.r.getMeasuredHeight() + measuredHeight);
        } else {
            k1 k1Var = s1Var.w;
            if (k1Var != null) {
                if (s1Var.y == null) {
                    s1Var.y = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.ActionBar.n1
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            s1 s1Var2 = o1.this.d;
                            boolean z11 = false;
                            s1.a(s1Var2, 0, s1Var2.f != null && s1Var2.w.getScrollY() > s1Var2.x.getTop());
                            if (s1Var2.w0 != null) {
                                if (s1Var2.w.getHeight() + s1Var2.w.getScrollY() < s1Var2.x.getBottom()) {
                                    z11 = true;
                                }
                            }
                            s1.a(s1Var2, 1, z11);
                            s1Var2.w.invalidate();
                        }
                    };
                    k1Var.getViewTreeObserver().addOnScrollChangedListener(s1Var.y);
                }
                s1Var.y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = s1Var.G0;
        if (matrix == null || s1Var.H0 == null) {
            return;
        }
        matrix.reset();
        s1Var.G0.postScale(8.0f, 8.0f);
        s1Var.G0.postTranslate(-iArr[0], -iArr[1]);
        s1Var.H0.setLocalMatrix(s1Var.G0);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        int i11;
        int measuredHeight;
        int i12;
        d70 d70Var;
        float f10;
        s1 s1Var = this.d;
        int i13 = s1Var.g0;
        if (i13 == 3) {
            s1Var.r.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = s1Var.a;
        if (i14 > 0) {
            Rect rect = s1Var.D0;
            size = rect.right + i14 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int c2 = org.telegram.messenger.camera.q.c(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup = s1Var.w0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = s1Var.w0.getChildAt(i15);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(org.telegram.messenger.g0.L(org.telegram.messenger.camera.q.y(24.0f, paddingLeft, 2)));
                }
            }
            s1Var.w0.measure(makeMeasureSpec, i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) s1Var.w0.getLayoutParams();
            i11 = paddingTop - ((s1Var.w0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i11 = paddingTop;
        }
        yh.l lVar = s1Var.f;
        if (lVar != null) {
            lVar.measure(c2, i10);
        }
        FrameLayout frameLayout = s1Var.s;
        if (frameLayout != null) {
            frameLayout.measure(c2, i10);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) s1Var.s.getLayoutParams();
            i11 -= (s1Var.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = s1Var.h;
        if (textView != null) {
            textView.measure(c2, i10);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) s1Var.h.getLayoutParams();
            i11 -= (s1Var.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        fh0 fh0Var = s1Var.n0;
        if (fh0Var != null) {
            fh0Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(s1Var.b0), TLObject.FLAG_30));
            i11 -= s1Var.n0.getMeasuredHeight();
        }
        View view = s1Var.W;
        if (view != null) {
            float f11 = s1Var.R0;
            if (f11 >= 0.0f) {
                if (f11 == 0.0f) {
                    f10 = size / 936.0f;
                    f11 = 354.0f;
                } else {
                    f10 = size;
                }
                int i16 = (int) (f10 * f11);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30));
                s1Var.W.getLayoutParams().height = i16;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
            }
            i11 -= s1Var.W.getMeasuredHeight();
        }
        if (i13 == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) s1Var.w.getLayoutParams();
            if (s1Var.b != null) {
                layoutParams4.topMargin = (s1Var.f == null && s1Var.n.getVisibility() == 8 && s1Var.Q == null) ? org.telegram.messenger.g0.L(16.0f) : 0;
                layoutParams4.bottomMargin = s1Var.w0 == null ? org.telegram.messenger.g0.L(8.0f) : 0;
            } else if (s1Var.Q != null) {
                layoutParams4.topMargin = (s1Var.f == null && s1Var.n.getVisibility() == 8) ? org.telegram.messenger.g0.L(8.0f) : 0;
                layoutParams4.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            } else if (s1Var.n.getVisibility() == 0) {
                layoutParams4.topMargin = s1Var.f == null ? org.telegram.messenger.g0.L(19.0f) : 0;
                layoutParams4.bottomMargin = org.telegram.messenger.g0.L(20.0f);
            }
            int i17 = i11 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            s1Var.w.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
            i11 = i17 - s1Var.w.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = s1Var.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(c2, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) s1Var.r.getLayoutParams();
                measuredHeight = s1Var.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i12 = layoutParams5.topMargin;
            } else {
                kt ktVar = s1Var.n;
                if (ktVar != null) {
                    ktVar.measure(c2, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                    if (s1Var.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) s1Var.n.getLayoutParams();
                        measuredHeight = s1Var.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i12 = layoutParams6.topMargin;
                    }
                }
                d70Var = s1Var.x0;
                if (d70Var != null) {
                    d70Var.measure(c2, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) s1Var.x0.getLayoutParams();
                    int measuredHeight2 = i11 - ((s1Var.x0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    s1Var.y0.measure(c2, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) s1Var.y0.getLayoutParams();
                    i11 = measuredHeight2 - ((s1Var.y0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i11 -= measuredHeight + i12;
            d70Var = s1Var.x0;
            if (d70Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i11))) - (s1Var.X ? org.telegram.messenger.g0.L(8.0f) : 0));
        this.a = false;
        if (s1Var.M != org.telegram.messenger.g0.q.x) {
            org.telegram.messenger.g0.h3(new lg.n(this, 23));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s1 s1Var = this.d;
        if (s1Var.I) {
            s1Var.q();
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int f10;
        int f11;
        s1 s1Var = this.d;
        try {
            s1Var.s();
            int i3 = s1Var.e1;
            if (i3 >= 0 && (f11 = s1Var.f(i3)) != s1Var.X0) {
                s1Var.X0 = f11;
                Drawable drawable = s1Var.C0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(s1Var.X0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = s1Var.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    k6.C1(s1Var.X0, s1Var.r.getBackground());
                }
                o1 o1Var = s1Var.d1;
                if (o1Var != null) {
                    o1Var.invalidate();
                }
            }
            d70 d70Var = s1Var.x0;
            if (d70Var != null) {
                d70Var.setProgressColor(s1Var.f(k6.F5));
                s1Var.x0.setBackColor(s1Var.f(k6.G5));
                s1Var.x0.invalidate();
            }
            if (s1Var.w != null && (f10 = s1Var.f(k6.A5)) != s1Var.g1) {
                s1Var.g1 = f10;
                org.telegram.messenger.g0.z3(s1Var.w, f10);
            }
            if (s1Var.j1) {
                return;
            }
            yh.l lVar = s1Var.f;
            if (lVar != null && lVar.getCurrentTextColor() == s1Var.h1) {
                yh.l lVar2 = s1Var.f;
                int f12 = s1Var.f(k6.j5);
                s1Var.h1 = f12;
                lVar2.setTextColor(f12);
            }
            kt ktVar = s1Var.n;
            if (ktVar == null || ktVar.getCurrentTextColor() != s1Var.i1) {
                return;
            }
            kt ktVar2 = s1Var.n;
            int f13 = s1Var.f(s1Var.X ? k6.y6 : k6.j5);
            s1Var.i1 = f13;
            ktVar2.setTextColor(f13);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
