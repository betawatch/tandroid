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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ru;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class y1 extends LinearLayout implements b6 {
    public boolean a;
    public final org.telegram.ui.Components.f6 b;
    public final Paint c;
    public final /* synthetic */ c2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Context context, c2 c2Var) {
        super(context);
        this.d = c2Var;
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6();
        f6Var.f = 0L;
        f6Var.g = 200L;
        f6Var.h = bs.f;
        f6Var.a = this;
        f6Var.d = 0.0f;
        f6Var.c = 0.0f;
        f6Var.e = false;
        this.b = f6Var;
        this.c = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c2 c2Var = this.d;
        Drawable drawable = c2Var.B0;
        if (c2Var.k0 && !c2Var.V0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = c2Var.V;
            if (view == null || !c2Var.l0) {
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
        c2 c2Var = this.d;
        if (c2Var.V0) {
            if (c2Var.f0 != 3 || c2Var.r == null) {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = c2Var.r.getScaleX() * c2Var.r.getWidth();
                float scaleY = c2Var.r.getScaleY() * c2Var.r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float d = this.b.d(c2Var.H0 != null ? 1.0f : 0.0f, false);
            Paint paint = c2Var.H0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, c2Var.H0);
            }
            if (c2Var.I0 == null) {
                Paint paint2 = new Paint(1);
                c2Var.I0 = paint2;
                paint2.setColor(i0.a.o(-16777216, (int) (c2Var.S0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, c2Var.I0);
            int i10 = c2Var.W0;
            Paint paint3 = this.c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((c2Var.D0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
        c2 c2Var = this.d;
        if (!c2Var.H) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        c2Var.q();
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.ui.ActionBar.x1] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c2 c2Var = this.d;
        int[] iArr = c2Var.z0;
        if (c2Var.f0 == 3) {
            int measuredWidth = ((i12 - i10) - c2Var.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - c2Var.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = c2Var.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, c2Var.r.getMeasuredHeight() + measuredHeight);
        } else {
            u1 u1Var = c2Var.v;
            if (u1Var != null) {
                if (c2Var.x == null) {
                    c2Var.x = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.ActionBar.x1
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            c2 c2Var2 = y1.this.d;
                            boolean z11 = false;
                            c2.a(c2Var2, 0, c2Var2.f != null && c2Var2.v.getScrollY() > c2Var2.w.getTop());
                            if (c2Var2.v0 != null) {
                                if (c2Var2.v.getHeight() + c2Var2.v.getScrollY() < c2Var2.w.getBottom()) {
                                    z11 = true;
                                }
                            }
                            c2.a(c2Var2, 1, z11);
                            c2Var2.v.invalidate();
                        }
                    };
                    u1Var.getViewTreeObserver().addOnScrollChangedListener(c2Var.x);
                }
                c2Var.x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = c2Var.F0;
        if (matrix == null || c2Var.G0 == null) {
            return;
        }
        matrix.reset();
        c2Var.F0.postScale(8.0f, 8.0f);
        c2Var.F0.postTranslate(-iArr[0], -iArr[1]);
        c2Var.G0.setLocalMatrix(c2Var.F0);
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
        h90 h90Var;
        float f7;
        c2 c2Var = this.d;
        int i14 = c2Var.f0;
        if (i14 == 3) {
            c2Var.r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = c2Var.a;
        if (i15 > 0) {
            Rect rect = c2Var.C0;
            size = rect.right + i15 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int c10 = sl.c(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup = c2Var.v0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = c2Var.v0.getChildAt(i16);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(AndroidUtilities.dp(sl.A(24.0f, paddingLeft, 2)));
                }
            }
            c2Var.v0.measure(makeMeasureSpec, i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c2Var.v0.getLayoutParams();
            i12 = paddingTop - ((c2Var.v0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i12 = paddingTop;
        }
        wh.n nVar = c2Var.f;
        if (nVar != null) {
            nVar.measure(c10, i11);
        }
        FrameLayout frameLayout = c2Var.s;
        if (frameLayout != null) {
            frameLayout.measure(c10, i11);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) c2Var.s.getLayoutParams();
            i12 -= (c2Var.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = c2Var.h;
        if (textView != null) {
            textView.measure(c10, i11);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c2Var.h.getLayoutParams();
            i12 -= (c2Var.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        bk0 bk0Var = c2Var.m0;
        if (bk0Var != null) {
            bk0Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(c2Var.a0), TLObject.FLAG_30));
            i12 -= c2Var.m0.getMeasuredHeight();
        }
        View view = c2Var.V;
        if (view != null) {
            float f10 = c2Var.Q0;
            if (f10 >= 0.0f) {
                if (f10 == 0.0f) {
                    f7 = size / 936.0f;
                    f10 = 354.0f;
                } else {
                    f7 = size;
                }
                int i17 = (int) (f7 * f10);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                c2Var.V.getLayoutParams().height = i17;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
            }
            i12 -= c2Var.V.getMeasuredHeight();
        }
        if (i14 == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) c2Var.v.getLayoutParams();
            if (c2Var.b != null) {
                layoutParams4.topMargin = (c2Var.f == null && c2Var.n.getVisibility() == 8 && c2Var.P == null) ? AndroidUtilities.dp(16.0f) : 0;
                layoutParams4.bottomMargin = c2Var.v0 == null ? AndroidUtilities.dp(8.0f) : 0;
            } else if (c2Var.P != null) {
                layoutParams4.topMargin = (c2Var.f == null && c2Var.n.getVisibility() == 8) ? AndroidUtilities.dp(8.0f) : 0;
                layoutParams4.bottomMargin = AndroidUtilities.dp(8.0f);
            } else if (c2Var.n.getVisibility() == 0) {
                layoutParams4.topMargin = c2Var.f == null ? AndroidUtilities.dp(19.0f) : 0;
                layoutParams4.bottomMargin = AndroidUtilities.dp(20.0f);
            }
            int i18 = i12 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            c2Var.v.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31));
            i12 = i18 - c2Var.v.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = c2Var.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(c10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) c2Var.r.getLayoutParams();
                measuredHeight = c2Var.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i13 = layoutParams5.topMargin;
            } else {
                ru ruVar = c2Var.n;
                if (ruVar != null) {
                    ruVar.measure(c10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                    if (c2Var.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) c2Var.n.getLayoutParams();
                        measuredHeight = c2Var.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i13 = layoutParams6.topMargin;
                    }
                }
                h90Var = c2Var.w0;
                if (h90Var != null) {
                    h90Var.measure(c10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) c2Var.w0.getLayoutParams();
                    int measuredHeight2 = i12 - ((c2Var.w0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    c2Var.x0.measure(c10, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) c2Var.x0.getLayoutParams();
                    i12 = measuredHeight2 - ((c2Var.x0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i12 -= measuredHeight + i13;
            h90Var = c2Var.w0;
            if (h90Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i12))) - (c2Var.W ? AndroidUtilities.dp(8.0f) : 0));
        this.a = false;
        if (c2Var.L != AndroidUtilities.displaySize.x) {
            AndroidUtilities.runOnUIThread(new p(this, 6));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c2 c2Var = this.d;
        if (c2Var.H) {
            c2Var.q();
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
        int f7;
        int f10;
        c2 c2Var = this.d;
        try {
            c2Var.s();
            int i10 = c2Var.d1;
            if (i10 >= 0 && (f10 = c2Var.f(i10)) != c2Var.W0) {
                c2Var.W0 = f10;
                Drawable drawable = c2Var.B0;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(c2Var.W0, PorterDuff.Mode.MULTIPLY));
                }
                FrameLayout frameLayout = c2Var.r;
                if (frameLayout != null && (frameLayout.getBackground() instanceof ShapeDrawable)) {
                    k6.z1(c2Var.W0, c2Var.r.getBackground());
                }
                y1 y1Var = c2Var.c1;
                if (y1Var != null) {
                    y1Var.invalidate();
                }
            }
            h90 h90Var = c2Var.w0;
            if (h90Var != null) {
                h90Var.setProgressColor(c2Var.f(k6.F5));
                c2Var.w0.setBackColor(c2Var.f(k6.G5));
                c2Var.w0.invalidate();
            }
            if (c2Var.v != null && (f7 = c2Var.f(k6.A5)) != c2Var.f1) {
                c2Var.f1 = f7;
                AndroidUtilities.setScrollViewEdgeEffectColor(c2Var.v, f7);
            }
            if (c2Var.i1) {
                return;
            }
            wh.n nVar = c2Var.f;
            if (nVar != null && nVar.getCurrentTextColor() == c2Var.g1) {
                wh.n nVar2 = c2Var.f;
                int f11 = c2Var.f(k6.j5);
                c2Var.g1 = f11;
                nVar2.setTextColor(f11);
            }
            ru ruVar = c2Var.n;
            if (ruVar == null || ruVar.getCurrentTextColor() != c2Var.h1) {
                return;
            }
            ru ruVar2 = c2Var.n;
            int f12 = c2Var.f(c2Var.W ? k6.y6 : k6.j5);
            c2Var.h1 = f12;
            ruVar2.setTextColor(f12);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
