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
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b2 extends LinearLayout {
    public boolean a;
    public final org.telegram.ui.Components.z5 b;
    public final Paint c;
    public final /* synthetic */ d2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(Context context, d2 d2Var) {
        super(context);
        this.d = d2Var;
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5();
        z5Var.f = 0L;
        z5Var.g = 200L;
        z5Var.h = pr.f;
        z5Var.a = this;
        z5Var.d = 0.0f;
        z5Var.c = 0.0f;
        z5Var.e = false;
        this.b = z5Var;
        this.c = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d2 d2Var = this.d;
        Drawable drawable = d2Var.w0;
        if (d2Var.f0 && !d2Var.Q0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = d2Var.S;
            if (view == null || !d2Var.g0) {
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
        d2 d2Var = this.d;
        if (d2Var.Q0) {
            if (d2Var.a0 != 3 || d2Var.r == null) {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = d2Var.r.getScaleX() * d2Var.r.getWidth();
                float scaleY = d2Var.r.getScaleY() * d2Var.r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float d = this.b.d(d2Var.C0 != null ? 1.0f : 0.0f, false);
            Paint paint = d2Var.C0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, d2Var.C0);
            }
            if (d2Var.D0 == null) {
                Paint paint2 = new Paint(1);
                d2Var.D0 = paint2;
                paint2.setColor(i0.a.k(-16777216, (int) (d2Var.N0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, d2Var.D0);
            int i10 = d2Var.R0;
            Paint paint3 = this.c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((d2Var.y0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
        d2 d2Var = this.d;
        if (!d2Var.E) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        d2Var.p();
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.ui.ActionBar.a2] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        d2 d2Var = this.d;
        int[] iArr = d2Var.u0;
        if (d2Var.a0 == 3) {
            int measuredWidth = ((i12 - i10) - d2Var.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - d2Var.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = d2Var.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, d2Var.r.getMeasuredHeight() + measuredHeight);
        } else {
            x1 x1Var = d2Var.v;
            if (x1Var != null) {
                if (d2Var.x == null) {
                    d2Var.x = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.ActionBar.a2
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            d2 d2Var2 = b2.this.d;
                            boolean z10 = false;
                            d2.a(d2Var2, 0, d2Var2.f != null && d2Var2.v.getScrollY() > d2Var2.w.getTop());
                            if (d2Var2.q0 != null) {
                                if (d2Var2.v.getHeight() + d2Var2.v.getScrollY() < d2Var2.w.getBottom()) {
                                    z10 = true;
                                }
                            }
                            d2.a(d2Var2, 1, z10);
                            d2Var2.v.invalidate();
                        }
                    };
                    x1Var.getViewTreeObserver().addOnScrollChangedListener(d2Var.x);
                }
                d2Var.x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = d2Var.A0;
        if (matrix == null || d2Var.B0 == null) {
            return;
        }
        matrix.reset();
        d2Var.A0.postScale(8.0f, 8.0f);
        d2Var.A0.postTranslate(-iArr[0], -iArr[1]);
        d2Var.B0.setLocalMatrix(d2Var.A0);
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
        p80 p80Var;
        float f10;
        d2 d2Var = this.d;
        int i14 = d2Var.a0;
        if (i14 == 3) {
            d2Var.r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = d2Var.a;
        if (i15 > 0) {
            Rect rect = d2Var.x0;
            size = rect.right + i15 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int d = org.telegram.ui.b.d(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup = d2Var.q0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = d2Var.q0.getChildAt(i16);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(AndroidUtilities.dp(org.telegram.ui.b.x(24.0f, paddingLeft, 2)));
                }
            }
            d2Var.q0.measure(makeMeasureSpec, i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) d2Var.q0.getLayoutParams();
            i12 = paddingTop - ((d2Var.q0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i12 = paddingTop;
        }
        jh.s sVar = d2Var.f;
        if (sVar != null) {
            sVar.measure(d, i11);
        }
        FrameLayout frameLayout = d2Var.s;
        if (frameLayout != null) {
            frameLayout.measure(d, i11);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) d2Var.s.getLayoutParams();
            i12 -= (d2Var.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = d2Var.h;
        if (textView != null) {
            textView.measure(d, i11);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) d2Var.h.getLayoutParams();
            i12 -= (d2Var.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        kj0 kj0Var = d2Var.h0;
        if (kj0Var != null) {
            kj0Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(d2Var.X), TLObject.FLAG_30));
            i12 -= d2Var.h0.getMeasuredHeight();
        }
        View view = d2Var.S;
        if (view != null) {
            float f11 = d2Var.L0;
            if (f11 >= 0.0f) {
                if (f11 == 0.0f) {
                    f10 = size / 936.0f;
                    f11 = 354.0f;
                } else {
                    f10 = size;
                }
                int i17 = (int) (f10 * f11);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                d2Var.S.getLayoutParams().height = i17;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
            }
            i12 -= d2Var.S.getMeasuredHeight();
        }
        if (i14 == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) d2Var.v.getLayoutParams();
            if (d2Var.b != null) {
                layoutParams4.topMargin = (d2Var.f == null && d2Var.n.getVisibility() == 8 && d2Var.M == null) ? AndroidUtilities.dp(16.0f) : 0;
                layoutParams4.bottomMargin = d2Var.q0 == null ? AndroidUtilities.dp(8.0f) : 0;
            } else if (d2Var.M != null) {
                layoutParams4.topMargin = (d2Var.f == null && d2Var.n.getVisibility() == 8) ? AndroidUtilities.dp(8.0f) : 0;
                layoutParams4.bottomMargin = AndroidUtilities.dp(8.0f);
            } else if (d2Var.n.getVisibility() == 0) {
                layoutParams4.topMargin = d2Var.f == null ? AndroidUtilities.dp(19.0f) : 0;
                layoutParams4.bottomMargin = AndroidUtilities.dp(20.0f);
            }
            int i18 = i12 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            d2Var.v.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31));
            i12 = i18 - d2Var.v.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = d2Var.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(d, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) d2Var.r.getLayoutParams();
                measuredHeight = d2Var.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i13 = layoutParams5.topMargin;
            } else {
                gu guVar = d2Var.n;
                if (guVar != null) {
                    guVar.measure(d, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                    if (d2Var.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) d2Var.n.getLayoutParams();
                        measuredHeight = d2Var.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i13 = layoutParams6.topMargin;
                    }
                }
                p80Var = d2Var.r0;
                if (p80Var != null) {
                    p80Var.measure(d, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) d2Var.r0.getLayoutParams();
                    int measuredHeight2 = i12 - ((d2Var.r0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    d2Var.s0.measure(d, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) d2Var.s0.getLayoutParams();
                    i12 = measuredHeight2 - ((d2Var.s0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i12 -= measuredHeight + i13;
            p80Var = d2Var.r0;
            if (p80Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i12))) - (d2Var.T ? AndroidUtilities.dp(8.0f) : 0));
        this.a = false;
        if (d2Var.I != AndroidUtilities.displaySize.x) {
            AndroidUtilities.runOnUIThread(new p(this, 6));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d2 d2Var = this.d;
        if (d2Var.E) {
            d2Var.p();
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
