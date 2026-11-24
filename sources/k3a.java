// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k3a extends FrameLayout implements vlb {
    public final ei7 E;
    public final ln F;
    public final ln G;
    public final ln H;
    public final ho I;
    public final fg0 a;
    public final int b;
    public int c;
    public final int d;
    public final lka e;
    public final lka f;
    public final ImageView h;
    public long n;
    public final RectF r;
    public final boolean s;
    public final boolean w;
    public final ylb x;
    public boolean y;

    /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k3a(ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i;
        int i2;
        int i3;
        this.b = -1;
        this.d = z8c.t0;
        ei7 ei7Var = new ei7(this, (byte) 26);
        this.E = ei7Var;
        d53 d53Var = d53.h;
        this.F = new ln(350L, this, d53Var);
        this.G = new ln(350L, this, d53Var);
        this.H = new ln(350L, this, d53Var);
        ho hoVar = new ho(false, true, false);
        this.I = hoVar;
        hoVar.n(0.3f, 320L, d53Var);
        hoVar.w(gm.L(12.0f));
        hoVar.x(Typeface.DEFAULT_BOLD);
        hoVar.b = 17;
        hoVar.setCallback(this);
        this.x = ylbVar;
        this.s = z;
        this.w = z2;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        boolean z3 = jb6.a0;
        addView(imageView, qoe.d(46, 46.0f, (z3 ? 5 : 3) | 16, z3 ? 0.0f : 13.0f, 0.0f, z3 ? 13.0f : 0.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.f = lkaVar;
        lkaVar.setTextSize(16);
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        lkaVar.setTypeface(gm.o());
        boolean z4 = jb6.a0;
        addView(lkaVar, qoe.d(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 16.0f : 73.0f, 9.33f, z4 ? 73.0f : 16.0f, 0.0f));
        lka lkaVar2 = new lka(context);
        this.e = lkaVar2;
        lkaVar2.setTextSize(14);
        anb.W(lkaVar2, cmb.z6, ylbVar);
        lkaVar2.setGravity(jb6.a0 ? 5 : 3);
        boolean z5 = jb6.a0;
        addView(lkaVar2, qoe.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 16.0f : 73.0f, 33.0f, z5 ? 73.0f : 16.0f, 0.0f));
        lkaVar.setTag(Integer.valueOf(z ? z2 ? cmb.p7 : cmb.hj : cmb.ej));
        anb.W(lkaVar, z ? z2 ? cmb.p7 : cmb.hj : cmb.ej, ylbVar);
        if (!z) {
            i = cmb.cj;
            i2 = cmb.dj;
        } else {
            if (z2) {
                i3 = cmb.mk;
                imageView.setTag(Integer.valueOf(i3));
                fg0 h0 = cmb.h0(gm.L(46.0f), cmb.v0(!z ? z2 ? cmb.mk : cmb.fj : cmb.cj, ylbVar), cmb.v0(!z ? z2 ? cmb.mk : cmb.fj : cmb.cj, ylbVar));
                this.a = h0;
                this.c = 0;
                this.b = !z ? z2 ? cmb.mk : cmb.fj : cmb.cj;
                if (z) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    anb.x(this, mutate, cmb.dj, ylbVar, PorterDuff.Mode.MULTIPLY);
                    sn2 sn2Var = new sn2(h0, mutate);
                    int L = gm.L(46.0f);
                    int L2 = gm.L(46.0f);
                    sn2Var.h = L;
                    sn2Var.n = L2;
                    int L3 = gm.L(24.0f);
                    int L4 = gm.L(24.0f);
                    sn2Var.e = L3;
                    sn2Var.f = L4;
                    imageView.setBackgroundDrawable(sn2Var);
                } else {
                    this.r = new RectF();
                    xca xcaVar = new xca(getContext(), z2 ? 5 : 4);
                    anb.x(this, xcaVar, cmb.gj, ylbVar, PorterDuff.Mode.MULTIPLY);
                    sn2 sn2Var2 = new sn2(h0, xcaVar);
                    int L5 = gm.L(46.0f);
                    int L6 = gm.L(46.0f);
                    sn2Var2.h = L5;
                    sn2Var2.n = L6;
                    imageView.setBackgroundDrawable(sn2Var2);
                    if (!z2) {
                        gm.r(ei7Var);
                        gm.d3(ei7Var, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i = cmb.fj;
            i2 = cmb.gj;
        }
        i3 = i + i2;
        imageView.setTag(Integer.valueOf(i3));
        fg0 h02 = cmb.h0(gm.L(46.0f), cmb.v0(!z ? z2 ? cmb.mk : cmb.fj : cmb.cj, ylbVar), cmb.v0(!z ? z2 ? cmb.mk : cmb.fj : cmb.cj, ylbVar));
        this.a = h02;
        this.c = 0;
        this.b = !z ? z2 ? cmb.mk : cmb.fj : cmb.cj;
        if (z) {
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        cd6 h = dd6.f(this.d).h(this.n);
        if (h == null) {
            b(jb6.M0(2131745352, null), jb6.M0(2131745347, null));
            return;
        }
        if (!this.w) {
            b(jb6.M0(2131745128, null), jb6.M0(2131745127, null));
            return;
        }
        String M0 = jb6.M0(2131744527, null);
        int i = h.h.k.edit_date;
        b(M0, jb6.D(i != 0 ? i : r0.date));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        int i = this.b;
        if (i >= 0) {
            hashSet.add(Integer.valueOf(i));
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
            ei7 ei7Var = this.E;
            gm.r(ei7Var);
            gm.d3(ei7Var, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.r(this.E);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e;
        int i;
        Paint U0;
        boolean z = this.y;
        ylb ylbVar = this.x;
        if (!z || (U0 = cmb.U0("paintDivider", ylbVar)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(jb6.a0 ? 0.0f : gm.L(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(73.0f) : 0), getMeasuredHeight(), U0);
        }
        if (this.w) {
            return;
        }
        int i2 = this.d;
        cd6 h = dd6.f(i2).h(this.n);
        ln lnVar = this.F;
        float f = lnVar.c;
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        ln lnVar2 = this.G;
        if (h == null || (i = h.c) < currentTime || h.d == Integer.MAX_VALUE) {
            lnVar2.getClass();
            e = lnVar2.e(false, 0.0f);
        } else {
            f = Math.abs(i - currentTime) / h.d;
            e = lnVar2.d(true);
        }
        float f2 = e;
        float f3 = f;
        if (f2 <= 0.0f) {
            return;
        }
        boolean z2 = jb6.a0;
        RectF rectF = this.r;
        if (z2) {
            rectF.set(gm.L(13.0f), (getMeasuredHeight() / 2.0f) - gm.L(15.0f), gm.L(43.0f), (getMeasuredHeight() / 2.0f) + gm.L(15.0f));
        } else {
            rectF.set(getMeasuredWidth() - gm.L(43.0f), (getMeasuredHeight() / 2.0f) - gm.L(15.0f), getMeasuredWidth() - gm.L(13.0f), (getMeasuredHeight() / 2.0f) + gm.L(15.0f));
        }
        canvas2.save();
        float R1 = gm.R1(0.6f, 1.0f, f2);
        canvas2.scale(R1, R1, rectF.centerX(), rectF.centerY());
        int v0 = cmb.v0(cmb.ij, ylbVar);
        cmb.k2.setColor(v0);
        int alpha = cmb.k2.getAlpha();
        float f4 = alpha;
        cmb.k2.setAlpha((int) (0.2f * f4 * f2));
        canvas2.drawArc(this.r, -90.0f, 360.0f, false, cmb.k2);
        cmb.k2.setAlpha((int) (f4 * f2));
        canvas.drawArc(this.r, -90.0f, lnVar.e(false, f3) * (-360.0f), false, cmb.k2);
        cmb.k2.setAlpha(alpha);
        ho hoVar = this.I;
        if (h != null) {
            hoVar.t(jb6.C(Math.abs(h.c - currentTime)), true, true);
        }
        int length = hoVar.i.length();
        float e2 = this.H.e(false, length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f);
        canvas.scale(e2, e2, rectF.centerX(), rectF.centerY());
        hoVar.u(v0);
        hoVar.C = (int) (f2 * 255.0f);
        hoVar.setBounds((int) rectF.left, (int) (rectF.centerY() - gm.L(13.0f)), (int) rectF.right, (int) (rectF.centerY() + gm.L(12.0f)));
        hoVar.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), TLObject.FLAG_30));
    }

    public void setDialogId(long j) {
        this.n = j;
        if (this.s) {
            a();
        }
    }

    public void setHasLocation(boolean z) {
        if (dd6.f(this.d).h(this.n) == null) {
            this.f.setAlpha(z ? 1.0f : 0.5f);
            this.e.setAlpha(z ? 1.0f : 0.5f);
            this.h.setAlpha(z ? 1.0f : 0.5f);
        }
        if (this.s) {
            a();
        }
    }

    @Override // vlb
    public final void updateColors() {
        int v0;
        fg0 fg0Var = this.a;
        if (fg0Var != null) {
            try {
                int i = this.b;
                if (i < 0 || (v0 = cmb.v0(i, this.x)) == this.c) {
                    return;
                }
                this.c = v0;
                cmb.F1(fg0Var, v0, false);
                cmb.F1(fg0Var, v0, true);
                ImageView imageView = this.h;
                if (imageView != null) {
                    imageView.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.I || super.verifyDrawable(drawable);
    }
}
