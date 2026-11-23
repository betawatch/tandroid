package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ok0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s1 {
    public final r1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f = 0;
    public ArrayList g;
    public boolean h;

    public s1(r1 r1Var) {
        this.a = r1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int i7;
        boolean z10;
        r1 r1Var = this.a;
        r1Var.B0(0);
        if (this.b) {
            boolean z11 = this.d;
            if (this.c) {
                boolean z12 = (z11 ? 1 : 0) | 2;
                i7 = (z11 ? 1 : 0) + 1;
                z10 = z12;
            } else {
                i7 = z11 ? 1 : 0;
                z10 = z11;
            }
            boolean z13 = z10;
            if (this.e) {
                i7++;
                z13 = (z10 ? 1 : 0) | 4;
            }
            if (i7 == 0) {
                this.g = null;
                this.f = 0;
                return;
            }
            r1Var.v0 = org.telegram.messenger.g0.L(60.0f) + r1Var.v0;
            if (z13 != this.f) {
                this.f = 0;
                int z14 = m10.z(75.0f, r1Var.b7, i7);
                float N = (r1Var.b7 - org.telegram.messenger.g0.N(37.0f)) / i7;
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    this.g = new ArrayList(i7);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f |= 1;
                    this.g.add(r1.x0(5, gd.N0(2131743306, "ViewContact"), z14, N));
                }
                if (this.c) {
                    this.f |= 2;
                    this.g.add(r1.x0(30, gd.N0(2131745221, "SharedContactMessage"), z14, N));
                }
                if (this.e) {
                    this.f |= 4;
                    this.g.add(r1.x0(31, gd.N0(2131745222, "SharedContactAdd"), z14, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        lc lcVar;
        r1 r1Var = this.a;
        Drawable[] drawableArr = r1Var.J2;
        fi.s2 s2Var = r1Var.U0;
        if (r1Var.q8 == null) {
            r1Var.q8 = new ok0(r1Var);
        }
        int a10 = r1Var.q8.a(r1Var.Q5, r1Var.ja, r1Var.ka, r1Var.Qb, 4);
        if (r1Var.Ga == null) {
            r1Var.Ga = new lc(r1Var, 2.0f, 2.0f);
        }
        int L = (int) (s2Var.L0 - org.telegram.messenger.g0.L(13.0f));
        int L2 = r1Var.e7 - org.telegram.messenger.g0.L(62.0f);
        ch.q0 q0Var = r1Var.O;
        if (!q0Var.p) {
            L2 -= q0Var.n;
        }
        if (r1Var.x7) {
            L2 -= org.telegram.messenger.g0.L(r1Var.H3() ? 39.3f : 41.0f);
        }
        int i7 = L2;
        if (r1Var.v2 == null) {
            r1Var.v2 = new RectF();
        }
        float backgroundDrawableRight = (r1Var.getBackgroundDrawableRight() - (org.telegram.messenger.g0.L(10.0f) + ((!r1Var.Q5.P3() || r1Var.C6 || r1Var.K) ? 0 : org.telegram.messenger.g0.L(6.0f)))) - r1Var.getExtraTextX();
        y1 y1Var = r1Var.ib;
        if (y1Var.x0) {
            backgroundDrawableRight += y1Var.i0;
        }
        r1Var.v2.set(L, s2Var.M0 - org.telegram.messenger.g0.L(9.0f), backgroundDrawableRight, org.telegram.messenger.g0.L(38.0f) + i7);
        float a11 = r1Var.Ga.a(0.0125f);
        boolean z12 = a11 != 1.0f;
        if (z12) {
            canvas.save();
            canvas.scale(a11, a11, r1Var.v2.centerX(), r1Var.v2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            r1Var.L2[0] = 0;
            f10 = 2.0f;
            drawable.setBounds(L, (int) (s2Var.M0 - org.telegram.messenger.g0.L(9.0f)), (int) backgroundDrawableRight, org.telegram.messenger.g0.L(38.0f) + i7);
            if (r1Var.I2 != org.telegram.ui.ActionBar.n6.r1(0.1f, r1Var.q8.i())) {
                Drawable drawable2 = drawableArr[0];
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, r1Var.q8.i());
                r1Var.I2 = r12;
                org.telegram.ui.ActionBar.n6.H1(drawable2, r12, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f10 = 2.0f;
        }
        float floor = (float) Math.floor(bz.Y0 / 3.0f);
        int i10 = (int) floor;
        float f12 = 1.0f;
        r1Var.q8.c(floor, floor, floor, 1.0f, canvas, r1Var.v2);
        r1Var.q8.f(canvas, r1Var.v2, 1.0f);
        org.telegram.ui.ActionBar.n6.R2.setColor(a10);
        org.telegram.ui.ActionBar.n6.S2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xd, r1Var.Qb));
        if (r1Var.Q5.P3()) {
            org.telegram.ui.ActionBar.n6.S2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Wc, r1Var.Qb));
        } else {
            org.telegram.ui.ActionBar.n6.S2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Vc, r1Var.Qb));
        }
        if (r1Var.o2 != null) {
            canvas.save();
            canvas.translate(s2Var.L0 + s2Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(27.0f) + r1Var.Ua);
            xh.f.f(canvas, r1Var.o2);
            canvas.restore();
        }
        if (r1Var.e3 != null) {
            canvas.save();
            canvas.translate(s2Var.L0 + s2Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(50.0f) + r1Var.Ua);
            xh.f.f(canvas, r1Var.e3);
            canvas.restore();
        }
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.size() > 0) {
            org.telegram.ui.ActionBar.n6.M2.setColor(a10);
            org.telegram.ui.ActionBar.n6.Y1.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, a10));
            int alpha = org.telegram.ui.ActionBar.n6.M2.getAlpha();
            org.telegram.ui.ActionBar.n6.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(r1Var.v2.left + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(f10) + i7, r1Var.v2.right - org.telegram.messenger.g0.L(7.0f), Math.max(1, org.telegram.messenger.g0.L(0.66f)) + org.telegram.messenger.g0.L(f10) + i7, org.telegram.ui.ActionBar.n6.M2);
            org.telegram.ui.ActionBar.n6.M2.setAlpha(alpha);
            int L3 = org.telegram.messenger.g0.L(f10) + i7;
            float L4 = org.telegram.messenger.g0.L(3.0f) + L;
            ArrayList arrayList2 = this.g;
            boolean z13 = arrayList2 != null && arrayList2.size() > 1;
            int i11 = r1Var.q8.x;
            int i12 = 0;
            while (i12 < this.g.size()) {
                o1 o1Var = (o1) this.g.get(i12);
                float f13 = o1Var.b;
                RectF rectF = o1Var.e;
                float min = Math.min(f13 + L4, r1Var.v2.right);
                rectF.set(L4, L3, min, org.telegram.messenger.g0.L(36.0f) + L3);
                if (z13 && o1Var.g == null) {
                    r1Var.Ra = i11;
                    z10 = false;
                    y c02 = org.telegram.ui.ActionBar.n6.c0(i11, 0, 0, i12 == this.g.size() - 1 ? i10 : 0, 0);
                    o1Var.g = c02;
                    c02.setCallback(r1Var);
                } else {
                    z10 = false;
                }
                y yVar = o1Var.g;
                float f14 = f12;
                if (yVar != null) {
                    yVar.setBounds((int) L4, L3, (int) min, org.telegram.messenger.g0.L(36.0f) + L3);
                    o1Var.g.draw(canvas);
                }
                if (z12 || (lcVar = o1Var.f) == null) {
                    z11 = z10;
                    f11 = f14;
                } else {
                    f11 = lcVar.a(0.02f);
                    z11 = f11 != f14 ? true : z10;
                }
                if (z11) {
                    canvas.save();
                    canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                }
                if (o1Var.d != null) {
                    canvas.save();
                    canvas.translate(o1Var.c + L4, org.telegram.messenger.g0.L(10.5f) + L3);
                    o1Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z11) {
                    canvas.restore();
                }
                L4 += o1Var.b;
                i12++;
                f12 = f14;
            }
        }
        if (z12) {
            canvas.restore();
        }
    }
}
