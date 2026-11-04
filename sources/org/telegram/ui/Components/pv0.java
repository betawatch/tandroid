package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pv0 extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ xv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv0(xv0 xv0Var, Context context) {
        super(context);
        this.e = xv0Var;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        xv0 xv0Var = this.e;
        int L = org.telegram.messenger.g0.L(6.0f) + (xv0Var.W1 - xv0Var.t0);
        int L2 = (xv0Var.W1 - xv0Var.t0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        if (this.c) {
            int i13 = xv0Var.t0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (r3 * 2) / org.telegram.messenger.g0.m);
            } else {
                f10 = 1.0f;
            }
            int i14 = xv0Var.t0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.m;
            i3 = i15 < i16 ? Math.min(i16, (i16 - i11) - i14) : 0;
        } else {
            i3 = 0;
            f10 = 1.0f;
        }
        xv0Var.s0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        xv0Var.s0.draw(canvas);
        RectF rectF = this.b;
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, xv0Var.J0));
            rectF.set(xv0Var.u0, xv0Var.t0 + i11, getMeasuredWidth() - xv0Var.u0, org.telegram.messenger.g0.L(24.0f) + xv0Var.t0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.t0);
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, xv0Var.J0));
        org.telegram.ui.ActionBar.k6.t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.m) / org.telegram.messenger.g0.L(16.0f))) * r1.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
        boolean z10 = i3 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, xv0Var.J0)) > 0.721f;
            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, xv0Var.J0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(xv0Var.getWindow(), z11);
        }
        if (i3 > 0) {
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, xv0Var.J0));
            canvas.drawRect(xv0Var.u0, org.telegram.messenger.g0.m - i3, getMeasuredWidth() - xv0Var.u0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.k6.t0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            xv0 xv0Var = this.e;
            if (xv0Var.W1 != 0 && motionEvent.getY() < xv0Var.W1) {
                xv0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = this.a;
        int i14 = i11 - i3;
        xv0 xv0Var = this.e;
        if (i13 != i14) {
            this.a = i14;
            tv0 tv0Var = xv0Var.l1;
            if (tv0Var != null && xv0Var.O1 != null) {
                tv0Var.f();
            }
        }
        super.onLayout(z10, i3, i10, i11, i12);
        xv0.I0(xv0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int max;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        xv0 xv0Var = this.e;
        ArrayList arrayList = xv0Var.P1;
        xv0Var.Y1 = true;
        int i13 = xv0Var.u0;
        setPadding(i13, org.telegram.messenger.g0.m, i13, 0);
        xv0Var.Y1 = false;
        if (xv0Var.Q0()) {
            int measuredWidth = xv0Var.k1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            xv0Var.l1.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f));
            int size2 = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(36.0f)) / xv0Var.l1.d;
            xv0Var.G1 = size2;
            xv0Var.H1 = size2;
        } else {
            xv0Var.l1.d = 5;
            xv0Var.G1 = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(36.0f)) / xv0Var.l1.d;
            xv0Var.H1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f10 = xv0Var.l1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xv0Var.k1.getLayoutParams();
        if (arrayList != null) {
            i12 = (Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * xv0Var.H1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + xv0Var.t0 + org.telegram.messenger.g0.m;
        } else {
            if (xv0Var.O1 != null) {
                i11 = (xv0Var.l1.n * xv0Var.H1) + (xv0Var.O1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + xv0Var.t0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                max = (Math.max(xv0Var.Q0() ? 2 : 3, xv0Var.K1 != null ? (int) Math.ceil(r4.documents.size() / f10) : 0) * xv0Var.H1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + xv0Var.t0;
                i11 = org.telegram.messenger.g0.m;
            }
            i12 = i11 + max;
        }
        if (xv0Var.Q0()) {
            i12 = (int) ((xv0Var.H1 * 0.15f) + i12);
        }
        float f11 = size / 5.0f;
        int i14 = ((double) i12) < ((double) f11) * 3.2d ? 0 : (int) (f11 * 2.0f);
        if (i14 != 0 && i12 < size) {
            i14 -= size - i12;
        }
        if (i14 == 0) {
            i14 = xv0Var.t0;
        }
        if (xv0Var.O1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (xv0Var.k1.getPaddingTop() != i14) {
            xv0Var.Y1 = true;
            xv0Var.k1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            xv0Var.C1.setPadding(0, i14, 0, 0);
            xv0Var.Y1 = false;
        }
        this.c = i12 >= size;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(i12, size), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e.Y1) {
            return;
        }
        super.requestLayout();
    }
}
