package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.kd;
import org.telegram.messenger.ld;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final mi.b0 E;
    public final org.telegram.ui.Components.u5 F;
    public final org.telegram.ui.Components.u5 G;
    public final org.telegram.ui.Components.u5 H;
    public final org.telegram.ui.Components.g6 I;
    public final y a;
    public final int b;
    public int c;
    public final int d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final org.telegram.ui.ActionBar.k5 f;
    public final ImageView h;
    public long n;
    public final RectF r;
    public final boolean s;
    public final boolean w;
    public final org.telegram.ui.ActionBar.e6 x;
    public boolean y;

    /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p6(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        int i3;
        int i10;
        int i11;
        this.b = -1;
        this.d = h10.t0;
        mi.b0 b0Var = new mi.b0(this, 20);
        this.E = b0Var;
        xq xqVar = xq.h;
        this.F = new org.telegram.ui.Components.u5(this, 350L, xqVar);
        this.G = new org.telegram.ui.Components.u5(this, 350L, xqVar);
        this.H = new org.telegram.ui.Components.u5(this, 350L, xqVar);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, false);
        this.I = g6Var;
        g6Var.n(0.3f, 320L, xqVar);
        g6Var.w(org.telegram.messenger.g0.L(12.0f));
        g6Var.x(Typeface.DEFAULT_BOLD);
        g6Var.b = 17;
        g6Var.setCallback(this);
        this.x = e6Var;
        this.s = z10;
        this.w = z11;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        boolean z12 = bd.a0;
        addView(imageView, mf.d(46, 46.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 13.0f, 0.0f, z12 ? 13.0f : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f = k5Var;
        k5Var.setTextSize(16);
        k5Var.setGravity(bd.a0 ? 5 : 3);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z13 = bd.a0;
        addView(k5Var, mf.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 16.0f : 73.0f, 9.33f, z13 ? 73.0f : 16.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var2;
        k5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.A6, e6Var);
        k5Var2.setGravity(bd.a0 ? 5 : 3);
        boolean z14 = bd.a0;
        addView(k5Var2, mf.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 16.0f : 73.0f, 33.0f, z14 ? 73.0f : 16.0f, 0.0f));
        k5Var.setTag(Integer.valueOf(z10 ? z11 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.fj : org.telegram.ui.ActionBar.k6.cj));
        org.telegram.ui.ActionBar.r6.Y(k5Var, z10 ? z11 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.fj : org.telegram.ui.ActionBar.k6.cj, e6Var);
        if (!z10) {
            i3 = org.telegram.ui.ActionBar.k6.aj;
            i10 = org.telegram.ui.ActionBar.k6.bj;
        } else {
            if (z11) {
                i11 = org.telegram.ui.ActionBar.k6.kk;
                imageView.setTag(Integer.valueOf(i11));
                y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(46.0f), org.telegram.ui.ActionBar.k6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.k6.kk : org.telegram.ui.ActionBar.k6.dj : org.telegram.ui.ActionBar.k6.aj, e6Var), org.telegram.ui.ActionBar.k6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.k6.kk : org.telegram.ui.ActionBar.k6.dj : org.telegram.ui.ActionBar.k6.aj, e6Var));
                this.a = j02;
                this.c = 0;
                this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.k6.kk : org.telegram.ui.ActionBar.k6.dj : org.telegram.ui.ActionBar.k6.aj;
                if (z10) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.bj, e6Var, PorterDuff.Mode.MULTIPLY);
                    xp xpVar = new xp(j02, mutate);
                    int L = org.telegram.messenger.g0.L(46.0f);
                    int L2 = org.telegram.messenger.g0.L(46.0f);
                    xpVar.h = L;
                    xpVar.n = L2;
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    xpVar.e = L3;
                    xpVar.f = L4;
                    imageView.setBackgroundDrawable(xpVar);
                } else {
                    this.r = new RectF();
                    po0 po0Var = new po0(getContext(), z11 ? 5 : 4);
                    org.telegram.ui.ActionBar.r6.y(this, po0Var, org.telegram.ui.ActionBar.k6.ej, e6Var, PorterDuff.Mode.MULTIPLY);
                    xp xpVar2 = new xp(j02, po0Var);
                    int L5 = org.telegram.messenger.g0.L(46.0f);
                    int L6 = org.telegram.messenger.g0.L(46.0f);
                    xpVar2.h = L5;
                    xpVar2.n = L6;
                    imageView.setBackgroundDrawable(xpVar2);
                    if (!z11) {
                        org.telegram.messenger.g0.r(b0Var);
                        org.telegram.messenger.g0.i3(b0Var, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i3 = org.telegram.ui.ActionBar.k6.dj;
            i10 = org.telegram.ui.ActionBar.k6.ej;
        }
        i11 = i3 + i10;
        imageView.setTag(Integer.valueOf(i11));
        y j022 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(46.0f), org.telegram.ui.ActionBar.k6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.k6.kk : org.telegram.ui.ActionBar.k6.dj : org.telegram.ui.ActionBar.k6.aj, e6Var), org.telegram.ui.ActionBar.k6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.k6.kk : org.telegram.ui.ActionBar.k6.dj : org.telegram.ui.ActionBar.k6.aj, e6Var));
        this.a = j022;
        this.c = 0;
        this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.k6.kk : org.telegram.ui.ActionBar.k6.dj : org.telegram.ui.ActionBar.k6.aj;
        if (z10) {
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        kd h = ld.f(this.d).h(this.n);
        if (h == null) {
            b(bd.M0(2131745628, null), bd.M0(2131745623, null));
            return;
        }
        if (!this.w) {
            b(bd.M0(2131745404, null), bd.M0(2131745403, null));
            return;
        }
        String M0 = bd.M0(2131744848, null);
        int i3 = h.h.k.edit_date;
        b(M0, bd.D(i3 != 0 ? i3 : r0.date));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        int i3 = this.b;
        if (i3 >= 0) {
            hashSet.add(Integer.valueOf(i3));
        }
    }

    public final void b(String str, String str2) {
        this.f.l(str, false);
        this.e.l(str2, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r != null) {
            mi.b0 b0Var = this.E;
            org.telegram.messenger.g0.r(b0Var);
            org.telegram.messenger.g0.i3(b0Var, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.E);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10;
        int i3;
        Paint W0;
        boolean z10 = this.y;
        org.telegram.ui.ActionBar.e6 e6Var = this.x;
        if (!z10 || (W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? org.telegram.messenger.g0.L(73.0f) : 0), getMeasuredHeight(), W0);
        }
        if (this.w) {
            return;
        }
        int i10 = this.d;
        kd h = ld.f(i10).h(this.n);
        org.telegram.ui.Components.u5 u5Var = this.F;
        float f10 = u5Var.c;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        org.telegram.ui.Components.u5 u5Var2 = this.G;
        if (h == null || (i3 = h.c) < currentTime || h.d == Integer.MAX_VALUE) {
            u5Var2.getClass();
            e10 = u5Var2.e(false, 0.0f);
        } else {
            f10 = Math.abs(i3 - currentTime) / h.d;
            e10 = u5Var2.d(true);
        }
        float f11 = e10;
        float f12 = f10;
        if (f11 <= 0.0f) {
            return;
        }
        if (bd.a0) {
            this.r.set(org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
        } else {
            this.r.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
        }
        canvas2.save();
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f11);
        canvas2.scale(T1, T1, this.r.centerX(), this.r.centerY());
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.gj, e6Var);
        org.telegram.ui.ActionBar.k6.l2.setColor(w02);
        int alpha = org.telegram.ui.ActionBar.k6.l2.getAlpha();
        float f13 = alpha;
        org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (0.2f * f13 * f11));
        canvas2.drawArc(this.r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.l2);
        org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (f13 * f11));
        canvas.drawArc(this.r, -90.0f, u5Var.e(false, f12) * (-360.0f), false, org.telegram.ui.ActionBar.k6.l2);
        org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
        org.telegram.ui.Components.g6 g6Var = this.I;
        if (h != null) {
            g6Var.t(bd.C(Math.abs(h.c - currentTime)), true, true);
        }
        int length = g6Var.i.length();
        float e11 = this.H.e(false, length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f);
        canvas.scale(e11, e11, this.r.centerX(), this.r.centerY());
        g6Var.u(w02);
        g6Var.B = (int) (f11 * 255.0f);
        RectF rectF = this.r;
        int i11 = (int) rectF.left;
        int centerY = (int) (rectF.centerY() - org.telegram.messenger.g0.L(13.0f));
        RectF rectF2 = this.r;
        g6Var.setBounds(i11, centerY, (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.g0.L(12.0f)));
        g6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        this.n = j10;
        if (this.s) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        if (ld.f(this.d).h(this.n) == null) {
            this.f.setAlpha(z10 ? 1.0f : 0.5f);
            this.e.setAlpha(z10 ? 1.0f : 0.5f);
            this.h.setAlpha(z10 ? 1.0f : 0.5f);
        }
        if (this.s) {
            a();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3;
        int w02;
        try {
            if (this.a == null || (i3 = this.b) < 0 || (w02 = org.telegram.ui.ActionBar.k6.w0(i3, this.x)) == this.c) {
                return;
            }
            this.c = w02;
            org.telegram.ui.ActionBar.k6.H1(this.a, w02, false);
            org.telegram.ui.ActionBar.k6.H1(this.a, w02, true);
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.I || super.verifyDrawable(drawable);
    }
}
