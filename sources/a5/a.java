package a5;

import a1.g;
import ah.l0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import bi.n8;
import c3.h;
import c3.i;
import c3.p;
import c3.s;
import c3.u;
import c5.w;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.internal.cast.a0;
import com.google.firebase.messaging.m;
import e2.k0;
import e2.m0;
import e9.c2;
import e9.h0;
import e9.p0;
import e9.q0;
import h0.c;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j9.t;
import ja.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import ji.v2;
import li.k;
import m.d3;
import m.l1;
import m.q;
import m.q3;
import m4.f0;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nz;
import org.xmlpull.v1.XmlPullParserException;
import qi.e;
import u2.c0;
import u2.g0;
import u2.i0;
import u2.j0;
import v7.d8;
import v7.d9;
import v7.e8;
import v7.j;
import v7.k6;
import v7.m8;
import v7.q7;
import x7.d0;
import x7.e0;
import x7.i9;
import x7.ia;
import x7.p7;
import z7.ib;
import z7.we;
import z7.x;
import z7.y;
import z7.zf;
import zf.f;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class a implements i, t {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public /* synthetic */ a(char c10, int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e8, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e0, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e2, code lost:
    
        r0 = new qf.b(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e9, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01fb, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fe, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0200, code lost:
    
        r16 = (int[]) r0.b;
        r17 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020e, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0210, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0212, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0225, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x026e, code lost:
    
        return new a5.a(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021f, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0222, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0229, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023b, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x023d, code lost:
    
        r20 = (int[]) r0.b;
        r21 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x024c, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024f, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0251, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0262, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025c, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x025f, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0276, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ed, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ef, code lost:
    
        r0 = new qf.b(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
    
        r0 = new qf.b(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a j(Resources resources, int i10, Resources.Theme theme) {
        int next;
        float f7;
        int i11;
        float f10;
        int i12;
        float f11;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b10 = c.b(resources, xml, asAttributeSet, theme);
                return new a((Shader) null, b10, b10.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f12 = h0.b.f(resources, theme, asAttributeSet, d0.a.d);
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? f12.getFloat(8, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f12.getFloat(9, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f12.getFloat(10, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f12.getFloat(11, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? f12.getFloat(3, 0.0f) : 0.0f;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f12.getFloat(4, 0.0f) : 0.0f;
        int i13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", TeXSymbolParser.TYPE_ATTR) != null ? f12.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f12.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f12.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f7 = f13;
            i11 = f12.getColor(1, 0);
        } else {
            f7 = f13;
            i11 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f10 = f14;
            i12 = f12.getInt(6, 0);
        } else {
            f10 = f14;
            i12 = 0;
        }
        float f19 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f12.getFloat(5, 0.0f) : 0.0f;
        f12.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f20 = f19;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f21 = f15;
            if (next2 == 1) {
                f11 = f16;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f16;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f22 = h0.b.f(resources, theme, asAttributeSet, d0.a.e);
                boolean hasValue = f22.hasValue(0);
                boolean hasValue2 = f22.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = f22.getColor(0, 0);
                float f23 = f22.getFloat(1, 0.0f);
                f22.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f23));
            }
            f15 = f21;
            f16 = f11;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public void A(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.c = ofInt;
        ofInt.addUpdateListener(new l0(25, this, iArr));
        ((ValueAnimator) this.c).addListener(new gi(this, i10, iArr, 1));
        ((ValueAnimator) this.c).setDuration(j10);
        ((ValueAnimator) this.c).setInterpolator(interpolator);
        ((ValueAnimator) this.c).start();
    }

    public List B(CharSequence charSequence) {
        charSequence.getClass();
        ya.c cVar = (ya.c) this.d;
        cVar.getClass();
        d9.t tVar = new d9.t(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (tVar.hasNext()) {
            arrayList.add((String) tVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void C(int i10, long j10, long j11) {
        c0 c0Var = new c0(1, i10, null, 3, null, m0.h0(j10), m0.h0(j11));
        g0 g0Var = (g0) this.c;
        g0Var.getClass();
        l(new nz(this, g0Var, c0Var, 11));
    }

    public void D(String str, k6.c cVar) {
        int i10 = this.b + 1;
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            this.c = Arrays.copyOf(objArr, i12);
        }
        Object[] objArr2 = (Object[]) this.c;
        int i13 = this.b;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.b = i13 + 1;
    }

    public void E(String str, l lVar) {
        Map map = (Map) this.c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(g.p("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lVar);
        if (this.b > 0) {
            new a0(Looper.getMainLooper(), 4).post(new w(this, lVar, str, false, 4));
        }
    }

    public byte[] F() {
        j jVar;
        d dVar;
        e0 e0Var;
        d dVar2;
        y yVar;
        d dVar3;
        switch (this.a) {
            case 23:
                d9 d9Var = d9.c;
                e eVar = (e) this.c;
                ((d8) this.d).h = false;
                d8 d8Var = (d8) this.d;
                d8Var.f = Boolean.FALSE;
                eVar.a = new e8(d8Var);
                try {
                    d9.b();
                    k6 k6Var = new k6(eVar);
                    u2.c cVar = new u2.c(1);
                    d9Var.a(cVar);
                    HashMap hashMap = new HashMap((HashMap) cVar.b);
                    HashMap hashMap2 = new HashMap((HashMap) cVar.c);
                    v7.i iVar = (v7.i) cVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jVar = new j(byteArrayOutputStream, hashMap, hashMap2, iVar);
                        dVar = (d) hashMap.get(k6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar == null) {
                        throw new ja.b("No encoder for ".concat(String.valueOf(k6.class)));
                    }
                    dVar.a(k6Var, jVar);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 24:
                ia iaVar = ia.c;
                m mVar = (m) this.c;
                ((d8) this.d).h = false;
                d8 d8Var2 = (d8) this.d;
                d8Var2.f = Boolean.FALSE;
                mVar.a = new i9(d8Var2);
                try {
                    ia.b();
                    p7 p7Var = new p7(mVar);
                    u2.c cVar2 = new u2.c(9);
                    iaVar.a(cVar2);
                    HashMap hashMap3 = new HashMap((HashMap) cVar2.b);
                    HashMap hashMap4 = new HashMap((HashMap) cVar2.c);
                    d0 d0Var = (d0) cVar2.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        e0Var = new e0(byteArrayOutputStream2, hashMap3, hashMap4, d0Var);
                        dVar2 = (d) hashMap3.get(p7.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 == null) {
                        throw new ja.b("No encoder for ".concat(String.valueOf(p7.class)));
                    }
                    dVar2.a(p7Var, e0Var);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e7) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
                }
            default:
                zf zfVar = zf.c;
                q3 q3Var = (q3) this.c;
                ((d8) this.d).h = false;
                d8 d8Var3 = (d8) this.d;
                d8Var3.f = Boolean.FALSE;
                q3Var.a = new we(d8Var3);
                try {
                    zf.b();
                    ib ibVar = new ib(q3Var);
                    u2.c cVar3 = new u2.c(15);
                    zfVar.a(cVar3);
                    HashMap hashMap5 = new HashMap((HashMap) cVar3.b);
                    HashMap hashMap6 = new HashMap((HashMap) cVar3.c);
                    x xVar = (x) cVar3.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar3 = (d) hashMap5.get(ib.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 == null) {
                        throw new ja.b("No encoder for ".concat(String.valueOf(ib.class)));
                    }
                    dVar3.a(ibVar, yVar);
                    return byteArrayOutputStream3.toByteArray();
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
        }
    }

    public void G(Bundle bundle) {
        this.b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            ((l) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void H(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((l) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public void a(int i10, int i11) {
        int i12 = (i11 << 16) + i10;
        boolean z10 = this.b != i12;
        this.b = i12;
        for (int i13 = 0; i13 < f.y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new zf.c(bitmap, 0));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            zf.a0[] a0VarArr = (zf.a0[]) this.c;
            if (a0VarArr[i13] == null) {
                a0VarArr[i13] = new zf.a0(i11 * i10 * 2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    @Override // c3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h b(p pVar, long j10) {
        switch (this.a) {
            case 8:
                long position = pVar.getPosition();
                long n10 = n(pVar);
                long k10 = pVar.k();
                pVar.l(Math.max(6, ((u) this.c).c));
                long n11 = n(pVar);
                return (n10 > j10 || n11 <= j10) ? n11 <= j10 ? new h(-2, n11, pVar.k()) : new h(-1, n10, position) : new h(0, -9223372036854775807L, k10);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                e2.x xVar = (e2.x) this.d;
                xVar.K(min);
                pVar.a(0, min, xVar.a);
                int i10 = xVar.c;
                long j11 = -1;
                long j12 = -1;
                long j13 = -9223372036854775807L;
                while (xVar.a() >= 188) {
                    byte[] bArr = xVar.a;
                    int i11 = xVar.b;
                    while (i11 < i10 && bArr[i11] != 71) {
                        i11++;
                    }
                    int i12 = i11 + 188;
                    if (i12 > i10) {
                        return j13 == -9223372036854775807L ? new h(-2, j13, position2 + j11) : h.d;
                    }
                    long a2 = m8.a(xVar, i11, this.b);
                    if (a2 != -9223372036854775807L) {
                        long b10 = ((k0) this.c).b(a2);
                        if (b10 > j10) {
                            return j13 == -9223372036854775807L ? new h(-1, b10, position2) : new h(0, -9223372036854775807L, position2 + j12);
                        }
                        j13 = b10;
                        if (100000 + j13 > j10) {
                            return new h(0, -9223372036854775807L, position2 + i11);
                        }
                        j12 = i11;
                    }
                    xVar.N(i12);
                    j11 = i12;
                }
                if (j13 == -9223372036854775807L) {
                }
        }
    }

    @Override // c3.i
    public void c() {
        switch (this.a) {
            case 8:
                break;
            default:
                e2.x xVar = (e2.x) this.d;
                byte[] bArr = m0.b;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                break;
        }
    }

    public void d() {
        d3 d3Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            l1.a(drawable);
        }
        if (drawable == null || (d3Var = (d3) this.d) == null) {
            return;
        }
        q.d(drawable, d3Var, imageView.getDrawableState());
    }

    public c2 e(boolean z10) {
        p0 p0Var;
        p0 p0Var2;
        if (z10 && (p0Var2 = (p0) this.d) != null) {
            throw p0Var2.a();
        }
        c2 f7 = c2.f(this.b, (Object[]) this.c, this);
        if (!z10 || (p0Var = (p0) this.d) == null) {
            return f7;
        }
        throw p0Var.a();
    }

    public ta.b f() {
        if ("".isEmpty()) {
            return new ta.b((String) this.c, ((Long) this.d).longValue(), this.b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public q0 g() {
        return e(false);
    }

    public void h(int i10) {
        int i11 = this.b;
        if (i10 == i11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        sb2.append(i11 != 0 ? i11 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        sb2.append(" expected, but got ");
        sb2.append(i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb2.toString());
    }

    public void k(String str, Object... objArr) {
        if (this.b <= 3) {
            String str2 = (String) this.c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public void l(e2.j jVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            m0.W(j0Var.a, new s9.b(7, jVar, j0Var.b));
        }
    }

    public void m(int i10, b2.x xVar, int i11, Object obj, long j10) {
        l(new org.telegram.ui.web.c0(10, this, new c0(1, i10, xVar, i11, obj, m0.h0(j10), -9223372036854775807L)));
    }

    public long n(p pVar) {
        int f7;
        s sVar = (s) this.d;
        u uVar = (u) this.c;
        while (pVar.k() < pVar.getLength() - 6) {
            int i10 = this.b;
            long k10 = pVar.k();
            e2.x xVar = new e2.x(17);
            int i11 = 0;
            boolean a2 = false;
            pVar.a(0, 2, xVar.a);
            if (xVar.g(0, ByteOrder.BIG_ENDIAN) != i10) {
                pVar.q();
                pVar.l((int) (k10 - pVar.getPosition()));
            } else {
                byte[] bArr = xVar.a;
                while (i11 < 15 && (f7 = pVar.f(2 + i11, 15 - i11, bArr)) != -1) {
                    i11 += f7;
                }
                xVar.M(i11 + 2);
                pVar.q();
                pVar.l((int) (k10 - pVar.getPosition()));
                a2 = c3.b.a(xVar, uVar, i10, sVar);
            }
            if (a2) {
                break;
            }
            pVar.l(1);
        }
        if (pVar.k() < pVar.getLength() - 6) {
            return sVar.a;
        }
        pVar.l((int) (pVar.getLength() - pVar.k()));
        return uVar.j;
    }

    public Object o(int i10) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i11 = this.b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    @Override // j9.t
    public void onSuccess(Object obj) {
        List list = (List) obj;
        f0 f0Var = ((m4.q0) this.d).g;
        Handler handler = f0Var.l;
        m4.w wVar = (m4.w) this.c;
        m0.W(handler, new v2(f0Var, wVar, new n8(this, this.b, list, wVar, 6)));
    }

    public boolean p() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void q(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11) {
        l(new i0(this, uVar, new c0(i10, i11, xVar, i12, obj, m0.h0(j10), m0.h0(j11)), 1));
    }

    public void r(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11) {
        l(new i0(this, uVar, new c0(i10, i11, xVar, i12, obj, m0.h0(j10), m0.h0(j11)), 0));
    }

    public void s(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        l(new pk(this, uVar, new c0(i10, i11, xVar, i12, obj, m0.h0(j10), m0.h0(j11)), iOException, z10));
    }

    public void t(u2.u uVar, int i10, IOException iOException, boolean z10) {
        s(uVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void u(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f;
        k P = k.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.c;
        r0.j0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) P.c, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = q7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                l1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(P.E(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(l1.b(typedArray.getInt(3, -1), null));
            }
            P.Q();
        } catch (Throwable th2) {
            P.Q();
            throw th2;
        }
    }

    public void v(u2.u uVar, int i10, int i11, b2.x xVar, int i12, Object obj, long j10, long j11, int i13) {
        l(new org.telegram.ui.ia(this, uVar, new c0(i10, i11, xVar, i12, obj, m0.h0(j10), m0.h0(j11)), i13, 9));
    }

    public a x(Object obj, Object obj2) {
        int i10 = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i10 > objArr.length) {
            this.c = Arrays.copyOf(objArr, h0.b(objArr.length, i10));
        }
        e9.s.e(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i11 = this.b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.b = i11 + 1;
        return this;
    }

    public a y(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, h0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            x(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void z(int i10) {
        A(i10, 200L, es.f);
    }

    public a(int i10, int i11) {
        this.a = i11;
        switch (i11) {
            case 5:
                this.c = new Object[i10 * 2];
                this.b = 0;
                break;
            default:
                this.b = i10;
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    public a(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 14:
                this.c = new hh.a();
                break;
            case 19:
                this.c = new Object[8];
                this.b = 0;
                break;
            case 27:
                int i11 = f.y;
                this.c = new zf.a0[i11];
                this.d = new Bitmap[i11];
                break;
            default:
                this.c = DesugarCollections.synchronizedMap(new a0.f(0));
                this.b = 0;
                break;
        }
    }

    public a(m mVar, int i10) {
        this.a = 24;
        this.d = new d8();
        this.c = mVar;
        ia.b();
        this.b = i10;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.a = 17;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.d = sb2;
        this.c = str;
        int i10 = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.c, i10)) {
            i10++;
        }
        this.b = i10;
    }

    private final /* synthetic */ void w() {
    }

    @Override // j9.t
    public void i(Throwable th2) {
    }

    public a(q3 q3Var, int i10) {
        this.a = 26;
        this.d = new d8();
        this.c = q3Var;
        zf.b();
        this.b = i10;
    }

    public a(e eVar, int i10) {
        this.a = 23;
        this.d = new d8();
        this.c = eVar;
        d9.b();
        this.b = i10;
    }

    public a(mm0 mm0Var) {
        this.a = 16;
        this.d = mm0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.a = 18;
        this.c = rectF;
        this.b = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (((File) this.d) == null) {
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            FileOutputStream fileOutputStream = new FileOutputStream((File) this.d);
            Deflater deflater = new Deflater(1, true);
            deflater.setInput(array, byteBuffer.arrayOffset(), byteBuffer.remaining());
            deflater.finish();
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                fileOutputStream.write(bArr, 0, deflater.deflate(bArr));
            }
            deflater.end();
            fileOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public a(ImageView imageView) {
        this.a = 12;
        this.b = 0;
        this.c = imageView;
    }

    public a(t0.a aVar) {
        this.a = 22;
        this.c = new SparseArray();
        this.d = aVar;
        this.b = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.a = 7;
        this.c = shader;
        this.d = colorStateList;
        this.b = i10;
    }

    public a(String str) {
        this.a = 0;
        this.c = str;
        this.d = null;
        this.b = 0;
    }

    public a(u uVar, int i10) {
        this.a = 8;
        this.c = uVar;
        this.b = i10;
        this.d = new s();
    }

    public a(int i10, k0 k0Var) {
        this.a = 10;
        this.b = i10;
        this.c = k0Var;
        this.d = new e2.x();
    }

    public a(byte[] bArr) {
        this.a = 0;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.c = null;
        this.b = 1;
    }

    public a(g2.g gVar) {
        this.a = 11;
        c5.f fVar = new c5.f();
        fVar.c = new t7.u(28);
        fVar.a = 3;
        this.d = fVar;
        this.c = gVar;
        this.b = 1;
    }

    public a(ya.c cVar) {
        this.a = 4;
        d9.b bVar = d9.b.f;
        this.d = cVar;
        this.c = bVar;
        this.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public a(m4.q0 q0Var, m4.w wVar, int i10) {
        this.a = 13;
        this.d = q0Var;
        this.c = wVar;
        this.b = i10;
    }
}
