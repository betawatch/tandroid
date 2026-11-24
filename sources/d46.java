// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class d46 extends View {
    public final Drawable E;
    public final Paint F;
    public boolean G;
    public tgb H;
    public final Paint I;
    public boolean J;
    public tgb K;
    public boolean L;
    public tgb M;
    public boolean N;
    public final TextPaint O;
    public StaticLayout P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public final ImageReceiver U;
    public boolean V;
    public int W;
    public int a;
    public c46 a0;
    public int b;
    public float b0;
    public boolean c;
    public float c0;
    public boolean d;
    public float d0;
    public final float e;
    public float e0;
    public final int f;
    public int f0;
    public final RectF g0;
    public final int h;
    public final RectF h0;
    public final Path i0;
    public final Path j0;
    public final RectF k0;
    public final RectF l0;
    public final lm m0;
    public float n;
    public final lm n0;
    public final lm o0;
    public final lm p0;
    public final lm q0;
    public final TextPaint r;
    public final lm r0;
    public StaticLayout s;
    public final lm s0;
    public final lm t0;
    public float w;
    public float x;
    public final RectF y;

    public d46(Context context, float f) {
        super(context);
        this.c = true;
        this.n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        this.y = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.F = new Paint(1);
        this.I = new Paint(1);
        this.O = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U = imageReceiver;
        this.g0 = new RectF();
        this.h0 = new RectF();
        this.i0 = new Path();
        this.j0 = new Path();
        this.k0 = new RectF();
        this.l0 = new RectF();
        s33 s33Var = s33.h;
        this.m0 = new lm(this, 0L, 350L, s33Var);
        this.n0 = new lm(this, 0L, 350L, s33Var);
        this.o0 = new lm(this, 0L, 350L, s33Var);
        this.p0 = new lm(this, 0L, 350L, s33Var);
        this.q0 = new lm(this, 0L, 350L, s33Var);
        this.r0 = new lm(this, 0L, 350L, s33Var);
        this.s0 = new lm(this, 0L, 350L, s33Var);
        this.t0 = new lm(this, 0L, 350L, s33Var);
        this.e = f;
        imageReceiver.K0 = true;
        this.f = (int) (f * 3.0f);
        this.h = (int) (f * 1.0f);
        this.E = b00.d(context, R.drawable.story_link);
        textPaint.setTextSize(24.0f * f);
        textPaint.setTypeface(gl.n1("fonts/rcondensedbold.ttf"));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f;
        int i;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float d;
        float f12;
        tgb tgbVar;
        tgb tgbVar2;
        Canvas canvas2 = canvas;
        d();
        float e = this.s0.e(false, this.b0);
        float e2 = this.t0.e(false, this.c0);
        float d2 = this.q0.d(this.W == 0);
        float d3 = this.p0.d(e());
        float f13 = this.e;
        float R1 = gl.R1(0.2f * e2, 16.66f * f13, d3);
        int i3 = this.f;
        float f14 = i3;
        int i4 = this.h;
        float f15 = i4;
        RectF rectF = this.g0;
        rectF.set(f14, f15, f14 + e, f15 + e2);
        int f16 = bm2.f(d3, this.f0, bm2.f(d2, -1, -14670807));
        Paint paint = this.F;
        paint.setColor(f16);
        Path path = this.j0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, R1, R1, direction);
        canvas2.drawPath(path, paint);
        if (d3 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(f14, f15);
            float d4 = this.m0.d(this.G);
            float f17 = (7.33f * f13) + 0.0f;
            tgb tgbVar3 = this.H;
            if (tgbVar3 == null || d4 <= 0.0f) {
                f4 = d3;
                f5 = e;
                f = e2;
                i = i3;
                f3 = 1.0f;
                f6 = d4;
                f7 = f17;
            } else {
                f6 = d4;
                f = e2;
                f5 = e;
                i = i3;
                f3 = 1.0f;
                tgbVar3.c(f13 * 10.0f, ls6.B(1.0f, d4, (f13 * 15.0f) + this.H.h(), (tgbVar3.h() / 2.0f) + f17), d3, -15033089, canvas2);
                f4 = d3;
                f7 = oo1.g(f13, 7.0f, this.H.h(), f6, f17);
            }
            float e3 = this.r0.e(false, this.d0);
            Paint paint2 = this.I;
            paint2.setAlpha(25);
            float f18 = f13 * 10.0f;
            float f19 = f5 - f18;
            float f20 = f7 + e3;
            RectF rectF2 = this.h0;
            rectF2.set(f18, f7, f19, f20);
            Path path2 = this.i0;
            path2.rewind();
            float f21 = f13 * 5.0f;
            path2.addRoundRect(rectF2, f21, f21, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(kk7.d4);
            canvas2.drawRect(f18, f7, 13.0f * f13, f20, paint2);
            float f22 = f7;
            canvas.restore();
            float f23 = (5.66f * f13) + f22;
            if (this.L) {
                tgb tgbVar4 = this.M;
                if (tgbVar4 != null) {
                    float h = (tgbVar4.h() / 2.0f) + f23;
                    int color = paint2.getColor();
                    f8 = f22;
                    f10 = f4;
                    f2 = f14;
                    f11 = 2.66f;
                    tgbVar4.c(f13 * 20.0f, h, f10, color, canvas);
                    f9 = ir2.i(f13, 2.66f, this.M.h(), f23);
                    if (this.J || (tgbVar2 = this.K) == null) {
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        tgbVar2.c(f13 * 20.0f, (tgbVar2.h() / 2.0f) + f9, f10, bm2.f(d2, -13421773, -1), canvas2);
                        f9 = ir2.i(f13, f11, this.K.h(), f9);
                    }
                    if (this.N && this.P != null) {
                        canvas2.save();
                        canvas2.translate((f13 * 20.0f) - this.R, f9);
                        int f24 = bm2.f(d2, -13421773, -1);
                        TextPaint textPaint = this.O;
                        textPaint.setColor(f24);
                        textPaint.setAlpha((int) (f10 * 255.0f));
                        this.P.draw(canvas2);
                        canvas2.restore();
                        f9 = ir2.i(f13, f11, this.P.getHeight(), f9);
                    }
                    d = this.n0.d(this.S);
                    if (d <= 0.0f) {
                        float d5 = this.o0.d(this.T);
                        float f25 = f13 * 20.0f;
                        float f26 = f13 * f11;
                        float f27 = f26 + f9;
                        float f28 = f5 - f25;
                        float f29 = this.e0 + f27;
                        f12 = f10;
                        RectF rectF3 = this.k0;
                        rectF3.set(f25, f27, f28, f29);
                        float f30 = 6.0f * f13;
                        float f31 = f19 - f30;
                        float f32 = 48.0f * f13;
                        float f33 = f30 + f8;
                        i2 = i4;
                        RectF rectF4 = this.l0;
                        rectF4.set(f31 - f32, f33, f31, f32 + f33);
                        gl.X1(rectF3, rectF4, d5, rectF2);
                        float f34 = rectF2.left;
                        float f35 = rectF2.top;
                        float width = rectF2.width();
                        float height = rectF2.height();
                        ImageReceiver imageReceiver = this.U;
                        imageReceiver.i0(f34, f35, width, height);
                        imageReceiver.setAlpha(d * f12);
                        imageReceiver.h(canvas2, null);
                        f9 = de9.v(f26, this.e0, f3 - d5, f9);
                    } else {
                        f12 = f10;
                        i2 = i4;
                    }
                    float i5 = ir2.i(f13, 7.0f, f9, f21);
                    tgbVar = this.H;
                    if (tgbVar != null || f3 - f6 <= 0.0f) {
                        d3 = f12;
                    } else {
                        d3 = f12;
                        tgbVar.c(f18, oo1.g(f13, 15.0f, this.H.h(), f6, (tgbVar.h() / 2.0f) + i5), d3, -15033089, canvas2);
                        this.H.h();
                    }
                    canvas2.restore();
                } else {
                    f8 = f22;
                    f9 = f23;
                }
            } else {
                f8 = f22;
                f9 = f23;
            }
            f10 = f4;
            f2 = f14;
            f11 = 2.66f;
            if (this.J) {
            }
            canvas2 = canvas;
            if (this.N) {
                canvas2.save();
                canvas2.translate((f13 * 20.0f) - this.R, f9);
                int f242 = bm2.f(d2, -13421773, -1);
                TextPaint textPaint2 = this.O;
                textPaint2.setColor(f242);
                textPaint2.setAlpha((int) (f10 * 255.0f));
                this.P.draw(canvas2);
                canvas2.restore();
                f9 = ir2.i(f13, f11, this.P.getHeight(), f9);
            }
            d = this.n0.d(this.S);
            if (d <= 0.0f) {
            }
            float i52 = ir2.i(f13, 7.0f, f9, f21);
            tgbVar = this.H;
            if (tgbVar != null) {
            }
            d3 = f12;
            canvas2.restore();
        } else {
            f = e2;
            i = i3;
            f2 = f14;
            i2 = i4;
            f3 = 1.0f;
        }
        if (d3 < f3) {
            RectF rectF5 = this.y;
            float f36 = rectF5.left;
            float f37 = f13 * 30.0f;
            Drawable drawable = this.E;
            drawable.setBounds(i + ((int) (f36 * f13)), i2 + ((int) ((f - f37) / 2.0f)), i + ((int) ((f36 + 30.0f) * f13)), i2 + ((int) ((f37 + f) / 2.0f)));
            int i6 = (int) ((f3 - d3) * 255.0f);
            drawable.setAlpha(i6);
            drawable.draw(canvas2);
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(((rectF5.left + 30.0f + 3.25f) * f13) + f2, (f / 2.0f) + f15);
                float f38 = this.n;
                canvas2.scale(f38, f38);
                canvas2.translate(-this.x, (-this.s.getHeight()) / 2.0f);
                this.r.setAlpha(i6);
                this.s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i, c46 c46Var, boolean z) {
        this.a = i;
        if (this.a0 != c46Var || z) {
            this.a0 = c46Var;
            this.c = true;
            this.d = z;
            requestLayout();
        }
    }

    public final void c(int i, int i2) {
        Drawable drawable = this.E;
        TextPaint textPaint = this.r;
        if (i == 0) {
            this.f0 = i2;
            int i3 = gl.B(i2) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i3);
            drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        } else if (i == 1) {
            this.f0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i == 2) {
            this.f0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        float min;
        int f;
        float f2;
        int i;
        int i2;
        int i3;
        float f3;
        float f4;
        float f5;
        if (!this.c || this.a0 == null) {
            return;
        }
        boolean e = e();
        c46 c46Var = this.a0;
        int i4 = this.f;
        float f6 = this.e;
        if (e) {
            boolean isEmpty = TextUtils.isEmpty(c46Var.b);
            c46 c46Var2 = this.a0;
            String str2 = isEmpty ? c46Var2.c : c46Var2.b;
            TLRPC.WebPage webPage = c46Var2.d;
            float f7 = (this.b - i4) - i4;
            this.c0 = 0.0f;
            this.b0 = 0.0f;
            this.d0 = 0.0f;
            int f8 = l7c.f(y6c.h(this.a).f());
            ea7 ea7Var = na7.q1(this.a).E3;
            da7 d = (ea7Var == null || f8 < 7) ? null : ea7Var.d(f8);
            if (d == null) {
                int[] iArr = bkb.q8;
                f = bkb.w0(null, iArr[f8 % iArr.length], false);
            } else {
                f = d.f();
            }
            this.I.setColor(f);
            this.c0 = (7.33f * f6) + this.c0;
            this.G = this.a0.f;
            tgb tgbVar = new tgb(str2, 16.0f, null);
            tgbVar.a.setTextSize(16.0f * f6);
            float f9 = 20.0f * f6;
            tgbVar.o(f7 - f9);
            this.H = tgbVar;
            this.b0 = Math.max(this.b0, Math.min(f9 + tgbVar.c, f7));
            float f10 = 7.0f * f6;
            this.c0 = this.H.h() + this.c0 + f10;
            this.S = webPage.photo != null || k27.J4(webPage.document);
            c46 c46Var3 = this.a0;
            boolean z = c46Var3.e;
            this.T = !z;
            int i5 = (!this.V || (c46Var3.a & 4) == 0) ? ((int) (!z ? 48.0f : (f7 / f6) - 40.0f)) << 1 : c46Var3.i;
            ImageReceiver imageReceiver = this.U;
            imageReceiver.q0((int) (4.0f * f6));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize w = ba4.w(photo.sizes, 1, false, null, false);
                f2 = 40.0f;
                TLRPC.PhotoSize w2 = ba4.w(webPage.photo.sizes, (int) (i5 * f6), false, w, false);
                if (w2 != null) {
                    i2 = w2.w;
                    i = w2.h;
                } else {
                    i = 0;
                    i2 = 0;
                }
                imageReceiver.Z(gl5.i(w2, webPage.photo), tb4.m(i5, i5, "_"), this.V ? null : gl5.i(w, webPage.photo), this.V ? null : tb4.m(i5, i5, "_"), null, 0L, null, null, 0);
            } else {
                f2 = 40.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize w3 = ba4.w(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize w4 = ba4.w(webPage.document.thumbs, (int) (i5 * f6), false, w3, false);
                    if (w4 != null) {
                        i2 = w4.w;
                        i = w4.h;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    imageReceiver.Z(gl5.c(w4, webPage.document), tb4.m(i5, i5, "_"), this.V ? null : gl5.c(w3, webPage.document), this.V ? null : tb4.m(i5, i5, "_"), null, 0L, null, null, 0);
                } else {
                    i = 0;
                    i2 = 0;
                }
            }
            this.d0 = (5.66f * f6) + this.d0;
            boolean isEmpty2 = TextUtils.isEmpty(webPage.site_name);
            this.L = !isEmpty2;
            if (isEmpty2) {
                i3 = 0;
            } else {
                tgb tgbVar2 = new tgb(webPage.site_name, 14.0f, gl.o());
                tgbVar2.a.setTextSize(f6 * 14.0f);
                float f11 = f6 * f2;
                tgbVar2.o((int) Math.ceil((f7 - f11) - ((this.S && this.T) ? f6 * 60.0f : 0.0f)));
                this.M = tgbVar2;
                this.b0 = Math.max(this.b0, Math.min(f11 + tgbVar2.c + ((this.S && this.T) ? f6 * 60.0f : 0.0f), f7));
                this.d0 = (f6 * 2.66f) + this.M.h() + this.d0;
                i3 = this.M.b.getLineCount();
            }
            boolean isEmpty3 = TextUtils.isEmpty(webPage.title);
            this.J = !isEmpty3;
            if (isEmpty3) {
                f3 = 2.66f;
                f4 = 14.0f;
            } else {
                tgb tgbVar3 = new tgb(webPage.title, 14.0f, gl.o());
                tgbVar3.a.setTextSize(f6 * 14.0f);
                float f12 = f6 * f2;
                f3 = 2.66f;
                f4 = 14.0f;
                tgbVar3.o((int) Math.ceil((f7 - f12) - ((this.S && this.T) ? f6 * 60.0f : 0.0f)));
                this.K = tgbVar3;
                this.b0 = Math.max(this.b0, Math.min(f12 + tgbVar3.c + ((this.S && this.T) ? 60.0f * f6 : 0.0f), f7));
                this.d0 = (f6 * 2.66f) + this.K.h() + this.d0;
                i3 += this.K.b.getLineCount();
            }
            boolean isEmpty4 = TextUtils.isEmpty(webPage.description);
            this.N = !isEmpty4;
            if (!isEmpty4) {
                TextPaint textPaint = this.O;
                textPaint.setTextSize(f6 * f4);
                float f13 = f6 * f2;
                int i6 = 3 - i3;
                this.P = gb2.K1(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f7 - f13)), (int) Math.ceil(Math.max(1.0f, f7 - ((40 + ((this.S && this.T) ? 60 : 0)) * f6))), i6, 4);
                this.Q = 0.0f;
                this.R = Float.MAX_VALUE;
                int i7 = 0;
                while (i7 < this.P.getLineCount()) {
                    this.Q = Math.max(this.Q, this.P.getLineWidth(i7) + (this.S && this.T && i7 < i6 ? f6 * 48.0f : 0.0f));
                    this.R = Math.min(this.R, this.P.getLineLeft(i7));
                    i7++;
                }
                this.b0 = Math.max(this.b0, Math.min(f13 + this.Q, f7));
                this.d0 = (f6 * f3) + this.d0 + this.P.getHeight();
            }
            if (this.S && !this.T) {
                if (i2 <= 0 || i <= 0) {
                    f5 = 120.0f * f6;
                    this.e0 = f5;
                } else {
                    f5 = Math.min((Math.max(0.0f, this.b0 - (f6 * f2)) / i2) * i, 200.0f * f6);
                    this.e0 = f5;
                }
                this.d0 = (f6 * f3) + this.d0 + f5;
            }
            float f14 = f10 + this.d0;
            this.d0 = f14;
            this.c0 = (f6 * 11.0f) + this.c0 + f14;
        } else {
            boolean isEmpty5 = TextUtils.isEmpty(c46Var.b);
            c46 c46Var4 = this.a0;
            if (isEmpty5) {
                String str3 = c46Var4.c;
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
                str = str3.toUpperCase();
            } else {
                str = c46Var4.b;
            }
            float f15 = (this.b - i4) - i4;
            RectF rectF = this.y;
            float f16 = f15 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f6);
            this.n = 1.0f;
            double d2 = f16;
            float ceil = (int) Math.ceil(d2);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            TextPaint textPaint2 = this.r;
            this.s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, ceil, truncateAt), textPaint2, (int) Math.ceil(d2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.w = 0.0f;
            this.x = Float.MAX_VALUE;
            for (int i8 = 0; i8 < this.s.getLineCount(); i8++) {
                this.w = Math.max(this.w, this.s.getLineWidth(i8));
                this.x = Math.min(this.x, this.s.getLineLeft(i8));
            }
            if (this.s.getLineCount() > 2) {
                min = 0.3f;
                this.n = 0.3f;
            } else {
                min = Math.min(1.0f, f16 / this.w);
                this.n = min;
            }
            this.b0 = (this.w * min) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f6);
            this.c0 = Math.max(f6 * 30.0f, this.s.getHeight() * this.n) + ((rectF.top + rectF.bottom) * f6);
        }
        if (this.d) {
            invalidate();
        } else {
            this.m0.f(this.G, true);
            this.o0.f(this.T, true);
            this.n0.f(this.S, true);
            this.r0.e(true, this.d0);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        c46 c46Var = this.a0;
        return (c46Var == null || c46Var.d == null) ? false : true;
    }

    public int getPhotoSide() {
        float f;
        if (this.T) {
            f = 48.0f;
        } else {
            int i = this.b;
            int i2 = this.f;
            f = (((i - i2) - i2) / this.e) - 40.0f;
        }
        return ((int) f) << 1;
    }

    public int getPreviewType() {
        return this.W;
    }

    public float getRadius() {
        float f;
        float f2;
        if (e()) {
            f = 16.66f;
            f2 = this.e;
        } else {
            f = 0.2f;
            f2 = this.c0;
        }
        return f2 * f;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.K();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d();
        int ceil = (int) Math.ceil(this.b0);
        int i3 = this.f;
        int i4 = ceil + i3 + i3;
        int ceil2 = (int) Math.ceil(this.c0);
        int i5 = this.h;
        setMeasuredDimension(i4, ceil2 + i5 + i5);
    }

    public void setMaxWidth(int i) {
        this.b = i;
        this.c = true;
    }

    public void setPreviewType(int i) {
        this.W = i;
        invalidate();
    }
}
