package org.telegram.ui.Cells;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.yb0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final /* synthetic */ int U = 0;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public ObjectAnimator H;
    public float I;
    public final ArgbEvaluator J;
    public Drawable K;
    public final Paint L;
    public BitmapShader M;
    public boolean N;
    public final Matrix O;
    public Drawable P;
    public int Q;
    public long R;
    public boolean S;
    public final /* synthetic */ ja T;
    public final RadioButton a;
    public org.telegram.ui.ActionBar.f6 b;
    public final RectF c;
    public final Paint d;
    public Drawable e;
    public final TextPaint f;
    public final Drawable h;
    public final Drawable n;
    public boolean r;
    public boolean s;
    public float v;
    public int w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemesHorizontalListCell$InnerThemeView(ja jaVar, Context context) {
        super(context);
        this.T = jaVar;
        this.c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.J = new ArgbEvaluator();
        this.L = new Paint(3);
        this.O = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
        this.n = context.getResources().getDrawable(R.drawable.minibubble_out).mutate();
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        addView(radioButton, i7.f6.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int i10 = (f6Var.O && f6Var.U == org.telegram.ui.ActionBar.g6.n) ? -1 : f6Var.M;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i10, mode));
        this.n.setColorFilter(new PorterDuffColorFilter(this.b.p(), mode));
        double[] dArr = null;
        if (this.b.b == null) {
            d(false);
            this.e = null;
        } else {
            this.e = getResources().getDrawable(R.drawable.preview_dots).mutate();
            int o10 = this.b.o();
            this.y = o10;
            this.E = o10;
        }
        this.M = null;
        this.K = null;
        org.telegram.ui.ActionBar.f6 f6Var2 = this.b;
        int i11 = f6Var2.I;
        if (i11 != 0 && f6Var2.J != 0) {
            int o11 = this.b.o();
            org.telegram.ui.ActionBar.f6 f6Var3 = this.b;
            yb0 yb0Var = new yb0(true, o11, f6Var3.I, f6Var3.J, f6Var3.K);
            yb0Var.w(AndroidUtilities.dp(6.0f));
            this.K = yb0Var;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        } else if (i11 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.b.o(), this.b.I});
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(6.0f));
            this.K = gradientDrawable;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        } else if (f6Var2.L > 0 || f6Var2.c != null) {
            float dp = AndroidUtilities.dp(76.0f);
            float dp2 = AndroidUtilities.dp(97.0f);
            org.telegram.ui.ActionBar.f6 f6Var4 = this.b;
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(dp, dp2, f6Var4.c, f6Var4.b, f6Var4.L);
            if (scaledBitmap != null) {
                this.K = new BitmapDrawable(scaledBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(scaledBitmap, tileMode, tileMode);
                this.M = bitmapShader;
                this.L.setShader(bitmapShader);
                int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(this.K);
                dArr = AndroidUtilities.rgbToHsv(Color.red(calcDrawableColor[0]), Color.green(calcDrawableColor[0]), Color.blue(calcDrawableColor[0]));
            }
        } else if (f6Var2.o() != 0) {
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        }
        if (dArr == null || dArr[1] > 0.10000000149011612d || dArr[2] < 0.9599999785423279d) {
            this.N = false;
        } else {
            this.N = true;
        }
        if (this.b.o() == 0 && this.b.P && this.K == null) {
            yb0 Q = org.telegram.ui.ActionBar.g6.Q(100, 200);
            this.K = Q;
            Q.w(AndroidUtilities.dp(6.0f));
        }
        invalidate();
    }

    public final int b(int i10, int i11) {
        float f9 = this.I;
        if (f9 == 1.0f) {
            return i11;
        }
        return ((Integer) this.J.evaluate(f9, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }

    public final boolean c() {
        int s10;
        int intValue;
        String[] split;
        HashMap hashMap = this.T.W2;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        if (f6Var == null || f6Var.b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.b.b));
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                try {
                    int read = fileInputStream.read(ja.e3);
                    if (read == -1) {
                        break;
                    }
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i12 >= read) {
                            break;
                        }
                        byte[] bArr = ja.e3;
                        if (bArr[i12] == 10) {
                            int i14 = i12 - i13;
                            int i15 = i14 + 1;
                            String str = new String(bArr, i13, i14, "UTF-8");
                            if (str.startsWith("WLS=")) {
                                String substring = str.substring(4);
                                Uri parse = Uri.parse(substring);
                                this.b.e = parse.getQueryParameter("slug");
                                this.b.c = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(substring) + ".wp").getAbsolutePath();
                                String queryParameter = parse.getQueryParameter("mode");
                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= split.length) {
                                            break;
                                        }
                                        if ("blur".equals(split[i16])) {
                                            this.b.h = true;
                                            break;
                                        }
                                        i16++;
                                    }
                                }
                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                    try {
                                        String queryParameter2 = parse.getQueryParameter("bg_color");
                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                            this.b.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                this.b.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                            }
                                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                this.b.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                            }
                                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                this.b.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                            this.b.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                        }
                                    } catch (Exception unused2) {
                                    }
                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                        this.b.y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                    }
                                    org.telegram.ui.ActionBar.f6 f6Var2 = this.b;
                                    if (f6Var2.y == 0) {
                                        f6Var2.y = 50;
                                    }
                                }
                            } else {
                                if (str.startsWith("WPS")) {
                                    this.b.L = i15 + i11;
                                    z10 = true;
                                    break;
                                }
                                int indexOf = str.indexOf(61);
                                if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.e5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.g6.ra || s10 == org.telegram.ui.ActionBar.g6.Aa || s10 == org.telegram.ui.ActionBar.g6.Nd || s10 == org.telegram.ui.ActionBar.g6.Od || s10 == org.telegram.ui.ActionBar.g6.Pd || s10 == org.telegram.ui.ActionBar.g6.Qd)) {
                                    String substring2 = str.substring(indexOf + 1);
                                    if (substring2.length() <= 0 || substring2.charAt(0) != '#') {
                                        intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                    } else {
                                        try {
                                            intValue = Color.parseColor(substring2);
                                        } catch (Exception unused3) {
                                            intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                        }
                                    }
                                    if (s10 == org.telegram.ui.ActionBar.g6.ra) {
                                        this.b.M = intValue;
                                    } else if (s10 == org.telegram.ui.ActionBar.g6.Aa) {
                                        this.b.N = intValue;
                                    } else if (s10 == org.telegram.ui.ActionBar.g6.Nd) {
                                        this.b.H = intValue;
                                    } else if (s10 == org.telegram.ui.ActionBar.g6.Od) {
                                        this.b.I = intValue;
                                    } else if (s10 == org.telegram.ui.ActionBar.g6.Pd) {
                                        this.b.J = intValue;
                                    } else if (s10 == org.telegram.ui.ActionBar.g6.Qd) {
                                        this.b.K = intValue;
                                    }
                                }
                            }
                            i13 += i15;
                            i11 += i15;
                        }
                        i12++;
                    }
                    if (z10 || i10 == i11) {
                        break;
                    }
                    fileInputStream.getChannel().position(i11);
                    i10 = i11;
                } finally {
                }
            }
            fileInputStream.close();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        org.telegram.ui.ActionBar.f6 f6Var3 = this.b;
        if (f6Var3.c == null || f6Var3.f || new File(this.b.c).exists()) {
            this.b.P = true;
            return true;
        }
        if (hashMap.containsKey(this.b)) {
            return false;
        }
        org.telegram.ui.ActionBar.f6 f6Var4 = this.b;
        hashMap.put(f6Var4, f6Var4.e);
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        org.telegram.ui.ActionBar.f6 f6Var5 = this.b;
        tL_inputWallPaperSlug.slug = f6Var5.e;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(f6Var5.A).sendRequest(getwallpaper, new RequestDelegate() { // from class: org.telegram.ui.Cells.ga
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i17 = ThemesHorizontalListCell$InnerThemeView.U;
                AndroidUtilities.runOnUIThread(new ha(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
            }
        });
        return false;
    }

    public final void d(boolean z10) {
        int i10;
        int i11;
        this.C = this.w;
        this.D = this.x;
        this.E = this.y;
        this.F = this.A;
        int i12 = 0;
        org.telegram.ui.ActionBar.e6 k9 = this.b.k(false);
        if (k9 != null) {
            i12 = k9.c;
            i11 = k9.e;
            if (i11 == 0) {
                i11 = i12;
            }
            i10 = (int) k9.j;
            if (i10 == 0) {
                i10 = i12;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        this.w = org.telegram.ui.ActionBar.g6.B(f6Var, i12, (f6Var.O && f6Var.U == org.telegram.ui.ActionBar.g6.n) ? -1 : f6Var.M);
        org.telegram.ui.ActionBar.f6 f6Var2 = this.b;
        this.x = org.telegram.ui.ActionBar.g6.B(f6Var2, i11, f6Var2.p());
        org.telegram.ui.ActionBar.f6 f6Var3 = this.b;
        this.y = org.telegram.ui.ActionBar.g6.B(f6Var3, i10, f6Var3.o());
        this.A = this.x;
        this.B = this.b.U;
        ObjectAnimator objectAnimator = this.H;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z10) {
            setAccentState(1.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
        this.H = ofFloat;
        ofFloat.setDuration(200L);
        this.H.start();
    }

    public float getAccentState() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        ja jaVar = this.T;
        this.a.a(this.b == (jaVar.b3 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0()), false);
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        if (f6Var == null || (tL_theme = f6Var.B) == null || f6Var.Q) {
            return;
        }
        if (jaVar.V2.containsKey(FileLoader.getAttachFileName(tL_theme.document)) || jaVar.W2.containsKey(this.b)) {
            return;
        }
        this.b.Q = true;
        this.v = 0.0f;
        c();
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        if (this.B != this.b.U) {
            d(true);
        }
        int dp = this.s ? AndroidUtilities.dp(22.0f) : 0;
        int dp2 = AndroidUtilities.dp(11.0f);
        float f11 = dp;
        float f12 = dp2;
        float dp3 = AndroidUtilities.dp(76.0f) + dp;
        float dp4 = AndroidUtilities.dp(97.0f) + dp2;
        RectF rectF = this.c;
        rectF.set(f11, f12, dp3, dp4);
        String n10 = this.b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(this.s ? 10.0f : 15.0f)) - (this.r ? AndroidUtilities.dp(7.0f) : 0);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f;
        String charSequence = TextUtils.ellipsize(n10, textPaint, measuredWidth, truncateAt).toString();
        int ceil = (int) Math.ceil(textPaint.measureText(charSequence));
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        canvas.drawText(charSequence, ((AndroidUtilities.dp(76.0f) - ceil) / 2) + dp, AndroidUtilities.dp(131.0f), textPaint);
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        TLRPC.TL_theme tL_theme = f6Var.B;
        Paint paint = this.d;
        RadioButton radioButton = this.a;
        if (tL_theme == null || (tL_theme.document != null && f6Var.Q)) {
            paint.setColor(b(this.E, this.y));
            boolean z10 = this.G;
            Drawable drawable = this.n;
            Drawable drawable2 = this.h;
            if (z10) {
                f9 = 6.0f;
                f10 = 1.0f;
                int b10 = b(this.C, this.w);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.D, this.x), mode));
                this.G = false;
            } else {
                f9 = 6.0f;
                f10 = 1.0f;
            }
            Drawable drawable3 = this.K;
            if (drawable3 == null) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), paint);
            } else if (this.M != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                float width = bitmapDrawable.getBitmap().getWidth();
                float height = bitmapDrawable.getBitmap().getHeight();
                float width2 = width / rectF.width();
                float height2 = height / rectF.height();
                Matrix matrix = this.O;
                matrix.reset();
                float min = f10 / Math.min(width2, height2);
                float f13 = width / height2;
                if (f13 > rectF.width()) {
                    matrix.setTranslate(f11 - ((f13 - rectF.width()) / 2.0f), f12);
                } else {
                    matrix.setTranslate(f11, f12 - (((height / width2) - rectF.height()) / 2.0f));
                }
                matrix.preScale(min, min);
                this.M.setLocalMatrix(matrix);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), this.L);
            } else {
                drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.K.draw(canvas);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.f6 f6Var2 = this.b;
            if (f6Var2.T != 0) {
                if ("Day".equals(f6Var2.a) || "Arctic Blue".equals(this.b.a)) {
                    radioButton.b(-5000269, b(this.F, this.A));
                    org.telegram.ui.ActionBar.g6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), org.telegram.ui.ActionBar.g6.X1);
                }
            } else if (this.N) {
                radioButton.b(-5000269, f6Var2.p());
                org.telegram.ui.ActionBar.g6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), org.telegram.ui.ActionBar.g6.X1);
            }
            drawable2.setBounds(AndroidUtilities.dp(f9) + dp, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(49.0f) + dp, AndroidUtilities.dp(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(AndroidUtilities.dp(27.0f) + dp, AndroidUtilities.dp(41.0f), AndroidUtilities.dp(70.0f) + dp, AndroidUtilities.dp(55.0f));
            drawable.draw(canvas);
            if (this.e != null && this.T.b3 == 0) {
                int dp5 = ((int) rectF.right) - AndroidUtilities.dp(16.0f);
                int dp6 = AndroidUtilities.dp(f9) + ((int) rectF.top);
                Drawable drawable4 = this.e;
                drawable4.setBounds(dp5, dp6, drawable4.getIntrinsicWidth() + dp5, this.e.getIntrinsicHeight() + dp6);
                this.e.draw(canvas);
            }
        } else {
            f9 = 6.0f;
            f10 = 1.0f;
        }
        org.telegram.ui.ActionBar.f6 f6Var3 = this.b;
        TLRPC.TL_theme tL_theme2 = f6Var3.B;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.g6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), org.telegram.ui.ActionBar.g6.X1);
            if (this.P != null) {
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false);
                if (this.Q != w02) {
                    Drawable drawable5 = this.P;
                    this.Q = w02;
                    org.telegram.ui.ActionBar.g6.w1(w02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.P.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.P.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.P;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.P.getIntrinsicHeight() + centerY);
                this.P.draw(canvas);
                return;
            }
            return;
        }
        if ((tL_theme2 == null || f6Var3.Q) && this.v <= 0.0f) {
            if (radioButton.getAlpha() != f10) {
                radioButton.setAlpha(1.0f);
                return;
            }
            return;
        }
        radioButton.setAlpha(f10 - this.v);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        paint.setAlpha((int) (this.v * 255.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), paint);
        if (this.P != null) {
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false);
            if (this.Q != w03) {
                Drawable drawable7 = this.P;
                this.Q = w03;
                org.telegram.ui.ActionBar.g6.w1(w03, drawable7);
            }
            int centerX2 = (int) (rectF.centerX() - (this.P.getIntrinsicWidth() / 2));
            int centerY2 = (int) (rectF.centerY() - (this.P.getIntrinsicHeight() / 2));
            this.P.setAlpha((int) (this.v * 255.0f));
            Drawable drawable8 = this.P;
            drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.P.getIntrinsicHeight() + centerY2);
            this.P.draw(canvas);
        }
        if (this.b.Q) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min2 = Math.min(17L, elapsedRealtime - this.R);
            this.R = elapsedRealtime;
            float f14 = this.v - (min2 / 180.0f);
            this.v = f14;
            if (f14 < 0.0f) {
                this.v = 0.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String n10 = this.b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(n10);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.a.f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrMoreOptions)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.r ? 22 : 15) + 76 + (this.s ? 22 : 0)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(148.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (this.e != null && (f6Var = this.b) != null && (f6Var.B == null || f6Var.Q)) {
            ja jaVar = this.T;
            if (jaVar.b3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x4 = motionEvent.getX();
                    float y8 = motionEvent.getY();
                    RectF rectF = this.c;
                    if (x4 > rectF.centerX() && y8 < rectF.centerY() - AndroidUtilities.dp(10.0f)) {
                        if (action == 0) {
                            this.S = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            jaVar.z1(this.b);
                        }
                    }
                    if (action == 1) {
                        this.S = false;
                    }
                }
                return this.S;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentState(float f9) {
        this.I = f9;
        this.G = true;
        invalidate();
    }
}
