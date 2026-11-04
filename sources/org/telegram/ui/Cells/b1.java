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
import org.telegram.messenger.hs;
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b1 {
    public final q1 a;
    public float b;
    public float c;
    public StaticLayout d;
    public int e;
    public StaticLayout f;
    public int g;
    public float h;

    public b1(q1 q1Var) {
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
    public final void a(Canvas canvas, float f10, float f11) {
        float f12;
        Drawable drawable;
        zi ziVar;
        q1 q1Var = this.a;
        i1 i1Var = q1Var.C4;
        x1 x1Var = q1Var.hb;
        RadialProgress2 radialProgress2 = q1Var.Q0;
        if (q1Var.P5.Q3()) {
            org.telegram.ui.ActionBar.k6.O2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hc, q1Var.Pb));
            org.telegram.ui.ActionBar.k6.P2.setColor(org.telegram.ui.ActionBar.k6.w0(q1Var.x2() ? org.telegram.ui.ActionBar.k6.ac : org.telegram.ui.ActionBar.k6.Zb, q1Var.Pb));
            org.telegram.ui.ActionBar.k6.N2.setColor(org.telegram.ui.ActionBar.k6.w0(q1Var.x2() ? org.telegram.ui.ActionBar.k6.jc : org.telegram.ui.ActionBar.k6.ic, q1Var.Pb));
            radialProgress2.d = org.telegram.ui.ActionBar.k6.w0((q1Var.x2() || q1Var.O3 != 0) ? org.telegram.ui.ActionBar.k6.fc : org.telegram.ui.ActionBar.k6.ec, q1Var.Pb);
        } else {
            dk0 dk0Var = q1Var.n8;
            if (dk0Var == null || !q1Var.Q1) {
                org.telegram.ui.ActionBar.k6.O2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.fe, q1Var.Pb));
                org.telegram.ui.ActionBar.k6.P2.setColor(org.telegram.ui.ActionBar.k6.w0(q1Var.x2() ? org.telegram.ui.ActionBar.k6.ee : org.telegram.ui.ActionBar.k6.de, q1Var.Pb));
                org.telegram.ui.ActionBar.k6.N2.setColor(org.telegram.ui.ActionBar.k6.w0(q1Var.x2() ? org.telegram.ui.ActionBar.k6.he : org.telegram.ui.ActionBar.k6.ge, q1Var.Pb));
                radialProgress2.d = org.telegram.ui.ActionBar.k6.w0((q1Var.x2() || q1Var.O3 != 0) ? org.telegram.ui.ActionBar.k6.Xd : org.telegram.ui.ActionBar.k6.Wd, q1Var.Pb);
            } else {
                org.telegram.ui.ActionBar.k6.O2.setColor(dk0Var.i());
                org.telegram.ui.ActionBar.k6.P2.setColor(org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(q1Var.x2() ? org.telegram.ui.ActionBar.k6.ee : org.telegram.ui.ActionBar.k6.de, q1Var.Pb), q1Var.n8.i()));
                org.telegram.ui.ActionBar.k6.N2.setColor(org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(q1Var.x2() ? org.telegram.ui.ActionBar.k6.he : org.telegram.ui.ActionBar.k6.ge, q1Var.Pb), q1Var.n8.i()));
                radialProgress2.d = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0((q1Var.x2() || q1Var.O3 != 0) ? org.telegram.ui.ActionBar.k6.Xd : org.telegram.ui.ActionBar.k6.Wd, q1Var.Pb), q1Var.n8.i());
                i1 i1Var2 = q1Var.C4;
                int c2 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ie, q1Var.Pb), q1Var.n8.i());
                int c10 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.je, q1Var.Pb), q1Var.n8.i());
                int i3 = org.telegram.ui.ActionBar.k6.le;
                i1Var2.g(c2, c10, org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(i3, q1Var.Pb), q1Var.n8.i()), org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(i3, q1Var.Pb), q1Var.n8.i()), org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ke, q1Var.Pb), q1Var.n8.i()));
            }
        }
        float f13 = x1Var.x0 ? x1Var.h0 : 0.0f;
        org.telegram.ui.ActionBar.t4 t4Var = q1Var.x2() ? q1Var.L6 : q1Var.K6;
        radialProgress2.i.B = t4Var;
        radialProgress2.j.B = t4Var;
        radialProgress2.I = 1.0f;
        if (q1Var.N1 && (ziVar = q1Var.P5) != null && ziVar.u2() && q1Var.P5.q4()) {
            if (q1Var.P5.M0) {
                float f14 = q1Var.L9;
                if (f14 != 0.0f) {
                }
            }
            radialProgress2.I *= q1Var.L9;
        }
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(q1Var.N4 + f13 + this.e, q1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(13.0f) + q1Var.Ta);
        this.d.draw(canvas);
        canvas.restore();
        boolean I = MediaController.B().I(q1Var.P5);
        if (I) {
            float f15 = this.h;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.16f;
                this.h = f16;
                if (f16 > 1.0f) {
                    this.h = 1.0f;
                }
                q1Var.invalidate();
                f12 = this.h;
                if (f12 > 0.0f) {
                    float f17 = q1Var.G4;
                    if (x1Var.x0) {
                        f17 += x1Var.k0;
                    }
                    if (f12 != 1.0f) {
                        float f18 = q1Var.F4 + f13;
                        canvas.saveLayerAlpha(f18, f17, (i1Var.f - mm0.E) + f18 + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + f17, (int) (this.h * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    canvas.translate(q1Var.F4 + f13, f17);
                    i1Var.b(canvas);
                    canvas.restore();
                }
                if (this.h < 1.0f) {
                    float f19 = q1Var.N4 + f13 + this.g;
                    float mediaOffsetY = q1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(35.0f) + q1Var.Ta;
                    if (this.h != 0.0f) {
                        canvas.saveLayerAlpha(f19, mediaOffsetY, this.f.getWidth() + f19, this.f.getHeight() + mediaOffsetY, (int) ((1.0f - this.h) * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    float f20 = this.h;
                    if (f20 != 0.0f) {
                        float y9 = com.google.android.recaptcha.internal.a.y(1.0f, f20, 0.3f, 0.7f);
                        canvas.scale(y9, y9, f19, (this.f.getHeight() / 2.0f) + mediaOffsetY);
                    }
                    canvas.translate(f19, mediaOffsetY);
                    this.f.draw(canvas);
                    canvas.restore();
                }
                canvas.save();
                canvas.translate(f13 + q1Var.N4, q1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(57.0f) + q1Var.Ta);
                q1Var.K4.draw(canvas);
                canvas.restore();
                if (q1Var.C3()) {
                    return;
                }
                if (q1Var.P5.Q3()) {
                    drawable = q1Var.Y1(q1Var.x2() ? "drawableMsgOutMenuSelected" : "drawableMsgOutMenu");
                } else {
                    drawable = q1Var.x2() ? org.telegram.ui.ActionBar.k6.d4 : org.telegram.ui.ActionBar.k6.c4;
                }
                int L = ((((int) f10) + q1Var.a7) - org.telegram.messenger.g0.L(q1Var.P5.D == 0 ? 58.0f : 48.0f)) - org.telegram.messenger.g0.L(q1Var.Q1 ? 18.0f : 0.0f);
                q1Var.R3 = L;
                int L2 = ((int) f11) - org.telegram.messenger.g0.L(2.0f);
                q1Var.S3 = L2;
                z.s(L, L2, drawable);
                float f21 = x1Var.L1;
                if (f21 != 1.0f && x1Var.i2) {
                    drawable.setAlpha((int) (f21 * 255.0f));
                }
                drawable.draw(canvas);
                if (x1Var.L1 == 1.0f || !x1Var.i2) {
                    return;
                }
                drawable.setAlpha(hs.e4);
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
                q1Var.invalidate();
            }
        }
        f12 = this.h;
        if (f12 > 0.0f) {
        }
        if (this.h < 1.0f) {
        }
        canvas.save();
        canvas.translate(f13 + q1Var.N4, q1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(57.0f) + q1Var.Ta);
        q1Var.K4.draw(canvas);
        canvas.restore();
        if (q1Var.C3()) {
        }
    }

    public final void b(Canvas canvas, float f10, float f11, int i3) {
        float f12;
        float f13;
        int i10;
        float f14;
        canvas.save();
        q1 q1Var = this.a;
        x1 x1Var = q1Var.hb;
        int L = (org.telegram.messenger.g0.L(q1Var.G ? 6.0f : 0.0f) + (q1Var.getCurrentBackgroundRight() - q1Var.getCurrentBackgroundLeft())) - org.telegram.messenger.g0.L((q1Var.Q1 ? 10 : 0) + 128);
        if (q1Var.I4 == null) {
            a1 a1Var = new a1(this, q1Var, q1Var.D4);
            q1Var.I4 = a1Var;
            zi ziVar = q1Var.P5;
            TLRPC.Message message = ziVar.k;
            a1Var.q(message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && m11.k(ziVar), false);
            q1Var.I4.o(m11.j(q1Var.P5), false);
            q1Var.I4.p(m11.s(q1Var.P5), false);
        }
        if (q1Var.E8 != 0) {
            this.b = org.telegram.messenger.g0.T1(org.telegram.messenger.k5.C(21.0f, i3, L), q1Var.Q8, 1.0f - q1Var.getVideoTranscriptionProgress());
            this.c = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(3.0f) + q1Var.G4, q1Var.R8 - org.telegram.messenger.g0.L(40.0f), 1.0f - q1Var.getVideoTranscriptionProgress());
        } else {
            float C = org.telegram.messenger.k5.C(21.0f, i3, L);
            zi ziVar2 = q1Var.P5;
            this.b = org.telegram.messenger.g0.T1(C, (ziVar2 == null || !ziVar2.Q3()) ? q1Var.t2() ? Math.min(q1Var.getPhotoImage().y() + org.telegram.messenger.g0.L(8.0f), q1Var.getCompactRight() - org.telegram.messenger.g0.L(32.0f)) : (org.telegram.messenger.g0.L(8.0f) + q1Var.getCurrentBackgroundRight()) - (org.telegram.messenger.g0.L(40.0f) * f11) : (org.telegram.messenger.g0.L(28.0f) * f11) + (q1Var.getCurrentBackgroundLeft() - org.telegram.messenger.g0.L(40.0f)), 1.0f - q1Var.getVideoTranscriptionProgress());
            float L2 = (q1Var.d7 + x1Var.j0) - org.telegram.messenger.g0.L(28 - (q1Var.K ? 2 : 0));
            dh.o0 o0Var = q1Var.O;
            if (!o0Var.p) {
                L2 -= o0Var.i(x1Var.L1);
            }
            this.c = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(3.0f) + q1Var.G4, ((org.telegram.messenger.g0.T1(L2, (q1Var.getMediaOffsetY() + (org.telegram.messenger.g0.L(44.0f) + q1Var.Ta)) - org.telegram.messenger.g0.L(1.7f), q1Var.getVideoTranscriptionProgress()) + org.telegram.messenger.g0.L(1.7f)) - org.telegram.messenger.g0.L(12.0f)) - (q1Var.P5.Q3() ? 0.0f : org.telegram.messenger.g0.L(28.0f) * f11), 1.0f - q1Var.getVideoTranscriptionProgress());
        }
        a1 a1Var2 = q1Var.I4;
        int i11 = (int) this.b;
        int i12 = (int) this.c;
        int W1 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(32.0f));
        int W12 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(32.0f));
        int W13 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f));
        Rect rect = a1Var2.u;
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
            a1Var2.F = (float) ((Math.atan((f15 - f16) / f17) * 180.0d) / 3.141592653589793d);
            a1Var2.G = (float) ((Math.atan(f15 / (f17 - f16)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i11, i12, i11 + W1, i12 + W12);
        int min = Math.min(Math.min(W1, W12) / 2, W13);
        a1Var2.D = min;
        a1Var2.E = min * 2;
        a1 a1Var3 = q1Var.I4;
        int f18 = i0.a.f(q1Var.L1 == 3 ? 1.0f : q1Var.getVideoTranscriptionProgress(), org.telegram.ui.ActionBar.k6.w0(q1Var.t2() ? org.telegram.ui.ActionBar.k6.Ta : org.telegram.ui.ActionBar.k6.Wc, q1Var.Pb), org.telegram.ui.ActionBar.k6.w0(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.Gc : org.telegram.ui.ActionBar.k6.qk, q1Var.Pb));
        org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, q1Var.Pb);
        q1Var.P5.O3();
        float videoTranscriptionProgress = q1Var.L1 == 3 ? f13 : 1.0f - q1Var.getVideoTranscriptionProgress();
        ch0 ch0Var = a1Var3.p;
        ch0 ch0Var2 = a1Var3.n;
        boolean z10 = a1Var3.b != f18;
        a1Var3.b = f18;
        a1Var3.c = f18;
        int o10 = i0.a.o(f18, (int) (Color.alpha(f18) * 0.156f));
        a1Var3.a = o10;
        a1Var3.e = videoTranscriptionProgress;
        a1Var3.d = org.telegram.ui.ActionBar.k6.w(o10, i0.a.o(f18, (int) (Color.alpha(f18) * (org.telegram.ui.ActionBar.k6.I.q() ? 0.3f : 0.2f))));
        if (a1Var3.f == null) {
            a1Var3.f = new Paint();
        }
        a1Var3.f.setColor(a1Var3.a);
        a1Var3.f.setAlpha((int) ((1.0f - videoTranscriptionProgress) * r9.getAlpha()));
        if (z10 || a1Var3.q == null) {
            int L3 = org.telegram.messenger.g0.L(8.0f);
            int i13 = a1Var3.d;
            y k02 = org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, i13, i13);
            a1Var3.q = k02;
            k02.setCallback(a1Var3.r);
        }
        if (z10) {
            ch0Var2.a0 = true;
            ch0Var2.Q(a1Var3.c, "Artboard Outlines");
            ch0Var2.o();
            ch0Var2.J(true);
            ch0Var2.V(0L);
            int alpha = Color.alpha(f18);
            a1Var3.m = alpha;
            ch0Var2.setAlpha(alpha);
            ch0Var.a0 = true;
            ch0Var.Q(a1Var3.c, "Artboard Outlines");
            ch0Var.o();
            ch0Var.J(true);
            ch0Var.V(0L);
            int alpha2 = Color.alpha(f18);
            a1Var3.o = alpha2;
            ch0Var.setAlpha(alpha2);
        }
        if (a1Var3.g == null) {
            Paint paint = new Paint(1);
            a1Var3.g = paint;
            paint.setStyle(Paint.Style.STROKE);
            a1Var3.g.setStrokeCap(Paint.Cap.ROUND);
        }
        a1Var3.g.setColor(f18);
        a1 a1Var4 = q1Var.I4;
        ch0 ch0Var3 = a1Var4.p;
        ch0 ch0Var4 = a1Var4.n;
        Rect rect2 = a1Var4.v;
        Rect rect3 = a1Var4.u;
        rect2.set(rect3.left - org.telegram.messenger.g0.L(8.0f), rect3.top - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + rect3.right, org.telegram.messenger.g0.L(8.0f) + rect3.bottom);
        Path path = a1Var4.C;
        if (path == null) {
            a1Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect3);
        Path path2 = a1Var4.C;
        float f19 = a1Var4.D;
        path2.addRoundRect(rectF, f19, f19, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(a1Var4.C);
        float f20 = a1Var4.e * f10;
        if (f20 > f13) {
            q1 q1Var2 = a1Var4.R.a;
            Paint Z1 = q1Var2.P5.Q5() ? q1Var2.Z1("paintChatActionBackground") : q1Var2.Z1("paintChatTimeBackground");
            int alpha3 = Z1.getAlpha();
            Z1.setAlpha((int) (alpha3 * f20));
            q1Var2.x();
            canvas.drawRect(rect3, Z1);
            if (Z1 == q1Var2.Z1("paintChatActionBackground") && q1Var2.g2()) {
                int alpha4 = org.telegram.ui.ActionBar.k6.h2.getAlpha();
                org.telegram.ui.ActionBar.k6.h2.setAlpha((int) (alpha4 * f20));
                canvas.drawRect(rect3, org.telegram.ui.ActionBar.k6.h2);
                org.telegram.ui.ActionBar.k6.h2.setAlpha(alpha4);
            }
            Z1.setAlpha(alpha3);
        }
        Paint paint2 = a1Var4.f;
        if (paint2 != null) {
            int alpha5 = paint2.getAlpha();
            a1Var4.f.setAlpha((int) (alpha5 * f10));
            canvas.drawRect(rect3, a1Var4.f);
            a1Var4.f.setAlpha(alpha5);
        }
        y yVar = a1Var4.q;
        if (yVar != null) {
            yVar.setBounds(rect3);
            a1Var4.q.draw(canvas);
        }
        canvas.restore();
        float e10 = a1Var4.l.e(false, a1Var4.k ? 1.0f : f13);
        if (e10 > f13) {
            long elapsedRealtime = (long) ((SystemClock.elapsedRealtime() - a1Var4.t) * 0.75f);
            w1.a aVar = a1Var4.B;
            if (a1Var4.M == null) {
                a1Var4.M = new float[i10];
            }
            long j10 = elapsedRealtime % 5400;
            float[] fArr = a1Var4.M;
            float f21 = (1520 * j10) / 5400.0f;
            fArr[0] = f21 - 20.0f;
            char c2 = 1;
            fArr[1] = f21;
            int i14 = 0;
            while (i14 < 4) {
                float[] fArr2 = a1Var4.M;
                int i15 = i14 * 1350;
                fArr2[1] = (aVar.getInterpolation((j10 - i15) / 667.0f) * 250.0f) + fArr2[c2];
                float[] fArr3 = a1Var4.M;
                fArr3[0] = (aVar.getInterpolation((j10 - (i15 + 667)) / 667.0f) * 250.0f) + fArr3[0];
                i14++;
                c2 = 1;
            }
            f14 = 180.0f;
            float[] fArr4 = a1Var4.M;
            Path path3 = a1Var4.h;
            if (path3 == null) {
                a1Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e10 * f12, fArr4[1] - fArr4[0]);
            float f22 = ((1.0f - e10) * max * (a1Var4.k ? f13 : 1.0f)) + fArr4[0];
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
            Path path4 = a1Var4.h;
            int centerX = rect3.centerX();
            int i16 = rect3.top;
            m11.d(path4, centerX, i16, rect3.right - a1Var4.D, i16, f26, f27, 0.0f, a1Var4.F);
            m11.b(a1Var4.h, rect3.right, rect3.top, a1Var4.E, 1, f26, f27, a1Var4.F, a1Var4.G);
            Path path5 = a1Var4.h;
            int i17 = rect3.right;
            int i18 = rect3.top;
            int i19 = a1Var4.D;
            int i20 = i18 + i19;
            int i21 = rect3.bottom - i19;
            float f28 = a1Var4.G;
            m11.d(path5, i17, i20, i17, i21, f26, f27, f28, 180.0f - f28);
            m11.b(a1Var4.h, rect3.right, rect3.bottom, a1Var4.E, 2, f26, f27, 180.0f - a1Var4.G, 180.0f - a1Var4.F);
            Path path6 = a1Var4.h;
            int i22 = rect3.right;
            int i23 = a1Var4.D;
            int i24 = i22 - i23;
            int i25 = rect3.bottom;
            int i26 = rect3.left + i23;
            float f29 = a1Var4.F;
            m11.d(path6, i24, i25, i26, i25, f26, f27, 180.0f - f29, f29 + 180.0f);
            m11.b(a1Var4.h, rect3.left, rect3.bottom, a1Var4.E, 3, f26, f27, a1Var4.F + 180.0f, a1Var4.G + 180.0f);
            Path path7 = a1Var4.h;
            int i27 = rect3.left;
            int i28 = rect3.bottom;
            int i29 = a1Var4.D;
            int i30 = i28 - i29;
            int i31 = rect3.top + i29;
            float f30 = a1Var4.G;
            m11.d(path7, i27, i30, i27, i31, f26, f27, f30 + 180.0f, 360.0f - f30);
            m11.b(a1Var4.h, rect3.left, rect3.top, a1Var4.E, 4, f26, f27, 360.0f - a1Var4.G, 360.0f - a1Var4.F);
            m11.d(a1Var4.h, rect3.left + a1Var4.D, rect3.top, rect3.centerX(), rect3.top, f26, f27, 360.0f - a1Var4.F, 360.0f);
            a1Var4.g.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            int alpha6 = a1Var4.g.getAlpha();
            a1Var4.g.setAlpha((int) (alpha6 * f10));
            canvas.drawPath(a1Var4.h, a1Var4.g);
            a1Var4.g.setAlpha(alpha6);
            a1Var4.r.invalidate();
        } else {
            f14 = 180.0f;
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(-13.0f) + rect3.centerX(), org.telegram.messenger.g0.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), hs.e4, 31);
        if (a1Var4.y) {
            ch0Var4.setAlpha((int) (a1Var4.m * f10));
            ch0Var4.draw(canvas);
        } else {
            ch0Var3.setAlpha((int) (a1Var4.o * f10));
            ch0Var3.draw(canvas);
        }
        float d = a1Var4.j.d((!a1Var4.i || a1Var4.y || a1Var4.k) ? false : true);
        if (d > f13) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(12.0f));
            if (a1Var4.H == null) {
                Paint paint3 = new Paint(1);
                a1Var4.H = paint3;
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f13, -org.telegram.messenger.g0.L(0.4f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), a1Var4.H);
            if (a1Var4.I == null) {
                a1Var4.I = new Paint(1);
            }
            a1Var4.I.setColor(a1Var4.c);
            int i32 = (int) (d * 255.0f);
            a1Var4.I.setAlpha(i32);
            rectF2.set(0.0f, org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.33f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), a1Var4.I);
            if (a1Var4.L == null || Math.abs(a1Var4.K - org.telegram.messenger.g0.p) > 0.1f) {
                a1Var4.K = org.telegram.messenger.g0.p;
                Path path8 = new Path();
                a1Var4.L = path8;
                path8.moveTo(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(3.33f));
                a1Var4.L.lineTo(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(2.0f));
                rectF2.set(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(0.33f), org.telegram.messenger.g0.L(4.99f), org.telegram.messenger.g0.L(3.6599998f));
                a1Var4.L.arcTo(rectF2, -180.0f, f14, false);
                a1Var4.L.lineTo(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(3.33f));
            }
            if (a1Var4.J == null) {
                Paint paint4 = new Paint(1);
                a1Var4.J = paint4;
                paint4.setStyle(Paint.Style.STROKE);
            }
            a1Var4.J.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            a1Var4.J.setColor(a1Var4.c);
            a1Var4.J.setAlpha(i32);
            canvas.drawPath(a1Var4.L, a1Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i3, float f10) {
        canvas.save();
        int L = org.telegram.messenger.g0.L(44.0f);
        q1 q1Var = this.a;
        canvas.translate(i3, q1Var.getMediaOffsetY() + L + q1Var.Ta + f10);
        q1Var.K4.draw(canvas);
        canvas.restore();
        zi ziVar = q1Var.P5;
        if (ziVar.D == 0 || !ziVar.k.media_unread) {
            return;
        }
        org.telegram.ui.ActionBar.k6.S1.setColor(org.telegram.ui.ActionBar.k6.w0(ziVar.Q3() ? org.telegram.ui.ActionBar.k6.qc : org.telegram.ui.ActionBar.k6.oe, q1Var.Pb));
        canvas.drawCircle(org.telegram.messenger.g0.L(6.0f) + i3 + q1Var.M4, q1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(51.0f) + q1Var.Ta, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.S1);
    }

    public final void d(zi ziVar, boolean z10) {
        ri riVar;
        int L;
        ui uiVar;
        q1 q1Var = this.a;
        dh.o0 o0Var = q1Var.O;
        int i3 = 0;
        q1Var.r9 = (q1Var.t6 || ziVar.k.fwd_from == null) ? false : true;
        q1Var.i9 = (q1Var.g6 && !ziVar.Q3() && (ziVar.Q1() < 0 || ziVar.Q1() == 2666000)) || (((ziVar.p3() && ziVar.B4()) || (ziVar.z3() && ziVar.k.fwd_from.from_id == null)) && ((riVar = q1Var.M) == null || (riVar.l & 4) != 0));
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (q1Var.W6) {
                i3 = 71;
            } else if (z10) {
                i3 = 52;
            }
            L = Q0 - org.telegram.messenger.g0.L(i3 + 50);
            q1Var.a7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.W6) {
                i3 = 71;
            } else if (z10) {
                i3 = 52;
            }
            L = parentWidth - org.telegram.messenger.g0.L(i3 + 50);
            q1Var.a7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        }
        if (q1Var.M != null) {
            q1Var.a7 = L;
        }
        int v02 = q1Var.v0(L, ziVar);
        q1Var.setMessageObjectInternal(ziVar);
        q1Var.v0 = org.telegram.messenger.g0.L(82.0f) + q1Var.Ta;
        if (org.telegram.messenger.g0.L(76.0f) + v02 >= (q1Var.a7 - q1Var.z9) - org.telegram.messenger.g0.L(12.0f)) {
            q1Var.v0 = org.telegram.messenger.g0.L(14.0f) + q1Var.v0;
        }
        if (q1Var.M != null && (uiVar = q1Var.L) != null && uiVar.d.size() > 1) {
            if ((q1Var.M.l & 4) == 0) {
                q1Var.v0 -= org.telegram.messenger.g0.L(6.0f);
                q1Var.W1 -= org.telegram.messenger.g0.L(6.0f);
            }
            if ((q1Var.M.l & 8) == 0) {
                q1Var.v0 -= org.telegram.messenger.g0.L(6.0f);
            }
        }
        if (q1Var.J) {
            q1Var.Ta -= org.telegram.messenger.g0.L(1.0f);
        }
        o0Var.getClass();
        o0Var.o(L - org.telegram.messenger.g0.L(24.0f), 3);
        if (o0Var.p) {
            return;
        }
        o0Var.n = org.telegram.messenger.g0.L(12.0f) + o0Var.m;
        q1Var.V2(ziVar);
        int i10 = o0Var.o;
        if (i10 > q1Var.a7) {
            q1Var.a7 = i10;
        }
        if (org.telegram.messenger.g0.L(24.0f) + o0Var.r + q1Var.z9 > q1Var.a7) {
            o0Var.n = org.telegram.messenger.g0.L(12.0f) + o0Var.n;
            o0Var.k -= org.telegram.messenger.g0.L(12.0f);
        }
        if (!ziVar.E0 && ziVar.z != null) {
            o0Var.k = org.telegram.messenger.g0.L(14.0f) + o0Var.k;
        }
        q1Var.v0 += o0Var.n;
    }

    public final void e(zi ziVar, boolean z10) {
        int min;
        q1 q1Var = this.a;
        dh.o0 o0Var = q1Var.O;
        boolean z11 = true;
        q1Var.r9 = !q1Var.t6;
        int i3 = 0;
        if ((!q1Var.g6 || ziVar.Q3() || (ziVar.Q1() >= 0 && ziVar.Q1() != 2666000)) && ((!ziVar.p3() || !ziVar.B4()) && ((!ziVar.z3() || ziVar.k.fwd_from.from_id != null) && (!q1Var.X6 || ziVar.Q3() || (!q1Var.k6 && (!q1Var.l6 || !q1Var.V6)))))) {
            z11 = false;
        }
        q1Var.i9 = z11;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (q1Var.W6) {
                i3 = 71;
            } else if (z10) {
                i3 = 52;
            }
            min = Math.min(Q0 - org.telegram.messenger.g0.L(i3 + 50), org.telegram.messenger.g0.L(270.0f));
            q1Var.a7 = min;
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.W6) {
                i3 = 71;
            } else if (z10) {
                i3 = 52;
            }
            min = Math.min(parentWidth - org.telegram.messenger.g0.L(i3 + 50), org.telegram.messenger.g0.L(270.0f));
            q1Var.a7 = min;
        }
        q1Var.v0(q1Var.a7, ziVar);
        q1Var.setMessageObjectInternal(ziVar);
        int L = org.telegram.messenger.g0.L(70.0f);
        int i10 = q1Var.Ta;
        q1Var.v0 = L + i10;
        if (q1Var.J) {
            q1Var.Ta = i10 - org.telegram.messenger.g0.L(1.0f);
        }
        o0Var.getClass();
        o0Var.o(min - org.telegram.messenger.g0.L(ziVar.Q3() ? 32.0f : 24.0f), 3);
        if (o0Var.p) {
            return;
        }
        o0Var.n = o0Var.m;
        if (TextUtils.isEmpty(ziVar.z)) {
            o0Var.n = org.telegram.messenger.g0.L(12.0f) + o0Var.n;
        } else {
            o0Var.n = org.telegram.messenger.g0.L(8.0f) + o0Var.n;
        }
        int i11 = o0Var.o;
        if (i11 > q1Var.a7) {
            q1Var.a7 = i11;
        }
        int L2 = org.telegram.messenger.g0.L(6.0f) + q1Var.z9;
        if (zi.c4(ziVar.k) && !ziVar.o4()) {
            L2 -= org.telegram.messenger.g0.L(3.0f);
        } else if (ziVar.Q3()) {
            L2 += org.telegram.messenger.g0.L(20.5f);
        }
        if (o0Var.r + q1Var.getExtraTimeX() + L2 >= q1Var.a7) {
            o0Var.n = org.telegram.messenger.g0.L(12.0f) + o0Var.n;
            o0Var.k -= org.telegram.messenger.g0.L(12.0f);
        }
        q1Var.v0 += o0Var.n;
    }
}
