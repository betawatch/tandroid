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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class cw0 extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ kw0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw0(kw0 kw0Var, Context context) {
        super(context);
        this.e = kw0Var;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        kw0 kw0Var = this.e;
        int L = org.telegram.messenger.g0.L(6.0f) + (kw0Var.Z1 - kw0Var.t0);
        int L2 = (kw0Var.Z1 - kw0Var.t0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        if (this.c) {
            int i13 = kw0Var.t0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (r3 * 2) / org.telegram.messenger.g0.m);
            } else {
                f10 = 1.0f;
            }
            int i14 = kw0Var.t0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.m;
            i7 = i15 < i16 ? Math.min(i16, (i16 - i11) - i14) : 0;
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        kw0Var.s0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        kw0Var.s0.draw(canvas);
        RectF rectF = this.b;
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, kw0Var.J0));
            rectF.set(kw0Var.u0, kw0Var.t0 + i11, getMeasuredWidth() - kw0Var.u0, org.telegram.messenger.g0.L(24.0f) + kw0Var.t0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.t0);
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, kw0Var.J0));
        org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.m) / org.telegram.messenger.g0.L(16.0f))) * r1.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
        boolean z10 = i7 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, kw0Var.J0)) > 0.721f;
            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, kw0Var.J0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.r3(kw0Var.getWindow(), z11);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, kw0Var.J0));
            canvas.drawRect(kw0Var.u0, org.telegram.messenger.g0.m - i7, getMeasuredWidth() - kw0Var.u0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.m6.t0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            kw0 kw0Var = this.e;
            if (kw0Var.Z1 != 0 && motionEvent.getY() < kw0Var.Z1) {
                kw0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = this.a;
        int i14 = i11 - i7;
        kw0 kw0Var = this.e;
        if (i13 != i14) {
            this.a = i14;
            gw0 gw0Var = kw0Var.o1;
            if (gw0Var != null && kw0Var.R1 != null) {
                gw0Var.f();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
        kw0.J0(kw0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int max;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        kw0 kw0Var = this.e;
        ArrayList arrayList = kw0Var.S1;
        kw0Var.b2 = true;
        int i13 = kw0Var.u0;
        setPadding(i13, org.telegram.messenger.g0.m, i13, 0);
        kw0Var.b2 = false;
        if (kw0Var.R0()) {
            int measuredWidth = kw0Var.n1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            kw0Var.o1.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f));
            int size2 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / kw0Var.o1.d;
            kw0Var.J1 = size2;
            kw0Var.K1 = size2;
        } else {
            kw0Var.o1.d = 5;
            kw0Var.J1 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / kw0Var.o1.d;
            kw0Var.K1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f10 = kw0Var.o1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kw0Var.n1.getLayoutParams();
        if (arrayList != null) {
            i12 = (Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * kw0Var.K1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + kw0Var.t0 + org.telegram.messenger.g0.m;
        } else {
            if (kw0Var.R1 != null) {
                i11 = (kw0Var.o1.n * kw0Var.K1) + (kw0Var.R1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + kw0Var.t0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                max = (Math.max(kw0Var.R0() ? 2 : 3, kw0Var.N1 != null ? (int) Math.ceil(r4.documents.size() / f10) : 0) * kw0Var.K1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + kw0Var.t0;
                i11 = org.telegram.messenger.g0.m;
            }
            i12 = i11 + max;
        }
        if (kw0Var.R0()) {
            i12 = (int) ((kw0Var.K1 * 0.15f) + i12);
        }
        float f11 = size / 5.0f;
        int i14 = ((double) i12) < ((double) f11) * 3.2d ? 0 : (int) (f11 * 2.0f);
        if (i14 != 0 && i12 < size) {
            i14 -= size - i12;
        }
        if (i14 == 0) {
            i14 = kw0Var.t0;
        }
        if (kw0Var.R1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (kw0Var.n1.getPaddingTop() != i14) {
            kw0Var.b2 = true;
            kw0Var.n1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            kw0Var.F1.setPadding(0, i14, 0, 0);
            kw0Var.b2 = false;
        }
        this.c = i12 >= size;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(i12, size), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e.b2) {
            return;
        }
        super.requestLayout();
    }
}
