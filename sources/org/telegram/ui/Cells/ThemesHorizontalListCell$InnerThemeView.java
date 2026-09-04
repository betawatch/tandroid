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
import org.telegram.ui.Components.dc0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final /* synthetic */ int b0 = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public ObjectAnimator L;
    public float M;
    public final ArgbEvaluator N;
    public Drawable O;
    public final Paint P;
    public BitmapShader Q;
    public boolean R;
    public final Matrix S;
    public Drawable T;
    public int U;
    public long V;
    public boolean W;
    public final RadioButton a;
    public final /* synthetic */ pa a0;
    public org.telegram.ui.ActionBar.i6 b;
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
    public ThemesHorizontalListCell$InnerThemeView(pa paVar, Context context) {
        super(context);
        this.a0 = paVar;
        this.c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.N = new ArgbEvaluator();
        this.P = new Paint(3);
        this.S = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
        this.n = context.getResources().getDrawable(R.drawable.minibubble_out).mutate();
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        addView(radioButton, w7.x5.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        int i10 = (i6Var.S && i6Var.Y == org.telegram.ui.ActionBar.j6.n) ? -1 : i6Var.Q;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i10, mode));
        this.n.setColorFilter(new PorterDuffColorFilter(this.b.p(), mode));
        double[] dArr = null;
        if (this.b.b == null) {
            d(false);
            this.e = null;
        } else {
            this.e = getResources().getDrawable(R.drawable.preview_dots).mutate();
            int o9 = this.b.o();
            this.y = o9;
            this.I = o9;
        }
        this.Q = null;
        this.O = null;
        org.telegram.ui.ActionBar.i6 i6Var2 = this.b;
        int i11 = i6Var2.M;
        if (i11 != 0 && i6Var2.N != 0) {
            int o10 = this.b.o();
            org.telegram.ui.ActionBar.i6 i6Var3 = this.b;
            dc0 dc0Var = new dc0(true, o10, i6Var3.M, i6Var3.N, i6Var3.O);
            dc0Var.w(AndroidUtilities.dp(6.0f));
            this.O = dc0Var;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        } else if (i11 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.b.o(), this.b.M});
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(6.0f));
            this.O = gradientDrawable;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        } else if (i6Var2.P > 0 || i6Var2.c != null) {
            float dp = AndroidUtilities.dp(76.0f);
            float dp2 = AndroidUtilities.dp(97.0f);
            org.telegram.ui.ActionBar.i6 i6Var4 = this.b;
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(dp, dp2, i6Var4.c, i6Var4.b, i6Var4.P);
            if (scaledBitmap != null) {
                this.O = new BitmapDrawable(scaledBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(scaledBitmap, tileMode, tileMode);
                this.Q = bitmapShader;
                this.P.setShader(bitmapShader);
                int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(this.O);
                dArr = AndroidUtilities.rgbToHsv(Color.red(calcDrawableColor[0]), Color.green(calcDrawableColor[0]), Color.blue(calcDrawableColor[0]));
            }
        } else if (i6Var2.o() != 0) {
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        }
        if (dArr == null || dArr[1] > 0.10000000149011612d || dArr[2] < 0.9599999785423279d) {
            this.R = false;
        } else {
            this.R = true;
        }
        if (this.b.o() == 0 && this.b.T && this.O == null) {
            dc0 Q = org.telegram.ui.ActionBar.j6.Q(100, 200);
            this.O = Q;
            Q.w(AndroidUtilities.dp(6.0f));
        }
        invalidate();
    }

    public final int b(int i10, int i11) {
        float f7 = this.M;
        if (f7 == 1.0f) {
            return i11;
        }
        return ((Integer) this.N.evaluate(f7, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }

    public final boolean c() {
        int s10;
        int intValue;
        String[] split;
        HashMap hashMap = this.a0.a3;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        if (i6Var == null || i6Var.b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.b.b));
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                try {
                    int read = fileInputStream.read(pa.i3);
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
                        byte[] bArr = pa.i3;
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
                                    org.telegram.ui.ActionBar.i6 i6Var2 = this.b;
                                    if (i6Var2.y == 0) {
                                        i6Var2.y = 50;
                                    }
                                }
                            } else {
                                if (str.startsWith("WPS")) {
                                    this.b.P = i15 + i11;
                                    z10 = true;
                                    break;
                                }
                                int indexOf = str.indexOf(61);
                                if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.g5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.j6.ra || s10 == org.telegram.ui.ActionBar.j6.Aa || s10 == org.telegram.ui.ActionBar.j6.Nd || s10 == org.telegram.ui.ActionBar.j6.Od || s10 == org.telegram.ui.ActionBar.j6.Pd || s10 == org.telegram.ui.ActionBar.j6.Qd)) {
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
                                    if (s10 == org.telegram.ui.ActionBar.j6.ra) {
                                        this.b.Q = intValue;
                                    } else if (s10 == org.telegram.ui.ActionBar.j6.Aa) {
                                        this.b.R = intValue;
                                    } else if (s10 == org.telegram.ui.ActionBar.j6.Nd) {
                                        this.b.L = intValue;
                                    } else if (s10 == org.telegram.ui.ActionBar.j6.Od) {
                                        this.b.M = intValue;
                                    } else if (s10 == org.telegram.ui.ActionBar.j6.Pd) {
                                        this.b.N = intValue;
                                    } else if (s10 == org.telegram.ui.ActionBar.j6.Qd) {
                                        this.b.O = intValue;
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
        org.telegram.ui.ActionBar.i6 i6Var3 = this.b;
        if (i6Var3.c == null || i6Var3.f || new File(this.b.c).exists()) {
            this.b.T = true;
            return true;
        }
        if (hashMap.containsKey(this.b)) {
            return false;
        }
        org.telegram.ui.ActionBar.i6 i6Var4 = this.b;
        hashMap.put(i6Var4, i6Var4.e);
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        org.telegram.ui.ActionBar.i6 i6Var5 = this.b;
        tL_inputWallPaperSlug.slug = i6Var5.e;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(i6Var5.E).sendRequest(getwallpaper, new RequestDelegate() { // from class: org.telegram.ui.Cells.ma
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i17 = ThemesHorizontalListCell$InnerThemeView.b0;
                AndroidUtilities.runOnUIThread(new na(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
            }
        });
        return false;
    }

    public final void d(boolean z10) {
        int i10;
        int i11;
        this.G = this.w;
        this.H = this.x;
        this.I = this.y;
        this.J = this.E;
        int i12 = 0;
        org.telegram.ui.ActionBar.h6 k10 = this.b.k(false);
        if (k10 != null) {
            i12 = k10.c;
            i11 = k10.e;
            if (i11 == 0) {
                i11 = i12;
            }
            i10 = (int) k10.j;
            if (i10 == 0) {
                i10 = i12;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        this.w = org.telegram.ui.ActionBar.j6.B(i6Var, i12, (i6Var.S && i6Var.Y == org.telegram.ui.ActionBar.j6.n) ? -1 : i6Var.Q);
        org.telegram.ui.ActionBar.i6 i6Var2 = this.b;
        this.x = org.telegram.ui.ActionBar.j6.B(i6Var2, i11, i6Var2.p());
        org.telegram.ui.ActionBar.i6 i6Var3 = this.b;
        this.y = org.telegram.ui.ActionBar.j6.B(i6Var3, i10, i6Var3.o());
        this.E = this.x;
        this.F = this.b.Y;
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z10) {
            setAccentState(1.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
        this.L = ofFloat;
        ofFloat.setDuration(200L);
        this.L.start();
    }

    public float getAccentState() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        pa paVar = this.a0;
        this.a.a(this.b == (paVar.f3 == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0()), false);
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        if (i6Var == null || (tL_theme = i6Var.F) == null || i6Var.U) {
            return;
        }
        if (paVar.Z2.containsKey(FileLoader.getAttachFileName(tL_theme.document)) || paVar.a3.containsKey(this.b)) {
            return;
        }
        this.b.U = true;
        this.v = 0.0f;
        c();
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        if (this.F != this.b.Y) {
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
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        canvas.drawText(charSequence, ((AndroidUtilities.dp(76.0f) - ceil) / 2) + dp, AndroidUtilities.dp(131.0f), textPaint);
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        TLRPC.TL_theme tL_theme = i6Var.F;
        Paint paint = this.d;
        RadioButton radioButton = this.a;
        if (tL_theme == null || (tL_theme.document != null && i6Var.U)) {
            paint.setColor(b(this.I, this.y));
            boolean z10 = this.K;
            Drawable drawable = this.n;
            Drawable drawable2 = this.h;
            if (z10) {
                f7 = 6.0f;
                f10 = 1.0f;
                int b10 = b(this.G, this.w);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.H, this.x), mode));
                this.K = false;
            } else {
                f7 = 6.0f;
                f10 = 1.0f;
            }
            Drawable drawable3 = this.O;
            if (drawable3 == null) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint);
            } else if (this.Q != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                float width = bitmapDrawable.getBitmap().getWidth();
                float height = bitmapDrawable.getBitmap().getHeight();
                float width2 = width / rectF.width();
                float height2 = height / rectF.height();
                Matrix matrix = this.S;
                matrix.reset();
                float min = f10 / Math.min(width2, height2);
                float f13 = width / height2;
                if (f13 > rectF.width()) {
                    matrix.setTranslate(f11 - ((f13 - rectF.width()) / 2.0f), f12);
                } else {
                    matrix.setTranslate(f11, f12 - (((height / width2) - rectF.height()) / 2.0f));
                }
                matrix.preScale(min, min);
                this.Q.setLocalMatrix(matrix);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), this.P);
            } else {
                drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.O.draw(canvas);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.i6 i6Var2 = this.b;
            if (i6Var2.X != 0) {
                if ("Day".equals(i6Var2.a) || "Arctic Blue".equals(this.b.a)) {
                    radioButton.b(-5000269, b(this.J, this.E));
                    org.telegram.ui.ActionBar.j6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), org.telegram.ui.ActionBar.j6.X1);
                }
            } else if (this.R) {
                radioButton.b(-5000269, i6Var2.p());
                org.telegram.ui.ActionBar.j6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), org.telegram.ui.ActionBar.j6.X1);
            }
            drawable2.setBounds(AndroidUtilities.dp(f7) + dp, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(49.0f) + dp, AndroidUtilities.dp(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(AndroidUtilities.dp(27.0f) + dp, AndroidUtilities.dp(41.0f), AndroidUtilities.dp(70.0f) + dp, AndroidUtilities.dp(55.0f));
            drawable.draw(canvas);
            if (this.e != null && this.a0.f3 == 0) {
                int dp5 = ((int) rectF.right) - AndroidUtilities.dp(16.0f);
                int dp6 = AndroidUtilities.dp(f7) + ((int) rectF.top);
                Drawable drawable4 = this.e;
                drawable4.setBounds(dp5, dp6, drawable4.getIntrinsicWidth() + dp5, this.e.getIntrinsicHeight() + dp6);
                this.e.draw(canvas);
            }
        } else {
            f7 = 6.0f;
            f10 = 1.0f;
        }
        org.telegram.ui.ActionBar.i6 i6Var3 = this.b;
        TLRPC.TL_theme tL_theme2 = i6Var3.F;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.j6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), org.telegram.ui.ActionBar.j6.X1);
            if (this.T != null) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false);
                if (this.U != w02) {
                    Drawable drawable5 = this.T;
                    this.U = w02;
                    org.telegram.ui.ActionBar.j6.w1(w02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.T.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.T.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.T;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.T.getIntrinsicHeight() + centerY);
                this.T.draw(canvas);
                return;
            }
            return;
        }
        if ((tL_theme2 == null || i6Var3.U) && this.v <= 0.0f) {
            if (radioButton.getAlpha() != f10) {
                radioButton.setAlpha(1.0f);
                return;
            }
            return;
        }
        radioButton.setAlpha(f10 - this.v);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        paint.setAlpha((int) (this.v * 255.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint);
        if (this.T != null) {
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false);
            if (this.U != w03) {
                Drawable drawable7 = this.T;
                this.U = w03;
                org.telegram.ui.ActionBar.j6.w1(w03, drawable7);
            }
            int centerX2 = (int) (rectF.centerX() - (this.T.getIntrinsicWidth() / 2));
            int centerY2 = (int) (rectF.centerY() - (this.T.getIntrinsicHeight() / 2));
            this.T.setAlpha((int) (this.v * 255.0f));
            Drawable drawable8 = this.T;
            drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.T.getIntrinsicHeight() + centerY2);
            this.T.draw(canvas);
        }
        if (this.b.U) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min2 = Math.min(17L, elapsedRealtime - this.V);
            this.V = elapsedRealtime;
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
        org.telegram.ui.ActionBar.i6 i6Var;
        if (this.e != null && (i6Var = this.b) != null && (i6Var.F == null || i6Var.U)) {
            pa paVar = this.a0;
            if (paVar.f3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    RectF rectF = this.c;
                    if (x10 > rectF.centerX() && y3 < rectF.centerY() - AndroidUtilities.dp(10.0f)) {
                        if (action == 0) {
                            this.W = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            paVar.y1(this.b);
                        }
                    }
                    if (action == 1) {
                        this.W = false;
                    }
                }
                return this.W;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentState(float f7) {
        this.M = f7;
        this.K = true;
        invalidate();
    }
}
