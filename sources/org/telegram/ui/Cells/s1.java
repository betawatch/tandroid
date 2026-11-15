package org.telegram.ui.Cells;

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
import org.telegram.messenger.bj;
import org.telegram.messenger.ns;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.u70;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s1 {
    public final q1 a;
    public boolean b;
    public oy0 c;
    public oy0 d;
    public dc e;
    public dc f;
    public StaticLayout g;
    public StaticLayout h;
    public n2.o0 i;
    public a80 j;
    public boolean k;
    public Drawable l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public ek0 t;
    public boolean u;
    public boolean v;

    public s1(q1 q1Var) {
        this.a = q1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0210 A[Catch: Exception -> 0x01e7, TryCatch #1 {Exception -> 0x01e7, blocks: (B:58:0x01ad, B:60:0x01c6, B:62:0x01d1, B:64:0x01e3, B:67:0x01f3, B:69:0x01f6, B:71:0x01fe, B:74:0x0204, B:76:0x020a, B:78:0x0210, B:80:0x0214, B:82:0x027f, B:83:0x021c, B:85:0x023f, B:88:0x0273, B:91:0x0270, B:92:0x0283, B:94:0x0287, B:96:0x028e, B:97:0x01ea, B:87:0x024d), top: B:57:0x01ad, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0283 A[Catch: Exception -> 0x01e7, TryCatch #1 {Exception -> 0x01e7, blocks: (B:58:0x01ad, B:60:0x01c6, B:62:0x01d1, B:64:0x01e3, B:67:0x01f3, B:69:0x01f6, B:71:0x01fe, B:74:0x0204, B:76:0x020a, B:78:0x0210, B:80:0x0214, B:82:0x027f, B:83:0x021c, B:85:0x023f, B:88:0x0273, B:91:0x0270, B:92:0x0283, B:94:0x0287, B:96:0x028e, B:97:0x01ea, B:87:0x024d), top: B:57:0x01ad, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        int L;
        int extraTextX;
        int i7;
        l1 l1Var;
        q1 q1Var = this.a;
        x1 x1Var = q1Var.ib;
        if (!this.b || this.c == null || this.d == null) {
            return false;
        }
        if (this.e == null) {
            this.e = new dc(q1Var);
        }
        if (this.f == null) {
            dc dcVar = new dc(q1Var);
            this.f = dcVar;
            dcVar.f = new d1(q1Var, 0);
        }
        float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var != null ? x1Var.i0 : 0.0f)) - org.telegram.messenger.g0.L(10 + ((!q1Var.Q5.P3() || q1Var.C6 || q1Var.K) ? 0 : 6))) - q1Var.getExtraTextX();
        bj bjVar = q1Var.L;
        if (bjVar == null || bjVar.i) {
            if (q1Var.Q5.P3()) {
                i7 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.N6;
                if (q1Var.Q5.D == 19) {
                    i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.X7, q1Var.Z7) + i7)) - org.telegram.messenger.g0.q.x);
                }
            } else {
                if (q1Var.C6) {
                    L = org.telegram.messenger.g0.L(12.0f) + q1Var.N6;
                    extraTextX = q1Var.getExtraTextX();
                } else {
                    L = org.telegram.messenger.g0.L(q1Var.K ? 12.0f : 18.0f) + q1Var.N6;
                    extraTextX = q1Var.getExtraTextX();
                }
                i7 = extraTextX + L;
            }
        } else {
            i7 = (int) q1Var.s3;
        }
        int L2 = ((int) (i7 + x1Var.h0)) - org.telegram.messenger.g0.L(1.33f);
        int i10 = q1Var.r0;
        float f10 = L2;
        int i11 = (int) (backgroundDrawableRight - f10);
        int x10 = (int) motionEvent.getX();
        int N1 = (int) q1Var.N1(motionEvent);
        int L3 = (int) (org.telegram.messenger.g0.L(10.0f) + L2 + this.c.c + org.telegram.messenger.g0.L(4.0f));
        int L4 = org.telegram.messenger.g0.L(4.33f) + i10;
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = L3;
        rectF.set(f11, L4, this.d.c + f11 + org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(17.33f) + L4);
        boolean contains = rectF.contains(motionEvent.getX(), q1Var.N1(motionEvent));
        rectF.set(f10, i10, L2 + i11, this.r + i10);
        boolean z10 = !contains && !q1Var.Bc && this.j == null && rectF.contains(motionEvent.getX(), q1Var.N1(motionEvent));
        if (((z10 && !q1Var.Bc) || this.j != null) && this.g != null) {
            if (this.i == null) {
                n2.o0 o0Var = new n2.o0(q1Var);
                this.i = o0Var;
                o0Var.d = new d1(q1Var, 0);
            }
            int L5 = (org.telegram.messenger.g0.L(10.0f) + L2) - this.o;
            int L6 = org.telegram.messenger.g0.L(22.0f) + i10;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && this.j != null)) {
                if (x10 < L5 || N1 < L6 || x10 > L5 + i11 || N1 > this.g.getHeight() + L6) {
                    q1Var.g3(1);
                } else {
                    try {
                        int i12 = N1 - L6;
                        int lineForVertical = this.g.getLineForVertical(i12);
                        float f12 = x10 - L5;
                        int offsetForHorizontal = this.g.getOffsetForHorizontal(lineForVertical, f12);
                        float lineLeft = this.g.getLineLeft(lineForVertical);
                        if (lineLeft <= f12 && lineLeft + this.g.getLineWidth(lineForVertical) >= f12) {
                            Spannable spannable = (Spannable) this.g.getText();
                            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (characterStyleArr != null) {
                                if (characterStyleArr.length == 0) {
                                }
                                if (characterStyleArr.length != 0 && ((!(characterStyleArr[0] instanceof c41) || c41.h) && !org.telegram.messenger.g0.C1())) {
                                    if (motionEvent.getAction() != 0) {
                                        a80 a80Var = this.j;
                                        if (a80Var == null || a80Var.i != characterStyleArr[0]) {
                                            this.i.n(a80Var, true);
                                            CharacterStyle characterStyle = characterStyleArr[0];
                                            org.telegram.ui.ActionBar.e6 e6Var = q1Var.Qb;
                                            float f13 = i12;
                                            float[] fArr = q1.wd;
                                            a80 a80Var2 = new a80(characterStyle, e6Var, f12, f13, 0);
                                            this.j = a80Var2;
                                            ek0 ek0Var = this.t;
                                            if (ek0Var != null) {
                                                a80Var2.d(org.telegram.ui.ActionBar.j6.r1(0.1f, ek0Var.i()));
                                            }
                                            try {
                                                u70 b10 = this.j.b();
                                                int[] X1 = q1.X1(spannable, this.j.i);
                                                b10.d(this.g, X1[0], 0.0f);
                                                this.g.getSelectionPath(X1[0], X1[1], b10);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            this.i.b(this.j, 1);
                                            z10 = false;
                                        }
                                        q1Var.invalidate();
                                    } else {
                                        a80 a80Var3 = this.j;
                                        if (a80Var3 != null) {
                                            CharacterStyle characterStyle2 = characterStyleArr[0];
                                            CharacterStyle characterStyle3 = a80Var3.i;
                                            if (characterStyle2 == characterStyle3) {
                                                q1Var.Sa.T0(q1Var, characterStyle3, false);
                                                q1Var.g3(1);
                                                this.u = false;
                                                this.v = false;
                                                this.j = null;
                                            }
                                        }
                                    }
                                }
                            }
                            characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, e41.class);
                            if (characterStyleArr.length != 0) {
                                if (motionEvent.getAction() != 0) {
                                }
                            }
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
            }
        }
        boolean z11 = this.n && z10;
        if (motionEvent.getAction() == 0) {
            this.u = contains;
            this.v = z11;
        } else if (motionEvent.getAction() == 2) {
            this.u = contains;
            this.v = z11;
        } else if (motionEvent.getAction() == 1) {
            if (this.u) {
                l1 l1Var2 = q1Var.Sa;
                if (l1Var2 != null) {
                    l1Var2.y2(q1Var, (int) ((this.d.c / 2.0f) + org.telegram.messenger.g0.L(4.0f) + L3), L4);
                }
            } else if (this.v && !x1Var.a3 && (l1Var = q1Var.Sa) != null) {
                l1Var.u(q1Var);
            }
            this.u = false;
            this.v = false;
        } else if (motionEvent.getAction() == 3) {
            this.u = false;
            this.v = false;
            n2.o0 o0Var2 = this.i;
            if (o0Var2 != null) {
                o0Var2.f(true);
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
        int i7;
        q1 q1Var = this.a;
        x1 x1Var = q1Var.ib;
        yi yiVar = q1Var.M;
        if (yiVar == null || yiVar.h) {
            float f10 = this.b ? 1.0f : 0.0f;
            if (x1Var.S2) {
                f10 = org.telegram.messenger.g0.T1(1.0f - f10, f10, x1Var.L1);
            }
            float f11 = 1.0f * f10;
            if (f11 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var != null ? x1Var.i0 : 0.0f)) - org.telegram.messenger.g0.L(10 + ((!q1Var.Q5.P3() || q1Var.C6 || q1Var.K) ? 0 : 6))) - q1Var.getExtraTextX();
            bj bjVar = q1Var.L;
            if (bjVar != null && !bjVar.i) {
                i7 = (int) q1Var.s3;
            } else if (q1Var.Q5.P3()) {
                i7 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.N6;
                if (q1Var.Q5.D == 19) {
                    i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.X7, q1Var.Z7) + i7)) - org.telegram.messenger.g0.q.x);
                }
            } else {
                if (q1Var.C6) {
                    L = org.telegram.messenger.g0.L(12.0f) + q1Var.N6;
                    extraTextX = q1Var.getExtraTextX();
                } else {
                    L = org.telegram.messenger.g0.L(q1Var.K ? 12.0f : 18.0f) + q1Var.N6;
                    extraTextX = q1Var.getExtraTextX();
                }
                i7 = extraTextX + L;
            }
            int L2 = ((int) (i7 + x1Var.h0)) - org.telegram.messenger.g0.L(1.33f);
            int i10 = q1Var.r0;
            float f12 = L2;
            int i11 = (int) (backgroundDrawableRight - f12);
            int i12 = this.r;
            if (x1Var.Y2) {
                i12 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.U2, i12);
            }
            if (this.n && q1Var.getPrimaryMessageObject() != null) {
                boolean z10 = q1Var.getPrimaryMessageObject().c3;
            }
            boolean z11 = x1Var.a3;
            if (this.t == null) {
                this.t = new ek0(q1Var);
            }
            int p10 = this.t.p(q1Var.Qb);
            canvas.save();
            canvas.translate(f12, i10);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, i11, i12);
            dc dcVar = this.f;
            float a10 = dcVar != null ? dcVar.a(0.01f) : 1.0f;
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            this.t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f11, false, false);
            this.t.f(canvas, rectF, f11);
            oy0 oy0Var = this.c;
            if (oy0Var != null) {
                oy0Var.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), f11, p10, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.g0.L(10.0f) + this.c.c + org.telegram.messenger.g0.L(4.0f)), org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(10.0f) + r0 + this.d.c, org.telegram.messenger.g0.L(21.66f));
                    dc dcVar2 = this.e;
                    float a11 = dcVar2 != null ? dcVar2.a(0.1f) : 1.0f;
                    canvas.save();
                    canvas.scale(a11, a11, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), this.t.g);
                    this.d.c(org.telegram.messenger.g0.L(5.0f) + r0, org.telegram.messenger.g0.L(12.0f), f11, p10, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas) {
        int L;
        int extraTextX;
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        RectF rectF;
        float f12;
        int i12;
        float f13;
        Canvas canvas2 = canvas;
        q1 q1Var = this.a;
        x1 x1Var = q1Var.ib;
        yi yiVar = q1Var.M;
        if (yiVar == null || yiVar.h) {
            float f14 = this.b ? 1.0f : 0.0f;
            if (x1Var.S2) {
                f14 = org.telegram.messenger.g0.T1(1.0f - f14, f14, x1Var.L1);
            }
            float f15 = 1.0f * f14;
            if (f15 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var != null ? x1Var.i0 : 0.0f)) - org.telegram.messenger.g0.L(10 + ((!q1Var.Q5.P3() || q1Var.C6 || q1Var.K) ? 0 : 6))) - q1Var.getExtraTextX();
            bj bjVar = q1Var.L;
            if (bjVar == null || bjVar.i) {
                if (q1Var.Q5.P3()) {
                    i7 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.N6;
                    if (q1Var.Q5.D == 19) {
                        i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.X7, q1Var.Z7) + i7)) - org.telegram.messenger.g0.q.x);
                    }
                } else {
                    if (q1Var.C6) {
                        L = org.telegram.messenger.g0.L(12.0f) + q1Var.N6;
                        extraTextX = q1Var.getExtraTextX();
                    } else {
                        L = org.telegram.messenger.g0.L(q1Var.K ? 12.0f : 18.0f) + q1Var.N6;
                        extraTextX = q1Var.getExtraTextX();
                    }
                    i7 = extraTextX + L;
                }
            } else {
                i7 = (int) q1Var.s3;
            }
            int L2 = ((int) (i7 + x1Var.h0)) - org.telegram.messenger.g0.L(1.33f);
            int i13 = q1Var.r0;
            float f16 = L2;
            int i14 = (int) (backgroundDrawableRight - f16);
            int i15 = this.r;
            if (x1Var.Y2) {
                i15 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.U2, i15);
            }
            int i16 = i15;
            float f17 = (!this.n || (q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().c3)) ? 1.0f : 0.0f;
            if (x1Var.a3) {
                f17 = org.telegram.messenger.g0.T1(1.0f - f17, f17, x1Var.L1);
            }
            float f18 = f17;
            if (this.t == null) {
                this.t = new ek0(q1Var);
            }
            int p10 = this.t.p(q1Var.Qb);
            canvas2.save();
            canvas2.translate(f16, i13);
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f19 = i14;
            float f20 = i16;
            rectF2.set(0.0f, 0.0f, f19, f20);
            dc dcVar = this.f;
            float a10 = dcVar != null ? dcVar.a(0.01f) : 1.0f;
            canvas2.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            if (this.g != null) {
                if (this.n) {
                    f12 = f20;
                    i10 = p10;
                    rectF = rectF2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f19, i16 - 1, ns.e4, 31);
                } else {
                    i10 = p10;
                    rectF = rectF2;
                    f12 = f20;
                }
                canvas2.save();
                canvas2.translate(org.telegram.messenger.g0.L(10.0f) - this.o, org.telegram.messenger.g0.L(22.0f));
                org.telegram.ui.ActionBar.j6.Z2.linkColor = i10;
                n2.o0 o0Var = this.i;
                if (o0Var != null && o0Var.h(canvas2)) {
                    q1Var.q2();
                }
                if (q1Var.Q5.P3()) {
                    org.telegram.ui.ActionBar.j6.Z2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Wc, q1Var.Qb));
                } else {
                    org.telegram.ui.ActionBar.j6.Z2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Vc, q1Var.Qb));
                }
                int alpha = org.telegram.ui.ActionBar.j6.Z2.getAlpha();
                org.telegram.ui.ActionBar.j6.Z2.setAlpha((int) (alpha * f15));
                l1 l1Var = q1Var.Sa;
                if (l1Var != null && l1Var.z2() != null && q1Var.getDelegate().z2().z(q1Var.Q5)) {
                    i9 z22 = q1Var.Sa.z2();
                    boolean P3 = q1Var.Q5.P3();
                    StaticLayout staticLayout = this.g;
                    Paint paint = z22.p;
                    Paint paint2 = z22.o;
                    if (z22.s0) {
                        if (P3) {
                            int i17 = org.telegram.ui.ActionBar.j6.Mc;
                            paint2.setColor(z22.t(i17));
                            paint.setColor(z22.t(i17));
                        } else {
                            int i18 = org.telegram.ui.ActionBar.j6.lg;
                            paint2.setColor(z22.t(i18));
                            paint.setColor(z22.t(i18));
                        }
                        f10 = f18;
                        f11 = f15;
                        f13 = f19;
                        i11 = i14;
                        i12 = alpha;
                        z22.h(canvas, staticLayout, z22.u, z22.v, true, true, 0.0f);
                        canvas2 = canvas;
                        this.g.draw(canvas2);
                        canvas2.restore();
                        org.telegram.ui.ActionBar.j6.Z2.setAlpha(i12);
                        rectF.set(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(6.33f) + org.telegram.messenger.g0.L(22.0f) + this.p, i11 - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.k5.C(6.33f, org.telegram.messenger.g0.L(22.0f) + this.p, 1));
                        org.telegram.ui.ActionBar.j6.c3.setColor(i10);
                        org.telegram.ui.ActionBar.j6.c3.setAlpha((int) (r2.getAlpha() * 0.5f * f11));
                        canvas2.drawRect(rectF, org.telegram.ui.ActionBar.j6.c3);
                        canvas2.save();
                        canvas2.translate(org.telegram.messenger.g0.L(10.0f) - this.q, org.telegram.messenger.g0.L(12.66f) + org.telegram.messenger.g0.L(22.0f) + this.p);
                        org.telegram.ui.ActionBar.j6.c3.setColor(i10);
                        org.telegram.ui.ActionBar.j6.c3.setAlpha((int) (r2.getAlpha() * f11));
                        this.h.draw(canvas2);
                        canvas2.restore();
                        if (q1Var.P1 == null) {
                            q1Var.P1 = new h6.m(29);
                        }
                        if (this.n) {
                            canvas2.save();
                            int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.L(12.66f) + (org.telegram.messenger.g0.L(22.0f) + this.p) < i16 ? 20.0f : 24.0f);
                            float f21 = f12;
                            rectF.set(0.0f, org.telegram.messenger.k5.z(6.66f, i16, L3), f13, f21);
                            float f22 = (1.0f - f10) * f11;
                            q1Var.P1.m(canvas2, rectF, 3, f22);
                            float f23 = i16 - L3;
                            rectF.set(i11 - org.telegram.messenger.g0.L(60.0f), f23, i11 - org.telegram.messenger.g0.L(32.0f), f21);
                            q1Var.P1.m(canvas2, rectF, 2, f22);
                            rectF.set(i11 - org.telegram.messenger.g0.L(32.0f), f23, f13, f21);
                            canvas2.drawRect(rectF, q1Var.P1.w(f22, 2));
                            canvas2.restore();
                            canvas2.restore();
                        }
                    } else {
                        canvas2 = canvas;
                    }
                }
                f10 = f18;
                f11 = f15;
                i11 = i14;
                i12 = alpha;
                f13 = f19;
                this.g.draw(canvas2);
                canvas2.restore();
                org.telegram.ui.ActionBar.j6.Z2.setAlpha(i12);
                rectF.set(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(6.33f) + org.telegram.messenger.g0.L(22.0f) + this.p, i11 - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.k5.C(6.33f, org.telegram.messenger.g0.L(22.0f) + this.p, 1));
                org.telegram.ui.ActionBar.j6.c3.setColor(i10);
                org.telegram.ui.ActionBar.j6.c3.setAlpha((int) (r2.getAlpha() * 0.5f * f11));
                canvas2.drawRect(rectF, org.telegram.ui.ActionBar.j6.c3);
                canvas2.save();
                canvas2.translate(org.telegram.messenger.g0.L(10.0f) - this.q, org.telegram.messenger.g0.L(12.66f) + org.telegram.messenger.g0.L(22.0f) + this.p);
                org.telegram.ui.ActionBar.j6.c3.setColor(i10);
                org.telegram.ui.ActionBar.j6.c3.setAlpha((int) (r2.getAlpha() * f11));
                this.h.draw(canvas2);
                canvas2.restore();
                if (q1Var.P1 == null) {
                }
                if (this.n) {
                }
            } else {
                i10 = p10;
                f10 = f18;
                f11 = f15;
                i11 = i14;
            }
            if (this.n) {
                if (this.l == null) {
                    Drawable mutate = q1Var.getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
                    this.l = mutate;
                    this.m = i10;
                    mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                if (i10 != this.m) {
                    Drawable drawable = this.l;
                    this.m = i10;
                    drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                canvas2.save();
                int L4 = org.telegram.messenger.g0.L(16.0f);
                this.l.setBounds((i11 - L4) - org.telegram.messenger.g0.L(7.0f), (i16 - L4) - org.telegram.messenger.g0.L(5.0f), i11 - org.telegram.messenger.g0.L(7.0f), i16 - org.telegram.messenger.g0.L(5.0f));
                canvas2.rotate(org.telegram.messenger.g0.W1(f10, 0, ns.K2), this.l.getBounds().centerX(), this.l.getBounds().centerY());
                this.l.setAlpha((int) (f11 * 255.0f));
                this.l.draw(canvas2);
                canvas2.restore();
            }
            canvas2.restore();
        }
    }
}
