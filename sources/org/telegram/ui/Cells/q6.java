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
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.rd;
import org.telegram.messenger.sd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final m.f3 D;
    public final org.telegram.ui.Components.v5 E;
    public final org.telegram.ui.Components.v5 F;
    public final org.telegram.ui.Components.v5 G;
    public final org.telegram.ui.Components.h6 H;
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
    public q6(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.b = -1;
        this.d = p10.s0;
        m.f3 f3Var = new m.f3(this, 21);
        this.D = f3Var;
        wq wqVar = wq.h;
        this.E = new org.telegram.ui.Components.v5(this, 350L, wqVar);
        this.F = new org.telegram.ui.Components.v5(this, 350L, wqVar);
        this.G = new org.telegram.ui.Components.v5(this, 350L, wqVar);
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(false, true, false);
        this.H = h6Var2;
        h6Var2.n(0.3f, 320L, wqVar);
        h6Var2.w(org.telegram.messenger.g0.L(12.0f));
        h6Var2.x(Typeface.DEFAULT_BOLD);
        h6Var2.b = 17;
        h6Var2.setCallback(this);
        this.x = h6Var;
        this.s = z9;
        this.w = z10;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        boolean z11 = id.a0;
        addView(imageView, c8.ha.d(46, 46.0f, (z11 ? 5 : 3) | 16, z11 ? 0.0f : 13.0f, 0.0f, z11 ? 13.0f : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f = m5Var;
        m5Var.setTextSize(16);
        m5Var.setGravity(id.a0 ? 5 : 3);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z12 = id.a0;
        addView(m5Var, c8.ha.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 16.0f : 73.0f, 9.33f, z12 ? 73.0f : 16.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.e = m5Var2;
        m5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.A6, h6Var);
        m5Var2.setGravity(id.a0 ? 5 : 3);
        boolean z13 = id.a0;
        addView(m5Var2, c8.ha.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 16.0f : 73.0f, 33.0f, z13 ? 73.0f : 16.0f, 0.0f));
        m5Var.setTag(Integer.valueOf(z9 ? z10 ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.fj : org.telegram.ui.ActionBar.m6.cj));
        org.telegram.ui.ActionBar.t6.X(m5Var, z9 ? z10 ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.fj : org.telegram.ui.ActionBar.m6.cj, h6Var);
        if (!z9) {
            i7 = org.telegram.ui.ActionBar.m6.aj;
            i10 = org.telegram.ui.ActionBar.m6.bj;
        } else {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.m6.kk;
                imageView.setTag(Integer.valueOf(i11));
                y j02 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(46.0f), org.telegram.ui.ActionBar.m6.w0(!z9 ? z10 ? org.telegram.ui.ActionBar.m6.kk : org.telegram.ui.ActionBar.m6.dj : org.telegram.ui.ActionBar.m6.aj, h6Var), org.telegram.ui.ActionBar.m6.w0(!z9 ? z10 ? org.telegram.ui.ActionBar.m6.kk : org.telegram.ui.ActionBar.m6.dj : org.telegram.ui.ActionBar.m6.aj, h6Var));
                this.a = j02;
                this.c = 0;
                this.b = !z9 ? z10 ? org.telegram.ui.ActionBar.m6.kk : org.telegram.ui.ActionBar.m6.dj : org.telegram.ui.ActionBar.m6.aj;
                if (z9) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.bj, h6Var, PorterDuff.Mode.MULTIPLY);
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
                    no0 no0Var = new no0(getContext(), z10 ? 5 : 4);
                    org.telegram.ui.ActionBar.t6.x(this, no0Var, org.telegram.ui.ActionBar.m6.ej, h6Var, PorterDuff.Mode.MULTIPLY);
                    xp xpVar2 = new xp(j02, no0Var);
                    int L5 = org.telegram.messenger.g0.L(46.0f);
                    int L6 = org.telegram.messenger.g0.L(46.0f);
                    xpVar2.h = L5;
                    xpVar2.n = L6;
                    imageView.setBackgroundDrawable(xpVar2);
                    if (!z10) {
                        org.telegram.messenger.g0.r(f3Var);
                        org.telegram.messenger.g0.i3(f3Var, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i7 = org.telegram.ui.ActionBar.m6.dj;
            i10 = org.telegram.ui.ActionBar.m6.ej;
        }
        i11 = i7 + i10;
        imageView.setTag(Integer.valueOf(i11));
        y j022 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(46.0f), org.telegram.ui.ActionBar.m6.w0(!z9 ? z10 ? org.telegram.ui.ActionBar.m6.kk : org.telegram.ui.ActionBar.m6.dj : org.telegram.ui.ActionBar.m6.aj, h6Var), org.telegram.ui.ActionBar.m6.w0(!z9 ? z10 ? org.telegram.ui.ActionBar.m6.kk : org.telegram.ui.ActionBar.m6.dj : org.telegram.ui.ActionBar.m6.aj, h6Var));
        this.a = j022;
        this.c = 0;
        this.b = !z9 ? z10 ? org.telegram.ui.ActionBar.m6.kk : org.telegram.ui.ActionBar.m6.dj : org.telegram.ui.ActionBar.m6.aj;
        if (z9) {
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        rd h = sd.f(this.d).h(this.n);
        if (h == null) {
            b(id.M0(2131745618, null), id.M0(2131745613, null));
            return;
        }
        if (!this.w) {
            b(id.M0(2131745394, null), id.M0(2131745393, null));
            return;
        }
        String M0 = id.M0(2131744838, null);
        int i7 = h.h.k.edit_date;
        b(M0, id.D(i7 != 0 ? i7 : r0.date));
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
            m.f3 f3Var = this.D;
            org.telegram.messenger.g0.r(f3Var);
            org.telegram.messenger.g0.i3(f3Var, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.D);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10;
        int i7;
        Paint W0;
        boolean z9 = this.y;
        org.telegram.ui.ActionBar.h6 h6Var = this.x;
        if (!z9 || (W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(id.a0 ? 0.0f : org.telegram.messenger.g0.L(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (id.a0 ? org.telegram.messenger.g0.L(73.0f) : 0), getMeasuredHeight(), W0);
        }
        if (this.w) {
            return;
        }
        int i10 = this.d;
        rd h = sd.f(i10).h(this.n);
        org.telegram.ui.Components.v5 v5Var = this.E;
        float f10 = v5Var.c;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        org.telegram.ui.Components.v5 v5Var2 = this.F;
        if (h == null || (i7 = h.c) < currentTime || h.d == Integer.MAX_VALUE) {
            v5Var2.getClass();
            e10 = v5Var2.e(false, 0.0f);
        } else {
            f10 = Math.abs(i7 - currentTime) / h.d;
            e10 = v5Var2.d(true);
        }
        float f11 = e10;
        float f12 = f10;
        if (f11 <= 0.0f) {
            return;
        }
        if (id.a0) {
            this.r.set(org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
        } else {
            this.r.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
        }
        canvas2.save();
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f11);
        canvas2.scale(T1, T1, this.r.centerX(), this.r.centerY());
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.gj, h6Var);
        org.telegram.ui.ActionBar.m6.l2.setColor(w02);
        int alpha = org.telegram.ui.ActionBar.m6.l2.getAlpha();
        float f13 = alpha;
        org.telegram.ui.ActionBar.m6.l2.setAlpha((int) (0.2f * f13 * f11));
        canvas2.drawArc(this.r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.m6.l2);
        org.telegram.ui.ActionBar.m6.l2.setAlpha((int) (f13 * f11));
        canvas.drawArc(this.r, -90.0f, v5Var.e(false, f12) * (-360.0f), false, org.telegram.ui.ActionBar.m6.l2);
        org.telegram.ui.ActionBar.m6.l2.setAlpha(alpha);
        org.telegram.ui.Components.h6 h6Var2 = this.H;
        if (h != null) {
            h6Var2.t(id.C(Math.abs(h.c - currentTime)), true, true);
        }
        int length = h6Var2.i.length();
        float e11 = this.G.e(false, length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f);
        canvas.scale(e11, e11, this.r.centerX(), this.r.centerY());
        h6Var2.u(w02);
        h6Var2.B = (int) (f11 * 255.0f);
        RectF rectF = this.r;
        int i11 = (int) rectF.left;
        int centerY = (int) (rectF.centerY() - org.telegram.messenger.g0.L(13.0f));
        RectF rectF2 = this.r;
        h6Var2.setBounds(i11, centerY, (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.g0.L(12.0f)));
        h6Var2.draw(canvas);
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

    public void setHasLocation(boolean z9) {
        if (sd.f(this.d).h(this.n) == null) {
            this.f.setAlpha(z9 ? 1.0f : 0.5f);
            this.e.setAlpha(z9 ? 1.0f : 0.5f);
            this.h.setAlpha(z9 ? 1.0f : 0.5f);
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
        return drawable == this.H || super.verifyDrawable(drawable);
    }
}
