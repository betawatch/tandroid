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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class aw0 extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ iw0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw0(iw0 iw0Var, Context context) {
        super(context);
        this.e = iw0Var;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        iw0 iw0Var = this.e;
        int L = org.telegram.messenger.g0.L(6.0f) + (iw0Var.Z1 - iw0Var.t0);
        int L2 = (iw0Var.Z1 - iw0Var.t0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        if (this.c) {
            int i13 = iw0Var.t0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (r3 * 2) / org.telegram.messenger.g0.m);
            } else {
                f10 = 1.0f;
            }
            int i14 = iw0Var.t0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.m;
            i7 = i15 < i16 ? Math.min(i16, (i16 - i11) - i14) : 0;
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        iw0Var.s0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        iw0Var.s0.draw(canvas);
        RectF rectF = this.b;
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, iw0Var.J0));
            rectF.set(iw0Var.u0, iw0Var.t0 + i11, getMeasuredWidth() - iw0Var.u0, org.telegram.messenger.g0.L(24.0f) + iw0Var.t0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.n6.t0);
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, iw0Var.J0));
        org.telegram.ui.ActionBar.n6.t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.m) / org.telegram.messenger.g0.L(16.0f))) * r1.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.t0);
        boolean z10 = i7 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, iw0Var.J0)) > 0.721f;
            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, iw0Var.J0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.r3(iw0Var.getWindow(), z11);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, iw0Var.J0));
            canvas.drawRect(iw0Var.u0, org.telegram.messenger.g0.m - i7, getMeasuredWidth() - iw0Var.u0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.n6.t0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            iw0 iw0Var = this.e;
            if (iw0Var.Z1 != 0 && motionEvent.getY() < iw0Var.Z1) {
                iw0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = this.a;
        int i14 = i11 - i7;
        iw0 iw0Var = this.e;
        if (i13 != i14) {
            this.a = i14;
            ew0 ew0Var = iw0Var.o1;
            if (ew0Var != null && iw0Var.R1 != null) {
                ew0Var.f();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
        iw0.J0(iw0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int max;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        iw0 iw0Var = this.e;
        ArrayList arrayList = iw0Var.S1;
        iw0Var.b2 = true;
        int i13 = iw0Var.u0;
        setPadding(i13, org.telegram.messenger.g0.m, i13, 0);
        iw0Var.b2 = false;
        if (iw0Var.R0()) {
            int measuredWidth = iw0Var.n1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            iw0Var.o1.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f));
            int size2 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / iw0Var.o1.d;
            iw0Var.J1 = size2;
            iw0Var.K1 = size2;
        } else {
            iw0Var.o1.d = 5;
            iw0Var.J1 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / iw0Var.o1.d;
            iw0Var.K1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f10 = iw0Var.o1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iw0Var.n1.getLayoutParams();
        if (arrayList != null) {
            i12 = (Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * iw0Var.K1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + iw0Var.t0 + org.telegram.messenger.g0.m;
        } else {
            if (iw0Var.R1 != null) {
                i11 = (iw0Var.o1.n * iw0Var.K1) + (iw0Var.R1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + iw0Var.t0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                max = (Math.max(iw0Var.R0() ? 2 : 3, iw0Var.N1 != null ? (int) Math.ceil(r4.documents.size() / f10) : 0) * iw0Var.K1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + iw0Var.t0;
                i11 = org.telegram.messenger.g0.m;
            }
            i12 = i11 + max;
        }
        if (iw0Var.R0()) {
            i12 = (int) ((iw0Var.K1 * 0.15f) + i12);
        }
        float f11 = size / 5.0f;
        int i14 = ((double) i12) < ((double) f11) * 3.2d ? 0 : (int) (f11 * 2.0f);
        if (i14 != 0 && i12 < size) {
            i14 -= size - i12;
        }
        if (i14 == 0) {
            i14 = iw0Var.t0;
        }
        if (iw0Var.R1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (iw0Var.n1.getPaddingTop() != i14) {
            iw0Var.b2 = true;
            iw0Var.n1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            iw0Var.F1.setPadding(0, i14, 0, 0);
            iw0Var.b2 = false;
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
