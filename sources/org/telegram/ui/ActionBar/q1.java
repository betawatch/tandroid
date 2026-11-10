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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q1 extends LinearLayout implements c6 {
    public boolean a;
    public final org.telegram.ui.Components.v5 b;
    public final Paint c;
    public final /* synthetic */ u1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(u1 u1Var, Context context) {
        super(context);
        this.d = u1Var;
        org.telegram.ui.Components.v5 v5Var = new org.telegram.ui.Components.v5();
        v5Var.f = 0L;
        v5Var.g = 200L;
        v5Var.h = wq.f;
        v5Var.a = this;
        v5Var.d = 0.0f;
        v5Var.c = 0.0f;
        v5Var.e = false;
        this.b = v5Var;
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
        u1 u1Var = this.d;
        if (u1Var.T0) {
            if (u1Var.f0 != 3 || u1Var.r == null) {
                L = org.telegram.messenger.g0.L(20.0f);
                org.telegram.messenger.g0.P.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                L = org.telegram.messenger.g0.L(18.0f);
                float scaleX = u1Var.r.getScaleX() * u1Var.r.getWidth();
                float scaleY = u1Var.r.getScaleY() * u1Var.r.getHeight();
                org.telegram.messenger.g0.P.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float e10 = this.b.e(false, u1Var.F0 != null ? 1.0f : 0.0f);
            Paint paint = u1Var.F0;
            if (paint != null) {
                paint.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(org.telegram.messenger.g0.P, L, L, u1Var.F0);
            }
            if (u1Var.G0 == null) {
                Paint paint2 = new Paint(1);
                u1Var.G0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (u1Var.Q0 * 255.0f)));
            }
            RectF rectF = org.telegram.messenger.g0.P;
            canvas.drawRoundRect(rectF, L, L, u1Var.G0);
            int i7 = u1Var.U0;
            Paint paint3 = this.c;
            paint3.setColor(i7);
            paint3.setAlpha((int) ((((u1Var.B0 - 1.0f) * e10) + 1.0f) * paint3.getAlpha()));
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
        u1 u1Var = this.d;
        if (!u1Var.H) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        u1Var.q();
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.ui.ActionBar.p1] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        u1 u1Var = this.d;
        int[] iArr = u1Var.x0;
        if (u1Var.f0 == 3) {
            int measuredWidth = ((i11 - i7) - u1Var.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i12 - i10) - u1Var.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = u1Var.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, u1Var.r.getMeasuredHeight() + measuredHeight);
        } else {
            m1 m1Var = u1Var.w;
            if (m1Var != null) {
                if (u1Var.y == null) {
                    u1Var.y = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.ActionBar.p1
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            u1 u1Var2 = q1.this.d;
                            boolean z10 = false;
                            u1.a(u1Var2, 0, u1Var2.f != null && u1Var2.w.getScrollY() > u1Var2.x.getTop());
                            if (u1Var2.t0 != null) {
                                if (u1Var2.w.getHeight() + u1Var2.w.getScrollY() < u1Var2.x.getBottom()) {
                                    z10 = true;
                                }
                            }
                            u1.a(u1Var2, 1, z10);
                            u1Var2.w.invalidate();
                        }
                    };
                    m1Var.getViewTreeObserver().addOnScrollChangedListener(u1Var.y);
                }
                u1Var.y.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = u1Var.D0;
        if (matrix == null || u1Var.E0 == null) {
            return;
        }
        matrix.reset();
        u1Var.D0.postScale(8.0f, 8.0f);
        u1Var.D0.postTranslate(-iArr[0], -iArr[1]);
        u1Var.E0.setLocalMatrix(u1Var.D0);
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
        h70 h70Var;
        float f10;
        u1 u1Var = this.d;
        int i13 = u1Var.f0;
        if (i13 == 3) {
            u1Var.r.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = u1Var.a;
        if (i14 > 0) {
            Rect rect = u1Var.A0;
            size = rect.right + i14 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int c10 = org.telegram.messenger.camera.q.c(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup = u1Var.t0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = u1Var.t0.getChildAt(i15);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(org.telegram.messenger.g0.L(org.telegram.messenger.camera.q.y(24.0f, paddingLeft, 2)));
                }
            }
            u1Var.t0.measure(makeMeasureSpec, i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) u1Var.t0.getLayoutParams();
            i11 = paddingTop - ((u1Var.t0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i11 = paddingTop;
        }
        xh.l lVar = u1Var.f;
        if (lVar != null) {
            lVar.measure(c10, i10);
        }
        FrameLayout frameLayout = u1Var.s;
        if (frameLayout != null) {
            frameLayout.measure(c10, i10);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) u1Var.s.getLayoutParams();
            i11 -= (u1Var.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = u1Var.h;
        if (textView != null) {
            textView.measure(c10, i10);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) u1Var.h.getLayoutParams();
            i11 -= (u1Var.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        ch0 ch0Var = u1Var.k0;
        if (ch0Var != null) {
            ch0Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(u1Var.a0), TLObject.FLAG_30));
            i11 -= u1Var.k0.getMeasuredHeight();
        }
        View view = u1Var.V;
        if (view != null) {
            float f11 = u1Var.O0;
            if (f11 >= 0.0f) {
                if (f11 == 0.0f) {
                    f10 = size / 936.0f;
                    f11 = 354.0f;
                } else {
                    f10 = size;
                }
                int i16 = (int) (f10 * f11);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30));
                u1Var.V.getLayoutParams().height = i16;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
            }
            i11 -= u1Var.V.getMeasuredHeight();
        }
        if (i13 == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) u1Var.w.getLayoutParams();
            if (u1Var.b != null) {
                layoutParams4.topMargin = (u1Var.f == null && u1Var.n.getVisibility() == 8 && u1Var.P == null) ? org.telegram.messenger.g0.L(16.0f) : 0;
                layoutParams4.bottomMargin = u1Var.t0 == null ? org.telegram.messenger.g0.L(8.0f) : 0;
            } else if (u1Var.P != null) {
                layoutParams4.topMargin = (u1Var.f == null && u1Var.n.getVisibility() == 8) ? org.telegram.messenger.g0.L(8.0f) : 0;
                layoutParams4.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            } else if (u1Var.n.getVisibility() == 0) {
                layoutParams4.topMargin = u1Var.f == null ? org.telegram.messenger.g0.L(19.0f) : 0;
                layoutParams4.bottomMargin = org.telegram.messenger.g0.L(20.0f);
            }
            int i17 = i11 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            u1Var.w.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
            i11 = i17 - u1Var.w.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = u1Var.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(c10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) u1Var.r.getLayoutParams();
                measuredHeight = u1Var.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i12 = layoutParams5.topMargin;
            } else {
                lt ltVar = u1Var.n;
                if (ltVar != null) {
                    ltVar.measure(c10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                    if (u1Var.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) u1Var.n.getLayoutParams();
                        measuredHeight = u1Var.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i12 = layoutParams6.topMargin;
                    }
                }
                h70Var = u1Var.u0;
                if (h70Var != null) {
                    h70Var.measure(c10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) u1Var.u0.getLayoutParams();
                    int measuredHeight2 = i11 - ((u1Var.u0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    u1Var.v0.measure(c10, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) u1Var.v0.getLayoutParams();
                    i11 = measuredHeight2 - ((u1Var.v0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i11 -= measuredHeight + i12;
            h70Var = u1Var.u0;
            if (h70Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i11))) - (u1Var.W ? org.telegram.messenger.g0.L(8.0f) : 0));
        this.a = false;
        if (u1Var.L != org.telegram.messenger.g0.q.x) {
            org.telegram.messenger.g0.h3(new l2.a0(this, 19));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u1 u1Var = this.d;
        if (u1Var.H) {
            u1Var.q();
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int f10;
        int f11;
        u1 u1Var = this.d;
        try {
            u1Var.s();
            int i7 = u1Var.b1;
            if (i7 >= 0 && (f11 = u1Var.f(i7)) != u1Var.U0) {
                u1Var.U0 = f11;
                Drawable drawable = u1Var.z0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(u1Var.U0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = u1Var.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    m6.C1(u1Var.U0, u1Var.r.getBackground());
                }
                q1 q1Var = u1Var.a1;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
            }
            h70 h70Var = u1Var.u0;
            if (h70Var != null) {
                h70Var.setProgressColor(u1Var.f(m6.F5));
                u1Var.u0.setBackColor(u1Var.f(m6.G5));
                u1Var.u0.invalidate();
            }
            if (u1Var.w != null && (f10 = u1Var.f(m6.A5)) != u1Var.d1) {
                u1Var.d1 = f10;
                org.telegram.messenger.g0.z3(u1Var.w, f10);
            }
            if (u1Var.g1) {
                return;
            }
            xh.l lVar = u1Var.f;
            if (lVar != null && lVar.getCurrentTextColor() == u1Var.e1) {
                xh.l lVar2 = u1Var.f;
                int f12 = u1Var.f(m6.j5);
                u1Var.e1 = f12;
                lVar2.setTextColor(f12);
            }
            lt ltVar = u1Var.n;
            if (ltVar == null || ltVar.getCurrentTextColor() != u1Var.f1) {
                return;
            }
            lt ltVar2 = u1Var.n;
            int f13 = u1Var.f(u1Var.W ? m6.y6 : m6.j5);
            u1Var.f1 = f13;
            ltVar2.setTextColor(f13);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
