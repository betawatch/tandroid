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
import org.telegram.messenger.ej;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.u21;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a1 {
    public final q1 a;
    public float b;
    public float c;
    public StaticLayout d;
    public int e;
    public StaticLayout f;
    public int g;
    public float h;

    public a1(q1 q1Var) {
        this.a = q1Var;
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
    public final void a(Canvas canvas, float f7, float f10) {
        float f11;
        Drawable drawable;
        jj jjVar;
        q1 q1Var = this.a;
        i1 i1Var = q1Var.B4;
        x1 x1Var = q1Var.gb;
        RadialProgress2 radialProgress2 = q1Var.P0;
        if (q1Var.O5.P3()) {
            org.telegram.ui.ActionBar.t6.O2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hc, q1Var.Ob));
            org.telegram.ui.ActionBar.t6.P2.setColor(org.telegram.ui.ActionBar.t6.w0(q1Var.v2() ? org.telegram.ui.ActionBar.t6.ac : org.telegram.ui.ActionBar.t6.Zb, q1Var.Ob));
            org.telegram.ui.ActionBar.t6.N2.setColor(org.telegram.ui.ActionBar.t6.w0(q1Var.v2() ? org.telegram.ui.ActionBar.t6.jc : org.telegram.ui.ActionBar.t6.ic, q1Var.Ob));
            radialProgress2.d = org.telegram.ui.ActionBar.t6.w0((q1Var.v2() || q1Var.N3 != 0) ? org.telegram.ui.ActionBar.t6.fc : org.telegram.ui.ActionBar.t6.ec, q1Var.Ob);
        } else {
            dl0 dl0Var = q1Var.m8;
            if (dl0Var == null || !q1Var.P1) {
                org.telegram.ui.ActionBar.t6.O2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.fe, q1Var.Ob));
                org.telegram.ui.ActionBar.t6.P2.setColor(org.telegram.ui.ActionBar.t6.w0(q1Var.v2() ? org.telegram.ui.ActionBar.t6.ee : org.telegram.ui.ActionBar.t6.de, q1Var.Ob));
                org.telegram.ui.ActionBar.t6.N2.setColor(org.telegram.ui.ActionBar.t6.w0(q1Var.v2() ? org.telegram.ui.ActionBar.t6.he : org.telegram.ui.ActionBar.t6.ge, q1Var.Ob));
                radialProgress2.d = org.telegram.ui.ActionBar.t6.w0((q1Var.v2() || q1Var.N3 != 0) ? org.telegram.ui.ActionBar.t6.Xd : org.telegram.ui.ActionBar.t6.Wd, q1Var.Ob);
            } else {
                org.telegram.ui.ActionBar.t6.O2.setColor(dl0Var.i());
                org.telegram.ui.ActionBar.t6.P2.setColor(org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(q1Var.v2() ? org.telegram.ui.ActionBar.t6.ee : org.telegram.ui.ActionBar.t6.de, q1Var.Ob), q1Var.m8.i()));
                org.telegram.ui.ActionBar.t6.N2.setColor(org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(q1Var.v2() ? org.telegram.ui.ActionBar.t6.he : org.telegram.ui.ActionBar.t6.ge, q1Var.Ob), q1Var.m8.i()));
                radialProgress2.d = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0((q1Var.v2() || q1Var.N3 != 0) ? org.telegram.ui.ActionBar.t6.Xd : org.telegram.ui.ActionBar.t6.Wd, q1Var.Ob), q1Var.m8.i());
                i1 i1Var2 = q1Var.B4;
                int c10 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ie, q1Var.Ob), q1Var.m8.i());
                int c11 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.je, q1Var.Ob), q1Var.m8.i());
                int i10 = org.telegram.ui.ActionBar.t6.le;
                i1Var2.g(c10, c11, org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(i10, q1Var.Ob), q1Var.m8.i()), org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(i10, q1Var.Ob), q1Var.m8.i()), org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ke, q1Var.Ob), q1Var.m8.i()));
            }
        }
        float f12 = x1Var.x0 ? x1Var.h0 : 0.0f;
        org.telegram.ui.ActionBar.c5 c5Var = q1Var.v2() ? q1Var.K6 : q1Var.J6;
        radialProgress2.i.B = c5Var;
        radialProgress2.j.B = c5Var;
        radialProgress2.I = 1.0f;
        if (q1Var.M1 && (jjVar = q1Var.O5) != null && jjVar.t2() && q1Var.O5.p4()) {
            if (q1Var.O5.M0) {
                float f13 = q1Var.K9;
                if (f13 != 0.0f) {
                }
            }
            radialProgress2.I *= q1Var.K9;
        }
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(q1Var.M4 + f12 + this.e, q1Var.getMediaOffsetY() + org.telegram.messenger.i0.L(13.0f) + q1Var.Sa);
        this.d.draw(canvas);
        canvas.restore();
        boolean I = MediaController.B().I(q1Var.O5);
        if (I) {
            float f14 = this.h;
            if (f14 != 1.0f) {
                float f15 = f14 + 0.16f;
                this.h = f15;
                if (f15 > 1.0f) {
                    this.h = 1.0f;
                }
                q1Var.invalidate();
                f11 = this.h;
                if (f11 > 0.0f) {
                    float f16 = q1Var.F4;
                    if (x1Var.x0) {
                        f16 += x1Var.k0;
                    }
                    if (f11 != 1.0f) {
                        float f17 = q1Var.E4 + f12;
                        canvas.saveLayerAlpha(f17, f16, (i1Var.f - kn0.E) + f17 + org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f) + f16, (int) (this.h * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    canvas.translate(q1Var.E4 + f12, f16);
                    i1Var.b(canvas);
                    canvas.restore();
                }
                if (this.h < 1.0f) {
                    float f18 = q1Var.M4 + f12 + this.g;
                    float mediaOffsetY = q1Var.getMediaOffsetY() + org.telegram.messenger.i0.L(35.0f) + q1Var.Sa;
                    if (this.h != 0.0f) {
                        canvas.saveLayerAlpha(f18, mediaOffsetY, this.f.getWidth() + f18, this.f.getHeight() + mediaOffsetY, (int) ((1.0f - this.h) * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    float f19 = this.h;
                    if (f19 != 0.0f) {
                        float z10 = c3.i0.z(1.0f, f19, 0.3f, 0.7f);
                        canvas.scale(z10, z10, f18, (this.f.getHeight() / 2.0f) + mediaOffsetY);
                    }
                    canvas.translate(f18, mediaOffsetY);
                    this.f.draw(canvas);
                    canvas.restore();
                }
                canvas.save();
                canvas.translate(f12 + q1Var.M4, q1Var.getMediaOffsetY() + org.telegram.messenger.i0.L(57.0f) + q1Var.Sa);
                q1Var.J4.draw(canvas);
                canvas.restore();
                if (q1Var.A3()) {
                    return;
                }
                if (q1Var.O5.P3()) {
                    drawable = q1Var.W1(q1Var.v2() ? "drawableMsgOutMenuSelected" : "drawableMsgOutMenu");
                } else {
                    drawable = q1Var.v2() ? org.telegram.ui.ActionBar.t6.d4 : org.telegram.ui.ActionBar.t6.c4;
                }
                int L = ((((int) f7) + q1Var.Z6) - org.telegram.messenger.i0.L(q1Var.O5.D == 0 ? 58.0f : 48.0f)) - org.telegram.messenger.i0.L(q1Var.P1 ? 18.0f : 0.0f);
                q1Var.Q3 = L;
                int L2 = ((int) f10) - org.telegram.messenger.i0.L(2.0f);
                q1Var.R3 = L2;
                z.t(L, L2, drawable);
                float f20 = x1Var.L1;
                if (f20 != 1.0f && x1Var.i2) {
                    drawable.setAlpha((int) (f20 * 255.0f));
                }
                drawable.draw(canvas);
                if (x1Var.L1 == 1.0f || !x1Var.i2) {
                    return;
                }
                drawable.setAlpha(zs.e4);
                return;
            }
        }
        if (!I) {
            float f21 = this.h;
            if (f21 != 0.0f) {
                float f22 = f21 - 0.16f;
                this.h = f22;
                if (f22 < 0.0f) {
                    this.h = 0.0f;
                }
                q1Var.invalidate();
            }
        }
        f11 = this.h;
        if (f11 > 0.0f) {
        }
        if (this.h < 1.0f) {
        }
        canvas.save();
        canvas.translate(f12 + q1Var.M4, q1Var.getMediaOffsetY() + org.telegram.messenger.i0.L(57.0f) + q1Var.Sa);
        q1Var.J4.draw(canvas);
        canvas.restore();
        if (q1Var.A3()) {
        }
    }

    public final void b(Canvas canvas, float f7, float f10, int i10) {
        float f11;
        float f12;
        int i11;
        float f13;
        canvas.save();
        q1 q1Var = this.a;
        x1 x1Var = q1Var.gb;
        int L = (org.telegram.messenger.i0.L(q1Var.F ? 6.0f : 0.0f) + (q1Var.getCurrentBackgroundRight() - q1Var.getCurrentBackgroundLeft())) - org.telegram.messenger.i0.L((q1Var.P1 ? 10 : 0) + 128);
        if (q1Var.H4 == null) {
            z0 z0Var = new z0(this, q1Var, q1Var.C4);
            q1Var.H4 = z0Var;
            jj jjVar = q1Var.O5;
            TLRPC.Message message = jjVar.k;
            z0Var.q(message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && u21.k(jjVar), false);
            q1Var.H4.o(u21.j(q1Var.O5), false);
            q1Var.H4.p(u21.s(q1Var.O5), false);
        }
        if (q1Var.D8 != 0) {
            this.b = org.telegram.messenger.i0.T1(org.telegram.messenger.m5.C(21.0f, i10, L), q1Var.P8, 1.0f - q1Var.getVideoTranscriptionProgress());
            this.c = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(3.0f) + q1Var.F4, q1Var.Q8 - org.telegram.messenger.i0.L(40.0f), 1.0f - q1Var.getVideoTranscriptionProgress());
        } else {
            float C = org.telegram.messenger.m5.C(21.0f, i10, L);
            jj jjVar2 = q1Var.O5;
            this.b = org.telegram.messenger.i0.T1(C, (jjVar2 == null || !jjVar2.P3()) ? q1Var.r2() ? Math.min(q1Var.getPhotoImage().y() + org.telegram.messenger.i0.L(8.0f), q1Var.getCompactRight() - org.telegram.messenger.i0.L(32.0f)) : (org.telegram.messenger.i0.L(8.0f) + q1Var.getCurrentBackgroundRight()) - (org.telegram.messenger.i0.L(40.0f) * f10) : (org.telegram.messenger.i0.L(28.0f) * f10) + (q1Var.getCurrentBackgroundLeft() - org.telegram.messenger.i0.L(40.0f)), 1.0f - q1Var.getVideoTranscriptionProgress());
            float L2 = (q1Var.c7 + x1Var.j0) - org.telegram.messenger.i0.L(28 - (q1Var.J ? 2 : 0));
            sg.p0 p0Var = q1Var.N;
            if (!p0Var.p) {
                L2 -= p0Var.i(x1Var.L1);
            }
            this.c = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(3.0f) + q1Var.F4, ((org.telegram.messenger.i0.T1(L2, (q1Var.getMediaOffsetY() + (org.telegram.messenger.i0.L(44.0f) + q1Var.Sa)) - org.telegram.messenger.i0.L(1.7f), q1Var.getVideoTranscriptionProgress()) + org.telegram.messenger.i0.L(1.7f)) - org.telegram.messenger.i0.L(12.0f)) - (q1Var.O5.P3() ? 0.0f : org.telegram.messenger.i0.L(28.0f) * f10), 1.0f - q1Var.getVideoTranscriptionProgress());
        }
        z0 z0Var2 = q1Var.H4;
        int i12 = (int) this.b;
        int i13 = (int) this.c;
        int W1 = org.telegram.messenger.i0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(32.0f));
        int W12 = org.telegram.messenger.i0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(32.0f));
        int W13 = org.telegram.messenger.i0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(16.0f));
        Rect rect = z0Var2.u;
        if (W1 == rect.width() && W12 == rect.height()) {
            f11 = 40.0f;
            f12 = 0.0f;
            i11 = 2;
        } else {
            float f14 = W1 / 2.0f;
            f11 = 40.0f;
            float f15 = W13;
            f12 = 0.0f;
            float f16 = W12 / 2.0f;
            i11 = 2;
            z0Var2.F = (float) ((Math.atan((f14 - f15) / f16) * 180.0d) / 3.141592653589793d);
            z0Var2.G = (float) ((Math.atan(f14 / (f16 - f15)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i12, i13, i12 + W1, i13 + W12);
        int min = Math.min(Math.min(W1, W12) / 2, W13);
        z0Var2.D = min;
        z0Var2.E = min * 2;
        z0 z0Var3 = q1Var.H4;
        int f17 = i0.b.f(q1Var.K1 == 3 ? 1.0f : q1Var.getVideoTranscriptionProgress(), org.telegram.ui.ActionBar.t6.w0(q1Var.r2() ? org.telegram.ui.ActionBar.t6.Ta : org.telegram.ui.ActionBar.t6.Wc, q1Var.Ob), org.telegram.ui.ActionBar.t6.w0(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.Gc : org.telegram.ui.ActionBar.t6.qk, q1Var.Ob));
        org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, q1Var.Ob);
        q1Var.O5.N3();
        float videoTranscriptionProgress = q1Var.K1 == 3 ? f12 : 1.0f - q1Var.getVideoTranscriptionProgress();
        bi0 bi0Var = z0Var3.p;
        bi0 bi0Var2 = z0Var3.n;
        boolean z10 = z0Var3.b != f17;
        z0Var3.b = f17;
        z0Var3.c = f17;
        int o10 = i0.b.o(f17, (int) (Color.alpha(f17) * 0.156f));
        z0Var3.a = o10;
        z0Var3.e = videoTranscriptionProgress;
        z0Var3.d = org.telegram.ui.ActionBar.t6.w(o10, i0.b.o(f17, (int) (Color.alpha(f17) * (org.telegram.ui.ActionBar.t6.I.q() ? 0.3f : 0.2f))));
        if (z0Var3.f == null) {
            z0Var3.f = new Paint();
        }
        z0Var3.f.setColor(z0Var3.a);
        z0Var3.f.setAlpha((int) ((1.0f - videoTranscriptionProgress) * r9.getAlpha()));
        if (z10 || z0Var3.q == null) {
            int L3 = org.telegram.messenger.i0.L(8.0f);
            int i14 = z0Var3.d;
            y k02 = org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, i14, i14);
            z0Var3.q = k02;
            k02.setCallback(z0Var3.r);
        }
        if (z10) {
            bi0Var2.Z = true;
            bi0Var2.Q(z0Var3.c, "Artboard Outlines");
            bi0Var2.o();
            bi0Var2.J(true);
            bi0Var2.V(0L);
            int alpha = Color.alpha(f17);
            z0Var3.m = alpha;
            bi0Var2.setAlpha(alpha);
            bi0Var.Z = true;
            bi0Var.Q(z0Var3.c, "Artboard Outlines");
            bi0Var.o();
            bi0Var.J(true);
            bi0Var.V(0L);
            int alpha2 = Color.alpha(f17);
            z0Var3.o = alpha2;
            bi0Var.setAlpha(alpha2);
        }
        if (z0Var3.g == null) {
            Paint paint = new Paint(1);
            z0Var3.g = paint;
            paint.setStyle(Paint.Style.STROKE);
            z0Var3.g.setStrokeCap(Paint.Cap.ROUND);
        }
        z0Var3.g.setColor(f17);
        z0 z0Var4 = q1Var.H4;
        bi0 bi0Var3 = z0Var4.p;
        bi0 bi0Var4 = z0Var4.n;
        Rect rect2 = z0Var4.v;
        Rect rect3 = z0Var4.u;
        rect2.set(rect3.left - org.telegram.messenger.i0.L(8.0f), rect3.top - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f) + rect3.right, org.telegram.messenger.i0.L(8.0f) + rect3.bottom);
        Path path = z0Var4.C;
        if (path == null) {
            z0Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(rect3);
        Path path2 = z0Var4.C;
        float f18 = z0Var4.D;
        path2.addRoundRect(rectF, f18, f18, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(z0Var4.C);
        float f19 = z0Var4.e * f7;
        if (f19 > f12) {
            q1 q1Var2 = z0Var4.R.a;
            Paint X1 = q1Var2.O5.O5() ? q1Var2.X1("paintChatActionBackground") : q1Var2.X1("paintChatTimeBackground");
            int alpha3 = X1.getAlpha();
            X1.setAlpha((int) (alpha3 * f19));
            q1Var2.z();
            canvas.drawRect(rect3, X1);
            if (X1 == q1Var2.X1("paintChatActionBackground") && q1Var2.e2()) {
                int alpha4 = org.telegram.ui.ActionBar.t6.h2.getAlpha();
                org.telegram.ui.ActionBar.t6.h2.setAlpha((int) (alpha4 * f19));
                canvas.drawRect(rect3, org.telegram.ui.ActionBar.t6.h2);
                org.telegram.ui.ActionBar.t6.h2.setAlpha(alpha4);
            }
            X1.setAlpha(alpha3);
        }
        Paint paint2 = z0Var4.f;
        if (paint2 != null) {
            int alpha5 = paint2.getAlpha();
            z0Var4.f.setAlpha((int) (alpha5 * f7));
            canvas.drawRect(rect3, z0Var4.f);
            z0Var4.f.setAlpha(alpha5);
        }
        y yVar = z0Var4.q;
        if (yVar != null) {
            yVar.setBounds(rect3);
            z0Var4.q.draw(canvas);
        }
        canvas.restore();
        float e = z0Var4.l.e(false, z0Var4.k ? 1.0f : f12);
        if (e > f12) {
            long elapsedRealtime = (long) ((SystemClock.elapsedRealtime() - z0Var4.t) * 0.75f);
            u1.a aVar = z0Var4.B;
            if (z0Var4.M == null) {
                z0Var4.M = new float[i11];
            }
            long j10 = elapsedRealtime % 5400;
            float[] fArr = z0Var4.M;
            float f20 = (1520 * j10) / 5400.0f;
            fArr[0] = f20 - 20.0f;
            char c10 = 1;
            fArr[1] = f20;
            int i15 = 0;
            while (i15 < 4) {
                float[] fArr2 = z0Var4.M;
                int i16 = i15 * 1350;
                fArr2[1] = (aVar.getInterpolation((j10 - i16) / 667.0f) * 250.0f) + fArr2[c10];
                float[] fArr3 = z0Var4.M;
                fArr3[0] = (aVar.getInterpolation((j10 - (i16 + 667)) / 667.0f) * 250.0f) + fArr3[0];
                i15++;
                c10 = 1;
            }
            f13 = 180.0f;
            float[] fArr4 = z0Var4.M;
            Path path3 = z0Var4.h;
            if (path3 == null) {
                z0Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e * f11, fArr4[1] - fArr4[0]);
            float f21 = ((1.0f - e) * max * (z0Var4.k ? f12 : 1.0f)) + fArr4[0];
            float f22 = (max * e) + f21;
            float f23 = f21 % 360.0f;
            float f24 = f22 % 360.0f;
            if (f23 < f12) {
                f23 += 360.0f;
            }
            float f25 = f23;
            if (f24 < f12) {
                f24 += 360.0f;
            }
            float f26 = f24;
            Path path4 = z0Var4.h;
            int centerX = rect3.centerX();
            int i17 = rect3.top;
            u21.d(path4, centerX, i17, rect3.right - z0Var4.D, i17, f25, f26, 0.0f, z0Var4.F);
            u21.b(z0Var4.h, rect3.right, rect3.top, z0Var4.E, 1, f25, f26, z0Var4.F, z0Var4.G);
            Path path5 = z0Var4.h;
            int i18 = rect3.right;
            int i19 = rect3.top;
            int i20 = z0Var4.D;
            int i21 = i19 + i20;
            int i22 = rect3.bottom - i20;
            float f27 = z0Var4.G;
            u21.d(path5, i18, i21, i18, i22, f25, f26, f27, 180.0f - f27);
            u21.b(z0Var4.h, rect3.right, rect3.bottom, z0Var4.E, 2, f25, f26, 180.0f - z0Var4.G, 180.0f - z0Var4.F);
            Path path6 = z0Var4.h;
            int i23 = rect3.right;
            int i24 = z0Var4.D;
            int i25 = i23 - i24;
            int i26 = rect3.bottom;
            int i27 = rect3.left + i24;
            float f28 = z0Var4.F;
            u21.d(path6, i25, i26, i27, i26, f25, f26, 180.0f - f28, f28 + 180.0f);
            u21.b(z0Var4.h, rect3.left, rect3.bottom, z0Var4.E, 3, f25, f26, z0Var4.F + 180.0f, z0Var4.G + 180.0f);
            Path path7 = z0Var4.h;
            int i28 = rect3.left;
            int i29 = rect3.bottom;
            int i30 = z0Var4.D;
            int i31 = i29 - i30;
            int i32 = rect3.top + i30;
            float f29 = z0Var4.G;
            u21.d(path7, i28, i31, i28, i32, f25, f26, f29 + 180.0f, 360.0f - f29);
            u21.b(z0Var4.h, rect3.left, rect3.top, z0Var4.E, 4, f25, f26, 360.0f - z0Var4.G, 360.0f - z0Var4.F);
            u21.d(z0Var4.h, rect3.left + z0Var4.D, rect3.top, rect3.centerX(), rect3.top, f25, f26, 360.0f - z0Var4.F, 360.0f);
            z0Var4.g.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
            int alpha6 = z0Var4.g.getAlpha();
            z0Var4.g.setAlpha((int) (alpha6 * f7));
            canvas.drawPath(z0Var4.h, z0Var4.g);
            z0Var4.g.setAlpha(alpha6);
            z0Var4.r.invalidate();
        } else {
            f13 = 180.0f;
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.i0.L(-13.0f) + rect3.centerX(), org.telegram.messenger.i0.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f), zs.e4, 31);
        if (z0Var4.y) {
            bi0Var4.setAlpha((int) (z0Var4.m * f7));
            bi0Var4.draw(canvas);
        } else {
            bi0Var3.setAlpha((int) (z0Var4.o * f7));
            bi0Var3.draw(canvas);
        }
        float d = z0Var4.j.d((!z0Var4.i || z0Var4.y || z0Var4.k) ? false : true);
        if (d > f12) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(12.0f));
            if (z0Var4.H == null) {
                Paint paint3 = new Paint(1);
                z0Var4.H = paint3;
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(f12, -org.telegram.messenger.i0.L(0.4f), org.telegram.messenger.i0.L(6.666f), org.telegram.messenger.i0.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), z0Var4.H);
            if (z0Var4.I == null) {
                z0Var4.I = new Paint(1);
            }
            z0Var4.I.setColor(z0Var4.c);
            int i33 = (int) (d * 255.0f);
            z0Var4.I.setAlpha(i33);
            rectF2.set(0.0f, org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(6.666f), org.telegram.messenger.i0.L(8.33f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f), z0Var4.I);
            if (z0Var4.L == null || Math.abs(z0Var4.K - org.telegram.messenger.i0.p) > 0.1f) {
                z0Var4.K = org.telegram.messenger.i0.p;
                Path path8 = new Path();
                z0Var4.L = path8;
                path8.moveTo(org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(3.33f));
                z0Var4.L.lineTo(org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(2.0f));
                rectF2.set(org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(0.33f), org.telegram.messenger.i0.L(4.99f), org.telegram.messenger.i0.L(3.6599998f));
                z0Var4.L.arcTo(rectF2, -180.0f, f13, false);
                z0Var4.L.lineTo(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(3.33f));
            }
            if (z0Var4.J == null) {
                Paint paint4 = new Paint(1);
                z0Var4.J = paint4;
                paint4.setStyle(Paint.Style.STROKE);
            }
            z0Var4.J.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
            z0Var4.J.setColor(z0Var4.c);
            z0Var4.J.setAlpha(i33);
            canvas.drawPath(z0Var4.L, z0Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i10, float f7) {
        canvas.save();
        int L = org.telegram.messenger.i0.L(44.0f);
        q1 q1Var = this.a;
        canvas.translate(i10, q1Var.getMediaOffsetY() + L + q1Var.Sa + f7);
        q1Var.J4.draw(canvas);
        canvas.restore();
        jj jjVar = q1Var.O5;
        if (jjVar.D == 0 || !jjVar.k.media_unread) {
            return;
        }
        org.telegram.ui.ActionBar.t6.S1.setColor(org.telegram.ui.ActionBar.t6.w0(jjVar.P3() ? org.telegram.ui.ActionBar.t6.qc : org.telegram.ui.ActionBar.t6.oe, q1Var.Ob));
        canvas.drawCircle(org.telegram.messenger.i0.L(6.0f) + i10 + q1Var.L4, q1Var.getMediaOffsetY() + org.telegram.messenger.i0.L(51.0f) + q1Var.Sa, org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.S1);
    }

    public final void d(jj jjVar, boolean z10) {
        bj bjVar;
        int L;
        ej ejVar;
        q1 q1Var = this.a;
        sg.p0 p0Var = q1Var.N;
        int i10 = 0;
        q1Var.q9 = (q1Var.s6 || jjVar.k.fwd_from == null) ? false : true;
        q1Var.h9 = (q1Var.f6 && !jjVar.P3() && (jjVar.Q1() < 0 || jjVar.Q1() == 2666000)) || (((jjVar.o3() && jjVar.A4()) || (jjVar.y3() && jjVar.k.fwd_from.from_id == null)) && ((bjVar = q1Var.L) == null || (bjVar.l & 4) != 0));
        if (org.telegram.messenger.i0.Q1()) {
            int Q0 = org.telegram.messenger.i0.Q0();
            if (q1Var.V6) {
                i10 = 71;
            } else if (z10) {
                i10 = 52;
            }
            L = Q0 - org.telegram.messenger.i0.L(i10 + 50);
            q1Var.Z6 = Math.min(org.telegram.messenger.i0.L(270.0f), L);
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.V6) {
                i10 = 71;
            } else if (z10) {
                i10 = 52;
            }
            L = parentWidth - org.telegram.messenger.i0.L(i10 + 50);
            q1Var.Z6 = Math.min(org.telegram.messenger.i0.L(270.0f), L);
        }
        if (q1Var.L != null) {
            q1Var.Z6 = L;
        }
        int u02 = q1Var.u0(L, jjVar);
        q1Var.setMessageObjectInternal(jjVar);
        q1Var.u0 = org.telegram.messenger.i0.L(82.0f) + q1Var.Sa;
        if (org.telegram.messenger.i0.L(76.0f) + u02 >= (q1Var.Z6 - q1Var.y9) - org.telegram.messenger.i0.L(12.0f)) {
            q1Var.u0 = org.telegram.messenger.i0.L(14.0f) + q1Var.u0;
        }
        if (q1Var.L != null && (ejVar = q1Var.K) != null && ejVar.d.size() > 1) {
            if ((q1Var.L.l & 4) == 0) {
                q1Var.u0 -= org.telegram.messenger.i0.L(6.0f);
                q1Var.V1 -= org.telegram.messenger.i0.L(6.0f);
            }
            if ((q1Var.L.l & 8) == 0) {
                q1Var.u0 -= org.telegram.messenger.i0.L(6.0f);
            }
        }
        if (q1Var.I) {
            q1Var.Sa -= org.telegram.messenger.i0.L(1.0f);
        }
        p0Var.getClass();
        p0Var.o(L - org.telegram.messenger.i0.L(24.0f), 3);
        if (p0Var.p) {
            return;
        }
        p0Var.n = org.telegram.messenger.i0.L(12.0f) + p0Var.m;
        q1Var.T2(jjVar);
        int i11 = p0Var.o;
        if (i11 > q1Var.Z6) {
            q1Var.Z6 = i11;
        }
        if (org.telegram.messenger.i0.L(24.0f) + p0Var.r + q1Var.y9 > q1Var.Z6) {
            p0Var.n = org.telegram.messenger.i0.L(12.0f) + p0Var.n;
            p0Var.k -= org.telegram.messenger.i0.L(12.0f);
        }
        if (!jjVar.E0 && jjVar.z != null) {
            p0Var.k = org.telegram.messenger.i0.L(14.0f) + p0Var.k;
        }
        q1Var.u0 += p0Var.n;
    }

    public final void e(jj jjVar, boolean z10) {
        int min;
        q1 q1Var = this.a;
        sg.p0 p0Var = q1Var.N;
        boolean z11 = true;
        q1Var.q9 = !q1Var.s6;
        int i10 = 0;
        if ((!q1Var.f6 || jjVar.P3() || (jjVar.Q1() >= 0 && jjVar.Q1() != 2666000)) && ((!jjVar.o3() || !jjVar.A4()) && ((!jjVar.y3() || jjVar.k.fwd_from.from_id != null) && (!q1Var.W6 || jjVar.P3() || (!q1Var.j6 && (!q1Var.k6 || !q1Var.U6)))))) {
            z11 = false;
        }
        q1Var.h9 = z11;
        if (org.telegram.messenger.i0.Q1()) {
            int Q0 = org.telegram.messenger.i0.Q0();
            if (q1Var.V6) {
                i10 = 71;
            } else if (z10) {
                i10 = 52;
            }
            min = Math.min(Q0 - org.telegram.messenger.i0.L(i10 + 50), org.telegram.messenger.i0.L(270.0f));
            q1Var.Z6 = min;
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.V6) {
                i10 = 71;
            } else if (z10) {
                i10 = 52;
            }
            min = Math.min(parentWidth - org.telegram.messenger.i0.L(i10 + 50), org.telegram.messenger.i0.L(270.0f));
            q1Var.Z6 = min;
        }
        q1Var.u0(q1Var.Z6, jjVar);
        q1Var.setMessageObjectInternal(jjVar);
        int L = org.telegram.messenger.i0.L(70.0f);
        int i11 = q1Var.Sa;
        q1Var.u0 = L + i11;
        if (q1Var.I) {
            q1Var.Sa = i11 - org.telegram.messenger.i0.L(1.0f);
        }
        p0Var.getClass();
        p0Var.o(min - org.telegram.messenger.i0.L(jjVar.P3() ? 32.0f : 24.0f), 3);
        if (p0Var.p) {
            return;
        }
        p0Var.n = p0Var.m;
        if (TextUtils.isEmpty(jjVar.z)) {
            p0Var.n = org.telegram.messenger.i0.L(12.0f) + p0Var.n;
        } else {
            p0Var.n = org.telegram.messenger.i0.L(8.0f) + p0Var.n;
        }
        int i12 = p0Var.o;
        if (i12 > q1Var.Z6) {
            q1Var.Z6 = i12;
        }
        int L2 = org.telegram.messenger.i0.L(6.0f) + q1Var.y9;
        if (jj.b4(jjVar.k) && !jjVar.n4()) {
            L2 -= org.telegram.messenger.i0.L(3.0f);
        } else if (jjVar.P3()) {
            L2 += org.telegram.messenger.i0.L(20.5f);
        }
        if (p0Var.r + q1Var.getExtraTimeX() + L2 >= q1Var.Z6) {
            p0Var.n = org.telegram.messenger.i0.L(12.0f) + p0Var.n;
            p0Var.k -= org.telegram.messenger.i0.L(12.0f);
        }
        q1Var.u0 += p0Var.n;
    }
}
