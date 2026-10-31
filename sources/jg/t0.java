package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class t0 extends View {
    public final Drawable D;
    public final Paint E;
    public boolean F;
    public qz0 G;
    public final Paint H;
    public boolean I;
    public qz0 J;
    public boolean K;
    public qz0 L;
    public boolean M;
    public final TextPaint N;
    public StaticLayout O;
    public float P;
    public float Q;
    public boolean R;
    public boolean S;
    public final ImageReceiver T;
    public boolean U;
    public int V;
    public s0 W;
    public int a;
    public float a0;
    public int b;
    public float b0;
    public boolean c;
    public float c0;
    public boolean d;
    public float d0;
    public final float e;
    public int e0;
    public final int f;
    public final RectF f0;
    public final RectF g0;
    public final int h;
    public final Path h0;
    public final Path i0;
    public final RectF j0;
    public final RectF k0;
    public final t5 l0;
    public final t5 m0;
    public float n;
    public final t5 n0;
    public final t5 o0;
    public final t5 p0;
    public final t5 q0;
    public final TextPaint r;
    public final t5 r0;
    public StaticLayout s;
    public final t5 s0;
    public float w;
    public float x;
    public final RectF y;

    public t0(Context context, float f7) {
        super(context);
        this.c = true;
        this.n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        this.y = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.E = new Paint(1);
        this.H = new Paint(1);
        this.N = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.T = imageReceiver;
        this.f0 = new RectF();
        this.g0 = new RectF();
        this.h0 = new Path();
        this.i0 = new Path();
        this.j0 = new RectF();
        this.k0 = new RectF();
        gr grVar = gr.h;
        this.l0 = new t5(this, 0L, 350L, grVar);
        this.m0 = new t5(this, 0L, 350L, grVar);
        this.n0 = new t5(this, 0L, 350L, grVar);
        this.o0 = new t5(this, 0L, 350L, grVar);
        this.p0 = new t5(this, 0L, 350L, grVar);
        this.q0 = new t5(this, 0L, 350L, grVar);
        this.r0 = new t5(this, 0L, 350L, grVar);
        this.s0 = new t5(this, 0L, 350L, grVar);
        this.e = f7;
        imageReceiver.J0 = true;
        this.f = (int) (f7 * 3.0f);
        this.h = (int) (f7 * 1.0f);
        this.D = i0.a.f(context, R.drawable.story_link);
        textPaint.setTextSize(24.0f * f7);
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        Path.Direction direction;
        float f13;
        float f14;
        float f15;
        float f16;
        float d;
        float f17;
        qz0 qz0Var;
        qz0 qz0Var2;
        Canvas canvas2 = canvas;
        d();
        float e = this.r0.e(false, this.a0);
        float e7 = this.s0.e(false, this.b0);
        float d10 = this.p0.d(this.V == 0);
        float d11 = this.o0.d(e());
        float f18 = this.e;
        float T1 = org.telegram.messenger.i0.T1(0.2f * e7, 16.66f * f18, d11);
        int i10 = this.f;
        int i11 = this.h;
        RectF rectF = this.f0;
        rectF.set(i10, i11, i10 + e, i11 + e7);
        int f19 = i0.b.f(d11, this.e0, i0.b.f(d10, -1, -14670807));
        Paint paint = this.E;
        paint.setColor(f19);
        Path path = this.i0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, T1, T1, direction2);
        canvas2.drawPath(path, paint);
        if (d11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i10, i11);
            float d12 = this.l0.d(this.F);
            float f20 = (7.33f * f18) + 0.0f;
            qz0 qz0Var3 = this.G;
            if (qz0Var3 == null || d12 <= 0.0f) {
                f11 = d12;
                f7 = 1.0f;
                f12 = d11;
                f10 = 2.0f;
                direction = direction2;
            } else {
                f10 = 2.0f;
                direction = direction2;
                f11 = d12;
                f7 = 1.0f;
                qz0Var3.c(f18 * 10.0f, sc.e.z(1.0f, d12, (15.0f * f18) + this.G.i(), (qz0Var3.i() / 2.0f) + f20), d11, -15033089, canvas2);
                f12 = d11;
                f20 = (((7.0f * f18) + this.G.i()) * f11) + f20;
            }
            float f21 = f20;
            float e10 = this.q0.e(false, this.c0);
            Paint paint2 = this.H;
            paint2.setAlpha(25);
            float f22 = e10 + f21;
            RectF rectF2 = this.g0;
            rectF2.set(f18 * 10.0f, f21, e - (f18 * 10.0f), f22);
            Path path2 = this.h0;
            path2.rewind();
            path2.addRoundRect(rectF2, f18 * 5.0f, f18 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(zs.e4);
            canvas2.drawRect(f18 * 10.0f, f21, 13.0f * f18, f22, paint2);
            canvas.restore();
            float f23 = (5.66f * f18) + f21;
            if (this.K) {
                qz0 qz0Var4 = this.L;
                if (qz0Var4 != null) {
                    float i12 = (qz0Var4.i() / f10) + f23;
                    int color = paint2.getColor();
                    f13 = e;
                    d11 = f12;
                    f15 = f11;
                    f16 = 2.66f;
                    qz0Var4.c(f18 * 20.0f, i12, d11, color, canvas);
                    f14 = sc.e.d(f18, 2.66f, this.L.i(), f23);
                    if (this.I || (qz0Var2 = this.J) == null) {
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        qz0Var2.c(f18 * 20.0f, (qz0Var2.i() / f10) + f14, d11, i0.b.f(d10, -13421773, -1), canvas2);
                        f14 = sc.e.d(f18, f16, this.J.i(), f14);
                    }
                    if (this.M && this.O != null) {
                        canvas2.save();
                        canvas2.translate((f18 * 20.0f) - this.Q, f14);
                        this.N.setColor(i0.b.f(d10, -13421773, -1));
                        this.N.setAlpha((int) (255.0f * d11));
                        this.O.draw(canvas2);
                        canvas2.restore();
                        f14 = sc.e.d(f18, f16, this.O.getHeight(), f14);
                    }
                    d = this.m0.d(this.R);
                    if (d > 0.0f) {
                        float d13 = this.n0.d(this.S);
                        this.j0.set(f18 * 20.0f, (f18 * f16) + f14, f13 - (20.0f * f18), (f18 * f16) + f14 + this.d0);
                        this.k0.set(((f13 - (f18 * 10.0f)) - (f18 * 6.0f)) - (48.0f * f18), (f18 * 6.0f) + f21, (f13 - (f18 * 10.0f)) - (f18 * 6.0f), (48.0f * f18) + (6.0f * f18) + f21);
                        org.telegram.messenger.i0.Z1(this.j0, this.k0, d13, rectF2);
                        float f24 = rectF2.left;
                        float f25 = rectF2.top;
                        float width = rectF2.width();
                        float height = rectF2.height();
                        ImageReceiver imageReceiver = this.T;
                        imageReceiver.y0(f24, f25, width, height);
                        imageReceiver.setAlpha(d * d11);
                        imageReceiver.h(canvas2, null);
                        f14 = z20.b(f18 * f16, this.d0, f7 - d13, f14);
                    }
                    f17 = (5.0f * f18) + (7.0f * f18) + f14;
                    qz0Var = this.G;
                    if (qz0Var != null && f7 - f15 > 0.0f) {
                        qz0Var.c(f18 * 10.0f, (qz0Var.i() / f10) + f17 + (((15.0f * f18) + this.G.i()) * f15), d11, -15033089, canvas2);
                        this.G.i();
                    }
                    canvas2.restore();
                } else {
                    f13 = e;
                    f14 = f23;
                }
            } else {
                f13 = e;
                f14 = f23;
            }
            d11 = f12;
            f15 = f11;
            f16 = 2.66f;
            if (this.I) {
            }
            canvas2 = canvas;
            if (this.M) {
                canvas2.save();
                canvas2.translate((f18 * 20.0f) - this.Q, f14);
                this.N.setColor(i0.b.f(d10, -13421773, -1));
                this.N.setAlpha((int) (255.0f * d11));
                this.O.draw(canvas2);
                canvas2.restore();
                f14 = sc.e.d(f18, f16, this.O.getHeight(), f14);
            }
            d = this.m0.d(this.R);
            if (d > 0.0f) {
            }
            f17 = (5.0f * f18) + (7.0f * f18) + f14;
            qz0Var = this.G;
            if (qz0Var != null) {
                qz0Var.c(f18 * 10.0f, (qz0Var.i() / f10) + f17 + (((15.0f * f18) + this.G.i()) * f15), d11, -15033089, canvas2);
                this.G.i();
            }
            canvas2.restore();
        } else {
            f7 = 1.0f;
            f10 = 2.0f;
        }
        if (d11 < f7) {
            float f26 = this.y.left;
            float f27 = f10;
            int x10 = ((int) c3.i0.x(f18, 30.0f, e7, f27)) + i11;
            Drawable drawable = this.D;
            drawable.setBounds(((int) (f26 * f18)) + i10, ((int) c3.i0.g(f18, 30.0f, e7, f27)) + i11, ((int) ((f26 + 30.0f) * f18)) + i10, x10);
            int i13 = (int) ((f7 - d11) * 255.0f);
            drawable.setAlpha(i13);
            drawable.draw(canvas2);
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(((this.y.left + 30.0f + 3.25f) * f18) + i10, (e7 / 2.0f) + i11);
                float f28 = this.n;
                canvas2.scale(f28, f28);
                canvas2.translate(-this.x, (-this.s.getHeight()) / 2.0f);
                this.r.setAlpha(i13);
                this.s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i10, s0 s0Var, boolean z10) {
        this.a = i10;
        if (this.W != s0Var || z10) {
            this.W = s0Var;
            this.c = true;
            this.d = z10;
            requestLayout();
        }
    }

    public final void c(int i10, int i11) {
        Drawable drawable = this.D;
        TextPaint textPaint = this.r;
        if (i10 == 0) {
            this.e0 = i11;
            int i12 = org.telegram.messenger.i0.B(i11) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.e0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.e0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.e0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        int f7;
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        float f12;
        if (!this.c || this.W == null) {
            return;
        }
        boolean e = e();
        int i13 = this.f;
        float f13 = this.e;
        if (e) {
            String str2 = TextUtils.isEmpty(this.W.b) ? this.W.c : this.W.b;
            TLRPC.WebPage webPage = this.W.d;
            float f14 = (this.b - i13) - i13;
            this.b0 = 0.0f;
            this.a0 = 0.0f;
            this.c0 = 0.0f;
            int e7 = h20.e(d20.i(this.a).f());
            lp lpVar = vp.r1(this.a).r4;
            kp d = (lpVar == null || e7 < 7) ? null : lpVar.d(e7);
            if (d == null) {
                int[] iArr = t6.r8;
                f7 = t6.x0(null, iArr[e7 % iArr.length], false);
            } else {
                f7 = d.f();
            }
            this.H.setColor(f7);
            this.b0 = (7.33f * f13) + this.b0;
            this.F = this.W.f;
            qz0 qz0Var = new qz0(str2, 16.0f, null);
            qz0Var.a.setTextSize(16.0f * f13);
            float f15 = 20.0f * f13;
            qz0Var.p(f14 - f15);
            this.G = qz0Var;
            this.a0 = Math.max(this.a0, Math.min(f15 + qz0Var.c, f14));
            float f16 = 7.0f * f13;
            this.b0 = this.G.i() + this.b0 + f16;
            this.R = webPage.photo != null || jj.K4(webPage.document);
            s0 s0Var = this.W;
            boolean z10 = s0Var.e;
            this.S = !z10;
            int i14 = (!this.U || (s0Var.a & 4) == 0) ? 2 * ((int) (!z10 ? 48.0f : (f14 / f13) - 40.0f)) : s0Var.i;
            ImageReceiver imageReceiver = this.T;
            imageReceiver.J0((int) (4.0f * f13));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize w9 = b8.w(photo.sizes, 1, false, null, false);
                f10 = 48.0f;
                TLRPC.PhotoSize w10 = b8.w(webPage.photo.sizes, (int) (i14 * f13), false, w9, false);
                if (w10 != null) {
                    i11 = w10.w;
                    i10 = w10.h;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                imageReceiver.r0(ic.i(w10, webPage.photo), a1.g.i(i14, i14, "_"), this.U ? null : ic.i(w9, webPage.photo), this.U ? null : a1.g.i(i14, i14, "_"), null, 0L, null, null, 0);
            } else {
                f10 = 48.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize w11 = b8.w(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize w12 = b8.w(webPage.document.thumbs, (int) (i14 * f13), false, w11, false);
                    if (w12 != null) {
                        i11 = w12.w;
                        i10 = w12.h;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    imageReceiver.r0(ic.c(w12, webPage.document), a1.g.i(i14, i14, "_"), this.U ? null : ic.c(w11, webPage.document), this.U ? null : a1.g.i(i14, i14, "_"), null, 0L, null, null, 0);
                } else {
                    i10 = 0;
                    i11 = 0;
                }
            }
            this.c0 = (5.66f * f13) + this.c0;
            boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
            this.K = !isEmpty;
            if (isEmpty) {
                i12 = 0;
            } else {
                qz0 qz0Var2 = new qz0(webPage.site_name, 14.0f, org.telegram.messenger.i0.o());
                qz0Var2.a.setTextSize(f13 * 14.0f);
                float f17 = f13 * 40.0f;
                qz0Var2.p((int) Math.ceil((f14 - f17) - ((this.R && this.S) ? f13 * 60.0f : 0.0f)));
                this.L = qz0Var2;
                this.a0 = Math.max(this.a0, Math.min(f17 + qz0Var2.c + ((this.R && this.S) ? f13 * 60.0f : 0.0f), f14));
                this.c0 = (f13 * 2.66f) + this.L.i() + this.c0;
                i12 = this.L.b.getLineCount();
            }
            boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
            this.I = !isEmpty2;
            if (isEmpty2) {
                f11 = 2.66f;
                f12 = f13;
            } else {
                qz0 qz0Var3 = new qz0(webPage.title, 14.0f, org.telegram.messenger.i0.o());
                qz0Var3.a.setTextSize(f13 * 14.0f);
                float f18 = f13 * 40.0f;
                f11 = 2.66f;
                f12 = f13;
                qz0Var3.p((int) Math.ceil((f14 - f18) - ((this.R && this.S) ? f13 * 60.0f : 0.0f)));
                this.J = qz0Var3;
                this.a0 = Math.max(this.a0, Math.min(f18 + qz0Var3.c + ((this.R && this.S) ? 60.0f * f12 : 0.0f), f14));
                this.c0 = (f12 * 2.66f) + this.J.i() + this.c0;
                i12 += this.J.b.getLineCount();
            }
            boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
            this.M = !isEmpty3;
            if (!isEmpty3) {
                TextPaint textPaint = this.N;
                textPaint.setTextSize(f12 * 14.0f);
                float f19 = f12 * 40.0f;
                int i15 = 3 - i12;
                this.O = org.telegram.ui.Cells.q1.F1(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f14 - f19)), (int) Math.ceil(Math.max(1.0f, f14 - ((40 + ((this.R && this.S) ? 60 : 0)) * f12))), i15, 4);
                this.P = 0.0f;
                this.Q = Float.MAX_VALUE;
                int i16 = 0;
                while (i16 < this.O.getLineCount()) {
                    this.P = Math.max(this.P, this.O.getLineWidth(i16) + (this.R && this.S && i16 < i15 ? f12 * f10 : 0.0f));
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i16));
                    i16++;
                }
                this.a0 = Math.max(this.a0, Math.min(f19 + this.P, f14));
                this.c0 = (f12 * f11) + this.c0 + this.O.getHeight();
            }
            if (this.R && !this.S) {
                if (i11 <= 0 || i10 <= 0) {
                    this.d0 = f12 * 120.0f;
                } else {
                    this.d0 = Math.min((Math.max(0.0f, this.a0 - (f12 * 40.0f)) / i11) * i10, f12 * 200.0f);
                }
                this.c0 = (f12 * f11) + this.c0 + this.d0;
            }
            float f20 = f16 + this.c0;
            this.c0 = f20;
            this.b0 = (f12 * 11.0f) + this.b0 + f20;
        } else {
            if (TextUtils.isEmpty(this.W.b)) {
                String str3 = this.W.c;
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
                str = str3.toUpperCase();
            } else {
                str = this.W.b;
            }
            float f21 = (this.b - i13) - i13;
            RectF rectF = this.y;
            float f22 = f21 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f13);
            this.n = 1.0f;
            double d10 = f22;
            float ceil = (int) Math.ceil(d10);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            TextPaint textPaint2 = this.r;
            this.s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, ceil, truncateAt), textPaint2, (int) Math.ceil(d10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.w = 0.0f;
            this.x = Float.MAX_VALUE;
            for (int i17 = 0; i17 < this.s.getLineCount(); i17++) {
                this.w = Math.max(this.w, this.s.getLineWidth(i17));
                this.x = Math.min(this.x, this.s.getLineLeft(i17));
            }
            if (this.s.getLineCount() > 2) {
                this.n = 0.3f;
            } else {
                this.n = Math.min(1.0f, f22 / this.w);
            }
            this.a0 = (this.w * this.n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f13);
            this.b0 = Math.max(f13 * 30.0f, this.s.getHeight() * this.n) + ((rectF.top + rectF.bottom) * f13);
        }
        if (this.d) {
            invalidate();
        } else {
            this.l0.f(this.F, true);
            this.n0.f(this.S, true);
            this.m0.f(this.R, true);
            this.q0.e(true, this.c0);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        s0 s0Var = this.W;
        return (s0Var == null || s0Var.d == null) ? false : true;
    }

    public int getPhotoSide() {
        float f7;
        if (this.S) {
            f7 = 48.0f;
        } else {
            int i10 = this.b;
            int i11 = this.f;
            f7 = (((i10 - i11) - i11) / this.e) - 40.0f;
        }
        return ((int) f7) * 2;
    }

    public int getPreviewType() {
        return this.V;
    }

    public float getRadius() {
        float f7;
        float f10;
        if (e()) {
            f7 = 16.66f;
            f10 = this.e;
        } else {
            f7 = 0.2f;
            f10 = this.b0;
        }
        return f10 * f7;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        d();
        int ceil = (int) Math.ceil(this.a0);
        int i12 = this.f;
        int i13 = ceil + i12 + i12;
        int ceil2 = (int) Math.ceil(this.b0);
        int i14 = this.h;
        setMeasuredDimension(i13, ceil2 + i14 + i14);
    }

    public void setMaxWidth(int i10) {
        this.b = i10;
        this.c = true;
    }

    public void setPreviewType(int i10) {
        this.V = i10;
        invalidate();
    }
}
