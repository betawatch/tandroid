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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e31 extends View {
    public static final float T = AndroidUtilities.dp(2.0f);
    public static final float U = AndroidUtilities.dp(20.0f);
    public final Paint E;
    public org.telegram.ui.Components.hj0 F;
    public String G;
    public boolean H;
    public String I;
    public int J;
    public boolean K;
    public final float[] L;
    public boolean M;
    public final b31 N;
    public Integer O;
    public Integer P;
    public String Q;
    public String R;
    public boolean S;
    public final org.telegram.ui.Components.lc0 a;
    public final Paint b;
    public final BitmapShader c;
    public final BitmapShader d;
    public v21 e;
    public Bitmap f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public final org.telegram.ui.Components.so0 s;
    public TextPaint v;
    public StaticLayout w;
    public final org.telegram.ui.Components.d6 x;
    public final Paint y;

    public e31(Context context) {
        super(context);
        org.telegram.ui.Components.lc0 lc0Var = new org.telegram.ui.Components.lc0();
        this.a = lc0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.x = new org.telegram.ui.Components.d6(1.0f, this, 0L, 2000L, wrVar);
        Paint paint2 = new Paint(1);
        this.y = paint2;
        Paint paint3 = new Paint(1);
        this.E = paint3;
        this.L = new float[8];
        this.N = new b31(this, 0);
        this.S = true;
        lc0Var.N = true;
        lc0Var.r(this);
        Bitmap bitmap = lc0Var.k;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.c = bitmapShader;
        BitmapShader bitmapShader2 = new BitmapShader(lc0Var.k, tileMode, tileMode);
        this.d = bitmapShader2;
        paint.setShader(bitmapShader);
        org.telegram.ui.Components.so0 so0Var = new org.telegram.ui.Components.so0(this);
        this.s = so0Var;
        so0Var.k(0.35f, 300L, wrVar);
        so0Var.setCallback(this);
        so0Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        so0Var.a.setShader(bitmapShader2);
        so0Var.b = 17;
        so0Var.t(AndroidUtilities.dp(35.0f));
        so0Var.q("", true, true);
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(Canvas canvas) {
        v21 v21Var;
        if (this.F != null) {
            int y3 = org.telegram.messenger.em.y(60.0f, getWidth(), 33);
            int i10 = (y3 * 33) + 32;
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
            this.F.setBounds(i12, i13, (getWidth() - width) - 16, (((getWidth() + i11) - width) - width) - 16);
            this.F.draw(canvas);
            canvas.restore();
            canvas.restore();
            float width2 = getWidth() / 2.0f;
            float f7 = i11;
            float f10 = width;
            float width3 = ((getWidth() / 2.0f) + f7) - f10;
            float round = ((Math.round((r8 / 4.65f) / r6) * y3) / 2) * 0.75f;
            canvas.drawCircle(width2, width3, round, paint);
            TelegramQRCodeWriter.drawSideQuads(canvas, f10, f7, paint, 7.0f, y3, 16, i10, 0.75f, this.L, true);
            if (this.M || (v21Var = this.e) == null) {
                return;
            }
            k31 k31Var = v21Var.a;
            k31Var.c.set((int) (width2 - round), (int) (width3 - round), (int) (width2 + round), (int) (width3 + round));
            k31Var.E.requestLayout();
            this.M = true;
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
        float f7;
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
        if ((TextUtils.isEmpty(this.G) && !this.r) || TextUtils.isEmpty(this.I)) {
            AndroidUtilities.runOnUIThread(new b31(this, 1));
            return;
        }
        String upperCase = this.r ? null : this.H ? this.G : this.G.toUpperCase();
        if (TextUtils.equals(upperCase, this.Q) && TextUtils.equals(this.I, this.R) && (num = this.O) != null && this.P != null && num.intValue() == i10 && this.P.intValue() == i11) {
            return;
        }
        final Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        TextPaint textPaint = new TextPaint(65);
        int i16 = -16777216;
        textPaint.setColor(-16777216);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        int A = org.telegram.messenger.em.A(20.0f, 2, createBitmap.getWidth());
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
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.ui.Cells.r6.i(" ", upperCase));
                if (!this.H) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Cells.y6(drawable), 0, 1, 33);
                }
                float measureText = textPaint.measureText(spannableStringBuilder, 1, spannableStringBuilder.length()) + drawable.getBounds().width();
                if (i17 > 1 || measureText <= A) {
                    int i19 = measureText > ((float) A) ? 2 : 1;
                    int dp = i19 > 1 ? AndroidUtilities.dp(2.0f) + (((int) (drawable.getBounds().width() + measureText)) / 2) : A;
                    if (dp > A) {
                        dp = AndroidUtilities.dp(4.0f) + (((int) (measureText + drawable.getBounds().width())) / 3);
                        i19 = 3;
                    }
                    int i20 = dp;
                    i13 = 0;
                    str = upperCase;
                    i12 = 2;
                    f7 = 30.0f;
                    staticLayout = org.telegram.ui.Components.uw0.c(spannableStringBuilder, textPaint, i20, Layout.Alignment.ALIGN_CENTER, 0.0f, false, null, Math.min(AndroidUtilities.dp(10.0f) + i20, createBitmap.getWidth()), i19, true);
                    float lineCount = (staticLayout != null ? 0 : staticLayout.getLineCount()) * (textPaint.descent() - textPaint.ascent());
                    int A2 = org.telegram.messenger.em.A(f7, i12, i10);
                    HashMap hashMap = new HashMap();
                    hashMap.put(cc.b.a, hc.d.c);
                    hashMap.put(cc.b.c, Integer.valueOf(i13));
                    TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
                    i14 = 3;
                    bitmap = null;
                    while (true) {
                        if (i14 < 5) {
                            i15 = -16777216;
                            break;
                        }
                        try {
                            hashMap.put(cc.b.d, Integer.valueOf(i14));
                            bitmap = telegramQRCodeWriter.encode(this.I, A2, A2, hashMap, null, 0.75f, 16777215, -16777216);
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
                    float f10 = i11;
                    float f11 = 0.15f * f10;
                    if (staticLayout != null && staticLayout.getLineCount() == 3) {
                        f11 = 0.13f * f10;
                    }
                    if (((ViewGroup) getParent()).getMeasuredWidth() >= ((ViewGroup) getParent()).getMeasuredHeight()) {
                        f11 = 0.09f * f10;
                    }
                    canvas.drawBitmap(bitmap, width, f11, new Paint(3));
                    Paint paint = new Paint(1);
                    paint.setColor(i15);
                    final float width2 = (bitmap.getWidth() * 0.5f) + width;
                    final float width3 = (bitmap.getWidth() * 0.5f) + f11;
                    canvas.drawCircle(width2, width3, i21 * 0.5f, paint);
                    if (staticLayout != null) {
                        canvas.save();
                        canvas.translate((canvas.getWidth() - staticLayout.getWidth()) * 0.5f, ((((canvas.getHeight() - (f11 + bitmap.getHeight())) - lineCount) * 0.5f) + (bitmap.getHeight() + f11)) - AndroidUtilities.dp(4.0f));
                        staticLayout.draw(canvas);
                        canvas.restore();
                        bitmap.recycle();
                    }
                    this.O = Integer.valueOf(i10);
                    this.P = Integer.valueOf(i11);
                    this.Q = str;
                    this.R = this.I;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.d31
                        @Override // java.lang.Runnable
                        public final void run() {
                            e31 e31Var = e31.this;
                            Bitmap bitmap2 = e31Var.h;
                            e31Var.h = createBitmap.extractAlpha();
                            if (!e31Var.S) {
                                e31Var.x.d(0.0f, true);
                            }
                            e31Var.S = false;
                            Bitmap bitmap3 = e31Var.n;
                            if (bitmap3 != null) {
                                bitmap3.recycle();
                            }
                            e31Var.n = bitmap2;
                            v21 v21Var = e31Var.e;
                            if (v21Var != null) {
                                float f12 = i21 * 0.5f;
                                float f13 = width2;
                                float f14 = width3;
                                k31 k31Var = v21Var.a;
                                k31Var.c.set((int) (f13 - f12), (int) (f14 - f12), (int) (f13 + f12), (int) (f14 + f12));
                                k31Var.E.requestLayout();
                                e31Var.M = true;
                            }
                            e31Var.invalidate();
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
        f7 = 30.0f;
        i13 = 0;
        staticLayout = null;
        float lineCount2 = (staticLayout != null ? 0 : staticLayout.getLineCount()) * (textPaint.descent() - textPaint.ascent());
        int A22 = org.telegram.messenger.em.A(f7, i12, i10);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cc.b.a, hc.d.c);
        hashMap2.put(cc.b.c, Integer.valueOf(i13));
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

    public final void c(String str, String str2, boolean z10, boolean z11) {
        this.K = true;
        this.G = str2;
        this.H = z10;
        if (z11) {
            TLRPC.TL_exportedContactToken cachedContactToken = MessagesController.getInstance(UserConfig.selectedAccount).getCachedContactToken();
            if (cachedContactToken != null) {
                this.I = cachedContactToken.url;
                this.J = cachedContactToken.expires;
            } else {
                this.I = null;
            }
        } else {
            this.I = str;
        }
        this.r = z11;
        Utilities.themeQueue.postRunnable(new c31(this, getWidth(), getHeight(), 0));
        invalidate();
        this.N.run();
    }

    public final void d(boolean z10) {
        if (this.r) {
            if (!z10) {
                this.w = null;
                return;
            }
            if (this.v == null) {
                this.v = new TextPaint(1);
            }
            this.v.setShader(this.d);
            this.v.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            this.v.setTextSize(AndroidUtilities.dp(25.0f));
            String str = this.G;
            if (str == null) {
                str = "";
            }
            this.w = org.telegram.ui.Components.uw0.c(Emoji.replaceEmoji(str, this.v.getFontMetricsInt(), false), this.v, getWidth(), Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1, true);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N.run();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.hj0 hj0Var = this.F;
        if (hj0Var != null) {
            hj0Var.stop();
            this.F.C(false);
            this.F = null;
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
        float f7;
        super.onDraw(canvas);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        float d = this.x.d(1.0f, false);
        boolean z10 = d > 0.0f && d < 1.0f;
        Paint paint = this.b;
        if (d < 1.0f) {
            if (z10) {
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
            if (z10) {
                float dp = AndroidUtilities.dp(120.0f);
                canvas.save();
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, d, getHeight() + dp, -dp));
                i10 = 255;
                i11 = 31;
                f7 = 120.0f;
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight() + dp, this.E);
                canvas.restore();
                canvas.restore();
                if (d > 0.0f) {
                    if (z10) {
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
                    if (z10) {
                        float dp2 = AndroidUtilities.dp(f7);
                        canvas.save();
                        float f10 = -dp2;
                        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, d, getHeight() + dp2, f10));
                        canvas.drawRect(0.0f, f10 - getHeight(), getWidth(), getHeight() + dp2, this.y);
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
                org.telegram.ui.Components.so0 so0Var = this.s;
                so0Var.setBounds(0, i12, width, dp4);
                so0Var.draw(canvas);
                return;
            }
        }
        i10 = 255;
        i11 = 31;
        f7 = 120.0f;
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
        float f7 = T;
        paint.setShadowLayer(dp, 0.0f, f7, 251658240);
        this.f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f);
        float f10 = i10;
        RectF rectF = new RectF(f7, f7, f10 - f7, getHeight() - f7);
        float f11 = U;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (this.K) {
            Utilities.themeQueue.postRunnable(new c31(this, i10, i11, 1));
        }
        float max = Math.max((getWidth() * 1.0f) / this.a.k.getWidth(), (getHeight() * 1.0f) / this.a.k.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        this.c.setLocalMatrix(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(max, max);
        matrix2.postTranslate(f10 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
        this.d.setLocalMatrix(matrix2);
    }
}
