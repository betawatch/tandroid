package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.tz;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dl0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        int i10;
        boolean z10;
        q1 q1Var = this.a;
        q1Var.z0(0);
        if (this.b) {
            boolean z11 = this.d;
            if (this.c) {
                boolean z12 = (z11 ? 1 : 0) | 2;
                i10 = (z11 ? 1 : 0) + 1;
                z10 = z12;
            } else {
                i10 = z11 ? 1 : 0;
                z10 = z11;
            }
            boolean z13 = z10;
            if (this.e) {
                i10++;
                z13 = (z10 ? 1 : 0) | 4;
            }
            if (i10 == 0) {
                this.g = null;
                this.f = 0;
                return;
            }
            q1Var.u0 = org.telegram.messenger.i0.L(60.0f) + q1Var.u0;
            if (z13 != this.f) {
                this.f = 0;
                int y3 = z20.y(75.0f, q1Var.Z6, i10);
                float N = (q1Var.Z6 - org.telegram.messenger.i0.N(37.0f)) / i10;
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    this.g = new ArrayList(i10);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f |= 1;
                    this.g.add(q1.v0(5, cd.L0(2131743582, "ViewContact"), y3, N));
                }
                if (this.c) {
                    this.f |= 2;
                    this.g.add(q1.v0(30, cd.L0(2131745435, "SharedContactMessage"), y3, N));
                }
                if (this.e) {
                    this.f |= 4;
                    this.g.add(q1.v0(31, cd.L0(2131745436, "SharedContactAdd"), y3, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        float f7;
        boolean z10;
        boolean z11;
        float f10;
        dc dcVar;
        q1 q1Var = this.a;
        Drawable[] drawableArr = q1Var.H2;
        ag.c2 c2Var = q1Var.T0;
        if (q1Var.o8 == null) {
            q1Var.o8 = new dl0(q1Var);
        }
        int a2 = q1Var.o8.a(q1Var.O5, q1Var.ha, q1Var.ia, q1Var.Ob, 4);
        if (q1Var.Ea == null) {
            q1Var.Ea = new dc(q1Var, 2.0f, 2.0f);
        }
        int L = (int) (c2Var.K0 - org.telegram.messenger.i0.L(13.0f));
        int L2 = q1Var.c7 - org.telegram.messenger.i0.L(62.0f);
        sg.p0 p0Var = q1Var.N;
        if (!p0Var.p) {
            L2 -= p0Var.n;
        }
        if (q1Var.v7) {
            L2 -= org.telegram.messenger.i0.L(q1Var.B3() ? 39.3f : 41.0f);
        }
        int i10 = L2;
        if (q1Var.t2 == null) {
            q1Var.t2 = new RectF();
        }
        float backgroundDrawableRight = (q1Var.getBackgroundDrawableRight() - (org.telegram.messenger.i0.L(10.0f) + ((!q1Var.O5.P3() || q1Var.A6 || q1Var.J) ? 0 : org.telegram.messenger.i0.L(6.0f)))) - q1Var.getExtraTextX();
        x1 x1Var = q1Var.gb;
        if (x1Var.x0) {
            backgroundDrawableRight += x1Var.i0;
        }
        q1Var.t2.set(L, c2Var.L0 - org.telegram.messenger.i0.L(9.0f), backgroundDrawableRight, org.telegram.messenger.i0.L(38.0f) + i10);
        float a10 = q1Var.Ea.a(0.0125f);
        boolean z12 = a10 != 1.0f;
        if (z12) {
            canvas.save();
            canvas.scale(a10, a10, q1Var.t2.centerX(), q1Var.t2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            q1Var.J2[0] = 0;
            f7 = 2.0f;
            drawable.setBounds(L, (int) (c2Var.L0 - org.telegram.messenger.i0.L(9.0f)), (int) backgroundDrawableRight, org.telegram.messenger.i0.L(38.0f) + i10);
            if (q1Var.G2 != org.telegram.ui.ActionBar.t6.r1(0.1f, q1Var.o8.i())) {
                Drawable drawable2 = drawableArr[0];
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, q1Var.o8.i());
                q1Var.G2 = r12;
                org.telegram.ui.ActionBar.t6.H1(drawable2, r12, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f7 = 2.0f;
        }
        float floor = (float) Math.floor(tz.Y0 / 3.0f);
        int i11 = (int) floor;
        float f11 = 1.0f;
        q1Var.o8.c(floor, floor, floor, 1.0f, canvas, q1Var.t2);
        q1Var.o8.f(canvas, q1Var.t2, 1.0f);
        org.telegram.ui.ActionBar.t6.R2.setColor(a2);
        org.telegram.ui.ActionBar.t6.S2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ud, q1Var.Ob));
        if (q1Var.O5.P3()) {
            org.telegram.ui.ActionBar.t6.S2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Tc, q1Var.Ob));
        } else {
            org.telegram.ui.ActionBar.t6.S2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sc, q1Var.Ob));
        }
        if (q1Var.m2 != null) {
            canvas.save();
            canvas.translate(c2Var.K0 + c2Var.M0 + org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(27.0f) + q1Var.Sa);
            nh.i.f(canvas, q1Var.m2);
            canvas.restore();
        }
        if (q1Var.c3 != null) {
            canvas.save();
            canvas.translate(c2Var.K0 + c2Var.M0 + org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(50.0f) + q1Var.Sa);
            nh.i.f(canvas, q1Var.c3);
            canvas.restore();
        }
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.size() > 0) {
            org.telegram.ui.ActionBar.t6.M2.setColor(a2);
            org.telegram.ui.ActionBar.t6.Y1.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, a2));
            int alpha = org.telegram.ui.ActionBar.t6.M2.getAlpha();
            org.telegram.ui.ActionBar.t6.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(q1Var.t2.left + org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(f7) + i10, q1Var.t2.right - org.telegram.messenger.i0.L(7.0f), Math.max(1, org.telegram.messenger.i0.L(0.66f)) + org.telegram.messenger.i0.L(f7) + i10, org.telegram.ui.ActionBar.t6.M2);
            org.telegram.ui.ActionBar.t6.M2.setAlpha(alpha);
            int L3 = org.telegram.messenger.i0.L(f7) + i10;
            float L4 = org.telegram.messenger.i0.L(3.0f) + L;
            ArrayList arrayList2 = this.g;
            boolean z13 = arrayList2 != null && arrayList2.size() > 1;
            int i12 = q1Var.o8.x;
            int i13 = 0;
            while (i13 < this.g.size()) {
                n1 n1Var = (n1) this.g.get(i13);
                float f12 = n1Var.b;
                RectF rectF = n1Var.e;
                float min = Math.min(f12 + L4, q1Var.t2.right);
                rectF.set(L4, L3, min, org.telegram.messenger.i0.L(36.0f) + L3);
                if (z13 && n1Var.g == null) {
                    q1Var.Pa = i12;
                    z10 = false;
                    y c02 = org.telegram.ui.ActionBar.t6.c0(i12, 0, 0, i13 == this.g.size() - 1 ? i11 : 0, 0);
                    n1Var.g = c02;
                    c02.setCallback(q1Var);
                } else {
                    z10 = false;
                }
                y yVar = n1Var.g;
                float f13 = f11;
                if (yVar != null) {
                    yVar.setBounds((int) L4, L3, (int) min, org.telegram.messenger.i0.L(36.0f) + L3);
                    n1Var.g.draw(canvas);
                }
                if (z12 || (dcVar = n1Var.f) == null) {
                    z11 = z10;
                    f10 = f13;
                } else {
                    f10 = dcVar.a(0.02f);
                    z11 = f10 != f13 ? true : z10;
                }
                if (z11) {
                    canvas.save();
                    canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                }
                if (n1Var.d != null) {
                    canvas.save();
                    canvas.translate(n1Var.c + L4, org.telegram.messenger.i0.L(10.5f) + L3);
                    n1Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z11) {
                    canvas.restore();
                }
                L4 += n1Var.b;
                i13++;
                f11 = f13;
            }
        }
        if (z12) {
            canvas.restore();
        }
    }
}
