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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class i5 extends Drawable {
    public static SparseArray r;
    public static HashMap s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static final org.telegram.messenger.pd w = new org.telegram.messenger.pd(17);
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
    public di.z2 k;
    public boolean m;
    public ColorFilter p;
    public ColorFilter q;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public i5(int i7, int i10, long j3) {
        this.h = i10;
        this.g = i7;
        x();
        this.f = j3;
        g(i10).b(j3, new a5(this, 0));
    }

    public static TLRPC.Document e(int i7, long j3) {
        HashMap hashMap = g(i7).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j3));
    }

    public static int f() {
        return org.telegram.messenger.iz.o() == 0 ? 0 : 2;
    }

    public static e5 g(int i7) {
        if (s == null) {
            s = new HashMap();
        }
        e5 e5Var = (e5) s.get(Integer.valueOf(i7));
        if (e5Var != null) {
            return e5Var;
        }
        HashMap hashMap = s;
        Integer valueOf = Integer.valueOf(i7);
        e5 e5Var2 = new e5(i7);
        hashMap.put(valueOf, e5Var2);
        return e5Var2;
    }

    public static i5 l(int i7, int i10, TLRPC.Document document) {
        if (r == null) {
            r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        i5 i5Var = (i5) longSparseArray.get(document.id);
        if (i5Var != null) {
            return i5Var;
        }
        long j3 = document.id;
        i5 i5Var2 = new i5(i10, i7, document);
        longSparseArray.put(j3, i5Var2);
        return i5Var2;
    }

    public static i5 m(int i7, long j3, String str, int i10) {
        if (r == null) {
            r = new SparseArray();
        }
        int i11 = 1;
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        i5 i5Var = (i5) longSparseArray.get(j3);
        if (i5Var != null) {
            return i5Var;
        }
        i5 i5Var2 = new i5();
        i5Var2.l = 1.0f;
        i5Var2.n = null;
        i5Var2.o = null;
        i5Var2.h = i7;
        i5Var2.g = i10;
        i5Var2.x();
        i5Var2.f = j3;
        i5Var2.i = str;
        g(i7).b(j3, new a5(i5Var2, i11));
        longSparseArray.put(j3, i5Var2);
        return i5Var2;
    }

    public static void r(int i7, boolean z9) {
        LongSparseArray longSparseArray;
        di.z2 z2Var;
        boolean z10 = !z9;
        if (v == z10) {
            return;
        }
        v = z10;
        if (r == null || (longSparseArray = (LongSparseArray) r.get(Objects.hash(Integer.valueOf(i7), 25))) == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            i5 i5Var = (i5) longSparseArray.valueAt(i10);
            if (i5Var != null && (z2Var = i5Var.k) != null) {
                if (z9) {
                    z2Var.u0 = true;
                    z2Var.t0 = true;
                    z2Var.W(1);
                    v5 m10 = z2Var.m();
                    if (m10 != null) {
                        boolean z11 = z2Var.v0;
                        if (!m10.n0) {
                            m10.v0 = z11;
                        }
                        m10.start();
                    } else {
                        zg0 B = z2Var.B();
                        if (B != null) {
                            B.start();
                        }
                    }
                } else {
                    z2Var.t0 = false;
                    z2Var.u0 = false;
                    z2Var.W(0);
                    z2Var.Q0();
                }
            }
        }
    }

    public static void t() {
        if (r == null) {
            return;
        }
        w();
        for (int i7 = 0; i7 < r.size(); i7++) {
            LongSparseArray longSparseArray = (LongSparseArray) r.valueAt(i7);
            for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                long keyAt = longSparseArray.keyAt(i10);
                i5 i5Var = (i5) longSparseArray.get(keyAt);
                if (i5Var == null || !i5Var.a) {
                    longSparseArray.remove(keyAt);
                } else {
                    i5Var.i(true);
                }
            }
        }
    }

    public static void w() {
        t = org.telegram.messenger.rc.e(16388);
        u = org.telegram.messenger.rc.e(8200);
    }

    public final void a(View view) {
        if (view instanceof org.telegram.ui.t01) {
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

    public final void b(o5 o5Var) {
        if (this.c == null) {
            this.c = new ArrayList(10);
        }
        this.m = false;
        if (!this.c.contains(o5Var)) {
            this.c.add(o5Var);
        }
        u();
    }

    public final boolean c() {
        boolean z9 = true;
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
        if (!k() && !org.telegram.messenger.ij.D4(this.e)) {
            z9 = false;
        }
        this.n = Boolean.valueOf(z9);
        return z9;
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
        di.z2 z2Var = this.k;
        if (z2Var == null) {
            return;
        }
        z2Var.z0(getBounds());
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
    public final void i(boolean z9) {
        org.telegram.messenger.rz d;
        String str;
        org.telegram.messenger.hc hcVar;
        org.telegram.messenger.hc b10;
        org.telegram.messenger.kb kbVar;
        org.telegram.messenger.hc hcVar2;
        Drawable g10;
        Drawable drawable;
        di.z2 z2Var;
        int i7;
        String str2 = this.i;
        int i10 = this.g;
        TLRPC.Document document = this.e;
        if (document != null) {
            di.z2 z2Var2 = this.k;
            if (z2Var2 == null || this.j || z9) {
                if ((i10 == 20 || i10 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                this.j = false;
                if (z2Var2 == null) {
                    di.z2 z2Var3 = new di.z2(this, 4);
                    this.k = z2Var3;
                    z2Var3.d = this.h;
                    z2Var3.z1 = true;
                    if (i10 == 12) {
                        z2Var3.y = true;
                    }
                }
                if (this.p != null && c()) {
                    this.k.o1 = this.p;
                }
                if (i10 != 0) {
                    this.k.v1 = com.google.android.recaptcha.internal.a.i(i10 == 12 ? 2 : i10, "_");
                }
                this.k.y1 = true;
                boolean z10 = (org.telegram.messenger.iz.o() == 0 && i10 == 5) || ((i10 == 2 || i10 == 25) && !t) || (i10 == 3 && !u);
                if (i10 == 13 || i10 == 16) {
                    z10 = true;
                }
                if (i10 == 24 || i10 == 27) {
                    z10 = false;
                }
                String str3 = this.d + "_" + this.d;
                if (i10 == 12) {
                    str3 = rf.b.q(str3, "_d_nostream");
                }
                if (i10 != 17 && i10 != 15 && i10 != 14 && i10 != 8 && ((i10 != 1 || org.telegram.messenger.iz.o() < 2) && i10 != 12)) {
                    str3 = rf.b.q(str3, "_pcache");
                }
                if (i10 != 17 && i10 != 0 && i10 != 26 && i10 != 1 && i10 != 14 && i10 != 15 && i10 != 19 && i10 != 20 && i10 != 21) {
                    str3 = rf.b.q(str3, "_compress");
                }
                if (i10 == 8) {
                    str3 = rf.b.q(str3, "firstframe");
                }
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.e.thumbs, 90, false, null, false);
                if ("video/webm".equals(this.e.mime_type)) {
                    b10 = org.telegram.messenger.hc.b(this.e);
                    str3 = rf.b.q(str3, "_g");
                    d = org.telegram.messenger.t5.d(this.e.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, true);
                } else {
                    if (!"application/x-tgsticker".equals(this.e.mime_type)) {
                        d = org.telegram.messenger.t5.d(this.e.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, true);
                        if (d != null && org.telegram.messenger.ij.L2(this.e, true)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = str3;
                        hcVar = null;
                        if (i10 != 20 || i10 == 21) {
                            hcVar2 = null;
                            g10 = org.telegram.messenger.i6.g(org.telegram.messenger.ij.V(this.e, null, null));
                            if (g10 != null) {
                                drawable = g10;
                                if (str2 != null) {
                                    this.k.w0(new v5(new File(str2), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                                } else if (i10 == 8) {
                                    di.z2 z2Var4 = this.k;
                                    TLRPC.Document document2 = this.e;
                                    z2Var4.u0(null, null, hcVar, str, null, null, drawable, document2.size, null, document2, 1);
                                } else {
                                    String str4 = str;
                                    if (z10 || !(t || i10 == 14)) {
                                        org.telegram.messenger.hc c10 = i10 == 16 ? org.telegram.messenger.hc.c(w10, this.e) : hcVar2;
                                        if ("video/webm".equals(this.e.mime_type)) {
                                            di.z2 z2Var5 = this.k;
                                            org.telegram.messenger.hc c11 = org.telegram.messenger.hc.c(w10, this.e);
                                            String str5 = this.d + "_" + this.d;
                                            TLRPC.Document document3 = this.e;
                                            z2Var5.u0(null, null, c11, str5, c10, null, drawable, document3.size, null, document3, 1);
                                        } else if (org.telegram.messenger.ij.L2(this.e, true)) {
                                            di.z2 z2Var6 = this.k;
                                            String q10 = rf.b.q(str4, "_firstframe");
                                            TLRPC.Document document4 = this.e;
                                            z2Var6.r0(hcVar, q10, c10, null, drawable, document4.size, null, document4, 1);
                                        } else {
                                            di.z2 z2Var7 = this.k;
                                            org.telegram.messenger.hc c12 = org.telegram.messenger.hc.c(w10, this.e);
                                            String str6 = this.d + "_" + this.d;
                                            TLRPC.Document document5 = this.e;
                                            z2Var7.r0(c12, str6, c10, null, drawable, document5.size, null, document5, 1);
                                        }
                                    } else {
                                        org.telegram.messenger.hc c13 = i10 == 17 ? org.telegram.messenger.hc.c(w10, this.e) : hcVar2;
                                        di.z2 z2Var8 = this.k;
                                        org.telegram.messenger.hc c14 = org.telegram.messenger.hc.c(w10, this.e);
                                        String str7 = this.d + "_" + this.d;
                                        TLRPC.Document document6 = this.e;
                                        z2Var8.u0(hcVar, str4, c14, str7, c13, null, drawable, document6.size, null, document6, 1);
                                    }
                                }
                                v(this.k);
                                if (i10 != 13 || i10 == 16 || i10 == 3 || i10 == 5 || i10 == 4 || i10 == 24) {
                                    this.k.E0(7);
                                }
                                if (i10 != 9 || i10 == 21 || i10 == 27) {
                                    this.k.E0(6656);
                                }
                                z2Var = this.k;
                                z2Var.R0 = true;
                                if (i10 != 12 || i10 == 26 || i10 == 18 || i10 == 8 || i10 == 6 || i10 == 5 || (i10 == 25 && v)) {
                                    i7 = 0;
                                    z2Var.t0 = false;
                                    z2Var.u0 = false;
                                    z2Var.W(0);
                                } else {
                                    z2Var.u0 = true;
                                    z2Var.t0 = true;
                                    z2Var.W(1);
                                    i7 = 0;
                                }
                                this.k.w0 = true;
                                this.k.J0((i10 != 5 || i10 == 6 || i10 == 27) ? org.telegram.messenger.g0.L(6.0f) : i10 == 24 ? org.telegram.messenger.g0.L(14.0f) : i7);
                                u();
                                j();
                            }
                        } else {
                            hcVar2 = null;
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
                        z2Var = this.k;
                        z2Var.R0 = true;
                        if (i10 != 12) {
                        }
                        i7 = 0;
                        z2Var.t0 = false;
                        z2Var.u0 = false;
                        z2Var.W(0);
                        this.k.w0 = true;
                        this.k.J0((i10 != 5 || i10 == 6 || i10 == 27) ? org.telegram.messenger.g0.L(6.0f) : i10 == 24 ? org.telegram.messenger.g0.L(14.0f) : i7);
                        u();
                        j();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10 != 0 ? com.google.android.recaptcha.internal.a.i(i10, "_") : "");
                    sb2.append(this.f);
                    sb2.append("@");
                    sb2.append(str3);
                    String sb3 = sb2.toString();
                    if (org.telegram.messenger.iz.o() != 0 || i10 == 2 || i10 == 25 || i10 == 22 || (kbVar = org.telegram.messenger.gc.D().e) == null || !((LinkedHashMap) kbVar.c).containsKey(sb3)) {
                        org.telegram.messenger.rz d2 = org.telegram.messenger.t5.d(this.e.thumbs, org.telegram.ui.ActionBar.k6.m6, i10 == 22 ? 0.8f : 0.2f, false);
                        if (d2 != null && org.telegram.messenger.ij.L2(this.e, true)) {
                            d2.e = 512;
                            d2.f = 512;
                        }
                        d = d2;
                    } else {
                        d = null;
                    }
                    b10 = org.telegram.messenger.hc.b(this.e);
                }
                hcVar = b10;
                str = str3;
                if (i10 != 20) {
                }
                hcVar2 = null;
                g10 = org.telegram.messenger.i6.g(org.telegram.messenger.ij.V(this.e, null, null));
                if (g10 != null) {
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
                z2Var = this.k;
                z2Var.R0 = true;
                if (i10 != 12) {
                }
                i7 = 0;
                z2Var.t0 = false;
                z2Var.u0 = false;
                z2Var.W(0);
                this.k.w0 = true;
                this.k.J0((i10 != 5 || i10 == 6 || i10 == 27) ? org.telegram.messenger.g0.L(6.0f) : i10 == 24 ? org.telegram.messenger.g0.L(14.0f) : i7);
                u();
                j();
            }
        }
    }

    public final void j() {
        if (this.b != null) {
            for (int i7 = 0; i7 < this.b.size(); i7++) {
                View view = (View) this.b.get(i7);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.c != null) {
            for (int i10 = 0; i10 < this.c.size(); i10++) {
                o5 o5Var = (o5) this.c.get(i10);
                if (o5Var != null) {
                    o5Var.invalidate();
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
        boolean z9 = false;
        if (document != null) {
            TLRPC.InputStickerSet j12 = org.telegram.messenger.ij.j1(document);
            if (!(j12 instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses)) {
                if (j12 instanceof TLRPC.TL_inputStickerSetID) {
                    long j3 = j12.id;
                    if (j3 != 773947703670341676L) {
                    }
                }
                this.o = Boolean.valueOf(z9);
            }
            z9 = true;
            this.o = Boolean.valueOf(z9);
        }
        return z9;
    }

    public final void n(View view) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.m = false;
        u();
    }

    public final void o(o5 o5Var) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(o5Var);
        }
        this.m = false;
        u();
    }

    public final void p(long j3) {
        di.z2 z2Var = this.k;
        if (z2Var != null) {
            if (this.g == 8) {
                j3 = 0;
            }
            z2Var.s = j3;
        }
    }

    public final void q(String str) {
        di.z2 z2Var;
        int i7 = this.g;
        if ((i7 == 20 || i7 == 21) && !TextUtils.isEmpty(str) && (z2Var = this.k) == null) {
            if (z2Var == null) {
                di.z2 z2Var2 = new di.z2(this, 4);
                this.k = z2Var2;
                z2Var2.d = this.h;
                z2Var2.z1 = true;
                if (i7 == 12) {
                    z2Var2.y = true;
                }
            }
            this.j = true;
            this.k.w0(org.telegram.messenger.i6.g(str));
            this.k.A0 = true;
        }
    }

    public final void s(long j3) {
        di.z2 z2Var = this.k;
        if (z2Var != null) {
            if (this.g == 8) {
                j3 = 0;
            }
            if (z2Var.B() != null) {
                this.k.B().V(j3);
            }
            if (this.k.m() != null) {
                this.k.m().D(j3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        float f10 = i7 / 255.0f;
        this.l = f10;
        di.z2 z2Var = this.k;
        if (z2Var != null) {
            z2Var.setAlpha(f10);
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
        return a8.p0.s(sb2, document == null ? "null" : org.telegram.messenger.ij.V(document, null, null), "}");
    }

    public final void u() {
        ArrayList arrayList;
        if (this.k == null) {
            return;
        }
        ArrayList arrayList2 = this.b;
        boolean z9 = (arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.c) != null && arrayList.size() > 0) || this.m;
        if (z9 != this.a) {
            this.a = z9;
            if (z9) {
                this.k.P();
            } else {
                this.k.R();
            }
            if (this.a) {
                return;
            }
            org.telegram.messenger.pd pdVar = w;
            org.telegram.messenger.g0.r(pdVar);
            org.telegram.messenger.g0.i3(pdVar, 5000L);
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i7 = this.g;
        if (i7 == 7 || i7 == 9 || i7 == 10) {
            imageReceiver.X(2);
            return;
        }
        if (i7 == 11 || i7 == 18 || i7 == 14 || i7 == 6 || i7 == 5 || i7 == 22) {
            imageReceiver.X(1);
        } else if (i7 == 17) {
            imageReceiver.X(0);
        }
    }

    public final void x() {
        int i7 = this.g;
        if (i7 == 0 || i7 == 26) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.o2.descent()) + Math.abs(org.telegram.ui.ActionBar.k6.o2.ascent())) * 1.15f) / org.telegram.messenger.g0.p);
            return;
        }
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.y2;
        if (textPaintArr != null && (i7 == 1 || i7 == 4 || i7 == 19 || i7 == 20)) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.g0.p);
            return;
        }
        if (textPaintArr != null && i7 == 8) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.g0.p);
            return;
        }
        if (i7 == 14 || i7 == 15 || i7 == 17) {
            this.d = 100;
            return;
        }
        if (i7 == 11 || i7 == 22) {
            this.d = 56;
            return;
        }
        if (i7 == 27) {
            this.d = 50;
            return;
        }
        if (i7 == 24) {
            this.d = org.telegram.messenger.qs.W1;
            return;
        }
        if (i7 == 23) {
            this.d = 14;
        } else if (i7 == 21) {
            this.d = 90;
        } else {
            this.d = 34;
        }
    }

    public i5(int i7, int i10, TLRPC.Document document) {
        this.g = i7;
        this.h = i10;
        this.e = document;
        x();
        w();
        i(false);
    }
}
