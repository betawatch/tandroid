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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rv0 extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ zv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv0(zv0 zv0Var, Context context) {
        super(context);
        this.e = zv0Var;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        zv0 zv0Var = this.e;
        int L = org.telegram.messenger.g0.L(6.0f) + (zv0Var.V1 - zv0Var.s0);
        int L2 = (zv0Var.V1 - zv0Var.s0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        if (this.c) {
            int i13 = zv0Var.s0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (r3 * 2) / org.telegram.messenger.g0.m);
            } else {
                f10 = 1.0f;
            }
            int i14 = zv0Var.s0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.m;
            i7 = i15 < i16 ? Math.min(i16, (i16 - i11) - i14) : 0;
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        zv0Var.r0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        zv0Var.r0.draw(canvas);
        RectF rectF = this.b;
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.l6.t0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, zv0Var.I0));
            rectF.set(zv0Var.t0, zv0Var.s0 + i11, getMeasuredWidth() - zv0Var.t0, org.telegram.messenger.g0.L(24.0f) + zv0Var.s0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.l6.t0);
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.l6.t0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, zv0Var.I0));
        org.telegram.ui.ActionBar.l6.t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.m) / org.telegram.messenger.g0.L(16.0f))) * r1.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.t0);
        boolean z9 = i7 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z9) {
            boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, zv0Var.I0)) > 0.721f;
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.s8, zv0Var.I0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z9);
            if (!z9) {
                z10 = z11;
            }
            org.telegram.messenger.g0.s3(zv0Var.getWindow(), z10);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.l6.t0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, zv0Var.I0));
            canvas.drawRect(zv0Var.t0, org.telegram.messenger.g0.m - i7, getMeasuredWidth() - zv0Var.t0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.l6.t0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            zv0 zv0Var = this.e;
            if (zv0Var.V1 != 0 && motionEvent.getY() < zv0Var.V1) {
                zv0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = this.a;
        int i14 = i11 - i7;
        zv0 zv0Var = this.e;
        if (i13 != i14) {
            this.a = i14;
            vv0 vv0Var = zv0Var.k1;
            if (vv0Var != null && zv0Var.N1 != null) {
                vv0Var.f();
            }
        }
        super.onLayout(z9, i7, i10, i11, i12);
        zv0.I0(zv0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int max;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        zv0 zv0Var = this.e;
        ArrayList arrayList = zv0Var.O1;
        zv0Var.X1 = true;
        int i13 = zv0Var.t0;
        setPadding(i13, org.telegram.messenger.g0.m, i13, 0);
        zv0Var.X1 = false;
        if (zv0Var.Q0()) {
            int measuredWidth = zv0Var.j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            zv0Var.k1.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f));
            int size2 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / zv0Var.k1.d;
            zv0Var.F1 = size2;
            zv0Var.G1 = size2;
        } else {
            zv0Var.k1.d = 5;
            zv0Var.F1 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / zv0Var.k1.d;
            zv0Var.G1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f10 = zv0Var.k1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zv0Var.j1.getLayoutParams();
        if (arrayList != null) {
            i12 = (Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * zv0Var.G1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + zv0Var.s0 + org.telegram.messenger.g0.m;
        } else {
            if (zv0Var.N1 != null) {
                i11 = (zv0Var.k1.n * zv0Var.G1) + (zv0Var.N1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + zv0Var.s0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                max = (Math.max(zv0Var.Q0() ? 2 : 3, zv0Var.J1 != null ? (int) Math.ceil(r4.documents.size() / f10) : 0) * zv0Var.G1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + zv0Var.s0;
                i11 = org.telegram.messenger.g0.m;
            }
            i12 = i11 + max;
        }
        if (zv0Var.Q0()) {
            i12 = (int) ((zv0Var.G1 * 0.15f) + i12);
        }
        float f11 = size / 5.0f;
        int i14 = ((double) i12) < ((double) f11) * 3.2d ? 0 : (int) (f11 * 2.0f);
        if (i14 != 0 && i12 < size) {
            i14 -= size - i12;
        }
        if (i14 == 0) {
            i14 = zv0Var.s0;
        }
        if (zv0Var.N1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (zv0Var.j1.getPaddingTop() != i14) {
            zv0Var.X1 = true;
            zv0Var.j1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            zv0Var.B1.setPadding(0, i14, 0, 0);
            zv0Var.X1 = false;
        }
        this.c = i12 >= size;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(i12, size), TLObject.FLAG_30));
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
