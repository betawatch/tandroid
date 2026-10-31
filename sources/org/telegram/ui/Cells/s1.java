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
import org.telegram.messenger.ej;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s1 {
    public final q1 a;
    public boolean b;
    public qz0 c;
    public qz0 d;
    public dc e;
    public dc f;
    public StaticLayout g;
    public StaticLayout h;
    public ji.a i;
    public q80 j;
    public boolean k;
    public Drawable l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public dl0 t;
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
        int i10;
        l1 l1Var;
        q1 q1Var = this.a;
        x1 x1Var = q1Var.gb;
        int i11 = 0;
        if (!this.b || this.c == null || this.d == null) {
            return false;
        }
        if (this.e == null) {
            this.e = new dc(q1Var);
        }
        if (this.f == null) {
            dc dcVar = new dc(q1Var);
            this.f = dcVar;
            dcVar.f = new b1(q1Var, i11);
        }
        float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var != null ? x1Var.i0 : 0.0f)) - org.telegram.messenger.i0.L(10 + ((!q1Var.O5.P3() || q1Var.A6 || q1Var.J) ? 0 : 6))) - q1Var.getExtraTextX();
        ej ejVar = q1Var.K;
        if (ejVar == null || ejVar.i) {
            if (q1Var.O5.P3()) {
                i10 = q1Var.getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                if (q1Var.O5.D == 19) {
                    i10 -= Math.max(0, (org.telegram.messenger.i0.L(14.0f) + (Math.max(q1Var.V7, q1Var.X7) + i10)) - org.telegram.messenger.i0.q.x);
                }
            } else {
                if (q1Var.A6) {
                    L = org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                    extraTextX = q1Var.getExtraTextX();
                } else {
                    L = org.telegram.messenger.i0.L(q1Var.J ? 12.0f : 18.0f) + q1Var.L6;
                    extraTextX = q1Var.getExtraTextX();
                }
                i10 = extraTextX + L;
            }
        } else {
            i10 = (int) q1Var.q3;
        }
        int L2 = ((int) (i10 + x1Var.h0)) - org.telegram.messenger.i0.L(1.33f);
        int i12 = q1Var.q0;
        float f7 = L2;
        int i13 = (int) (backgroundDrawableRight - f7);
        int x10 = (int) motionEvent.getX();
        int K1 = (int) q1Var.K1(motionEvent);
        int L3 = (int) (org.telegram.messenger.i0.L(10.0f) + L2 + this.c.c + org.telegram.messenger.i0.L(4.0f));
        int L4 = org.telegram.messenger.i0.L(4.33f) + i12;
        RectF rectF = org.telegram.messenger.i0.P;
        float f10 = L3;
        rectF.set(f10, L4, this.d.c + f10 + org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(17.33f) + L4);
        boolean contains = rectF.contains(motionEvent.getX(), q1Var.K1(motionEvent));
        rectF.set(f7, i12, L2 + i13, this.r + i12);
        boolean z10 = !contains && !q1Var.yc && this.j == null && rectF.contains(motionEvent.getX(), q1Var.K1(motionEvent));
        if (((z10 && !q1Var.yc) || this.j != null) && this.g != null) {
            if (this.i == null) {
                ji.a aVar = new ji.a(q1Var);
                this.i = aVar;
                aVar.d = new b1(q1Var, 0);
            }
            int L5 = (org.telegram.messenger.i0.L(10.0f) + L2) - this.o;
            int L6 = org.telegram.messenger.i0.L(22.0f) + i12;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && this.j != null)) {
                if (x10 < L5 || K1 < L6 || x10 > L5 + i13 || K1 > this.g.getHeight() + L6) {
                    q1Var.b3(1);
                } else {
                    try {
                        int i14 = K1 - L6;
                        int lineForVertical = this.g.getLineForVertical(i14);
                        float f11 = x10 - L5;
                        int offsetForHorizontal = this.g.getOffsetForHorizontal(lineForVertical, f11);
                        float lineLeft = this.g.getLineLeft(lineForVertical);
                        if (lineLeft <= f11 && lineLeft + this.g.getLineWidth(lineForVertical) >= f11) {
                            Spannable spannable = (Spannable) this.g.getText();
                            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (characterStyleArr != null) {
                                if (characterStyleArr.length == 0) {
                                }
                                if (characterStyleArr.length != 0 && ((!(characterStyleArr[0] instanceof b51) || b51.h) && !org.telegram.messenger.i0.C1())) {
                                    if (motionEvent.getAction() != 0) {
                                        q80 q80Var = this.j;
                                        if (q80Var == null || q80Var.i != characterStyleArr[0]) {
                                            this.i.m(q80Var, true);
                                            CharacterStyle characterStyle = characterStyleArr[0];
                                            org.telegram.ui.ActionBar.p6 p6Var = q1Var.Ob;
                                            float f12 = i14;
                                            float[] fArr = q1.ed;
                                            q80 q80Var2 = new q80(characterStyle, p6Var, f11, f12, 0);
                                            this.j = q80Var2;
                                            dl0 dl0Var = this.t;
                                            if (dl0Var != null) {
                                                q80Var2.d(org.telegram.ui.ActionBar.t6.r1(0.1f, dl0Var.i()));
                                            }
                                            try {
                                                k80 b10 = this.j.b();
                                                int[] U1 = q1.U1(spannable, this.j.i);
                                                b10.d(this.g, U1[0], 0.0f);
                                                this.g.getSelectionPath(U1[0], U1[1], b10);
                                            } catch (Exception e) {
                                                org.telegram.messenger.f8.g(e, true);
                                            }
                                            this.i.b(this.j, 1);
                                            z10 = false;
                                        }
                                        q1Var.invalidate();
                                    } else {
                                        q80 q80Var3 = this.j;
                                        if (q80Var3 != null) {
                                            CharacterStyle characterStyle2 = characterStyleArr[0];
                                            CharacterStyle characterStyle3 = q80Var3.i;
                                            if (characterStyle2 == characterStyle3) {
                                                q1Var.Qa.L0(q1Var, characterStyle3, false);
                                                q1Var.b3(1);
                                                this.u = false;
                                                this.v = false;
                                                this.j = null;
                                            }
                                        }
                                    }
                                }
                            }
                            characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, d51.class);
                            if (characterStyleArr.length != 0) {
                                if (motionEvent.getAction() != 0) {
                                }
                            }
                        }
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
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
                l1 l1Var2 = q1Var.Qa;
                if (l1Var2 != null) {
                    l1Var2.f2(q1Var, (int) ((this.d.c / 2.0f) + org.telegram.messenger.i0.L(4.0f) + L3), L4);
                }
            } else if (this.v && !x1Var.a3 && (l1Var = q1Var.Qa) != null) {
                l1Var.t(q1Var);
            }
            this.u = false;
            this.v = false;
        } else if (motionEvent.getAction() == 3) {
            this.u = false;
            this.v = false;
            ji.a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.f(true);
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
        int i10;
        q1 q1Var = this.a;
        x1 x1Var = q1Var.gb;
        bj bjVar = q1Var.L;
        if (bjVar == null || bjVar.h) {
            float f7 = this.b ? 1.0f : 0.0f;
            if (x1Var.S2) {
                f7 = org.telegram.messenger.i0.T1(1.0f - f7, f7, x1Var.L1);
            }
            float f10 = 1.0f * f7;
            if (f10 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var != null ? x1Var.i0 : 0.0f)) - org.telegram.messenger.i0.L(10 + ((!q1Var.O5.P3() || q1Var.A6 || q1Var.J) ? 0 : 6))) - q1Var.getExtraTextX();
            ej ejVar = q1Var.K;
            if (ejVar != null && !ejVar.i) {
                i10 = (int) q1Var.q3;
            } else if (q1Var.O5.P3()) {
                i10 = q1Var.getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                if (q1Var.O5.D == 19) {
                    i10 -= Math.max(0, (org.telegram.messenger.i0.L(14.0f) + (Math.max(q1Var.V7, q1Var.X7) + i10)) - org.telegram.messenger.i0.q.x);
                }
            } else {
                if (q1Var.A6) {
                    L = org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                    extraTextX = q1Var.getExtraTextX();
                } else {
                    L = org.telegram.messenger.i0.L(q1Var.J ? 12.0f : 18.0f) + q1Var.L6;
                    extraTextX = q1Var.getExtraTextX();
                }
                i10 = extraTextX + L;
            }
            int L2 = ((int) (i10 + x1Var.h0)) - org.telegram.messenger.i0.L(1.33f);
            int i11 = q1Var.q0;
            float f11 = L2;
            int i12 = (int) (backgroundDrawableRight - f11);
            int i13 = this.r;
            if (x1Var.Y2) {
                i13 = org.telegram.messenger.i0.W1(x1Var.L1, x1Var.U2, i13);
            }
            if (this.n && q1Var.getPrimaryMessageObject() != null) {
                boolean z10 = q1Var.getPrimaryMessageObject().X2;
            }
            boolean z11 = x1Var.a3;
            if (this.t == null) {
                this.t = new dl0(q1Var);
            }
            int p5 = this.t.p(q1Var.Ob);
            canvas.save();
            canvas.translate(f11, i11);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, i12, i13);
            dc dcVar = this.f;
            float a2 = dcVar != null ? dcVar.a(0.01f) : 1.0f;
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            this.t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f10, false, false);
            this.t.f(canvas, rectF, f10);
            qz0 qz0Var = this.c;
            if (qz0Var != null) {
                qz0Var.c(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(12.0f), f10, p5, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.i0.L(10.0f) + this.c.c + org.telegram.messenger.i0.L(4.0f)), org.telegram.messenger.i0.L(4.33f), org.telegram.messenger.i0.L(10.0f) + r0 + this.d.c, org.telegram.messenger.i0.L(21.66f));
                    dc dcVar2 = this.e;
                    float a10 = dcVar2 != null ? dcVar2.a(0.1f) : 1.0f;
                    canvas.save();
                    canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(17.0f), this.t.g);
                    this.d.c(org.telegram.messenger.i0.L(5.0f) + r0, org.telegram.messenger.i0.L(12.0f), f10, p5, canvas);
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
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        RectF rectF;
        float f11;
        int i13;
        float f12;
        Canvas canvas2 = canvas;
        q1 q1Var = this.a;
        x1 x1Var = q1Var.gb;
        bj bjVar = q1Var.L;
        if (bjVar == null || bjVar.h) {
            float f13 = this.b ? 1.0f : 0.0f;
            if (x1Var.S2) {
                f13 = org.telegram.messenger.i0.T1(1.0f - f13, f13, x1Var.L1);
            }
            float f14 = 1.0f * f13;
            if (f14 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var != null ? x1Var.i0 : 0.0f)) - org.telegram.messenger.i0.L(10 + ((!q1Var.O5.P3() || q1Var.A6 || q1Var.J) ? 0 : 6))) - q1Var.getExtraTextX();
            ej ejVar = q1Var.K;
            if (ejVar == null || ejVar.i) {
                if (q1Var.O5.P3()) {
                    i10 = q1Var.getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                    if (q1Var.O5.D == 19) {
                        i10 -= Math.max(0, (org.telegram.messenger.i0.L(14.0f) + (Math.max(q1Var.V7, q1Var.X7) + i10)) - org.telegram.messenger.i0.q.x);
                    }
                } else {
                    if (q1Var.A6) {
                        L = org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                        extraTextX = q1Var.getExtraTextX();
                    } else {
                        L = org.telegram.messenger.i0.L(q1Var.J ? 12.0f : 18.0f) + q1Var.L6;
                        extraTextX = q1Var.getExtraTextX();
                    }
                    i10 = extraTextX + L;
                }
            } else {
                i10 = (int) q1Var.q3;
            }
            int L2 = ((int) (i10 + x1Var.h0)) - org.telegram.messenger.i0.L(1.33f);
            int i14 = q1Var.q0;
            float f15 = L2;
            int i15 = (int) (backgroundDrawableRight - f15);
            int i16 = this.r;
            if (x1Var.Y2) {
                i16 = org.telegram.messenger.i0.W1(x1Var.L1, x1Var.U2, i16);
            }
            int i17 = i16;
            float f16 = (!this.n || (q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().X2)) ? 1.0f : 0.0f;
            if (x1Var.a3) {
                f16 = org.telegram.messenger.i0.T1(1.0f - f16, f16, x1Var.L1);
            }
            float f17 = f16;
            if (this.t == null) {
                this.t = new dl0(q1Var);
            }
            int p5 = this.t.p(q1Var.Ob);
            canvas2.save();
            canvas2.translate(f15, i14);
            RectF rectF2 = org.telegram.messenger.i0.P;
            float f18 = i15;
            float f19 = i17;
            rectF2.set(0.0f, 0.0f, f18, f19);
            dc dcVar = this.f;
            float a2 = dcVar != null ? dcVar.a(0.01f) : 1.0f;
            canvas2.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            if (this.g != null) {
                if (this.n) {
                    f11 = f19;
                    i11 = p5;
                    rectF = rectF2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f18, i17 - 1, zs.e4, 31);
                } else {
                    i11 = p5;
                    rectF = rectF2;
                    f11 = f19;
                }
                canvas2.save();
                canvas2.translate(org.telegram.messenger.i0.L(10.0f) - this.o, org.telegram.messenger.i0.L(22.0f));
                org.telegram.ui.ActionBar.t6.Z2.linkColor = i11;
                ji.a aVar = this.i;
                if (aVar != null && aVar.h(canvas2)) {
                    q1Var.n2();
                }
                if (q1Var.O5.P3()) {
                    org.telegram.ui.ActionBar.t6.Z2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Tc, q1Var.Ob));
                } else {
                    org.telegram.ui.ActionBar.t6.Z2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sc, q1Var.Ob));
                }
                int alpha = org.telegram.ui.ActionBar.t6.Z2.getAlpha();
                org.telegram.ui.ActionBar.t6.Z2.setAlpha((int) (alpha * f14));
                l1 l1Var = q1Var.Qa;
                if (l1Var != null && l1Var.g2() != null && q1Var.getDelegate().g2().z(q1Var.O5)) {
                    l9 g22 = q1Var.Qa.g2();
                    boolean P3 = q1Var.O5.P3();
                    StaticLayout staticLayout = this.g;
                    Paint paint = g22.p;
                    Paint paint2 = g22.o;
                    if (g22.s0) {
                        if (P3) {
                            int i18 = org.telegram.ui.ActionBar.t6.Jc;
                            paint2.setColor(g22.t(i18));
                            paint.setColor(g22.t(i18));
                        } else {
                            int i19 = org.telegram.ui.ActionBar.t6.ig;
                            paint2.setColor(g22.t(i19));
                            paint.setColor(g22.t(i19));
                        }
                        f7 = f17;
                        f10 = f14;
                        f12 = f18;
                        i12 = i15;
                        i13 = alpha;
                        g22.h(canvas, staticLayout, g22.u, g22.v, true, true, 0.0f);
                        canvas2 = canvas;
                        this.g.draw(canvas2);
                        canvas2.restore();
                        org.telegram.ui.ActionBar.t6.Z2.setAlpha(i13);
                        rectF.set(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(6.33f) + org.telegram.messenger.i0.L(22.0f) + this.p, i12 - org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.m5.C(6.33f, org.telegram.messenger.i0.L(22.0f) + this.p, 1));
                        org.telegram.ui.ActionBar.t6.c3.setColor(i11);
                        org.telegram.ui.ActionBar.t6.c3.setAlpha((int) (r2.getAlpha() * 0.5f * f10));
                        canvas2.drawRect(rectF, org.telegram.ui.ActionBar.t6.c3);
                        canvas2.save();
                        canvas2.translate(org.telegram.messenger.i0.L(10.0f) - this.q, org.telegram.messenger.i0.L(12.66f) + org.telegram.messenger.i0.L(22.0f) + this.p);
                        org.telegram.ui.ActionBar.t6.c3.setColor(i11);
                        org.telegram.ui.ActionBar.t6.c3.setAlpha((int) (r2.getAlpha() * f10));
                        this.h.draw(canvas2);
                        canvas2.restore();
                        if (q1Var.N1 == null) {
                            q1Var.N1 = new li.k(23);
                        }
                        if (this.n) {
                            canvas2.save();
                            int L3 = org.telegram.messenger.i0.L(org.telegram.messenger.i0.L(12.66f) + (org.telegram.messenger.i0.L(22.0f) + this.p) < i17 ? 20.0f : 24.0f);
                            float f20 = f11;
                            rectF.set(0.0f, org.telegram.messenger.m5.z(6.66f, i17, L3), f12, f20);
                            float f21 = (1.0f - f7) * f10;
                            q1Var.N1.o(canvas2, rectF, 3, f21);
                            float f22 = i17 - L3;
                            rectF.set(i12 - org.telegram.messenger.i0.L(60.0f), f22, i12 - org.telegram.messenger.i0.L(32.0f), f20);
                            q1Var.N1.o(canvas2, rectF, 2, f21);
                            rectF.set(i12 - org.telegram.messenger.i0.L(32.0f), f22, f12, f20);
                            canvas2.drawRect(rectF, q1Var.N1.D(f21, 2));
                            canvas2.restore();
                            canvas2.restore();
                        }
                    } else {
                        canvas2 = canvas;
                    }
                }
                f7 = f17;
                f10 = f14;
                i12 = i15;
                i13 = alpha;
                f12 = f18;
                this.g.draw(canvas2);
                canvas2.restore();
                org.telegram.ui.ActionBar.t6.Z2.setAlpha(i13);
                rectF.set(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(6.33f) + org.telegram.messenger.i0.L(22.0f) + this.p, i12 - org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.m5.C(6.33f, org.telegram.messenger.i0.L(22.0f) + this.p, 1));
                org.telegram.ui.ActionBar.t6.c3.setColor(i11);
                org.telegram.ui.ActionBar.t6.c3.setAlpha((int) (r2.getAlpha() * 0.5f * f10));
                canvas2.drawRect(rectF, org.telegram.ui.ActionBar.t6.c3);
                canvas2.save();
                canvas2.translate(org.telegram.messenger.i0.L(10.0f) - this.q, org.telegram.messenger.i0.L(12.66f) + org.telegram.messenger.i0.L(22.0f) + this.p);
                org.telegram.ui.ActionBar.t6.c3.setColor(i11);
                org.telegram.ui.ActionBar.t6.c3.setAlpha((int) (r2.getAlpha() * f10));
                this.h.draw(canvas2);
                canvas2.restore();
                if (q1Var.N1 == null) {
                }
                if (this.n) {
                }
            } else {
                i11 = p5;
                f7 = f17;
                f10 = f14;
                i12 = i15;
            }
            if (this.n) {
                if (this.l == null) {
                    Drawable mutate = q1Var.getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
                    this.l = mutate;
                    this.m = i11;
                    mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
                }
                if (i11 != this.m) {
                    Drawable drawable = this.l;
                    this.m = i11;
                    drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
                }
                canvas2.save();
                int L4 = org.telegram.messenger.i0.L(16.0f);
                this.l.setBounds((i12 - L4) - org.telegram.messenger.i0.L(7.0f), (i17 - L4) - org.telegram.messenger.i0.L(5.0f), i12 - org.telegram.messenger.i0.L(7.0f), i17 - org.telegram.messenger.i0.L(5.0f));
                canvas2.rotate(org.telegram.messenger.i0.W1(f7, 0, zs.K2), this.l.getBounds().centerX(), this.l.getBounds().centerY());
                this.l.setAlpha((int) (f10 * 255.0f));
                this.l.draw(canvas2);
                canvas2.restore();
            }
            canvas2.restore();
        }
    }
}
