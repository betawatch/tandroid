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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qv0 extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ yv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv0(yv0 yv0Var, Context context) {
        super(context);
        this.e = yv0Var;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        yv0 yv0Var = this.e;
        int L = org.telegram.messenger.g0.L(6.0f) + (yv0Var.Y1 - yv0Var.s0);
        int L2 = (yv0Var.Y1 - yv0Var.s0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        if (this.c) {
            int i13 = yv0Var.s0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (r3 * 2) / org.telegram.messenger.g0.m);
            } else {
                f10 = 1.0f;
            }
            int i14 = yv0Var.s0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.m;
            i7 = i15 < i16 ? Math.min(i16, (i16 - i11) - i14) : 0;
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        yv0Var.r0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        yv0Var.r0.draw(canvas);
        RectF rectF = this.b;
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, yv0Var.I0));
            rectF.set(yv0Var.t0, yv0Var.s0 + i11, getMeasuredWidth() - yv0Var.t0, org.telegram.messenger.g0.L(24.0f) + yv0Var.s0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.t0);
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, yv0Var.I0));
        org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.m) / org.telegram.messenger.g0.L(16.0f))) * r1.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
        boolean z9 = i7 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z9) {
            boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, yv0Var.I0)) > 0.721f;
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, yv0Var.I0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z9);
            if (!z9) {
                z10 = z11;
            }
            org.telegram.messenger.g0.s3(yv0Var.getWindow(), z10);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, yv0Var.I0));
            canvas.drawRect(yv0Var.t0, org.telegram.messenger.g0.m - i7, getMeasuredWidth() - yv0Var.t0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.m6.t0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            yv0 yv0Var = this.e;
            if (yv0Var.Y1 != 0 && motionEvent.getY() < yv0Var.Y1) {
                yv0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = this.a;
        int i14 = i11 - i7;
        yv0 yv0Var = this.e;
        if (i13 != i14) {
            this.a = i14;
            uv0 uv0Var = yv0Var.n1;
            if (uv0Var != null && yv0Var.Q1 != null) {
                uv0Var.f();
            }
        }
        super.onLayout(z9, i7, i10, i11, i12);
        yv0.I0(yv0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int max;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        yv0 yv0Var = this.e;
        ArrayList arrayList = yv0Var.R1;
        yv0Var.a2 = true;
        int i13 = yv0Var.t0;
        setPadding(i13, org.telegram.messenger.g0.m, i13, 0);
        yv0Var.a2 = false;
        if (yv0Var.Q0()) {
            int measuredWidth = yv0Var.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            yv0Var.n1.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f));
            int size2 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / yv0Var.n1.d;
            yv0Var.I1 = size2;
            yv0Var.J1 = size2;
        } else {
            yv0Var.n1.d = 5;
            yv0Var.I1 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / yv0Var.n1.d;
            yv0Var.J1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f10 = yv0Var.n1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yv0Var.m1.getLayoutParams();
        if (arrayList != null) {
            i12 = (Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * yv0Var.J1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + yv0Var.s0 + org.telegram.messenger.g0.m;
        } else {
            if (yv0Var.Q1 != null) {
                i11 = (yv0Var.n1.n * yv0Var.J1) + (yv0Var.Q1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + yv0Var.s0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                max = (Math.max(yv0Var.Q0() ? 2 : 3, yv0Var.M1 != null ? (int) Math.ceil(r4.documents.size() / f10) : 0) * yv0Var.J1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + yv0Var.s0;
                i11 = org.telegram.messenger.g0.m;
            }
            i12 = i11 + max;
        }
        if (yv0Var.Q0()) {
            i12 = (int) ((yv0Var.J1 * 0.15f) + i12);
        }
        float f11 = size / 5.0f;
        int i14 = ((double) i12) < ((double) f11) * 3.2d ? 0 : (int) (f11 * 2.0f);
        if (i14 != 0 && i12 < size) {
            i14 -= size - i12;
        }
        if (i14 == 0) {
            i14 = yv0Var.s0;
        }
        if (yv0Var.Q1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (yv0Var.m1.getPaddingTop() != i14) {
            yv0Var.a2 = true;
            yv0Var.m1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            yv0Var.E1.setPadding(0, i14, 0, 0);
            yv0Var.a2 = false;
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
        if (this.e.a2) {
            return;
        }
        super.requestLayout();
    }
}
