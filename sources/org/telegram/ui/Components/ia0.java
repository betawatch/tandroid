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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ia0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final g6 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final ea0 c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String h;
    public final int n;

    public ia0(Context context, int i7, String str, int i10, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = true;
        this.f = str;
        this.h = str2;
        this.b = e6Var;
        int i11 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 2, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(this, h02, null, M, e6Var);
        g6 g6Var = new g6(true, true, true);
        this.a = g6Var;
        g6Var.n(0.35f, 300L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(16.0f));
        g6Var.u(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var));
        g6Var.setCallback(this);
        g6Var.q(!org.telegram.messenger.hd.a0);
        if (org.telegram.messenger.hd.a0) {
            g6Var.b = 5;
        }
        float L = org.telegram.messenger.g0.L(77.0f);
        TextPaint textPaint = g6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + L);
        this.n = max;
        g6Var.N = max;
        ea0 ea0Var = new ea0(0);
        ch0 ch0Var = new ch0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        ea0Var.c = ch0Var;
        ch0Var.R(this);
        ch0Var.J(true);
        ch0Var.h = true;
        ch0Var.K(0);
        ch0 ch0Var2 = new ch0(i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        ea0Var.d = ch0Var2;
        ch0Var2.R(this);
        ch0Var2.J(true);
        ch0Var2.h = true;
        ch0Var2.K(0);
        ea0Var.e = ch0Var;
        this.c = ea0Var;
        org.telegram.ui.ActionBar.q6.x(this, ea0Var, org.telegram.ui.ActionBar.j6.F8, e6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.d || z10 != this.e) {
            this.e = z10;
            String str = z10 ? this.f : this.h;
            boolean z12 = z11 && !org.telegram.messenger.hd.a0;
            g6 g6Var = this.a;
            g6Var.t(str, z12, true);
            ea0 ea0Var = this.c;
            ch0 ch0Var = (ch0) ea0Var.d;
            ch0 ch0Var2 = (ch0) ea0Var.c;
            ea0Var.b = z10;
            if (z11) {
                ea0Var.e = z10 ? ch0Var2 : ch0Var;
                ch0Var2.M(0);
                ch0Var.M(0);
                ((ch0) ea0Var.e).start();
            } else {
                if (z10) {
                    ch0Var = ch0Var2;
                }
                ea0Var.e = ch0Var;
                ch0Var.M(ch0Var.e[0] - 1);
            }
            this.d = false;
            setContentDescription(g6Var.i);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.E8));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = org.telegram.messenger.hd.a0;
        g6 g6Var = this.a;
        ea0 ea0Var = this.c;
        if (z10) {
            ea0Var.setBounds(getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.i20.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - org.telegram.messenger.g0.L(17.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            g6Var.setBounds(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(59.0f), getMeasuredHeight());
        } else {
            ea0Var.setBounds(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.i20.y(24.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(41.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            g6Var.setBounds(org.telegram.messenger.g0.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        g6Var.draw(canvas);
        ea0Var.draw(canvas);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            g6 g6Var = this.a;
            if (g6Var != null) {
                g6Var.u(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.b));
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
