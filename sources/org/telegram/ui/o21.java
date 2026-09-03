package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o21 extends View {
    public static final float Q = AndroidUtilities.dp(2.0f);
    public static final float R = AndroidUtilities.dp(20.0f);
    public final Paint B;
    public org.telegram.ui.Components.hj0 C;
    public String D;
    public boolean E;
    public String F;
    public int G;
    public boolean H;
    public final float[] I;
    public boolean J;
    public final l21 K;
    public Integer L;
    public Integer M;
    public String N;
    public String O;
    public boolean P;
    public final org.telegram.ui.Components.fc0 a;
    public final Paint b;
    public final BitmapShader c;
    public final BitmapShader d;
    public e21 e;
    public Bitmap f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public final org.telegram.ui.Components.no0 s;
    public TextPaint v;
    public StaticLayout w;
    public final org.telegram.ui.Components.z5 x;
    public final Paint y;

    public o21(Context context) {
        super(context);
        org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0();
        this.a = fc0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.x = new org.telegram.ui.Components.z5(1.0f, this, 0L, 2000L, prVar);
        Paint paint2 = new Paint(1);
        this.y = paint2;
        Paint paint3 = new Paint(1);
        this.B = paint3;
        this.I = new float[8];
        this.K = new l21(this, 0);
        this.P = true;
        fc0Var.N = true;
        fc0Var.r(this);
        Bitmap bitmap = fc0Var.k;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.c = bitmapShader;
        BitmapShader bitmapShader2 = new BitmapShader(fc0Var.k, tileMode, tileMode);
        this.d = bitmapShader2;
        paint.setShader(bitmapShader);
        org.telegram.ui.Components.no0 no0Var = new org.telegram.ui.Components.no0(this);
        this.s = no0Var;
        no0Var.k(0.35f, 300L, prVar);
        no0Var.setCallback(this);
        no0Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        no0Var.a.setShader(bitmapShader2);
        no0Var.b = 17;
        no0Var.t(AndroidUtilities.dp(35.0f));
        no0Var.q("", true, true);
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(Canvas canvas) {
        e21 e21Var;
        if (this.C != null) {
            int x10 = b.x(60.0f, getWidth(), 33);
            int i10 = (x10 * 33) + 32;
            int width = (getWidth() - i10) / 2;
            int height = (int) (getHeight() * 0.15f);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                height = (int) (getHeight() * 0.09f);
            }
            int i11 = height;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, 255, 31);
            int i12 = width + 16;
            int i13 = i11 + 16;
            Paint paint = this.b;
            canvas.drawRect(i12, i13, (getWidth() - width) - 16, (((getWidth() + i11) - width) - width) - 16, paint);
            canvas.save();
            this.C.setBounds(i12, i13, (getWidth() - width) - 16, (((getWidth() + i11) - width) - width) - 16);
            this.C.draw(canvas);
            canvas.restore();
            canvas.restore();
            float width2 = getWidth() / 2.0f;
            float f10 = i11;
            float f11 = width;
            float width3 = ((getWidth() / 2.0f) + f10) - f11;
            float round = ((Math.round((r8 / 4.65f) / r6) * x10) / 2) * 0.75f;
            canvas.drawCircle(width2, width3, round, paint);
            TelegramQRCodeWriter.drawSideQuads(canvas, f11, f10, paint, 7.0f, x10, 16, i10, 0.75f, this.I, true);
            if (this.J || (e21Var = this.e) == null) {
                return;
            }
            u21 u21Var = e21Var.a;
            u21Var.c.set((int) (width2 - round), (int) (width3 - round), (int) (width2 + round), (int) (width3 + round));
            u21Var.B.requestLayout();
            this.J = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202 A[LOOP:1: B:59:0x01d4->B:68:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff A[EDGE_INSN: B:69:0x01ff->B:70:0x01ff BREAK  A[LOOP:1: B:59:0x01d4->B:68:0x0202], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10, int i11) {
        String str;
        int i12;
        float f10;
        int i13;
        StaticLayout staticLayout;
        int i14;
        Bitmap bitmap;
        int i15;
        Drawable drawable;
        Integer num;
        if (i10 == 0 || i11 == 0) {
            return;
        }
        if ((TextUtils.isEmpty(this.D) && !this.r) || TextUtils.isEmpty(this.F)) {
            AndroidUtilities.runOnUIThread(new l21(this, 1));
            return;
        }
        String upperCase = this.r ? null : this.E ? this.D : this.D.toUpperCase();
        if (TextUtils.equals(upperCase, this.N) && TextUtils.equals(this.F, this.O) && (num = this.L) != null && this.M != null && num.intValue() == i10 && this.M.intValue() == i11) {
            return;
        }
        final Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        TextPaint textPaint = new TextPaint(65);
        int i16 = -16777216;
        textPaint.setColor(-16777216);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        int z4 = b.z(20.0f, 2, createBitmap.getWidth());
        if (!this.r) {
            int i17 = 0;
            for (int i18 = 2; i17 <= i18; i18 = 2) {
                if (i17 == 0) {
                    drawable = getContext().getDrawable(R.drawable.qr_at_large);
                    textPaint.setTextSize(AndroidUtilities.dp(30.0f));
                } else if (i17 == 1) {
                    drawable = getContext().getDrawable(R.drawable.qr_at_medium);
                    textPaint.setTextSize(AndroidUtilities.dp(25.0f));
                } else {
                    drawable = getContext().getDrawable(R.drawable.qr_at_small);
                    textPaint.setTextSize(AndroidUtilities.dp(19.0f));
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    drawable.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yh.k(" ", upperCase));
                if (!this.E) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Cells.v6(drawable), 0, 1, 33);
                }
                float measureText = textPaint.measureText(spannableStringBuilder, 1, spannableStringBuilder.length()) + drawable.getBounds().width();
                if (i17 > 1 || measureText <= z4) {
                    int i19 = measureText > ((float) z4) ? 2 : 1;
                    int dp = i19 > 1 ? AndroidUtilities.dp(2.0f) + (((int) (drawable.getBounds().width() + measureText)) / 2) : z4;
                    if (dp > z4) {
                        dp = AndroidUtilities.dp(4.0f) + (((int) (measureText + drawable.getBounds().width())) / 3);
                        i19 = 3;
                    }
                    int i20 = dp;
                    i13 = 0;
                    str = upperCase;
                    i12 = 2;
                    f10 = 30.0f;
                    staticLayout = org.telegram.ui.Components.kw0.c(spannableStringBuilder, textPaint, i20, Layout.Alignment.ALIGN_CENTER, 0.0f, false, null, Math.min(AndroidUtilities.dp(10.0f) + i20, createBitmap.getWidth()), i19, true);
                    float lineCount = (staticLayout != null ? 0 : staticLayout.getLineCount()) * (textPaint.descent() - textPaint.ascent());
                    int z10 = b.z(f10, i12, i10);
                    HashMap hashMap = new HashMap();
                    hashMap.put(ob.b.a, tb.b.c);
                    hashMap.put(ob.b.c, Integer.valueOf(i13));
                    TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
                    i14 = 3;
                    bitmap = null;
                    while (true) {
                        if (i14 < 5) {
                            i15 = -16777216;
                            break;
                        }
                        try {
                            hashMap.put(ob.b.d, Integer.valueOf(i14));
                            bitmap = telegramQRCodeWriter.encode(this.F, z10, z10, hashMap, null, 0.75f, 16777215, -16777216);
                            i15 = -16777216;
                        } catch (Exception unused) {
                            i15 = -16777216;
                        }
                        try {
                            i13 = telegramQRCodeWriter.getImageSize();
                        } catch (Exception unused2) {
                            if (bitmap == null) {
                            }
                        }
                        if (bitmap == null) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    final int i21 = i13;
                    if (bitmap != null) {
                        return;
                    }
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(16777215);
                    float width = (i10 - bitmap.getWidth()) / 2.0f;
                    float f11 = i11;
                    float f12 = 0.15f * f11;
                    if (staticLayout != null && staticLayout.getLineCount() == 3) {
                        f12 = 0.13f * f11;
                    }
                    if (((ViewGroup) getParent()).getMeasuredWidth() >= ((ViewGroup) getParent()).getMeasuredHeight()) {
                        f12 = 0.09f * f11;
                    }
                    canvas.drawBitmap(bitmap, width, f12, new Paint(3));
                    Paint paint = new Paint(1);
                    paint.setColor(i15);
                    final float width2 = (bitmap.getWidth() * 0.5f) + width;
                    final float width3 = (bitmap.getWidth() * 0.5f) + f12;
                    canvas.drawCircle(width2, width3, i21 * 0.5f, paint);
                    if (staticLayout != null) {
                        canvas.save();
                        canvas.translate((canvas.getWidth() - staticLayout.getWidth()) * 0.5f, ((((canvas.getHeight() - (f12 + bitmap.getHeight())) - lineCount) * 0.5f) + (bitmap.getHeight() + f12)) - AndroidUtilities.dp(4.0f));
                        staticLayout.draw(canvas);
                        canvas.restore();
                        bitmap.recycle();
                    }
                    this.L = Integer.valueOf(i10);
                    this.M = Integer.valueOf(i11);
                    this.N = str;
                    this.O = this.F;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.n21
                        @Override // java.lang.Runnable
                        public final void run() {
                            o21 o21Var = o21.this;
                            Bitmap bitmap2 = o21Var.h;
                            o21Var.h = createBitmap.extractAlpha();
                            if (!o21Var.P) {
                                o21Var.x.d(0.0f, true);
                            }
                            o21Var.P = false;
                            Bitmap bitmap3 = o21Var.n;
                            if (bitmap3 != null) {
                                bitmap3.recycle();
                            }
                            o21Var.n = bitmap2;
                            e21 e21Var = o21Var.e;
                            if (e21Var != null) {
                                float f13 = i21 * 0.5f;
                                float f14 = width2;
                                float f15 = width3;
                                u21 u21Var = e21Var.a;
                                u21Var.c.set((int) (f14 - f13), (int) (f15 - f13), (int) (f14 + f13), (int) (f15 + f13));
                                u21Var.B.requestLayout();
                                o21Var.J = true;
                            }
                            o21Var.invalidate();
                        }
                    });
                    return;
                }
                i17++;
                i16 = -16777216;
            }
        }
        str = upperCase;
        i12 = 2;
        f10 = 30.0f;
        i13 = 0;
        staticLayout = null;
        float lineCount2 = (staticLayout != null ? 0 : staticLayout.getLineCount()) * (textPaint.descent() - textPaint.ascent());
        int z102 = b.z(f10, i12, i10);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(ob.b.a, tb.b.c);
        hashMap2.put(ob.b.c, Integer.valueOf(i13));
        TelegramQRCodeWriter telegramQRCodeWriter2 = new TelegramQRCodeWriter();
        i14 = 3;
        bitmap = null;
        while (true) {
            if (i14 < 5) {
            }
            i14++;
        }
        final int i212 = i13;
        if (bitmap != null) {
        }
    }

    public final void c(String str, String str2, boolean z4, boolean z10) {
        this.H = true;
        this.D = str2;
        this.E = z4;
        if (z10) {
            TLRPC.TL_exportedContactToken cachedContactToken = MessagesController.getInstance(UserConfig.selectedAccount).getCachedContactToken();
            if (cachedContactToken != null) {
                this.F = cachedContactToken.url;
                this.G = cachedContactToken.expires;
            } else {
                this.F = null;
            }
        } else {
            this.F = str;
        }
        this.r = z10;
        Utilities.themeQueue.postRunnable(new m21(this, getWidth(), getHeight(), 0));
        invalidate();
        this.K.run();
    }

    public final void d(boolean z4) {
        if (this.r) {
            if (!z4) {
                this.w = null;
                return;
            }
            if (this.v == null) {
                this.v = new TextPaint(1);
            }
            this.v.setShader(this.d);
            this.v.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            this.v.setTextSize(AndroidUtilities.dp(25.0f));
            String str = this.D;
            if (str == null) {
                str = "";
            }
            this.w = org.telegram.ui.Components.kw0.c(Emoji.replaceEmoji(str, this.v.getFontMetricsInt(), false), this.v, getWidth(), Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1, true);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.run();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.hj0 hj0Var = this.C;
        if (hj0Var != null) {
            hj0Var.stop();
            this.C.A(false);
            this.C = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        super.onDraw(canvas);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        float d = this.x.d(1.0f, false);
        boolean z4 = d > 0.0f && d < 1.0f;
        Paint paint = this.b;
        if (d < 1.0f) {
            if (z4) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, 255, 31);
            }
            Bitmap bitmap2 = this.n;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
            } else {
                a(canvas);
            }
            if (z4) {
                float dp = AndroidUtilities.dp(120.0f);
                canvas.save();
                canvas.translate(0.0f, e2.c.w(1.0f, d, getHeight() + dp, -dp));
                i10 = 255;
                i11 = 31;
                f10 = 120.0f;
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight() + dp, this.B);
                canvas.restore();
                canvas.restore();
                if (d > 0.0f) {
                    if (z4) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        canvas.saveLayerAlpha(rectF2, i10, i11);
                    }
                    Bitmap bitmap3 = this.h;
                    if (bitmap3 != null) {
                        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
                        this.a.z();
                    } else {
                        a(canvas);
                    }
                    if (z4) {
                        float dp2 = AndroidUtilities.dp(f10);
                        canvas.save();
                        float f11 = -dp2;
                        canvas.translate(0.0f, e2.c.w(1.0f, d, getHeight() + dp2, f11));
                        canvas.drawRect(0.0f, f11 - getHeight(), getWidth(), getHeight() + dp2, this.y);
                        canvas.restore();
                        canvas.restore();
                    }
                }
                if (this.r) {
                    return;
                }
                float dp3 = AndroidUtilities.dp(6.0f) + getWidth();
                if (this.w != null) {
                    canvas.save();
                    canvas.translate(0.0f, dp3);
                    if (this.w.getWidth() != getWidth()) {
                        d(true);
                    }
                    this.w.draw(canvas);
                    canvas.restore();
                    return;
                }
                int i12 = (int) dp3;
                int width = getWidth();
                int dp4 = AndroidUtilities.dp(40.0f) + i12;
                org.telegram.ui.Components.no0 no0Var = this.s;
                no0Var.setBounds(0, i12, width, dp4);
                no0Var.draw(canvas);
                return;
            }
        }
        i10 = 255;
        i11 = 31;
        f10 = 120.0f;
        if (d > 0.0f) {
        }
        if (this.r) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f = null;
        }
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float dp = AndroidUtilities.dp(4.0f);
        float f10 = Q;
        paint.setShadowLayer(dp, 0.0f, f10, 251658240);
        this.f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f);
        float f11 = i10;
        RectF rectF = new RectF(f10, f10, f11 - f10, getHeight() - f10);
        float f12 = R;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        if (this.H) {
            Utilities.themeQueue.postRunnable(new m21(this, i10, i11, 1));
        }
        float max = Math.max((getWidth() * 1.0f) / this.a.k.getWidth(), (getHeight() * 1.0f) / this.a.k.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        this.c.setLocalMatrix(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(max, max);
        matrix2.postTranslate(f11 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
        this.d.setLocalMatrix(matrix2);
    }
}
