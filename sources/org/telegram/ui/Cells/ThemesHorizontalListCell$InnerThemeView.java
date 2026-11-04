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
import b8.mf;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.la0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final /* synthetic */ int c0 = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public ObjectAnimator M;
    public float N;
    public final ArgbEvaluator O;
    public Drawable P;
    public final Paint Q;
    public BitmapShader R;
    public boolean S;
    public final Matrix T;
    public Drawable U;
    public int V;
    public long W;
    public final RadioButton a;
    public boolean a0;
    public org.telegram.ui.ActionBar.j6 b;
    public final /* synthetic */ ga b0;
    public final RectF c;
    public final Paint d;
    public Drawable e;
    public final TextPaint f;
    public final Drawable h;
    public final Drawable n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemesHorizontalListCell$InnerThemeView(ga gaVar, Context context) {
        super(context);
        this.b0 = gaVar;
        this.c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.O = new ArgbEvaluator();
        this.Q = new Paint(3);
        this.T = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
        this.n = k2.p1.g(context, R.drawable.minibubble_out);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        addView(radioButton, mf.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        org.telegram.ui.ActionBar.j6 j6Var = this.b;
        int i3 = (j6Var.T && j6Var.Z == org.telegram.ui.ActionBar.k6.n) ? -1 : j6Var.R;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i3, mode));
        this.n.setColorFilter(new PorterDuffColorFilter(this.b.p(), mode));
        double[] dArr = null;
        if (this.b.b == null) {
            d(false);
            this.e = null;
        } else {
            this.e = getResources().getDrawable(R.drawable.preview_dots).mutate();
            int o10 = this.b.o();
            this.E = o10;
            this.J = o10;
        }
        this.R = null;
        this.P = null;
        org.telegram.ui.ActionBar.j6 j6Var2 = this.b;
        int i10 = j6Var2.N;
        if (i10 != 0 && j6Var2.O != 0) {
            int o11 = this.b.o();
            org.telegram.ui.ActionBar.j6 j6Var3 = this.b;
            la0 la0Var = new la0(true, o11, j6Var3.N, j6Var3.O, j6Var3.P);
            la0Var.v(org.telegram.messenger.g0.L(6.0f));
            this.P = la0Var;
            dArr = org.telegram.messenger.g0.e3(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        } else if (i10 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.b.o(), this.b.N});
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(6.0f));
            this.P = gradientDrawable;
            dArr = org.telegram.messenger.g0.e3(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        } else if (j6Var2.Q > 0 || j6Var2.c != null) {
            float L = org.telegram.messenger.g0.L(76.0f);
            float L2 = org.telegram.messenger.g0.L(97.0f);
            org.telegram.ui.ActionBar.j6 j6Var4 = this.b;
            Bitmap e12 = org.telegram.messenger.g0.e1(L, L2, j6Var4.c, j6Var4.b, j6Var4.Q);
            if (e12 != null) {
                this.P = new BitmapDrawable(e12);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(e12, tileMode, tileMode);
                this.R = bitmapShader;
                this.Q.setShader(bitmapShader);
                int[] q10 = org.telegram.messenger.g0.q(this.P);
                dArr = org.telegram.messenger.g0.e3(Color.red(q10[0]), Color.green(q10[0]), Color.blue(q10[0]));
            }
        } else if (j6Var2.o() != 0) {
            dArr = org.telegram.messenger.g0.e3(Color.red(this.b.o()), Color.green(this.b.o()), Color.blue(this.b.o()));
        }
        if (dArr == null || dArr[1] > 0.10000000149011612d || dArr[2] < 0.9599999785423279d) {
            this.S = false;
        } else {
            this.S = true;
        }
        if (this.b.o() == 0 && this.b.U && this.P == null) {
            la0 S = org.telegram.ui.ActionBar.k6.S(100, hs.e3);
            this.P = S;
            S.v(org.telegram.messenger.g0.L(6.0f));
        }
        invalidate();
    }

    public final int b(int i3, int i10) {
        float f10 = this.N;
        if (f10 == 1.0f) {
            return i10;
        }
        return ((Integer) this.O.evaluate(f10, Integer.valueOf(i3), Integer.valueOf(i10))).intValue();
    }

    public final boolean c() {
        char c2;
        int h;
        int intValue;
        String[] split;
        HashMap hashMap = this.b0.i3;
        org.telegram.ui.ActionBar.j6 j6Var = this.b;
        if (j6Var == null || j6Var.b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.b.b));
            int i3 = 0;
            boolean z10 = false;
            while (true) {
                try {
                    int read = fileInputStream.read(ga.q3);
                    char c10 = 65535;
                    if (read == -1) {
                        break;
                    }
                    int i10 = i3;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i11 >= read) {
                            break;
                        }
                        byte[] bArr = ga.q3;
                        if (bArr[i11] == 10) {
                            int i13 = i11 - i12;
                            int i14 = i13 + 1;
                            String str = new String(bArr, i12, i13, "UTF-8");
                            if (str.startsWith("WLS=")) {
                                String substring = str.substring(4);
                                Uri parse = Uri.parse(substring);
                                this.b.e = parse.getQueryParameter("slug");
                                this.b.c = new File(org.telegram.messenger.t0.h(), Utilities.a(substring) + ".wp").getAbsolutePath();
                                String queryParameter = parse.getQueryParameter("mode");
                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= split.length) {
                                            break;
                                        }
                                        if ("blur".equals(split[i15])) {
                                            this.b.h = true;
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                    try {
                                        String queryParameter2 = parse.getQueryParameter("bg_color");
                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                            this.b.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                            if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                                                this.b.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                            }
                                            if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                                                this.b.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                            }
                                            if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                                                this.b.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                            this.b.y = Utilities.z(queryParameter3).intValue();
                                        }
                                    } catch (Exception unused2) {
                                    }
                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                        this.b.E = Utilities.z(queryParameter4).intValue();
                                    }
                                    org.telegram.ui.ActionBar.j6 j6Var2 = this.b;
                                    if (j6Var2.E == 0) {
                                        j6Var2.E = 50;
                                    }
                                }
                                c2 = 65535;
                            } else {
                                if (str.startsWith("WPS")) {
                                    this.b.Q = i14 + i10;
                                    z10 = true;
                                    break;
                                }
                                int indexOf = str.indexOf(61);
                                c2 = 65535;
                                if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.u4.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.k6.ra || h == org.telegram.ui.ActionBar.k6.ob || h == org.telegram.ui.ActionBar.k6.Be || h == org.telegram.ui.ActionBar.k6.Ce || h == org.telegram.ui.ActionBar.k6.De || h == org.telegram.ui.ActionBar.k6.Ee)) {
                                    String substring2 = str.substring(indexOf + 1);
                                    if (substring2.length() <= 0 || substring2.charAt(0) != '#') {
                                        intValue = Utilities.z(substring2).intValue();
                                    } else {
                                        try {
                                            intValue = Color.parseColor(substring2);
                                        } catch (Exception unused3) {
                                            intValue = Utilities.z(substring2).intValue();
                                        }
                                    }
                                    if (h == org.telegram.ui.ActionBar.k6.ra) {
                                        this.b.R = intValue;
                                    } else if (h == org.telegram.ui.ActionBar.k6.ob) {
                                        this.b.S = intValue;
                                    } else if (h == org.telegram.ui.ActionBar.k6.Be) {
                                        this.b.M = intValue;
                                    } else if (h == org.telegram.ui.ActionBar.k6.Ce) {
                                        this.b.N = intValue;
                                    } else if (h == org.telegram.ui.ActionBar.k6.De) {
                                        this.b.O = intValue;
                                    } else if (h == org.telegram.ui.ActionBar.k6.Ee) {
                                        this.b.P = intValue;
                                    }
                                }
                            }
                            i12 += i14;
                            i10 += i14;
                        } else {
                            c2 = c10;
                        }
                        i11++;
                        c10 = c2;
                    }
                    if (z10 || i3 == i10) {
                        break;
                    }
                    fileInputStream.getChannel().position(i10);
                    i3 = i10;
                } finally {
                }
            }
            fileInputStream.close();
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        org.telegram.ui.ActionBar.j6 j6Var3 = this.b;
        if (j6Var3.c == null || j6Var3.f || new File(this.b.c).exists()) {
            this.b.U = true;
            return true;
        }
        if (hashMap.containsKey(this.b)) {
            return false;
        }
        org.telegram.ui.ActionBar.j6 j6Var4 = this.b;
        hashMap.put(j6Var4, j6Var4.e);
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        org.telegram.ui.ActionBar.j6 j6Var5 = this.b;
        tL_inputWallPaperSlug.slug = j6Var5.e;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(j6Var5.F).sendRequest(getwallpaper, new RequestDelegate() { // from class: org.telegram.ui.Cells.da
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                int i16 = ThemesHorizontalListCell$InnerThemeView.c0;
                org.telegram.messenger.g0.h3(new ea(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
            }
        });
        return false;
    }

    public final void d(boolean z10) {
        int i3;
        int i10;
        this.H = this.x;
        this.I = this.y;
        this.J = this.E;
        this.K = this.F;
        int i11 = 0;
        org.telegram.ui.ActionBar.g6 k10 = this.b.k(false);
        if (k10 != null) {
            i11 = k10.c;
            i10 = k10.e;
            if (i10 == 0) {
                i10 = i11;
            }
            i3 = (int) k10.j;
            if (i3 == 0) {
                i3 = i11;
            }
        } else {
            i3 = 0;
            i10 = 0;
        }
        org.telegram.ui.ActionBar.j6 j6Var = this.b;
        this.x = org.telegram.ui.ActionBar.k6.C(j6Var, i11, (j6Var.T && j6Var.Z == org.telegram.ui.ActionBar.k6.n) ? -1 : j6Var.R);
        org.telegram.ui.ActionBar.j6 j6Var2 = this.b;
        this.y = org.telegram.ui.ActionBar.k6.C(j6Var2, i10, j6Var2.p());
        org.telegram.ui.ActionBar.j6 j6Var3 = this.b;
        this.E = org.telegram.ui.ActionBar.k6.C(j6Var3, i3, j6Var3.o());
        this.F = this.y;
        this.G = this.b.Z;
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z10) {
            setAccentState(1.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
        this.M = ofFloat;
        ofFloat.setDuration(200L);
        this.M.start();
    }

    public float getAccentState() {
        return this.N;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        ga gaVar = this.b0;
        this.a.a(this.b == (gaVar.n3 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0()), false);
        org.telegram.ui.ActionBar.j6 j6Var = this.b;
        if (j6Var == null || (tL_theme = j6Var.G) == null || j6Var.V) {
            return;
        }
        if (gaVar.h3.containsKey(org.telegram.messenger.w7.r(null, tL_theme.document)) || gaVar.i3.containsKey(this.b)) {
            return;
        }
        this.b.V = true;
        this.w = 0.0f;
        c();
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.G != this.b.Z) {
            d(true);
        }
        int L = this.s ? org.telegram.messenger.g0.L(22.0f) : 0;
        int L2 = org.telegram.messenger.g0.L(11.0f);
        float f12 = L;
        float f13 = L2;
        float L3 = org.telegram.messenger.g0.L(76.0f) + L;
        float L4 = org.telegram.messenger.g0.L(97.0f) + L2;
        RectF rectF = this.c;
        rectF.set(f12, f13, L3, L4);
        String n4 = this.b.n();
        if (n4.toLowerCase().endsWith(".attheme")) {
            n4 = n4.substring(0, n4.lastIndexOf(46));
        }
        float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(this.s ? 10.0f : 15.0f)) - (this.r ? org.telegram.messenger.g0.L(7.0f) : 0);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f;
        String charSequence = TextUtils.ellipsize(n4, textPaint, measuredWidth, truncateAt).toString();
        int ceil = (int) Math.ceil(textPaint.measureText(charSequence));
        textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        canvas.drawText(charSequence, ((org.telegram.messenger.g0.L(76.0f) - ceil) / 2) + L, org.telegram.messenger.g0.L(131.0f), textPaint);
        org.telegram.ui.ActionBar.j6 j6Var = this.b;
        TLRPC.TL_theme tL_theme = j6Var.G;
        Paint paint = this.d;
        RadioButton radioButton = this.a;
        if (tL_theme == null || (tL_theme.document != null && j6Var.V)) {
            paint.setColor(b(this.J, this.E));
            boolean z10 = this.L;
            Drawable drawable = this.n;
            Drawable drawable2 = this.h;
            if (z10) {
                f10 = 6.0f;
                f11 = 1.0f;
                int b10 = b(this.H, this.x);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.I, this.y), mode));
                this.L = false;
            } else {
                f10 = 6.0f;
                f11 = 1.0f;
            }
            Drawable drawable3 = this.P;
            if (drawable3 == null) {
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
            } else if (this.R != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                float width = bitmapDrawable.getBitmap().getWidth();
                float height = bitmapDrawable.getBitmap().getHeight();
                float width2 = width / rectF.width();
                float height2 = height / rectF.height();
                Matrix matrix = this.T;
                matrix.reset();
                float min = f11 / Math.min(width2, height2);
                float f14 = width / height2;
                if (f14 > rectF.width()) {
                    matrix.setTranslate(f12 - ((f14 - rectF.width()) / 2.0f), f13);
                } else {
                    matrix.setTranslate(f12, f13 - (((height / width2) - rectF.height()) / 2.0f));
                }
                matrix.preScale(min, min);
                this.R.setLocalMatrix(matrix);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), this.Q);
            } else {
                drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.P.draw(canvas);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.j6 j6Var2 = this.b;
            if (j6Var2.Y != 0) {
                if ("Day".equals(j6Var2.a) || "Arctic Blue".equals(this.b.a)) {
                    radioButton.b(-5000269, b(this.K, this.F));
                    org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.k6.X1);
                }
            } else if (this.S) {
                radioButton.b(-5000269, j6Var2.p());
                org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.k6.X1);
            }
            drawable2.setBounds(org.telegram.messenger.g0.L(f10) + L, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(49.0f) + L, org.telegram.messenger.g0.L(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(org.telegram.messenger.g0.L(27.0f) + L, org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.g0.L(70.0f) + L, org.telegram.messenger.g0.L(55.0f));
            drawable.draw(canvas);
            if (this.e != null && this.b0.n3 == 0) {
                int L5 = ((int) rectF.right) - org.telegram.messenger.g0.L(16.0f);
                int L6 = org.telegram.messenger.g0.L(f10) + ((int) rectF.top);
                Drawable drawable4 = this.e;
                drawable4.setBounds(L5, L6, drawable4.getIntrinsicWidth() + L5, this.e.getIntrinsicHeight() + L6);
                this.e.draw(canvas);
            }
        } else {
            f10 = 6.0f;
            f11 = 1.0f;
        }
        org.telegram.ui.ActionBar.j6 j6Var3 = this.b;
        TLRPC.TL_theme tL_theme2 = j6Var3.G;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.k6.X1);
            if (this.U != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                if (this.V != x02) {
                    Drawable drawable5 = this.U;
                    this.V = x02;
                    org.telegram.ui.ActionBar.k6.C1(x02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.U.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.U.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.U;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.U.getIntrinsicHeight() + centerY);
                this.U.draw(canvas);
                return;
            }
            return;
        }
        if ((tL_theme2 == null || j6Var3.V) && this.w <= 0.0f) {
            if (radioButton.getAlpha() != f11) {
                radioButton.setAlpha(f11);
                return;
            }
            return;
        }
        radioButton.setAlpha(f11 - this.w);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
        paint.setAlpha((int) (this.w * 255.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
        if (this.U != null) {
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
            if (this.V != x03) {
                Drawable drawable7 = this.U;
                this.V = x03;
                org.telegram.ui.ActionBar.k6.C1(x03, drawable7);
            }
            int centerX2 = (int) (rectF.centerX() - (this.U.getIntrinsicWidth() / 2));
            int centerY2 = (int) (rectF.centerY() - (this.U.getIntrinsicHeight() / 2));
            this.U.setAlpha((int) (this.w * 255.0f));
            Drawable drawable8 = this.U;
            drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.U.getIntrinsicHeight() + centerY2);
            this.U.draw(canvas);
        }
        if (this.b.V) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min2 = Math.min(17L, elapsedRealtime - this.W);
            this.W = elapsedRealtime;
            float f15 = this.w - (min2 / 180.0f);
            this.w = f15;
            if (f15 < 0.0f) {
                this.w = 0.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String n4 = this.b.n();
        if (n4.toLowerCase().endsWith(".attheme")) {
            n4 = n4.substring(0, n4.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(n4);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.a.f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, bd.M0(2131754839, null)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((this.r ? 22 : 15) + 76 + (this.s ? 22 : 0)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(148.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.j6 j6Var;
        if (this.e != null && (j6Var = this.b) != null && (j6Var.G == null || j6Var.V)) {
            ga gaVar = this.b0;
            if (gaVar.n3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y9 = motionEvent.getY();
                    RectF rectF = this.c;
                    if (x10 > rectF.centerX() && y9 < rectF.centerY() - org.telegram.messenger.g0.L(10.0f)) {
                        if (action == 0) {
                            this.a0 = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            gaVar.C1(this.b);
                        }
                    }
                    if (action == 1) {
                        this.a0 = false;
                    }
                }
                return this.a0;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentState(float f10) {
        this.N = f10;
        this.L = true;
        invalidate();
    }
}
