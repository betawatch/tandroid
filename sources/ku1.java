// default package

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
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ku1 implements wjb, h37 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final /* synthetic */ mu1 G;
    public SparseIntArray e;
    public jy3 f;
    public TLRPC.WallPaper g;
    public Drawable h;
    public ValueAnimator i;
    public Bitmap j;
    public Bitmap k;
    public Canvas m;
    public BitmapShader n;
    public BitmapShader o;
    public boolean p;
    public AnimatorSet r;
    public boolean s;
    public m17 t;
    public m17 u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Matrix c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint l = new Paint();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public boolean q = bkb.I.o();

    public ku1(mu1 mu1Var) {
        int i;
        int i2;
        elb elbVar;
        this.G = mu1Var;
        if (p(false)) {
            i = ((d) mu1Var).currentAccount;
            je2 e = je2.e(i);
            long j = mu1Var.l6;
            LongSparseArray longSparseArray = e.h;
            elb elbVar2 = (elb) longSparseArray.get(j);
            if (elbVar2 == null) {
                String string = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + e.currentAccount + "_" + j, null);
                if (string != null) {
                    if (string.startsWith("gift_")) {
                        elbVar = new elb(null, string.substring(5));
                    } else if (string.startsWith("emoticon_")) {
                        elbVar = new elb(string.substring(9), null);
                    } else if (!TextUtils.isEmpty(string)) {
                        elbVar = new elb(string, null);
                    }
                    elbVar2 = elbVar;
                    longSparseArray.put(j, elbVar2);
                }
                elbVar2 = null;
                longSparseArray.put(j, elbVar2);
            }
            this.f = e.g(elbVar2);
            i2 = ((d) mu1Var).currentAccount;
            TLRPC.WallPaper c = je2.e(i2).c(mu1Var.l6);
            this.g = c;
            jy3 jy3Var = this.f;
            if (jy3Var != null || c != null) {
                r(jy3Var, c, false);
                gl.d3(new jc((byte) 18));
            }
        }
        s();
        if (ThemeEditorView.p == null) {
            bkb.r1(true, true);
            return;
        }
        gl.d3(new jc((byte) 18));
    }

    @Override // wjb
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        return (sparseIntArray == null || sparseIntArray.size() <= 0) ? bkb.I.o() : this.q;
    }

    @Override // wjb
    public final void b(float f, float f2, int i, int i2) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h == null || (bitmap = this.j) == null || (bitmapShader = this.n) == null) {
            bkb.q(f, f2, i, i2);
            return;
        }
        boolean z = this.p;
        Matrix matrix = this.c;
        if (z) {
            bkb.r(this.k, this.o, matrix, i, i2, f, f2);
        } else {
            bkb.r(bitmap, bitmapShader, matrix, i, i2, f, f2);
        }
    }

    @Override // wjb
    public final ColorFilter c() {
        return bkb.u3;
    }

    @Override // wjb
    public final Paint d(String str) {
        if (this.f == null && this.h == null && !this.s) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // wjb
    public final boolean e() {
        return this.G.K7();
    }

    @Override // wjb
    public final int f(int i) {
        return h(i);
    }

    @Override // wjb
    public final boolean g() {
        return (this.h != null || this.s) ? this.n != null : bkb.b1();
    }

    @Override // wjb
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    @Override // wjb
    public final int h(int i) {
        int indexOfKey;
        Integer y0;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.s && (y0 = bkb.y0(i, this)) != null) {
            return y0.intValue();
        }
        if (this.f == null) {
            return bkb.w0(null, i, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i2 = bkb.hm.get(i);
        return (i2 < 0 || (indexOfKey = this.d.indexOfKey(i2)) < 0) ? bkb.w0(null, i, false) : this.d.valueAt(indexOfKey);
    }

    @Override // wjb
    public final void i(int i, int i2) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i, i2);
        }
    }

    @Override // wjb
    public final int j(int i) {
        return k(i, false);
    }

    public final int k(int i, boolean z) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.h == null) {
            return bkb.w0(null, i, false);
        }
        if (!z && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i)) < 0) ? bkb.w0(null, i, false) : this.d.valueAt(indexOfKey);
    }

    public final Drawable l() {
        Drawable drawable = this.h;
        return drawable != null ? drawable : bkb.s0();
    }

    public final void m() {
        Drawable m17Var;
        for (Map.Entry entry : bkb.cm.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    m17Var = new m17(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    m17Var = new m17(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    m17Var = new m17(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    m17Var = new m17(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    m17Var = new m17(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    m17Var = new m17(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    m17Var = new m17(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    m17Var = new m17(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    m17Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (m17Var != null) {
                        int intValue = ((Integer) bkb.dm.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            bkb.A1(h(intValue), m17Var);
                            break;
                        }
                    }
                    break;
            }
            if (m17Var != null) {
                this.a.put((String) entry.getKey(), m17Var);
            }
        }
    }

    public final void n() {
        Paint paint;
        for (Map.Entry entry : bkb.em.entrySet()) {
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
            int intValue = ((Integer) bkb.fm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(h(intValue));
            }
            this.b.put((String) entry.getKey(), paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Drawable drawable) {
        float f;
        boolean z;
        float f2;
        Paint d;
        Paint d2;
        int width;
        int i;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        mu1 mu1Var = this.G;
        if (mu1Var.za != null) {
            return;
        }
        int i2 = gl.q(drawable2)[0];
        int k = k(bkb.bd, false);
        int i3 = bkb.xd;
        int k2 = k(i3, false);
        if (k != 0 && this.g == null) {
            i2 = k;
        }
        boolean K7 = mu1Var.K7();
        if (K7) {
            i2 = bm2.k(k(bkb.Da, false), k(bkb.ta, false));
        }
        this.B = i2;
        if (drawable2 instanceof p72) {
            p72 p72Var = (p72) drawable2;
            f = p72Var.f == null ? p72Var.d : 0.0f;
            drawable2 = p72Var.c(false);
        } else {
            f = 0.0f;
        }
        boolean z2 = !K7 && ((drawable2 instanceof ye7) || (drawable2 instanceof BitmapDrawable)) && gba.o() != 0;
        this.C = z2;
        jy3 jy3Var = this.f;
        if (jy3Var != null) {
            TLRPC.ChatTheme chatTheme = jy3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (tL_starGiftUnique != null && this.q) {
                        z = true;
                        this.D = z2;
                        if (z2) {
                            boolean z3 = drawable2 instanceof BitmapDrawable;
                            Rect rect = this.F;
                            f2 = 0.0f;
                            Rect rect2 = this.E;
                            if (z3) {
                                Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    i = (int) (bitmap.getHeight() * (40.0f / bitmap.getWidth()));
                                    width = 40;
                                } else {
                                    width = (int) (bitmap.getWidth() * (40.0f / bitmap.getHeight()));
                                    i = 40;
                                }
                                this.j = Bitmap.createBitmap(width, i, Bitmap.Config.ARGB_8888);
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(bitmap, rect2, rect, (Paint) null);
                                Utilities.blurBitmap(this.j, 3);
                                this.m.drawColor(bm2.o(-16777216, (int) (f * 255.0f)));
                                Bitmap bitmap2 = this.j;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                this.n = new BitmapShader(bitmap2, tileMode, tileMode);
                                this.k = Bitmap.createBitmap(this.j);
                                this.o = new BitmapShader(this.k, tileMode, tileMode);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    this.n.setFilterMode(2);
                                    this.o.setFilterMode(2);
                                }
                                this.p = true;
                            } else {
                                this.j = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                Bitmap bitmap3 = ((ye7) drawable2).k;
                                this.k = bitmap3;
                                if (z) {
                                    this.k = Bitmap.createBitmap(bitmap3);
                                    new Canvas(this.k).drawColor(-870178270);
                                }
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
                                this.m.drawColor(bm2.o(-16777216, (int) (f * 255.0f)));
                                if (z) {
                                    this.m.drawColor(-870178270);
                                }
                                Bitmap bitmap4 = this.j;
                                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                                this.n = new BitmapShader(bitmap4, tileMode2, tileMode2);
                                this.o = new BitmapShader(this.k, tileMode2, tileMode2);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    this.n.setFilterMode(2);
                                    this.o.setFilterMode(2);
                                }
                                this.p = true;
                            }
                        } else {
                            f2 = 0.0f;
                            this.j = null;
                            this.n = null;
                            this.k = null;
                            this.m = null;
                            this.p = false;
                        }
                        d = d("paintChatActionBackground");
                        Paint d3 = d("paintChatActionBackgroundSelected");
                        d2 = d("paintChatMessageBackgroundSelected");
                        HashMap hashMap = this.b;
                        if (d != null) {
                            Paint paint = (Paint) hashMap.get("paintChatActionBackgroundDarken");
                            if (paint == null) {
                                paint = new Paint(1);
                                hashMap.put("paintChatActionBackgroundDarken", paint);
                                paint.setColor(0);
                            }
                            if (this.C) {
                                ColorMatrix colorMatrix = new ColorMatrix();
                                if (drawable2 instanceof ye7) {
                                    if (((ye7) drawable2).q >= f2) {
                                        colorMatrix.setSaturation(1.6f);
                                        gl.l2(colorMatrix, this.q ? 0.97f : 0.92f);
                                        gl.h(colorMatrix, this.q ? 0.12f : -0.06f);
                                    } else {
                                        colorMatrix.setSaturation(1.1f);
                                        gl.l2(colorMatrix, this.q ? 0.4f : 0.8f);
                                        gl.h(colorMatrix, this.q ? 0.08f : -0.06f);
                                    }
                                } else {
                                    colorMatrix.setSaturation(1.6f);
                                    gl.l2(colorMatrix, this.q ? 0.9f : 0.84f);
                                    gl.h(colorMatrix, this.q ? 0.04f : 0.06f);
                                }
                                d.setAlpha(kk7.d4);
                                d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                d.setShader(this.o);
                                d.setFilterBitmap(true);
                                d3.setAlpha(kk7.d4);
                                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                                gl.i(colorMatrix2, 0.26f);
                                gl.l2(colorMatrix2, 0.92f);
                                d3.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                                d3.setShader(this.o);
                                d3.setFilterBitmap(true);
                                paint.setAlpha(0);
                            } else {
                                d.setColorFilter(null);
                                d.setShader(null);
                                d3.setColorFilter(null);
                                d3.setShader(null);
                                paint.setAlpha(21);
                            }
                        }
                        if (d2 == null) {
                            d2 = new Paint(1);
                            hashMap.put("paintChatMessageBackgroundSelected", d2);
                        }
                        if (!this.D) {
                            if (k2 == 0) {
                                k2 = h(i3);
                            }
                            d2.setColor(k2);
                            d2.setColorFilter(null);
                            d2.setShader(null);
                            return;
                        }
                        ColorMatrix colorMatrix3 = new ColorMatrix();
                        gl.i(colorMatrix3, 2.5f);
                        gl.l2(colorMatrix3, 0.75f);
                        d2.setAlpha(64);
                        d2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                        d2.setShader(this.o);
                        d2.setFilterBitmap(true);
                        return;
                    }
                }
            }
            tL_starGiftUnique = null;
            if (tL_starGiftUnique != null) {
                z = true;
                this.D = z2;
                if (z2) {
                }
                d = d("paintChatActionBackground");
                Paint d32 = d("paintChatActionBackgroundSelected");
                d2 = d("paintChatMessageBackgroundSelected");
                HashMap hashMap2 = this.b;
                if (d != null) {
                }
                if (d2 == null) {
                }
                if (!this.D) {
                }
            }
        }
        z = false;
        this.D = z2;
        if (z2) {
        }
        d = d("paintChatActionBackground");
        Paint d322 = d("paintChatActionBackgroundSelected");
        d2 = d("paintChatMessageBackgroundSelected");
        HashMap hashMap22 = this.b;
        if (d != null) {
        }
        if (d2 == null) {
        }
        if (!this.D) {
        }
    }

    public final boolean p(boolean z) {
        TLRPC.User user;
        mu1 mu1Var = this.G;
        if (mu1Var.h != null) {
            return false;
        }
        if (z) {
            return (mu1Var.e != null || (user = mu1Var.f) == null || user.bot) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (android.text.TextUtils.equals(je2.h(r15), je2.h(r8)) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(jy3 jy3Var, TLRPC.WallPaper wallPaper, boolean z, Boolean bool, boolean z2) {
        ui5 ui5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        ui5 ui5Var2;
        boolean equals;
        mu1 mu1Var = this.G;
        ui5Var = ((d) mu1Var).parentLayout;
        if (ui5Var == null || mu1Var.za != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.q;
        elb elbVar = jy3Var != null ? jy3Var.c : null;
        jy3 jy3Var2 = this.f;
        elb elbVar2 = jy3Var2 != null ? jy3Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.g;
        byte b = 1;
        byte b2 = 0;
        if (!z2) {
            if (!p(false)) {
                return;
            }
            if (elb.a(elbVar2, elbVar) && this.q == booleanValue) {
                co3 co3Var = je2.s;
                if (wallPaper != null) {
                    if (wallPaper2 != null) {
                        String str = wallPaper.uploadingImage;
                        if (str != null) {
                            equals = TextUtils.equals(wallPaper2.uploadingImage, str);
                        } else if (wallPaper.id == wallPaper2.id) {
                            if (TextUtils.equals(p72.e(wallPaper.settings), p72.e(wallPaper2.settings))) {
                            }
                        }
                    }
                    equals = false;
                }
                if (equals) {
                    return;
                }
            }
        }
        this.q = booleanValue;
        akb B0 = booleanValue ? bkb.J : bkb.B0();
        ti5 ti5Var = new ti5(B0, B0.Z, B0.o(), !z);
        jy3 jy3Var3 = this.f;
        if (jy3Var3 == null && this.g == null) {
            Drawable s0 = bkb.s0();
            this.C = s0 instanceof ye7;
            o(s0);
            this.v = this.C ? -1 : bkb.w0(null, bkb.Yc, false);
            this.w = this.C ? -1 : bkb.w0(null, bkb.Zc, false);
            this.x = this.C ? -1 : bkb.w0(null, bkb.Zc, false);
            this.y = this.C ? -1 : bkb.w0(null, bkb.ad, false);
        } else {
            if (this.C) {
                Drawable drawable = this.h;
                if (drawable instanceof ye7) {
                    Bitmap bitmap = ((ye7) drawable).k;
                    this.A = bitmap;
                    if (jy3Var3 != null) {
                        TLRPC.ChatTheme chatTheme = jy3Var3.d;
                        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                            TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (tL_starGiftUnique != null && this.q) {
                                    this.A = Bitmap.createBitmap(bitmap);
                                    new Canvas(this.A).drawColor(-870178270);
                                }
                            }
                        }
                        tL_starGiftUnique = null;
                        if (tL_starGiftUnique != null) {
                            this.A = Bitmap.createBitmap(bitmap);
                            new Canvas(this.A).drawColor(-870178270);
                        }
                    }
                }
            }
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                o(drawable2);
            }
        }
        this.z = this.B;
        this.v = this.C ? -1 : k(bkb.Yc, true);
        this.w = this.C ? -1 : k(bkb.Zc, true);
        this.x = this.C ? -1 : k(bkb.Zc, true);
        this.y = this.C ? -1 : k(bkb.ad, true);
        if (jy3Var != null || wallPaper != null) {
            int i = gl.q(this.h)[0];
            m();
            n();
        }
        ti5Var.f = false;
        if (mu1Var.l6 < 0) {
            ti5Var.g = false;
        }
        ti5Var.h = new qg((Object) this, (Object) jy3Var, (Object) wallPaper, z, (byte) 7);
        if (z) {
            ti5Var.k = new hu1(this);
            ti5Var.i = new eu1(this, b2);
            ti5Var.j = new eu1(this, b);
        } else {
            if (mu1Var.m1 != null) {
                mu1Var.xc();
            }
            ti5Var.h.run();
        }
        ti5Var.e = true;
        ti5Var.m = this;
        ti5Var.l = (short) 250;
        ui5Var2 = ((d) mu1Var).parentLayout;
        ((ActionBarLayout) ui5Var2).e(ti5Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(jy3 jy3Var, TLRPC.WallPaper wallPaper, boolean z) {
        int indexOfKey;
        int i;
        int i2;
        ArrayList arrayList;
        zjb zjbVar;
        SparseIntArray R0;
        int indexOfKey2;
        akb akbVar;
        boolean z2;
        Drawable drawable;
        int i3;
        char c;
        akb O0;
        int i4;
        akb O02;
        jy3 jy3Var2 = jy3Var;
        mu1 mu1Var = this.G;
        if (mu1Var.za != null) {
            return;
        }
        this.f = jy3Var2;
        this.g = wallPaper;
        Drawable backgroundImage = mu1Var.fragmentView != null ? mu1Var.m1.getBackgroundImage() : null;
        ye7 ye7Var = backgroundImage instanceof ye7 ? (ye7) backgroundImage : null;
        int i5 = ye7Var != null ? ye7Var.i : 0;
        if ((jy3Var2 == null || jy3Var2.a) && wallPaper == null && (indexOfKey = bkb.km.indexOfKey(bkb.bd)) >= 0) {
            bkb.km.valueAt(indexOfKey);
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (jy3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable s0 = bkb.s0();
            if (s0 instanceof ye7) {
                ((ye7) s0).t(i5);
            }
            this.h = null;
            if (bkb.I.o() == this.q) {
                O02 = bkb.I;
            } else {
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (bkb.O0(string) != null && !bkb.O0(string).o()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (bkb.O0(string2) != null && bkb.O0(string2).o()) {
                    str = string2;
                }
                O02 = this.q ? bkb.O0(str) : bkb.O0(str2);
            }
            bkb.t(O02, false, this.q);
            o(this.h);
            this.s = false;
            s();
            return;
        }
        this.s = false;
        if (a.b != null) {
            bkb.J(a.b, false);
        }
        if (jy3Var2 == null) {
            this.d = new SparseIntArray();
            i2 = 0;
        } else {
            i = ((d) this.G).currentAccount;
            boolean z3 = this.q;
            ArrayList arrayList2 = jy3Var2.f;
            akb i6 = jy3Var2.i(z3 ? 1 : 0);
            if (i6 == null) {
                int i7 = ((iy3) jy3Var2.f.get(z3 ? 1 : 0)).d;
                i2 = 0;
                iy3 iy3Var = (iy3) ((fj5) jy3Var2.f.get(z3 ? 1 : 0));
                TLRPC.ThemeSettings b = iy3Var.b(i7);
                TLRPC.TL_theme tL_theme = ((iy3) jy3Var2.f.get(z3 ? 1 : 0)).b;
                akb akbVar2 = new akb(bkb.O0(bkb.q0(b)));
                arrayList = arrayList2;
                zjbVar = akbVar2.c(iy3Var.a(), b, tL_theme, i, true);
                akbVar2.u(zjbVar.a);
                i6 = akbVar2;
            } else {
                i2 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i6.b0;
                zjbVar = sparseArray != null ? (zjb) sparseArray.get(((iy3) arrayList.get(z3 ? 1 : 0)).e) : null;
            }
            String[] strArr = new String[1];
            if (i6.b != null) {
                R0 = bkb.R0(new File(i6.b), null, strArr);
            } else {
                String str3 = i6.d;
                R0 = str3 != null ? bkb.R0(null, str3, strArr) : new SparseIntArray();
            }
            ((iy3) arrayList.get(z3 ? 1 : 0)).g = strArr[i2];
            if (zjbVar != null) {
                SparseIntArray clone = R0.clone();
                zjbVar.d(R0, clone);
                elb elbVar = jy3Var2.c;
                if (elbVar != null && !TextUtils.isEmpty(elbVar.b) && (akbVar = zjbVar.b) != null && akbVar.b == null && !akbVar.o()) {
                    zjb.g(clone);
                }
                R0 = clone;
            }
            SparseIntArray sparseIntArray = bkb.hm;
            for (int i8 = i2; i8 < sparseIntArray.size(); i8++) {
                int keyAt = sparseIntArray.keyAt(i8);
                int valueAt = sparseIntArray.valueAt(i8);
                if (R0.indexOfKey(keyAt) < 0 && (indexOfKey2 = R0.indexOfKey(valueAt)) >= 0) {
                    R0.put(keyAt, R0.valueAt(indexOfKey2));
                }
            }
            int[] iArr = bkb.gm;
            for (int i9 = i2; i9 < iArr.length; i9++) {
                if (R0.indexOfKey(i9) < 0) {
                    R0.put(i9, iArr[i9]);
                }
            }
            this.d = R0;
        }
        if (!TextUtils.isEmpty(je2.h(this.g))) {
            Drawable drawable2 = this.h;
            i4 = ((d) this.G).currentAccount;
            this.h = zi8.e(drawable2, i4, this.g, this.q);
        } else if (wallPaper != null) {
            this.h = p72.d(this.h, wallPaper, this.q);
        } else {
            if (jy3Var2.a) {
                akb d = jy3.d(this.q);
                i3 = ((d) this.G).currentAccount;
                bkb.I(d, jy3Var2.g(i3, this.q ? 1 : 0), ((iy3) jy3Var2.f.get(this.q ? 1 : 0)).g, i5, i2);
                drawable = new ColorDrawable(-16777216);
            } else {
                int h = h(bkb.De);
                int h2 = h(bkb.Ee);
                int h3 = h(bkb.Fe);
                int h4 = h(bkb.Ge);
                ye7 ye7Var2 = new ye7();
                ye7Var2.r(jy3Var2.j(this.q ? 1 : 0).settings.intensity, ye7Var2.u);
                TLRPC.Document e = jy3Var2.e();
                if (ye7Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    ye7Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = ye7Var2.c;
                    if (weakReference != null) {
                        ye7Var2.y.p0((View) weakReference.get());
                    }
                    if (ye7Var2.T) {
                        ye7Var2.y.I();
                    }
                }
                ye7Var2.y.d0(gl5.b(e), "80_80", null, null, null, 0);
                ye7Var2.y.N(1);
                ye7Var2.y.M(1);
                ye7Var2.n(true, h, h2, h3, h4);
                ye7Var2.t(i5);
                int f = ye7Var2.f();
                boolean z4 = this.q;
                q31 q31Var = new q31((Object) this, (Object) ye7Var2, (byte) 18);
                iy3 iy3Var2 = (iy3) jy3Var2.f.get(z4 ? 1 : 0);
                if (iy3Var2 == null || iy3Var2.c == null) {
                    z2 = z4 ? 1 : 0;
                } else {
                    long h5 = jy3Var2.h(z4 ? 1 : 0);
                    TL_stars.StarGift starGift = iy3Var2.c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z2 = z4 ? 1 : 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i10);
                            int i11 = i10 + 1;
                            int i12 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i12;
                                i10 = i11;
                            }
                        }
                    } else {
                        z2 = z4 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    gl5 b2 = gl5.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.A1 = false;
                    imageReceiver2.d0(b2, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.h1 = new rz1((Object) q31Var, h5, (byte) 4);
                    fl5.z().I(imageReceiver2, null);
                }
                jy3Var2 = jy3Var;
                jy3Var2.n(this.q ? 1 : 0, new gu1(this, jy3Var2, z2, ye7Var2, f));
                drawable = ye7Var2;
            }
            this.h = drawable;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            this.r = new AnimatorSet();
            if (ye7Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new fu1(ye7Var, (byte) 0));
                ofFloat.addListener(new iu1(ye7Var));
                ofFloat.setDuration(200L);
                this.r.playTogether(ofFloat);
            }
            Drawable drawable3 = this.h;
            if (drawable3 instanceof ye7) {
                ye7 ye7Var3 = (ye7) drawable3;
                ye7Var3.q(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new fu1(ye7Var3, (byte) 1));
                ofFloat2.addListener(new ju1(ye7Var3));
                ofFloat2.setDuration(250L);
                this.r.playTogether(ofFloat2);
            }
            this.r.start();
        }
        if (jy3Var2 != null || this.G.l6 < 0) {
            c = 0;
        } else {
            if (bkb.I.o() == this.q) {
                O0 = bkb.I;
            } else {
                SharedPreferences sharedPreferences2 = a.b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (bkb.O0(string3) != null && !bkb.O0(string3).o()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (bkb.O0(string4) != null && bkb.O0(string4).o()) {
                    str = string4;
                }
                O0 = this.q ? bkb.O0(str) : bkb.O0(str2);
            }
            c = 0;
            bkb.t(O0, false, this.q);
        }
        int i13 = gl.q(this.h)[c];
        m();
        n();
        o(this.h);
        t(1.0f);
    }

    public final void s() {
        mu1 mu1Var = this.G;
        if (mu1Var.za == null && this.f == null && this.g == null) {
            boolean z = mu1Var.K7() && !gba.D0;
            if (z || this.s) {
                this.s = z;
                this.b.clear();
                this.a.clear();
                if (z) {
                    if (a.b != null) {
                        bkb.J(a.b, false);
                    }
                    m();
                    n();
                }
                o(bkb.s0());
                t(1.0f);
            }
        }
    }

    public final void t(float f) {
        int k;
        int k2;
        int k3;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b.isEmpty()) {
            return;
        }
        Paint d = d("paintChatActionBackground");
        Paint d2 = d("paintChatActionBackgroundSelected");
        Paint d3 = d("paintChatMessageBackgroundSelected");
        int i = this.B;
        boolean K7 = this.G.K7();
        int i2 = -1;
        if (this.C) {
            k = -1;
        } else {
            k = k(K7 ? bkb.Ea : bkb.Yc, true);
        }
        if (this.C) {
            k2 = -1;
        } else {
            k2 = k(K7 ? bkb.Ea : bkb.Zc, true);
        }
        if (this.C) {
            k3 = -1;
        } else {
            k3 = k(K7 ? bkb.Ga : bkb.Zc, true);
        }
        if (!this.C) {
            i2 = k(K7 ? bkb.Fa : bkb.ad, true);
        }
        if (f != 1.0f) {
            i = bm2.f(f, this.z, i);
            k = bm2.f(f, this.v, k);
            k2 = bm2.f(f, this.w, k2);
            k3 = bm2.f(f, this.x, k3);
            i2 = bm2.f(f, this.y, i2);
        }
        if (d != null && !this.C) {
            d.setColor(i);
            d2.setColor(i);
        }
        Paint d4 = d("paintChatActionText");
        if (d4 != null) {
            ((TextPaint) d4).linkColor = k2;
            d("paintChatActionText").setColor(k);
            d("paintChatBotButton").setColor(k3);
        }
        bkb.A1(k, getDrawable("drawableMsgStickerCheck"));
        bkb.A1(k, getDrawable("drawableMsgStickerClock"));
        bkb.A1(k, getDrawable("drawableMsgStickerHalfCheck"));
        bkb.A1(k, getDrawable("drawableMsgStickerPinned"));
        bkb.A1(k, getDrawable("drawableMsgStickerReplies"));
        bkb.A1(k, getDrawable("drawableMsgStickerViews"));
        bkb.A1(i2, getDrawable("drawableBotInline"));
        bkb.A1(i2, getDrawable("drawableBotLink"));
        bkb.A1(i2, getDrawable("drawableBotLock"));
        bkb.A1(i2, getDrawable("drawable_botInvite"));
        bkb.A1(i2, getDrawable("drawableCommentSticker"));
        bkb.A1(i2, getDrawable("drawableGoIcon"));
        bkb.A1(i2, getDrawable("drawableReplyIcon"));
        bkb.A1(i2, getDrawable("drawableShareIcon"));
        if (this.m == null || (bitmap = this.k) == null) {
            return;
        }
        Rect rect = this.F;
        Rect rect2 = this.E;
        if (f == 1.0f || (bitmap2 = this.A) == null) {
            this.p = true;
            rect2.set(0, 0, bitmap.getWidth(), this.k.getHeight());
            rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
            this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
            if (d != null) {
                d.setShader(this.o);
                d2.setShader(this.o);
            }
            if (d3 != null) {
                d3.setShader(this.o);
                return;
            }
            return;
        }
        this.p = false;
        rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
        rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
        this.m.drawBitmap(this.A, rect2, rect, (Paint) null);
        Paint paint = this.l;
        paint.setAlpha((int) (f * 255.0f));
        rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
        rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
        this.m.drawBitmap(this.k, rect2, rect, paint);
        if (d != null) {
            d.setShader(this.n);
            d2.setShader(this.n);
        }
        if (d3 != null) {
            d3.setShader(this.n);
        }
    }
}
