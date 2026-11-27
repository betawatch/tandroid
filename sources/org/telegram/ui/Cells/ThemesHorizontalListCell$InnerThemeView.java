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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
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
    public znb b;
    public final /* synthetic */ f b0;
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
    public ThemesHorizontalListCell$InnerThemeView(f fVar, Context context) {
        super(context);
        this.b0 = fVar;
        this.c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.O = new ArgbEvaluator();
        this.Q = new Paint(3);
        this.T = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
        this.n = c00.e(context, R.drawable.minibubble_out);
        textPaint.setTextSize(hl.L(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(hl.L(20.0f));
        addView(radioButton, tre.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        znb znbVar = this.b;
        int i = (znbVar.T && znbVar.Z == aob.n) ? -1 : znbVar.R;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i, mode));
        this.n.setColorFilter(new PorterDuffColorFilter(this.b.n(), mode));
        double[] dArr = null;
        if (this.b.b == null) {
            d(false);
            this.e = null;
        } else {
            this.e = getResources().getDrawable(R.drawable.preview_dots).mutate();
            int m = this.b.m();
            this.E = m;
            this.J = m;
        }
        this.R = null;
        this.P = null;
        znb znbVar2 = this.b;
        if (znbVar2.N != 0) {
            if (znbVar2.O != 0) {
                int m2 = this.b.m();
                znb znbVar3 = this.b;
                hh7 hh7Var = new hh7(m2, znbVar3.N, znbVar3.O, znbVar3.P, true, false);
                hh7Var.u(hl.L(6.0f));
                this.P = hh7Var;
                dArr = hl.Z2(Color.red(this.b.m()), Color.green(this.b.m()), Color.blue(this.b.m()));
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.b.m(), this.b.N});
                gradientDrawable.setCornerRadius(hl.L(6.0f));
                this.P = gradientDrawable;
                dArr = hl.Z2(Color.red(this.b.m()), Color.green(this.b.m()), Color.blue(this.b.m()));
            }
        } else if (znbVar2.Q > 0 || znbVar2.c != null) {
            float L = hl.L(76.0f);
            float L2 = hl.L(97.0f);
            znb znbVar4 = this.b;
            Bitmap d1 = hl.d1(L, L2, znbVar4.c, znbVar4.b, znbVar4.Q);
            if (d1 != null) {
                this.P = new BitmapDrawable(d1);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(d1, tileMode, tileMode);
                this.R = bitmapShader;
                this.Q.setShader(bitmapShader);
                int[] q = hl.q(this.P);
                dArr = hl.Z2(Color.red(q[0]), Color.green(q[0]), Color.blue(q[0]));
            }
        } else if (znbVar2.m() != 0) {
            dArr = hl.Z2(Color.red(this.b.m()), Color.green(this.b.m()), Color.blue(this.b.m()));
        }
        if (dArr == null || dArr[1] > 0.10000000149011612d || dArr[2] < 0.9599999785423279d) {
            this.S = false;
        } else {
            this.S = true;
        }
        if (this.b.m() == 0 && this.b.U && this.P == null) {
            hh7 R = aob.R(100, jn7.d3);
            this.P = R;
            R.u(hl.L(6.0f));
        }
        invalidate();
    }

    public final int b(int i, int i2) {
        float f = this.N;
        if (f == 1.0f) {
            return i2;
        }
        return ((Integer) this.O.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    public final boolean c() {
        int d;
        int intValue;
        String[] split;
        HashMap hashMap = this.b0.i3;
        znb znbVar = this.b;
        if (znbVar == null || znbVar.b == null) {
            return false;
        }
        boolean z = true;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.b.b));
            int i = 0;
            boolean z2 = false;
            while (true) {
                try {
                    int read = fileInputStream.read(f.q3);
                    if (read == -1) {
                        break;
                    }
                    int i2 = i;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 >= read) {
                            break;
                        }
                        byte[] bArr = f.q3;
                        if (bArr[i3] == 10) {
                            int i5 = i3 - i4;
                            int i6 = i5 + 1;
                            String str = new String(bArr, i4, i5, "UTF-8");
                            if (str.startsWith("WLS=")) {
                                String substring = str.substring(4);
                                Uri parse = Uri.parse(substring);
                                this.b.e = parse.getQueryParameter("slug");
                                this.b.c = gvc.d(substring).getAbsolutePath();
                                String queryParameter = parse.getQueryParameter("mode");
                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= split.length) {
                                            break;
                                        }
                                        if ("blur".equals(split[i7])) {
                                            this.b.h = z;
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                    try {
                                        String queryParameter2 = parse.getQueryParameter("bg_color");
                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                            this.b.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                            if (queryParameter2.length() >= 13 && hl.Q1(queryParameter2.charAt(6))) {
                                                this.b.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                            }
                                            if (queryParameter2.length() >= 20 && hl.Q1(queryParameter2.charAt(13))) {
                                                this.b.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                            }
                                            if (queryParameter2.length() == 27 && hl.Q1(queryParameter2.charAt(20))) {
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
                                    znb znbVar2 = this.b;
                                    if (znbVar2.E == 0) {
                                        znbVar2.E = 50;
                                    }
                                }
                            } else {
                                if (str.startsWith("WPS")) {
                                    this.b.Q = i6 + i2;
                                    z2 = true;
                                    break;
                                }
                                int indexOf = str.indexOf(61);
                                if (indexOf != -1 && ((d = d0f.d(str.substring(0, indexOf))) == aob.ra || d == aob.rb || d == aob.Ee || d == aob.Fe || d == aob.Ge || d == aob.He)) {
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
                                    if (d == aob.ra) {
                                        this.b.R = intValue;
                                    } else if (d == aob.rb) {
                                        this.b.S = intValue;
                                    } else if (d == aob.Ee) {
                                        this.b.M = intValue;
                                    } else if (d == aob.Fe) {
                                        this.b.N = intValue;
                                    } else if (d == aob.Ge) {
                                        this.b.O = intValue;
                                    } else if (d == aob.He) {
                                        this.b.P = intValue;
                                    }
                                }
                            }
                            i4 += i6;
                            i2 += i6;
                        }
                        i3++;
                        z = true;
                    }
                    if (z2 || i == i2) {
                        break;
                    }
                    fileInputStream.getChannel().position(i2);
                    i = i2;
                    z = true;
                } finally {
                }
            }
            fileInputStream.close();
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        znb znbVar3 = this.b;
        if (znbVar3.c == null || znbVar3.f || new File(this.b.c).exists()) {
            this.b.U = true;
            return true;
        }
        if (hashMap.containsKey(this.b)) {
            return false;
        }
        znb znbVar4 = this.b;
        hashMap.put(znbVar4, znbVar4.e);
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        znb znbVar5 = this.b;
        tL_inputWallPaperSlug.slug = znbVar5.e;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(znbVar5.F).sendRequest(getwallpaper, new RequestDelegate() { // from class: org.telegram.ui.Cells.c
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                int i8 = ThemesHorizontalListCell$InnerThemeView.c0;
                final ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = ThemesHorizontalListCell$InnerThemeView.this;
                hl.c3(new Runnable() { // from class: org.telegram.ui.Cells.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView2 = ThemesHorizontalListCell$InnerThemeView.this;
                        HashMap hashMap2 = themesHorizontalListCell$InnerThemeView2.b0.h3;
                        TLObject tLObject2 = tLObject;
                        if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                            themesHorizontalListCell$InnerThemeView2.b.f = true;
                            return;
                        }
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                        String r = xb4.r(null, wallPaper.document);
                        if (hashMap2.containsKey(r)) {
                            return;
                        }
                        hashMap2.put(r, themesHorizontalListCell$InnerThemeView2.b);
                        xb4.G(themesHorizontalListCell$InnerThemeView2.b.F).X(wallPaper.document, wallPaper, 1, 1);
                    }
                });
            }
        });
        return false;
    }

    public final void d(boolean z) {
        int i;
        int i2;
        this.H = this.x;
        this.I = this.y;
        this.J = this.E;
        this.K = this.F;
        int i3 = 0;
        ynb i4 = this.b.i(false);
        if (i4 != null) {
            i3 = i4.c;
            i2 = i4.e;
            if (i2 == 0) {
                i2 = i3;
            }
            i = (int) i4.j;
            if (i == 0) {
                i = i3;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        znb znbVar = this.b;
        this.x = aob.B(znbVar, i3, (znbVar.T && znbVar.Z == aob.n) ? -1 : znbVar.R);
        znb znbVar2 = this.b;
        this.y = aob.B(znbVar2, i2, znbVar2.n());
        znb znbVar3 = this.b;
        this.E = aob.B(znbVar3, i, znbVar3.m());
        this.F = this.y;
        this.G = this.b.Z;
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z) {
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
        f fVar = this.b0;
        this.a.a(this.b == (fVar.n3 == 1 ? aob.J : aob.B0()), false);
        znb znbVar = this.b;
        if (znbVar == null || (tL_theme = znbVar.G) == null || znbVar.V) {
            return;
        }
        if (fVar.h3.containsKey(xb4.r(null, tL_theme.document)) || fVar.i3.containsKey(this.b)) {
            return;
        }
        this.b.V = true;
        this.w = 0.0f;
        c();
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x02df, code lost:
    
        if (r2.V != false) goto L70;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        if (this.G != this.b.Z) {
            d(true);
        }
        int L = this.s ? hl.L(22.0f) : 0;
        int L2 = hl.L(11.0f);
        float f3 = L;
        float f4 = L2;
        float L3 = hl.L(76.0f) + L;
        float L4 = hl.L(97.0f) + L2;
        RectF rectF = this.c;
        rectF.set(f3, f4, L3, L4);
        String l = this.b.l();
        if (l.toLowerCase().endsWith(".attheme")) {
            l = l.substring(0, l.lastIndexOf(46));
        }
        float measuredWidth = (getMeasuredWidth() - hl.L(this.s ? 10.0f : 15.0f)) - (this.r ? hl.L(7.0f) : 0);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f;
        String charSequence = TextUtils.ellipsize(l, textPaint, measuredWidth, truncateAt).toString();
        int ceil = (int) Math.ceil(textPaint.measureText(charSequence));
        textPaint.setColor(aob.w0(null, aob.G6, false));
        canvas.drawText(charSequence, ((hl.L(76.0f) - ceil) / 2) + L, hl.L(131.0f), textPaint);
        znb znbVar = this.b;
        TLRPC.TL_theme tL_theme = znbVar.G;
        Paint paint = this.d;
        RadioButton radioButton = this.a;
        if (tL_theme == null || (tL_theme.document != null && znbVar.V)) {
            paint.setColor(b(this.J, this.E));
            boolean z = this.L;
            Drawable drawable = this.n;
            Drawable drawable2 = this.h;
            if (z) {
                f = 6.0f;
                f2 = 1.0f;
                int b = b(this.H, this.x);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.I, this.y), mode));
                this.L = false;
            } else {
                f = 6.0f;
                f2 = 1.0f;
            }
            Drawable drawable3 = this.P;
            if (drawable3 == null) {
                canvas.drawRoundRect(rectF, hl.L(f), hl.L(f), paint);
            } else if (this.R != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                float width = bitmapDrawable.getBitmap().getWidth();
                float height = bitmapDrawable.getBitmap().getHeight();
                float width2 = width / rectF.width();
                float height2 = height / rectF.height();
                Matrix matrix = this.T;
                matrix.reset();
                float min = f2 / Math.min(width2, height2);
                float f5 = width / height2;
                if (f5 > rectF.width()) {
                    matrix.setTranslate(f3 - ((f5 - rectF.width()) / 2.0f), f4);
                } else {
                    matrix.setTranslate(f3, f4 - (((height / width2) - rectF.height()) / 2.0f));
                }
                matrix.preScale(min, min);
                this.R.setLocalMatrix(matrix);
                canvas.drawRoundRect(rectF, hl.L(f), hl.L(f), this.Q);
            } else {
                drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.P.draw(canvas);
            }
            radioButton.b(1728053247, -1);
            znb znbVar2 = this.b;
            if (znbVar2.Y != 0) {
                if ("Day".equals(znbVar2.a) || "Arctic Blue".equals(this.b.a)) {
                    radioButton.b(-5000269, b(this.K, this.F));
                    aob.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, hl.L(f), hl.L(f), aob.X1);
                }
            } else if (this.S) {
                radioButton.b(-5000269, znbVar2.n());
                aob.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, hl.L(f), hl.L(f), aob.X1);
            }
            drawable2.setBounds(hl.L(f) + L, hl.L(22.0f), hl.L(49.0f) + L, hl.L(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(hl.L(27.0f) + L, hl.L(41.0f), hl.L(70.0f) + L, hl.L(55.0f));
            drawable.draw(canvas);
            if (this.e != null && this.b0.n3 == 0) {
                int L5 = ((int) rectF.right) - hl.L(16.0f);
                int L6 = hl.L(f) + ((int) rectF.top);
                Drawable drawable4 = this.e;
                drawable4.setBounds(L5, L6, drawable4.getIntrinsicWidth() + L5, this.e.getIntrinsicHeight() + L6);
                this.e.draw(canvas);
            }
        } else {
            f = 6.0f;
            f2 = 1.0f;
        }
        znb znbVar3 = this.b;
        TLRPC.TL_theme tL_theme2 = znbVar3.G;
        if (tL_theme2 != null) {
            if (tL_theme2.document == null) {
                radioButton.setAlpha(0.0f);
                aob.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, hl.L(f), hl.L(f), aob.X1);
                if (this.U != null) {
                    int w0 = aob.w0(null, aob.E6, false);
                    if (this.V != w0) {
                        Drawable drawable5 = this.U;
                        this.V = w0;
                        aob.A1(w0, drawable5);
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
        }
        if (this.w <= 0.0f) {
            if (radioButton.getAlpha() != f2) {
                radioButton.setAlpha(f2);
                return;
            }
            return;
        }
        radioButton.setAlpha(f2 - this.w);
        paint.setColor(aob.w0(null, aob.a7, false));
        paint.setAlpha((int) (this.w * 255.0f));
        canvas.drawRoundRect(rectF, hl.L(f), hl.L(f), paint);
        if (this.U != null) {
            int w02 = aob.w0(null, aob.E6, false);
            if (this.V != w02) {
                Drawable drawable7 = this.U;
                this.V = w02;
                aob.A1(w02, drawable7);
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
            float f6 = this.w - (min2 / 180.0f);
            this.w = f6;
            if (f6 < 0.0f) {
                this.w = 0.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String l = this.b.l();
        if (l.toLowerCase().endsWith(".attheme")) {
            l = l.substring(0, l.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(l);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.a.f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, ob6.M0(2131754834, null)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L((this.r ? 22 : 15) + 76 + (this.s ? 22 : 0)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(148.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        znb znbVar;
        if (this.e != null && (znbVar = this.b) != null && (znbVar.G == null || znbVar.V)) {
            f fVar = this.b0;
            if (fVar.n3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    RectF rectF = this.c;
                    if (x > rectF.centerX() && y < rectF.centerY() - hl.L(10.0f)) {
                        if (action == 0) {
                            this.a0 = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            fVar.D1(this.b);
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

    public void setAccentState(float f) {
        this.N = f;
        this.L = true;
        invalidate();
    }
}
