package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a2 extends LinearLayout {
    public boolean a;
    public final org.telegram.ui.Components.d6 b;
    public final Paint c;
    public final /* synthetic */ c2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Context context, c2 c2Var) {
        super(context);
        this.d = c2Var;
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6();
        d6Var.f = 0L;
        d6Var.g = 200L;
        d6Var.h = jr.f;
        d6Var.a = this;
        d6Var.d = 0.0f;
        d6Var.c = 0.0f;
        d6Var.e = false;
        this.b = d6Var;
        this.c = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c2 c2Var = this.d;
        Drawable drawable = c2Var.v0;
        if (c2Var.e0 && !c2Var.P0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = c2Var.R;
            if (view == null || !c2Var.f0) {
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
        if (c2Var.P0) {
            if (c2Var.Z != 3 || c2Var.r == null) {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = c2Var.r.getScaleX() * c2Var.r.getWidth();
                float scaleY = c2Var.r.getScaleY() * c2Var.r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float d = this.b.d(c2Var.B0 != null ? 1.0f : 0.0f, false);
            Paint paint = c2Var.B0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, c2Var.B0);
            }
            if (c2Var.C0 == null) {
                Paint paint2 = new Paint(1);
                c2Var.C0 = paint2;
                paint2.setColor(i0.a.k(-16777216, (int) (c2Var.M0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, c2Var.C0);
            int i10 = c2Var.Q0;
            Paint paint3 = this.c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((c2Var.x0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
        if (!c2Var.D) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        c2Var.p();
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.ui.ActionBar.z1] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c2 c2Var = this.d;
        int[] iArr = c2Var.t0;
        if (c2Var.Z == 3) {
            int measuredWidth = ((i12 - i10) - c2Var.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - c2Var.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = c2Var.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, c2Var.r.getMeasuredHeight() + measuredHeight);
        } else {
            w1 w1Var = c2Var.v;
            if (w1Var != null) {
                if (c2Var.x == null) {
                    c2Var.x = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.ActionBar.z1
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            c2 c2Var2 = a2.this.d;
                            boolean z11 = false;
                            c2.a(c2Var2, 0, c2Var2.f != null && c2Var2.v.getScrollY() > c2Var2.w.getTop());
                            if (c2Var2.p0 != null) {
                                if (c2Var2.v.getHeight() + c2Var2.v.getScrollY() < c2Var2.w.getBottom()) {
                                    z11 = true;
                                }
                            }
                            c2.a(c2Var2, 1, z11);
                            c2Var2.v.invalidate();
                        }
                    };
                    w1Var.getViewTreeObserver().addOnScrollChangedListener(c2Var.x);
                }
                c2Var.x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = c2Var.z0;
        if (matrix == null || c2Var.A0 == null) {
            return;
        }
        matrix.reset();
        c2Var.z0.postScale(8.0f, 8.0f);
        c2Var.z0.postTranslate(-iArr[0], -iArr[1]);
        c2Var.A0.setLocalMatrix(c2Var.z0);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x021c  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int measuredHeight;
        int i13;
        i80 i80Var;
        float f9;
        c2 c2Var = this.d;
        int i14 = c2Var.Z;
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
            Rect rect = c2Var.w0;
            size = rect.right + i15 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int d = org.telegram.ui.b.d(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup = c2Var.p0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = c2Var.p0.getChildAt(i16);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(AndroidUtilities.dp(org.telegram.ui.b.x(24.0f, paddingLeft, 2)));
                }
            }
            c2Var.p0.measure(makeMeasureSpec, i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c2Var.p0.getLayoutParams();
            i12 = paddingTop - ((c2Var.p0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i12 = paddingTop;
        }
        gh.s sVar = c2Var.f;
        if (sVar != null) {
            sVar.measure(d, i11);
        }
        FrameLayout frameLayout = c2Var.s;
        if (frameLayout != null) {
            frameLayout.measure(d, i11);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) c2Var.s.getLayoutParams();
            i12 -= (c2Var.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = c2Var.h;
        if (textView != null) {
            textView.measure(d, i11);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c2Var.h.getLayoutParams();
            i12 -= (c2Var.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        aj0 aj0Var = c2Var.g0;
        if (aj0Var != null) {
            aj0Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(c2Var.W), TLObject.FLAG_30));
            i12 -= c2Var.g0.getMeasuredHeight();
        }
        View view = c2Var.R;
        if (view != null) {
            float f10 = c2Var.K0;
            if (f10 >= 0.0f) {
                if (f10 == 0.0f) {
                    f9 = size / 936.0f;
                    f10 = 354.0f;
                } else {
                    f9 = size;
                }
                int i17 = (int) (f9 * f10);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                c2Var.R.getLayoutParams().height = i17;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
            }
            i12 -= c2Var.R.getMeasuredHeight();
        }
        if (i14 == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) c2Var.v.getLayoutParams();
            if (c2Var.b != null) {
                layoutParams4.topMargin = (c2Var.f == null && c2Var.n.getVisibility() == 8 && c2Var.L == null) ? AndroidUtilities.dp(16.0f) : 0;
                layoutParams4.bottomMargin = c2Var.p0 == null ? AndroidUtilities.dp(8.0f) : 0;
            } else if (c2Var.L != null) {
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
                frameLayout2.measure(d, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) c2Var.r.getLayoutParams();
                measuredHeight = c2Var.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i13 = layoutParams5.topMargin;
            } else {
                bu buVar = c2Var.n;
                if (buVar != null) {
                    buVar.measure(d, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                    if (c2Var.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) c2Var.n.getLayoutParams();
                        measuredHeight = c2Var.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i13 = layoutParams6.topMargin;
                    }
                }
                i80Var = c2Var.q0;
                if (i80Var != null) {
                    i80Var.measure(d, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) c2Var.q0.getLayoutParams();
                    int measuredHeight2 = i12 - ((c2Var.q0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    c2Var.r0.measure(d, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) c2Var.r0.getLayoutParams();
                    i12 = measuredHeight2 - ((c2Var.r0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i12 -= measuredHeight + i13;
            i80Var = c2Var.q0;
            if (i80Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i12))) - (c2Var.S ? AndroidUtilities.dp(8.0f) : 0));
        this.a = false;
        if (c2Var.H != AndroidUtilities.displaySize.x) {
            AndroidUtilities.runOnUIThread(new q(this, 6));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c2 c2Var = this.d;
        if (c2Var.D) {
            c2Var.p();
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
}
