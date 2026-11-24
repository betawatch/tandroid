// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cc2 {
    public final rc2 a;
    public float b;
    public float c;
    public StaticLayout d;
    public int e;
    public StaticLayout f;
    public int g;
    public float h;

    public cc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01cb, code lost:
    
        if (r3 < 1.0f) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f, float f2) {
        Drawable drawable;
        k47 k47Var;
        rc2 rc2Var = this.a;
        ic2 ic2Var = rc2Var.D4;
        yc2 yc2Var = rc2Var.ub;
        RadialProgress2 radialProgress2 = rc2Var.Q0;
        if (rc2Var.Q5.O3()) {
            cmb.N2.setColor(cmb.v0(cmb.jc, rc2Var.cc));
            cmb.O2.setColor(cmb.v0(rc2Var.A2() ? cmb.cc : cmb.bc, rc2Var.cc));
            cmb.M2.setColor(cmb.v0(rc2Var.A2() ? cmb.lc : cmb.kc, rc2Var.cc));
            radialProgress2.d = cmb.v0((rc2Var.A2() || rc2Var.P3) ? cmb.hc : cmb.gc, rc2Var.cc);
        } else {
            p99 p99Var = rc2Var.o8;
            if (p99Var == null || !rc2Var.R1) {
                cmb.N2.setColor(cmb.v0(cmb.he, rc2Var.cc));
                cmb.O2.setColor(cmb.v0(rc2Var.A2() ? cmb.ge : cmb.fe, rc2Var.cc));
                cmb.M2.setColor(cmb.v0(rc2Var.A2() ? cmb.je : cmb.ie, rc2Var.cc));
                radialProgress2.d = cmb.v0((rc2Var.A2() || rc2Var.P3) ? cmb.Zd : cmb.Yd, rc2Var.cc);
            } else {
                cmb.N2.setColor(p99Var.h());
                cmb.O2.setColor(cmb.b(cmb.v0(rc2Var.A2() ? cmb.ge : cmb.fe, rc2Var.cc), rc2Var.o8.h()));
                cmb.M2.setColor(cmb.b(cmb.v0(rc2Var.A2() ? cmb.je : cmb.ie, rc2Var.cc), rc2Var.o8.h()));
                radialProgress2.d = cmb.b(cmb.v0((rc2Var.A2() || rc2Var.P3) ? cmb.Zd : cmb.Yd, rc2Var.cc), rc2Var.o8.h());
                ic2 ic2Var2 = rc2Var.D4;
                int b = cmb.b(cmb.v0(cmb.ke, rc2Var.cc), rc2Var.o8.h());
                int b2 = cmb.b(cmb.v0(cmb.le, rc2Var.cc), rc2Var.o8.h());
                int i = cmb.ne;
                ic2Var2.f(b, b2, cmb.b(cmb.v0(i, rc2Var.cc), rc2Var.o8.h()), cmb.b(cmb.v0(i, rc2Var.cc), rc2Var.o8.h()), cmb.b(cmb.v0(cmb.me, rc2Var.cc), rc2Var.o8.h()));
            }
        }
        float f3 = yc2Var.x0 ? yc2Var.h0 : 0.0f;
        m37 m37Var = rc2Var.A2() ? rc2Var.M6 : rc2Var.L6;
        radialProgress2.i.B = m37Var;
        radialProgress2.j.B = m37Var;
        radialProgress2.I = 1.0f;
        if (rc2Var.O1 && (k47Var = rc2Var.Q5) != null && k47Var.t2() && rc2Var.Q5.o4()) {
            if (rc2Var.Q5.O0) {
                float f4 = rc2Var.Y9;
                if (f4 != 0.0f) {
                }
            }
            radialProgress2.I *= rc2Var.Y9;
        }
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(rc2Var.O4 + f3 + this.e, rc2Var.getMediaOffsetY() + gm.L(13.0f) + rc2Var.gb);
        this.d.draw(canvas);
        canvas.restore();
        boolean D = MediaController.w().D(rc2Var.Q5);
        float f5 = this.h;
        if (D) {
            if (f5 != 1.0f) {
                float f6 = f5 + 0.16f;
                this.h = f6;
                if (f6 > 1.0f) {
                    this.h = 1.0f;
                }
                rc2Var.invalidate();
            }
        } else if (f5 != 0.0f) {
            float f7 = f5 - 0.16f;
            this.h = f7;
            if (f7 < 0.0f) {
                this.h = 0.0f;
            }
            rc2Var.invalidate();
        }
        float f8 = this.h;
        if (f8 > 0.0f) {
            float f9 = rc2Var.H4;
            if (yc2Var.x0) {
                f9 += yc2Var.k0;
            }
            if (f8 != 1.0f) {
                float f10 = rc2Var.G4 + f3;
                canvas.saveLayerAlpha(f10, f9, (ic2Var.f - ax9.E) + f10 + gm.L(24.0f), gm.L(24.0f) + f9, (int) (this.h * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.translate(rc2Var.G4 + f3, f9);
            ic2Var.b(canvas);
            canvas.restore();
        }
        if (this.h < 1.0f) {
            float f11 = rc2Var.O4 + f3 + this.g;
            float mediaOffsetY = rc2Var.getMediaOffsetY() + gm.L(35.0f) + rc2Var.gb;
            if (this.h != 0.0f) {
                canvas.saveLayerAlpha(f11, mediaOffsetY, this.f.getWidth() + f11, this.f.getHeight() + mediaOffsetY, (int) ((1.0f - this.h) * 255.0f), 31);
            } else {
                canvas.save();
            }
            float f12 = this.h;
            if (f12 != 0.0f) {
                float A = td4.A(1.0f, f12, 0.3f, 0.7f);
                canvas.scale(A, A, f11, (this.f.getHeight() / 2.0f) + mediaOffsetY);
            }
            canvas.translate(f11, mediaOffsetY);
            this.f.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(f3 + rc2Var.O4, rc2Var.getMediaOffsetY() + gm.L(57.0f) + rc2Var.gb);
        rc2Var.L4.draw(canvas);
        canvas.restore();
        if (rc2Var.H3()) {
            if (rc2Var.Q5.O3()) {
                drawable = rc2Var.b2(rc2Var.A2() ? "drawableMsgOutMenuSelected" : "drawableMsgOutMenu");
            } else {
                drawable = rc2Var.A2() ? cmb.c4 : cmb.b4;
            }
            int L = ((((int) f) + rc2Var.b7) - gm.L(rc2Var.Q5.D == 0 ? 58.0f : 48.0f)) - gm.L(rc2Var.R1 ? 18.0f : 0.0f);
            rc2Var.S3 = L;
            int L2 = ((int) f2) - gm.L(2.0f);
            rc2Var.T3 = L2;
            hg0.s(L, L2, drawable);
            float f13 = yc2Var.L1;
            if (f13 != 1.0f && yc2Var.i2) {
                drawable.setAlpha((int) (f13 * 255.0f));
            }
            drawable.draw(canvas);
            if (yc2Var.L1 == 1.0f || !yc2Var.i2) {
                return;
            }
            drawable.setAlpha(nm7.d4);
        }
    }

    public final void b(Canvas canvas, float f, float f2, int i) {
        float R1;
        float f3;
        float f4;
        float f5;
        int i2;
        float f6;
        float[] fArr;
        canvas.save();
        rc2 rc2Var = this.a;
        yc2 yc2Var = rc2Var.ub;
        int L = (gm.L(rc2Var.G ? 6.0f : 0.0f) + (rc2Var.getCurrentBackgroundRight() - rc2Var.getCurrentBackgroundLeft())) - gm.L((rc2Var.R1 ? 10 : 0) + 128);
        if (rc2Var.J4 == null) {
            bc2 bc2Var = new bc2(this, rc2Var, rc2Var.E4);
            rc2Var.J4 = bc2Var;
            k47 k47Var = rc2Var.Q5;
            TLRPC.Message message = k47Var.k;
            bc2Var.u(message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && v0c.m(k47Var), false);
            rc2Var.J4.s(v0c.l(rc2Var.Q5), false);
            rc2Var.J4.t(v0c.w(rc2Var.Q5), false);
        }
        if (rc2Var.R8 != 0) {
            this.b = gm.R1(hg9.v(21.0f, i, L), rc2Var.d9, 1.0f - rc2Var.getVideoTranscriptionProgress());
            R1 = gm.R1(gm.L(3.0f) + rc2Var.H4, rc2Var.e9 - gm.L(40.0f), 1.0f - rc2Var.getVideoTranscriptionProgress());
            this.c = R1;
        } else {
            float v = hg9.v(21.0f, i, L);
            k47 k47Var2 = rc2Var.Q5;
            this.b = gm.R1(v, (k47Var2 == null || !k47Var2.O3()) ? rc2Var.v2() ? Math.min(rc2Var.getPhotoImage().w() + gm.L(8.0f), rc2Var.getCompactRight() - gm.L(32.0f)) : (gm.L(8.0f) + rc2Var.getCurrentBackgroundRight()) - (gm.L(40.0f) * f2) : (gm.L(28.0f) * f2) + (rc2Var.getCurrentBackgroundLeft() - gm.L(40.0f)), 1.0f - rc2Var.getVideoTranscriptionProgress());
            float L2 = (rc2Var.e7 + yc2Var.j0) - gm.L(28 - (rc2Var.K ? 2 : 0));
            l39 l39Var = rc2Var.O;
            if (!l39Var.p) {
                L2 -= l39Var.i(yc2Var.L1);
            }
            R1 = gm.R1(gm.L(3.0f) + rc2Var.H4, ((gm.R1(L2, (rc2Var.getMediaOffsetY() + (gm.L(44.0f) + rc2Var.gb)) - gm.L(1.7f), rc2Var.getVideoTranscriptionProgress()) + gm.L(1.7f)) - gm.L(12.0f)) - (rc2Var.Q5.O3() ? 0.0f : gm.L(28.0f) * f2), 1.0f - rc2Var.getVideoTranscriptionProgress());
            this.c = R1;
        }
        bc2 bc2Var2 = rc2Var.J4;
        int i3 = (int) this.b;
        int i4 = (int) R1;
        int U1 = gm.U1(1.0f - rc2Var.getVideoTranscriptionProgress(), gm.L(30.0f), gm.L(32.0f));
        int U12 = gm.U1(1.0f - rc2Var.getVideoTranscriptionProgress(), gm.L(24.0f), gm.L(32.0f));
        int U13 = gm.U1(1.0f - rc2Var.getVideoTranscriptionProgress(), gm.L(8.0f), gm.L(16.0f));
        Rect rect = bc2Var2.u;
        if (U1 == rect.width() && U12 == rect.height()) {
            f3 = 12.0f;
            f4 = 40.0f;
            i2 = 2;
            f5 = 0.0f;
        } else {
            float f7 = U1 / 2.0f;
            f3 = 12.0f;
            float f8 = U13;
            f4 = 40.0f;
            float f9 = U12 / 2.0f;
            f5 = 0.0f;
            i2 = 2;
            bc2Var2.F = (float) ((Math.atan((f7 - f8) / f9) * 180.0d) / 3.141592653589793d);
            bc2Var2.G = (float) ((Math.atan(f7 / (f9 - f8)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i3, i4, i3 + U1, i4 + U12);
        int min = Math.min(Math.min(U1, U12) / 2, U13);
        bc2Var2.D = min;
        bc2Var2.E = min << 1;
        bc2 bc2Var3 = rc2Var.J4;
        int f10 = on2.f(rc2Var.M1 == 3 ? 1.0f : rc2Var.getVideoTranscriptionProgress(), cmb.v0(rc2Var.v2() ? cmb.Sa : cmb.Yc, rc2Var.cc), cmb.v0(rc2Var.Q5.O3() ? cmb.Ic : cmb.sk, rc2Var.cc));
        cmb.v0(cmb.x6, rc2Var.cc);
        rc2Var.Q5.N3();
        float videoTranscriptionProgress = rc2Var.M1 == 3 ? f5 : 1.0f - rc2Var.getVideoTranscriptionProgress();
        p09 p09Var = bc2Var3.p;
        p09 p09Var2 = bc2Var3.n;
        boolean z = bc2Var3.b != f10;
        bc2Var3.b = f10;
        bc2Var3.c = f10;
        int p = on2.p(f10, (int) (Color.alpha(f10) * 0.156f));
        bc2Var3.a = p;
        bc2Var3.e = videoTranscriptionProgress;
        bc2Var3.d = cmb.v(p, on2.p(f10, (int) (Color.alpha(f10) * (cmb.I.o() ? 0.3f : 0.2f))));
        Paint paint = bc2Var3.f;
        if (paint == null) {
            paint = new Paint();
            bc2Var3.f = paint;
        }
        paint.setColor(bc2Var3.a);
        bc2Var3.f.setAlpha((int) ((1.0f - videoTranscriptionProgress) * r10.getAlpha()));
        if (z || bc2Var3.q == null) {
            int L3 = gm.L(8.0f);
            int i5 = bc2Var3.d;
            fg0 i0 = cmb.i0(L3, L3, L3, L3, 0, i5, i5);
            bc2Var3.q = i0;
            i0.setCallback(bc2Var3.r);
        }
        if (z) {
            p09Var2.a0 = true;
            p09Var2.L(bc2Var3.c, "Artboard Outlines");
            p09Var2.j();
            p09Var2.E(true);
            p09Var2.Q(0L);
            int alpha = Color.alpha(f10);
            bc2Var3.m = alpha;
            p09Var2.setAlpha(alpha);
            p09Var.a0 = true;
            p09Var.L(bc2Var3.c, "Artboard Outlines");
            p09Var.j();
            p09Var.E(true);
            p09Var.Q(0L);
            int alpha2 = Color.alpha(f10);
            bc2Var3.o = alpha2;
            p09Var.setAlpha(alpha2);
        }
        if (bc2Var3.g == null) {
            Paint paint2 = new Paint(1);
            bc2Var3.g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            bc2Var3.g.setStrokeCap(Paint.Cap.ROUND);
        }
        bc2Var3.g.setColor(f10);
        bc2 bc2Var4 = rc2Var.J4;
        p09 p09Var3 = bc2Var4.p;
        p09 p09Var4 = bc2Var4.n;
        Rect rect2 = bc2Var4.v;
        Rect rect3 = bc2Var4.u;
        rect2.set(rect3.left - gm.L(8.0f), rect3.top - gm.L(8.0f), gm.L(8.0f) + rect3.right, gm.L(8.0f) + rect3.bottom);
        Path path = bc2Var4.C;
        if (path == null) {
            bc2Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = gm.P;
        rectF.set(rect3);
        Path path2 = bc2Var4.C;
        float f11 = bc2Var4.D;
        path2.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(bc2Var4.C);
        float f12 = bc2Var4.e * f;
        if (f12 > f5) {
            rc2 rc2Var2 = bc2Var4.T.a;
            Paint c2 = rc2Var2.Q5.O5() ? rc2Var2.c2("paintChatActionBackground") : rc2Var2.c2("paintChatTimeBackground");
            int alpha3 = c2.getAlpha();
            c2.setAlpha((int) (alpha3 * f12));
            rc2Var2.x();
            canvas.drawRect(rect3, c2);
            if (c2 == rc2Var2.c2("paintChatActionBackground") && rc2Var2.i2()) {
                int alpha4 = cmb.g2.getAlpha();
                cmb.g2.setAlpha((int) (alpha4 * f12));
                canvas.drawRect(rect3, cmb.g2);
                cmb.g2.setAlpha(alpha4);
            }
            c2.setAlpha(alpha3);
        }
        Paint paint3 = bc2Var4.f;
        if (paint3 != null) {
            int alpha5 = paint3.getAlpha();
            bc2Var4.f.setAlpha((int) (alpha5 * f));
            canvas.drawRect(rect3, bc2Var4.f);
            bc2Var4.f.setAlpha(alpha5);
        }
        fg0 fg0Var = bc2Var4.q;
        if (fg0Var != null) {
            fg0Var.setBounds(rect3);
            bc2Var4.q.draw(canvas);
        }
        canvas.restore();
        float e = bc2Var4.l.e(false, bc2Var4.k ? 1.0f : f5);
        if (e > f5) {
            long elapsedRealtime = (long) ((SystemClock.elapsedRealtime() - bc2Var4.t) * 0.75f);
            l94 l94Var = bc2Var4.B;
            float[] fArr2 = bc2Var4.M;
            if (fArr2 == null) {
                fArr2 = new float[i2];
                bc2Var4.M = fArr2;
            }
            long j = elapsedRealtime % 5400;
            float f13 = (1520 * j) / 5400.0f;
            fArr2[0] = f13 - 20.0f;
            fArr2[1] = f13;
            int i6 = 0;
            while (true) {
                fArr = bc2Var4.M;
                if (i6 >= 4) {
                    break;
                }
                int i7 = i6 * 1350;
                fArr[1] = (l94Var.getInterpolation((j - i7) / 667.0f) * 250.0f) + fArr[1];
                float[] fArr3 = bc2Var4.M;
                fArr3[0] = (l94Var.getInterpolation((j - (i7 + 667)) / 667.0f) * 250.0f) + fArr3[0];
                i6++;
            }
            f6 = 180.0f;
            Path path3 = bc2Var4.h;
            if (path3 == null) {
                bc2Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e * f4, fArr[1] - fArr[0]);
            float f14 = ((1.0f - e) * max * (bc2Var4.k ? f5 : 1.0f)) + fArr[0];
            float f15 = (max * e) + f14;
            float f16 = f14 % 360.0f;
            float f17 = f15 % 360.0f;
            if (f16 < f5) {
                f16 += 360.0f;
            }
            float f18 = f16;
            if (f17 < f5) {
                f17 += 360.0f;
            }
            float f19 = f17;
            Path path4 = bc2Var4.h;
            int centerX = rect3.centerX();
            int i8 = rect3.top;
            v0c.d(path4, centerX, i8, rect3.right - bc2Var4.D, i8, f18, f19, 0.0f, bc2Var4.F);
            v0c.b(bc2Var4.h, rect3.right, rect3.top, bc2Var4.E, 1, f18, f19, bc2Var4.F, bc2Var4.G);
            Path path5 = bc2Var4.h;
            int i9 = rect3.right;
            int i10 = rect3.top;
            int i11 = bc2Var4.D;
            int i12 = i10 + i11;
            int i13 = rect3.bottom - i11;
            float f20 = bc2Var4.G;
            v0c.d(path5, i9, i12, i9, i13, f18, f19, f20, 180.0f - f20);
            v0c.b(bc2Var4.h, rect3.right, rect3.bottom, bc2Var4.E, 2, f18, f19, 180.0f - bc2Var4.G, 180.0f - bc2Var4.F);
            Path path6 = bc2Var4.h;
            int i14 = rect3.right;
            int i15 = bc2Var4.D;
            int i16 = i14 - i15;
            int i17 = rect3.bottom;
            int i18 = rect3.left + i15;
            float f21 = bc2Var4.F;
            v0c.d(path6, i16, i17, i18, i17, f18, f19, 180.0f - f21, f21 + 180.0f);
            v0c.b(bc2Var4.h, rect3.left, rect3.bottom, bc2Var4.E, 3, f18, f19, bc2Var4.F + 180.0f, bc2Var4.G + 180.0f);
            Path path7 = bc2Var4.h;
            int i19 = rect3.left;
            int i20 = rect3.bottom;
            int i21 = bc2Var4.D;
            int i22 = i20 - i21;
            int i23 = rect3.top + i21;
            float f22 = bc2Var4.G;
            v0c.d(path7, i19, i22, i19, i23, f18, f19, f22 + 180.0f, 360.0f - f22);
            v0c.b(bc2Var4.h, rect3.left, rect3.top, bc2Var4.E, 4, f18, f19, 360.0f - bc2Var4.G, 360.0f - bc2Var4.F);
            v0c.d(bc2Var4.h, rect3.left + bc2Var4.D, rect3.top, rect3.centerX(), rect3.top, f18, f19, 360.0f - bc2Var4.F, 360.0f);
            bc2Var4.g.setStrokeWidth(gm.L(1.5f));
            int alpha6 = bc2Var4.g.getAlpha();
            bc2Var4.g.setAlpha((int) (alpha6 * f));
            canvas.drawPath(bc2Var4.h, bc2Var4.g);
            bc2Var4.g.setAlpha(alpha6);
            bc2Var4.r.invalidate();
        } else {
            f6 = 180.0f;
        }
        canvas.save();
        canvas.translate(gm.L(-13.0f) + rect3.centerX(), gm.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, gm.L(26.0f), gm.L(26.0f), nm7.d4, 31);
        if (bc2Var4.y) {
            p09Var4.setAlpha((int) (bc2Var4.m * f));
            p09Var4.draw(canvas);
        } else {
            p09Var3.setAlpha((int) (bc2Var4.o * f));
            p09Var3.draw(canvas);
        }
        float d = bc2Var4.j.d((!bc2Var4.i || bc2Var4.y || bc2Var4.k) ? false : true);
        if (d > f5) {
            canvas.save();
            canvas.translate(gm.L(18.0f), gm.L(f3));
            if (bc2Var4.H == null) {
                Paint paint4 = new Paint(1);
                bc2Var4.H = paint4;
                paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = gm.P;
            rectF2.set(f5, -gm.L(0.4f), gm.L(6.666f), gm.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, gm.L(2.0f), gm.L(2.0f), bc2Var4.H);
            Paint paint5 = bc2Var4.I;
            if (paint5 == null) {
                paint5 = new Paint(1);
                bc2Var4.I = paint5;
            }
            paint5.setColor(bc2Var4.c);
            int i24 = (int) (d * 255.0f);
            bc2Var4.I.setAlpha(i24);
            rectF2.set(0.0f, gm.L(3.33f), gm.L(6.666f), gm.L(8.33f));
            canvas.drawRoundRect(rectF2, gm.L(1.33f), gm.L(1.33f), bc2Var4.I);
            if (bc2Var4.L == null || Math.abs(bc2Var4.K - gm.p) > 0.1f) {
                bc2Var4.K = gm.p;
                Path path8 = new Path();
                bc2Var4.L = path8;
                path8.moveTo(gm.L(1.66f), gm.L(3.33f));
                bc2Var4.L.lineTo(gm.L(1.66f), gm.L(2.0f));
                rectF2.set(gm.L(1.66f), gm.L(0.33f), gm.L(4.99f), gm.L(3.6599998f));
                bc2Var4.L.arcTo(rectF2, -180.0f, f6, false);
                bc2Var4.L.lineTo(gm.L(5.0f), gm.L(3.33f));
            }
            if (bc2Var4.J == null) {
                Paint paint6 = new Paint(1);
                bc2Var4.J = paint6;
                paint6.setStyle(Paint.Style.STROKE);
            }
            bc2Var4.J.setStrokeWidth(gm.L(1.0f));
            bc2Var4.J.setColor(bc2Var4.c);
            bc2Var4.J.setAlpha(i24);
            canvas.drawPath(bc2Var4.L, bc2Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i, float f) {
        canvas.save();
        int L = gm.L(44.0f);
        rc2 rc2Var = this.a;
        canvas.translate(i, rc2Var.getMediaOffsetY() + L + rc2Var.gb + f);
        rc2Var.L4.draw(canvas);
        canvas.restore();
        k47 k47Var = rc2Var.Q5;
        if (k47Var.D == 0 || !k47Var.k.media_unread) {
            return;
        }
        cmb.R1.setColor(cmb.v0(k47Var.O3() ? cmb.sc : cmb.qe, rc2Var.cc));
        canvas.drawCircle(gm.L(6.0f) + i + rc2Var.N4, rc2Var.getMediaOffsetY() + gm.L(51.0f) + rc2Var.gb, gm.L(3.0f), cmb.R1);
    }

    public final void d(k47 k47Var, boolean z) {
        c47 c47Var;
        int L;
        f47 f47Var;
        rc2 rc2Var = this.a;
        l39 l39Var = rc2Var.O;
        int i = 0;
        rc2Var.E9 = (rc2Var.u6 || k47Var.k.fwd_from == null) ? false : true;
        rc2Var.v9 = (rc2Var.h6 && !k47Var.O3() && (k47Var.P1() < 0 || k47Var.P1() == 2666000)) || (((k47Var.o3() && k47Var.z4()) || (k47Var.y3() && k47Var.k.fwd_from.from_id == null)) && ((c47Var = rc2Var.M) == null || (c47Var.l & 4) != 0));
        if (gm.O1()) {
            int P0 = gm.P0();
            if (rc2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = P0 - gm.L(i + 50);
            rc2Var.b7 = Math.min(gm.L(270.0f), L);
        } else {
            int parentWidth = rc2Var.getParentWidth();
            if (rc2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = parentWidth - gm.L(i + 50);
            rc2Var.b7 = Math.min(gm.L(270.0f), L);
        }
        if (rc2Var.M != null) {
            rc2Var.b7 = L;
        }
        int v0 = rc2Var.v0(L, k47Var);
        rc2Var.setMessageObjectInternal(k47Var);
        rc2Var.v0 = gm.L(82.0f) + rc2Var.gb;
        if (gm.L(76.0f) + v0 >= (rc2Var.b7 - rc2Var.M9) - gm.L(12.0f)) {
            rc2Var.v0 = gm.L(14.0f) + rc2Var.v0;
        }
        if (rc2Var.M != null && (f47Var = rc2Var.L) != null && f47Var.d.size() > 1) {
            if ((rc2Var.M.l & 4) == 0) {
                rc2Var.v0 -= gm.L(6.0f);
                rc2Var.X1 -= gm.L(6.0f);
            }
            if ((rc2Var.M.l & 8) == 0) {
                rc2Var.v0 -= gm.L(6.0f);
            }
        }
        if (rc2Var.J) {
            rc2Var.gb -= gm.L(1.0f);
        }
        l39Var.getClass();
        l39Var.o(L - gm.L(24.0f), 3);
        if (l39Var.p) {
            return;
        }
        l39Var.n = gm.L(12.0f) + l39Var.m;
        rc2Var.Z2(k47Var);
        int i2 = l39Var.o;
        if (i2 > rc2Var.b7) {
            rc2Var.b7 = i2;
        }
        if (gm.L(24.0f) + l39Var.r + rc2Var.M9 > rc2Var.b7) {
            l39Var.n = gm.L(12.0f) + l39Var.n;
            l39Var.k -= gm.L(12.0f);
        }
        if (!k47Var.G0 && k47Var.z != null) {
            l39Var.k = gm.L(14.0f) + l39Var.k;
        }
        rc2Var.v0 += l39Var.n;
    }

    public final void e(k47 k47Var, boolean z) {
        int min;
        rc2 rc2Var = this.a;
        l39 l39Var = rc2Var.O;
        boolean z2 = true;
        rc2Var.E9 = !rc2Var.u6;
        int i = 0;
        if ((!rc2Var.h6 || k47Var.O3() || (k47Var.P1() >= 0 && k47Var.P1() != 2666000)) && ((!k47Var.o3() || !k47Var.z4()) && ((!k47Var.y3() || k47Var.k.fwd_from.from_id != null) && (!rc2Var.Y6 || k47Var.O3() || (!rc2Var.l6 && (!rc2Var.m6 || !rc2Var.W6)))))) {
            z2 = false;
        }
        rc2Var.v9 = z2;
        if (gm.O1()) {
            int P0 = gm.P0();
            if (rc2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(P0 - gm.L(i + 50), gm.L(270.0f));
            rc2Var.b7 = min;
        } else {
            int parentWidth = rc2Var.getParentWidth();
            if (rc2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(parentWidth - gm.L(i + 50), gm.L(270.0f));
            rc2Var.b7 = min;
        }
        rc2Var.v0(min, k47Var);
        rc2Var.setMessageObjectInternal(k47Var);
        int L = gm.L(70.0f);
        int i2 = rc2Var.gb;
        rc2Var.v0 = L + i2;
        if (rc2Var.J) {
            rc2Var.gb = i2 - gm.L(1.0f);
        }
        l39Var.getClass();
        l39Var.o(min - gm.L(k47Var.O3() ? 32.0f : 24.0f), 3);
        if (l39Var.p) {
            return;
        }
        l39Var.n = l39Var.m;
        if (TextUtils.isEmpty(k47Var.z)) {
            l39Var.n = gm.L(12.0f) + l39Var.n;
        } else {
            l39Var.n = gm.L(8.0f) + l39Var.n;
        }
        int i3 = l39Var.o;
        if (i3 > rc2Var.b7) {
            rc2Var.b7 = i3;
        }
        int L2 = gm.L(6.0f) + rc2Var.M9;
        if (k47.a4(k47Var.k) && !k47Var.m4()) {
            L2 -= gm.L(3.0f);
        } else if (k47Var.O3()) {
            L2 += gm.L(20.5f);
        }
        int extraTimeX = rc2Var.getExtraTimeX() + L2;
        if (!rc2Var.y2() && l39Var.r + extraTimeX >= rc2Var.b7) {
            l39Var.n = gm.L(12.0f) + l39Var.n;
            l39Var.k -= gm.L(12.0f);
        }
        rc2Var.v0 += l39Var.n;
    }
}
