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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class f5 extends Drawable {
    public static SparseArray r;
    public static HashMap s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static final org.telegram.messenger.rz w = new org.telegram.messenger.rz(8);
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
    public ag.c2 k;
    public boolean m;
    public ColorFilter p;
    public ColorFilter q;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public f5(int i10, int i11, long j10) {
        this.h = i11;
        this.g = i10;
        x();
        this.f = j10;
        g(i11).b(j10, new x4(this, 0));
    }

    public static TLRPC.Document e(int i10, long j10) {
        HashMap hashMap = g(i10).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j10));
    }

    public static int f() {
        return org.telegram.messenger.tz.o() == 0 ? 0 : 2;
    }

    public static b5 g(int i10) {
        if (s == null) {
            s = new HashMap();
        }
        b5 b5Var = (b5) s.get(Integer.valueOf(i10));
        if (b5Var != null) {
            return b5Var;
        }
        HashMap hashMap = s;
        Integer valueOf = Integer.valueOf(i10);
        b5 b5Var2 = new b5(i10);
        hashMap.put(valueOf, b5Var2);
        return b5Var2;
    }

    public static f5 l(int i10, int i11, TLRPC.Document document) {
        if (r == null) {
            r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        f5 f5Var = (f5) longSparseArray.get(document.id);
        if (f5Var != null) {
            return f5Var;
        }
        long j10 = document.id;
        f5 f5Var2 = new f5(i11, i10, document);
        longSparseArray.put(j10, f5Var2);
        return f5Var2;
    }

    public static f5 m(int i10, long j10, String str, int i11) {
        if (r == null) {
            r = new SparseArray();
        }
        int i12 = 1;
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        f5 f5Var = (f5) longSparseArray.get(j10);
        if (f5Var != null) {
            return f5Var;
        }
        f5 f5Var2 = new f5();
        f5Var2.l = 1.0f;
        f5Var2.n = null;
        f5Var2.o = null;
        f5Var2.h = i10;
        f5Var2.g = i11;
        f5Var2.x();
        f5Var2.f = j10;
        f5Var2.i = str;
        g(i10).b(j10, new x4(f5Var2, i12));
        longSparseArray.put(j10, f5Var2);
        return f5Var2;
    }

    public static void r(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        ag.c2 c2Var;
        boolean z11 = !z10;
        if (v == z11) {
            return;
        }
        v = z11;
        if (r == null || (longSparseArray = (LongSparseArray) r.get(Objects.hash(Integer.valueOf(i10), 25))) == null) {
            return;
        }
        for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
            f5 f5Var = (f5) longSparseArray.valueAt(i11);
            if (f5Var != null && (c2Var = f5Var.k) != null) {
                if (z10) {
                    c2Var.u0 = true;
                    c2Var.t0 = true;
                    c2Var.W(1);
                    s5 m10 = c2Var.m();
                    if (m10 != null) {
                        boolean z12 = c2Var.v0;
                        if (!m10.n0) {
                            m10.v0 = z12;
                        }
                        m10.start();
                    } else {
                        bi0 B = c2Var.B();
                        if (B != null) {
                            B.start();
                        }
                    }
                } else {
                    c2Var.t0 = false;
                    c2Var.u0 = false;
                    c2Var.W(0);
                    c2Var.Q0();
                }
            }
        }
    }

    public static void t() {
        if (r == null) {
            return;
        }
        w();
        for (int i10 = 0; i10 < r.size(); i10++) {
            LongSparseArray longSparseArray = (LongSparseArray) r.valueAt(i10);
            for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                long keyAt = longSparseArray.keyAt(i11);
                f5 f5Var = (f5) longSparseArray.get(keyAt);
                if (f5Var == null || !f5Var.a) {
                    longSparseArray.remove(keyAt);
                } else {
                    f5Var.i(true);
                }
            }
        }
    }

    public static void w() {
        t = org.telegram.messenger.sc.e(16388);
        u = org.telegram.messenger.sc.e(8200);
    }

    public final void a(View view) {
        if (view instanceof org.telegram.ui.l21) {
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

    public final void b(l5 l5Var) {
        if (this.c == null) {
            this.c = new ArrayList(10);
        }
        this.m = false;
        if (!this.c.contains(l5Var)) {
            this.c.add(l5Var);
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
        if (!k() && !org.telegram.messenger.jj.C4(this.e)) {
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
        ag.c2 c2Var = this.k;
        if (c2Var == null) {
            return;
        }
        c2Var.z0(getBounds());
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
        return org.telegram.messenger.i0.L(this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(this.d);
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
        org.telegram.messenger.c00 d;
        String str;
        org.telegram.messenger.ic icVar;
        org.telegram.messenger.ic b10;
        org.telegram.messenger.kb kbVar;
        org.telegram.messenger.ic icVar2;
        Drawable g10;
        Drawable drawable;
        ag.c2 c2Var;
        int i10;
        String str2 = this.i;
        int i11 = this.g;
        TLRPC.Document document = this.e;
        if (document != null) {
            ag.c2 c2Var2 = this.k;
            if (c2Var2 == null || this.j || z10) {
                if ((i11 == 20 || i11 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                this.j = false;
                if (c2Var2 == null) {
                    ag.c2 c2Var3 = new ag.c2(this, 3);
                    this.k = c2Var3;
                    c2Var3.d = this.h;
                    c2Var3.z1 = true;
                    if (i11 == 12) {
                        c2Var3.y = true;
                    }
                }
                if (this.p != null && c()) {
                    this.k.o1 = this.p;
                }
                if (i11 != 0) {
                    this.k.v1 = a1.g.k(i11 == 12 ? 2 : i11, "_");
                }
                this.k.y1 = true;
                boolean z11 = (org.telegram.messenger.tz.o() == 0 && i11 == 5) || ((i11 == 2 || i11 == 25) && !t) || (i11 == 3 && !u);
                if (i11 == 13 || i11 == 16) {
                    z11 = true;
                }
                if (i11 == 24 || i11 == 27) {
                    z11 = false;
                }
                String str3 = this.d + "_" + this.d;
                if (i11 == 12) {
                    str3 = sc.e.A(str3, "_d_nostream");
                }
                if (i11 != 17 && i11 != 15 && i11 != 14 && i11 != 8 && ((i11 != 1 || org.telegram.messenger.tz.o() < 2) && i11 != 12)) {
                    str3 = sc.e.A(str3, "_pcache");
                }
                if (i11 != 17 && i11 != 0 && i11 != 26 && i11 != 1 && i11 != 14 && i11 != 15 && i11 != 19 && i11 != 20 && i11 != 21) {
                    str3 = sc.e.A(str3, "_compress");
                }
                if (i11 == 8) {
                    str3 = sc.e.A(str3, "firstframe");
                }
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(this.e.thumbs, 90, false, null, false);
                if ("video/webm".equals(this.e.mime_type)) {
                    b10 = org.telegram.messenger.ic.b(this.e);
                    str3 = sc.e.A(str3, "_g");
                    d = org.telegram.messenger.v5.d(this.e.thumbs, org.telegram.ui.ActionBar.t6.m6, 0.2f, true);
                } else {
                    if (!"application/x-tgsticker".equals(this.e.mime_type)) {
                        d = org.telegram.messenger.v5.d(this.e.thumbs, org.telegram.ui.ActionBar.t6.m6, 0.2f, true);
                        if (d != null && org.telegram.messenger.jj.K2(this.e, true)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = str3;
                        icVar = null;
                        if (i11 != 20 || i11 == 21) {
                            icVar2 = null;
                            g10 = org.telegram.messenger.k6.g(org.telegram.messenger.jj.V(this.e, null, null));
                            if (g10 != null) {
                                drawable = g10;
                                if (str2 != null) {
                                    this.k.w0(new s5(new File(str2), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                                } else if (i11 == 8) {
                                    ag.c2 c2Var4 = this.k;
                                    TLRPC.Document document2 = this.e;
                                    c2Var4.u0(null, null, icVar, str, null, null, drawable, document2.size, null, document2, 1);
                                } else {
                                    String str4 = str;
                                    if (z11 || !(t || i11 == 14)) {
                                        org.telegram.messenger.ic c10 = i11 == 16 ? org.telegram.messenger.ic.c(w9, this.e) : icVar2;
                                        if ("video/webm".equals(this.e.mime_type)) {
                                            ag.c2 c2Var5 = this.k;
                                            org.telegram.messenger.ic c11 = org.telegram.messenger.ic.c(w9, this.e);
                                            String str5 = this.d + "_" + this.d;
                                            TLRPC.Document document3 = this.e;
                                            c2Var5.u0(null, null, c11, str5, c10, null, drawable, document3.size, null, document3, 1);
                                        } else if (org.telegram.messenger.jj.K2(this.e, true)) {
                                            ag.c2 c2Var6 = this.k;
                                            String A = sc.e.A(str4, "_firstframe");
                                            TLRPC.Document document4 = this.e;
                                            c2Var6.r0(icVar, A, c10, null, drawable, document4.size, null, document4, 1);
                                        } else {
                                            ag.c2 c2Var7 = this.k;
                                            org.telegram.messenger.ic c12 = org.telegram.messenger.ic.c(w9, this.e);
                                            String str6 = this.d + "_" + this.d;
                                            TLRPC.Document document5 = this.e;
                                            c2Var7.r0(c12, str6, c10, null, drawable, document5.size, null, document5, 1);
                                        }
                                    } else {
                                        org.telegram.messenger.ic c13 = i11 == 17 ? org.telegram.messenger.ic.c(w9, this.e) : icVar2;
                                        ag.c2 c2Var8 = this.k;
                                        org.telegram.messenger.ic c14 = org.telegram.messenger.ic.c(w9, this.e);
                                        String str7 = this.d + "_" + this.d;
                                        TLRPC.Document document6 = this.e;
                                        c2Var8.u0(icVar, str4, c14, str7, c13, null, drawable, document6.size, null, document6, 1);
                                    }
                                }
                                v(this.k);
                                if (i11 != 13 || i11 == 16 || i11 == 3 || i11 == 5 || i11 == 4 || i11 == 24) {
                                    this.k.E0(7);
                                }
                                if (i11 != 9 || i11 == 21 || i11 == 27) {
                                    this.k.E0(6656);
                                }
                                c2Var = this.k;
                                c2Var.R0 = true;
                                if (i11 != 12 || i11 == 26 || i11 == 18 || i11 == 8 || i11 == 6 || i11 == 5 || (i11 == 25 && v)) {
                                    i10 = 0;
                                    c2Var.t0 = false;
                                    c2Var.u0 = false;
                                    c2Var.W(0);
                                } else {
                                    c2Var.u0 = true;
                                    c2Var.t0 = true;
                                    c2Var.W(1);
                                    i10 = 0;
                                }
                                this.k.w0 = true;
                                this.k.J0((i11 != 5 || i11 == 6 || i11 == 27) ? org.telegram.messenger.i0.L(6.0f) : i11 == 24 ? org.telegram.messenger.i0.L(14.0f) : i10);
                                u();
                                j();
                            }
                        } else {
                            icVar2 = null;
                        }
                        drawable = d;
                        if (str2 != null) {
                        }
                        v(this.k);
                        if (i11 != 13) {
                        }
                        this.k.E0(7);
                        if (i11 != 9) {
                        }
                        this.k.E0(6656);
                        c2Var = this.k;
                        c2Var.R0 = true;
                        if (i11 != 12) {
                        }
                        i10 = 0;
                        c2Var.t0 = false;
                        c2Var.u0 = false;
                        c2Var.W(0);
                        this.k.w0 = true;
                        this.k.J0((i11 != 5 || i11 == 6 || i11 == 27) ? org.telegram.messenger.i0.L(6.0f) : i11 == 24 ? org.telegram.messenger.i0.L(14.0f) : i10);
                        u();
                        j();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11 != 0 ? a1.g.k(i11, "_") : "");
                    sb2.append(this.f);
                    sb2.append("@");
                    sb2.append(str3);
                    String sb3 = sb2.toString();
                    if (org.telegram.messenger.tz.o() != 0 || i11 == 2 || i11 == 25 || i11 == 22 || (kbVar = org.telegram.messenger.hc.D().e) == null || !((LinkedHashMap) kbVar.c).containsKey(sb3)) {
                        org.telegram.messenger.c00 d10 = org.telegram.messenger.v5.d(this.e.thumbs, org.telegram.ui.ActionBar.t6.m6, i11 == 22 ? 0.8f : 0.2f, false);
                        if (d10 != null && org.telegram.messenger.jj.K2(this.e, true)) {
                            d10.e = 512;
                            d10.f = 512;
                        }
                        d = d10;
                    } else {
                        d = null;
                    }
                    b10 = org.telegram.messenger.ic.b(this.e);
                }
                icVar = b10;
                str = str3;
                if (i11 != 20) {
                }
                icVar2 = null;
                g10 = org.telegram.messenger.k6.g(org.telegram.messenger.jj.V(this.e, null, null));
                if (g10 != null) {
                }
                drawable = d;
                if (str2 != null) {
                }
                v(this.k);
                if (i11 != 13) {
                }
                this.k.E0(7);
                if (i11 != 9) {
                }
                this.k.E0(6656);
                c2Var = this.k;
                c2Var.R0 = true;
                if (i11 != 12) {
                }
                i10 = 0;
                c2Var.t0 = false;
                c2Var.u0 = false;
                c2Var.W(0);
                this.k.w0 = true;
                this.k.J0((i11 != 5 || i11 == 6 || i11 == 27) ? org.telegram.messenger.i0.L(6.0f) : i11 == 24 ? org.telegram.messenger.i0.L(14.0f) : i10);
                u();
                j();
            }
        }
    }

    public final void j() {
        if (this.b != null) {
            for (int i10 = 0; i10 < this.b.size(); i10++) {
                View view = (View) this.b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.c != null) {
            for (int i11 = 0; i11 < this.c.size(); i11++) {
                l5 l5Var = (l5) this.c.get(i11);
                if (l5Var != null) {
                    l5Var.invalidate();
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
            TLRPC.InputStickerSet j12 = org.telegram.messenger.jj.j1(document);
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

    public final void o(l5 l5Var) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(l5Var);
        }
        this.m = false;
        u();
    }

    public final void p(long j10) {
        ag.c2 c2Var = this.k;
        if (c2Var != null) {
            if (this.g == 8) {
                j10 = 0;
            }
            c2Var.s = j10;
        }
    }

    public final void q(String str) {
        ag.c2 c2Var;
        int i10 = this.g;
        if ((i10 == 20 || i10 == 21) && !TextUtils.isEmpty(str) && (c2Var = this.k) == null) {
            if (c2Var == null) {
                ag.c2 c2Var2 = new ag.c2(this, 3);
                this.k = c2Var2;
                c2Var2.d = this.h;
                c2Var2.z1 = true;
                if (i10 == 12) {
                    c2Var2.y = true;
                }
            }
            this.j = true;
            this.k.w0(org.telegram.messenger.k6.g(str));
            this.k.A0 = true;
        }
    }

    public final void s(long j10) {
        ag.c2 c2Var = this.k;
        if (c2Var != null) {
            if (this.g == 8) {
                j10 = 0;
            }
            if (c2Var.B() != null) {
                this.k.B().V(j10);
            }
            if (this.k.m() != null) {
                this.k.m().D(j10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.l = f7;
        ag.c2 c2Var = this.k;
        if (c2Var != null) {
            c2Var.setAlpha(f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.q = colorFilter;
        if (this.k == null || this.e == null) {
            this.p = colorFilter;
        } else if (c()) {
            this.k.o1 = colorFilter;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.e;
        return a1.g.r(sb2, document == null ? "null" : org.telegram.messenger.jj.V(document, null, null), "}");
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
            org.telegram.messenger.rz rzVar = w;
            org.telegram.messenger.i0.r(rzVar);
            org.telegram.messenger.i0.h3(rzVar, 5000L);
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i10 = this.g;
        if (i10 == 7 || i10 == 9 || i10 == 10) {
            imageReceiver.X(2);
            return;
        }
        if (i10 == 11 || i10 == 18 || i10 == 14 || i10 == 6 || i10 == 5 || i10 == 22) {
            imageReceiver.X(1);
        } else if (i10 == 17) {
            imageReceiver.X(0);
        }
    }

    public final void x() {
        int i10 = this.g;
        if (i10 == 0 || i10 == 26) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.t6.o2.descent()) + Math.abs(org.telegram.ui.ActionBar.t6.o2.ascent())) * 1.15f) / org.telegram.messenger.i0.p);
            return;
        }
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.t6.y2;
        if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.t6.y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.i0.p);
            return;
        }
        if (textPaintArr != null && i10 == 8) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.t6.y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.i0.p);
            return;
        }
        if (i10 == 14 || i10 == 15 || i10 == 17) {
            this.d = 100;
            return;
        }
        if (i10 == 11 || i10 == 22) {
            this.d = 56;
            return;
        }
        if (i10 == 27) {
            this.d = 50;
            return;
        }
        if (i10 == 24) {
            this.d = org.telegram.messenger.zs.W1;
            return;
        }
        if (i10 == 23) {
            this.d = 14;
        } else if (i10 == 21) {
            this.d = 90;
        } else {
            this.d = 34;
        }
    }

    public f5(int i10, int i11, TLRPC.Document document) {
        this.g = i10;
        this.h = i11;
        this.e = document;
        x();
        w();
        i(false);
    }
}
