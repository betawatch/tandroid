package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ao implements org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.sb0 {
    public BitmapShader E;
    public boolean F;
    public AnimatorSet H;
    public org.telegram.ui.ActionBar.f5 I;
    public org.telegram.ui.ActionBar.f5 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public Bitmap P;
    public int Q;
    public boolean R;
    public boolean S;
    public final /* synthetic */ co V;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.d4 f;
    public TLRPC.WallPaper h;
    public Drawable n;
    public ValueAnimator r;
    public Bitmap s;
    public Bitmap v;
    public Canvas x;
    public BitmapShader y;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Matrix c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint w = new Paint();
    public final Rect T = new Rect();
    public final Rect U = new Rect();
    public boolean G = org.telegram.ui.ActionBar.j6.I.q();

    public ao(co coVar) {
        int i10;
        int i11;
        this.V = coVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            this.f = ChatThemeController.getInstance(i10).getDialogTheme(coVar.T5);
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(coVar.T5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.d4 d4Var = this.f;
            if (d4Var != null || dialogWallpaper != null) {
                j(d4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ah.j(21));
            }
        }
        if (ThemeEditorView.n == null) {
            org.telegram.ui.ActionBar.j6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ah.j(21));
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Paint G(String str) {
        if (this.f == null && this.n == null) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int G0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f == null) {
            return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.j6.ol.get(i10);
        return (i11 < 0 || (indexOfKey = this.d.indexOfKey(i11)) < 0) ? org.telegram.ui.ActionBar.j6.w0(null, i10, false) : this.d.valueAt(indexOfKey);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void O0(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    public final int b(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.n == null) {
            return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i10)) < 0) ? org.telegram.ui.ActionBar.j6.w0(null, i10, false) : this.d.valueAt(indexOfKey);
    }

    public final org.telegram.ui.ActionBar.d4 c() {
        return this.f;
    }

    public final Drawable d() {
        Drawable drawable = this.n;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.j6.s0();
    }

    public final void e() {
        Drawable f5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.jl.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    f5Var = new org.telegram.ui.ActionBar.f5(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    f5Var = new org.telegram.ui.ActionBar.f5(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    f5Var = new org.telegram.ui.ActionBar.f5(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    f5Var = new org.telegram.ui.ActionBar.f5(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    f5Var = new org.telegram.ui.ActionBar.f5(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    f5Var = new org.telegram.ui.ActionBar.f5(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    f5Var = new org.telegram.ui.ActionBar.f5(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    f5Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (f5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.j6.kl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.j6.w1(G0(intValue), f5Var);
                            break;
                        }
                    }
                    break;
            }
            if (f5Var != null) {
                this.a.put((String) entry.getKey(), f5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.ll.entrySet()) {
            Paint paint2 = (Paint) entry.getValue();
            if (paint2 instanceof TextPaint) {
                paint = new TextPaint();
                paint.setTextSize(paint2.getTextSize());
                paint.setTypeface(paint2.getTypeface());
            } else {
                paint = new Paint();
            }
            if ((paint2.getFlags() & 1) != 0) {
                paint.setFlags(1);
            }
            int intValue = ((Integer) org.telegram.ui.ActionBar.j6.ml.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(G0(intValue));
            }
            this.b.put((String) entry.getKey(), paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Drawable drawable) {
        float f7;
        boolean z10;
        float f10;
        Paint G;
        Paint G2;
        int i10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        if (this.V.ca != null) {
            return;
        }
        int i11 = AndroidUtilities.calcDrawableColor(drawable2)[0];
        int b10 = b(org.telegram.ui.ActionBar.j6.lc, false);
        int i12 = org.telegram.ui.ActionBar.j6.Hc;
        int b11 = b(i12, false);
        if (b10 != 0 && this.h == null) {
            i11 = b10;
        }
        this.Q = i11;
        if (drawable2 instanceof go) {
            go goVar = (go) drawable2;
            f7 = goVar.f == null ? goVar.d : 0.0f;
            drawable2 = goVar.c(false);
        } else {
            f7 = 0.0f;
        }
        boolean z11 = drawable2 instanceof org.telegram.ui.Components.dc0;
        boolean z12 = (z11 || (drawable2 instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0;
        this.R = z12;
        org.telegram.ui.ActionBar.d4 d4Var = this.f;
        if (d4Var != null) {
            TLRPC.ChatTheme chatTheme = d4Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (tL_starGiftUnique != null && this.G) {
                        z10 = true;
                        this.S = z12;
                        if (z12) {
                            boolean z13 = drawable2 instanceof BitmapDrawable;
                            f10 = 0.0f;
                            Rect rect = this.U;
                            Rect rect2 = this.T;
                            if (z13) {
                                Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                int i13 = 40;
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    i10 = (int) ((40 / bitmap.getWidth()) * bitmap.getHeight());
                                } else {
                                    i13 = (int) ((40 / bitmap.getHeight()) * bitmap.getWidth());
                                    i10 = 40;
                                }
                                this.s = Bitmap.createBitmap(i13, i10, Bitmap.Config.ARGB_8888);
                                this.x = new Canvas(this.s);
                                rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
                                this.x.drawBitmap(bitmap, rect2, rect, (Paint) null);
                                Utilities.blurBitmap(this.s, 3);
                                this.x.drawColor(i0.a.k(-16777216, (int) (f7 * 255.0f)));
                                Bitmap bitmap2 = this.s;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                this.y = new BitmapShader(bitmap2, tileMode, tileMode);
                                this.v = Bitmap.createBitmap(this.s);
                                this.E = new BitmapShader(this.v, tileMode, tileMode);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    this.y.setFilterMode(2);
                                    this.E.setFilterMode(2);
                                }
                                this.F = true;
                            } else {
                                this.s = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                Bitmap bitmap3 = ((org.telegram.ui.Components.dc0) drawable2).k;
                                this.v = bitmap3;
                                if (z10) {
                                    this.v = Bitmap.createBitmap(bitmap3);
                                    new Canvas(this.v).drawColor(-870178270);
                                }
                                this.x = new Canvas(this.s);
                                rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                                rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
                                this.x.drawBitmap(this.v, rect2, rect, (Paint) null);
                                this.x.drawColor(i0.a.k(-16777216, (int) (f7 * 255.0f)));
                                if (z10) {
                                    this.x.drawColor(-870178270);
                                }
                                Bitmap bitmap4 = this.s;
                                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                                this.y = new BitmapShader(bitmap4, tileMode2, tileMode2);
                                this.E = new BitmapShader(this.v, tileMode2, tileMode2);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    this.y.setFilterMode(2);
                                    this.E.setFilterMode(2);
                                }
                                this.F = true;
                            }
                        } else {
                            f10 = 0.0f;
                            this.s = null;
                            this.y = null;
                            this.v = null;
                            this.x = null;
                            this.F = false;
                        }
                        G = G("paintChatActionBackground");
                        Paint G3 = G("paintChatActionBackgroundSelected");
                        G2 = G("paintChatMessageBackgroundSelected");
                        HashMap hashMap = this.b;
                        if (G != null) {
                            Paint paint = (Paint) hashMap.get("paintChatActionBackgroundDarken");
                            if (paint == null) {
                                paint = new Paint(1);
                                hashMap.put("paintChatActionBackgroundDarken", paint);
                                paint.setColor(0);
                            }
                            if (this.R) {
                                ColorMatrix colorMatrix = new ColorMatrix();
                                if (z11) {
                                    if (((org.telegram.ui.Components.dc0) drawable2).q >= f10) {
                                        colorMatrix.setSaturation(1.6f);
                                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.G ? 0.97f : 0.92f);
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.G ? 0.12f : -0.06f);
                                    } else {
                                        colorMatrix.setSaturation(1.1f);
                                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.G ? 0.4f : 0.8f);
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.G ? 0.08f : -0.06f);
                                    }
                                } else {
                                    colorMatrix.setSaturation(1.6f);
                                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.G ? 0.9f : 0.84f);
                                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.G ? 0.04f : 0.06f);
                                }
                                G.setAlpha(255);
                                G.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                G.setShader(this.E);
                                G.setFilterBitmap(true);
                                G3.setAlpha(255);
                                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, 0.26f);
                                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.92f);
                                G3.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                                G3.setShader(this.E);
                                G3.setFilterBitmap(true);
                                paint.setAlpha(0);
                            } else {
                                G.setColorFilter(null);
                                G.setShader(null);
                                G3.setColorFilter(null);
                                G3.setShader(null);
                                paint.setAlpha(21);
                            }
                        }
                        if (G2 == null) {
                            G2 = new Paint(1);
                            hashMap.put("paintChatMessageBackgroundSelected", G2);
                        }
                        if (!this.S) {
                            if (b11 == 0) {
                                b11 = G0(i12);
                            }
                            G2.setColor(b11);
                            G2.setColorFilter(null);
                            G2.setShader(null);
                            return;
                        }
                        ColorMatrix colorMatrix3 = new ColorMatrix();
                        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 2.5f);
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.75f);
                        G2.setAlpha(64);
                        G2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                        G2.setShader(this.E);
                        G2.setFilterBitmap(true);
                        return;
                    }
                }
            }
            tL_starGiftUnique = null;
            if (tL_starGiftUnique != null) {
                z10 = true;
                this.S = z12;
                if (z12) {
                }
                G = G("paintChatActionBackground");
                Paint G32 = G("paintChatActionBackgroundSelected");
                G2 = G("paintChatMessageBackgroundSelected");
                HashMap hashMap2 = this.b;
                if (G != null) {
                }
                if (G2 == null) {
                }
                if (!this.S) {
                }
            }
        }
        z10 = false;
        this.S = z12;
        if (z12) {
        }
        G = G("paintChatActionBackground");
        Paint G322 = G("paintChatActionBackgroundSelected");
        G2 = G("paintChatMessageBackgroundSelected");
        HashMap hashMap22 = this.b;
        if (G != null) {
        }
        if (G2 == null) {
        }
        if (!this.S) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    public final boolean h(boolean z10) {
        TLRPC.User user;
        co coVar = this.V;
        if (coVar.h != null) {
            return false;
        }
        if (z10) {
            return (coVar.e != null || (user = coVar.f) == null || user.bot) ? false : true;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int h0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int h1(int i10) {
        return b(i10, false);
    }

    public final void i(org.telegram.ui.ActionBar.d4 d4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.d5 d5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.d5 d5Var2;
        co coVar = this.V;
        d5Var = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
        if (d5Var == null || coVar.ca != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.G;
        gg.b bVar = d4Var != null ? d4Var.c : null;
        org.telegram.ui.ActionBar.d4 d4Var2 = this.f;
        gg.b bVar2 = d4Var2 != null ? d4Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.h;
        if (!z11) {
            if (!h(false)) {
                return;
            }
            if (gg.b.a(bVar2, bVar) && this.G == booleanValue && ChatThemeController.equals(wallPaper, wallPaper2)) {
                return;
            }
        }
        this.G = booleanValue;
        org.telegram.ui.ActionBar.i6 A0 = booleanValue ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0();
        org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(A0, A0.Y, A0.q(), !z10);
        org.telegram.ui.ActionBar.d4 d4Var3 = this.f;
        if (d4Var3 == null && this.h == null) {
            Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
            this.R = s02 instanceof org.telegram.ui.Components.dc0;
            g(s02);
            this.K = this.R ? -1 : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ic, false);
            this.L = this.R ? -1 : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jc, false);
            this.M = this.R ? -1 : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jc, false);
            this.N = this.R ? -1 : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kc, false);
        } else {
            if (this.R) {
                Drawable drawable = this.n;
                if (drawable instanceof org.telegram.ui.Components.dc0) {
                    Bitmap bitmap = ((org.telegram.ui.Components.dc0) drawable).k;
                    this.P = bitmap;
                    if (d4Var3 != null) {
                        TLRPC.ChatTheme chatTheme = d4Var3.d;
                        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                            TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (tL_starGiftUnique != null && this.G) {
                                    this.P = Bitmap.createBitmap(bitmap);
                                    new Canvas(this.P).drawColor(-870178270);
                                }
                            }
                        }
                        tL_starGiftUnique = null;
                        if (tL_starGiftUnique != null) {
                            this.P = Bitmap.createBitmap(bitmap);
                            new Canvas(this.P).drawColor(-870178270);
                        }
                    }
                }
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                g(drawable2);
            }
        }
        this.O = this.Q;
        this.K = this.R ? -1 : b(org.telegram.ui.ActionBar.j6.ic, true);
        this.L = this.R ? -1 : b(org.telegram.ui.ActionBar.j6.jc, true);
        this.M = this.R ? -1 : b(org.telegram.ui.ActionBar.j6.jc, true);
        this.N = this.R ? -1 : b(org.telegram.ui.ActionBar.j6.kc, true);
        if (d4Var != null || wallPaper != null) {
            int i10 = AndroidUtilities.calcDrawableColor(this.n)[0];
            e();
            f();
        }
        c5Var.f = false;
        if (coVar.T5 < 0) {
            c5Var.g = false;
        }
        c5Var.h = new bi.e4(this, d4Var, wallPaper, z10, 12);
        if (z10) {
            c5Var.k = new xn(this);
            c5Var.i = new vn(this, 0);
            c5Var.j = new vn(this, 1);
        } else {
            if (coVar.X0 != null) {
                coVar.ec();
            }
            c5Var.h.run();
        }
        c5Var.e = true;
        c5Var.m = this;
        c5Var.l = 250L;
        d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
        ((ActionBarLayout) d5Var2).f(c5Var, null);
    }

    public final void j(org.telegram.ui.ActionBar.d4 d4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        int i10;
        boolean z11;
        org.telegram.ui.Components.dc0 dc0Var;
        Drawable drawable;
        int i11;
        char c10;
        org.telegram.ui.ActionBar.i6 N0;
        int i12;
        org.telegram.ui.ActionBar.i6 N02;
        org.telegram.ui.ActionBar.d4 d4Var2 = d4Var;
        co coVar = this.V;
        if (coVar.ca != null) {
            return;
        }
        this.f = d4Var2;
        this.h = wallPaper;
        Drawable backgroundImage = coVar.fragmentView != null ? coVar.X0.getBackgroundImage() : null;
        org.telegram.ui.Components.dc0 dc0Var2 = backgroundImage instanceof org.telegram.ui.Components.dc0 ? (org.telegram.ui.Components.dc0) backgroundImage : null;
        int i13 = dc0Var2 != null ? dc0Var2.i : 0;
        if ((d4Var2 == null || d4Var2.a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.j6.rl.indexOfKey(org.telegram.ui.ActionBar.j6.lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.j6.rl.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (d4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
            if (s02 instanceof org.telegram.ui.Components.dc0) {
                ((org.telegram.ui.Components.dc0) s02).v(i13);
            }
            this.n = null;
            if (org.telegram.ui.ActionBar.j6.I.q() == this.G) {
                N02 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string) != null && !org.telegram.ui.ActionBar.j6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string2) != null && org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                    str = string2;
                }
                N02 = this.G ? org.telegram.ui.ActionBar.j6.N0(str) : org.telegram.ui.ActionBar.j6.N0(str2);
            }
            org.telegram.ui.ActionBar.j6.t(N02, false, this.G);
            g(this.n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.j6.J(ApplicationLoader.applicationContext, false);
        }
        if (d4Var2 == null) {
            this.d = new SparseIntArray();
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
            this.d = d4Var2.b(i10, this.G ? 1 : 0);
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable2 = this.n;
            i12 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
            this.n = di.d7.f(drawable2, i12, this.h, this.G);
        } else if (wallPaper != null) {
            this.n = go.d(this.n, wallPaper, this.G);
        } else {
            if (d4Var2.a) {
                org.telegram.ui.ActionBar.i6 e7 = org.telegram.ui.ActionBar.d4.e(this.G);
                i11 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
                org.telegram.ui.ActionBar.j6.H(e7, d4Var2.h(i11, this.G ? 1 : 0), ((org.telegram.ui.ActionBar.c4) d4Var2.f.get(this.G ? 1 : 0)).g, i13, false);
                drawable = new ColorDrawable(-16777216);
            } else {
                int G0 = G0(org.telegram.ui.ActionBar.j6.Nd);
                int G02 = G0(org.telegram.ui.ActionBar.j6.Od);
                int G03 = G0(org.telegram.ui.ActionBar.j6.Pd);
                int G04 = G0(org.telegram.ui.ActionBar.j6.Qd);
                org.telegram.ui.Components.dc0 dc0Var3 = new org.telegram.ui.Components.dc0();
                dc0Var3.t(dc0Var3.u, d4Var2.k(this.G ? 1 : 0).settings.intensity);
                TLRPC.Document f7 = d4Var2.f();
                if (dc0Var3.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    dc0Var3.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = dc0Var3.c;
                    if (weakReference != null) {
                        dc0Var3.y.setParentView((View) weakReference.get());
                    }
                    if (dc0Var3.T) {
                        dc0Var3.y.onAttachedToWindow();
                    }
                }
                dc0Var3.y.setImage(ImageLocation.getForDocument(f7), "80_80", null, null, null, 0);
                dc0Var3.y.setAutoRepeatCount(1);
                dc0Var3.y.setAutoRepeat(1);
                dc0Var3.o(G0, G02, G03, G04, 0, true);
                dc0Var3.v(i13);
                int f10 = dc0Var3.f();
                boolean z12 = this.G;
                m4 m4Var = new m4(12, this, dc0Var3);
                org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) d4Var2.f.get(z12 ? 1 : 0);
                if (c4Var == null || c4Var.c == null) {
                    z11 = z12 ? 1 : 0;
                    dc0Var = dc0Var3;
                } else {
                    dc0Var = dc0Var3;
                    long i15 = d4Var2.i(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = c4Var.c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
                    if (arrayList != null && document == null) {
                        int size = arrayList.size();
                        int i16 = 0;
                        while (i16 < size) {
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i16);
                            int i17 = i16 + 1;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            z11 = z12 ? 1 : 0;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                z12 = z11;
                                i16 = i17;
                            }
                        }
                    }
                    z11 = z12;
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new bi.p1(m4Var, i15, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                }
                d4Var2 = d4Var;
                org.telegram.ui.Components.dc0 dc0Var4 = dc0Var;
                d4Var2.o(this.G ? 1 : 0, new org.telegram.messenger.j2(this, d4Var2, z11, dc0Var4, f10));
                drawable = dc0Var4;
            }
            this.n = drawable;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.H = new AnimatorSet();
            if (dc0Var2 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new wn(dc0Var2, 0));
                ofFloat.addListener(new yn(dc0Var2));
                ofFloat.setDuration(200L);
                this.H.playTogether(ofFloat);
            }
            Drawable drawable3 = this.n;
            if (drawable3 instanceof org.telegram.ui.Components.dc0) {
                org.telegram.ui.Components.dc0 dc0Var5 = (org.telegram.ui.Components.dc0) drawable3;
                dc0Var5.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new wn(dc0Var5, 1));
                ofFloat2.addListener(new zn(dc0Var5));
                ofFloat2.setDuration(250L);
                this.H.playTogether(ofFloat2);
            }
            this.H.start();
        }
        if (d4Var2 != null || this.V.T5 < 0) {
            c10 = 0;
        } else {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.G) {
                N0 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string3) != null && !org.telegram.ui.ActionBar.j6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string4) != null && org.telegram.ui.ActionBar.j6.N0(string4).q()) {
                    str = string4;
                }
                N0 = this.G ? org.telegram.ui.ActionBar.j6.N0(str) : org.telegram.ui.ActionBar.j6.N0(str2);
            }
            c10 = 0;
            org.telegram.ui.ActionBar.j6.t(N0, false, this.G);
        }
        int i18 = AndroidUtilities.calcDrawableColor(this.n)[c10];
        e();
        f();
        g(this.n);
        k(1.0f);
    }

    public final void k(float f7) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b.isEmpty()) {
            return;
        }
        Paint G = G("paintChatActionBackground");
        Paint G2 = G("paintChatActionBackgroundSelected");
        Paint G3 = G("paintChatMessageBackgroundSelected");
        int i10 = this.Q;
        int b10 = this.R ? -1 : b(org.telegram.ui.ActionBar.j6.ic, true);
        int b11 = this.R ? -1 : b(org.telegram.ui.ActionBar.j6.jc, true);
        int b12 = this.R ? -1 : b(org.telegram.ui.ActionBar.j6.jc, true);
        int b13 = this.R ? -1 : b(org.telegram.ui.ActionBar.j6.kc, true);
        if (f7 != 1.0f) {
            i10 = i0.a.d(f7, this.O, i10);
            b10 = i0.a.d(f7, this.K, b10);
            b11 = i0.a.d(f7, this.L, b11);
            b12 = i0.a.d(f7, this.M, b12);
            b13 = i0.a.d(f7, this.N, b13);
        }
        if (G != null && !this.R) {
            G.setColor(i10);
            G2.setColor(i10);
        }
        Paint G4 = G("paintChatActionText");
        if (G4 != null) {
            ((TextPaint) G4).linkColor = b11;
            G("paintChatActionText").setColor(b10);
            G("paintChatBotButton").setColor(b12);
        }
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerCheck"));
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerClock"));
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerHalfCheck"));
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerPinned"));
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerReplies"));
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerViews"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableBotInline"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableBotLink"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableBotLock"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawable_botInvite"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableCommentSticker"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableGoIcon"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableReplyIcon"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableShareIcon"));
        if (this.x == null || (bitmap = this.v) == null) {
            return;
        }
        Rect rect = this.U;
        Rect rect2 = this.T;
        if (f7 == 1.0f || (bitmap2 = this.P) == null) {
            this.F = true;
            rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
            rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
            this.x.drawBitmap(this.v, rect2, rect, (Paint) null);
            if (G != null) {
                G.setShader(this.E);
                G2.setShader(this.E);
            }
            if (G3 != null) {
                G3.setShader(this.E);
                return;
            }
            return;
        }
        this.F = false;
        rect2.set(0, 0, bitmap2.getWidth(), this.P.getHeight());
        rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
        this.x.drawBitmap(this.P, rect2, rect, (Paint) null);
        Paint paint = this.w;
        paint.setAlpha((int) (f7 * 255.0f));
        rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
        rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
        this.x.drawBitmap(this.v, rect2, rect, paint);
        if (G != null) {
            G.setShader(this.y);
            G2.setShader(this.y);
        }
        if (G3 != null) {
            G3.setShader(this.y);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void l(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.n == null || (bitmap = this.s) == null || (bitmapShader = this.y) == null) {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
            return;
        }
        boolean z10 = this.F;
        Matrix matrix = this.c;
        if (z10) {
            org.telegram.ui.ActionBar.j6.r(this.v, this.E, matrix, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.j6.r(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean o0() {
        return this.n != null ? this.y != null : org.telegram.ui.ActionBar.j6.a1();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }
}
