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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vw0 extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ dx0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(dx0 dx0Var, Context context) {
        super(context);
        this.e = dx0Var;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        dx0 dx0Var = this.e;
        int L = org.telegram.messenger.i0.L(6.0f) + (dx0Var.V1 - dx0Var.s0);
        int L2 = (dx0Var.V1 - dx0Var.s0) - org.telegram.messenger.i0.L(13.0f);
        int i11 = org.telegram.messenger.i0.m;
        int i12 = L2 + i11;
        int i13 = L + i11;
        if (this.c) {
            int i14 = dx0Var.s0;
            if (i12 + i14 < i11 * 2) {
                i12 -= Math.min(i11, ((i11 * 2) - i12) - i14);
                f7 = 1.0f - Math.min(1.0f, (r3 * 2) / org.telegram.messenger.i0.m);
            } else {
                f7 = 1.0f;
            }
            int i15 = dx0Var.s0;
            int i16 = i12 + i15;
            int i17 = org.telegram.messenger.i0.m;
            i10 = i16 < i17 ? Math.min(i17, (i17 - i12) - i15) : 0;
        } else {
            i10 = 0;
            f7 = 1.0f;
        }
        dx0Var.r0.setBounds(0, i12, getMeasuredWidth(), getMeasuredHeight());
        dx0Var.r0.draw(canvas);
        RectF rectF = this.b;
        if (f7 != 1.0f) {
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, dx0Var.I0));
            rectF.set(dx0Var.t0, dx0Var.s0 + i12, getMeasuredWidth() - dx0Var.t0, org.telegram.messenger.i0.L(24.0f) + dx0Var.s0 + i12);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.t0);
        }
        Typeface typeface = org.telegram.messenger.i0.a;
        int L3 = org.telegram.messenger.i0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i13, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.i0.L(4.0f) + i13);
        org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, dx0Var.I0));
        org.telegram.ui.ActionBar.t6.t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i13 - org.telegram.messenger.i0.m) / org.telegram.messenger.i0.L(16.0f))) * r1.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.t0);
        boolean z10 = i10 > org.telegram.messenger.i0.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, dx0Var.I0)) > 0.721f;
            boolean z12 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, dx0Var.I0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.i0.r3(dx0Var.getWindow(), z11);
        }
        if (i10 > 0) {
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, dx0Var.I0));
            canvas.drawRect(dx0Var.t0, org.telegram.messenger.i0.m - i10, getMeasuredWidth() - dx0Var.t0, org.telegram.messenger.i0.m, org.telegram.ui.ActionBar.t6.t0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            dx0 dx0Var = this.e;
            if (dx0Var.V1 != 0 && motionEvent.getY() < dx0Var.V1) {
                dx0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.a;
        int i15 = i12 - i10;
        dx0 dx0Var = this.e;
        if (i14 != i15) {
            this.a = i15;
            zw0 zw0Var = dx0Var.k1;
            if (zw0Var != null && dx0Var.N1 != null) {
                zw0Var.f();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        dx0.I0(dx0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int max;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        dx0 dx0Var = this.e;
        ArrayList arrayList = dx0Var.O1;
        dx0Var.X1 = true;
        int i14 = dx0Var.t0;
        setPadding(i14, org.telegram.messenger.i0.m, i14, 0);
        dx0Var.X1 = false;
        if (dx0Var.Q0()) {
            int measuredWidth = dx0Var.j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.i0.q.x;
            }
            dx0Var.k1.d = Math.max(1, measuredWidth / org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 60.0f : 45.0f));
            int size2 = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(36.0f)) / dx0Var.k1.d;
            dx0Var.F1 = size2;
            dx0Var.G1 = size2;
        } else {
            dx0Var.k1.d = 5;
            dx0Var.F1 = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(36.0f)) / dx0Var.k1.d;
            dx0Var.G1 = org.telegram.messenger.i0.L(82.0f);
        }
        float f7 = dx0Var.k1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dx0Var.j1.getLayoutParams();
        if (arrayList != null) {
            i13 = (Math.max(3, (int) Math.ceil(arrayList.size() / f7)) * dx0Var.G1) + org.telegram.messenger.i0.L(48.0f) + marginLayoutParams.bottomMargin + dx0Var.s0 + org.telegram.messenger.i0.m;
        } else {
            if (dx0Var.N1 != null) {
                i12 = (dx0Var.k1.n * dx0Var.G1) + (dx0Var.N1.size() * org.telegram.messenger.i0.L(60.0f)) + org.telegram.messenger.i0.L(8.0f) + marginLayoutParams.bottomMargin + dx0Var.s0;
                max = org.telegram.messenger.i0.L(24.0f);
            } else {
                max = (Math.max(dx0Var.Q0() ? 2 : 3, dx0Var.J1 != null ? (int) Math.ceil(r4.documents.size() / f7) : 0) * dx0Var.G1) + org.telegram.messenger.i0.L(48.0f) + marginLayoutParams.bottomMargin + dx0Var.s0;
                i12 = org.telegram.messenger.i0.m;
            }
            i13 = i12 + max;
        }
        if (dx0Var.Q0()) {
            i13 = (int) ((dx0Var.G1 * 0.15f) + i13);
        }
        float f10 = size / 5.0f;
        int i15 = ((double) i13) < ((double) f10) * 3.2d ? 0 : (int) (f10 * 2.0f);
        if (i15 != 0 && i13 < size) {
            i15 -= size - i13;
        }
        if (i15 == 0) {
            i15 = dx0Var.s0;
        }
        if (dx0Var.N1 != null) {
            i15 += org.telegram.messenger.i0.L(8.0f);
        }
        if (dx0Var.j1.getPaddingTop() != i15) {
            dx0Var.X1 = true;
            dx0Var.j1.setPadding(org.telegram.messenger.i0.L(10.0f), i15, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(8.0f));
            dx0Var.B1.setPadding(0, i15, 0, 0);
            dx0Var.X1 = false;
        }
        this.c = i13 >= size;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i13, size), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e.X1) {
            return;
        }
        super.requestLayout();
    }
}
