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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ha0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final i6 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final da0 c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String h;
    public final int n;

    public ha0(Context context, int i7, String str, int i10, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = true;
        this.f = str;
        this.h = str2;
        this.b = f6Var;
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(this, h02, null, N, f6Var);
        i6 i6Var = new i6(true, true, true);
        this.a = i6Var;
        i6Var.n(0.35f, 300L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(16.0f));
        i6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var));
        i6Var.setCallback(this);
        i6Var.q(!org.telegram.messenger.id.a0);
        if (org.telegram.messenger.id.a0) {
            i6Var.b = 5;
        }
        float L = org.telegram.messenger.g0.L(77.0f);
        TextPaint textPaint = i6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + L);
        this.n = max;
        i6Var.M = max;
        da0 da0Var = new da0(0);
        zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        da0Var.c = zg0Var;
        zg0Var.R(this);
        zg0Var.J(true);
        zg0Var.h = true;
        zg0Var.K(0);
        zg0 zg0Var2 = new zg0(i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        da0Var.d = zg0Var2;
        zg0Var2.R(this);
        zg0Var2.J(true);
        zg0Var2.h = true;
        zg0Var2.K(0);
        da0Var.e = zg0Var;
        this.c = da0Var;
        org.telegram.ui.ActionBar.r6.y(this, da0Var, org.telegram.ui.ActionBar.k6.F8, f6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z9, boolean z10) {
        if (this.d || z9 != this.e) {
            this.e = z9;
            String str = z9 ? this.f : this.h;
            boolean z11 = z10 && !org.telegram.messenger.id.a0;
            i6 i6Var = this.a;
            i6Var.t(str, z11, true);
            da0 da0Var = this.c;
            zg0 zg0Var = (zg0) da0Var.d;
            zg0 zg0Var2 = (zg0) da0Var.c;
            da0Var.b = z9;
            if (z10) {
                da0Var.e = z9 ? zg0Var2 : zg0Var;
                zg0Var2.M(0);
                zg0Var.M(0);
                ((zg0) da0Var.e).start();
            } else {
                if (z9) {
                    zg0Var = zg0Var2;
                }
                da0Var.e = zg0Var;
                zg0Var.M(zg0Var.e[0] - 1);
            }
            this.d = false;
            setContentDescription(i6Var.i);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z9 = org.telegram.messenger.id.a0;
        i6 i6Var = this.a;
        da0 da0Var = this.c;
        if (z9) {
            da0Var.setBounds(getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.camera.q.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - org.telegram.messenger.g0.L(17.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            i6Var.setBounds(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(59.0f), getMeasuredHeight());
        } else {
            da0Var.setBounds(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.camera.q.y(24.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(41.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            i6Var.setBounds(org.telegram.messenger.g0.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        i6Var.draw(canvas);
        da0Var.draw(canvas);
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            i6 i6Var = this.a;
            if (i6Var != null) {
                i6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.b));
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
