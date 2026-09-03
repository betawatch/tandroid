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
import org.telegram.ui.Components.ec0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final /* synthetic */ int V = 0;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public ObjectAnimator I;
    public float J;
    public final ArgbEvaluator K;
    public Drawable L;
    public final Paint M;
    public BitmapShader N;
    public boolean O;
    public final Matrix P;
    public Drawable Q;
    public int R;
    public long S;
    public boolean T;
    public final /* synthetic */ ka U;
    public final RadioButton a;
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
    public ThemesHorizontalListCell$InnerThemeView(ka kaVar, Context context) {
        super(context);
        this.U = kaVar;
        this.c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.K = new ArgbEvaluator();
        this.M = new Paint(3);
        this.P = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
        this.n = context.getResources().getDrawable(R.drawable.minibubble_out).mutate();
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        addView(radioButton, k7.b6.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        int i10 = (i6Var.P && i6Var.V == org.telegram.ui.ActionBar.j6.n) ? -1 : i6Var.N;
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
            this.F = o10;
        }
        this.N = null;
        this.L = null;
        org.telegram.ui.ActionBar.i6 i6Var2 = this.b;
        int i11 = i6Var2.J;
        if (i11 != 0 && i6Var2.K != 0) {
            int o11 = this.b.o();
            org.telegram.ui.ActionBar.i6 i6Var3 = this.b;
            ec0 ec0Var = new ec0(true, o11, i6Var3.J, i6Var3.K, i6Var3.L);
            ec0Var.w(AndroidUtilities.dp(6.0f));
            this.L = ec0Var;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        } else if (i11 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.b.o(), this.b.J});
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(6.0f));
            this.L = gradientDrawable;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        } else if (i6Var2.M > 0 || i6Var2.c != null) {
            float dp = AndroidUtilities.dp(76.0f);
            float dp2 = AndroidUtilities.dp(97.0f);
            org.telegram.ui.ActionBar.i6 i6Var4 = this.b;
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(dp, dp2, i6Var4.c, i6Var4.b, i6Var4.M);
            if (scaledBitmap != null) {
                this.L = new BitmapDrawable(scaledBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(scaledBitmap, tileMode, tileMode);
                this.N = bitmapShader;
                this.M.setShader(bitmapShader);
                int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(this.L);
                dArr = AndroidUtilities.rgbToHsv(Color.red(calcDrawableColor[0]), Color.green(calcDrawableColor[0]), Color.blue(calcDrawableColor[0]));
            }
        } else if (i6Var2.o() != 0) {
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        }
        if (dArr == null || dArr[1] > 0.10000000149011612d || dArr[2] < 0.9599999785423279d) {
            this.O = false;
        } else {
            this.O = true;
        }
        if (this.b.o() == 0 && this.b.Q && this.L == null) {
            ec0 Q = org.telegram.ui.ActionBar.j6.Q(100, 200);
            this.L = Q;
            Q.w(AndroidUtilities.dp(6.0f));
        }
        invalidate();
    }

    public final int b(int i10, int i11) {
        float f10 = this.J;
        if (f10 == 1.0f) {
            return i11;
        }
        return ((Integer) this.K.evaluate(f10, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }

    public final boolean c() {
        int s6;
        int intValue;
        String[] split;
        HashMap hashMap = this.U.X2;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        if (i6Var == null || i6Var.b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.b.b));
            int i10 = 0;
            boolean z4 = false;
            while (true) {
                try {
                    int read = fileInputStream.read(ka.f3);
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
                        byte[] bArr = ka.f3;
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
                                    this.b.M = i15 + i11;
                                    z4 = true;
                                    break;
                                }
                                int indexOf = str.indexOf(61);
                                if (indexOf != -1 && ((s6 = org.telegram.ui.ActionBar.h5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.j6.ra || s6 == org.telegram.ui.ActionBar.j6.Aa || s6 == org.telegram.ui.ActionBar.j6.Nd || s6 == org.telegram.ui.ActionBar.j6.Od || s6 == org.telegram.ui.ActionBar.j6.Pd || s6 == org.telegram.ui.ActionBar.j6.Qd)) {
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
                                    if (s6 == org.telegram.ui.ActionBar.j6.ra) {
                                        this.b.N = intValue;
                                    } else if (s6 == org.telegram.ui.ActionBar.j6.Aa) {
                                        this.b.O = intValue;
                                    } else if (s6 == org.telegram.ui.ActionBar.j6.Nd) {
                                        this.b.I = intValue;
                                    } else if (s6 == org.telegram.ui.ActionBar.j6.Od) {
                                        this.b.J = intValue;
                                    } else if (s6 == org.telegram.ui.ActionBar.j6.Pd) {
                                        this.b.K = intValue;
                                    } else if (s6 == org.telegram.ui.ActionBar.j6.Qd) {
                                        this.b.L = intValue;
                                    }
                                }
                            }
                            i13 += i15;
                            i11 += i15;
                        }
                        i12++;
                    }
                    if (z4 || i10 == i11) {
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
            this.b.Q = true;
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
        ConnectionsManager.getInstance(i6Var5.B).sendRequest(getwallpaper, new RequestDelegate() { // from class: org.telegram.ui.Cells.ha
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i17 = ThemesHorizontalListCell$InnerThemeView.V;
                AndroidUtilities.runOnUIThread(new ia(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
            }
        });
        return false;
    }

    public final void d(boolean z4) {
        int i10;
        int i11;
        this.D = this.w;
        this.E = this.x;
        this.F = this.y;
        this.G = this.B;
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
        this.w = org.telegram.ui.ActionBar.j6.B(i6Var, i12, (i6Var.P && i6Var.V == org.telegram.ui.ActionBar.j6.n) ? -1 : i6Var.N);
        org.telegram.ui.ActionBar.i6 i6Var2 = this.b;
        this.x = org.telegram.ui.ActionBar.j6.B(i6Var2, i11, i6Var2.p());
        org.telegram.ui.ActionBar.i6 i6Var3 = this.b;
        this.y = org.telegram.ui.ActionBar.j6.B(i6Var3, i10, i6Var3.o());
        this.B = this.x;
        this.C = this.b.V;
        ObjectAnimator objectAnimator = this.I;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z4) {
            setAccentState(1.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
        this.I = ofFloat;
        ofFloat.setDuration(200L);
        this.I.start();
    }

    public float getAccentState() {
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        ka kaVar = this.U;
        this.a.a(this.b == (kaVar.c3 == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0()), false);
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        if (i6Var == null || (tL_theme = i6Var.C) == null || i6Var.R) {
            return;
        }
        if (kaVar.W2.containsKey(FileLoader.getAttachFileName(tL_theme.document)) || kaVar.X2.containsKey(this.b)) {
            return;
        }
        this.b.R = true;
        this.v = 0.0f;
        c();
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.C != this.b.V) {
            d(true);
        }
        int dp = this.s ? AndroidUtilities.dp(22.0f) : 0;
        int dp2 = AndroidUtilities.dp(11.0f);
        float f12 = dp;
        float f13 = dp2;
        float dp3 = AndroidUtilities.dp(76.0f) + dp;
        float dp4 = AndroidUtilities.dp(97.0f) + dp2;
        RectF rectF = this.c;
        rectF.set(f12, f13, dp3, dp4);
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
        TLRPC.TL_theme tL_theme = i6Var.C;
        Paint paint = this.d;
        RadioButton radioButton = this.a;
        if (tL_theme == null || (tL_theme.document != null && i6Var.R)) {
            paint.setColor(b(this.F, this.y));
            boolean z4 = this.H;
            Drawable drawable = this.n;
            Drawable drawable2 = this.h;
            if (z4) {
                f10 = 6.0f;
                f11 = 1.0f;
                int b10 = b(this.D, this.w);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.E, this.x), mode));
                this.H = false;
            } else {
                f10 = 6.0f;
                f11 = 1.0f;
            }
            Drawable drawable3 = this.L;
            if (drawable3 == null) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            } else if (this.N != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                float width = bitmapDrawable.getBitmap().getWidth();
                float height = bitmapDrawable.getBitmap().getHeight();
                float width2 = width / rectF.width();
                float height2 = height / rectF.height();
                Matrix matrix = this.P;
                matrix.reset();
                float min = f11 / Math.min(width2, height2);
                float f14 = width / height2;
                if (f14 > rectF.width()) {
                    matrix.setTranslate(f12 - ((f14 - rectF.width()) / 2.0f), f13);
                } else {
                    matrix.setTranslate(f12, f13 - (((height / width2) - rectF.height()) / 2.0f));
                }
                matrix.preScale(min, min);
                this.N.setLocalMatrix(matrix);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), this.M);
            } else {
                drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.L.draw(canvas);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.i6 i6Var2 = this.b;
            if (i6Var2.U != 0) {
                if ("Day".equals(i6Var2.a) || "Arctic Blue".equals(this.b.a)) {
                    radioButton.b(-5000269, b(this.G, this.B));
                    org.telegram.ui.ActionBar.j6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.j6.X1);
                }
            } else if (this.O) {
                radioButton.b(-5000269, i6Var2.p());
                org.telegram.ui.ActionBar.j6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.j6.X1);
            }
            drawable2.setBounds(AndroidUtilities.dp(f10) + dp, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(49.0f) + dp, AndroidUtilities.dp(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(AndroidUtilities.dp(27.0f) + dp, AndroidUtilities.dp(41.0f), AndroidUtilities.dp(70.0f) + dp, AndroidUtilities.dp(55.0f));
            drawable.draw(canvas);
            if (this.e != null && this.U.c3 == 0) {
                int dp5 = ((int) rectF.right) - AndroidUtilities.dp(16.0f);
                int dp6 = AndroidUtilities.dp(f10) + ((int) rectF.top);
                Drawable drawable4 = this.e;
                drawable4.setBounds(dp5, dp6, drawable4.getIntrinsicWidth() + dp5, this.e.getIntrinsicHeight() + dp6);
                this.e.draw(canvas);
            }
        } else {
            f10 = 6.0f;
            f11 = 1.0f;
        }
        org.telegram.ui.ActionBar.i6 i6Var3 = this.b;
        TLRPC.TL_theme tL_theme2 = i6Var3.C;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.j6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.j6.X1);
            if (this.Q != null) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false);
                if (this.R != w02) {
                    Drawable drawable5 = this.Q;
                    this.R = w02;
                    org.telegram.ui.ActionBar.j6.w1(w02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.Q.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.Q.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.Q;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.Q.getIntrinsicHeight() + centerY);
                this.Q.draw(canvas);
                return;
            }
            return;
        }
        if ((tL_theme2 == null || i6Var3.R) && this.v <= 0.0f) {
            if (radioButton.getAlpha() != f11) {
                radioButton.setAlpha(1.0f);
                return;
            }
            return;
        }
        radioButton.setAlpha(f11 - this.v);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        paint.setAlpha((int) (this.v * 255.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
        if (this.Q != null) {
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false);
            if (this.R != w03) {
                Drawable drawable7 = this.Q;
                this.R = w03;
                org.telegram.ui.ActionBar.j6.w1(w03, drawable7);
            }
            int centerX2 = (int) (rectF.centerX() - (this.Q.getIntrinsicWidth() / 2));
            int centerY2 = (int) (rectF.centerY() - (this.Q.getIntrinsicHeight() / 2));
            this.Q.setAlpha((int) (this.v * 255.0f));
            Drawable drawable8 = this.Q;
            drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.Q.getIntrinsicHeight() + centerY2);
            this.Q.draw(canvas);
        }
        if (this.b.R) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min2 = Math.min(17L, elapsedRealtime - this.S);
            this.S = elapsedRealtime;
            float f15 = this.v - (min2 / 180.0f);
            this.v = f15;
            if (f15 < 0.0f) {
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
        if (this.e != null && (i6Var = this.b) != null && (i6Var.C == null || i6Var.R)) {
            ka kaVar = this.U;
            if (kaVar.c3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    RectF rectF = this.c;
                    if (x10 > rectF.centerX() && y10 < rectF.centerY() - AndroidUtilities.dp(10.0f)) {
                        if (action == 0) {
                            this.T = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            kaVar.y1(this.b);
                        }
                    }
                    if (action == 1) {
                        this.T = false;
                    }
                }
                return this.T;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentState(float f10) {
        this.J = f10;
        this.H = true;
        invalidate();
    }
}
