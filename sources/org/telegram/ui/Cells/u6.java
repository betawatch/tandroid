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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.md;
import org.telegram.messenger.nd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pp0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final mg.c2 D;
    public final org.telegram.ui.Components.t5 E;
    public final org.telegram.ui.Components.t5 F;
    public final org.telegram.ui.Components.t5 G;
    public final org.telegram.ui.Components.e6 H;
    public final y a;
    public final int b;
    public int c;
    public final int d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final org.telegram.ui.ActionBar.u5 f;
    public final ImageView h;
    public long n;
    public final RectF r;
    public final boolean s;
    public final boolean w;
    public final org.telegram.ui.ActionBar.p6 x;
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
    public u6(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.b = -1;
        this.d = d20.s0;
        mg.c2 c2Var = new mg.c2(this, 19);
        this.D = c2Var;
        gr grVar = gr.h;
        this.E = new org.telegram.ui.Components.t5(this, 350L, grVar);
        this.F = new org.telegram.ui.Components.t5(this, 350L, grVar);
        this.G = new org.telegram.ui.Components.t5(this, 350L, grVar);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, false);
        this.H = e6Var;
        e6Var.n(0.3f, 320L, grVar);
        e6Var.w(org.telegram.messenger.i0.L(12.0f));
        e6Var.x(Typeface.DEFAULT_BOLD);
        e6Var.b = 17;
        e6Var.setCallback(this);
        this.x = p6Var;
        this.s = z10;
        this.w = z11;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        boolean z12 = cd.X;
        addView(imageView, w7.b6.d(46, 46.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 13.0f, 0.0f, z12 ? 13.0f : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f = u5Var;
        u5Var.setTextSize(16);
        u5Var.setGravity(cd.X ? 5 : 3);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        boolean z13 = cd.X;
        addView(u5Var, w7.b6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 16.0f : 73.0f, 9.33f, z13 ? 73.0f : 16.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var2;
        u5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.A6, p6Var);
        u5Var2.setGravity(cd.X ? 5 : 3);
        boolean z14 = cd.X;
        addView(u5Var2, w7.b6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 16.0f : 73.0f, 33.0f, z14 ? 73.0f : 16.0f, 0.0f));
        u5Var.setTag(Integer.valueOf(z10 ? z11 ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.fj : org.telegram.ui.ActionBar.t6.cj));
        org.telegram.ui.ActionBar.a7.Y(u5Var, z10 ? z11 ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.fj : org.telegram.ui.ActionBar.t6.cj, p6Var);
        if (!z10) {
            i10 = org.telegram.ui.ActionBar.t6.aj;
            i11 = org.telegram.ui.ActionBar.t6.bj;
        } else {
            if (z11) {
                i12 = org.telegram.ui.ActionBar.t6.kk;
                imageView.setTag(Integer.valueOf(i12));
                y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(46.0f), org.telegram.ui.ActionBar.t6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.t6.kk : org.telegram.ui.ActionBar.t6.dj : org.telegram.ui.ActionBar.t6.aj, p6Var), org.telegram.ui.ActionBar.t6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.t6.kk : org.telegram.ui.ActionBar.t6.dj : org.telegram.ui.ActionBar.t6.aj, p6Var));
                this.a = j02;
                this.c = 0;
                this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.t6.kk : org.telegram.ui.ActionBar.t6.dj : org.telegram.ui.ActionBar.t6.aj;
                if (z10) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.bj, p6Var, PorterDuff.Mode.MULTIPLY);
                    eq eqVar = new eq(j02, mutate);
                    int L = org.telegram.messenger.i0.L(46.0f);
                    int L2 = org.telegram.messenger.i0.L(46.0f);
                    eqVar.h = L;
                    eqVar.n = L2;
                    int L3 = org.telegram.messenger.i0.L(24.0f);
                    int L4 = org.telegram.messenger.i0.L(24.0f);
                    eqVar.e = L3;
                    eqVar.f = L4;
                    imageView.setBackgroundDrawable(eqVar);
                } else {
                    this.r = new RectF();
                    pp0 pp0Var = new pp0(getContext(), z11 ? 5 : 4);
                    org.telegram.ui.ActionBar.a7.y(this, pp0Var, org.telegram.ui.ActionBar.t6.ej, p6Var, PorterDuff.Mode.MULTIPLY);
                    eq eqVar2 = new eq(j02, pp0Var);
                    int L5 = org.telegram.messenger.i0.L(46.0f);
                    int L6 = org.telegram.messenger.i0.L(46.0f);
                    eqVar2.h = L5;
                    eqVar2.n = L6;
                    imageView.setBackgroundDrawable(eqVar2);
                    if (!z11) {
                        org.telegram.messenger.i0.r(c2Var);
                        org.telegram.messenger.i0.h3(c2Var, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i10 = org.telegram.ui.ActionBar.t6.dj;
            i11 = org.telegram.ui.ActionBar.t6.ej;
        }
        i12 = i10 + i11;
        imageView.setTag(Integer.valueOf(i12));
        y j022 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(46.0f), org.telegram.ui.ActionBar.t6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.t6.kk : org.telegram.ui.ActionBar.t6.dj : org.telegram.ui.ActionBar.t6.aj, p6Var), org.telegram.ui.ActionBar.t6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.t6.kk : org.telegram.ui.ActionBar.t6.dj : org.telegram.ui.ActionBar.t6.aj, p6Var));
        this.a = j022;
        this.c = 0;
        this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.t6.kk : org.telegram.ui.ActionBar.t6.dj : org.telegram.ui.ActionBar.t6.aj;
        if (z10) {
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        md h = nd.f(this.d).h(this.n);
        if (h == null) {
            b(cd.L0(2131745635, null), cd.L0(2131745630, null));
            return;
        }
        if (!this.w) {
            b(cd.L0(2131745412, null), cd.L0(2131745411, null));
            return;
        }
        String L0 = cd.L0(2131744856, null);
        int i10 = h.h.k.edit_date;
        b(L0, cd.D(i10 != 0 ? i10 : r0.date));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        int i10 = this.b;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
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
            mg.c2 c2Var = this.D;
            org.telegram.messenger.i0.r(c2Var);
            org.telegram.messenger.i0.h3(c2Var, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.r(this.D);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e;
        int i10;
        Paint W0;
        boolean z10 = this.y;
        org.telegram.ui.ActionBar.p6 p6Var = this.x;
        if (!z10 || (W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(cd.X ? 0.0f : org.telegram.messenger.i0.L(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(73.0f) : 0), getMeasuredHeight(), W0);
        }
        if (this.w) {
            return;
        }
        int i11 = this.d;
        md h = nd.f(i11).h(this.n);
        org.telegram.ui.Components.t5 t5Var = this.E;
        float f7 = t5Var.c;
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        org.telegram.ui.Components.t5 t5Var2 = this.F;
        if (h == null || (i10 = h.c) < currentTime || h.d == Integer.MAX_VALUE) {
            t5Var2.getClass();
            e = t5Var2.e(false, 0.0f);
        } else {
            f7 = Math.abs(i10 - currentTime) / h.d;
            e = t5Var2.d(true);
        }
        float f10 = e;
        float f11 = f7;
        if (f10 <= 0.0f) {
            return;
        }
        if (cd.X) {
            this.r.set(org.telegram.messenger.i0.L(13.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(43.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.i0.L(15.0f));
        } else {
            this.r.set(getMeasuredWidth() - org.telegram.messenger.i0.L(43.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(15.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(13.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.i0.L(15.0f));
        }
        canvas2.save();
        float T1 = org.telegram.messenger.i0.T1(0.6f, 1.0f, f10);
        canvas2.scale(T1, T1, this.r.centerX(), this.r.centerY());
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.gj, p6Var);
        org.telegram.ui.ActionBar.t6.l2.setColor(w02);
        int alpha = org.telegram.ui.ActionBar.t6.l2.getAlpha();
        float f12 = alpha;
        org.telegram.ui.ActionBar.t6.l2.setAlpha((int) (0.2f * f12 * f10));
        canvas2.drawArc(this.r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.t6.l2);
        org.telegram.ui.ActionBar.t6.l2.setAlpha((int) (f12 * f10));
        canvas.drawArc(this.r, -90.0f, t5Var.e(false, f11) * (-360.0f), false, org.telegram.ui.ActionBar.t6.l2);
        org.telegram.ui.ActionBar.t6.l2.setAlpha(alpha);
        org.telegram.ui.Components.e6 e6Var = this.H;
        if (h != null) {
            e6Var.t(cd.C(Math.abs(h.c - currentTime)), true, true);
        }
        int length = e6Var.i.length();
        float e7 = this.G.e(false, length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f);
        canvas.scale(e7, e7, this.r.centerX(), this.r.centerY());
        e6Var.u(w02);
        e6Var.B = (int) (f10 * 255.0f);
        RectF rectF = this.r;
        int i12 = (int) rectF.left;
        int centerY = (int) (rectF.centerY() - org.telegram.messenger.i0.L(13.0f));
        RectF rectF2 = this.r;
        e6Var.setBounds(i12, centerY, (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.i0.L(12.0f)));
        e6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        this.n = j10;
        if (this.s) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        if (nd.f(this.d).h(this.n) == null) {
            this.f.setAlpha(z10 ? 1.0f : 0.5f);
            this.e.setAlpha(z10 ? 1.0f : 0.5f);
            this.h.setAlpha(z10 ? 1.0f : 0.5f);
        }
        if (this.s) {
            a();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10;
        int w02;
        try {
            if (this.a == null || (i10 = this.b) < 0 || (w02 = org.telegram.ui.ActionBar.t6.w0(i10, this.x)) == this.c) {
                return;
            }
            this.c = w02;
            org.telegram.ui.ActionBar.t6.H1(this.a, w02, false);
            org.telegram.ui.ActionBar.t6.H1(this.a, w02, true);
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.H || super.verifyDrawable(drawable);
    }
}
