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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.su;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a2 extends LinearLayout implements p6 {
    public boolean a;
    public final org.telegram.ui.Components.h6 b;
    public final Paint c;
    public final /* synthetic */ e2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Context context, e2 e2Var) {
        super(context);
        this.d = e2Var;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6();
        h6Var.f = 0L;
        h6Var.g = 200L;
        h6Var.h = ds.f;
        h6Var.a = this;
        h6Var.d = 0.0f;
        h6Var.c = 0.0f;
        h6Var.e = false;
        this.b = h6Var;
        this.c = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e2 e2Var = this.d;
        Drawable drawable = e2Var.B0;
        if (e2Var.k0 && !e2Var.V0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = e2Var.V;
            if (view == null || !e2Var.l0) {
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
        float dp;
        e2 e2Var = this.d;
        if (e2Var.V0) {
            if (e2Var.f0 != 3 || e2Var.r == null) {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = e2Var.r.getScaleX() * e2Var.r.getWidth();
                float scaleY = e2Var.r.getScaleY() * e2Var.r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float d = this.b.d(e2Var.H0 != null ? 1.0f : 0.0f, false);
            Paint paint = e2Var.H0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, e2Var.H0);
            }
            if (e2Var.I0 == null) {
                Paint paint2 = new Paint(1);
                e2Var.I0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (e2Var.S0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, e2Var.I0);
            int i10 = e2Var.W0;
            Paint paint3 = this.c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((e2Var.D0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
            canvas.drawRoundRect(rectF, dp, dp, paint3);
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e2 e2Var = this.d;
        if (!e2Var.H) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        e2Var.q();
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.ui.ActionBar.z1] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e2 e2Var = this.d;
        int[] iArr = e2Var.z0;
        if (e2Var.f0 == 3) {
            int measuredWidth = ((i12 - i10) - e2Var.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - e2Var.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = e2Var.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, e2Var.r.getMeasuredHeight() + measuredHeight);
        } else {
            w1 w1Var = e2Var.v;
            if (w1Var != null) {
                if (e2Var.x == null) {
                    e2Var.x = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.ActionBar.z1
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            e2 e2Var2 = a2.this.d;
                            boolean z11 = false;
                            e2.a(e2Var2, 0, e2Var2.f != null && e2Var2.v.getScrollY() > e2Var2.w.getTop());
                            if (e2Var2.v0 != null) {
                                if (e2Var2.v.getHeight() + e2Var2.v.getScrollY() < e2Var2.w.getBottom()) {
                                    z11 = true;
                                }
                            }
                            e2.a(e2Var2, 1, z11);
                            e2Var2.v.invalidate();
                        }
                    };
                    w1Var.getViewTreeObserver().addOnScrollChangedListener(e2Var.x);
                }
                e2Var.x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = e2Var.F0;
        if (matrix == null || e2Var.G0 == null) {
            return;
        }
        matrix.reset();
        e2Var.F0.postScale(8.0f, 8.0f);
        e2Var.F0.postTranslate(-iArr[0], -iArr[1]);
        e2Var.G0.setLocalMatrix(e2Var.F0);
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
        j90 j90Var;
        float f7;
        e2 e2Var = this.d;
        int i14 = e2Var.f0;
        if (i14 == 3) {
            e2Var.r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = e2Var.a;
        if (i15 > 0) {
            Rect rect = e2Var.C0;
            size = rect.right + i15 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int x9 = wh.x(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup = e2Var.v0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = e2Var.v0.getChildAt(i16);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(AndroidUtilities.dp(wh.B(24.0f, paddingLeft, 2)));
                }
            }
            e2Var.v0.measure(makeMeasureSpec, i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) e2Var.v0.getLayoutParams();
            i12 = paddingTop - ((e2Var.v0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i12 = paddingTop;
        }
        xh.n nVar = e2Var.f;
        if (nVar != null) {
            nVar.measure(x9, i11);
        }
        FrameLayout frameLayout = e2Var.s;
        if (frameLayout != null) {
            frameLayout.measure(x9, i11);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) e2Var.s.getLayoutParams();
            i12 -= (e2Var.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = e2Var.h;
        if (textView != null) {
            textView.measure(x9, i11);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) e2Var.h.getLayoutParams();
            i12 -= (e2Var.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        bk0 bk0Var = e2Var.m0;
        if (bk0Var != null) {
            bk0Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(e2Var.a0), TLObject.FLAG_30));
            i12 -= e2Var.m0.getMeasuredHeight();
        }
        View view = e2Var.V;
        if (view != null) {
            float f10 = e2Var.Q0;
            if (f10 >= 0.0f) {
                if (f10 == 0.0f) {
                    f7 = size / 936.0f;
                    f10 = 354.0f;
                } else {
                    f7 = size;
                }
                int i17 = (int) (f7 * f10);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                e2Var.V.getLayoutParams().height = i17;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
            }
            i12 -= e2Var.V.getMeasuredHeight();
        }
        if (i14 == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) e2Var.v.getLayoutParams();
            if (e2Var.b != null) {
                layoutParams4.topMargin = (e2Var.f == null && e2Var.n.getVisibility() == 8 && e2Var.P == null) ? AndroidUtilities.dp(16.0f) : 0;
                layoutParams4.bottomMargin = e2Var.v0 == null ? AndroidUtilities.dp(8.0f) : 0;
            } else if (e2Var.P != null) {
                layoutParams4.topMargin = (e2Var.f == null && e2Var.n.getVisibility() == 8) ? AndroidUtilities.dp(8.0f) : 0;
                layoutParams4.bottomMargin = AndroidUtilities.dp(8.0f);
            } else if (e2Var.n.getVisibility() == 0) {
                layoutParams4.topMargin = e2Var.f == null ? AndroidUtilities.dp(19.0f) : 0;
                layoutParams4.bottomMargin = AndroidUtilities.dp(20.0f);
            }
            int i18 = i12 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            e2Var.v.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31));
            i12 = i18 - e2Var.v.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = e2Var.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(x9, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) e2Var.r.getLayoutParams();
                measuredHeight = e2Var.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i13 = layoutParams5.topMargin;
            } else {
                su suVar = e2Var.n;
                if (suVar != null) {
                    suVar.measure(x9, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                    if (e2Var.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) e2Var.n.getLayoutParams();
                        measuredHeight = e2Var.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i13 = layoutParams6.topMargin;
                    }
                }
                j90Var = e2Var.w0;
                if (j90Var != null) {
                    j90Var.measure(x9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) e2Var.w0.getLayoutParams();
                    int measuredHeight2 = i12 - ((e2Var.w0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    e2Var.x0.measure(x9, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) e2Var.x0.getLayoutParams();
                    i12 = measuredHeight2 - ((e2Var.x0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i12 -= measuredHeight + i13;
            j90Var = e2Var.w0;
            if (j90Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i12))) - (e2Var.W ? AndroidUtilities.dp(8.0f) : 0));
        this.a = false;
        if (e2Var.L != AndroidUtilities.displaySize.x) {
            AndroidUtilities.runOnUIThread(new q(this, 6));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e2 e2Var = this.d;
        if (e2Var.H) {
            e2Var.q();
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int f7;
        int f10;
        e2 e2Var = this.d;
        try {
            e2Var.s();
            int i10 = e2Var.d1;
            if (i10 >= 0 && (f10 = e2Var.f(i10)) != e2Var.W0) {
                e2Var.W0 = f10;
                Drawable drawable = e2Var.B0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(e2Var.W0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = e2Var.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    y6.z1(e2Var.W0, e2Var.r.getBackground());
                }
                a2 a2Var = e2Var.c1;
                if (a2Var != null) {
                    a2Var.invalidate();
                }
            }
            j90 j90Var = e2Var.w0;
            if (j90Var != null) {
                j90Var.setProgressColor(e2Var.f(y6.F5));
                e2Var.w0.setBackColor(e2Var.f(y6.G5));
                e2Var.w0.invalidate();
            }
            if (e2Var.v != null && (f7 = e2Var.f(y6.A5)) != e2Var.f1) {
                e2Var.f1 = f7;
                AndroidUtilities.setScrollViewEdgeEffectColor(e2Var.v, f7);
            }
            if (e2Var.i1) {
                return;
            }
            xh.n nVar = e2Var.f;
            if (nVar != null && nVar.getCurrentTextColor() == e2Var.g1) {
                xh.n nVar2 = e2Var.f;
                int f11 = e2Var.f(y6.j5);
                e2Var.g1 = f11;
                nVar2.setTextColor(f11);
            }
            su suVar = e2Var.n;
            if (suVar == null || suVar.getCurrentTextColor() != e2Var.h1) {
                return;
            }
            su suVar2 = e2Var.n;
            int f12 = e2Var.f(e2Var.W ? y6.y6 : y6.j5);
            e2Var.h1 = f12;
            suVar2.setTextColor(f12);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
