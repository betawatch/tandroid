package dg;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class g1 extends View {
    public final Paint B;
    public boolean C;
    public k01 D;
    public final Paint E;
    public boolean F;
    public k01 G;
    public boolean H;
    public k01 I;
    public boolean J;
    public final TextPaint K;
    public StaticLayout L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final ImageReceiver Q;
    public boolean R;
    public int S;
    public f1 T;
    public float U;
    public float V;
    public float W;
    public int a;
    public float a0;
    public int b;
    public int b0;
    public boolean c;
    public final RectF c0;
    public boolean d;
    public final RectF d0;
    public final float e;
    public final Path e0;
    public final int f;
    public final Path f0;
    public final RectF g0;
    public final int h;
    public final RectF h0;
    public final z5 i0;
    public final z5 j0;
    public final z5 k0;
    public final z5 l0;
    public final z5 m0;
    public float n;
    public final z5 n0;
    public final z5 o0;
    public final z5 p0;
    public final TextPaint r;
    public StaticLayout s;
    public float v;
    public float w;
    public final RectF x;
    public final Drawable y;

    public g1(Context context, float f10) {
        super(context);
        this.c = true;
        this.n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        this.x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.B = new Paint(1);
        this.E = new Paint(1);
        this.K = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        this.c0 = new RectF();
        this.d0 = new RectF();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new RectF();
        this.h0 = new RectF();
        mr mrVar = mr.h;
        this.i0 = new z5(this, 0L, 350L, mrVar);
        this.j0 = new z5(this, 0L, 350L, mrVar);
        this.k0 = new z5(this, 0L, 350L, mrVar);
        this.l0 = new z5(this, 0L, 350L, mrVar);
        this.m0 = new z5(this, 0L, 350L, mrVar);
        this.n0 = new z5(this, 0L, 350L, mrVar);
        this.o0 = new z5(this, 0L, 350L, mrVar);
        this.p0 = new z5(this, 0L, 350L, mrVar);
        this.e = f10;
        imageReceiver.setInvalidateAll(true);
        this.f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f10);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        Path.Direction direction;
        float f13;
        float f14;
        k01 k01Var;
        k01 k01Var2;
        Canvas canvas2 = canvas;
        d();
        float d = this.o0.d(this.U, false);
        float d10 = this.p0.d(this.V, false);
        float e = this.m0.e(this.S == 0);
        float e6 = this.l0.e(e());
        float f15 = this.e;
        float lerp = AndroidUtilities.lerp(0.2f * d10, 16.66f * f15, e6);
        int i10 = this.f;
        int i11 = this.h;
        RectF rectF = this.c0;
        rectF.set(i10, i11, i10 + d, i11 + d10);
        int d11 = i0.a.d(e6, this.b0, i0.a.d(e, -1, -14670807));
        Paint paint = this.B;
        paint.setColor(d11);
        Path path = this.f0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, lerp, lerp, direction2);
        canvas2.drawPath(path, paint);
        if (e6 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i10, i11);
            float e10 = this.i0.e(this.C);
            float f16 = (7.33f * f15) + 0.0f;
            k01 k01Var3 = this.D;
            if (k01Var3 == null || e10 <= 0.0f) {
                f11 = e10;
                f12 = e6;
                direction = direction2;
                f10 = 1.0f;
            } else {
                direction = direction2;
                f11 = e10;
                f10 = 1.0f;
                k01Var3.c(f15 * 10.0f, ai.c(1.0f, e10, (15.0f * f15) + this.D.j(), (k01Var3.j() / 2.0f) + f16), e6, -15033089, canvas2);
                f12 = e6;
                f16 = (((7.0f * f15) + this.D.j()) * f11) + f16;
            }
            float f17 = f16;
            float d12 = this.n0.d(this.W, false);
            Paint paint2 = this.E;
            paint2.setAlpha(25);
            float f18 = d12 + f17;
            RectF rectF2 = this.d0;
            rectF2.set(f15 * 10.0f, f17, d - (f15 * 10.0f), f18);
            Path path2 = this.e0;
            path2.rewind();
            path2.addRoundRect(rectF2, f15 * 5.0f, f15 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas2.drawRect(f15 * 10.0f, f17, 13.0f * f15, f18, paint2);
            canvas.restore();
            float f19 = (5.66f * f15) + f17;
            if (!this.H || (k01Var2 = this.I) == null) {
                f13 = d;
                e6 = f12;
                f14 = 2.66f;
            } else {
                float j10 = (k01Var2.j() / 2.0f) + f19;
                int color = paint2.getColor();
                f13 = d;
                e6 = f12;
                f14 = 2.66f;
                k01Var2.c(f15 * 20.0f, j10, e6, color, canvas);
                f19 = e2.c.A(f15, 2.66f, this.I.j(), f19);
            }
            if (!this.F || (k01Var = this.G) == null) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                k01Var.c(f15 * 20.0f, (k01Var.j() / 2.0f) + f19, e6, i0.a.d(e, -13421773, -1), canvas2);
                f19 = e2.c.A(f15, f14, this.G.j(), f19);
            }
            if (this.J && this.L != null) {
                canvas2.save();
                canvas2.translate((f15 * 20.0f) - this.N, f19);
                this.K.setColor(i0.a.d(e, -13421773, -1));
                this.K.setAlpha((int) (255.0f * e6));
                this.L.draw(canvas2);
                canvas2.restore();
                f19 = e2.c.A(f15, f14, this.L.getHeight(), f19);
            }
            float e11 = this.j0.e(this.O);
            if (e11 > 0.0f) {
                float e12 = this.k0.e(this.P);
                this.g0.set(f15 * 20.0f, (f15 * f14) + f19, f13 - (20.0f * f15), (f15 * f14) + f19 + this.a0);
                this.h0.set(((f13 - (f15 * 10.0f)) - (f15 * 6.0f)) - (48.0f * f15), (f15 * 6.0f) + f17, (f13 - (f15 * 10.0f)) - (f15 * 6.0f), (48.0f * f15) + (6.0f * f15) + f17);
                AndroidUtilities.lerp(this.g0, this.h0, e12, rectF2);
                float f20 = rectF2.left;
                float f21 = rectF2.top;
                float width = rectF2.width();
                float height = rectF2.height();
                ImageReceiver imageReceiver = this.Q;
                imageReceiver.setImageCoords(f20, f21, width, height);
                imageReceiver.setAlpha(e11 * e6);
                imageReceiver.draw(canvas2);
                f19 += ((f15 * 2.66f) + this.a0) * (f10 - e12);
            }
            float f22 = (5.0f * f15) + (7.0f * f15) + f19;
            k01 k01Var4 = this.D;
            if (k01Var4 != null && f10 - f11 > 0.0f) {
                k01Var4.c(f15 * 10.0f, (k01Var4.j() / 2.0f) + f22 + (((15.0f * f15) + this.D.j()) * f11), e6, -15033089, canvas2);
                this.D.j();
            }
            canvas2.restore();
        } else {
            f10 = 1.0f;
        }
        if (e6 < f10) {
            float f23 = this.x.left;
            int v = ((int) e2.c.v(f15, 30.0f, d10, 2.0f)) + i11;
            Drawable drawable = this.y;
            drawable.setBounds(((int) (f23 * f15)) + i10, ((int) e2.c.d(f15, 30.0f, d10, 2.0f)) + i11, ((int) ((f23 + 30.0f) * f15)) + i10, v);
            int i12 = (int) ((f10 - e6) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(((this.x.left + 30.0f + 3.25f) * f15) + i10, (d10 / 2.0f) + i11);
                float f24 = this.n;
                canvas2.scale(f24, f24);
                canvas2.translate(-this.w, (-this.s.getHeight()) / 2.0f);
                this.r.setAlpha(i12);
                this.s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i10, f1 f1Var, boolean z4) {
        this.a = i10;
        if (this.T != f1Var || z4) {
            this.T = f1Var;
            this.c = true;
            this.d = z4;
            requestLayout();
        }
    }

    public final void c(int i10, int i11) {
        Drawable drawable = this.y;
        TextPaint textPaint = this.r;
        if (i10 == 0) {
            this.b0 = i11;
            int i12 = AndroidUtilities.computePerceivedBrightness(i11) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.b0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.b0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.b0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        int color1;
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        float f12;
        if (!this.c || this.T == null) {
            return;
        }
        boolean e = e();
        int i13 = this.f;
        float f13 = this.e;
        if (e) {
            String str2 = TextUtils.isEmpty(this.T.b) ? this.T.c : this.T.b;
            TLRPC.WebPage webPage = this.T.d;
            float f14 = (this.b - i13) - i13;
            this.V = 0.0f;
            this.U = 0.0f;
            this.W = 0.0f;
            int colorId = UserObject.getColorId(UserConfig.getInstance(this.a).getCurrentUser());
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.a).peerColors;
            MessagesController.PeerColor color = (peerColors == null || colorId < 7) ? null : peerColors.getColor(colorId);
            if (color == null) {
                int[] iArr = j6.r8;
                color1 = j6.w0(null, iArr[colorId % iArr.length], false);
            } else {
                color1 = color.getColor1();
            }
            this.E.setColor(color1);
            this.V = (7.33f * f13) + this.V;
            this.C = this.T.f;
            k01 k01Var = new k01(str2, 16.0f, null);
            k01Var.a.setTextSize(16.0f * f13);
            float f15 = 20.0f * f13;
            k01Var.q(f14 - f15);
            this.D = k01Var;
            this.U = Math.max(this.U, Math.min(f15 + k01Var.c, f14));
            float f16 = 7.0f * f13;
            this.V = this.D.j() + this.V + f16;
            this.O = webPage.photo != null || MessageObject.isVideoDocument(webPage.document);
            f1 f1Var = this.T;
            boolean z4 = f1Var.e;
            this.P = !z4;
            int i14 = (!this.R || (f1Var.a & 4) == 0) ? ((int) (!z4 ? 48.0f : (f14 / f13) - 40.0f)) * 2 : f1Var.i;
            ImageReceiver imageReceiver = this.Q;
            imageReceiver.setRoundRadius((int) (4.0f * f13));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                f10 = 48.0f;
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i14 * f13), false, closestPhotoSizeWithSize, false);
                if (closestPhotoSizeWithSize2 != null) {
                    i11 = closestPhotoSizeWithSize2.w;
                    i10 = closestPhotoSizeWithSize2.h;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo), e2.c.h(i14, "_", i14), this.R ? null : ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo), this.R ? null : e2.c.h(i14, "_", i14), 0L, null, null, 0);
            } else {
                f10 = 48.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i14 * f13), false, closestPhotoSizeWithSize3, false);
                    if (closestPhotoSizeWithSize4 != null) {
                        i11 = closestPhotoSizeWithSize4.w;
                        i10 = closestPhotoSizeWithSize4.h;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document), e2.c.h(i14, "_", i14), this.R ? null : ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document), this.R ? null : e2.c.h(i14, "_", i14), 0L, null, null, 0);
                } else {
                    i10 = 0;
                    i11 = 0;
                }
            }
            this.W = (5.66f * f13) + this.W;
            boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
            this.H = !isEmpty;
            if (isEmpty) {
                i12 = 0;
            } else {
                k01 k01Var2 = new k01(webPage.site_name, 14.0f, AndroidUtilities.bold());
                k01Var2.a.setTextSize(f13 * 14.0f);
                float f17 = f13 * 40.0f;
                k01Var2.q((int) Math.ceil((f14 - f17) - ((this.O && this.P) ? f13 * 60.0f : 0.0f)));
                this.I = k01Var2;
                this.U = Math.max(this.U, Math.min(f17 + k01Var2.c + ((this.O && this.P) ? f13 * 60.0f : 0.0f), f14));
                this.W = (f13 * 2.66f) + this.I.j() + this.W;
                i12 = this.I.b.getLineCount();
            }
            boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
            this.F = !isEmpty2;
            if (isEmpty2) {
                f11 = f13;
                f12 = 2.66f;
            } else {
                k01 k01Var3 = new k01(webPage.title, 14.0f, AndroidUtilities.bold());
                k01Var3.a.setTextSize(f13 * 14.0f);
                float f18 = f13 * 40.0f;
                f12 = 2.66f;
                f11 = f13;
                k01Var3.q((int) Math.ceil((f14 - f18) - ((this.O && this.P) ? f13 * 60.0f : 0.0f)));
                this.G = k01Var3;
                this.U = Math.max(this.U, Math.min(f18 + k01Var3.c + ((this.O && this.P) ? 60.0f * f11 : 0.0f), f14));
                this.W = (f11 * 2.66f) + this.G.j() + this.W;
                i12 += this.G.b.getLineCount();
            }
            boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
            this.J = !isEmpty3;
            if (!isEmpty3) {
                TextPaint textPaint = this.K;
                textPaint.setTextSize(f11 * 14.0f);
                float f19 = f11 * 40.0f;
                int i15 = 3 - i12;
                this.L = org.telegram.ui.Cells.s1.u2(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f14 - f19)), (int) Math.ceil(Math.max(1.0f, f14 - ((40 + ((this.O && this.P) ? 60 : 0)) * f11))), i15, 4);
                this.M = 0.0f;
                this.N = Float.MAX_VALUE;
                int i16 = 0;
                while (i16 < this.L.getLineCount()) {
                    this.M = Math.max(this.M, this.L.getLineWidth(i16) + (this.O && this.P && i16 < i15 ? f11 * f10 : 0.0f));
                    this.N = Math.min(this.N, this.L.getLineLeft(i16));
                    i16++;
                }
                this.U = Math.max(this.U, Math.min(f19 + this.M, f14));
                this.W = (f11 * f12) + this.W + this.L.getHeight();
            }
            if (this.O && !this.P) {
                if (i11 <= 0 || i10 <= 0) {
                    this.a0 = f11 * 120.0f;
                } else {
                    this.a0 = Math.min((Math.max(0.0f, this.U - (f11 * 40.0f)) / i11) * i10, f11 * 200.0f);
                }
                this.W = (f11 * f12) + this.W + this.a0;
            }
            float f20 = f16 + this.W;
            this.W = f20;
            this.V = (f11 * 11.0f) + this.V + f20;
        } else {
            if (TextUtils.isEmpty(this.T.b)) {
                String str3 = this.T.c;
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
                str = str3.toUpperCase();
            } else {
                str = this.T.b;
            }
            float f21 = (this.b - i13) - i13;
            RectF rectF = this.x;
            float f22 = f21 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f13);
            this.n = 1.0f;
            double d = f22;
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
                this.n = Math.min(1.0f, f22 / this.v);
            }
            this.U = (this.v * this.n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f13);
            this.V = Math.max(f13 * 30.0f, this.s.getHeight() * this.n) + ((rectF.top + rectF.bottom) * f13);
        }
        if (this.d) {
            invalidate();
        } else {
            this.i0.f(this.C, true);
            this.k0.f(this.P, true);
            this.j0.f(this.O, true);
            this.n0.d(this.W, true);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        f1 f1Var = this.T;
        return (f1Var == null || f1Var.d == null) ? false : true;
    }

    public int getPhotoSide() {
        float f10;
        if (this.P) {
            f10 = 48.0f;
        } else {
            int i10 = this.b;
            int i11 = this.f;
            f10 = (((i10 - i11) - i11) / this.e) - 40.0f;
        }
        return ((int) f10) * 2;
    }

    public int getPreviewType() {
        return this.S;
    }

    public float getRadius() {
        float f10;
        float f11;
        if (e()) {
            f10 = 16.66f;
            f11 = this.e;
        } else {
            f10 = 0.2f;
            f11 = this.V;
        }
        return f11 * f10;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        d();
        int ceil = (int) Math.ceil(this.U);
        int i12 = this.f;
        int i13 = ceil + i12 + i12;
        int ceil2 = (int) Math.ceil(this.V);
        int i14 = this.h;
        setMeasuredDimension(i13, ceil2 + i14 + i14);
    }

    public void setMaxWidth(int i10) {
        this.b = i10;
        this.c = true;
    }

    public void setPreviewType(int i10) {
        this.S = i10;
        invalidate();
    }
}
