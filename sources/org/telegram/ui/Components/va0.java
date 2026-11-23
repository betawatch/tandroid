package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class va0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final n6 a;
    public final org.telegram.ui.ActionBar.h6 b;
    public final ra0 c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String h;
    public final int n;

    public va0(Context context, int i7, String str, int i10, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = true;
        this.f = str;
        this.h = str2;
        this.b = h6Var;
        int i11 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 2, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(this, h02, null, M, h6Var);
        n6 n6Var = new n6(true, true, true);
        this.a = n6Var;
        n6Var.n(0.35f, 300L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(16.0f));
        n6Var.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var));
        n6Var.setCallback(this);
        n6Var.q(!org.telegram.messenger.hd.a0);
        if (org.telegram.messenger.hd.a0) {
            n6Var.b = 5;
        }
        float L = org.telegram.messenger.g0.L(77.0f);
        TextPaint textPaint = n6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + L);
        this.n = max;
        n6Var.N = max;
        ra0 ra0Var = new ra0(0);
        oh0 oh0Var = new oh0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        ra0Var.c = oh0Var;
        oh0Var.R(this);
        oh0Var.J(true);
        oh0Var.h = true;
        oh0Var.K(0);
        oh0 oh0Var2 = new oh0(i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        ra0Var.d = oh0Var2;
        oh0Var2.R(this);
        oh0Var2.J(true);
        oh0Var2.h = true;
        oh0Var2.K(0);
        ra0Var.e = oh0Var;
        this.c = ra0Var;
        org.telegram.ui.ActionBar.t6.x(this, ra0Var, org.telegram.ui.ActionBar.m6.F8, h6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.d || z10 != this.e) {
            this.e = z10;
            String str = z10 ? this.f : this.h;
            boolean z12 = z11 && !org.telegram.messenger.hd.a0;
            n6 n6Var = this.a;
            n6Var.t(str, z12, true);
            ra0 ra0Var = this.c;
            oh0 oh0Var = (oh0) ra0Var.d;
            oh0 oh0Var2 = (oh0) ra0Var.c;
            ra0Var.b = z10;
            if (z11) {
                ra0Var.e = z10 ? oh0Var2 : oh0Var;
                oh0Var2.M(0);
                oh0Var.M(0);
                ((oh0) ra0Var.e).start();
            } else {
                if (z10) {
                    oh0Var = oh0Var2;
                }
                ra0Var.e = oh0Var;
                oh0Var.M(oh0Var.e[0] - 1);
            }
            this.d = false;
            setContentDescription(n6Var.i);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = org.telegram.messenger.hd.a0;
        n6 n6Var = this.a;
        ra0 ra0Var = this.c;
        if (z10) {
            ra0Var.setBounds(getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.o10.z(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - org.telegram.messenger.g0.L(17.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(59.0f), getMeasuredHeight());
        } else {
            ra0Var.setBounds(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.o10.z(24.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(41.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(org.telegram.messenger.g0.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        n6Var.draw(canvas);
        ra0Var.draw(canvas);
    }

    public boolean getState() {
        return this.e;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        int i11 = this.n;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode == 1073741824 ? Math.max(View.MeasureSpec.getSize(i7), i11) : Math.min(View.MeasureSpec.getSize(i7), i11), mode), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() != 0 || getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            n6 n6Var = this.a;
            if (n6Var != null) {
                n6Var.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.b));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
