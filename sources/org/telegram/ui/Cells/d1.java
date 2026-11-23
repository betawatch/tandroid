package org.telegram.ui.Cells;

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
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.yi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.ym0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d1 {
    public final r1 a;
    public float b;
    public float c;
    public StaticLayout d;
    public int e;
    public StaticLayout f;
    public int g;
    public float h;

    public d1(r1 r1Var) {
        this.a = r1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ce, code lost:
    
        if (r3 < 1.0f) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f10, float f11) {
        float f12;
        Drawable drawable;
        gj gjVar;
        r1 r1Var = this.a;
        j1 j1Var = r1Var.D4;
        y1 y1Var = r1Var.ib;
        RadialProgress2 radialProgress2 = r1Var.Q0;
        if (r1Var.Q5.P3()) {
            org.telegram.ui.ActionBar.m6.O2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.kc, r1Var.Qb));
            org.telegram.ui.ActionBar.m6.P2.setColor(org.telegram.ui.ActionBar.m6.w0(r1Var.A2() ? org.telegram.ui.ActionBar.m6.dc : org.telegram.ui.ActionBar.m6.cc, r1Var.Qb));
            org.telegram.ui.ActionBar.m6.N2.setColor(org.telegram.ui.ActionBar.m6.w0(r1Var.A2() ? org.telegram.ui.ActionBar.m6.mc : org.telegram.ui.ActionBar.m6.lc, r1Var.Qb));
            radialProgress2.d = org.telegram.ui.ActionBar.m6.w0((r1Var.A2() || r1Var.P3 != 0) ? org.telegram.ui.ActionBar.m6.ic : org.telegram.ui.ActionBar.m6.hc, r1Var.Qb);
        } else {
            ok0 ok0Var = r1Var.o8;
            if (ok0Var == null || !r1Var.R1) {
                org.telegram.ui.ActionBar.m6.O2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.ie, r1Var.Qb));
                org.telegram.ui.ActionBar.m6.P2.setColor(org.telegram.ui.ActionBar.m6.w0(r1Var.A2() ? org.telegram.ui.ActionBar.m6.he : org.telegram.ui.ActionBar.m6.ge, r1Var.Qb));
                org.telegram.ui.ActionBar.m6.N2.setColor(org.telegram.ui.ActionBar.m6.w0(r1Var.A2() ? org.telegram.ui.ActionBar.m6.ke : org.telegram.ui.ActionBar.m6.je, r1Var.Qb));
                radialProgress2.d = org.telegram.ui.ActionBar.m6.w0((r1Var.A2() || r1Var.P3 != 0) ? org.telegram.ui.ActionBar.m6.ae : org.telegram.ui.ActionBar.m6.Zd, r1Var.Qb);
            } else {
                org.telegram.ui.ActionBar.m6.O2.setColor(ok0Var.i());
                org.telegram.ui.ActionBar.m6.P2.setColor(org.telegram.ui.ActionBar.m6.c(org.telegram.ui.ActionBar.m6.w0(r1Var.A2() ? org.telegram.ui.ActionBar.m6.he : org.telegram.ui.ActionBar.m6.ge, r1Var.Qb), r1Var.o8.i()));
                org.telegram.ui.ActionBar.m6.N2.setColor(org.telegram.ui.ActionBar.m6.c(org.telegram.ui.ActionBar.m6.w0(r1Var.A2() ? org.telegram.ui.ActionBar.m6.ke : org.telegram.ui.ActionBar.m6.je, r1Var.Qb), r1Var.o8.i()));
                radialProgress2.d = org.telegram.ui.ActionBar.m6.c(org.telegram.ui.ActionBar.m6.w0((r1Var.A2() || r1Var.P3 != 0) ? org.telegram.ui.ActionBar.m6.ae : org.telegram.ui.ActionBar.m6.Zd, r1Var.Qb), r1Var.o8.i());
                j1 j1Var2 = r1Var.D4;
                int c10 = org.telegram.ui.ActionBar.m6.c(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.le, r1Var.Qb), r1Var.o8.i());
                int c11 = org.telegram.ui.ActionBar.m6.c(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.me, r1Var.Qb), r1Var.o8.i());
                int i7 = org.telegram.ui.ActionBar.m6.oe;
                j1Var2.g(c10, c11, org.telegram.ui.ActionBar.m6.c(org.telegram.ui.ActionBar.m6.w0(i7, r1Var.Qb), r1Var.o8.i()), org.telegram.ui.ActionBar.m6.c(org.telegram.ui.ActionBar.m6.w0(i7, r1Var.Qb), r1Var.o8.i()), org.telegram.ui.ActionBar.m6.c(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.ne, r1Var.Qb), r1Var.o8.i()));
            }
        }
        float f13 = y1Var.x0 ? y1Var.h0 : 0.0f;
        org.telegram.ui.ActionBar.u4 u4Var = r1Var.A2() ? r1Var.M6 : r1Var.L6;
        radialProgress2.i.B = u4Var;
        radialProgress2.j.B = u4Var;
        radialProgress2.I = 1.0f;
        if (r1Var.O1 && (gjVar = r1Var.Q5) != null && gjVar.t2() && r1Var.Q5.p4()) {
            if (r1Var.Q5.O0) {
                float f14 = r1Var.M9;
                if (f14 != 0.0f) {
                }
            }
            radialProgress2.I *= r1Var.M9;
        }
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(r1Var.O4 + f13 + this.e, r1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(13.0f) + r1Var.Ua);
        this.d.draw(canvas);
        canvas.restore();
        boolean I = MediaController.B().I(r1Var.Q5);
        if (I) {
            float f15 = this.h;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.16f;
                this.h = f16;
                if (f16 > 1.0f) {
                    this.h = 1.0f;
                }
                r1Var.invalidate();
                f12 = this.h;
                if (f12 > 0.0f) {
                    float f17 = r1Var.H4;
                    if (y1Var.x0) {
                        f17 += y1Var.k0;
                    }
                    if (f12 != 1.0f) {
                        float f18 = r1Var.G4 + f13;
                        canvas.saveLayerAlpha(f18, f17, (j1Var.f - ym0.E) + f18 + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + f17, (int) (this.h * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    canvas.translate(r1Var.G4 + f13, f17);
                    j1Var.b(canvas);
                    canvas.restore();
                }
                if (this.h < 1.0f) {
                    float f19 = r1Var.O4 + f13 + this.g;
                    float mediaOffsetY = r1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(35.0f) + r1Var.Ua;
                    if (this.h != 0.0f) {
                        canvas.saveLayerAlpha(f19, mediaOffsetY, this.f.getWidth() + f19, this.f.getHeight() + mediaOffsetY, (int) ((1.0f - this.h) * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    float f20 = this.h;
                    if (f20 != 0.0f) {
                        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f20, 0.3f, 0.7f);
                        canvas.scale(z10, z10, f19, (this.f.getHeight() / 2.0f) + mediaOffsetY);
                    }
                    canvas.translate(f19, mediaOffsetY);
                    this.f.draw(canvas);
                    canvas.restore();
                }
                canvas.save();
                canvas.translate(f13 + r1Var.O4, r1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(57.0f) + r1Var.Ua);
                r1Var.L4.draw(canvas);
                canvas.restore();
                if (r1Var.G3()) {
                    return;
                }
                if (r1Var.Q5.P3()) {
                    drawable = r1Var.Z1(r1Var.A2() ? "drawableMsgOutMenuSelected" : "drawableMsgOutMenu");
                } else {
                    drawable = r1Var.A2() ? org.telegram.ui.ActionBar.m6.d4 : org.telegram.ui.ActionBar.m6.c4;
                }
                int L = ((((int) f10) + r1Var.b7) - org.telegram.messenger.g0.L(r1Var.Q5.D == 0 ? 58.0f : 48.0f)) - org.telegram.messenger.g0.L(r1Var.R1 ? 18.0f : 0.0f);
                r1Var.S3 = L;
                int L2 = ((int) f11) - org.telegram.messenger.g0.L(2.0f);
                r1Var.T3 = L2;
                z.s(L, L2, drawable);
                float f21 = y1Var.L1;
                if (f21 != 1.0f && y1Var.i2) {
                    drawable.setAlpha((int) (f21 * 255.0f));
                }
                drawable.draw(canvas);
                if (y1Var.L1 == 1.0f || !y1Var.i2) {
                    return;
                }
                drawable.setAlpha(ls.e4);
                return;
            }
        }
        if (!I) {
            float f22 = this.h;
            if (f22 != 0.0f) {
                float f23 = f22 - 0.16f;
                this.h = f23;
                if (f23 < 0.0f) {
                    this.h = 0.0f;
                }
                r1Var.invalidate();
            }
        }
        f12 = this.h;
        if (f12 > 0.0f) {
        }
        if (this.h < 1.0f) {
        }
        canvas.save();
        canvas.translate(f13 + r1Var.O4, r1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(57.0f) + r1Var.Ua);
        r1Var.L4.draw(canvas);
        canvas.restore();
        if (r1Var.G3()) {
        }
    }

    public final void b(Canvas canvas, float f10, float f11, int i7) {
        float f12;
        float f13;
        int i10;
        float f14;
        canvas.save();
        r1 r1Var = this.a;
        y1 y1Var = r1Var.ib;
        int L = (org.telegram.messenger.g0.L(r1Var.G ? 6.0f : 0.0f) + (r1Var.getCurrentBackgroundRight() - r1Var.getCurrentBackgroundLeft())) - org.telegram.messenger.g0.L((r1Var.R1 ? 10 : 0) + 128);
        if (r1Var.J4 == null) {
            c1 c1Var = new c1(this, r1Var, r1Var.E4);
            r1Var.J4 = c1Var;
            gj gjVar = r1Var.Q5;
            TLRPC.Message message = gjVar.k;
            c1Var.u(message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && j21.m(gjVar), false);
            r1Var.J4.s(j21.l(r1Var.Q5), false);
            r1Var.J4.t(j21.w(r1Var.Q5), false);
        }
        if (r1Var.F8 != 0) {
            this.b = org.telegram.messenger.g0.T1(org.telegram.messenger.f3.C(21.0f, i7, L), r1Var.R8, 1.0f - r1Var.getVideoTranscriptionProgress());
            this.c = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(3.0f) + r1Var.H4, r1Var.S8 - org.telegram.messenger.g0.L(40.0f), 1.0f - r1Var.getVideoTranscriptionProgress());
        } else {
            float C = org.telegram.messenger.f3.C(21.0f, i7, L);
            gj gjVar2 = r1Var.Q5;
            this.b = org.telegram.messenger.g0.T1(C, (gjVar2 == null || !gjVar2.P3()) ? r1Var.u2() ? Math.min(r1Var.getPhotoImage().y() + org.telegram.messenger.g0.L(8.0f), r1Var.getCompactRight() - org.telegram.messenger.g0.L(32.0f)) : (org.telegram.messenger.g0.L(8.0f) + r1Var.getCurrentBackgroundRight()) - (org.telegram.messenger.g0.L(40.0f) * f11) : (org.telegram.messenger.g0.L(28.0f) * f11) + (r1Var.getCurrentBackgroundLeft() - org.telegram.messenger.g0.L(40.0f)), 1.0f - r1Var.getVideoTranscriptionProgress());
            float L2 = (r1Var.e7 + y1Var.j0) - org.telegram.messenger.g0.L(28 - (r1Var.K ? 2 : 0));
            ch.q0 q0Var = r1Var.O;
            if (!q0Var.p) {
                L2 -= q0Var.i(y1Var.L1);
            }
            this.c = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(3.0f) + r1Var.H4, ((org.telegram.messenger.g0.T1(L2, (r1Var.getMediaOffsetY() + (org.telegram.messenger.g0.L(44.0f) + r1Var.Ua)) - org.telegram.messenger.g0.L(1.7f), r1Var.getVideoTranscriptionProgress()) + org.telegram.messenger.g0.L(1.7f)) - org.telegram.messenger.g0.L(12.0f)) - (r1Var.Q5.P3() ? 0.0f : org.telegram.messenger.g0.L(28.0f) * f11), 1.0f - r1Var.getVideoTranscriptionProgress());
        }
        c1 c1Var2 = r1Var.J4;
        int i11 = (int) this.b;
        int i12 = (int) this.c;
        int W1 = org.telegram.messenger.g0.W1(1.0f - r1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(32.0f));
        int W12 = org.telegram.messenger.g0.W1(1.0f - r1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(32.0f));
        int W13 = org.telegram.messenger.g0.W1(1.0f - r1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f));
        Rect rect = c1Var2.u;
        if (W1 == rect.width() && W12 == rect.height()) {
            f12 = 40.0f;
            f13 = 0.0f;
            i10 = 2;
        } else {
            float f15 = W1 / 2.0f;
            f12 = 40.0f;
            float f16 = W13;
            f13 = 0.0f;
            float f17 = W12 / 2.0f;
            i10 = 2;
            c1Var2.F = (float) ((Math.atan((f15 - f16) / f17) * 180.0d) / 3.141592653589793d);
            c1Var2.G = (float) ((Math.atan(f15 / (f17 - f16)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i11, i12, i11 + W1, i12 + W12);
        int min = Math.min(Math.min(W1, W12) / 2, W13);
        c1Var2.D = min;
        c1Var2.E = min * 2;
        c1 c1Var3 = r1Var.J4;
        int f18 = i0.a.f(r1Var.M1 == 3 ? 1.0f : r1Var.getVideoTranscriptionProgress(), org.telegram.ui.ActionBar.m6.w0(r1Var.u2() ? org.telegram.ui.ActionBar.m6.Ta : org.telegram.ui.ActionBar.m6.Zc, r1Var.Qb), org.telegram.ui.ActionBar.m6.w0(r1Var.Q5.P3() ? org.telegram.ui.ActionBar.m6.Jc : org.telegram.ui.ActionBar.m6.tk, r1Var.Qb));
        org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, r1Var.Qb);
        r1Var.Q5.N3();
        float videoTranscriptionProgress = r1Var.M1 == 3 ? f13 : 1.0f - r1Var.getVideoTranscriptionProgress();
        oh0 oh0Var = c1Var3.p;
        oh0 oh0Var2 = c1Var3.n;
        boolean z10 = c1Var3.b != f18;
        c1Var3.b = f18;
        c1Var3.c = f18;
        int o4 = i0.a.o(f18, (int) (Color.alpha(f18) * 0.156f));
        c1Var3.a = o4;
        c1Var3.e = videoTranscriptionProgress;
        c1Var3.d = org.telegram.ui.ActionBar.m6.w(o4, i0.a.o(f18, (int) (Color.alpha(f18) * (org.telegram.ui.ActionBar.m6.I.q() ? 0.3f : 0.2f))));
        if (c1Var3.f == null) {
            c1Var3.f = new Paint();
        }
        c1Var3.f.setColor(c1Var3.a);
        c1Var3.f.setAlpha((int) ((1.0f - videoTranscriptionProgress) * r9.getAlpha()));
        if (z10 || c1Var3.q == null) {
            int L3 = org.telegram.messenger.g0.L(8.0f);
            int i13 = c1Var3.d;
            y k02 = org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, i13, i13);
            c1Var3.q = k02;
            k02.setCallback(c1Var3.r);
        }
        if (z10) {
            oh0Var2.a0 = true;
            oh0Var2.Q(c1Var3.c, "Artboard Outlines");
            oh0Var2.o();
            oh0Var2.J(true);
            oh0Var2.V(0L);
            int alpha = Color.alpha(f18);
            c1Var3.m = alpha;
            oh0Var2.setAlpha(alpha);
            oh0Var.a0 = true;
            oh0Var.Q(c1Var3.c, "Artboard Outlines");
            oh0Var.o();
            oh0Var.J(true);
            oh0Var.V(0L);
            int alpha2 = Color.alpha(f18);
            c1Var3.o = alpha2;
            oh0Var.setAlpha(alpha2);
        }
        if (c1Var3.g == null) {
            Paint paint = new Paint(1);
            c1Var3.g = paint;
            paint.setStyle(Paint.Style.STROKE);
            c1Var3.g.setStrokeCap(Paint.Cap.ROUND);
        }
        c1Var3.g.setColor(f18);
        c1 c1Var4 = r1Var.J4;
        oh0 oh0Var3 = c1Var4.p;
        oh0 oh0Var4 = c1Var4.n;
        Rect rect2 = c1Var4.v;
        Rect rect3 = c1Var4.u;
        rect2.set(rect3.left - org.telegram.messenger.g0.L(8.0f), rect3.top - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + rect3.right, org.telegram.messenger.g0.L(8.0f) + rect3.bottom);
        Path path = c1Var4.C;
        if (path == null) {
            c1Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect3);
        Path path2 = c1Var4.C;
        float f19 = c1Var4.D;
        path2.addRoundRect(rectF, f19, f19, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(c1Var4.C);
        float f20 = c1Var4.e * f10;
        if (f20 > f13) {
            r1 r1Var2 = c1Var4.U.a;
            Paint a22 = r1Var2.Q5.P5() ? r1Var2.a2("paintChatActionBackground") : r1Var2.a2("paintChatTimeBackground");
            int alpha3 = a22.getAlpha();
            a22.setAlpha((int) (alpha3 * f20));
            r1Var2.x();
            canvas.drawRect(rect3, a22);
            if (a22 == r1Var2.a2("paintChatActionBackground") && r1Var2.h2()) {
                int alpha4 = org.telegram.ui.ActionBar.m6.h2.getAlpha();
                org.telegram.ui.ActionBar.m6.h2.setAlpha((int) (alpha4 * f20));
                canvas.drawRect(rect3, org.telegram.ui.ActionBar.m6.h2);
                org.telegram.ui.ActionBar.m6.h2.setAlpha(alpha4);
            }
            a22.setAlpha(alpha3);
        }
        Paint paint2 = c1Var4.f;
        if (paint2 != null) {
            int alpha5 = paint2.getAlpha();
            c1Var4.f.setAlpha((int) (alpha5 * f10));
            canvas.drawRect(rect3, c1Var4.f);
            c1Var4.f.setAlpha(alpha5);
        }
        y yVar = c1Var4.q;
        if (yVar != null) {
            yVar.setBounds(rect3);
            c1Var4.q.draw(canvas);
        }
        canvas.restore();
        float e10 = c1Var4.l.e(false, c1Var4.k ? 1.0f : f13);
        if (e10 > f13) {
            long elapsedRealtime = (long) ((SystemClock.elapsedRealtime() - c1Var4.t) * 0.75f);
            x1.a aVar = c1Var4.B;
            if (c1Var4.M == null) {
                c1Var4.M = new float[i10];
            }
            long j3 = elapsedRealtime % 5400;
            float[] fArr = c1Var4.M;
            float f21 = (1520 * j3) / 5400.0f;
            fArr[0] = f21 - 20.0f;
            char c10 = 1;
            fArr[1] = f21;
            int i14 = 0;
            while (i14 < 4) {
                float[] fArr2 = c1Var4.M;
                int i15 = i14 * 1350;
                fArr2[1] = (aVar.getInterpolation((j3 - i15) / 667.0f) * 250.0f) + fArr2[c10];
                float[] fArr3 = c1Var4.M;
                fArr3[0] = (aVar.getInterpolation((j3 - (i15 + 667)) / 667.0f) * 250.0f) + fArr3[0];
                i14++;
                c10 = 1;
            }
            f14 = 180.0f;
            float[] fArr4 = c1Var4.M;
            Path path3 = c1Var4.h;
            if (path3 == null) {
                c1Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e10 * f12, fArr4[1] - fArr4[0]);
            float f22 = ((1.0f - e10) * max * (c1Var4.k ? f13 : 1.0f)) + fArr4[0];
            float f23 = (max * e10) + f22;
            float f24 = f22 % 360.0f;
            float f25 = f23 % 360.0f;
            if (f24 < f13) {
                f24 += 360.0f;
            }
            float f26 = f24;
            if (f25 < f13) {
                f25 += 360.0f;
            }
            float f27 = f25;
            Path path4 = c1Var4.h;
            int centerX = rect3.centerX();
            int i16 = rect3.top;
            j21.d(path4, centerX, i16, rect3.right - c1Var4.D, i16, f26, f27, 0.0f, c1Var4.F);
            j21.b(c1Var4.h, rect3.right, rect3.top, c1Var4.E, 1, f26, f27, c1Var4.F, c1Var4.G);
            Path path5 = c1Var4.h;
            int i17 = rect3.right;
            int i18 = rect3.top;
            int i19 = c1Var4.D;
            int i20 = i18 + i19;
            int i21 = rect3.bottom - i19;
            float f28 = c1Var4.G;
            j21.d(path5, i17, i20, i17, i21, f26, f27, f28, 180.0f - f28);
            j21.b(c1Var4.h, rect3.right, rect3.bottom, c1Var4.E, 2, f26, f27, 180.0f - c1Var4.G, 180.0f - c1Var4.F);
            Path path6 = c1Var4.h;
            int i22 = rect3.right;
            int i23 = c1Var4.D;
            int i24 = i22 - i23;
            int i25 = rect3.bottom;
            int i26 = rect3.left + i23;
            float f29 = c1Var4.F;
            j21.d(path6, i24, i25, i26, i25, f26, f27, 180.0f - f29, f29 + 180.0f);
            j21.b(c1Var4.h, rect3.left, rect3.bottom, c1Var4.E, 3, f26, f27, c1Var4.F + 180.0f, c1Var4.G + 180.0f);
            Path path7 = c1Var4.h;
            int i27 = rect3.left;
            int i28 = rect3.bottom;
            int i29 = c1Var4.D;
            int i30 = i28 - i29;
            int i31 = rect3.top + i29;
            float f30 = c1Var4.G;
            j21.d(path7, i27, i30, i27, i31, f26, f27, f30 + 180.0f, 360.0f - f30);
            j21.b(c1Var4.h, rect3.left, rect3.top, c1Var4.E, 4, f26, f27, 360.0f - c1Var4.G, 360.0f - c1Var4.F);
            j21.d(c1Var4.h, rect3.left + c1Var4.D, rect3.top, rect3.centerX(), rect3.top, f26, f27, 360.0f - c1Var4.F, 360.0f);
            c1Var4.g.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            int alpha6 = c1Var4.g.getAlpha();
            c1Var4.g.setAlpha((int) (alpha6 * f10));
            canvas.drawPath(c1Var4.h, c1Var4.g);
            c1Var4.g.setAlpha(alpha6);
            c1Var4.r.invalidate();
        } else {
            f14 = 180.0f;
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(-13.0f) + rect3.centerX(), org.telegram.messenger.g0.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), ls.e4, 31);
        if (c1Var4.y) {
            oh0Var4.setAlpha((int) (c1Var4.m * f10));
            oh0Var4.draw(canvas);
        } else {
            oh0Var3.setAlpha((int) (c1Var4.o * f10));
            oh0Var3.draw(canvas);
        }
        float d = c1Var4.j.d((!c1Var4.i || c1Var4.y || c1Var4.k) ? false : true);
        if (d > f13) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(12.0f));
            if (c1Var4.H == null) {
                Paint paint3 = new Paint(1);
                c1Var4.H = paint3;
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f13, -org.telegram.messenger.g0.L(0.4f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), c1Var4.H);
            if (c1Var4.I == null) {
                c1Var4.I = new Paint(1);
            }
            c1Var4.I.setColor(c1Var4.c);
            int i32 = (int) (d * 255.0f);
            c1Var4.I.setAlpha(i32);
            rectF2.set(0.0f, org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.33f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), c1Var4.I);
            if (c1Var4.L == null || Math.abs(c1Var4.K - org.telegram.messenger.g0.p) > 0.1f) {
                c1Var4.K = org.telegram.messenger.g0.p;
                Path path8 = new Path();
                c1Var4.L = path8;
                path8.moveTo(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(3.33f));
                c1Var4.L.lineTo(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(2.0f));
                rectF2.set(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(0.33f), org.telegram.messenger.g0.L(4.99f), org.telegram.messenger.g0.L(3.6599998f));
                c1Var4.L.arcTo(rectF2, -180.0f, f14, false);
                c1Var4.L.lineTo(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(3.33f));
            }
            if (c1Var4.J == null) {
                Paint paint4 = new Paint(1);
                c1Var4.J = paint4;
                paint4.setStyle(Paint.Style.STROKE);
            }
            c1Var4.J.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            c1Var4.J.setColor(c1Var4.c);
            c1Var4.J.setAlpha(i32);
            canvas.drawPath(c1Var4.L, c1Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i7, float f10) {
        canvas.save();
        int L = org.telegram.messenger.g0.L(44.0f);
        r1 r1Var = this.a;
        canvas.translate(i7, r1Var.getMediaOffsetY() + L + r1Var.Ua + f10);
        r1Var.L4.draw(canvas);
        canvas.restore();
        gj gjVar = r1Var.Q5;
        if (gjVar.D == 0 || !gjVar.k.media_unread) {
            return;
        }
        org.telegram.ui.ActionBar.m6.S1.setColor(org.telegram.ui.ActionBar.m6.w0(gjVar.P3() ? org.telegram.ui.ActionBar.m6.tc : org.telegram.ui.ActionBar.m6.re, r1Var.Qb));
        canvas.drawCircle(org.telegram.messenger.g0.L(6.0f) + i7 + r1Var.N4, r1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(51.0f) + r1Var.Ua, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.m6.S1);
    }

    public final void d(gj gjVar, boolean z10) {
        yi yiVar;
        int L;
        bj bjVar;
        r1 r1Var = this.a;
        ch.q0 q0Var = r1Var.O;
        int i7 = 0;
        r1Var.s9 = (r1Var.u6 || gjVar.k.fwd_from == null) ? false : true;
        r1Var.j9 = (r1Var.h6 && !gjVar.P3() && (gjVar.P1() < 0 || gjVar.P1() == 2666000)) || (((gjVar.o3() && gjVar.A4()) || (gjVar.y3() && gjVar.k.fwd_from.from_id == null)) && ((yiVar = r1Var.M) == null || (yiVar.l & 4) != 0));
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (r1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            L = Q0 - org.telegram.messenger.g0.L(i7 + 50);
            r1Var.b7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        } else {
            int parentWidth = r1Var.getParentWidth();
            if (r1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            L = parentWidth - org.telegram.messenger.g0.L(i7 + 50);
            r1Var.b7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        }
        if (r1Var.M != null) {
            r1Var.b7 = L;
        }
        int v02 = r1Var.v0(L, gjVar);
        r1Var.setMessageObjectInternal(gjVar);
        r1Var.v0 = org.telegram.messenger.g0.L(82.0f) + r1Var.Ua;
        if (org.telegram.messenger.g0.L(76.0f) + v02 >= (r1Var.b7 - r1Var.A9) - org.telegram.messenger.g0.L(12.0f)) {
            r1Var.v0 = org.telegram.messenger.g0.L(14.0f) + r1Var.v0;
        }
        if (r1Var.M != null && (bjVar = r1Var.L) != null && bjVar.d.size() > 1) {
            if ((r1Var.M.l & 4) == 0) {
                r1Var.v0 -= org.telegram.messenger.g0.L(6.0f);
                r1Var.X1 -= org.telegram.messenger.g0.L(6.0f);
            }
            if ((r1Var.M.l & 8) == 0) {
                r1Var.v0 -= org.telegram.messenger.g0.L(6.0f);
            }
        }
        if (r1Var.J) {
            r1Var.Ua -= org.telegram.messenger.g0.L(1.0f);
        }
        q0Var.getClass();
        q0Var.o(L - org.telegram.messenger.g0.L(24.0f), 3);
        if (q0Var.p) {
            return;
        }
        q0Var.n = org.telegram.messenger.g0.L(12.0f) + q0Var.m;
        r1Var.Z2(gjVar);
        int i10 = q0Var.o;
        if (i10 > r1Var.b7) {
            r1Var.b7 = i10;
        }
        if (org.telegram.messenger.g0.L(24.0f) + q0Var.r + r1Var.A9 > r1Var.b7) {
            q0Var.n = org.telegram.messenger.g0.L(12.0f) + q0Var.n;
            q0Var.k -= org.telegram.messenger.g0.L(12.0f);
        }
        if (!gjVar.G0 && gjVar.z != null) {
            q0Var.k = org.telegram.messenger.g0.L(14.0f) + q0Var.k;
        }
        r1Var.v0 += q0Var.n;
    }

    public final void e(gj gjVar, boolean z10) {
        int min;
        r1 r1Var = this.a;
        ch.q0 q0Var = r1Var.O;
        boolean z11 = true;
        r1Var.s9 = !r1Var.u6;
        int i7 = 0;
        if ((!r1Var.h6 || gjVar.P3() || (gjVar.P1() >= 0 && gjVar.P1() != 2666000)) && ((!gjVar.o3() || !gjVar.A4()) && ((!gjVar.y3() || gjVar.k.fwd_from.from_id != null) && (!r1Var.Y6 || gjVar.P3() || (!r1Var.l6 && (!r1Var.m6 || !r1Var.W6)))))) {
            z11 = false;
        }
        r1Var.j9 = z11;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (r1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            min = Math.min(Q0 - org.telegram.messenger.g0.L(i7 + 50), org.telegram.messenger.g0.L(270.0f));
            r1Var.b7 = min;
        } else {
            int parentWidth = r1Var.getParentWidth();
            if (r1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            min = Math.min(parentWidth - org.telegram.messenger.g0.L(i7 + 50), org.telegram.messenger.g0.L(270.0f));
            r1Var.b7 = min;
        }
        r1Var.v0(r1Var.b7, gjVar);
        r1Var.setMessageObjectInternal(gjVar);
        int L = org.telegram.messenger.g0.L(70.0f);
        int i10 = r1Var.Ua;
        r1Var.v0 = L + i10;
        if (r1Var.J) {
            r1Var.Ua = i10 - org.telegram.messenger.g0.L(1.0f);
        }
        q0Var.getClass();
        q0Var.o(min - org.telegram.messenger.g0.L(gjVar.P3() ? 32.0f : 24.0f), 3);
        if (q0Var.p) {
            return;
        }
        q0Var.n = q0Var.m;
        if (TextUtils.isEmpty(gjVar.z)) {
            q0Var.n = org.telegram.messenger.g0.L(12.0f) + q0Var.n;
        } else {
            q0Var.n = org.telegram.messenger.g0.L(8.0f) + q0Var.n;
        }
        int i11 = q0Var.o;
        if (i11 > r1Var.b7) {
            r1Var.b7 = i11;
        }
        int L2 = org.telegram.messenger.g0.L(6.0f) + r1Var.A9;
        if (gj.b4(gjVar.k) && !gjVar.n4()) {
            L2 -= org.telegram.messenger.g0.L(3.0f);
        } else if (gjVar.P3()) {
            L2 += org.telegram.messenger.g0.L(20.5f);
        }
        int extraTimeX = r1Var.getExtraTimeX() + L2;
        if (!r1Var.y2() && q0Var.r + extraTimeX >= r1Var.b7) {
            q0Var.n = org.telegram.messenger.g0.L(12.0f) + q0Var.n;
            q0Var.k -= org.telegram.messenger.g0.L(12.0f);
        }
        r1Var.v0 += q0Var.n;
    }
}
