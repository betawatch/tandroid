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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i1a extends FrameLayout implements tjb {
    public final bg7 E;
    public final lm F;
    public final lm G;
    public final lm H;
    public final gn I;
    public final ff0 a;
    public final int b;
    public int c;
    public final int d;
    public final jia e;
    public final jia f;
    public final ImageView h;
    public long n;
    public final RectF r;
    public final boolean s;
    public final boolean w;
    public final wjb x;
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
    public i1a(wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i;
        int i2;
        int i3;
        this.b = -1;
        this.d = y6c.t0;
        bg7 bg7Var = new bg7(this, (byte) 26);
        this.E = bg7Var;
        s33 s33Var = s33.h;
        this.F = new lm(350L, this, s33Var);
        this.G = new lm(350L, this, s33Var);
        this.H = new lm(350L, this, s33Var);
        gn gnVar = new gn(false, true, false);
        this.I = gnVar;
        gnVar.n(0.3f, 320L, s33Var);
        gnVar.w(gl.L(12.0f));
        gnVar.x(Typeface.DEFAULT_BOLD);
        gnVar.b = 17;
        gnVar.setCallback(this);
        this.x = wjbVar;
        this.s = z;
        this.w = z2;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        boolean z3 = k96.a0;
        addView(imageView, nme.d(46, 46.0f, (z3 ? 5 : 3) | 16, z3 ? 0.0f : 13.0f, 0.0f, z3 ? 13.0f : 0.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.f = jiaVar;
        jiaVar.setTextSize(16);
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        jiaVar.setTypeface(gl.o());
        boolean z4 = k96.a0;
        addView(jiaVar, nme.d(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 16.0f : 73.0f, 9.33f, z4 ? 73.0f : 16.0f, 0.0f));
        jia jiaVar2 = new jia(context);
        this.e = jiaVar2;
        jiaVar2.setTextSize(14);
        zkb.W(jiaVar2, bkb.z6, wjbVar);
        jiaVar2.setGravity(k96.a0 ? 5 : 3);
        boolean z5 = k96.a0;
        addView(jiaVar2, nme.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 16.0f : 73.0f, 33.0f, z5 ? 73.0f : 16.0f, 0.0f));
        jiaVar.setTag(Integer.valueOf(z ? z2 ? bkb.p7 : bkb.hj : bkb.ej));
        zkb.W(jiaVar, z ? z2 ? bkb.p7 : bkb.hj : bkb.ej, wjbVar);
        if (!z) {
            i = bkb.cj;
            i2 = bkb.dj;
        } else {
            if (z2) {
                i3 = bkb.mk;
                imageView.setTag(Integer.valueOf(i3));
                ff0 h0 = bkb.h0(gl.L(46.0f), bkb.v0(!z ? z2 ? bkb.mk : bkb.fj : bkb.cj, wjbVar), bkb.v0(!z ? z2 ? bkb.mk : bkb.fj : bkb.cj, wjbVar));
                this.a = h0;
                this.c = 0;
                this.b = !z ? z2 ? bkb.mk : bkb.fj : bkb.cj;
                if (z) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    zkb.x(this, mutate, bkb.dj, wjbVar, PorterDuff.Mode.MULTIPLY);
                    fm2 fm2Var = new fm2(h0, mutate);
                    int L = gl.L(46.0f);
                    int L2 = gl.L(46.0f);
                    fm2Var.h = L;
                    fm2Var.n = L2;
                    int L3 = gl.L(24.0f);
                    int L4 = gl.L(24.0f);
                    fm2Var.e = L3;
                    fm2Var.f = L4;
                    imageView.setBackgroundDrawable(fm2Var);
                } else {
                    this.r = new RectF();
                    xaa xaaVar = new xaa(getContext(), z2 ? 5 : 4);
                    zkb.x(this, xaaVar, bkb.gj, wjbVar, PorterDuff.Mode.MULTIPLY);
                    fm2 fm2Var2 = new fm2(h0, xaaVar);
                    int L5 = gl.L(46.0f);
                    int L6 = gl.L(46.0f);
                    fm2Var2.h = L5;
                    fm2Var2.n = L6;
                    imageView.setBackgroundDrawable(fm2Var2);
                    if (!z2) {
                        gl.r(bg7Var);
                        gl.e3(bg7Var, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i = bkb.fj;
            i2 = bkb.gj;
        }
        i3 = i + i2;
        imageView.setTag(Integer.valueOf(i3));
        ff0 h02 = bkb.h0(gl.L(46.0f), bkb.v0(!z ? z2 ? bkb.mk : bkb.fj : bkb.cj, wjbVar), bkb.v0(!z ? z2 ? bkb.mk : bkb.fj : bkb.cj, wjbVar));
        this.a = h02;
        this.c = 0;
        this.b = !z ? z2 ? bkb.mk : bkb.fj : bkb.cj;
        if (z) {
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        db6 h = eb6.f(this.d).h(this.n);
        if (h == null) {
            b(k96.M0(2131745426, null), k96.M0(2131745421, null));
            return;
        }
        if (!this.w) {
            b(k96.M0(2131745202, null), k96.M0(2131745201, null));
            return;
        }
        String M0 = k96.M0(2131744601, null);
        int i = h.h.k.edit_date;
        b(M0, k96.D(i != 0 ? i : r0.date));
    }

    @Override // tjb
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
            bg7 bg7Var = this.E;
            gl.r(bg7Var);
            gl.e3(bg7Var, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gl.r(this.E);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e;
        int i;
        Paint U0;
        boolean z = this.y;
        wjb wjbVar = this.x;
        if (!z || (U0 = bkb.U0("paintDivider", wjbVar)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(k96.a0 ? 0.0f : gl.L(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(73.0f) : 0), getMeasuredHeight(), U0);
        }
        if (this.w) {
            return;
        }
        int i2 = this.d;
        db6 h = eb6.f(i2).h(this.n);
        lm lmVar = this.F;
        float f = lmVar.c;
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        lm lmVar2 = this.G;
        if (h == null || (i = h.c) < currentTime || h.d == Integer.MAX_VALUE) {
            lmVar2.getClass();
            e = lmVar2.e(false, 0.0f);
        } else {
            f = Math.abs(i - currentTime) / h.d;
            e = lmVar2.d(true);
        }
        float f2 = e;
        float f3 = f;
        if (f2 <= 0.0f) {
            return;
        }
        boolean z2 = k96.a0;
        RectF rectF = this.r;
        if (z2) {
            rectF.set(gl.L(13.0f), (getMeasuredHeight() / 2.0f) - gl.L(15.0f), gl.L(43.0f), (getMeasuredHeight() / 2.0f) + gl.L(15.0f));
        } else {
            rectF.set(getMeasuredWidth() - gl.L(43.0f), (getMeasuredHeight() / 2.0f) - gl.L(15.0f), getMeasuredWidth() - gl.L(13.0f), (getMeasuredHeight() / 2.0f) + gl.L(15.0f));
        }
        canvas2.save();
        float R1 = gl.R1(0.6f, 1.0f, f2);
        canvas2.scale(R1, R1, rectF.centerX(), rectF.centerY());
        int v0 = bkb.v0(bkb.ij, wjbVar);
        bkb.k2.setColor(v0);
        int alpha = bkb.k2.getAlpha();
        float f4 = alpha;
        bkb.k2.setAlpha((int) (0.2f * f4 * f2));
        canvas2.drawArc(this.r, -90.0f, 360.0f, false, bkb.k2);
        bkb.k2.setAlpha((int) (f4 * f2));
        canvas.drawArc(this.r, -90.0f, lmVar.e(false, f3) * (-360.0f), false, bkb.k2);
        bkb.k2.setAlpha(alpha);
        gn gnVar = this.I;
        if (h != null) {
            gnVar.t(k96.C(Math.abs(h.c - currentTime)), true, true);
        }
        int length = gnVar.i.length();
        float e2 = this.H.e(false, length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f);
        canvas.scale(e2, e2, rectF.centerX(), rectF.centerY());
        gnVar.u(v0);
        gnVar.C = (int) (f2 * 255.0f);
        gnVar.setBounds((int) rectF.left, (int) (rectF.centerY() - gl.L(13.0f)), (int) rectF.right, (int) (rectF.centerY() + gl.L(12.0f)));
        gnVar.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), TLObject.FLAG_30));
    }

    public void setDialogId(long j) {
        this.n = j;
        if (this.s) {
            a();
        }
    }

    public void setHasLocation(boolean z) {
        if (eb6.f(this.d).h(this.n) == null) {
            this.f.setAlpha(z ? 1.0f : 0.5f);
            this.e.setAlpha(z ? 1.0f : 0.5f);
            this.h.setAlpha(z ? 1.0f : 0.5f);
        }
        if (this.s) {
            a();
        }
    }

    @Override // tjb
    public final void updateColors() {
        int v0;
        ff0 ff0Var = this.a;
        if (ff0Var != null) {
            try {
                int i = this.b;
                if (i < 0 || (v0 = bkb.v0(i, this.x)) == this.c) {
                    return;
                }
                this.c = v0;
                bkb.F1(ff0Var, v0, false);
                bkb.F1(ff0Var, v0, true);
                ImageView imageView = this.h;
                if (imageView != null) {
                    imageView.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.I || super.verifyDrawable(drawable);
    }
}
