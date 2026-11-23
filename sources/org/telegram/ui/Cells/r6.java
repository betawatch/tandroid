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
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.qd;
import org.telegram.messenger.rd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class r6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final j6.o E;
    public final org.telegram.ui.Components.d6 F;
    public final org.telegram.ui.Components.d6 G;
    public final org.telegram.ui.Components.d6 H;
    public final org.telegram.ui.Components.n6 I;
    public final y a;
    public final int b;
    public int c;
    public final int d;
    public final org.telegram.ui.ActionBar.m5 e;
    public final org.telegram.ui.ActionBar.m5 f;
    public final ImageView h;
    public long n;
    public final RectF r;
    public final boolean s;
    public final boolean w;
    public final org.telegram.ui.ActionBar.h6 x;
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
    public r6(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.b = -1;
        this.d = k10.t0;
        j6.o oVar = new j6.o(this, 24);
        this.E = oVar;
        nr nrVar = nr.h;
        this.F = new org.telegram.ui.Components.d6(this, 350L, nrVar);
        this.G = new org.telegram.ui.Components.d6(this, 350L, nrVar);
        this.H = new org.telegram.ui.Components.d6(this, 350L, nrVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, false);
        this.I = n6Var;
        n6Var.n(0.3f, 320L, nrVar);
        n6Var.w(org.telegram.messenger.g0.L(12.0f));
        n6Var.x(Typeface.DEFAULT_BOLD);
        n6Var.b = 17;
        n6Var.setCallback(this);
        this.x = h6Var;
        this.s = z10;
        this.w = z11;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        boolean z12 = hd.a0;
        addView(imageView, c8.ma.d(46, 46.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 13.0f, 0.0f, z12 ? 13.0f : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f = m5Var;
        m5Var.setTextSize(16);
        m5Var.setGravity(hd.a0 ? 5 : 3);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z13 = hd.a0;
        addView(m5Var, c8.ma.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 16.0f : 73.0f, 9.33f, z13 ? 73.0f : 16.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.e = m5Var2;
        m5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.A6, h6Var);
        m5Var2.setGravity(hd.a0 ? 5 : 3);
        boolean z14 = hd.a0;
        addView(m5Var2, c8.ma.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 16.0f : 73.0f, 33.0f, z14 ? 73.0f : 16.0f, 0.0f));
        m5Var.setTag(Integer.valueOf(z10 ? z11 ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.ij : org.telegram.ui.ActionBar.m6.fj));
        org.telegram.ui.ActionBar.t6.X(m5Var, z10 ? z11 ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.ij : org.telegram.ui.ActionBar.m6.fj, h6Var);
        if (!z10) {
            i7 = org.telegram.ui.ActionBar.m6.dj;
            i10 = org.telegram.ui.ActionBar.m6.ej;
        } else {
            if (z11) {
                i11 = org.telegram.ui.ActionBar.m6.nk;
                imageView.setTag(Integer.valueOf(i11));
                y j02 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(46.0f), org.telegram.ui.ActionBar.m6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.m6.nk : org.telegram.ui.ActionBar.m6.gj : org.telegram.ui.ActionBar.m6.dj, h6Var), org.telegram.ui.ActionBar.m6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.m6.nk : org.telegram.ui.ActionBar.m6.gj : org.telegram.ui.ActionBar.m6.dj, h6Var));
                this.a = j02;
                this.c = 0;
                this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.m6.nk : org.telegram.ui.ActionBar.m6.gj : org.telegram.ui.ActionBar.m6.dj;
                if (z10) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.ej, h6Var, PorterDuff.Mode.MULTIPLY);
                    oq oqVar = new oq(j02, mutate);
                    int L = org.telegram.messenger.g0.L(46.0f);
                    int L2 = org.telegram.messenger.g0.L(46.0f);
                    oqVar.h = L;
                    oqVar.n = L2;
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    oqVar.e = L3;
                    oqVar.f = L4;
                    imageView.setBackgroundDrawable(oqVar);
                } else {
                    this.r = new RectF();
                    bp0 bp0Var = new bp0(getContext(), z11 ? 5 : 4);
                    org.telegram.ui.ActionBar.t6.x(this, bp0Var, org.telegram.ui.ActionBar.m6.hj, h6Var, PorterDuff.Mode.MULTIPLY);
                    oq oqVar2 = new oq(j02, bp0Var);
                    int L5 = org.telegram.messenger.g0.L(46.0f);
                    int L6 = org.telegram.messenger.g0.L(46.0f);
                    oqVar2.h = L5;
                    oqVar2.n = L6;
                    imageView.setBackgroundDrawable(oqVar2);
                    if (!z11) {
                        org.telegram.messenger.g0.r(oVar);
                        org.telegram.messenger.g0.h3(oVar, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i7 = org.telegram.ui.ActionBar.m6.gj;
            i10 = org.telegram.ui.ActionBar.m6.hj;
        }
        i11 = i7 + i10;
        imageView.setTag(Integer.valueOf(i11));
        y j022 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(46.0f), org.telegram.ui.ActionBar.m6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.m6.nk : org.telegram.ui.ActionBar.m6.gj : org.telegram.ui.ActionBar.m6.dj, h6Var), org.telegram.ui.ActionBar.m6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.m6.nk : org.telegram.ui.ActionBar.m6.gj : org.telegram.ui.ActionBar.m6.dj, h6Var));
        this.a = j022;
        this.c = 0;
        this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.m6.nk : org.telegram.ui.ActionBar.m6.gj : org.telegram.ui.ActionBar.m6.dj;
        if (z10) {
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        qd h = rd.f(this.d).h(this.n);
        if (h == null) {
            b(hd.N0(2131745422, null), hd.N0(2131745417, null));
            return;
        }
        if (!this.w) {
            b(hd.N0(2131745198, null), hd.N0(2131745197, null));
            return;
        }
        String N0 = hd.N0(2131744595, null);
        int i7 = h.h.k.edit_date;
        b(N0, hd.D(i7 != 0 ? i7 : r0.date));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        int i7 = this.b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
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
            j6.o oVar = this.E;
            org.telegram.messenger.g0.r(oVar);
            org.telegram.messenger.g0.h3(oVar, 1000L);
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
        int i7;
        Paint W0;
        boolean z10 = this.y;
        org.telegram.ui.ActionBar.h6 h6Var = this.x;
        if (!z10 || (W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(73.0f) : 0), getMeasuredHeight(), W0);
        }
        if (this.w) {
            return;
        }
        int i10 = this.d;
        qd h = rd.f(i10).h(this.n);
        org.telegram.ui.Components.d6 d6Var = this.F;
        float f10 = d6Var.c;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        org.telegram.ui.Components.d6 d6Var2 = this.G;
        if (h == null || (i7 = h.c) < currentTime || h.d == Integer.MAX_VALUE) {
            d6Var2.getClass();
            e10 = d6Var2.e(false, 0.0f);
        } else {
            f10 = Math.abs(i7 - currentTime) / h.d;
            e10 = d6Var2.d(true);
        }
        float f11 = e10;
        float f12 = f10;
        if (f11 <= 0.0f) {
            return;
        }
        if (hd.a0) {
            this.r.set(org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
        } else {
            this.r.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
        }
        canvas2.save();
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f11);
        canvas2.scale(T1, T1, this.r.centerX(), this.r.centerY());
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.jj, h6Var);
        org.telegram.ui.ActionBar.m6.l2.setColor(w02);
        int alpha = org.telegram.ui.ActionBar.m6.l2.getAlpha();
        float f13 = alpha;
        org.telegram.ui.ActionBar.m6.l2.setAlpha((int) (0.2f * f13 * f11));
        canvas2.drawArc(this.r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.m6.l2);
        org.telegram.ui.ActionBar.m6.l2.setAlpha((int) (f13 * f11));
        canvas.drawArc(this.r, -90.0f, d6Var.e(false, f12) * (-360.0f), false, org.telegram.ui.ActionBar.m6.l2);
        org.telegram.ui.ActionBar.m6.l2.setAlpha(alpha);
        org.telegram.ui.Components.n6 n6Var = this.I;
        if (h != null) {
            n6Var.t(hd.C(Math.abs(h.c - currentTime)), true, true);
        }
        int length = n6Var.i.length();
        float e11 = this.H.e(false, length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f);
        canvas.scale(e11, e11, this.r.centerX(), this.r.centerY());
        n6Var.u(w02);
        n6Var.C = (int) (f11 * 255.0f);
        RectF rectF = this.r;
        int i11 = (int) rectF.left;
        int centerY = (int) (rectF.centerY() - org.telegram.messenger.g0.L(13.0f));
        RectF rectF2 = this.r;
        n6Var.setBounds(i11, centerY, (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.g0.L(12.0f)));
        n6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
    }

    public void setDialogId(long j3) {
        this.n = j3;
        if (this.s) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        if (rd.f(this.d).h(this.n) == null) {
            this.f.setAlpha(z10 ? 1.0f : 0.5f);
            this.e.setAlpha(z10 ? 1.0f : 0.5f);
            this.h.setAlpha(z10 ? 1.0f : 0.5f);
        }
        if (this.s) {
            a();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7;
        int w02;
        try {
            if (this.a == null || (i7 = this.b) < 0 || (w02 = org.telegram.ui.ActionBar.m6.w0(i7, this.x)) == this.c) {
                return;
            }
            this.c = w02;
            org.telegram.ui.ActionBar.m6.H1(this.a, w02, false);
            org.telegram.ui.ActionBar.m6.H1(this.a, w02, true);
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
