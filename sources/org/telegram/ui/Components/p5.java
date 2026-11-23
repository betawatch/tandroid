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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class p5 extends Drawable {
    public static SparseArray r;
    public static HashMap s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static final org.telegram.messenger.j2 w = new org.telegram.messenger.j2(25);
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
    public fi.s2 k;
    public boolean m;
    public ColorFilter p;
    public ColorFilter q;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public p5(int i7, int i10, long j3) {
        this.h = i10;
        this.g = i7;
        x();
        this.f = j3;
        g(i10).b(j3, new h5(this, 0));
    }

    public static TLRPC.Document e(int i7, long j3) {
        HashMap hashMap = g(i7).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j3));
    }

    public static int f() {
        return org.telegram.messenger.cz.o() == 0 ? 0 : 2;
    }

    public static l5 g(int i7) {
        if (s == null) {
            s = new HashMap();
        }
        l5 l5Var = (l5) s.get(Integer.valueOf(i7));
        if (l5Var != null) {
            return l5Var;
        }
        HashMap hashMap = s;
        Integer valueOf = Integer.valueOf(i7);
        l5 l5Var2 = new l5(i7);
        hashMap.put(valueOf, l5Var2);
        return l5Var2;
    }

    public static p5 l(int i7, int i10, TLRPC.Document document) {
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
        p5 p5Var = (p5) longSparseArray.get(document.id);
        if (p5Var != null) {
            return p5Var;
        }
        long j3 = document.id;
        p5 p5Var2 = new p5(i10, i7, document);
        longSparseArray.put(j3, p5Var2);
        return p5Var2;
    }

    public static p5 m(int i7, long j3, String str, int i10) {
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
        p5 p5Var = (p5) longSparseArray.get(j3);
        if (p5Var != null) {
            return p5Var;
        }
        p5 p5Var2 = new p5();
        p5Var2.l = 1.0f;
        p5Var2.n = null;
        p5Var2.o = null;
        p5Var2.h = i7;
        p5Var2.g = i10;
        p5Var2.x();
        p5Var2.f = j3;
        p5Var2.i = str;
        g(i7).b(j3, new h5(p5Var2, i11));
        longSparseArray.put(j3, p5Var2);
        return p5Var2;
    }

    public static void r(int i7, boolean z10) {
        LongSparseArray longSparseArray;
        fi.s2 s2Var;
        boolean z11 = !z10;
        if (v == z11) {
            return;
        }
        v = z11;
        if (r == null || (longSparseArray = (LongSparseArray) r.get(Objects.hash(Integer.valueOf(i7), 25))) == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            p5 p5Var = (p5) longSparseArray.valueAt(i10);
            if (p5Var != null && (s2Var = p5Var.k) != null) {
                if (z10) {
                    s2Var.v0 = true;
                    s2Var.u0 = true;
                    s2Var.W(1);
                    c6 m10 = s2Var.m();
                    if (m10 != null) {
                        boolean z12 = s2Var.w0;
                        if (!m10.o0) {
                            m10.w0 = z12;
                        }
                        m10.start();
                    } else {
                        oh0 B = s2Var.B();
                        if (B != null) {
                            B.start();
                        }
                    }
                } else {
                    s2Var.u0 = false;
                    s2Var.v0 = false;
                    s2Var.W(0);
                    s2Var.Q0();
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
                p5 p5Var = (p5) longSparseArray.get(keyAt);
                if (p5Var == null || !p5Var.a) {
                    longSparseArray.remove(keyAt);
                } else {
                    p5Var.i(true);
                }
            }
        }
    }

    public static void w() {
        t = org.telegram.messenger.qc.e(16388);
        u = org.telegram.messenger.qc.e(8200);
    }

    public final void a(View view) {
        if (view instanceof org.telegram.ui.v01) {
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

    public final void b(v5 v5Var) {
        if (this.c == null) {
            this.c = new ArrayList(10);
        }
        this.m = false;
        if (!this.c.contains(v5Var)) {
            this.c.add(v5Var);
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
        if (!k() && !org.telegram.messenger.gj.C4(this.e)) {
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
        fi.s2 s2Var = this.k;
        if (s2Var == null) {
            return;
        }
        s2Var.z0(getBounds());
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
        org.telegram.messenger.mz d;
        String str;
        org.telegram.messenger.gc gcVar;
        org.telegram.messenger.gc b10;
        org.telegram.messenger.jb jbVar;
        org.telegram.messenger.gc gcVar2;
        Drawable g10;
        Drawable drawable;
        fi.s2 s2Var;
        int i7;
        String str2 = this.i;
        int i10 = this.g;
        TLRPC.Document document = this.e;
        if (document != null) {
            fi.s2 s2Var2 = this.k;
            if (s2Var2 == null || this.j || z10) {
                if ((i10 == 20 || i10 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                this.j = false;
                if (s2Var2 == null) {
                    fi.s2 s2Var3 = new fi.s2(this, 4);
                    this.k = s2Var3;
                    s2Var3.d = this.h;
                    s2Var3.A1 = true;
                    if (i10 == 12) {
                        s2Var3.y = true;
                    }
                }
                if (this.p != null && c()) {
                    this.k.p1 = this.p;
                }
                if (i10 != 0) {
                    this.k.w1 = com.google.android.gms.internal.vision.e2.i(i10 == 12 ? 2 : i10, "_");
                }
                this.k.z1 = true;
                boolean z11 = (org.telegram.messenger.cz.o() == 0 && i10 == 5) || ((i10 == 2 || i10 == 25) && !t) || (i10 == 3 && !u);
                if (i10 == 13 || i10 == 16) {
                    z11 = true;
                }
                if (i10 == 24 || i10 == 27) {
                    z11 = false;
                }
                String str3 = this.d + "_" + this.d;
                if (i10 == 12) {
                    str3 = p5.c.v(str3, "_d_nostream");
                }
                if (i10 != 17 && i10 != 15 && i10 != 14 && i10 != 8 && ((i10 != 1 || org.telegram.messenger.cz.o() < 2) && i10 != 12)) {
                    str3 = p5.c.v(str3, "_pcache");
                }
                if (i10 != 17 && i10 != 0 && i10 != 26 && i10 != 1 && i10 != 14 && i10 != 15 && i10 != 19 && i10 != 20 && i10 != 21) {
                    str3 = p5.c.v(str3, "_compress");
                }
                if (i10 == 8) {
                    str3 = p5.c.v(str3, "firstframe");
                }
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.e.thumbs, 90, false, null, false);
                if ("video/webm".equals(this.e.mime_type)) {
                    b10 = org.telegram.messenger.gc.b(this.e);
                    str3 = p5.c.v(str3, "_g");
                    d = org.telegram.messenger.u5.d(this.e.thumbs, org.telegram.ui.ActionBar.m6.m6, 0.2f, true);
                } else {
                    if (!"application/x-tgsticker".equals(this.e.mime_type)) {
                        d = org.telegram.messenger.u5.d(this.e.thumbs, org.telegram.ui.ActionBar.m6.m6, 0.2f, true);
                        if (d != null && org.telegram.messenger.gj.K2(this.e, true)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = str3;
                        gcVar = null;
                        if (i10 != 20 || i10 == 21) {
                            gcVar2 = null;
                            g10 = org.telegram.messenger.j6.g(org.telegram.messenger.gj.V(this.e, null, null));
                            if (g10 != null) {
                                drawable = g10;
                                if (str2 != null) {
                                    this.k.w0(new c6(new File(str2), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                                } else if (i10 == 8) {
                                    fi.s2 s2Var4 = this.k;
                                    TLRPC.Document document2 = this.e;
                                    s2Var4.u0(null, null, gcVar, str, null, null, drawable, document2.size, null, document2, 1);
                                } else {
                                    String str4 = str;
                                    if (z11 || !(t || i10 == 14)) {
                                        org.telegram.messenger.gc c10 = i10 == 16 ? org.telegram.messenger.gc.c(w10, this.e) : gcVar2;
                                        if ("video/webm".equals(this.e.mime_type)) {
                                            fi.s2 s2Var5 = this.k;
                                            org.telegram.messenger.gc c11 = org.telegram.messenger.gc.c(w10, this.e);
                                            String str5 = this.d + "_" + this.d;
                                            TLRPC.Document document3 = this.e;
                                            s2Var5.u0(null, null, c11, str5, c10, null, drawable, document3.size, null, document3, 1);
                                        } else if (org.telegram.messenger.gj.K2(this.e, true)) {
                                            fi.s2 s2Var6 = this.k;
                                            String v10 = p5.c.v(str4, "_firstframe");
                                            TLRPC.Document document4 = this.e;
                                            s2Var6.r0(gcVar, v10, c10, null, drawable, document4.size, null, document4, 1);
                                        } else {
                                            fi.s2 s2Var7 = this.k;
                                            org.telegram.messenger.gc c12 = org.telegram.messenger.gc.c(w10, this.e);
                                            String str6 = this.d + "_" + this.d;
                                            TLRPC.Document document5 = this.e;
                                            s2Var7.r0(c12, str6, c10, null, drawable, document5.size, null, document5, 1);
                                        }
                                    } else {
                                        org.telegram.messenger.gc c13 = i10 == 17 ? org.telegram.messenger.gc.c(w10, this.e) : gcVar2;
                                        fi.s2 s2Var8 = this.k;
                                        org.telegram.messenger.gc c14 = org.telegram.messenger.gc.c(w10, this.e);
                                        String str7 = this.d + "_" + this.d;
                                        TLRPC.Document document6 = this.e;
                                        s2Var8.u0(gcVar, str4, c14, str7, c13, null, drawable, document6.size, null, document6, 1);
                                    }
                                }
                                v(this.k);
                                if (i10 != 13 || i10 == 16 || i10 == 3 || i10 == 5 || i10 == 4 || i10 == 24) {
                                    this.k.E0(7);
                                }
                                if (i10 != 9 || i10 == 21 || i10 == 27) {
                                    this.k.E0(6656);
                                }
                                s2Var = this.k;
                                s2Var.S0 = true;
                                if (i10 != 12 || i10 == 26 || i10 == 18 || i10 == 8 || i10 == 6 || i10 == 5 || (i10 == 25 && v)) {
                                    i7 = 0;
                                    s2Var.u0 = false;
                                    s2Var.v0 = false;
                                    s2Var.W(0);
                                } else {
                                    s2Var.v0 = true;
                                    s2Var.u0 = true;
                                    s2Var.W(1);
                                    i7 = 0;
                                }
                                this.k.x0 = true;
                                this.k.J0((i10 != 5 || i10 == 6 || i10 == 27) ? org.telegram.messenger.g0.L(6.0f) : i10 == 24 ? org.telegram.messenger.g0.L(14.0f) : i7);
                                u();
                                j();
                            }
                        } else {
                            gcVar2 = null;
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
                        s2Var = this.k;
                        s2Var.S0 = true;
                        if (i10 != 12) {
                        }
                        i7 = 0;
                        s2Var.u0 = false;
                        s2Var.v0 = false;
                        s2Var.W(0);
                        this.k.x0 = true;
                        this.k.J0((i10 != 5 || i10 == 6 || i10 == 27) ? org.telegram.messenger.g0.L(6.0f) : i10 == 24 ? org.telegram.messenger.g0.L(14.0f) : i7);
                        u();
                        j();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10 != 0 ? com.google.android.gms.internal.vision.e2.i(i10, "_") : "");
                    sb2.append(this.f);
                    sb2.append("@");
                    sb2.append(str3);
                    String sb3 = sb2.toString();
                    if (org.telegram.messenger.cz.o() != 0 || i10 == 2 || i10 == 25 || i10 == 22 || (jbVar = org.telegram.messenger.fc.D().e) == null || !((LinkedHashMap) jbVar.c).containsKey(sb3)) {
                        org.telegram.messenger.mz d2 = org.telegram.messenger.u5.d(this.e.thumbs, org.telegram.ui.ActionBar.m6.m6, i10 == 22 ? 0.8f : 0.2f, false);
                        if (d2 != null && org.telegram.messenger.gj.K2(this.e, true)) {
                            d2.e = 512;
                            d2.f = 512;
                        }
                        d = d2;
                    } else {
                        d = null;
                    }
                    b10 = org.telegram.messenger.gc.b(this.e);
                }
                gcVar = b10;
                str = str3;
                if (i10 != 20) {
                }
                gcVar2 = null;
                g10 = org.telegram.messenger.j6.g(org.telegram.messenger.gj.V(this.e, null, null));
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
                s2Var = this.k;
                s2Var.S0 = true;
                if (i10 != 12) {
                }
                i7 = 0;
                s2Var.u0 = false;
                s2Var.v0 = false;
                s2Var.W(0);
                this.k.x0 = true;
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
                v5 v5Var = (v5) this.c.get(i10);
                if (v5Var != null) {
                    v5Var.invalidate();
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
            TLRPC.InputStickerSet i12 = org.telegram.messenger.gj.i1(document);
            if (!(i12 instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses)) {
                if (i12 instanceof TLRPC.TL_inputStickerSetID) {
                    long j3 = i12.id;
                    if (j3 != 773947703670341676L) {
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

    public final void o(v5 v5Var) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(v5Var);
        }
        this.m = false;
        u();
    }

    public final void p(long j3) {
        fi.s2 s2Var = this.k;
        if (s2Var != null) {
            if (this.g == 8) {
                j3 = 0;
            }
            s2Var.s = j3;
        }
    }

    public final void q(String str) {
        fi.s2 s2Var;
        int i7 = this.g;
        if ((i7 == 20 || i7 == 21) && !TextUtils.isEmpty(str) && (s2Var = this.k) == null) {
            if (s2Var == null) {
                fi.s2 s2Var2 = new fi.s2(this, 4);
                this.k = s2Var2;
                s2Var2.d = this.h;
                s2Var2.A1 = true;
                if (i7 == 12) {
                    s2Var2.y = true;
                }
            }
            this.j = true;
            this.k.w0(org.telegram.messenger.j6.g(str));
            this.k.B0 = true;
        }
    }

    public final void s(long j3) {
        fi.s2 s2Var = this.k;
        if (s2Var != null) {
            if (this.g == 8) {
                j3 = 0;
            }
            if (s2Var.B() != null) {
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
        fi.s2 s2Var = this.k;
        if (s2Var != null) {
            s2Var.setAlpha(f10);
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
        return a8.p0.s(sb2, document == null ? "null" : org.telegram.messenger.gj.V(document, null, null), "}");
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
            org.telegram.messenger.j2 j2Var = w;
            org.telegram.messenger.g0.r(j2Var);
            org.telegram.messenger.g0.h3(j2Var, 5000L);
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
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.m6.o2.descent()) + Math.abs(org.telegram.ui.ActionBar.m6.o2.ascent())) * 1.15f) / org.telegram.messenger.g0.p);
            return;
        }
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.m6.y2;
        if (textPaintArr != null && (i7 == 1 || i7 == 4 || i7 == 19 || i7 == 20)) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.m6.y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.g0.p);
            return;
        }
        if (textPaintArr != null && i7 == 8) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.m6.y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.g0.p);
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
            this.d = org.telegram.messenger.ls.W1;
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

    public p5(int i7, int i10, TLRPC.Document document) {
        this.g = i7;
        this.h = i10;
        this.e = document;
        x();
        w();
        i(false);
    }
}
