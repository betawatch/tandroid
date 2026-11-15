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
import org.telegram.messenger.m10;
import org.telegram.messenger.qd;
import org.telegram.messenger.rd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.qo0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final j6.o E;
    public final org.telegram.ui.Components.u5 F;
    public final org.telegram.ui.Components.u5 G;
    public final org.telegram.ui.Components.u5 H;
    public final org.telegram.ui.Components.g6 I;
    public final y a;
    public final int b;
    public int c;
    public final int d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final org.telegram.ui.ActionBar.j5 f;
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
        int i7;
        int i10;
        int i11;
        this.b = -1;
        this.d = m10.t0;
        j6.o oVar = new j6.o(this, 24);
        this.E = oVar;
        er erVar = er.h;
        this.F = new org.telegram.ui.Components.u5(this, 350L, erVar);
        this.G = new org.telegram.ui.Components.u5(this, 350L, erVar);
        this.H = new org.telegram.ui.Components.u5(this, 350L, erVar);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, false);
        this.I = g6Var;
        g6Var.n(0.3f, 320L, erVar);
        g6Var.w(org.telegram.messenger.g0.L(12.0f));
        g6Var.x(Typeface.DEFAULT_BOLD);
        g6Var.b = 17;
        g6Var.setCallback(this);
        this.x = e6Var;
        this.s = z10;
        this.w = z11;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        boolean z12 = hd.a0;
        addView(imageView, c8.ja.d(46, 46.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 13.0f, 0.0f, z12 ? 13.0f : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f = j5Var;
        j5Var.setTextSize(16);
        j5Var.setGravity(hd.a0 ? 5 : 3);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z13 = hd.a0;
        addView(j5Var, c8.ja.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 16.0f : 73.0f, 9.33f, z13 ? 73.0f : 16.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var2;
        j5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.A6, e6Var);
        j5Var2.setGravity(hd.a0 ? 5 : 3);
        boolean z14 = hd.a0;
        addView(j5Var2, c8.ja.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 16.0f : 73.0f, 33.0f, z14 ? 73.0f : 16.0f, 0.0f));
        j5Var.setTag(Integer.valueOf(z10 ? z11 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.ij : org.telegram.ui.ActionBar.j6.fj));
        org.telegram.ui.ActionBar.q6.X(j5Var, z10 ? z11 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.ij : org.telegram.ui.ActionBar.j6.fj, e6Var);
        if (!z10) {
            i7 = org.telegram.ui.ActionBar.j6.dj;
            i10 = org.telegram.ui.ActionBar.j6.ej;
        } else {
            if (z11) {
                i11 = org.telegram.ui.ActionBar.j6.nk;
                imageView.setTag(Integer.valueOf(i11));
                y j02 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(46.0f), org.telegram.ui.ActionBar.j6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.j6.nk : org.telegram.ui.ActionBar.j6.gj : org.telegram.ui.ActionBar.j6.dj, e6Var), org.telegram.ui.ActionBar.j6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.j6.nk : org.telegram.ui.ActionBar.j6.gj : org.telegram.ui.ActionBar.j6.dj, e6Var));
                this.a = j02;
                this.c = 0;
                this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.j6.nk : org.telegram.ui.ActionBar.j6.gj : org.telegram.ui.ActionBar.j6.dj;
                if (z10) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.ej, e6Var, PorterDuff.Mode.MULTIPLY);
                    fq fqVar = new fq(j02, mutate);
                    int L = org.telegram.messenger.g0.L(46.0f);
                    int L2 = org.telegram.messenger.g0.L(46.0f);
                    fqVar.h = L;
                    fqVar.n = L2;
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    fqVar.e = L3;
                    fqVar.f = L4;
                    imageView.setBackgroundDrawable(fqVar);
                } else {
                    this.r = new RectF();
                    qo0 qo0Var = new qo0(getContext(), z11 ? 5 : 4);
                    org.telegram.ui.ActionBar.q6.x(this, qo0Var, org.telegram.ui.ActionBar.j6.hj, e6Var, PorterDuff.Mode.MULTIPLY);
                    fq fqVar2 = new fq(j02, qo0Var);
                    int L5 = org.telegram.messenger.g0.L(46.0f);
                    int L6 = org.telegram.messenger.g0.L(46.0f);
                    fqVar2.h = L5;
                    fqVar2.n = L6;
                    imageView.setBackgroundDrawable(fqVar2);
                    if (!z11) {
                        org.telegram.messenger.g0.r(oVar);
                        org.telegram.messenger.g0.i3(oVar, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i7 = org.telegram.ui.ActionBar.j6.gj;
            i10 = org.telegram.ui.ActionBar.j6.hj;
        }
        i11 = i7 + i10;
        imageView.setTag(Integer.valueOf(i11));
        y j022 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(46.0f), org.telegram.ui.ActionBar.j6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.j6.nk : org.telegram.ui.ActionBar.j6.gj : org.telegram.ui.ActionBar.j6.dj, e6Var), org.telegram.ui.ActionBar.j6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.j6.nk : org.telegram.ui.ActionBar.j6.gj : org.telegram.ui.ActionBar.j6.dj, e6Var));
        this.a = j022;
        this.c = 0;
        this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.j6.nk : org.telegram.ui.ActionBar.j6.gj : org.telegram.ui.ActionBar.j6.dj;
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
            b(hd.M0(2131745618, null), hd.M0(2131745613, null));
            return;
        }
        if (!this.w) {
            b(hd.M0(2131745394, null), hd.M0(2131745393, null));
            return;
        }
        String M0 = hd.M0(2131744838, null);
        int i7 = h.h.k.edit_date;
        b(M0, hd.D(i7 != 0 ? i7 : r0.date));
    }

    @Override // org.telegram.ui.ActionBar.z5
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
            org.telegram.messenger.g0.i3(oVar, 1000L);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.x;
        if (!z10 || (W0 = org.telegram.ui.ActionBar.j6.W0("paintDivider", e6Var)) == null) {
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
        org.telegram.ui.Components.u5 u5Var = this.F;
        float f10 = u5Var.c;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        org.telegram.ui.Components.u5 u5Var2 = this.G;
        if (h == null || (i7 = h.c) < currentTime || h.d == Integer.MAX_VALUE) {
            u5Var2.getClass();
            e10 = u5Var2.e(false, 0.0f);
        } else {
            f10 = Math.abs(i7 - currentTime) / h.d;
            e10 = u5Var2.d(true);
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
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.jj, e6Var);
        org.telegram.ui.ActionBar.j6.l2.setColor(w02);
        int alpha = org.telegram.ui.ActionBar.j6.l2.getAlpha();
        float f13 = alpha;
        org.telegram.ui.ActionBar.j6.l2.setAlpha((int) (0.2f * f13 * f11));
        canvas2.drawArc(this.r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.j6.l2);
        org.telegram.ui.ActionBar.j6.l2.setAlpha((int) (f13 * f11));
        canvas.drawArc(this.r, -90.0f, u5Var.e(false, f12) * (-360.0f), false, org.telegram.ui.ActionBar.j6.l2);
        org.telegram.ui.ActionBar.j6.l2.setAlpha(alpha);
        org.telegram.ui.Components.g6 g6Var = this.I;
        if (h != null) {
            g6Var.t(hd.C(Math.abs(h.c - currentTime)), true, true);
        }
        int length = g6Var.i.length();
        float e11 = this.H.e(false, length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f);
        canvas.scale(e11, e11, this.r.centerX(), this.r.centerY());
        g6Var.u(w02);
        g6Var.C = (int) (f11 * 255.0f);
        RectF rectF = this.r;
        int i11 = (int) rectF.left;
        int centerY = (int) (rectF.centerY() - org.telegram.messenger.g0.L(13.0f));
        RectF rectF2 = this.r;
        g6Var.setBounds(i11, centerY, (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.g0.L(12.0f)));
        g6Var.draw(canvas);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7;
        int w02;
        try {
            if (this.a == null || (i7 = this.b) < 0 || (w02 = org.telegram.ui.ActionBar.j6.w0(i7, this.x)) == this.c) {
                return;
            }
            this.c = w02;
            org.telegram.ui.ActionBar.j6.H1(this.a, w02, false);
            org.telegram.ui.ActionBar.j6.H1(this.a, w02, true);
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
