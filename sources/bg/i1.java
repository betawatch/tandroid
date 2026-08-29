package bg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class i1 extends View {
    public final Paint A;
    public boolean B;
    public zz0 C;
    public final Paint D;
    public boolean E;
    public zz0 F;
    public boolean G;
    public zz0 H;
    public boolean I;
    public final TextPaint J;
    public StaticLayout K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final ImageReceiver P;
    public boolean Q;
    public int R;
    public h1 S;
    public float T;
    public float U;
    public float V;
    public float W;
    public int a;
    public int a0;
    public int b;
    public final RectF b0;
    public boolean c;
    public final RectF c0;
    public boolean d;
    public final Path d0;
    public final float e;
    public final Path e0;
    public final int f;
    public final RectF f0;
    public final RectF g0;
    public final int h;
    public final d6 h0;
    public final d6 i0;
    public final d6 j0;
    public final d6 k0;
    public final d6 l0;
    public final d6 m0;
    public float n;
    public final d6 n0;
    public final d6 o0;
    public final TextPaint r;
    public StaticLayout s;
    public float v;
    public float w;
    public final RectF x;
    public final Drawable y;

    public i1(Context context, float f9) {
        super(context);
        this.c = true;
        this.n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        this.x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.A = new Paint(1);
        this.D = new Paint(1);
        this.J = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        this.b0 = new RectF();
        this.c0 = new RectF();
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new RectF();
        this.g0 = new RectF();
        jr jrVar = jr.h;
        this.h0 = new d6(this, 0L, 350L, jrVar);
        this.i0 = new d6(this, 0L, 350L, jrVar);
        this.j0 = new d6(this, 0L, 350L, jrVar);
        this.k0 = new d6(this, 0L, 350L, jrVar);
        this.l0 = new d6(this, 0L, 350L, jrVar);
        this.m0 = new d6(this, 0L, 350L, jrVar);
        this.n0 = new d6(this, 0L, 350L, jrVar);
        this.o0 = new d6(this, 0L, 350L, jrVar);
        this.e = f9;
        imageReceiver.setInvalidateAll(true);
        this.f = (int) (f9 * 3.0f);
        this.h = (int) (f9 * 1.0f);
        this.y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f9);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        Path.Direction direction;
        float f12;
        float f13;
        zz0 zz0Var;
        zz0 zz0Var2;
        Canvas canvas2 = canvas;
        d();
        float d = this.n0.d(this.T, false);
        float d10 = this.o0.d(this.U, false);
        float e10 = this.l0.e(this.R == 0);
        float e11 = this.k0.e(e());
        float f14 = this.e;
        float lerp = AndroidUtilities.lerp(0.2f * d10, 16.66f * f14, e11);
        int i10 = this.f;
        int i11 = this.h;
        RectF rectF = this.b0;
        rectF.set(i10, i11, i10 + d, i11 + d10);
        int d11 = i0.a.d(e11, this.a0, i0.a.d(e10, -1, -14670807));
        Paint paint = this.A;
        paint.setColor(d11);
        Path path = this.e0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, lerp, lerp, direction2);
        canvas2.drawPath(path, paint);
        if (e11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i10, i11);
            float e12 = this.h0.e(this.B);
            float f15 = (7.33f * f14) + 0.0f;
            zz0 zz0Var3 = this.C;
            if (zz0Var3 == null || e12 <= 0.0f) {
                f10 = e12;
                f11 = e11;
                direction = direction2;
                f9 = 1.0f;
            } else {
                direction = direction2;
                f10 = e12;
                f9 = 1.0f;
                zz0Var3.c(f14 * 10.0f, th.b(1.0f, e12, (15.0f * f14) + this.C.j(), (zz0Var3.j() / 2.0f) + f15), e11, -15033089, canvas2);
                f11 = e11;
                f15 = (((7.0f * f14) + this.C.j()) * f10) + f15;
            }
            float f16 = f15;
            float d12 = this.m0.d(this.V, false);
            Paint paint2 = this.D;
            paint2.setAlpha(25);
            float f17 = d12 + f16;
            RectF rectF2 = this.c0;
            rectF2.set(f14 * 10.0f, f16, d - (f14 * 10.0f), f17);
            Path path2 = this.d0;
            path2.rewind();
            path2.addRoundRect(rectF2, f14 * 5.0f, f14 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas2.drawRect(f14 * 10.0f, f16, 13.0f * f14, f17, paint2);
            canvas.restore();
            float f18 = (5.66f * f14) + f16;
            if (!this.G || (zz0Var2 = this.H) == null) {
                f12 = d;
                e11 = f11;
                f13 = 2.66f;
            } else {
                float j10 = (zz0Var2.j() / 2.0f) + f18;
                int color = paint2.getColor();
                f12 = d;
                e11 = f11;
                f13 = 2.66f;
                zz0Var2.c(f14 * 20.0f, j10, e11, color, canvas);
                f18 = com.google.android.recaptcha.internal.a.d(f14, 2.66f, this.H.j(), f18);
            }
            if (!this.E || (zz0Var = this.F) == null) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                zz0Var.c(f14 * 20.0f, (zz0Var.j() / 2.0f) + f18, e11, i0.a.d(e10, -13421773, -1), canvas2);
                f18 = com.google.android.recaptcha.internal.a.d(f14, f13, this.F.j(), f18);
            }
            if (this.I && this.K != null) {
                canvas2.save();
                canvas2.translate((f14 * 20.0f) - this.M, f18);
                this.J.setColor(i0.a.d(e10, -13421773, -1));
                this.J.setAlpha((int) (255.0f * e11));
                this.K.draw(canvas2);
                canvas2.restore();
                f18 = com.google.android.recaptcha.internal.a.d(f14, f13, this.K.getHeight(), f18);
            }
            float e13 = this.i0.e(this.N);
            if (e13 > 0.0f) {
                float e14 = this.j0.e(this.O);
                this.f0.set(f14 * 20.0f, (f14 * f13) + f18, f12 - (20.0f * f14), (f14 * f13) + f18 + this.W);
                this.g0.set(((f12 - (f14 * 10.0f)) - (f14 * 6.0f)) - (48.0f * f14), (f14 * 6.0f) + f16, (f12 - (f14 * 10.0f)) - (f14 * 6.0f), (48.0f * f14) + (6.0f * f14) + f16);
                AndroidUtilities.lerp(this.f0, this.g0, e14, rectF2);
                float f19 = rectF2.left;
                float f20 = rectF2.top;
                float width = rectF2.width();
                float height = rectF2.height();
                ImageReceiver imageReceiver = this.P;
                imageReceiver.setImageCoords(f19, f20, width, height);
                imageReceiver.setAlpha(e13 * e11);
                imageReceiver.draw(canvas2);
                f18 += ((f14 * 2.66f) + this.W) * (f9 - e14);
            }
            float f21 = (5.0f * f14) + (7.0f * f14) + f18;
            zz0 zz0Var4 = this.C;
            if (zz0Var4 != null && f9 - f10 > 0.0f) {
                zz0Var4.c(f14 * 10.0f, (zz0Var4.j() / 2.0f) + f21 + (((15.0f * f14) + this.C.j()) * f10), e11, -15033089, canvas2);
                this.C.j();
            }
            canvas2.restore();
        } else {
            f9 = 1.0f;
        }
        if (e11 < f9) {
            float f22 = this.x.left;
            int y8 = ((int) com.google.android.recaptcha.internal.a.y(f14, 30.0f, d10, 2.0f)) + i11;
            Drawable drawable = this.y;
            drawable.setBounds(((int) (f22 * f14)) + i10, ((int) com.google.android.recaptcha.internal.a.w(f14, 30.0f, d10, 2.0f)) + i11, ((int) ((f22 + 30.0f) * f14)) + i10, y8);
            int i12 = (int) ((f9 - e11) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(((this.x.left + 30.0f + 3.25f) * f14) + i10, (d10 / 2.0f) + i11);
                float f23 = this.n;
                canvas2.scale(f23, f23);
                canvas2.translate(-this.w, (-this.s.getHeight()) / 2.0f);
                this.r.setAlpha(i12);
                this.s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i10, h1 h1Var, boolean z10) {
        this.a = i10;
        if (this.S != h1Var || z10) {
            this.S = h1Var;
            this.c = true;
            this.d = z10;
            requestLayout();
        }
    }

    public final void c(int i10, int i11) {
        Drawable drawable = this.y;
        TextPaint textPaint = this.r;
        if (i10 == 0) {
            this.a0 = i11;
            int i12 = AndroidUtilities.computePerceivedBrightness(i11) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.a0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.a0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.a0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        int color1;
        float f9;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        if (!this.c || this.S == null) {
            return;
        }
        boolean e10 = e();
        int i13 = this.f;
        float f12 = this.e;
        if (e10) {
            String str2 = TextUtils.isEmpty(this.S.b) ? this.S.c : this.S.b;
            TLRPC.WebPage webPage = this.S.d;
            float f13 = (this.b - i13) - i13;
            this.U = 0.0f;
            this.T = 0.0f;
            this.V = 0.0f;
            int colorId = UserObject.getColorId(UserConfig.getInstance(this.a).getCurrentUser());
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.a).peerColors;
            MessagesController.PeerColor color = (peerColors == null || colorId < 7) ? null : peerColors.getColor(colorId);
            if (color == null) {
                int[] iArr = g6.r8;
                color1 = g6.w0(null, iArr[colorId % iArr.length], false);
            } else {
                color1 = color.getColor1();
            }
            this.D.setColor(color1);
            this.U = (7.33f * f12) + this.U;
            this.B = this.S.f;
            zz0 zz0Var = new zz0(str2, 16.0f, null);
            zz0Var.a.setTextSize(16.0f * f12);
            float f14 = 20.0f * f12;
            zz0Var.q(f13 - f14);
            this.C = zz0Var;
            this.T = Math.max(this.T, Math.min(f14 + zz0Var.c, f13));
            float f15 = 7.0f * f12;
            this.U = this.C.j() + this.U + f15;
            this.N = webPage.photo != null || MessageObject.isVideoDocument(webPage.document);
            h1 h1Var = this.S;
            boolean z10 = h1Var.e;
            this.O = !z10;
            int i14 = (!this.Q || (h1Var.a & 4) == 0) ? ((int) (!z10 ? 48.0f : (f13 / f12) - 40.0f)) * 2 : h1Var.i;
            ImageReceiver imageReceiver = this.P;
            imageReceiver.setRoundRadius((int) (4.0f * f12));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                f9 = 48.0f;
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i14 * f12), false, closestPhotoSizeWithSize, false);
                if (closestPhotoSizeWithSize2 != null) {
                    i11 = closestPhotoSizeWithSize2.w;
                    i10 = closestPhotoSizeWithSize2.h;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo), com.google.android.recaptcha.internal.a.k(i14, "_", i14), this.Q ? null : ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo), this.Q ? null : com.google.android.recaptcha.internal.a.k(i14, "_", i14), 0L, null, null, 0);
            } else {
                f9 = 48.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i14 * f12), false, closestPhotoSizeWithSize3, false);
                    if (closestPhotoSizeWithSize4 != null) {
                        i11 = closestPhotoSizeWithSize4.w;
                        i10 = closestPhotoSizeWithSize4.h;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document), com.google.android.recaptcha.internal.a.k(i14, "_", i14), this.Q ? null : ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document), this.Q ? null : com.google.android.recaptcha.internal.a.k(i14, "_", i14), 0L, null, null, 0);
                } else {
                    i10 = 0;
                    i11 = 0;
                }
            }
            this.V = (5.66f * f12) + this.V;
            boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
            this.G = !isEmpty;
            if (isEmpty) {
                i12 = 0;
            } else {
                zz0 zz0Var2 = new zz0(webPage.site_name, 14.0f, AndroidUtilities.bold());
                zz0Var2.a.setTextSize(f12 * 14.0f);
                float f16 = f12 * 40.0f;
                zz0Var2.q((int) Math.ceil((f13 - f16) - ((this.N && this.O) ? f12 * 60.0f : 0.0f)));
                this.H = zz0Var2;
                this.T = Math.max(this.T, Math.min(f16 + zz0Var2.c + ((this.N && this.O) ? f12 * 60.0f : 0.0f), f13));
                this.V = (f12 * 2.66f) + this.H.j() + this.V;
                i12 = this.H.b.getLineCount();
            }
            boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
            this.E = !isEmpty2;
            if (isEmpty2) {
                f10 = f12;
                f11 = 2.66f;
            } else {
                zz0 zz0Var3 = new zz0(webPage.title, 14.0f, AndroidUtilities.bold());
                zz0Var3.a.setTextSize(f12 * 14.0f);
                float f17 = f12 * 40.0f;
                f11 = 2.66f;
                f10 = f12;
                zz0Var3.q((int) Math.ceil((f13 - f17) - ((this.N && this.O) ? f12 * 60.0f : 0.0f)));
                this.F = zz0Var3;
                this.T = Math.max(this.T, Math.min(f17 + zz0Var3.c + ((this.N && this.O) ? 60.0f * f10 : 0.0f), f13));
                this.V = (f10 * 2.66f) + this.F.j() + this.V;
                i12 += this.F.b.getLineCount();
            }
            boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
            this.I = !isEmpty3;
            if (!isEmpty3) {
                TextPaint textPaint = this.J;
                textPaint.setTextSize(f10 * 14.0f);
                float f18 = f10 * 40.0f;
                int i15 = 3 - i12;
                this.K = org.telegram.ui.Cells.s1.u2(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f13 - f18)), (int) Math.ceil(Math.max(1.0f, f13 - ((40 + ((this.N && this.O) ? 60 : 0)) * f10))), i15, 4);
                this.L = 0.0f;
                this.M = Float.MAX_VALUE;
                int i16 = 0;
                while (i16 < this.K.getLineCount()) {
                    this.L = Math.max(this.L, this.K.getLineWidth(i16) + (this.N && this.O && i16 < i15 ? f10 * f9 : 0.0f));
                    this.M = Math.min(this.M, this.K.getLineLeft(i16));
                    i16++;
                }
                this.T = Math.max(this.T, Math.min(f18 + this.L, f13));
                this.V = (f10 * f11) + this.V + this.K.getHeight();
            }
            if (this.N && !this.O) {
                if (i11 <= 0 || i10 <= 0) {
                    this.W = f10 * 120.0f;
                } else {
                    this.W = Math.min((Math.max(0.0f, this.T - (f10 * 40.0f)) / i11) * i10, f10 * 200.0f);
                }
                this.V = (f10 * f11) + this.V + this.W;
            }
            float f19 = f15 + this.V;
            this.V = f19;
            this.U = (f10 * 11.0f) + this.U + f19;
        } else {
            if (TextUtils.isEmpty(this.S.b)) {
                String str3 = this.S.c;
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
                str = str3.toUpperCase();
            } else {
                str = this.S.b;
            }
            float f20 = (this.b - i13) - i13;
            RectF rectF = this.x;
            float f21 = f20 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f12);
            this.n = 1.0f;
            double d = f21;
            float ceil = (int) Math.ceil(d);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            TextPaint textPaint2 = this.r;
            this.s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, ceil, truncateAt), textPaint2, (int) Math.ceil(d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.v = 0.0f;
            this.w = Float.MAX_VALUE;
            for (int i17 = 0; i17 < this.s.getLineCount(); i17++) {
                this.v = Math.max(this.v, this.s.getLineWidth(i17));
                this.w = Math.min(this.w, this.s.getLineLeft(i17));
            }
            if (this.s.getLineCount() > 2) {
                this.n = 0.3f;
            } else {
                this.n = Math.min(1.0f, f21 / this.v);
            }
            this.T = (this.v * this.n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f12);
            this.U = Math.max(f12 * 30.0f, this.s.getHeight() * this.n) + ((rectF.top + rectF.bottom) * f12);
        }
        if (this.d) {
            invalidate();
        } else {
            this.h0.f(this.B, true);
            this.j0.f(this.O, true);
            this.i0.f(this.N, true);
            this.m0.d(this.V, true);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        h1 h1Var = this.S;
        return (h1Var == null || h1Var.d == null) ? false : true;
    }

    public int getPhotoSide() {
        float f9;
        if (this.O) {
            f9 = 48.0f;
        } else {
            int i10 = this.b;
            int i11 = this.f;
            f9 = (((i10 - i11) - i11) / this.e) - 40.0f;
        }
        return ((int) f9) * 2;
    }

    public int getPreviewType() {
        return this.R;
    }

    public float getRadius() {
        float f9;
        float f10;
        if (e()) {
            f9 = 16.66f;
            f10 = this.e;
        } else {
            f9 = 0.2f;
            f10 = this.U;
        }
        return f10 * f9;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        d();
        int ceil = (int) Math.ceil(this.T);
        int i12 = this.f;
        int i13 = ceil + i12 + i12;
        int ceil2 = (int) Math.ceil(this.U);
        int i14 = this.h;
        setMeasuredDimension(i13, ceil2 + i14 + i14);
    }

    public void setMaxWidth(int i10) {
        this.b = i10;
        this.c = true;
    }

    public void setPreviewType(int i10) {
        this.R = i10;
        invalidate();
    }
}
