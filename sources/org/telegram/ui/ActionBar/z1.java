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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z1 extends LinearLayout {
    public boolean a;
    public final org.telegram.ui.Components.y5 b;
    public final Paint c;
    public final /* synthetic */ b2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(Context context, b2 b2Var) {
        super(context);
        this.d = b2Var;
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5();
        y5Var.f = 0L;
        y5Var.g = 200L;
        y5Var.h = er.f;
        y5Var.a = this;
        y5Var.d = 0.0f;
        y5Var.c = 0.0f;
        y5Var.e = false;
        this.b = y5Var;
        this.c = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b2 b2Var = this.d;
        Drawable drawable = b2Var.v0;
        if (b2Var.e0 && !b2Var.P0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = b2Var.R;
            if (view == null || !b2Var.f0) {
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
        b2 b2Var = this.d;
        if (b2Var.P0) {
            if (b2Var.Z != 3 || b2Var.r == null) {
                dp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                dp = AndroidUtilities.dp(18.0f);
                float scaleX = b2Var.r.getScaleX() * b2Var.r.getWidth();
                float scaleY = b2Var.r.getScaleY() * b2Var.r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float d = this.b.d(b2Var.B0 != null ? 1.0f : 0.0f, false);
            Paint paint = b2Var.B0;
            if (paint != null) {
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, b2Var.B0);
            }
            if (b2Var.C0 == null) {
                Paint paint2 = new Paint(1);
                b2Var.C0 = paint2;
                paint2.setColor(i0.b.k(-16777216, (int) (b2Var.M0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, dp, dp, b2Var.C0);
            int i10 = b2Var.Q0;
            Paint paint3 = this.c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((b2Var.x0 - 1.0f) * d) + 1.0f) * paint3.getAlpha()));
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
        b2 b2Var = this.d;
        if (!b2Var.D) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        b2Var.p();
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [org.telegram.ui.ActionBar.y1] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b2 b2Var = this.d;
        int[] iArr = b2Var.t0;
        if (b2Var.Z == 3) {
            int measuredWidth = ((i12 - i10) - b2Var.r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - b2Var.r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = b2Var.r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, b2Var.r.getMeasuredHeight() + measuredHeight);
        } else {
            v1 v1Var = b2Var.v;
            if (v1Var != null) {
                if (b2Var.x == null) {
                    b2Var.x = new ViewTreeObserver.OnScrollChangedListener() { // from class: org.telegram.ui.ActionBar.y1
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            b2 b2Var2 = z1.this.d;
                            boolean z11 = false;
                            b2.a(b2Var2, 0, b2Var2.f != null && b2Var2.v.getScrollY() > b2Var2.w.getTop());
                            if (b2Var2.p0 != null) {
                                if (b2Var2.v.getHeight() + b2Var2.v.getScrollY() < b2Var2.w.getBottom()) {
                                    z11 = true;
                                }
                            }
                            b2.a(b2Var2, 1, z11);
                            b2Var2.v.invalidate();
                        }
                    };
                    v1Var.getViewTreeObserver().addOnScrollChangedListener(b2Var.x);
                }
                b2Var.x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = b2Var.z0;
        if (matrix == null || b2Var.A0 == null) {
            return;
        }
        matrix.reset();
        b2Var.z0.postScale(8.0f, 8.0f);
        b2Var.z0.postTranslate(-iArr[0], -iArr[1]);
        b2Var.A0.setLocalMatrix(b2Var.z0);
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
        z70 z70Var;
        float f10;
        b2 b2Var = this.d;
        int i14 = b2Var.Z;
        if (i14 == 3) {
            b2Var.r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        this.a = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = b2Var.a;
        if (i15 > 0) {
            Rect rect = b2Var.w0;
            size = rect.right + i15 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int d = rl.d(48.0f, paddingLeft, TLObject.FLAG_30);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        ViewGroup viewGroup = b2Var.p0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = b2Var.p0.getChildAt(i16);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(AndroidUtilities.dp(rl.x(24.0f, paddingLeft, 2)));
                }
            }
            b2Var.p0.measure(makeMeasureSpec, i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b2Var.p0.getLayoutParams();
            i12 = paddingTop - ((b2Var.p0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            i12 = paddingTop;
        }
        eh.s sVar = b2Var.f;
        if (sVar != null) {
            sVar.measure(d, i11);
        }
        FrameLayout frameLayout = b2Var.s;
        if (frameLayout != null) {
            frameLayout.measure(d, i11);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b2Var.s.getLayoutParams();
            i12 -= (b2Var.s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = b2Var.h;
        if (textView != null) {
            textView.measure(d, i11);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) b2Var.h.getLayoutParams();
            i12 -= (b2Var.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        ri0 ri0Var = b2Var.g0;
        if (ri0Var != null) {
            ri0Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(b2Var.W), TLObject.FLAG_30));
            i12 -= b2Var.g0.getMeasuredHeight();
        }
        View view = b2Var.R;
        if (view != null) {
            float f11 = b2Var.K0;
            if (f11 >= 0.0f) {
                if (f11 == 0.0f) {
                    f10 = size / 936.0f;
                    f11 = 354.0f;
                } else {
                    f10 = size;
                }
                int i17 = (int) (f10 * f11);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                b2Var.R.getLayoutParams().height = i17;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
            }
            i12 -= b2Var.R.getMeasuredHeight();
        }
        if (i14 == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) b2Var.v.getLayoutParams();
            if (b2Var.b != null) {
                layoutParams4.topMargin = (b2Var.f == null && b2Var.n.getVisibility() == 8 && b2Var.L == null) ? AndroidUtilities.dp(16.0f) : 0;
                layoutParams4.bottomMargin = b2Var.p0 == null ? AndroidUtilities.dp(8.0f) : 0;
            } else if (b2Var.L != null) {
                layoutParams4.topMargin = (b2Var.f == null && b2Var.n.getVisibility() == 8) ? AndroidUtilities.dp(8.0f) : 0;
                layoutParams4.bottomMargin = AndroidUtilities.dp(8.0f);
            } else if (b2Var.n.getVisibility() == 0) {
                layoutParams4.topMargin = b2Var.f == null ? AndroidUtilities.dp(19.0f) : 0;
                layoutParams4.bottomMargin = AndroidUtilities.dp(20.0f);
            }
            int i18 = i12 - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            b2Var.v.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31));
            i12 = i18 - b2Var.v.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = b2Var.r;
            if (frameLayout2 != null) {
                frameLayout2.measure(d, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) b2Var.r.getLayoutParams();
                measuredHeight = b2Var.r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i13 = layoutParams5.topMargin;
            } else {
                ut utVar = b2Var.n;
                if (utVar != null) {
                    utVar.measure(d, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31));
                    if (b2Var.n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) b2Var.n.getLayoutParams();
                        measuredHeight = b2Var.n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i13 = layoutParams6.topMargin;
                    }
                }
                z70Var = b2Var.q0;
                if (z70Var != null) {
                    z70Var.measure(d, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) b2Var.q0.getLayoutParams();
                    int measuredHeight2 = i12 - ((b2Var.q0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    b2Var.r0.measure(d, View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_31));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) b2Var.r0.getLayoutParams();
                    i12 = measuredHeight2 - ((b2Var.r0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            i12 -= measuredHeight + i13;
            z70Var = b2Var.q0;
            if (z70Var != null) {
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - i12))) - (b2Var.S ? AndroidUtilities.dp(8.0f) : 0));
        this.a = false;
        if (b2Var.H != AndroidUtilities.displaySize.x) {
            AndroidUtilities.runOnUIThread(new p(this, 6));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b2 b2Var = this.d;
        if (b2Var.D) {
            b2Var.p();
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
