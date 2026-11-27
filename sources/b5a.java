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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b5a extends FrameLayout implements snb {
    public final li7 E;
    public final mm F;
    public final mm G;
    public final mm H;
    public final hn I;
    public final hf0 a;
    public final int b;
    public int c;
    public final int d;
    public final ema e;
    public final ema f;
    public final ImageView h;
    public long n;
    public final RectF r;
    public final boolean s;
    public final boolean w;
    public final vnb x;
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
    public b5a(vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i;
        int i2;
        int i3;
        this.b = -1;
        this.d = yac.t0;
        li7 li7Var = new li7(this, (byte) 26);
        this.E = li7Var;
        k43 k43Var = k43.h;
        this.F = new mm(350L, this, k43Var);
        this.G = new mm(350L, this, k43Var);
        this.H = new mm(350L, this, k43Var);
        hn hnVar = new hn(false, true, false);
        this.I = hnVar;
        hnVar.n(0.3f, 320L, k43Var);
        hnVar.w(hl.L(12.0f));
        hnVar.x(Typeface.DEFAULT_BOLD);
        hnVar.b = 17;
        hnVar.setCallback(this);
        this.x = vnbVar;
        this.s = z;
        this.w = z2;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        boolean z3 = ob6.a0;
        addView(imageView, tre.d(46, 46.0f, (z3 ? 5 : 3) | 16, z3 ? 0.0f : 13.0f, 0.0f, z3 ? 13.0f : 0.0f, 0.0f));
        ema emaVar = new ema(context);
        this.f = emaVar;
        emaVar.setTextSize(16);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        emaVar.setTypeface(hl.o());
        boolean z4 = ob6.a0;
        addView(emaVar, tre.d(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 16.0f : 73.0f, 9.33f, z4 ? 73.0f : 16.0f, 0.0f));
        ema emaVar2 = new ema(context);
        this.e = emaVar2;
        emaVar2.setTextSize(14);
        yob.W(emaVar2, aob.A6, vnbVar);
        emaVar2.setGravity(ob6.a0 ? 5 : 3);
        boolean z5 = ob6.a0;
        addView(emaVar2, tre.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 16.0f : 73.0f, 33.0f, z5 ? 73.0f : 16.0f, 0.0f));
        emaVar.setTag(Integer.valueOf(z ? z2 ? aob.q7 : aob.ij : aob.fj));
        yob.W(emaVar, z ? z2 ? aob.q7 : aob.ij : aob.fj, vnbVar);
        if (!z) {
            i = aob.dj;
            i2 = aob.ej;
        } else {
            if (z2) {
                i3 = aob.nk;
                imageView.setTag(Integer.valueOf(i3));
                hf0 h0 = aob.h0(hl.L(46.0f), aob.v0(!z ? z2 ? aob.nk : aob.gj : aob.dj, vnbVar), aob.v0(!z ? z2 ? aob.nk : aob.gj : aob.dj, vnbVar));
                this.a = h0;
                this.c = 0;
                this.b = !z ? z2 ? aob.nk : aob.gj : aob.dj;
                if (z) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    yob.x(this, mutate, aob.ej, vnbVar, PorterDuff.Mode.MULTIPLY);
                    zm2 zm2Var = new zm2(h0, mutate);
                    int L = hl.L(46.0f);
                    int L2 = hl.L(46.0f);
                    zm2Var.h = L;
                    zm2Var.n = L2;
                    int L3 = hl.L(24.0f);
                    int L4 = hl.L(24.0f);
                    zm2Var.e = L3;
                    zm2Var.f = L4;
                    imageView.setBackgroundDrawable(zm2Var);
                } else {
                    this.r = new RectF();
                    oea oeaVar = new oea(getContext(), z2 ? 5 : 4);
                    yob.x(this, oeaVar, aob.hj, vnbVar, PorterDuff.Mode.MULTIPLY);
                    zm2 zm2Var2 = new zm2(h0, oeaVar);
                    int L5 = hl.L(46.0f);
                    int L6 = hl.L(46.0f);
                    zm2Var2.h = L5;
                    zm2Var2.n = L6;
                    imageView.setBackgroundDrawable(zm2Var2);
                    if (!z2) {
                        hl.r(li7Var);
                        hl.d3(li7Var, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i = aob.gj;
            i2 = aob.hj;
        }
        i3 = i + i2;
        imageView.setTag(Integer.valueOf(i3));
        hf0 h02 = aob.h0(hl.L(46.0f), aob.v0(!z ? z2 ? aob.nk : aob.gj : aob.dj, vnbVar), aob.v0(!z ? z2 ? aob.nk : aob.gj : aob.dj, vnbVar));
        this.a = h02;
        this.c = 0;
        this.b = !z ? z2 ? aob.nk : aob.gj : aob.dj;
        if (z) {
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        hd6 h = id6.f(this.d).h(this.n);
        if (h == null) {
            b(ob6.M0(2131745346, null), ob6.M0(2131745341, null));
            return;
        }
        if (!this.w) {
            b(ob6.M0(2131745122, null), ob6.M0(2131745121, null));
            return;
        }
        String M0 = ob6.M0(2131744495, null);
        int i = h.h.k.edit_date;
        b(M0, ob6.D(i != 0 ? i : r0.date));
    }

    @Override // snb
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
            li7 li7Var = this.E;
            hl.r(li7Var);
            hl.d3(li7Var, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hl.r(this.E);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e;
        int i;
        Paint U0;
        boolean z = this.y;
        vnb vnbVar = this.x;
        if (!z || (U0 = aob.U0("paintDivider", vnbVar)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(ob6.a0 ? 0.0f : hl.L(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(73.0f) : 0), getMeasuredHeight(), U0);
        }
        if (this.w) {
            return;
        }
        int i2 = this.d;
        hd6 h = id6.f(i2).h(this.n);
        mm mmVar = this.F;
        float f = mmVar.c;
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        mm mmVar2 = this.G;
        if (h == null || (i = h.c) < currentTime || h.d == Integer.MAX_VALUE) {
            mmVar2.getClass();
            e = mmVar2.e(false, 0.0f);
        } else {
            f = Math.abs(i - currentTime) / h.d;
            e = mmVar2.d(true);
        }
        float f2 = e;
        float f3 = f;
        if (f2 <= 0.0f) {
            return;
        }
        boolean z2 = ob6.a0;
        RectF rectF = this.r;
        if (z2) {
            rectF.set(hl.L(13.0f), (getMeasuredHeight() / 2.0f) - hl.L(15.0f), hl.L(43.0f), (getMeasuredHeight() / 2.0f) + hl.L(15.0f));
        } else {
            rectF.set(getMeasuredWidth() - hl.L(43.0f), (getMeasuredHeight() / 2.0f) - hl.L(15.0f), getMeasuredWidth() - hl.L(13.0f), (getMeasuredHeight() / 2.0f) + hl.L(15.0f));
        }
        canvas2.save();
        float R1 = hl.R1(0.6f, 1.0f, f2);
        canvas2.scale(R1, R1, rectF.centerX(), rectF.centerY());
        int v0 = aob.v0(aob.jj, vnbVar);
        aob.l2.setColor(v0);
        int alpha = aob.l2.getAlpha();
        float f4 = alpha;
        aob.l2.setAlpha((int) (0.2f * f4 * f2));
        canvas2.drawArc(this.r, -90.0f, 360.0f, false, aob.l2);
        aob.l2.setAlpha((int) (f4 * f2));
        canvas.drawArc(this.r, -90.0f, mmVar.e(false, f3) * (-360.0f), false, aob.l2);
        aob.l2.setAlpha(alpha);
        hn hnVar = this.I;
        if (h != null) {
            hnVar.t(ob6.C(Math.abs(h.c - currentTime)), true, true);
        }
        int length = hnVar.i.length();
        float e2 = this.H.e(false, length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f);
        canvas.scale(e2, e2, rectF.centerX(), rectF.centerY());
        hnVar.u(v0);
        hnVar.C = (int) (f2 * 255.0f);
        hnVar.setBounds((int) rectF.left, (int) (rectF.centerY() - hl.L(13.0f)), (int) rectF.right, (int) (rectF.centerY() + hl.L(12.0f)));
        hnVar.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), TLObject.FLAG_30));
    }

    public void setDialogId(long j) {
        this.n = j;
        if (this.s) {
            a();
        }
    }

    public void setHasLocation(boolean z) {
        if (id6.f(this.d).h(this.n) == null) {
            this.f.setAlpha(z ? 1.0f : 0.5f);
            this.e.setAlpha(z ? 1.0f : 0.5f);
            this.h.setAlpha(z ? 1.0f : 0.5f);
        }
        if (this.s) {
            a();
        }
    }

    @Override // snb
    public final void updateColors() {
        int v0;
        hf0 hf0Var = this.a;
        if (hf0Var != null) {
            try {
                int i = this.b;
                if (i < 0 || (v0 = aob.v0(i, this.x)) == this.c) {
                    return;
                }
                this.c = v0;
                aob.F1(hf0Var, v0, false);
                aob.F1(hf0Var, v0, true);
                ImageView imageView = this.h;
                if (imageView != null) {
                    imageView.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.I || super.verifyDrawable(drawable);
    }
}
