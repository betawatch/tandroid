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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hb2 {
    public final wb2 a;
    public float b;
    public float c;
    public StaticLayout d;
    public int e;
    public StaticLayout f;
    public int g;
    public float h;

    public hb2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01cb, code lost:
    
        if (r3 < 1.0f) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f, float f2) {
        Drawable drawable;
        r47 r47Var;
        wb2 wb2Var = this.a;
        nb2 nb2Var = wb2Var.D4;
        dc2 dc2Var = wb2Var.ub;
        RadialProgress2 radialProgress2 = wb2Var.Q0;
        if (wb2Var.Q5.O3()) {
            aob.O2.setColor(aob.v0(aob.kc, wb2Var.cc));
            aob.P2.setColor(aob.v0(wb2Var.A2() ? aob.dc : aob.cc, wb2Var.cc));
            aob.N2.setColor(aob.v0(wb2Var.A2() ? aob.mc : aob.lc, wb2Var.cc));
            radialProgress2.d = aob.v0((wb2Var.A2() || wb2Var.P3) ? aob.ic : aob.hc, wb2Var.cc);
        } else {
            ab9 ab9Var = wb2Var.o8;
            if (ab9Var == null || !wb2Var.R1) {
                aob.O2.setColor(aob.v0(aob.ie, wb2Var.cc));
                aob.P2.setColor(aob.v0(wb2Var.A2() ? aob.he : aob.ge, wb2Var.cc));
                aob.N2.setColor(aob.v0(wb2Var.A2() ? aob.ke : aob.je, wb2Var.cc));
                radialProgress2.d = aob.v0((wb2Var.A2() || wb2Var.P3) ? aob.ae : aob.Zd, wb2Var.cc);
            } else {
                aob.O2.setColor(ab9Var.h());
                aob.P2.setColor(aob.b(aob.v0(wb2Var.A2() ? aob.he : aob.ge, wb2Var.cc), wb2Var.o8.h()));
                aob.N2.setColor(aob.b(aob.v0(wb2Var.A2() ? aob.ke : aob.je, wb2Var.cc), wb2Var.o8.h()));
                radialProgress2.d = aob.b(aob.v0((wb2Var.A2() || wb2Var.P3) ? aob.ae : aob.Zd, wb2Var.cc), wb2Var.o8.h());
                nb2 nb2Var2 = wb2Var.D4;
                int b = aob.b(aob.v0(aob.le, wb2Var.cc), wb2Var.o8.h());
                int b2 = aob.b(aob.v0(aob.me, wb2Var.cc), wb2Var.o8.h());
                int i = aob.oe;
                nb2Var2.f(b, b2, aob.b(aob.v0(i, wb2Var.cc), wb2Var.o8.h()), aob.b(aob.v0(i, wb2Var.cc), wb2Var.o8.h()), aob.b(aob.v0(aob.ne, wb2Var.cc), wb2Var.o8.h()));
            }
        }
        float f3 = dc2Var.x0 ? dc2Var.h0 : 0.0f;
        t37 t37Var = wb2Var.A2() ? wb2Var.M6 : wb2Var.L6;
        radialProgress2.i.B = t37Var;
        radialProgress2.j.B = t37Var;
        radialProgress2.I = 1.0f;
        if (wb2Var.O1 && (r47Var = wb2Var.Q5) != null && r47Var.t2() && wb2Var.Q5.o4()) {
            if (wb2Var.Q5.O0) {
                float f4 = wb2Var.Y9;
                if (f4 != 0.0f) {
                }
            }
            radialProgress2.I *= wb2Var.Y9;
        }
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(wb2Var.O4 + f3 + this.e, wb2Var.getMediaOffsetY() + hl.L(13.0f) + wb2Var.gb);
        this.d.draw(canvas);
        canvas.restore();
        boolean H = MediaController.z().H(wb2Var.Q5);
        float f5 = this.h;
        if (H) {
            if (f5 != 1.0f) {
                float f6 = f5 + 0.16f;
                this.h = f6;
                if (f6 > 1.0f) {
                    this.h = 1.0f;
                }
                wb2Var.invalidate();
            }
        } else if (f5 != 0.0f) {
            float f7 = f5 - 0.16f;
            this.h = f7;
            if (f7 < 0.0f) {
                this.h = 0.0f;
            }
            wb2Var.invalidate();
        }
        float f8 = this.h;
        if (f8 > 0.0f) {
            float f9 = wb2Var.H4;
            if (dc2Var.x0) {
                f9 += dc2Var.k0;
            }
            if (f8 != 1.0f) {
                float f10 = wb2Var.G4 + f3;
                canvas.saveLayerAlpha(f10, f9, (nb2Var.f - ry9.E) + f10 + hl.L(24.0f), hl.L(24.0f) + f9, (int) (this.h * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.translate(wb2Var.G4 + f3, f9);
            nb2Var.b(canvas);
            canvas.restore();
        }
        if (this.h < 1.0f) {
            float f11 = wb2Var.O4 + f3 + this.g;
            float mediaOffsetY = wb2Var.getMediaOffsetY() + hl.L(35.0f) + wb2Var.gb;
            if (this.h != 0.0f) {
                canvas.saveLayerAlpha(f11, mediaOffsetY, this.f.getWidth() + f11, this.f.getHeight() + mediaOffsetY, (int) ((1.0f - this.h) * 255.0f), 31);
            } else {
                canvas.save();
            }
            float f12 = this.h;
            if (f12 != 0.0f) {
                float A = qd4.A(1.0f, f12, 0.3f, 0.7f);
                canvas.scale(A, A, f11, (this.f.getHeight() / 2.0f) + mediaOffsetY);
            }
            canvas.translate(f11, mediaOffsetY);
            this.f.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(f3 + wb2Var.O4, wb2Var.getMediaOffsetY() + hl.L(57.0f) + wb2Var.gb);
        wb2Var.L4.draw(canvas);
        canvas.restore();
        if (wb2Var.H3()) {
            if (wb2Var.Q5.O3()) {
                drawable = wb2Var.b2(wb2Var.A2() ? "drawableMsgOutMenuSelected" : "drawableMsgOutMenu");
            } else {
                drawable = wb2Var.A2() ? aob.d4 : aob.c4;
            }
            int L = ((((int) f) + wb2Var.b7) - hl.L(wb2Var.Q5.D == 0 ? 58.0f : 48.0f)) - hl.L(wb2Var.R1 ? 18.0f : 0.0f);
            wb2Var.S3 = L;
            int L2 = ((int) f2) - hl.L(2.0f);
            wb2Var.T3 = L2;
            jf0.u(L, L2, drawable);
            float f13 = dc2Var.L1;
            if (f13 != 1.0f && dc2Var.i2) {
                drawable.setAlpha((int) (f13 * 255.0f));
            }
            drawable.draw(canvas);
            if (dc2Var.L1 == 1.0f || !dc2Var.i2) {
                return;
            }
            drawable.setAlpha(jn7.d4);
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
        wb2 wb2Var = this.a;
        dc2 dc2Var = wb2Var.ub;
        int L = (hl.L(wb2Var.G ? 6.0f : 0.0f) + (wb2Var.getCurrentBackgroundRight() - wb2Var.getCurrentBackgroundLeft())) - hl.L((wb2Var.R1 ? 10 : 0) + 128);
        if (wb2Var.J4 == null) {
            gb2 gb2Var = new gb2(this, wb2Var, wb2Var.E4);
            wb2Var.J4 = gb2Var;
            r47 r47Var = wb2Var.Q5;
            TLRPC.Message message = r47Var.k;
            gb2Var.u(message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && u2c.m(r47Var), false);
            wb2Var.J4.s(u2c.l(wb2Var.Q5), false);
            wb2Var.J4.t(u2c.w(wb2Var.Q5), false);
        }
        if (wb2Var.R8 != 0) {
            this.b = hl.R1(uh9.w(21.0f, i, L), wb2Var.d9, 1.0f - wb2Var.getVideoTranscriptionProgress());
            R1 = hl.R1(hl.L(3.0f) + wb2Var.H4, wb2Var.e9 - hl.L(40.0f), 1.0f - wb2Var.getVideoTranscriptionProgress());
            this.c = R1;
        } else {
            float w = uh9.w(21.0f, i, L);
            r47 r47Var2 = wb2Var.Q5;
            this.b = hl.R1(w, (r47Var2 == null || !r47Var2.O3()) ? wb2Var.v2() ? Math.min(wb2Var.getPhotoImage().w() + hl.L(8.0f), wb2Var.getCompactRight() - hl.L(32.0f)) : (hl.L(8.0f) + wb2Var.getCurrentBackgroundRight()) - (hl.L(40.0f) * f2) : (hl.L(28.0f) * f2) + (wb2Var.getCurrentBackgroundLeft() - hl.L(40.0f)), 1.0f - wb2Var.getVideoTranscriptionProgress());
            float L2 = (wb2Var.e7 + dc2Var.j0) - hl.L(28 - (wb2Var.K ? 2 : 0));
            x49 x49Var = wb2Var.O;
            if (!x49Var.p) {
                L2 -= x49Var.i(dc2Var.L1);
            }
            R1 = hl.R1(hl.L(3.0f) + wb2Var.H4, ((hl.R1(L2, (wb2Var.getMediaOffsetY() + (hl.L(44.0f) + wb2Var.gb)) - hl.L(1.7f), wb2Var.getVideoTranscriptionProgress()) + hl.L(1.7f)) - hl.L(12.0f)) - (wb2Var.Q5.O3() ? 0.0f : hl.L(28.0f) * f2), 1.0f - wb2Var.getVideoTranscriptionProgress());
            this.c = R1;
        }
        gb2 gb2Var2 = wb2Var.J4;
        int i3 = (int) this.b;
        int i4 = (int) R1;
        int U1 = hl.U1(1.0f - wb2Var.getVideoTranscriptionProgress(), hl.L(30.0f), hl.L(32.0f));
        int U12 = hl.U1(1.0f - wb2Var.getVideoTranscriptionProgress(), hl.L(24.0f), hl.L(32.0f));
        int U13 = hl.U1(1.0f - wb2Var.getVideoTranscriptionProgress(), hl.L(8.0f), hl.L(16.0f));
        Rect rect = gb2Var2.u;
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
            gb2Var2.F = (float) ((Math.atan((f7 - f8) / f9) * 180.0d) / 3.141592653589793d);
            gb2Var2.G = (float) ((Math.atan(f7 / (f9 - f8)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i3, i4, i3 + U1, i4 + U12);
        int min = Math.min(Math.min(U1, U12) / 2, U13);
        gb2Var2.D = min;
        gb2Var2.E = min << 1;
        gb2 gb2Var3 = wb2Var.J4;
        int f10 = vm2.f(wb2Var.M1 == 3 ? 1.0f : wb2Var.getVideoTranscriptionProgress(), aob.v0(wb2Var.v2() ? aob.Ta : aob.Zc, wb2Var.cc), aob.v0(wb2Var.Q5.O3() ? aob.Jc : aob.tk, wb2Var.cc));
        aob.v0(aob.y6, wb2Var.cc);
        wb2Var.Q5.N3();
        float videoTranscriptionProgress = wb2Var.M1 == 3 ? f5 : 1.0f - wb2Var.getVideoTranscriptionProgress();
        b29 b29Var = gb2Var3.p;
        b29 b29Var2 = gb2Var3.n;
        boolean z = gb2Var3.b != f10;
        gb2Var3.b = f10;
        gb2Var3.c = f10;
        int o = vm2.o(f10, (int) (Color.alpha(f10) * 0.156f));
        gb2Var3.a = o;
        gb2Var3.e = videoTranscriptionProgress;
        gb2Var3.d = aob.v(o, vm2.o(f10, (int) (Color.alpha(f10) * (aob.I.o() ? 0.3f : 0.2f))));
        Paint paint = gb2Var3.f;
        if (paint == null) {
            paint = new Paint();
            gb2Var3.f = paint;
        }
        paint.setColor(gb2Var3.a);
        gb2Var3.f.setAlpha((int) ((1.0f - videoTranscriptionProgress) * r10.getAlpha()));
        if (z || gb2Var3.q == null) {
            int L3 = hl.L(8.0f);
            int i5 = gb2Var3.d;
            hf0 i0 = aob.i0(L3, L3, L3, L3, 0, i5, i5);
            gb2Var3.q = i0;
            i0.setCallback(gb2Var3.r);
        }
        if (z) {
            b29Var2.a0 = true;
            b29Var2.L(gb2Var3.c, "Artboard Outlines");
            b29Var2.j();
            b29Var2.E(true);
            b29Var2.Q(0L);
            int alpha = Color.alpha(f10);
            gb2Var3.m = alpha;
            b29Var2.setAlpha(alpha);
            b29Var.a0 = true;
            b29Var.L(gb2Var3.c, "Artboard Outlines");
            b29Var.j();
            b29Var.E(true);
            b29Var.Q(0L);
            int alpha2 = Color.alpha(f10);
            gb2Var3.o = alpha2;
            b29Var.setAlpha(alpha2);
        }
        if (gb2Var3.g == null) {
            Paint paint2 = new Paint(1);
            gb2Var3.g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            gb2Var3.g.setStrokeCap(Paint.Cap.ROUND);
        }
        gb2Var3.g.setColor(f10);
        gb2 gb2Var4 = wb2Var.J4;
        b29 b29Var3 = gb2Var4.p;
        b29 b29Var4 = gb2Var4.n;
        Rect rect2 = gb2Var4.v;
        Rect rect3 = gb2Var4.u;
        rect2.set(rect3.left - hl.L(8.0f), rect3.top - hl.L(8.0f), hl.L(8.0f) + rect3.right, hl.L(8.0f) + rect3.bottom);
        Path path = gb2Var4.C;
        if (path == null) {
            gb2Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = hl.P;
        rectF.set(rect3);
        Path path2 = gb2Var4.C;
        float f11 = gb2Var4.D;
        path2.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(gb2Var4.C);
        float f12 = gb2Var4.e * f;
        if (f12 > f5) {
            wb2 wb2Var2 = gb2Var4.T.a;
            Paint c2 = wb2Var2.Q5.O5() ? wb2Var2.c2("paintChatActionBackground") : wb2Var2.c2("paintChatTimeBackground");
            int alpha3 = c2.getAlpha();
            c2.setAlpha((int) (alpha3 * f12));
            wb2Var2.C();
            canvas.drawRect(rect3, c2);
            if (c2 == wb2Var2.c2("paintChatActionBackground") && wb2Var2.i2()) {
                int alpha4 = aob.h2.getAlpha();
                aob.h2.setAlpha((int) (alpha4 * f12));
                canvas.drawRect(rect3, aob.h2);
                aob.h2.setAlpha(alpha4);
            }
            c2.setAlpha(alpha3);
        }
        Paint paint3 = gb2Var4.f;
        if (paint3 != null) {
            int alpha5 = paint3.getAlpha();
            gb2Var4.f.setAlpha((int) (alpha5 * f));
            canvas.drawRect(rect3, gb2Var4.f);
            gb2Var4.f.setAlpha(alpha5);
        }
        hf0 hf0Var = gb2Var4.q;
        if (hf0Var != null) {
            hf0Var.setBounds(rect3);
            gb2Var4.q.draw(canvas);
        }
        canvas.restore();
        float e = gb2Var4.l.e(false, gb2Var4.k ? 1.0f : f5);
        if (e > f5) {
            long elapsedRealtime = (long) ((SystemClock.elapsedRealtime() - gb2Var4.t) * 0.75f);
            x84 x84Var = gb2Var4.B;
            float[] fArr2 = gb2Var4.M;
            if (fArr2 == null) {
                fArr2 = new float[i2];
                gb2Var4.M = fArr2;
            }
            long j = elapsedRealtime % 5400;
            float f13 = (1520 * j) / 5400.0f;
            fArr2[0] = f13 - 20.0f;
            fArr2[1] = f13;
            int i6 = 0;
            while (true) {
                fArr = gb2Var4.M;
                if (i6 >= 4) {
                    break;
                }
                int i7 = i6 * 1350;
                fArr[1] = (x84Var.getInterpolation((j - i7) / 667.0f) * 250.0f) + fArr[1];
                float[] fArr3 = gb2Var4.M;
                fArr3[0] = (x84Var.getInterpolation((j - (i7 + 667)) / 667.0f) * 250.0f) + fArr3[0];
                i6++;
            }
            f6 = 180.0f;
            Path path3 = gb2Var4.h;
            if (path3 == null) {
                gb2Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e * f4, fArr[1] - fArr[0]);
            float f14 = ((1.0f - e) * max * (gb2Var4.k ? f5 : 1.0f)) + fArr[0];
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
            Path path4 = gb2Var4.h;
            int centerX = rect3.centerX();
            int i8 = rect3.top;
            u2c.d(path4, centerX, i8, rect3.right - gb2Var4.D, i8, f18, f19, 0.0f, gb2Var4.F);
            u2c.b(gb2Var4.h, rect3.right, rect3.top, gb2Var4.E, 1, f18, f19, gb2Var4.F, gb2Var4.G);
            Path path5 = gb2Var4.h;
            int i9 = rect3.right;
            int i10 = rect3.top;
            int i11 = gb2Var4.D;
            int i12 = i10 + i11;
            int i13 = rect3.bottom - i11;
            float f20 = gb2Var4.G;
            u2c.d(path5, i9, i12, i9, i13, f18, f19, f20, 180.0f - f20);
            u2c.b(gb2Var4.h, rect3.right, rect3.bottom, gb2Var4.E, 2, f18, f19, 180.0f - gb2Var4.G, 180.0f - gb2Var4.F);
            Path path6 = gb2Var4.h;
            int i14 = rect3.right;
            int i15 = gb2Var4.D;
            int i16 = i14 - i15;
            int i17 = rect3.bottom;
            int i18 = rect3.left + i15;
            float f21 = gb2Var4.F;
            u2c.d(path6, i16, i17, i18, i17, f18, f19, 180.0f - f21, f21 + 180.0f);
            u2c.b(gb2Var4.h, rect3.left, rect3.bottom, gb2Var4.E, 3, f18, f19, gb2Var4.F + 180.0f, gb2Var4.G + 180.0f);
            Path path7 = gb2Var4.h;
            int i19 = rect3.left;
            int i20 = rect3.bottom;
            int i21 = gb2Var4.D;
            int i22 = i20 - i21;
            int i23 = rect3.top + i21;
            float f22 = gb2Var4.G;
            u2c.d(path7, i19, i22, i19, i23, f18, f19, f22 + 180.0f, 360.0f - f22);
            u2c.b(gb2Var4.h, rect3.left, rect3.top, gb2Var4.E, 4, f18, f19, 360.0f - gb2Var4.G, 360.0f - gb2Var4.F);
            u2c.d(gb2Var4.h, rect3.left + gb2Var4.D, rect3.top, rect3.centerX(), rect3.top, f18, f19, 360.0f - gb2Var4.F, 360.0f);
            gb2Var4.g.setStrokeWidth(hl.L(1.5f));
            int alpha6 = gb2Var4.g.getAlpha();
            gb2Var4.g.setAlpha((int) (alpha6 * f));
            canvas.drawPath(gb2Var4.h, gb2Var4.g);
            gb2Var4.g.setAlpha(alpha6);
            gb2Var4.r.invalidate();
        } else {
            f6 = 180.0f;
        }
        canvas.save();
        canvas.translate(hl.L(-13.0f) + rect3.centerX(), hl.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, hl.L(26.0f), hl.L(26.0f), jn7.d4, 31);
        if (gb2Var4.y) {
            b29Var4.setAlpha((int) (gb2Var4.m * f));
            b29Var4.draw(canvas);
        } else {
            b29Var3.setAlpha((int) (gb2Var4.o * f));
            b29Var3.draw(canvas);
        }
        float d = gb2Var4.j.d((!gb2Var4.i || gb2Var4.y || gb2Var4.k) ? false : true);
        if (d > f5) {
            canvas.save();
            canvas.translate(hl.L(18.0f), hl.L(f3));
            if (gb2Var4.H == null) {
                Paint paint4 = new Paint(1);
                gb2Var4.H = paint4;
                paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = hl.P;
            rectF2.set(f5, -hl.L(0.4f), hl.L(6.666f), hl.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, hl.L(2.0f), hl.L(2.0f), gb2Var4.H);
            Paint paint5 = gb2Var4.I;
            if (paint5 == null) {
                paint5 = new Paint(1);
                gb2Var4.I = paint5;
            }
            paint5.setColor(gb2Var4.c);
            int i24 = (int) (d * 255.0f);
            gb2Var4.I.setAlpha(i24);
            rectF2.set(0.0f, hl.L(3.33f), hl.L(6.666f), hl.L(8.33f));
            canvas.drawRoundRect(rectF2, hl.L(1.33f), hl.L(1.33f), gb2Var4.I);
            if (gb2Var4.L == null || Math.abs(gb2Var4.K - hl.p) > 0.1f) {
                gb2Var4.K = hl.p;
                Path path8 = new Path();
                gb2Var4.L = path8;
                path8.moveTo(hl.L(1.66f), hl.L(3.33f));
                gb2Var4.L.lineTo(hl.L(1.66f), hl.L(2.0f));
                rectF2.set(hl.L(1.66f), hl.L(0.33f), hl.L(4.99f), hl.L(3.6599998f));
                gb2Var4.L.arcTo(rectF2, -180.0f, f6, false);
                gb2Var4.L.lineTo(hl.L(5.0f), hl.L(3.33f));
            }
            if (gb2Var4.J == null) {
                Paint paint6 = new Paint(1);
                gb2Var4.J = paint6;
                paint6.setStyle(Paint.Style.STROKE);
            }
            gb2Var4.J.setStrokeWidth(hl.L(1.0f));
            gb2Var4.J.setColor(gb2Var4.c);
            gb2Var4.J.setAlpha(i24);
            canvas.drawPath(gb2Var4.L, gb2Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i, float f) {
        canvas.save();
        int L = hl.L(44.0f);
        wb2 wb2Var = this.a;
        canvas.translate(i, wb2Var.getMediaOffsetY() + L + wb2Var.gb + f);
        wb2Var.L4.draw(canvas);
        canvas.restore();
        r47 r47Var = wb2Var.Q5;
        if (r47Var.D == 0 || !r47Var.k.media_unread) {
            return;
        }
        aob.S1.setColor(aob.v0(r47Var.O3() ? aob.tc : aob.re, wb2Var.cc));
        canvas.drawCircle(hl.L(6.0f) + i + wb2Var.N4, wb2Var.getMediaOffsetY() + hl.L(51.0f) + wb2Var.gb, hl.L(3.0f), aob.S1);
    }

    public final void d(r47 r47Var, boolean z) {
        j47 j47Var;
        int L;
        m47 m47Var;
        wb2 wb2Var = this.a;
        x49 x49Var = wb2Var.O;
        int i = 0;
        wb2Var.E9 = (wb2Var.u6 || r47Var.k.fwd_from == null) ? false : true;
        wb2Var.v9 = (wb2Var.h6 && !r47Var.O3() && (r47Var.P1() < 0 || r47Var.P1() == 2666000)) || (((r47Var.o3() && r47Var.z4()) || (r47Var.y3() && r47Var.k.fwd_from.from_id == null)) && ((j47Var = wb2Var.M) == null || (j47Var.l & 4) != 0));
        if (hl.O1()) {
            int P0 = hl.P0();
            if (wb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = P0 - hl.L(i + 50);
            wb2Var.b7 = Math.min(hl.L(270.0f), L);
        } else {
            int parentWidth = wb2Var.getParentWidth();
            if (wb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = parentWidth - hl.L(i + 50);
            wb2Var.b7 = Math.min(hl.L(270.0f), L);
        }
        if (wb2Var.M != null) {
            wb2Var.b7 = L;
        }
        int w0 = wb2Var.w0(L, r47Var);
        wb2Var.setMessageObjectInternal(r47Var);
        wb2Var.v0 = hl.L(82.0f) + wb2Var.gb;
        if (hl.L(76.0f) + w0 >= (wb2Var.b7 - wb2Var.M9) - hl.L(12.0f)) {
            wb2Var.v0 = hl.L(14.0f) + wb2Var.v0;
        }
        if (wb2Var.M != null && (m47Var = wb2Var.L) != null && m47Var.d.size() > 1) {
            if ((wb2Var.M.l & 4) == 0) {
                wb2Var.v0 -= hl.L(6.0f);
                wb2Var.X1 -= hl.L(6.0f);
            }
            if ((wb2Var.M.l & 8) == 0) {
                wb2Var.v0 -= hl.L(6.0f);
            }
        }
        if (wb2Var.J) {
            wb2Var.gb -= hl.L(1.0f);
        }
        x49Var.getClass();
        x49Var.o(L - hl.L(24.0f), 3);
        if (x49Var.p) {
            return;
        }
        x49Var.n = hl.L(12.0f) + x49Var.m;
        wb2Var.Z2(r47Var);
        int i2 = x49Var.o;
        if (i2 > wb2Var.b7) {
            wb2Var.b7 = i2;
        }
        if (hl.L(24.0f) + x49Var.r + wb2Var.M9 > wb2Var.b7) {
            x49Var.n = hl.L(12.0f) + x49Var.n;
            x49Var.k -= hl.L(12.0f);
        }
        if (!r47Var.G0 && r47Var.z != null) {
            x49Var.k = hl.L(14.0f) + x49Var.k;
        }
        wb2Var.v0 += x49Var.n;
    }

    public final void e(r47 r47Var, boolean z) {
        int min;
        wb2 wb2Var = this.a;
        x49 x49Var = wb2Var.O;
        boolean z2 = true;
        wb2Var.E9 = !wb2Var.u6;
        int i = 0;
        if ((!wb2Var.h6 || r47Var.O3() || (r47Var.P1() >= 0 && r47Var.P1() != 2666000)) && ((!r47Var.o3() || !r47Var.z4()) && ((!r47Var.y3() || r47Var.k.fwd_from.from_id != null) && (!wb2Var.Y6 || r47Var.O3() || (!wb2Var.l6 && (!wb2Var.m6 || !wb2Var.W6)))))) {
            z2 = false;
        }
        wb2Var.v9 = z2;
        if (hl.O1()) {
            int P0 = hl.P0();
            if (wb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(P0 - hl.L(i + 50), hl.L(270.0f));
            wb2Var.b7 = min;
        } else {
            int parentWidth = wb2Var.getParentWidth();
            if (wb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(parentWidth - hl.L(i + 50), hl.L(270.0f));
            wb2Var.b7 = min;
        }
        wb2Var.w0(min, r47Var);
        wb2Var.setMessageObjectInternal(r47Var);
        int L = hl.L(70.0f);
        int i2 = wb2Var.gb;
        wb2Var.v0 = L + i2;
        if (wb2Var.J) {
            wb2Var.gb = i2 - hl.L(1.0f);
        }
        x49Var.getClass();
        x49Var.o(min - hl.L(r47Var.O3() ? 32.0f : 24.0f), 3);
        if (x49Var.p) {
            return;
        }
        x49Var.n = x49Var.m;
        if (TextUtils.isEmpty(r47Var.z)) {
            x49Var.n = hl.L(12.0f) + x49Var.n;
        } else {
            x49Var.n = hl.L(8.0f) + x49Var.n;
        }
        int i3 = x49Var.o;
        if (i3 > wb2Var.b7) {
            wb2Var.b7 = i3;
        }
        int L2 = hl.L(6.0f) + wb2Var.M9;
        if (r47.a4(r47Var.k) && !r47Var.m4()) {
            L2 -= hl.L(3.0f);
        } else if (r47Var.O3()) {
            L2 += hl.L(20.5f);
        }
        int extraTimeX = wb2Var.getExtraTimeX() + L2;
        if (!wb2Var.y2() && x49Var.r + extraTimeX >= wb2Var.b7) {
            x49Var.n = hl.L(12.0f) + x49Var.n;
            x49Var.k -= hl.L(12.0f);
        }
        wb2Var.v0 += x49Var.n;
    }
}
