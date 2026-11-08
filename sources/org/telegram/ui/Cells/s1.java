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
import org.telegram.messenger.aj;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dj;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zj0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class s1 {
    public final q1 a;
    public boolean b;
    public my0 c;
    public my0 d;
    public ic e;
    public ic f;
    public StaticLayout g;
    public StaticLayout h;
    public n2.n0 i;
    public x70 j;
    public boolean k;
    public Drawable l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public zj0 t;
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
        x1 x1Var = q1Var.hb;
        if (!this.b || this.c == null || this.d == null) {
            return false;
        }
        if (this.e == null) {
            this.e = new ic(q1Var);
        }
        if (this.f == null) {
            ic icVar = new ic(q1Var);
            this.f = icVar;
            icVar.f = new c1(q1Var, 0);
        }
        float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var != null ? x1Var.i0 : 0.0f)) - org.telegram.messenger.g0.L(10 + ((!q1Var.P5.Q3() || q1Var.B6 || q1Var.J) ? 0 : 6))) - q1Var.getExtraTextX();
        dj djVar = q1Var.K;
        if (djVar == null || djVar.i) {
            if (q1Var.P5.Q3()) {
                i7 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                if (q1Var.P5.D == 19) {
                    i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.W7, q1Var.Y7) + i7)) - org.telegram.messenger.g0.q.x);
                }
            } else {
                if (q1Var.B6) {
                    L = org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                    extraTextX = q1Var.getExtraTextX();
                } else {
                    L = org.telegram.messenger.g0.L(q1Var.J ? 12.0f : 18.0f) + q1Var.M6;
                    extraTextX = q1Var.getExtraTextX();
                }
                i7 = extraTextX + L;
            }
        } else {
            i7 = (int) q1Var.r3;
        }
        int L2 = ((int) (i7 + x1Var.h0)) - org.telegram.messenger.g0.L(1.33f);
        int i10 = q1Var.q0;
        float f10 = L2;
        int i11 = (int) (backgroundDrawableRight - f10);
        int x10 = (int) motionEvent.getX();
        int M1 = (int) q1Var.M1(motionEvent);
        int L3 = (int) (org.telegram.messenger.g0.L(10.0f) + L2 + this.c.c + org.telegram.messenger.g0.L(4.0f));
        int L4 = org.telegram.messenger.g0.L(4.33f) + i10;
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = L3;
        rectF.set(f11, L4, this.d.c + f11 + org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(17.33f) + L4);
        boolean contains = rectF.contains(motionEvent.getX(), q1Var.M1(motionEvent));
        rectF.set(f10, i10, L2 + i11, this.r + i10);
        boolean z9 = !contains && !q1Var.Ac && this.j == null && rectF.contains(motionEvent.getX(), q1Var.M1(motionEvent));
        if (((z9 && !q1Var.Ac) || this.j != null) && this.g != null) {
            if (this.i == null) {
                n2.n0 n0Var = new n2.n0(q1Var);
                this.i = n0Var;
                n0Var.d = new c1(q1Var, 0);
            }
            int L5 = (org.telegram.messenger.g0.L(10.0f) + L2) - this.o;
            int L6 = org.telegram.messenger.g0.L(22.0f) + i10;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && this.j != null)) {
                if (x10 < L5 || M1 < L6 || x10 > L5 + i11 || M1 > this.g.getHeight() + L6) {
                    q1Var.f3(1);
                } else {
                    try {
                        int i12 = M1 - L6;
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
                                if (characterStyleArr.length != 0 && ((!(characterStyleArr[0] instanceof y31) || y31.h) && !org.telegram.messenger.g0.C1())) {
                                    if (motionEvent.getAction() != 0) {
                                        x70 x70Var = this.j;
                                        if (x70Var == null || x70Var.i != characterStyleArr[0]) {
                                            this.i.m(x70Var, true);
                                            CharacterStyle characterStyle = characterStyleArr[0];
                                            org.telegram.ui.ActionBar.f6 f6Var = q1Var.Pb;
                                            float f13 = i12;
                                            float[] fArr = q1.id;
                                            x70 x70Var2 = new x70(characterStyle, f6Var, f12, f13, 0);
                                            this.j = x70Var2;
                                            zj0 zj0Var = this.t;
                                            if (zj0Var != null) {
                                                x70Var2.d(org.telegram.ui.ActionBar.k6.r1(0.1f, zj0Var.i()));
                                            }
                                            try {
                                                r70 b10 = this.j.b();
                                                int[] W1 = q1.W1(spannable, this.j.i);
                                                b10.d(this.g, W1[0], 0.0f);
                                                this.g.getSelectionPath(W1[0], W1[1], b10);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            this.i.b(this.j, 1);
                                            z9 = false;
                                        }
                                        q1Var.invalidate();
                                    } else {
                                        x70 x70Var3 = this.j;
                                        if (x70Var3 != null) {
                                            CharacterStyle characterStyle2 = characterStyleArr[0];
                                            CharacterStyle characterStyle3 = x70Var3.i;
                                            if (characterStyle2 == characterStyle3) {
                                                q1Var.Ra.N0(q1Var, characterStyle3, false);
                                                q1Var.f3(1);
                                                this.u = false;
                                                this.v = false;
                                                this.j = null;
                                            }
                                        }
                                    }
                                }
                            }
                            characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, a41.class);
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
        boolean z10 = this.n && z9;
        if (motionEvent.getAction() == 0) {
            this.u = contains;
            this.v = z10;
        } else if (motionEvent.getAction() == 2) {
            this.u = contains;
            this.v = z10;
        } else if (motionEvent.getAction() == 1) {
            if (this.u) {
                l1 l1Var2 = q1Var.Ra;
                if (l1Var2 != null) {
                    l1Var2.j2(q1Var, (int) ((this.d.c / 2.0f) + org.telegram.messenger.g0.L(4.0f) + L3), L4);
                }
            } else if (this.v && !x1Var.a3 && (l1Var = q1Var.Ra) != null) {
                l1Var.v(q1Var);
            }
            this.u = false;
            this.v = false;
        } else if (motionEvent.getAction() == 3) {
            this.u = false;
            this.v = false;
            n2.n0 n0Var2 = this.i;
            if (n0Var2 != null) {
                n0Var2.f(true);
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
        x1 x1Var = q1Var.hb;
        aj ajVar = q1Var.L;
        if (ajVar == null || ajVar.h) {
            float f10 = this.b ? 1.0f : 0.0f;
            if (x1Var.S2) {
                f10 = org.telegram.messenger.g0.T1(1.0f - f10, f10, x1Var.L1);
            }
            float f11 = 1.0f * f10;
            if (f11 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var != null ? x1Var.i0 : 0.0f)) - org.telegram.messenger.g0.L(10 + ((!q1Var.P5.Q3() || q1Var.B6 || q1Var.J) ? 0 : 6))) - q1Var.getExtraTextX();
            dj djVar = q1Var.K;
            if (djVar != null && !djVar.i) {
                i7 = (int) q1Var.r3;
            } else if (q1Var.P5.Q3()) {
                i7 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                if (q1Var.P5.D == 19) {
                    i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.W7, q1Var.Y7) + i7)) - org.telegram.messenger.g0.q.x);
                }
            } else {
                if (q1Var.B6) {
                    L = org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                    extraTextX = q1Var.getExtraTextX();
                } else {
                    L = org.telegram.messenger.g0.L(q1Var.J ? 12.0f : 18.0f) + q1Var.M6;
                    extraTextX = q1Var.getExtraTextX();
                }
                i7 = extraTextX + L;
            }
            int L2 = ((int) (i7 + x1Var.h0)) - org.telegram.messenger.g0.L(1.33f);
            int i10 = q1Var.q0;
            float f12 = L2;
            int i11 = (int) (backgroundDrawableRight - f12);
            int i12 = this.r;
            if (x1Var.Y2) {
                i12 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.U2, i12);
            }
            if (this.n && q1Var.getPrimaryMessageObject() != null) {
                boolean z9 = q1Var.getPrimaryMessageObject().a3;
            }
            boolean z10 = x1Var.a3;
            if (this.t == null) {
                this.t = new zj0(q1Var);
            }
            int p10 = this.t.p(q1Var.Pb);
            canvas.save();
            canvas.translate(f12, i10);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, i11, i12);
            ic icVar = this.f;
            float a10 = icVar != null ? icVar.a(0.01f) : 1.0f;
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            this.t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f11, false, false);
            this.t.f(canvas, rectF, f11);
            my0 my0Var = this.c;
            if (my0Var != null) {
                my0Var.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), f11, p10, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.g0.L(10.0f) + this.c.c + org.telegram.messenger.g0.L(4.0f)), org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(10.0f) + r0 + this.d.c, org.telegram.messenger.g0.L(21.66f));
                    ic icVar2 = this.e;
                    float a11 = icVar2 != null ? icVar2.a(0.1f) : 1.0f;
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
        x1 x1Var = q1Var.hb;
        aj ajVar = q1Var.L;
        if (ajVar == null || ajVar.h) {
            float f14 = this.b ? 1.0f : 0.0f;
            if (x1Var.S2) {
                f14 = org.telegram.messenger.g0.T1(1.0f - f14, f14, x1Var.L1);
            }
            float f15 = 1.0f * f14;
            if (f15 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var != null ? x1Var.i0 : 0.0f)) - org.telegram.messenger.g0.L(10 + ((!q1Var.P5.Q3() || q1Var.B6 || q1Var.J) ? 0 : 6))) - q1Var.getExtraTextX();
            dj djVar = q1Var.K;
            if (djVar == null || djVar.i) {
                if (q1Var.P5.Q3()) {
                    i7 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                    if (q1Var.P5.D == 19) {
                        i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.W7, q1Var.Y7) + i7)) - org.telegram.messenger.g0.q.x);
                    }
                } else {
                    if (q1Var.B6) {
                        L = org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                        extraTextX = q1Var.getExtraTextX();
                    } else {
                        L = org.telegram.messenger.g0.L(q1Var.J ? 12.0f : 18.0f) + q1Var.M6;
                        extraTextX = q1Var.getExtraTextX();
                    }
                    i7 = extraTextX + L;
                }
            } else {
                i7 = (int) q1Var.r3;
            }
            int L2 = ((int) (i7 + x1Var.h0)) - org.telegram.messenger.g0.L(1.33f);
            int i13 = q1Var.q0;
            float f16 = L2;
            int i14 = (int) (backgroundDrawableRight - f16);
            int i15 = this.r;
            if (x1Var.Y2) {
                i15 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.U2, i15);
            }
            int i16 = i15;
            float f17 = (!this.n || (q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().a3)) ? 1.0f : 0.0f;
            if (x1Var.a3) {
                f17 = org.telegram.messenger.g0.T1(1.0f - f17, f17, x1Var.L1);
            }
            float f18 = f17;
            if (this.t == null) {
                this.t = new zj0(q1Var);
            }
            int p10 = this.t.p(q1Var.Pb);
            canvas2.save();
            canvas2.translate(f16, i13);
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f19 = i14;
            float f20 = i16;
            rectF2.set(0.0f, 0.0f, f19, f20);
            ic icVar = this.f;
            float a10 = icVar != null ? icVar.a(0.01f) : 1.0f;
            canvas2.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            if (this.g != null) {
                if (this.n) {
                    f12 = f20;
                    i10 = p10;
                    rectF = rectF2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f19, i16 - 1, qs.e4, 31);
                } else {
                    i10 = p10;
                    rectF = rectF2;
                    f12 = f20;
                }
                canvas2.save();
                canvas2.translate(org.telegram.messenger.g0.L(10.0f) - this.o, org.telegram.messenger.g0.L(22.0f));
                org.telegram.ui.ActionBar.k6.Z2.linkColor = i10;
                n2.n0 n0Var = this.i;
                if (n0Var != null && n0Var.h(canvas2)) {
                    q1Var.p2();
                }
                if (q1Var.P5.Q3()) {
                    org.telegram.ui.ActionBar.k6.Z2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Tc, q1Var.Pb));
                } else {
                    org.telegram.ui.ActionBar.k6.Z2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, q1Var.Pb));
                }
                int alpha = org.telegram.ui.ActionBar.k6.Z2.getAlpha();
                org.telegram.ui.ActionBar.k6.Z2.setAlpha((int) (alpha * f15));
                l1 l1Var = q1Var.Ra;
                if (l1Var != null && l1Var.k2() != null && q1Var.getDelegate().k2().z(q1Var.P5)) {
                    j9 k22 = q1Var.Ra.k2();
                    boolean Q3 = q1Var.P5.Q3();
                    StaticLayout staticLayout = this.g;
                    Paint paint = k22.p;
                    Paint paint2 = k22.o;
                    if (k22.s0) {
                        if (Q3) {
                            int i17 = org.telegram.ui.ActionBar.k6.Jc;
                            paint2.setColor(k22.t(i17));
                            paint.setColor(k22.t(i17));
                        } else {
                            int i18 = org.telegram.ui.ActionBar.k6.ig;
                            paint2.setColor(k22.t(i18));
                            paint.setColor(k22.t(i18));
                        }
                        f10 = f18;
                        f11 = f15;
                        f13 = f19;
                        i11 = i14;
                        i12 = alpha;
                        k22.h(canvas, staticLayout, k22.u, k22.v, true, true, 0.0f);
                        canvas2 = canvas;
                        this.g.draw(canvas2);
                        canvas2.restore();
                        org.telegram.ui.ActionBar.k6.Z2.setAlpha(i12);
                        rectF.set(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(6.33f) + org.telegram.messenger.g0.L(22.0f) + this.p, i11 - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.k5.C(6.33f, org.telegram.messenger.g0.L(22.0f) + this.p, 1));
                        org.telegram.ui.ActionBar.k6.c3.setColor(i10);
                        org.telegram.ui.ActionBar.k6.c3.setAlpha((int) (r2.getAlpha() * 0.5f * f11));
                        canvas2.drawRect(rectF, org.telegram.ui.ActionBar.k6.c3);
                        canvas2.save();
                        canvas2.translate(org.telegram.messenger.g0.L(10.0f) - this.q, org.telegram.messenger.g0.L(12.66f) + org.telegram.messenger.g0.L(22.0f) + this.p);
                        org.telegram.ui.ActionBar.k6.c3.setColor(i10);
                        org.telegram.ui.ActionBar.k6.c3.setAlpha((int) (r2.getAlpha() * f11));
                        this.h.draw(canvas2);
                        canvas2.restore();
                        if (q1Var.O1 == null) {
                            q1Var.O1 = new h6.m(28);
                        }
                        if (this.n) {
                            canvas2.save();
                            int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.L(12.66f) + (org.telegram.messenger.g0.L(22.0f) + this.p) < i16 ? 20.0f : 24.0f);
                            float f21 = f12;
                            rectF.set(0.0f, org.telegram.messenger.k5.z(6.66f, i16, L3), f13, f21);
                            float f22 = (1.0f - f10) * f11;
                            q1Var.O1.m(canvas2, rectF, 3, f22);
                            float f23 = i16 - L3;
                            rectF.set(i11 - org.telegram.messenger.g0.L(60.0f), f23, i11 - org.telegram.messenger.g0.L(32.0f), f21);
                            q1Var.O1.m(canvas2, rectF, 2, f22);
                            rectF.set(i11 - org.telegram.messenger.g0.L(32.0f), f23, f13, f21);
                            canvas2.drawRect(rectF, q1Var.O1.u(f22, 2));
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
                org.telegram.ui.ActionBar.k6.Z2.setAlpha(i12);
                rectF.set(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(6.33f) + org.telegram.messenger.g0.L(22.0f) + this.p, i11 - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.k5.C(6.33f, org.telegram.messenger.g0.L(22.0f) + this.p, 1));
                org.telegram.ui.ActionBar.k6.c3.setColor(i10);
                org.telegram.ui.ActionBar.k6.c3.setAlpha((int) (r2.getAlpha() * 0.5f * f11));
                canvas2.drawRect(rectF, org.telegram.ui.ActionBar.k6.c3);
                canvas2.save();
                canvas2.translate(org.telegram.messenger.g0.L(10.0f) - this.q, org.telegram.messenger.g0.L(12.66f) + org.telegram.messenger.g0.L(22.0f) + this.p);
                org.telegram.ui.ActionBar.k6.c3.setColor(i10);
                org.telegram.ui.ActionBar.k6.c3.setAlpha((int) (r2.getAlpha() * f11));
                this.h.draw(canvas2);
                canvas2.restore();
                if (q1Var.O1 == null) {
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
                canvas2.rotate(org.telegram.messenger.g0.W1(f10, 0, qs.K2), this.l.getBounds().centerX(), this.l.getBounds().centerY());
                this.l.setAlpha((int) (f11 * 255.0f));
                this.l.draw(canvas2);
                canvas2.restore();
            }
            canvas2.restore();
        }
    }
}
