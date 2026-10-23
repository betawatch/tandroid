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
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.io.File;
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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class on implements org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.kc0 {
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
    public final /* synthetic */ qn V;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.c4 f;
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
    public boolean G = org.telegram.ui.ActionBar.h6.I.q();

    public on(qn qnVar) {
        int i10;
        int i11;
        this.V = qnVar;
        if (i(false)) {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            this.f = ChatThemeController.getInstance(i10).getDialogTheme(qnVar.T5);
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(qnVar.T5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.c4 c4Var = this.f;
            if (c4Var != null || dialogWallpaper != null) {
                l(c4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ah.j(25));
            }
        }
        if (ThemeEditorView.n == null) {
            org.telegram.ui.ActionBar.h6.o1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ah.j(25));
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final void B(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int G(int i10) {
        return b(i10, false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    public final int b(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.n == null) {
            return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i10)) < 0) ? org.telegram.ui.ActionBar.h6.x0(null, i10, false) : this.d.valueAt(indexOfKey);
    }

    public final org.telegram.ui.ActionBar.c4 c() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final void d(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.n == null || (bitmap = this.s) == null || (bitmapShader = this.y) == null) {
            org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
            return;
        }
        boolean z10 = this.F;
        Matrix matrix = this.c;
        if (z10) {
            org.telegram.ui.ActionBar.h6.r(this.v, this.E, matrix, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.h6.r(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
        }
    }

    public final Drawable e() {
        Drawable drawable = this.n;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.h6.t0();
    }

    public final void f() {
        Drawable f5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.h6.ml.entrySet()) {
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
                        int intValue = ((Integer) org.telegram.ui.ActionBar.h6.nl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.h6.x1(w(intValue), f5Var);
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

    public final void g() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.h6.ol.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.h6.pl.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(w(intValue));
            }
            this.b.put((String) entry.getKey(), paint);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Drawable drawable) {
        float f7;
        boolean z10;
        float f10;
        Paint n10;
        Paint n11;
        int i10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        if (this.V.ca != null) {
            return;
        }
        int i11 = AndroidUtilities.calcDrawableColor(drawable2)[0];
        int b10 = b(org.telegram.ui.ActionBar.h6.lc, false);
        int i12 = org.telegram.ui.ActionBar.h6.Hc;
        int b11 = b(i12, false);
        if (b10 != 0 && this.h == null) {
            i11 = b10;
        }
        this.Q = i11;
        if (drawable2 instanceof tn) {
            tn tnVar = (tn) drawable2;
            f7 = tnVar.f == null ? tnVar.d : 0.0f;
            drawable2 = tnVar.c(false);
        } else {
            f7 = 0.0f;
        }
        boolean z11 = drawable2 instanceof org.telegram.ui.Components.wc0;
        boolean z12 = (z11 || (drawable2 instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0;
        this.R = z12;
        org.telegram.ui.ActionBar.c4 c4Var = this.f;
        if (c4Var != null) {
            TLRPC.ChatTheme chatTheme = c4Var.d;
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
                                this.x.drawColor(i0.a.o(-16777216, (int) (f7 * 255.0f)));
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
                                Bitmap bitmap3 = ((org.telegram.ui.Components.wc0) drawable2).k;
                                this.v = bitmap3;
                                if (z10) {
                                    this.v = Bitmap.createBitmap(bitmap3);
                                    new Canvas(this.v).drawColor(-870178270);
                                }
                                this.x = new Canvas(this.s);
                                rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                                rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
                                this.x.drawBitmap(this.v, rect2, rect, (Paint) null);
                                this.x.drawColor(i0.a.o(-16777216, (int) (f7 * 255.0f)));
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
                        n10 = n("paintChatActionBackground");
                        Paint n12 = n("paintChatActionBackgroundSelected");
                        n11 = n("paintChatMessageBackgroundSelected");
                        HashMap hashMap = this.b;
                        if (n10 != null) {
                            Paint paint = (Paint) hashMap.get("paintChatActionBackgroundDarken");
                            if (paint == null) {
                                paint = new Paint(1);
                                hashMap.put("paintChatActionBackgroundDarken", paint);
                                paint.setColor(0);
                            }
                            if (this.R) {
                                ColorMatrix colorMatrix = new ColorMatrix();
                                if (z11) {
                                    if (((org.telegram.ui.Components.wc0) drawable2).q >= f10) {
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
                                n10.setAlpha(255);
                                n10.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                n10.setShader(this.E);
                                n10.setFilterBitmap(true);
                                n12.setAlpha(255);
                                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, 0.26f);
                                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.92f);
                                n12.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                                n12.setShader(this.E);
                                n12.setFilterBitmap(true);
                                paint.setAlpha(0);
                            } else {
                                n10.setColorFilter(null);
                                n10.setShader(null);
                                n12.setColorFilter(null);
                                n12.setShader(null);
                                paint.setAlpha(21);
                            }
                        }
                        if (n11 == null) {
                            n11 = new Paint(1);
                            hashMap.put("paintChatMessageBackgroundSelected", n11);
                        }
                        if (!this.S) {
                            if (b11 == 0) {
                                b11 = w(i12);
                            }
                            n11.setColor(b11);
                            n11.setColorFilter(null);
                            n11.setShader(null);
                            return;
                        }
                        ColorMatrix colorMatrix3 = new ColorMatrix();
                        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 2.5f);
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.75f);
                        n11.setAlpha(64);
                        n11.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                        n11.setShader(this.E);
                        n11.setFilterBitmap(true);
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
                n10 = n("paintChatActionBackground");
                Paint n122 = n("paintChatActionBackgroundSelected");
                n11 = n("paintChatMessageBackgroundSelected");
                HashMap hashMap2 = this.b;
                if (n10 != null) {
                }
                if (n11 == null) {
                }
                if (!this.S) {
                }
            }
        }
        z10 = false;
        this.S = z12;
        if (z12) {
        }
        n10 = n("paintChatActionBackground");
        Paint n1222 = n("paintChatActionBackgroundSelected");
        n11 = n("paintChatMessageBackgroundSelected");
        HashMap hashMap22 = this.b;
        if (n10 != null) {
        }
        if (n11 == null) {
        }
        if (!this.S) {
        }
    }

    public final boolean i(boolean z10) {
        TLRPC.User user;
        qn qnVar = this.V;
        if (qnVar.h != null) {
            return false;
        }
        if (z10) {
            return (qnVar.e != null || (user = qnVar.f) == null || user.bot) ? false : true;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final ColorFilter j() {
        return org.telegram.ui.ActionBar.h6.v3;
    }

    public final void k(org.telegram.ui.ActionBar.c4 c4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.d5 d5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.d5 d5Var2;
        qn qnVar = this.V;
        d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
        if (d5Var == null || qnVar.ca != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.G;
        gg.b bVar = c4Var != null ? c4Var.c : null;
        org.telegram.ui.ActionBar.c4 c4Var2 = this.f;
        gg.b bVar2 = c4Var2 != null ? c4Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.h;
        if (!z11) {
            if (!i(false)) {
                return;
            }
            if (gg.b.a(bVar2, bVar) && this.G == booleanValue && ChatThemeController.equals(wallPaper, wallPaper2)) {
                return;
            }
        }
        this.G = booleanValue;
        org.telegram.ui.ActionBar.g6 B0 = booleanValue ? org.telegram.ui.ActionBar.h6.J : org.telegram.ui.ActionBar.h6.B0();
        org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(B0, B0.Y, B0.q(), !z10);
        org.telegram.ui.ActionBar.c4 c4Var3 = this.f;
        if (c4Var3 == null && this.h == null) {
            Drawable t02 = org.telegram.ui.ActionBar.h6.t0();
            this.R = t02 instanceof org.telegram.ui.Components.wc0;
            h(t02);
            this.K = this.R ? -1 : org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ic, false);
            this.L = this.R ? -1 : org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.jc, false);
            this.M = this.R ? -1 : org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.jc, false);
            this.N = this.R ? -1 : org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.kc, false);
        } else {
            if (this.R) {
                Drawable drawable = this.n;
                if (drawable instanceof org.telegram.ui.Components.wc0) {
                    Bitmap bitmap = ((org.telegram.ui.Components.wc0) drawable).k;
                    this.P = bitmap;
                    if (c4Var3 != null) {
                        TLRPC.ChatTheme chatTheme = c4Var3.d;
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
                h(drawable2);
            }
        }
        this.O = this.Q;
        this.K = this.R ? -1 : b(org.telegram.ui.ActionBar.h6.ic, true);
        this.L = this.R ? -1 : b(org.telegram.ui.ActionBar.h6.jc, true);
        this.M = this.R ? -1 : b(org.telegram.ui.ActionBar.h6.jc, true);
        this.N = this.R ? -1 : b(org.telegram.ui.ActionBar.h6.kc, true);
        if (c4Var != null || wallPaper != null) {
            int i10 = AndroidUtilities.calcDrawableColor(this.n)[0];
            f();
            g();
        }
        c5Var.f = false;
        if (qnVar.T5 < 0) {
            c5Var.g = false;
        }
        c5Var.h = new ai.x9(this, c4Var, wallPaper, z10, 12);
        if (z10) {
            c5Var.k = new ln(this);
            c5Var.i = new jn(this, 0);
            c5Var.j = new jn(this, 1);
        } else {
            if (qnVar.X0 != null) {
                qnVar.jc();
            }
            c5Var.h.run();
        }
        c5Var.e = true;
        c5Var.m = this;
        c5Var.l = 250L;
        d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
        ((ActionBarLayout) d5Var2).f(c5Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(org.telegram.ui.ActionBar.c4 c4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        int i10;
        int i11;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.f6 f6Var;
        SparseIntArray R0;
        int indexOfKey;
        org.telegram.ui.ActionBar.g6 g6Var;
        boolean z11;
        Drawable drawable;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.g6 O0;
        int i13;
        org.telegram.ui.ActionBar.g6 O02;
        org.telegram.ui.ActionBar.c4 c4Var2 = c4Var;
        qn qnVar = this.V;
        if (qnVar.ca != null) {
            return;
        }
        this.f = c4Var2;
        this.h = wallPaper;
        Drawable backgroundImage = qnVar.fragmentView != null ? qnVar.X0.getBackgroundImage() : null;
        org.telegram.ui.Components.wc0 wc0Var = backgroundImage instanceof org.telegram.ui.Components.wc0 ? (org.telegram.ui.Components.wc0) backgroundImage : null;
        int i14 = wc0Var != null ? wc0Var.i : 0;
        if ((c4Var2 == null || c4Var2.a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.h6.ul.indexOfKey(org.telegram.ui.ActionBar.h6.lc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.h6.ul.valueAt(indexOfKey2);
            } else {
                int i15 = org.telegram.ui.ActionBar.h6.a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (c4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.h6.t0();
            if (t02 instanceof org.telegram.ui.Components.wc0) {
                ((org.telegram.ui.Components.wc0) t02).u(i14);
            }
            this.n = null;
            if (org.telegram.ui.ActionBar.h6.I.q() == this.G) {
                O02 = org.telegram.ui.ActionBar.h6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string) != null && !org.telegram.ui.ActionBar.h6.O0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string2) != null && org.telegram.ui.ActionBar.h6.O0(string2).q()) {
                    str = string2;
                }
                O02 = this.G ? org.telegram.ui.ActionBar.h6.O0(str) : org.telegram.ui.ActionBar.h6.O0(str2);
            }
            org.telegram.ui.ActionBar.h6.t(O02, false, this.G);
            h(this.n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.h6.J(ApplicationLoader.applicationContext, false);
        }
        if (c4Var2 == null) {
            this.d = new SparseIntArray();
            i11 = 0;
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
            boolean z12 = this.G;
            ArrayList arrayList2 = c4Var2.f;
            org.telegram.ui.ActionBar.g6 i16 = c4Var2.i(z12 ? 1 : 0);
            if (i16 == null) {
                int i17 = ((org.telegram.ui.ActionBar.b4) c4Var2.f.get(z12 ? 1 : 0)).d;
                i11 = 0;
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) ((gg.a) c4Var2.f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = b4Var.b(i17);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) c4Var2.f.get(z12 ? 1 : 0)).b;
                org.telegram.ui.ActionBar.g6 g6Var2 = new org.telegram.ui.ActionBar.g6(org.telegram.ui.ActionBar.h6.O0(org.telegram.ui.ActionBar.h6.r0(b10)));
                arrayList = arrayList2;
                f6Var = g6Var2.e(b4Var.a(), b10, tL_theme, i10, true);
                g6Var2.u(f6Var.a);
                i16 = g6Var2;
            } else {
                i11 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i16.a0;
                f6Var = sparseArray != null ? (org.telegram.ui.ActionBar.f6) sparseArray.get(((org.telegram.ui.ActionBar.b4) arrayList.get(z12 ? 1 : 0)).e) : null;
            }
            String[] strArr = new String[1];
            if (i16.b != null) {
                R0 = org.telegram.ui.ActionBar.h6.R0(new File(i16.b), null, strArr);
            } else {
                String str3 = i16.d;
                R0 = str3 != null ? org.telegram.ui.ActionBar.h6.R0(null, str3, strArr) : new SparseIntArray();
            }
            ((org.telegram.ui.ActionBar.b4) arrayList.get(z12 ? 1 : 0)).g = strArr[i11];
            if (f6Var != null) {
                SparseIntArray clone = R0.clone();
                f6Var.c(R0, clone);
                gg.b bVar = c4Var2.c;
                if (bVar != null && !TextUtils.isEmpty(bVar.b) && (g6Var = f6Var.b) != null && g6Var.b == null && !g6Var.q()) {
                    org.telegram.ui.ActionBar.f6.g(clone);
                }
                R0 = clone;
            }
            SparseIntArray sparseIntArray = org.telegram.ui.ActionBar.h6.rl;
            for (int i18 = i11; i18 < sparseIntArray.size(); i18++) {
                int keyAt = sparseIntArray.keyAt(i18);
                int valueAt = sparseIntArray.valueAt(i18);
                if (R0.indexOfKey(keyAt) < 0 && (indexOfKey = R0.indexOfKey(valueAt)) >= 0) {
                    R0.put(keyAt, R0.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.h6.ql;
            for (int i19 = i11; i19 < iArr.length; i19++) {
                if (R0.indexOfKey(i19) < 0) {
                    R0.put(i19, iArr[i19]);
                }
            }
            this.d = R0;
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable2 = this.n;
            i13 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
            this.n = ei.r6.f(drawable2, i13, this.h, this.G);
        } else if (wallPaper != null) {
            this.n = tn.d(this.n, wallPaper, this.G);
        } else {
            if (c4Var2.a) {
                org.telegram.ui.ActionBar.g6 d = org.telegram.ui.ActionBar.c4.d(this.G);
                i12 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
                org.telegram.ui.ActionBar.h6.H(d, c4Var2.g(i12, this.G ? 1 : 0), ((org.telegram.ui.ActionBar.b4) c4Var2.f.get(this.G ? 1 : 0)).g, i14, i11);
                drawable = new ColorDrawable(-16777216);
            } else {
                int w9 = w(org.telegram.ui.ActionBar.h6.Nd);
                int w10 = w(org.telegram.ui.ActionBar.h6.Od);
                int w11 = w(org.telegram.ui.ActionBar.h6.Pd);
                int w12 = w(org.telegram.ui.ActionBar.h6.Qd);
                org.telegram.ui.Components.wc0 wc0Var2 = new org.telegram.ui.Components.wc0();
                wc0Var2.s(wc0Var2.u, c4Var2.j(this.G ? 1 : 0).settings.intensity);
                TLRPC.Document e = c4Var2.e();
                if (wc0Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    wc0Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = wc0Var2.c;
                    if (weakReference != null) {
                        wc0Var2.y.setParentView((View) weakReference.get());
                    }
                    if (wc0Var2.T) {
                        wc0Var2.y.onAttachedToWindow();
                    }
                }
                wc0Var2.y.setImage(ImageLocation.getForDocument(e), "80_80", null, null, null, 0);
                wc0Var2.y.setAutoRepeatCount(1);
                wc0Var2.y.setAutoRepeat(1);
                wc0Var2.o(w9, w10, w11, w12, 0, true);
                wc0Var2.u(i14);
                int f7 = wc0Var2.f();
                boolean z13 = this.G;
                m4.w0 w0Var = new m4.w0(18, this, wc0Var2);
                org.telegram.ui.ActionBar.b4 b4Var2 = (org.telegram.ui.ActionBar.b4) c4Var2.f.get(z13 ? 1 : 0);
                if (b4Var2 == null || b4Var2.c == null) {
                    z11 = z13 ? 1 : 0;
                } else {
                    long h = c4Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = b4Var2.c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z11 = z13 ? 1 : 0;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i20);
                            int i21 = i20 + 1;
                            int i22 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i22;
                                i20 = i21;
                            }
                        }
                    } else {
                        z11 = z13 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new ci.d1(w0Var, h, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                }
                c4Var2 = c4Var;
                c4Var2.n(this.G ? 1 : 0, new org.telegram.messenger.n2(this, c4Var2, z11, wc0Var2, f7));
                drawable = wc0Var2;
            }
            this.n = drawable;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.H = new AnimatorSet();
            if (wc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new kn(wc0Var, 0));
                ofFloat.addListener(new mn(wc0Var));
                ofFloat.setDuration(200L);
                this.H.playTogether(ofFloat);
            }
            Drawable drawable3 = this.n;
            if (drawable3 instanceof org.telegram.ui.Components.wc0) {
                org.telegram.ui.Components.wc0 wc0Var3 = (org.telegram.ui.Components.wc0) drawable3;
                wc0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new kn(wc0Var3, 1));
                ofFloat2.addListener(new nn(wc0Var3));
                ofFloat2.setDuration(250L);
                this.H.playTogether(ofFloat2);
            }
            this.H.start();
        }
        if (c4Var2 != null || this.V.T5 < 0) {
            c10 = 0;
        } else {
            if (org.telegram.ui.ActionBar.h6.I.q() == this.G) {
                O0 = org.telegram.ui.ActionBar.h6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string3) != null && !org.telegram.ui.ActionBar.h6.O0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string4) != null && org.telegram.ui.ActionBar.h6.O0(string4).q()) {
                    str = string4;
                }
                O0 = this.G ? org.telegram.ui.ActionBar.h6.O0(str) : org.telegram.ui.ActionBar.h6.O0(str2);
            }
            c10 = 0;
            org.telegram.ui.ActionBar.h6.t(O0, false, this.G);
        }
        int i23 = AndroidUtilities.calcDrawableColor(this.n)[c10];
        f();
        g();
        h(this.n);
        m(1.0f);
    }

    public final void m(float f7) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b.isEmpty()) {
            return;
        }
        Paint n10 = n("paintChatActionBackground");
        Paint n11 = n("paintChatActionBackgroundSelected");
        Paint n12 = n("paintChatMessageBackgroundSelected");
        int i10 = this.Q;
        int b10 = this.R ? -1 : b(org.telegram.ui.ActionBar.h6.ic, true);
        int b11 = this.R ? -1 : b(org.telegram.ui.ActionBar.h6.jc, true);
        int b12 = this.R ? -1 : b(org.telegram.ui.ActionBar.h6.jc, true);
        int b13 = this.R ? -1 : b(org.telegram.ui.ActionBar.h6.kc, true);
        if (f7 != 1.0f) {
            i10 = i0.a.f(f7, this.O, i10);
            b10 = i0.a.f(f7, this.K, b10);
            b11 = i0.a.f(f7, this.L, b11);
            b12 = i0.a.f(f7, this.M, b12);
            b13 = i0.a.f(f7, this.N, b13);
        }
        if (n10 != null && !this.R) {
            n10.setColor(i10);
            n11.setColor(i10);
        }
        Paint n13 = n("paintChatActionText");
        if (n13 != null) {
            ((TextPaint) n13).linkColor = b11;
            n("paintChatActionText").setColor(b10);
            n("paintChatBotButton").setColor(b12);
        }
        org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerCheck"));
        org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerClock"));
        org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerHalfCheck"));
        org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerPinned"));
        org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerReplies"));
        org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerViews"));
        org.telegram.ui.ActionBar.h6.x1(b13, getDrawable("drawableBotInline"));
        org.telegram.ui.ActionBar.h6.x1(b13, getDrawable("drawableBotLink"));
        org.telegram.ui.ActionBar.h6.x1(b13, getDrawable("drawableBotLock"));
        org.telegram.ui.ActionBar.h6.x1(b13, getDrawable("drawable_botInvite"));
        org.telegram.ui.ActionBar.h6.x1(b13, getDrawable("drawableCommentSticker"));
        org.telegram.ui.ActionBar.h6.x1(b13, getDrawable("drawableGoIcon"));
        org.telegram.ui.ActionBar.h6.x1(b13, getDrawable("drawableReplyIcon"));
        org.telegram.ui.ActionBar.h6.x1(b13, getDrawable("drawableShareIcon"));
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
            if (n10 != null) {
                n10.setShader(this.E);
                n11.setShader(this.E);
            }
            if (n12 != null) {
                n12.setShader(this.E);
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
        if (n10 != null) {
            n10.setShader(this.y);
            n11.setShader(this.y);
        }
        if (n12 != null) {
            n12.setShader(this.y);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final Paint n(String str) {
        if (this.f == null && this.n == null) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int r(int i10) {
        return w(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final boolean s() {
        return this.n != null ? this.y != null : org.telegram.ui.ActionBar.h6.b1();
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int w(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f == null) {
            return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.h6.rl.get(i10);
        return (i11 < 0 || (indexOfKey = this.d.indexOfKey(i11)) < 0) ? org.telegram.ui.ActionBar.h6.x0(null, i10, false) : this.d.valueAt(indexOfKey);
    }
}
