package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r1 {
    public final q1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f = 0;
    public ArrayList g;
    public boolean h;

    public r1(q1 q1Var) {
        this.a = q1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int i7;
        boolean z10;
        q1 q1Var = this.a;
        q1Var.B0(0);
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
            q1Var.v0 = org.telegram.messenger.g0.L(60.0f) + q1Var.v0;
            if (z13 != this.f) {
                this.f = 0;
                int y10 = i20.y(75.0f, q1Var.b7, i7);
                float N = (q1Var.b7 - org.telegram.messenger.g0.N(37.0f)) / i7;
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    this.g = new ArrayList(i7);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f |= 1;
                    this.g.add(q1.x0(5, hd.M0(2131743556, "ViewContact"), y10, N));
                }
                if (this.c) {
                    this.f |= 2;
                    this.g.add(q1.x0(30, hd.M0(2131745417, "SharedContactMessage"), y10, N));
                }
                if (this.e) {
                    this.f |= 4;
                    this.g.add(q1.x0(31, hd.M0(2131745418, "SharedContactAdd"), y10, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        dc dcVar;
        q1 q1Var = this.a;
        Drawable[] drawableArr = q1Var.J2;
        fi.u2 u2Var = q1Var.U0;
        if (q1Var.q8 == null) {
            q1Var.q8 = new ek0(q1Var);
        }
        int a10 = q1Var.q8.a(q1Var.Q5, q1Var.ja, q1Var.ka, q1Var.Qb, 4);
        if (q1Var.Ga == null) {
            q1Var.Ga = new dc(q1Var, 2.0f, 2.0f);
        }
        int L = (int) (u2Var.L0 - org.telegram.messenger.g0.L(13.0f));
        int L2 = q1Var.e7 - org.telegram.messenger.g0.L(62.0f);
        ch.q0 q0Var = q1Var.O;
        if (!q0Var.p) {
            L2 -= q0Var.n;
        }
        if (q1Var.x7) {
            L2 -= org.telegram.messenger.g0.L(q1Var.G3() ? 39.3f : 41.0f);
        }
        int i7 = L2;
        if (q1Var.v2 == null) {
            q1Var.v2 = new RectF();
        }
        float backgroundDrawableRight = (q1Var.getBackgroundDrawableRight() - (org.telegram.messenger.g0.L(10.0f) + ((!q1Var.Q5.P3() || q1Var.C6 || q1Var.K) ? 0 : org.telegram.messenger.g0.L(6.0f)))) - q1Var.getExtraTextX();
        x1 x1Var = q1Var.ib;
        if (x1Var.x0) {
            backgroundDrawableRight += x1Var.i0;
        }
        q1Var.v2.set(L, u2Var.M0 - org.telegram.messenger.g0.L(9.0f), backgroundDrawableRight, org.telegram.messenger.g0.L(38.0f) + i7);
        float a11 = q1Var.Ga.a(0.0125f);
        boolean z12 = a11 != 1.0f;
        if (z12) {
            canvas.save();
            canvas.scale(a11, a11, q1Var.v2.centerX(), q1Var.v2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            q1Var.L2[0] = 0;
            f10 = 2.0f;
            drawable.setBounds(L, (int) (u2Var.M0 - org.telegram.messenger.g0.L(9.0f)), (int) backgroundDrawableRight, org.telegram.messenger.g0.L(38.0f) + i7);
            if (q1Var.I2 != org.telegram.ui.ActionBar.j6.r1(0.1f, q1Var.q8.i())) {
                Drawable drawable2 = drawableArr[0];
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, q1Var.q8.i());
                q1Var.I2 = r12;
                org.telegram.ui.ActionBar.j6.H1(drawable2, r12, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f10 = 2.0f;
        }
        float floor = (float) Math.floor(gz.Y0 / 3.0f);
        int i10 = (int) floor;
        float f12 = 1.0f;
        q1Var.q8.c(floor, floor, floor, 1.0f, canvas, q1Var.v2);
        q1Var.q8.f(canvas, q1Var.v2, 1.0f);
        org.telegram.ui.ActionBar.j6.R2.setColor(a10);
        org.telegram.ui.ActionBar.j6.S2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Xd, q1Var.Qb));
        if (q1Var.Q5.P3()) {
            org.telegram.ui.ActionBar.j6.S2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Wc, q1Var.Qb));
        } else {
            org.telegram.ui.ActionBar.j6.S2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Vc, q1Var.Qb));
        }
        if (q1Var.o2 != null) {
            canvas.save();
            canvas.translate(u2Var.L0 + u2Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(27.0f) + q1Var.Ua);
            xh.f.f(canvas, q1Var.o2);
            canvas.restore();
        }
        if (q1Var.e3 != null) {
            canvas.save();
            canvas.translate(u2Var.L0 + u2Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(50.0f) + q1Var.Ua);
            xh.f.f(canvas, q1Var.e3);
            canvas.restore();
        }
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.size() > 0) {
            org.telegram.ui.ActionBar.j6.M2.setColor(a10);
            org.telegram.ui.ActionBar.j6.Y1.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, a10));
            int alpha = org.telegram.ui.ActionBar.j6.M2.getAlpha();
            org.telegram.ui.ActionBar.j6.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(q1Var.v2.left + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(f10) + i7, q1Var.v2.right - org.telegram.messenger.g0.L(7.0f), Math.max(1, org.telegram.messenger.g0.L(0.66f)) + org.telegram.messenger.g0.L(f10) + i7, org.telegram.ui.ActionBar.j6.M2);
            org.telegram.ui.ActionBar.j6.M2.setAlpha(alpha);
            int L3 = org.telegram.messenger.g0.L(f10) + i7;
            float L4 = org.telegram.messenger.g0.L(3.0f) + L;
            ArrayList arrayList2 = this.g;
            boolean z13 = arrayList2 != null && arrayList2.size() > 1;
            int i11 = q1Var.q8.x;
            int i12 = 0;
            while (i12 < this.g.size()) {
                n1 n1Var = (n1) this.g.get(i12);
                float f13 = n1Var.b;
                RectF rectF = n1Var.e;
                float min = Math.min(f13 + L4, q1Var.v2.right);
                rectF.set(L4, L3, min, org.telegram.messenger.g0.L(36.0f) + L3);
                if (z13 && n1Var.g == null) {
                    q1Var.Ra = i11;
                    z10 = false;
                    y c02 = org.telegram.ui.ActionBar.j6.c0(i11, 0, 0, i12 == this.g.size() - 1 ? i10 : 0, 0);
                    n1Var.g = c02;
                    c02.setCallback(q1Var);
                } else {
                    z10 = false;
                }
                y yVar = n1Var.g;
                float f14 = f12;
                if (yVar != null) {
                    yVar.setBounds((int) L4, L3, (int) min, org.telegram.messenger.g0.L(36.0f) + L3);
                    n1Var.g.draw(canvas);
                }
                if (z12 || (dcVar = n1Var.f) == null) {
                    z11 = z10;
                    f11 = f14;
                } else {
                    f11 = dcVar.a(0.02f);
                    z11 = f11 != f14 ? true : z10;
                }
                if (z11) {
                    canvas.save();
                    canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                }
                if (n1Var.d != null) {
                    canvas.save();
                    canvas.translate(n1Var.c + L4, org.telegram.messenger.g0.L(10.5f) + L3);
                    n1Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z11) {
                    canvas.restore();
                }
                L4 += n1Var.b;
                i12++;
                f12 = f14;
            }
        }
        if (z12) {
            canvas.restore();
        }
    }
}
