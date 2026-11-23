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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.pd;
import org.telegram.messenger.qd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lq;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final i6.g E;
    public final org.telegram.ui.Components.c6 F;
    public final org.telegram.ui.Components.c6 G;
    public final org.telegram.ui.Components.c6 H;
    public final org.telegram.ui.Components.m6 I;
    public final y a;
    public final int b;
    public int c;
    public final int d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final org.telegram.ui.ActionBar.n5 f;
    public final ImageView h;
    public long n;
    public final RectF r;
    public final boolean s;
    public final boolean w;
    public final org.telegram.ui.ActionBar.i6 x;
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
    public q6(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.b = -1;
        this.d = i10.t0;
        i6.g gVar = new i6.g(this, 25);
        this.E = gVar;
        kr krVar = kr.h;
        this.F = new org.telegram.ui.Components.c6(this, 350L, krVar);
        this.G = new org.telegram.ui.Components.c6(this, 350L, krVar);
        this.H = new org.telegram.ui.Components.c6(this, 350L, krVar);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, false);
        this.I = m6Var;
        m6Var.n(0.3f, 320L, krVar);
        m6Var.w(org.telegram.messenger.g0.L(12.0f));
        m6Var.x(Typeface.DEFAULT_BOLD);
        m6Var.b = 17;
        m6Var.setCallback(this);
        this.x = i6Var;
        this.s = z10;
        this.w = z11;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        boolean z12 = gd.a0;
        addView(imageView, c8.na.d(46, 46.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 13.0f, 0.0f, z12 ? 13.0f : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f = n5Var;
        n5Var.setTextSize(16);
        n5Var.setGravity(gd.a0 ? 5 : 3);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z13 = gd.a0;
        addView(n5Var, c8.na.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 16.0f : 73.0f, 9.33f, z13 ? 73.0f : 16.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.e = n5Var2;
        n5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.A6, i6Var);
        n5Var2.setGravity(gd.a0 ? 5 : 3);
        boolean z14 = gd.a0;
        addView(n5Var2, c8.na.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 16.0f : 73.0f, 33.0f, z14 ? 73.0f : 16.0f, 0.0f));
        n5Var.setTag(Integer.valueOf(z10 ? z11 ? org.telegram.ui.ActionBar.n6.q7 : org.telegram.ui.ActionBar.n6.ij : org.telegram.ui.ActionBar.n6.fj));
        org.telegram.ui.ActionBar.u6.X(n5Var, z10 ? z11 ? org.telegram.ui.ActionBar.n6.q7 : org.telegram.ui.ActionBar.n6.ij : org.telegram.ui.ActionBar.n6.fj, i6Var);
        if (!z10) {
            i7 = org.telegram.ui.ActionBar.n6.dj;
            i10 = org.telegram.ui.ActionBar.n6.ej;
        } else {
            if (z11) {
                i11 = org.telegram.ui.ActionBar.n6.nk;
                imageView.setTag(Integer.valueOf(i11));
                y j02 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(46.0f), org.telegram.ui.ActionBar.n6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.n6.nk : org.telegram.ui.ActionBar.n6.gj : org.telegram.ui.ActionBar.n6.dj, i6Var), org.telegram.ui.ActionBar.n6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.n6.nk : org.telegram.ui.ActionBar.n6.gj : org.telegram.ui.ActionBar.n6.dj, i6Var));
                this.a = j02;
                this.c = 0;
                this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.n6.nk : org.telegram.ui.ActionBar.n6.gj : org.telegram.ui.ActionBar.n6.dj;
                if (z10) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.ej, i6Var, PorterDuff.Mode.MULTIPLY);
                    lq lqVar = new lq(j02, mutate);
                    int L = org.telegram.messenger.g0.L(46.0f);
                    int L2 = org.telegram.messenger.g0.L(46.0f);
                    lqVar.h = L;
                    lqVar.n = L2;
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    lqVar.e = L3;
                    lqVar.f = L4;
                    imageView.setBackgroundDrawable(lqVar);
                } else {
                    this.r = new RectF();
                    ap0 ap0Var = new ap0(getContext(), z11 ? 5 : 4);
                    org.telegram.ui.ActionBar.u6.x(this, ap0Var, org.telegram.ui.ActionBar.n6.hj, i6Var, PorterDuff.Mode.MULTIPLY);
                    lq lqVar2 = new lq(j02, ap0Var);
                    int L5 = org.telegram.messenger.g0.L(46.0f);
                    int L6 = org.telegram.messenger.g0.L(46.0f);
                    lqVar2.h = L5;
                    lqVar2.n = L6;
                    imageView.setBackgroundDrawable(lqVar2);
                    if (!z11) {
                        org.telegram.messenger.g0.r(gVar);
                        org.telegram.messenger.g0.h3(gVar, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i7 = org.telegram.ui.ActionBar.n6.gj;
            i10 = org.telegram.ui.ActionBar.n6.hj;
        }
        i11 = i7 + i10;
        imageView.setTag(Integer.valueOf(i11));
        y j022 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(46.0f), org.telegram.ui.ActionBar.n6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.n6.nk : org.telegram.ui.ActionBar.n6.gj : org.telegram.ui.ActionBar.n6.dj, i6Var), org.telegram.ui.ActionBar.n6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.n6.nk : org.telegram.ui.ActionBar.n6.gj : org.telegram.ui.ActionBar.n6.dj, i6Var));
        this.a = j022;
        this.c = 0;
        this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.n6.nk : org.telegram.ui.ActionBar.n6.gj : org.telegram.ui.ActionBar.n6.dj;
        if (z10) {
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        pd h = qd.f(this.d).h(this.n);
        if (h == null) {
            b(gd.N0(2131745422, null), gd.N0(2131745417, null));
            return;
        }
        if (!this.w) {
            b(gd.N0(2131745198, null), gd.N0(2131745197, null));
            return;
        }
        String N0 = gd.N0(2131744597, null);
        int i7 = h.h.k.edit_date;
        b(N0, gd.D(i7 != 0 ? i7 : r0.date));
    }

    @Override // org.telegram.ui.ActionBar.c6
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
            i6.g gVar = this.E;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.h3(gVar, 1000L);
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
        org.telegram.ui.ActionBar.i6 i6Var = this.x;
        if (!z10 || (W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", i6Var)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? org.telegram.messenger.g0.L(73.0f) : 0), getMeasuredHeight(), W0);
        }
        if (this.w) {
            return;
        }
        int i10 = this.d;
        pd h = qd.f(i10).h(this.n);
        org.telegram.ui.Components.c6 c6Var = this.F;
        float f10 = c6Var.c;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        org.telegram.ui.Components.c6 c6Var2 = this.G;
        if (h == null || (i7 = h.c) < currentTime || h.d == Integer.MAX_VALUE) {
            c6Var2.getClass();
            e10 = c6Var2.e(false, 0.0f);
        } else {
            f10 = Math.abs(i7 - currentTime) / h.d;
            e10 = c6Var2.d(true);
        }
        float f11 = e10;
        float f12 = f10;
        if (f11 <= 0.0f) {
            return;
        }
        if (gd.a0) {
            this.r.set(org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
        } else {
            this.r.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
        }
        canvas2.save();
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f11);
        canvas2.scale(T1, T1, this.r.centerX(), this.r.centerY());
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.jj, i6Var);
        org.telegram.ui.ActionBar.n6.l2.setColor(w02);
        int alpha = org.telegram.ui.ActionBar.n6.l2.getAlpha();
        float f13 = alpha;
        org.telegram.ui.ActionBar.n6.l2.setAlpha((int) (0.2f * f13 * f11));
        canvas2.drawArc(this.r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.n6.l2);
        org.telegram.ui.ActionBar.n6.l2.setAlpha((int) (f13 * f11));
        canvas.drawArc(this.r, -90.0f, c6Var.e(false, f12) * (-360.0f), false, org.telegram.ui.ActionBar.n6.l2);
        org.telegram.ui.ActionBar.n6.l2.setAlpha(alpha);
        org.telegram.ui.Components.m6 m6Var = this.I;
        if (h != null) {
            m6Var.t(gd.C(Math.abs(h.c - currentTime)), true, true);
        }
        int length = m6Var.i.length();
        float e11 = this.H.e(false, length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f);
        canvas.scale(e11, e11, this.r.centerX(), this.r.centerY());
        m6Var.u(w02);
        m6Var.C = (int) (f11 * 255.0f);
        RectF rectF = this.r;
        int i11 = (int) rectF.left;
        int centerY = (int) (rectF.centerY() - org.telegram.messenger.g0.L(13.0f));
        RectF rectF2 = this.r;
        m6Var.setBounds(i11, centerY, (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.g0.L(12.0f)));
        m6Var.draw(canvas);
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
        if (qd.f(this.d).h(this.n) == null) {
            this.f.setAlpha(z10 ? 1.0f : 0.5f);
            this.e.setAlpha(z10 ? 1.0f : 0.5f);
            this.h.setAlpha(z10 ? 1.0f : 0.5f);
        }
        if (this.s) {
            a();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7;
        int w02;
        try {
            if (this.a == null || (i7 = this.b) < 0 || (w02 = org.telegram.ui.ActionBar.n6.w0(i7, this.x)) == this.c) {
                return;
            }
            this.c = w02;
            org.telegram.ui.ActionBar.n6.H1(this.a, w02, false);
            org.telegram.ui.ActionBar.n6.H1(this.a, w02, true);
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
