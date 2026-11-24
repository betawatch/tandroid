// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ib2 {
    public final gb2 a;
    public boolean b;
    public tgb c;
    public tgb d;
    public n41 e;
    public n41 f;
    public StaticLayout g;
    public StaticLayout h;
    public i46 i;
    public m46 j;
    public boolean k;
    public Drawable l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public n79 t;
    public boolean u;
    public boolean v;

    public ib2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int L;
        int extraTextX;
        int i;
        bb2 bb2Var;
        gb2 gb2Var = this.a;
        nb2 nb2Var = gb2Var.ub;
        if (!this.b || this.c == null || this.d == null) {
            return false;
        }
        if (this.e == null) {
            this.e = new n41(gb2Var);
        }
        if (this.f == null) {
            n41 n41Var = new n41(gb2Var);
            this.f = n41Var;
            n41Var.f = new sa2(gb2Var, (byte) 0);
        }
        float backgroundDrawableRight = ((gb2Var.getBackgroundDrawableRight() + (nb2Var != null ? nb2Var.i0 : 0.0f)) - gl.L(10 + ((!gb2Var.Q5.O3() || gb2Var.C6 || gb2Var.K) ? 0 : 6))) - gb2Var.getExtraTextX();
        f27 f27Var = gb2Var.L;
        if (f27Var == null || f27Var.i) {
            if (gb2Var.Q5.O3()) {
                i = gb2Var.getExtraTextX() + gl.L(12.0f) + gb2Var.N6;
                if (gb2Var.Q5.D == 19) {
                    i -= Math.max(0, (gl.L(14.0f) + (Math.max(gb2Var.X7, gb2Var.Z7) + i)) - gl.q.x);
                }
            } else {
                boolean z = gb2Var.C6;
                int i2 = gb2Var.N6;
                if (z) {
                    L = gl.L(12.0f) + i2;
                    extraTextX = gb2Var.getExtraTextX();
                } else {
                    L = gl.L(gb2Var.K ? 12.0f : 18.0f) + i2;
                    extraTextX = gb2Var.getExtraTextX();
                }
                i = L + extraTextX;
            }
        } else {
            i = (int) gb2Var.s3;
        }
        int L2 = ((int) (i + nb2Var.h0)) - gl.L(1.33f);
        int i3 = gb2Var.r0;
        float f = L2;
        int i4 = (int) (backgroundDrawableRight - f);
        int x = (int) motionEvent.getX();
        int P1 = (int) gb2Var.P1(motionEvent);
        int L3 = (int) (gl.L(10.0f) + L2 + this.c.c + gl.L(4.0f));
        int L4 = gl.L(4.33f) + i3;
        RectF rectF = gl.P;
        float f2 = L3;
        rectF.set(f2, L4, this.d.c + f2 + gl.L(4.0f), gl.L(17.33f) + L4);
        boolean contains = rectF.contains(motionEvent.getX(), gb2Var.P1(motionEvent));
        rectF.set(f, i3, L2 + i4, this.r + i3);
        boolean z2 = !contains && !gb2Var.Nc && this.j == null && rectF.contains(motionEvent.getX(), gb2Var.P1(motionEvent));
        if (((z2 && !gb2Var.Nc) || this.j != null) && this.g != null) {
            if (this.i == null) {
                i46 i46Var = new i46(gb2Var);
                this.i = i46Var;
                i46Var.d = new sa2(gb2Var, (byte) 0);
            }
            int L5 = (gl.L(10.0f) + L2) - this.o;
            int L6 = gl.L(22.0f) + i3;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && this.j != null)) {
                if (x < L5 || P1 < L6 || x > L5 + i4 || P1 > this.g.getHeight() + L6) {
                    gb2Var.i3(1);
                } else {
                    try {
                        int i5 = P1 - L6;
                        int lineForVertical = this.g.getLineForVertical(i5);
                        float f3 = x - L5;
                        int offsetForHorizontal = this.g.getOffsetForHorizontal(lineForVertical, f3);
                        float lineLeft = this.g.getLineLeft(lineForVertical);
                        if (lineLeft <= f3 && lineLeft + this.g.getLineWidth(lineForVertical) >= f3) {
                            Spannable spannable = (Spannable) this.g.getText();
                            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (characterStyleArr == null || characterStyleArr.length == 0) {
                                characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, f4c.class);
                            }
                            if (characterStyleArr.length != 0 && ((!(characterStyleArr[0] instanceof d4c) || d4c.h) && !gl.A1())) {
                                int action = motionEvent.getAction();
                                m46 m46Var = this.j;
                                if (action == 0) {
                                    if (m46Var == null || m46Var.i != characterStyleArr[0]) {
                                        this.i.l(m46Var, true);
                                        CharacterStyle characterStyle = characterStyleArr[0];
                                        wjb wjbVar = gb2Var.cc;
                                        float f4 = i5;
                                        float[] fArr = gb2.Id;
                                        m46 m46Var2 = new m46(characterStyle, wjbVar, f3, f4, 0);
                                        this.j = m46Var2;
                                        n79 n79Var = this.t;
                                        if (n79Var != null) {
                                            m46Var2.d(bkb.p1(0.1f, n79Var.h()));
                                        }
                                        try {
                                            b46 b = this.j.b();
                                            int[] Z1 = gb2.Z1(spannable, this.j.i);
                                            b.d(this.g, Z1[0], 0.0f);
                                            this.g.getSelectionPath(Z1[0], Z1[1], b);
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                        this.i.a(this.j, 1);
                                        z2 = false;
                                    }
                                    gb2Var.invalidate();
                                } else if (m46Var != null) {
                                    CharacterStyle characterStyle2 = characterStyleArr[0];
                                    CharacterStyle characterStyle3 = m46Var.i;
                                    if (characterStyle2 == characterStyle3) {
                                        gb2Var.eb.P(gb2Var, characterStyle3, false);
                                        gb2Var.i3(1);
                                        this.u = false;
                                        this.v = false;
                                        this.j = null;
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
            }
        }
        boolean z3 = this.n && z2;
        if (motionEvent.getAction() == 0) {
            this.u = contains;
            this.v = z3;
        } else if (motionEvent.getAction() == 2) {
            this.u = contains;
            this.v = z3;
        } else if (motionEvent.getAction() == 1) {
            if (this.u) {
                bb2 bb2Var2 = gb2Var.eb;
                if (bb2Var2 != null) {
                    bb2Var2.w0(gb2Var, (int) ((this.d.c / 2.0f) + gl.L(4.0f) + L3), L4);
                }
            } else if (this.v && !nb2Var.a3 && (bb2Var = gb2Var.eb) != null) {
                bb2Var.X0(gb2Var);
            }
            this.u = false;
            this.v = false;
        } else if (motionEvent.getAction() == 3) {
            this.u = false;
            this.v = false;
            i46 i46Var2 = this.i;
            if (i46Var2 != null) {
                i46Var2.e(true);
            }
            this.j = null;
        }
        this.e.c(this.u);
        this.f.c(this.v);
        return this.u || this.v || this.j != null;
    }

    public final void b(Canvas canvas) {
        int L;
        int extraTextX;
        int i;
        gb2 gb2Var = this.a;
        nb2 nb2Var = gb2Var.ub;
        c27 c27Var = gb2Var.M;
        if (c27Var == null || c27Var.h) {
            float f = this.b ? 1.0f : 0.0f;
            if (nb2Var.S2) {
                f = gl.R1(1.0f - f, f, nb2Var.L1);
            }
            float f2 = f * 1.0f;
            if (f2 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((gb2Var.getBackgroundDrawableRight() + (nb2Var != null ? nb2Var.i0 : 0.0f)) - gl.L(10 + ((!gb2Var.Q5.O3() || gb2Var.C6 || gb2Var.K) ? 0 : 6))) - gb2Var.getExtraTextX();
            f27 f27Var = gb2Var.L;
            if (f27Var != null && !f27Var.i) {
                i = (int) gb2Var.s3;
            } else if (gb2Var.Q5.O3()) {
                i = gb2Var.getExtraTextX() + gl.L(12.0f) + gb2Var.N6;
                if (gb2Var.Q5.D == 19) {
                    i -= Math.max(0, (gl.L(14.0f) + (Math.max(gb2Var.X7, gb2Var.Z7) + i)) - gl.q.x);
                }
            } else {
                boolean z = gb2Var.C6;
                int i2 = gb2Var.N6;
                if (z) {
                    L = gl.L(12.0f) + i2;
                    extraTextX = gb2Var.getExtraTextX();
                } else {
                    L = gl.L(gb2Var.K ? 12.0f : 18.0f) + i2;
                    extraTextX = gb2Var.getExtraTextX();
                }
                i = L + extraTextX;
            }
            int L2 = ((int) (i + nb2Var.h0)) - gl.L(1.33f);
            int i3 = gb2Var.r0;
            float f3 = L2;
            int i4 = (int) (backgroundDrawableRight - f3);
            int i5 = this.r;
            if (nb2Var.Y2) {
                i5 = gl.U1(nb2Var.L1, nb2Var.U2, i5);
            }
            if (this.n && gb2Var.getPrimaryMessageObject() != null) {
                boolean z2 = gb2Var.getPrimaryMessageObject().c3;
            }
            boolean z3 = nb2Var.a3;
            n79 n79Var = this.t;
            if (n79Var == null) {
                n79Var = new n79(gb2Var);
                this.t = n79Var;
            }
            int n = n79Var.n(gb2Var.cc);
            canvas.save();
            canvas.translate(f3, i3);
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, i4, i5);
            n41 n41Var = this.f;
            float a = n41Var != null ? n41Var.a(0.01f) : 1.0f;
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            this.t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f2, false, false);
            this.t.f(canvas, rectF, f2);
            tgb tgbVar = this.c;
            if (tgbVar != null) {
                tgbVar.c(gl.L(10.0f), gl.L(12.0f), f2, n, canvas);
                if (this.d != null) {
                    rectF.set((int) (gl.L(10.0f) + this.c.c + gl.L(4.0f)), gl.L(4.33f), gl.L(10.0f) + r1 + this.d.c, gl.L(21.66f));
                    n41 n41Var2 = this.e;
                    float a2 = n41Var2 != null ? n41Var2.a(0.1f) : 1.0f;
                    canvas.save();
                    canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, gl.L(17.0f), gl.L(17.0f), this.t.g);
                    this.d.c(gl.L(5.0f) + r1, gl.L(12.0f), f2, n, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas) {
        int L;
        int extraTextX;
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        RectF rectF;
        float f3;
        int i4;
        float f4;
        Canvas canvas2 = canvas;
        gb2 gb2Var = this.a;
        nb2 nb2Var = gb2Var.ub;
        c27 c27Var = gb2Var.M;
        if (c27Var == null || c27Var.h) {
            float f5 = this.b ? 1.0f : 0.0f;
            if (nb2Var.S2) {
                f5 = gl.R1(1.0f - f5, f5, nb2Var.L1);
            }
            float f6 = 1.0f * f5;
            if (f6 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((gb2Var.getBackgroundDrawableRight() + (nb2Var != null ? nb2Var.i0 : 0.0f)) - gl.L(10 + ((!gb2Var.Q5.O3() || gb2Var.C6 || gb2Var.K) ? 0 : 6))) - gb2Var.getExtraTextX();
            f27 f27Var = gb2Var.L;
            if (f27Var == null || f27Var.i) {
                if (gb2Var.Q5.O3()) {
                    i = gb2Var.getExtraTextX() + gl.L(12.0f) + gb2Var.N6;
                    if (gb2Var.Q5.D == 19) {
                        i -= Math.max(0, (gl.L(14.0f) + (Math.max(gb2Var.X7, gb2Var.Z7) + i)) - gl.q.x);
                    }
                } else {
                    boolean z = gb2Var.C6;
                    int i5 = gb2Var.N6;
                    if (z) {
                        L = gl.L(12.0f) + i5;
                        extraTextX = gb2Var.getExtraTextX();
                    } else {
                        L = gl.L(gb2Var.K ? 12.0f : 18.0f) + i5;
                        extraTextX = gb2Var.getExtraTextX();
                    }
                    i = L + extraTextX;
                }
            } else {
                i = (int) gb2Var.s3;
            }
            int L2 = ((int) (i + nb2Var.h0)) - gl.L(1.33f);
            int i6 = gb2Var.r0;
            float f7 = L2;
            int i7 = (int) (backgroundDrawableRight - f7);
            int i8 = this.r;
            if (nb2Var.Y2) {
                i8 = gl.U1(nb2Var.L1, nb2Var.U2, i8);
            }
            int i9 = i8;
            float f8 = (!this.n || (gb2Var.getPrimaryMessageObject() != null && gb2Var.getPrimaryMessageObject().c3)) ? 1.0f : 0.0f;
            if (nb2Var.a3) {
                f8 = gl.R1(1.0f - f8, f8, nb2Var.L1);
            }
            float f9 = f8;
            n79 n79Var = this.t;
            if (n79Var == null) {
                n79Var = new n79(gb2Var);
                this.t = n79Var;
            }
            int n = n79Var.n(gb2Var.cc);
            canvas2.save();
            canvas2.translate(f7, i6);
            RectF rectF2 = gl.P;
            float f10 = i7;
            float f11 = i9;
            rectF2.set(0.0f, 0.0f, f10, f11);
            n41 n41Var = this.f;
            float a = n41Var != null ? n41Var.a(0.01f) : 1.0f;
            canvas2.scale(a, a, rectF2.centerX(), rectF2.centerY());
            if (this.g != null) {
                if (this.n) {
                    f3 = f11;
                    i2 = n;
                    rectF = rectF2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f10, i9 - 1, kk7.d4, 31);
                } else {
                    i2 = n;
                    rectF = rectF2;
                    f3 = f11;
                }
                canvas2.save();
                canvas2.translate(gl.L(10.0f) - this.o, gl.L(22.0f));
                bkb.Y2.linkColor = i2;
                i46 i46Var = this.i;
                if (i46Var != null && i46Var.g(canvas2)) {
                    gb2Var.r2();
                }
                if (gb2Var.Q5.O3()) {
                    bkb.Y2.setColor(bkb.v0(bkb.Vc, gb2Var.cc));
                } else {
                    bkb.Y2.setColor(bkb.v0(bkb.Uc, gb2Var.cc));
                }
                int alpha = bkb.Y2.getAlpha();
                bkb.Y2.setAlpha((int) (alpha * f6));
                bb2 bb2Var = gb2Var.eb;
                if (bb2Var != null && bb2Var.E2() != null && gb2Var.getDelegate().E2().y(gb2Var.Q5)) {
                    gib E2 = gb2Var.eb.E2();
                    boolean O3 = gb2Var.Q5.O3();
                    StaticLayout staticLayout = this.g;
                    Paint paint = E2.p;
                    if (E2.s0) {
                        Paint paint2 = E2.o;
                        if (O3) {
                            int i10 = bkb.Lc;
                            paint2.setColor(E2.s(i10));
                            paint.setColor(E2.s(i10));
                        } else {
                            int i11 = bkb.kg;
                            paint2.setColor(E2.s(i11));
                            paint.setColor(E2.s(i11));
                        }
                        f = f9;
                        f2 = f6;
                        f4 = f10;
                        i3 = i7;
                        i4 = alpha;
                        E2.g(canvas, staticLayout, E2.u, E2.v, true, true, 0.0f);
                        canvas2 = canvas;
                        this.g.draw(canvas2);
                        canvas2.restore();
                        bkb.Y2.setAlpha(i4);
                        rectF.set(gl.L(10.0f), gl.L(6.33f) + gl.L(22.0f) + this.p, i3 - gl.L(10.0f), de9.w(6.33f, gl.L(22.0f) + this.p, 1));
                        bkb.b3.setColor(i2);
                        bkb.b3.setAlpha((int) (r2.getAlpha() * 0.5f * f2));
                        canvas2.drawRect(rectF, bkb.b3);
                        canvas2.save();
                        canvas2.translate(gl.L(10.0f) - this.q, gl.L(12.66f) + gl.L(22.0f) + this.p);
                        bkb.b3.setColor(i2);
                        bkb.b3.setAlpha((int) (r2.getAlpha() * f2));
                        this.h.draw(canvas2);
                        canvas2.restore();
                        if (gb2Var.P1 == null) {
                            gb2Var.P1 = new xl3((byte) 7);
                        }
                        if (this.n) {
                            canvas2.save();
                            int L3 = gl.L(gl.L(12.66f) + (gl.L(22.0f) + this.p) < i9 ? 20.0f : 24.0f);
                            float f12 = f3;
                            rectF.set(0.0f, ls6.x(6.66f, i9, L3), f4, f12);
                            float f13 = (1.0f - f) * f2;
                            gb2Var.P1.s(canvas2, rectF, 3, f13);
                            float f14 = i9 - L3;
                            rectF.set(i3 - gl.L(60.0f), f14, i3 - gl.L(32.0f), f12);
                            gb2Var.P1.s(canvas2, rectF, 2, f13);
                            rectF.set(i3 - gl.L(32.0f), f14, f4, f12);
                            canvas2.drawRect(rectF, gb2Var.P1.x(f13, 2));
                            canvas2.restore();
                            canvas2.restore();
                        }
                    }
                }
                f = f9;
                f2 = f6;
                i3 = i7;
                i4 = alpha;
                f4 = f10;
                this.g.draw(canvas2);
                canvas2.restore();
                bkb.Y2.setAlpha(i4);
                rectF.set(gl.L(10.0f), gl.L(6.33f) + gl.L(22.0f) + this.p, i3 - gl.L(10.0f), de9.w(6.33f, gl.L(22.0f) + this.p, 1));
                bkb.b3.setColor(i2);
                bkb.b3.setAlpha((int) (r2.getAlpha() * 0.5f * f2));
                canvas2.drawRect(rectF, bkb.b3);
                canvas2.save();
                canvas2.translate(gl.L(10.0f) - this.q, gl.L(12.66f) + gl.L(22.0f) + this.p);
                bkb.b3.setColor(i2);
                bkb.b3.setAlpha((int) (r2.getAlpha() * f2));
                this.h.draw(canvas2);
                canvas2.restore();
                if (gb2Var.P1 == null) {
                }
                if (this.n) {
                }
            } else {
                i2 = n;
                f = f9;
                f2 = f6;
                i3 = i7;
            }
            if (this.n) {
                if (this.l == null) {
                    Drawable mutate = gb2Var.getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
                    this.l = mutate;
                    this.m = i2;
                    mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
                }
                if (i2 != this.m) {
                    Drawable drawable = this.l;
                    this.m = i2;
                    drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
                }
                canvas2.save();
                int L4 = gl.L(16.0f);
                this.l.setBounds((i3 - L4) - gl.L(7.0f), (i9 - L4) - gl.L(5.0f), i3 - gl.L(7.0f), i9 - gl.L(5.0f));
                canvas2.rotate(gl.U1(f, 0, kk7.J2), this.l.getBounds().centerX(), this.l.getBounds().centerY());
                this.l.setAlpha((int) (f2 * 255.0f));
                this.l.draw(canvas2);
                canvas2.restore();
            }
            canvas2.restore();
        }
    }
}
