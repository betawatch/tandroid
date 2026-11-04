package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class g5 extends Drawable {
    public static SparseArray r;
    public static HashMap s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static final org.telegram.messenger.hc w = new org.telegram.messenger.hc(21);
    public static HashMap x;
    public boolean a;
    public ArrayList b;
    public ArrayList c;
    public int d;
    public TLRPC.Document e;
    public long f;
    public int g;
    public int h;
    public String i;
    public boolean j;
    public ei.c3 k;
    public boolean m;
    public ColorFilter p;
    public ColorFilter q;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public g5(int i3, int i10, long j10) {
        this.h = i10;
        this.g = i3;
        x();
        this.f = j10;
        g(i10).b(j10, new y4(this, 0));
    }

    public static TLRPC.Document e(int i3, long j10) {
        HashMap hashMap = g(i3).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j10));
    }

    public static int f() {
        return org.telegram.messenger.az.o() == 0 ? 0 : 2;
    }

    public static c5 g(int i3) {
        if (s == null) {
            s = new HashMap();
        }
        c5 c5Var = (c5) s.get(Integer.valueOf(i3));
        if (c5Var != null) {
            return c5Var;
        }
        HashMap hashMap = s;
        Integer valueOf = Integer.valueOf(i3);
        c5 c5Var2 = new c5(i3);
        hashMap.put(valueOf, c5Var2);
        return c5Var2;
    }

    public static g5 l(int i3, int i10, TLRPC.Document document) {
        if (r == null) {
            r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i3), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        g5 g5Var = (g5) longSparseArray.get(document.id);
        if (g5Var != null) {
            return g5Var;
        }
        long j10 = document.id;
        g5 g5Var2 = new g5(i10, i3, document);
        longSparseArray.put(j10, g5Var2);
        return g5Var2;
    }

    public static g5 m(int i3, long j10, String str, int i10) {
        if (r == null) {
            r = new SparseArray();
        }
        int i11 = 1;
        int hash = Objects.hash(Integer.valueOf(i3), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        g5 g5Var = (g5) longSparseArray.get(j10);
        if (g5Var != null) {
            return g5Var;
        }
        g5 g5Var2 = new g5();
        g5Var2.l = 1.0f;
        g5Var2.n = null;
        g5Var2.o = null;
        g5Var2.h = i3;
        g5Var2.g = i10;
        g5Var2.x();
        g5Var2.f = j10;
        g5Var2.i = str;
        g(i3).b(j10, new y4(g5Var2, i11));
        longSparseArray.put(j10, g5Var2);
        return g5Var2;
    }

    public static void r(int i3, boolean z10) {
        LongSparseArray longSparseArray;
        ei.c3 c3Var;
        boolean z11 = !z10;
        if (v == z11) {
            return;
        }
        v = z11;
        if (r == null || (longSparseArray = (LongSparseArray) r.get(Objects.hash(Integer.valueOf(i3), 25))) == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            g5 g5Var = (g5) longSparseArray.valueAt(i10);
            if (g5Var != null && (c3Var = g5Var.k) != null) {
                if (z10) {
                    c3Var.v0 = true;
                    c3Var.u0 = true;
                    c3Var.W(1);
                    t5 m10 = c3Var.m();
                    if (m10 != null) {
                        boolean z12 = c3Var.w0;
                        if (!m10.o0) {
                            m10.w0 = z12;
                        }
                        m10.start();
                    } else {
                        ch0 B = c3Var.B();
                        if (B != null) {
                            B.start();
                        }
                    }
                } else {
                    c3Var.u0 = false;
                    c3Var.v0 = false;
                    c3Var.W(0);
                    c3Var.Q0();
                }
            }
        }
    }

    public static void t() {
        if (r == null) {
            return;
        }
        w();
        for (int i3 = 0; i3 < r.size(); i3++) {
            LongSparseArray longSparseArray = (LongSparseArray) r.valueAt(i3);
            for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                long keyAt = longSparseArray.keyAt(i10);
                g5 g5Var = (g5) longSparseArray.get(keyAt);
                if (g5Var == null || !g5Var.a) {
                    longSparseArray.remove(keyAt);
                } else {
                    g5Var.i(true);
                }
            }
        }
    }

    public static void w() {
        t = org.telegram.messenger.lc.e(16388);
        u = org.telegram.messenger.lc.e(8200);
    }

    public final void a(View view) {
        if (view instanceof org.telegram.ui.j01) {
            throw new RuntimeException();
        }
        this.m = false;
        if (this.b == null) {
            this.b = new ArrayList(10);
        }
        if (!this.b.contains(view)) {
            this.b.add(view);
        }
        u();
    }

    public final void b(m5 m5Var) {
        if (this.c == null) {
            this.c = new ArrayList(10);
        }
        this.m = false;
        if (!this.c.contains(m5Var)) {
            this.c.add(m5Var);
        }
        u();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.g == 19) {
            return true;
        }
        Boolean bool = this.n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!k() && !org.telegram.messenger.zi.D4(this.e)) {
            z10 = false;
        }
        this.n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.m = false;
        u();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ei.c3 c3Var = this.k;
        if (c3Var == null) {
            return;
        }
        c3Var.z0(getBounds());
        this.k.setAlpha(this.l);
        this.k.h(canvas, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return (int) (this.l * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final long h() {
        TLRPC.Document document = this.e;
        return document != null ? document.id : this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x03ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z10) {
        org.telegram.messenger.jz d;
        String str;
        org.telegram.messenger.ac acVar;
        org.telegram.messenger.ac b10;
        org.telegram.messenger.db dbVar;
        org.telegram.messenger.ac acVar2;
        Drawable g7;
        Drawable drawable;
        ei.c3 c3Var;
        int i3;
        String str2 = this.i;
        int i10 = this.g;
        TLRPC.Document document = this.e;
        if (document != null) {
            ei.c3 c3Var2 = this.k;
            if (c3Var2 == null || this.j || z10) {
                if ((i10 == 20 || i10 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                this.j = false;
                if (c3Var2 == null) {
                    ei.c3 c3Var3 = new ei.c3(this, 4);
                    this.k = c3Var3;
                    c3Var3.d = this.h;
                    c3Var3.A1 = true;
                    if (i10 == 12) {
                        c3Var3.y = true;
                    }
                }
                if (this.p != null && c()) {
                    this.k.p1 = this.p;
                }
                if (i10 != 0) {
                    this.k.w1 = com.google.android.recaptcha.internal.a.h(i10 == 12 ? 2 : i10, "_");
                }
                this.k.z1 = true;
                boolean z11 = (org.telegram.messenger.az.o() == 0 && i10 == 5) || ((i10 == 2 || i10 == 25) && !t) || (i10 == 3 && !u);
                if (i10 == 13 || i10 == 16) {
                    z11 = true;
                }
                if (i10 == 24 || i10 == 27) {
                    z11 = false;
                }
                String str3 = this.d + "_" + this.d;
                if (i10 == 12) {
                    str3 = t4.c.q(str3, "_d_nostream");
                }
                if (i10 != 17 && i10 != 15 && i10 != 14 && i10 != 8 && ((i10 != 1 || org.telegram.messenger.az.o() < 2) && i10 != 12)) {
                    str3 = t4.c.q(str3, "_pcache");
                }
                if (i10 != 17 && i10 != 0 && i10 != 26 && i10 != 1 && i10 != 14 && i10 != 15 && i10 != 19 && i10 != 20 && i10 != 21) {
                    str3 = t4.c.q(str3, "_compress");
                }
                if (i10 == 8) {
                    str3 = t4.c.q(str3, "firstframe");
                }
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.e.thumbs, 90, false, null, false);
                if ("video/webm".equals(this.e.mime_type)) {
                    b10 = org.telegram.messenger.ac.b(this.e);
                    str3 = t4.c.q(str3, "_g");
                    d = org.telegram.messenger.t5.d(this.e.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, true);
                } else {
                    if (!"application/x-tgsticker".equals(this.e.mime_type)) {
                        d = org.telegram.messenger.t5.d(this.e.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, true);
                        if (d != null && org.telegram.messenger.zi.L2(this.e, true)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = str3;
                        acVar = null;
                        if (i10 != 20 || i10 == 21) {
                            acVar2 = null;
                            g7 = org.telegram.messenger.i6.g(org.telegram.messenger.zi.V(this.e, null, null));
                            if (g7 != null) {
                                drawable = g7;
                                if (str2 != null) {
                                    this.k.w0(new t5(new File(str2), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                                } else if (i10 == 8) {
                                    ei.c3 c3Var4 = this.k;
                                    TLRPC.Document document2 = this.e;
                                    c3Var4.u0(null, null, acVar, str, null, null, drawable, document2.size, null, document2, 1);
                                } else {
                                    String str4 = str;
                                    if (z11 || !(t || i10 == 14)) {
                                        org.telegram.messenger.ac c2 = i10 == 16 ? org.telegram.messenger.ac.c(w10, this.e) : acVar2;
                                        if ("video/webm".equals(this.e.mime_type)) {
                                            ei.c3 c3Var5 = this.k;
                                            org.telegram.messenger.ac c10 = org.telegram.messenger.ac.c(w10, this.e);
                                            String str5 = this.d + "_" + this.d;
                                            TLRPC.Document document3 = this.e;
                                            c3Var5.u0(null, null, c10, str5, c2, null, drawable, document3.size, null, document3, 1);
                                        } else if (org.telegram.messenger.zi.L2(this.e, true)) {
                                            ei.c3 c3Var6 = this.k;
                                            String q10 = t4.c.q(str4, "_firstframe");
                                            TLRPC.Document document4 = this.e;
                                            c3Var6.r0(acVar, q10, c2, null, drawable, document4.size, null, document4, 1);
                                        } else {
                                            ei.c3 c3Var7 = this.k;
                                            org.telegram.messenger.ac c11 = org.telegram.messenger.ac.c(w10, this.e);
                                            String str6 = this.d + "_" + this.d;
                                            TLRPC.Document document5 = this.e;
                                            c3Var7.r0(c11, str6, c2, null, drawable, document5.size, null, document5, 1);
                                        }
                                    } else {
                                        org.telegram.messenger.ac c12 = i10 == 17 ? org.telegram.messenger.ac.c(w10, this.e) : acVar2;
                                        ei.c3 c3Var8 = this.k;
                                        org.telegram.messenger.ac c13 = org.telegram.messenger.ac.c(w10, this.e);
                                        String str7 = this.d + "_" + this.d;
                                        TLRPC.Document document6 = this.e;
                                        c3Var8.u0(acVar, str4, c13, str7, c12, null, drawable, document6.size, null, document6, 1);
                                    }
                                }
                                v(this.k);
                                if (i10 != 13 || i10 == 16 || i10 == 3 || i10 == 5 || i10 == 4 || i10 == 24) {
                                    this.k.E0(7);
                                }
                                if (i10 != 9 || i10 == 21 || i10 == 27) {
                                    this.k.E0(6656);
                                }
                                c3Var = this.k;
                                c3Var.S0 = true;
                                if (i10 != 12 || i10 == 26 || i10 == 18 || i10 == 8 || i10 == 6 || i10 == 5 || (i10 == 25 && v)) {
                                    i3 = 0;
                                    c3Var.u0 = false;
                                    c3Var.v0 = false;
                                    c3Var.W(0);
                                } else {
                                    c3Var.v0 = true;
                                    c3Var.u0 = true;
                                    c3Var.W(1);
                                    i3 = 0;
                                }
                                this.k.x0 = true;
                                this.k.J0((i10 != 5 || i10 == 6 || i10 == 27) ? org.telegram.messenger.g0.L(6.0f) : i10 == 24 ? org.telegram.messenger.g0.L(14.0f) : i3);
                                u();
                                j();
                            }
                        } else {
                            acVar2 = null;
                        }
                        drawable = d;
                        if (str2 != null) {
                        }
                        v(this.k);
                        if (i10 != 13) {
                        }
                        this.k.E0(7);
                        if (i10 != 9) {
                        }
                        this.k.E0(6656);
                        c3Var = this.k;
                        c3Var.S0 = true;
                        if (i10 != 12) {
                        }
                        i3 = 0;
                        c3Var.u0 = false;
                        c3Var.v0 = false;
                        c3Var.W(0);
                        this.k.x0 = true;
                        this.k.J0((i10 != 5 || i10 == 6 || i10 == 27) ? org.telegram.messenger.g0.L(6.0f) : i10 == 24 ? org.telegram.messenger.g0.L(14.0f) : i3);
                        u();
                        j();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10 != 0 ? com.google.android.recaptcha.internal.a.h(i10, "_") : "");
                    sb2.append(this.f);
                    sb2.append("@");
                    sb2.append(str3);
                    String sb3 = sb2.toString();
                    if (org.telegram.messenger.az.o() != 0 || i10 == 2 || i10 == 25 || i10 == 22 || (dbVar = org.telegram.messenger.zb.D().e) == null || !((LinkedHashMap) dbVar.c).containsKey(sb3)) {
                        org.telegram.messenger.jz d10 = org.telegram.messenger.t5.d(this.e.thumbs, org.telegram.ui.ActionBar.k6.m6, i10 == 22 ? 0.8f : 0.2f, false);
                        if (d10 != null && org.telegram.messenger.zi.L2(this.e, true)) {
                            d10.e = 512;
                            d10.f = 512;
                        }
                        d = d10;
                    } else {
                        d = null;
                    }
                    b10 = org.telegram.messenger.ac.b(this.e);
                }
                acVar = b10;
                str = str3;
                if (i10 != 20) {
                }
                acVar2 = null;
                g7 = org.telegram.messenger.i6.g(org.telegram.messenger.zi.V(this.e, null, null));
                if (g7 != null) {
                }
                drawable = d;
                if (str2 != null) {
                }
                v(this.k);
                if (i10 != 13) {
                }
                this.k.E0(7);
                if (i10 != 9) {
                }
                this.k.E0(6656);
                c3Var = this.k;
                c3Var.S0 = true;
                if (i10 != 12) {
                }
                i3 = 0;
                c3Var.u0 = false;
                c3Var.v0 = false;
                c3Var.W(0);
                this.k.x0 = true;
                this.k.J0((i10 != 5 || i10 == 6 || i10 == 27) ? org.telegram.messenger.g0.L(6.0f) : i10 == 24 ? org.telegram.messenger.g0.L(14.0f) : i3);
                u();
                j();
            }
        }
    }

    public final void j() {
        if (this.b != null) {
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                View view = (View) this.b.get(i3);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.c != null) {
            for (int i10 = 0; i10 < this.c.size(); i10++) {
                m5 m5Var = (m5) this.c.get(i10);
                if (m5Var != null) {
                    m5Var.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r2 != 2964141614563343L) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k() {
        Boolean bool = this.o;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Document document = this.e;
        boolean z10 = false;
        if (document != null) {
            TLRPC.InputStickerSet j12 = org.telegram.messenger.zi.j1(document);
            if (!(j12 instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses)) {
                if (j12 instanceof TLRPC.TL_inputStickerSetID) {
                    long j10 = j12.id;
                    if (j10 != 773947703670341676L) {
                    }
                }
                this.o = Boolean.valueOf(z10);
            }
            z10 = true;
            this.o = Boolean.valueOf(z10);
        }
        return z10;
    }

    public final void n(View view) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.m = false;
        u();
    }

    public final void o(m5 m5Var) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(m5Var);
        }
        this.m = false;
        u();
    }

    public final void p(long j10) {
        ei.c3 c3Var = this.k;
        if (c3Var != null) {
            if (this.g == 8) {
                j10 = 0;
            }
            c3Var.s = j10;
        }
    }

    public final void q(String str) {
        ei.c3 c3Var;
        int i3 = this.g;
        if ((i3 == 20 || i3 == 21) && !TextUtils.isEmpty(str) && (c3Var = this.k) == null) {
            if (c3Var == null) {
                ei.c3 c3Var2 = new ei.c3(this, 4);
                this.k = c3Var2;
                c3Var2.d = this.h;
                c3Var2.A1 = true;
                if (i3 == 12) {
                    c3Var2.y = true;
                }
            }
            this.j = true;
            this.k.w0(org.telegram.messenger.i6.g(str));
            this.k.B0 = true;
        }
    }

    public final void s(long j10) {
        ei.c3 c3Var = this.k;
        if (c3Var != null) {
            if (this.g == 8) {
                j10 = 0;
            }
            if (c3Var.B() != null) {
                this.k.B().V(j10);
            }
            if (this.k.m() != null) {
                this.k.m().D(j10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        float f10 = i3 / 255.0f;
        this.l = f10;
        ei.c3 c3Var = this.k;
        if (c3Var != null) {
            c3Var.setAlpha(f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.q = colorFilter;
        if (this.k == null || this.e == null) {
            this.p = colorFilter;
        } else if (c()) {
            this.k.p1 = colorFilter;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.e;
        return a1.g.s(sb2, document == null ? "null" : org.telegram.messenger.zi.V(document, null, null), "}");
    }

    public final void u() {
        ArrayList arrayList;
        if (this.k == null) {
            return;
        }
        ArrayList arrayList2 = this.b;
        boolean z10 = (arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.c) != null && arrayList.size() > 0) || this.m;
        if (z10 != this.a) {
            this.a = z10;
            if (z10) {
                this.k.P();
            } else {
                this.k.R();
            }
            if (this.a) {
                return;
            }
            org.telegram.messenger.hc hcVar = w;
            org.telegram.messenger.g0.r(hcVar);
            org.telegram.messenger.g0.i3(hcVar, 5000L);
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i3 = this.g;
        if (i3 == 7 || i3 == 9 || i3 == 10) {
            imageReceiver.X(2);
            return;
        }
        if (i3 == 11 || i3 == 18 || i3 == 14 || i3 == 6 || i3 == 5 || i3 == 22) {
            imageReceiver.X(1);
        } else if (i3 == 17) {
            imageReceiver.X(0);
        }
    }

    public final void x() {
        int i3 = this.g;
        if (i3 == 0 || i3 == 26) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.o2.descent()) + Math.abs(org.telegram.ui.ActionBar.k6.o2.ascent())) * 1.15f) / org.telegram.messenger.g0.p);
            return;
        }
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.y2;
        if (textPaintArr != null && (i3 == 1 || i3 == 4 || i3 == 19 || i3 == 20)) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.g0.p);
            return;
        }
        if (textPaintArr != null && i3 == 8) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.g0.p);
            return;
        }
        if (i3 == 14 || i3 == 15 || i3 == 17) {
            this.d = 100;
            return;
        }
        if (i3 == 11 || i3 == 22) {
            this.d = 56;
            return;
        }
        if (i3 == 27) {
            this.d = 50;
            return;
        }
        if (i3 == 24) {
            this.d = org.telegram.messenger.hs.W1;
            return;
        }
        if (i3 == 23) {
            this.d = 14;
        } else if (i3 == 21) {
            this.d = 90;
        } else {
            this.d = 34;
        }
    }

    public g5(int i3, int i10, TLRPC.Document document) {
        this.g = i3;
        this.h = i10;
        this.e = document;
        x();
        w();
        i(false);
    }
}
