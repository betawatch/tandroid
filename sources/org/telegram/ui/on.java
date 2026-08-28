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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class on implements org.telegram.ui.ActionBar.b6, org.telegram.ui.Components.ya0 {
    public BitmapShader A;
    public boolean B;
    public AnimatorSet D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.d5 F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public Bitmap L;
    public int M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ qn R;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.b4 f;
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
    public final Rect P = new Rect();
    public final Rect Q = new Rect();
    public boolean C = org.telegram.ui.ActionBar.f6.I.q();

    public on(qn qnVar) {
        int i9;
        int i10;
        this.R = qnVar;
        if (h(false)) {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            this.f = ChatThemeController.getInstance(i9).getDialogTheme(qnVar.P5);
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i10).getDialogWallpaper(qnVar.P5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.f;
            if (b4Var != null || dialogWallpaper != null) {
                j(b4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new bg.d2(25));
            }
        }
        if (ThemeEditorView.n == null) {
            org.telegram.ui.ActionBar.f6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new bg.d2(25));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.v3;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final int N0(int i9) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i9)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f == null) {
            return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i9);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.f6.ol.get(i9);
        return (i10 < 0 || (indexOfKey = this.d.indexOfKey(i10)) < 0) ? org.telegram.ui.ActionBar.f6.w0(null, i9, false) : this.d.valueAt(indexOfKey);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final Paint O(String str) {
        if (this.f == null && this.n == null) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final boolean a() {
        return org.telegram.ui.ActionBar.f6.I.q();
    }

    public final int b(int i9, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.n == null) {
            return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i9)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i9)) < 0) ? org.telegram.ui.ActionBar.f6.w0(null, i9, false) : this.d.valueAt(indexOfKey);
    }

    public final org.telegram.ui.ActionBar.b4 c() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void c1(int i9, int i10) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i9, i10);
        }
    }

    public final Drawable d() {
        Drawable drawable = this.n;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.f6.s0();
    }

    public final void e() {
        Drawable d5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.f6.jl.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    d5Var = new org.telegram.ui.ActionBar.d5(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    d5Var = new org.telegram.ui.ActionBar.d5(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    d5Var = new org.telegram.ui.ActionBar.d5(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    d5Var = new org.telegram.ui.ActionBar.d5(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    d5Var = new org.telegram.ui.ActionBar.d5(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    d5Var = new org.telegram.ui.ActionBar.d5(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    d5Var = new org.telegram.ui.ActionBar.d5(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    d5Var = new org.telegram.ui.ActionBar.d5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    d5Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (d5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.f6.kl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.f6.w1(N0(intValue), d5Var);
                            break;
                        }
                    }
                    break;
            }
            if (d5Var != null) {
                this.a.put((String) entry.getKey(), d5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.f6.ll.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.f6.ml.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(N0(intValue));
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
        float f10;
        boolean z10;
        float f11;
        Paint O;
        Paint O2;
        int i9;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        if (this.R.Y9 != null) {
            return;
        }
        int i10 = AndroidUtilities.calcDrawableColor(drawable2)[0];
        int b10 = b(org.telegram.ui.ActionBar.f6.lc, false);
        int i11 = org.telegram.ui.ActionBar.f6.Hc;
        int b11 = b(i11, false);
        if (b10 != 0 && this.h == null) {
            i10 = b10;
        }
        this.M = i10;
        if (drawable2 instanceof tn) {
            tn tnVar = (tn) drawable2;
            f10 = tnVar.f == null ? tnVar.d : 0.0f;
            drawable2 = tnVar.c(false);
        } else {
            f10 = 0.0f;
        }
        boolean z11 = drawable2 instanceof org.telegram.ui.Components.jb0;
        boolean z12 = (z11 || (drawable2 instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0;
        this.N = z12;
        org.telegram.ui.ActionBar.b4 b4Var = this.f;
        if (b4Var != null) {
            TLRPC.ChatTheme chatTheme = b4Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (tL_starGiftUnique != null && this.C) {
                        z10 = true;
                        this.O = z12;
                        if (z12) {
                            boolean z13 = drawable2 instanceof BitmapDrawable;
                            f11 = 0.0f;
                            Rect rect = this.Q;
                            Rect rect2 = this.P;
                            if (z13) {
                                Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                int i12 = 40;
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    i9 = (int) ((40 / bitmap.getWidth()) * bitmap.getHeight());
                                } else {
                                    i12 = (int) ((40 / bitmap.getHeight()) * bitmap.getWidth());
                                    i9 = 40;
                                }
                                this.s = Bitmap.createBitmap(i12, i9, Bitmap.Config.ARGB_8888);
                                this.x = new Canvas(this.s);
                                rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
                                this.x.drawBitmap(bitmap, rect2, rect, (Paint) null);
                                Utilities.blurBitmap(this.s, 3);
                                this.x.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
                                Bitmap bitmap2 = this.s;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                this.y = new BitmapShader(bitmap2, tileMode, tileMode);
                                this.v = Bitmap.createBitmap(this.s);
                                this.A = new BitmapShader(this.v, tileMode, tileMode);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    this.y.setFilterMode(2);
                                    this.A.setFilterMode(2);
                                }
                                this.B = true;
                            } else {
                                this.s = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                Bitmap bitmap3 = ((org.telegram.ui.Components.jb0) drawable2).k;
                                this.v = bitmap3;
                                if (z10) {
                                    this.v = Bitmap.createBitmap(bitmap3);
                                    new Canvas(this.v).drawColor(-870178270);
                                }
                                this.x = new Canvas(this.s);
                                rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                                rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
                                this.x.drawBitmap(this.v, rect2, rect, (Paint) null);
                                this.x.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
                                if (z10) {
                                    this.x.drawColor(-870178270);
                                }
                                Bitmap bitmap4 = this.s;
                                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                                this.y = new BitmapShader(bitmap4, tileMode2, tileMode2);
                                this.A = new BitmapShader(this.v, tileMode2, tileMode2);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    this.y.setFilterMode(2);
                                    this.A.setFilterMode(2);
                                }
                                this.B = true;
                            }
                        } else {
                            f11 = 0.0f;
                            this.s = null;
                            this.y = null;
                            this.v = null;
                            this.x = null;
                            this.B = false;
                        }
                        O = O("paintChatActionBackground");
                        Paint O3 = O("paintChatActionBackgroundSelected");
                        O2 = O("paintChatMessageBackgroundSelected");
                        HashMap hashMap = this.b;
                        if (O != null) {
                            Paint paint = (Paint) hashMap.get("paintChatActionBackgroundDarken");
                            if (paint == null) {
                                paint = new Paint(1);
                                hashMap.put("paintChatActionBackgroundDarken", paint);
                                paint.setColor(0);
                            }
                            if (this.N) {
                                ColorMatrix colorMatrix = new ColorMatrix();
                                if (z11) {
                                    if (((org.telegram.ui.Components.jb0) drawable2).q >= f11) {
                                        colorMatrix.setSaturation(1.6f);
                                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.C ? 0.97f : 0.92f);
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.C ? 0.12f : -0.06f);
                                    } else {
                                        colorMatrix.setSaturation(1.1f);
                                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.C ? 0.4f : 0.8f);
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.C ? 0.08f : -0.06f);
                                    }
                                } else {
                                    colorMatrix.setSaturation(1.6f);
                                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.C ? 0.9f : 0.84f);
                                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.C ? 0.04f : 0.06f);
                                }
                                O.setAlpha(255);
                                O.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                O.setShader(this.A);
                                O.setFilterBitmap(true);
                                O3.setAlpha(255);
                                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, 0.26f);
                                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.92f);
                                O3.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                                O3.setShader(this.A);
                                O3.setFilterBitmap(true);
                                paint.setAlpha(0);
                            } else {
                                O.setColorFilter(null);
                                O.setShader(null);
                                O3.setColorFilter(null);
                                O3.setShader(null);
                                paint.setAlpha(21);
                            }
                        }
                        if (O2 == null) {
                            O2 = new Paint(1);
                            hashMap.put("paintChatMessageBackgroundSelected", O2);
                        }
                        if (!this.O) {
                            if (b11 == 0) {
                                b11 = N0(i11);
                            }
                            O2.setColor(b11);
                            O2.setColorFilter(null);
                            O2.setShader(null);
                            return;
                        }
                        ColorMatrix colorMatrix3 = new ColorMatrix();
                        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 2.5f);
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.75f);
                        O2.setAlpha(64);
                        O2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                        O2.setShader(this.A);
                        O2.setFilterBitmap(true);
                        return;
                    }
                }
            }
            tL_starGiftUnique = null;
            if (tL_starGiftUnique != null) {
                z10 = true;
                this.O = z12;
                if (z12) {
                }
                O = O("paintChatActionBackground");
                Paint O32 = O("paintChatActionBackgroundSelected");
                O2 = O("paintChatMessageBackgroundSelected");
                HashMap hashMap2 = this.b;
                if (O != null) {
                }
                if (O2 == null) {
                }
                if (!this.O) {
                }
            }
        }
        z10 = false;
        this.O = z12;
        if (z12) {
        }
        O = O("paintChatActionBackground");
        Paint O322 = O("paintChatActionBackgroundSelected");
        O2 = O("paintChatMessageBackgroundSelected");
        HashMap hashMap22 = this.b;
        if (O != null) {
        }
        if (O2 == null) {
        }
        if (!this.O) {
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    public final boolean h(boolean z10) {
        TLRPC.User user;
        qn qnVar = this.R;
        if (qnVar.h != null) {
            return false;
        }
        if (z10) {
            return (qnVar.e != null || (user = qnVar.f) == null || user.bot) ? false : true;
        }
        return true;
    }

    public final void i(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.b5 b5Var2;
        qn qnVar = this.R;
        b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
        if (b5Var == null || qnVar.Y9 != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.C;
        nf.b bVar = b4Var != null ? b4Var.c : null;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.f;
        nf.b bVar2 = b4Var2 != null ? b4Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.h;
        if (!z11) {
            if (!h(false)) {
                return;
            }
            if (nf.b.a(bVar2, bVar) && this.C == booleanValue && ChatThemeController.equals(wallPaper, wallPaper2)) {
                return;
            }
        }
        this.C = booleanValue;
        org.telegram.ui.ActionBar.e6 A0 = booleanValue ? org.telegram.ui.ActionBar.f6.J : org.telegram.ui.ActionBar.f6.A0();
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(A0, A0.U, A0.q(), !z10);
        org.telegram.ui.ActionBar.b4 b4Var3 = this.f;
        if (b4Var3 == null && this.h == null) {
            Drawable s02 = org.telegram.ui.ActionBar.f6.s0();
            this.N = s02 instanceof org.telegram.ui.Components.jb0;
            g(s02);
            this.G = this.N ? -1 : org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ic, false);
            this.H = this.N ? -1 : org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jc, false);
            this.I = this.N ? -1 : org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jc, false);
            this.J = this.N ? -1 : org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kc, false);
        } else {
            if (this.N) {
                Drawable drawable = this.n;
                if (drawable instanceof org.telegram.ui.Components.jb0) {
                    Bitmap bitmap = ((org.telegram.ui.Components.jb0) drawable).k;
                    this.L = bitmap;
                    if (b4Var3 != null) {
                        TLRPC.ChatTheme chatTheme = b4Var3.d;
                        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                            TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (tL_starGiftUnique != null && this.C) {
                                    this.L = Bitmap.createBitmap(bitmap);
                                    new Canvas(this.L).drawColor(-870178270);
                                }
                            }
                        }
                        tL_starGiftUnique = null;
                        if (tL_starGiftUnique != null) {
                            this.L = Bitmap.createBitmap(bitmap);
                            new Canvas(this.L).drawColor(-870178270);
                        }
                    }
                }
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                g(drawable2);
            }
        }
        this.K = this.M;
        this.G = this.N ? -1 : b(org.telegram.ui.ActionBar.f6.ic, true);
        this.H = this.N ? -1 : b(org.telegram.ui.ActionBar.f6.jc, true);
        this.I = this.N ? -1 : b(org.telegram.ui.ActionBar.f6.jc, true);
        this.J = this.N ? -1 : b(org.telegram.ui.ActionBar.f6.kc, true);
        if (b4Var != null || wallPaper != null) {
            int i9 = AndroidUtilities.calcDrawableColor(this.n)[0];
            e();
            f();
        }
        a5Var.f = false;
        if (qnVar.P5 < 0) {
            a5Var.g = false;
        }
        a5Var.h = new bg.d(this, b4Var, wallPaper, z10, 10);
        if (z10) {
            a5Var.k = new ln(this);
            a5Var.i = new jn(this, 0);
            a5Var.j = new jn(this, 1);
        } else {
            if (qnVar.T0 != null) {
                qnVar.ec();
            }
            a5Var.h.run();
        }
        a5Var.e = true;
        a5Var.m = this;
        a5Var.l = 250L;
        b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
        ((ActionBarLayout) b5Var2).f(a5Var, null);
    }

    public final void j(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        int i9;
        boolean z11;
        org.telegram.ui.Components.jb0 jb0Var;
        Drawable drawable;
        int i10;
        char c10;
        org.telegram.ui.ActionBar.e6 N0;
        int i11;
        org.telegram.ui.ActionBar.e6 N02;
        org.telegram.ui.ActionBar.b4 b4Var2 = b4Var;
        qn qnVar = this.R;
        if (qnVar.Y9 != null) {
            return;
        }
        this.f = b4Var2;
        this.h = wallPaper;
        Drawable backgroundImage = qnVar.fragmentView != null ? qnVar.T0.getBackgroundImage() : null;
        org.telegram.ui.Components.jb0 jb0Var2 = backgroundImage instanceof org.telegram.ui.Components.jb0 ? (org.telegram.ui.Components.jb0) backgroundImage : null;
        int i12 = jb0Var2 != null ? jb0Var2.i : 0;
        if ((b4Var2 == null || b4Var2.a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.f6.rl.indexOfKey(org.telegram.ui.ActionBar.f6.lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.f6.rl.valueAt(indexOfKey);
            } else {
                int i13 = org.telegram.ui.ActionBar.f6.a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (b4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.f6.s0();
            if (s02 instanceof org.telegram.ui.Components.jb0) {
                ((org.telegram.ui.Components.jb0) s02).v(i12);
            }
            this.n = null;
            if (org.telegram.ui.ActionBar.f6.I.q() == this.C) {
                N02 = org.telegram.ui.ActionBar.f6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string) != null && !org.telegram.ui.ActionBar.f6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string2) != null && org.telegram.ui.ActionBar.f6.N0(string2).q()) {
                    str = string2;
                }
                N02 = this.C ? org.telegram.ui.ActionBar.f6.N0(str) : org.telegram.ui.ActionBar.f6.N0(str2);
            }
            org.telegram.ui.ActionBar.f6.t(N02, false, this.C);
            g(this.n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.f6.J(ApplicationLoader.applicationContext, false);
        }
        if (b4Var2 == null) {
            this.d = new SparseIntArray();
        } else {
            i9 = ((org.telegram.ui.ActionBar.o2) this.R).currentAccount;
            this.d = b4Var2.b(i9, this.C ? 1 : 0);
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable2 = this.n;
            i11 = ((org.telegram.ui.ActionBar.o2) this.R).currentAccount;
            this.n = kh.r6.f(drawable2, i11, this.h, this.C);
        } else if (wallPaper != null) {
            this.n = tn.d(this.n, wallPaper, this.C);
        } else {
            if (b4Var2.a) {
                org.telegram.ui.ActionBar.e6 e10 = org.telegram.ui.ActionBar.b4.e(this.C);
                i10 = ((org.telegram.ui.ActionBar.o2) this.R).currentAccount;
                org.telegram.ui.ActionBar.f6.H(e10, b4Var2.h(i10, this.C ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var2.f.get(this.C ? 1 : 0)).g, i12, false);
                drawable = new ColorDrawable(-16777216);
            } else {
                int N03 = N0(org.telegram.ui.ActionBar.f6.Nd);
                int N04 = N0(org.telegram.ui.ActionBar.f6.Od);
                int N05 = N0(org.telegram.ui.ActionBar.f6.Pd);
                int N06 = N0(org.telegram.ui.ActionBar.f6.Qd);
                org.telegram.ui.Components.jb0 jb0Var3 = new org.telegram.ui.Components.jb0();
                jb0Var3.t(jb0Var3.u, b4Var2.k(this.C ? 1 : 0).settings.intensity);
                TLRPC.Document f10 = b4Var2.f();
                if (jb0Var3.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    jb0Var3.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = jb0Var3.c;
                    if (weakReference != null) {
                        jb0Var3.y.setParentView((View) weakReference.get());
                    }
                    if (jb0Var3.T) {
                        jb0Var3.y.onAttachedToWindow();
                    }
                }
                jb0Var3.y.setImage(ImageLocation.getForDocument(f10), "80_80", null, null, null, 0);
                jb0Var3.y.setAutoRepeatCount(1);
                jb0Var3.y.setAutoRepeat(1);
                jb0Var3.o(N03, N04, N05, N06, 0, true);
                jb0Var3.v(i12);
                int f11 = jb0Var3.f();
                boolean z12 = this.C;
                ih.v3 v3Var = new ih.v3(21, this, jb0Var3);
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var2.f.get(z12 ? 1 : 0);
                if (a4Var == null || a4Var.c == null) {
                    z11 = z12 ? 1 : 0;
                    jb0Var = jb0Var3;
                } else {
                    jb0Var = jb0Var3;
                    long i14 = b4Var2.i(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = a4Var.c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
                    if (arrayList != null && document == null) {
                        int size = arrayList.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i15);
                            int i16 = i15 + 1;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            z11 = z12 ? 1 : 0;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                z12 = z11;
                                i15 = i16;
                            }
                        }
                    }
                    z11 = z12;
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new d3.e(v3Var, i14, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                }
                b4Var2 = b4Var;
                org.telegram.ui.Components.jb0 jb0Var4 = jb0Var;
                b4Var2.o(this.C ? 1 : 0, new org.telegram.messenger.j2(this, b4Var2, z11, jb0Var4, f11));
                drawable = jb0Var4;
            }
            this.n = drawable;
        }
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.D = new AnimatorSet();
            if (jb0Var2 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new kn(jb0Var2, 0));
                ofFloat.addListener(new mn(jb0Var2));
                ofFloat.setDuration(200L);
                this.D.playTogether(ofFloat);
            }
            Drawable drawable3 = this.n;
            if (drawable3 instanceof org.telegram.ui.Components.jb0) {
                org.telegram.ui.Components.jb0 jb0Var5 = (org.telegram.ui.Components.jb0) drawable3;
                jb0Var5.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new kn(jb0Var5, 1));
                ofFloat2.addListener(new nn(jb0Var5));
                ofFloat2.setDuration(250L);
                this.D.playTogether(ofFloat2);
            }
            this.D.start();
        }
        if (b4Var2 != null || this.R.P5 < 0) {
            c10 = 0;
        } else {
            if (org.telegram.ui.ActionBar.f6.I.q() == this.C) {
                N0 = org.telegram.ui.ActionBar.f6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string3) != null && !org.telegram.ui.ActionBar.f6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string4) != null && org.telegram.ui.ActionBar.f6.N0(string4).q()) {
                    str = string4;
                }
                N0 = this.C ? org.telegram.ui.ActionBar.f6.N0(str) : org.telegram.ui.ActionBar.f6.N0(str2);
            }
            c10 = 0;
            org.telegram.ui.ActionBar.f6.t(N0, false, this.C);
        }
        int i17 = AndroidUtilities.calcDrawableColor(this.n)[c10];
        e();
        f();
        g(this.n);
        k(1.0f);
    }

    public final void k(float f10) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b.isEmpty()) {
            return;
        }
        Paint O = O("paintChatActionBackground");
        Paint O2 = O("paintChatActionBackgroundSelected");
        Paint O3 = O("paintChatMessageBackgroundSelected");
        int i9 = this.M;
        int b10 = this.N ? -1 : b(org.telegram.ui.ActionBar.f6.ic, true);
        int b11 = this.N ? -1 : b(org.telegram.ui.ActionBar.f6.jc, true);
        int b12 = this.N ? -1 : b(org.telegram.ui.ActionBar.f6.jc, true);
        int b13 = this.N ? -1 : b(org.telegram.ui.ActionBar.f6.kc, true);
        if (f10 != 1.0f) {
            i9 = i0.a.d(f10, this.K, i9);
            b10 = i0.a.d(f10, this.G, b10);
            b11 = i0.a.d(f10, this.H, b11);
            b12 = i0.a.d(f10, this.I, b12);
            b13 = i0.a.d(f10, this.J, b13);
        }
        if (O != null && !this.N) {
            O.setColor(i9);
            O2.setColor(i9);
        }
        Paint O4 = O("paintChatActionText");
        if (O4 != null) {
            ((TextPaint) O4).linkColor = b11;
            O("paintChatActionText").setColor(b10);
            O("paintChatBotButton").setColor(b12);
        }
        org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerCheck"));
        org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerClock"));
        org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerHalfCheck"));
        org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerPinned"));
        org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerReplies"));
        org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerViews"));
        org.telegram.ui.ActionBar.f6.w1(b13, getDrawable("drawableBotInline"));
        org.telegram.ui.ActionBar.f6.w1(b13, getDrawable("drawableBotLink"));
        org.telegram.ui.ActionBar.f6.w1(b13, getDrawable("drawableBotLock"));
        org.telegram.ui.ActionBar.f6.w1(b13, getDrawable("drawable_botInvite"));
        org.telegram.ui.ActionBar.f6.w1(b13, getDrawable("drawableCommentSticker"));
        org.telegram.ui.ActionBar.f6.w1(b13, getDrawable("drawableGoIcon"));
        org.telegram.ui.ActionBar.f6.w1(b13, getDrawable("drawableReplyIcon"));
        org.telegram.ui.ActionBar.f6.w1(b13, getDrawable("drawableShareIcon"));
        if (this.x == null || (bitmap = this.v) == null) {
            return;
        }
        Rect rect = this.Q;
        Rect rect2 = this.P;
        if (f10 == 1.0f || (bitmap2 = this.L) == null) {
            this.B = true;
            rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
            rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
            this.x.drawBitmap(this.v, rect2, rect, (Paint) null);
            if (O != null) {
                O.setShader(this.A);
                O2.setShader(this.A);
            }
            if (O3 != null) {
                O3.setShader(this.A);
                return;
            }
            return;
        }
        this.B = false;
        rect2.set(0, 0, bitmap2.getWidth(), this.L.getHeight());
        rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
        this.x.drawBitmap(this.L, rect2, rect, (Paint) null);
        Paint paint = this.w;
        paint.setAlpha((int) (f10 * 255.0f));
        rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
        rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
        this.x.drawBitmap(this.v, rect2, rect, paint);
        if (O != null) {
            O.setShader(this.y);
            O2.setShader(this.y);
        }
        if (O3 != null) {
            O3.setShader(this.y);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void o(float f10, float f11, int i9, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.n == null || (bitmap = this.s) == null || (bitmapShader = this.y) == null) {
            org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
            return;
        }
        boolean z10 = this.B;
        Matrix matrix = this.c;
        if (z10) {
            org.telegram.ui.ActionBar.f6.r(this.v, this.A, matrix, i9, i10, f10, f11);
        } else {
            org.telegram.ui.ActionBar.f6.r(bitmap, bitmapShader, matrix, i9, i10, f10, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final int p0(int i9) {
        return N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final int q1(int i9) {
        return b(i9, false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final boolean t0() {
        return this.n != null ? this.y != null : org.telegram.ui.ActionBar.f6.a1();
    }
}
