package a8;

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
import android.util.SparseArray;
import android.util.Xml;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import bi.de;
import c8.ue;
import c8.xf;
import j$.util.DesugarCollections;
import j$.util.Objects;
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
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.hy0;
import org.telegram.ui.yl;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class wa implements f3.i, m9.t {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public /* synthetic */ wa(char c10, int i7) {
        this.a = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new q4.q(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.b;
        r17 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new a8.wa(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.b;
        r21 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new q4.q(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new q4.q(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wa g(Resources resources, int i7, Resources.Theme theme) {
        int next;
        float f10;
        int i10;
        float f11;
        int i11;
        float f12;
        XmlResourceParser xml = resources.getXml(i7);
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
                ColorStateList b10 = h0.c.b(resources, xml, asAttributeSet, theme);
                return new wa((Shader) null, b10, b10.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f13 = h0.b.f(resources, theme, asAttributeSet, d0.a.d);
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? f13.getFloat(8, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f13.getFloat(9, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f13.getFloat(10, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f13.getFloat(11, 0.0f) : 0.0f;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? f13.getFloat(3, 0.0f) : 0.0f;
        float f19 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f13.getFloat(4, 0.0f) : 0.0f;
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", TeXSymbolParser.TYPE_ATTR) != null ? f13.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f13.getColor(0, 0) : 0;
        boolean z9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f13.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f10 = f14;
            i10 = f13.getColor(1, 0);
        } else {
            f10 = f14;
            i10 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f11 = f15;
            i11 = f13.getInt(6, 0);
        } else {
            f11 = f15;
            i11 = 0;
        }
        float f20 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f13.getFloat(5, 0.0f) : 0.0f;
        f13.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f21 = f20;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f22 = f16;
            if (next2 == 1) {
                f12 = f17;
                break;
            }
            int depth2 = xml.getDepth();
            f12 = f17;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f23 = h0.b.f(resources, theme, asAttributeSet, d0.a.e);
                boolean hasValue = f23.hasValue(0);
                boolean hasValue2 = f23.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = f23.getColor(0, 0);
                float f24 = f23.getFloat(1, 0.0f);
                f23.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f24));
            }
            f16 = f22;
            f17 = f12;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public void A(long j3, int i7, long j10) {
        x2.c0 c0Var = new x2.c0(1, i7, null, 3, null, h2.m0.h0(j3), h2.m0.h0(j10));
        x2.g0 g0Var = (x2.g0) this.c;
        g0Var.getClass();
        i(new hr(this, g0Var, c0Var, 16));
    }

    public void B(String str, n6.c cVar) {
        int i7 = this.b + 1;
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        int i10 = i7 + i7;
        if (i10 > length) {
            if (i10 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            this.c = Arrays.copyOf(objArr, i11);
        }
        Object[] objArr2 = (Object[]) this.c;
        int i12 = this.b;
        int i13 = i12 + i12;
        objArr2[i13] = str;
        objArr2[i13 + 1] = cVar;
        this.b = i12 + 1;
    }

    public void C(String str, com.google.android.gms.common.api.internal.k kVar) {
        Map map = (Map) this.c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(org.telegram.ui.Cells.f1.n("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
        }
        map.put(str, kVar);
        if (this.b > 0) {
            new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 4).post(new a9.h(this, kVar, str, false, 1));
        }
    }

    public void D(Bundle bundle) {
        this.b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            ((com.google.android.gms.common.api.internal.k) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public byte[] E() {
        q0 q0Var;
        na.d dVar;
        c8.y yVar;
        na.d dVar2;
        y7.j jVar;
        na.d dVar3;
        switch (this.a) {
            case 0:
                bb bbVar = bb.c;
                b8 b8Var = (b8) this.c;
                ((s9) this.d).h = false;
                s9 s9Var = (s9) this.d;
                s9Var.f = Boolean.FALSE;
                b8Var.a = new t9(s9Var);
                try {
                    bb.b();
                    c8 c8Var = new c8(b8Var);
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(1);
                    bbVar.a(a0Var);
                    HashMap hashMap = new HashMap((HashMap) a0Var.b);
                    HashMap hashMap2 = new HashMap((HashMap) a0Var.c);
                    o0 o0Var = (o0) a0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        q0Var = new q0(byteArrayOutputStream, hashMap, hashMap2, o0Var);
                        dVar = (na.d) hashMap.get(c8.class);
                    } catch (IOException unused) {
                    }
                    if (dVar == null) {
                        throw new na.b("No encoder for ".concat(String.valueOf(c8.class)));
                    }
                    dVar.a(c8Var, q0Var);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 1:
            default:
                y7.h9 h9Var = y7.h9.c;
                ab.b0 b0Var = (ab.b0) this.c;
                ((s9) this.d).h = false;
                s9 s9Var2 = (s9) this.d;
                s9Var2.f = Boolean.FALSE;
                b0Var.b = new y7.i8(s9Var2);
                try {
                    y7.h9.b();
                    y7.o6 o6Var = new y7.o6(b0Var);
                    hy0 hy0Var = new hy0(27);
                    h9Var.a(hy0Var);
                    HashMap hashMap3 = new HashMap((HashMap) hy0Var.b);
                    HashMap hashMap4 = new HashMap((HashMap) hy0Var.c);
                    y7.i iVar = (y7.i) hy0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        jVar = new y7.j(byteArrayOutputStream2, hashMap3, hashMap4, iVar);
                        dVar3 = (na.d) hashMap3.get(y7.o6.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar3 == null) {
                        throw new na.b("No encoder for ".concat(String.valueOf(y7.o6.class)));
                    }
                    dVar3.a(o6Var, jVar);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
            case 2:
                xf xfVar = xf.c;
                ga.d dVar4 = (ga.d) this.c;
                ((s9) this.d).h = false;
                s9 s9Var3 = (s9) this.d;
                s9Var3.f = Boolean.FALSE;
                dVar4.b = new ue(s9Var3);
                try {
                    xf.b();
                    c8.gb gbVar = new c8.gb(dVar4);
                    android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(14);
                    xfVar.a(a0Var2);
                    HashMap hashMap5 = new HashMap((HashMap) a0Var2.b);
                    HashMap hashMap6 = new HashMap((HashMap) a0Var2.c);
                    c8.x xVar = (c8.x) a0Var2.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new c8.y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar2 = (na.d) hashMap5.get(c8.gb.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar2 == null) {
                        throw new na.b("No encoder for ".concat(String.valueOf(c8.gb.class)));
                    }
                    dVar2.a(gbVar, yVar);
                    return byteArrayOutputStream3.toByteArray();
                } catch (UnsupportedEncodingException e12) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
                }
        }
    }

    public void F(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((com.google.android.gms.common.api.internal.k) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // f3.i
    public void M() {
        switch (this.a) {
            case 12:
                break;
            default:
                h2.x xVar = (h2.x) this.d;
                byte[] bArr = h2.m0.b;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                break;
        }
    }

    @Override // f3.i
    public f3.h a(f3.p pVar, long j3) {
        long j10;
        switch (this.a) {
            case 12:
                long position = pVar.getPosition();
                long k10 = k(pVar);
                long l10 = pVar.l();
                pVar.m(Math.max(6, ((f3.u) this.c).c));
                long k11 = k(pVar);
                return (k10 > j3 || k11 <= j3) ? k11 <= j3 ? new f3.h(k11, -2, pVar.l()) : new f3.h(k10, -1, position) : new f3.h(-9223372036854775807L, 0, l10);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                h2.x xVar = (h2.x) this.d;
                xVar.K(min);
                pVar.b(0, min, xVar.a);
                int i7 = xVar.c;
                long j11 = -1;
                long j12 = -1;
                long j13 = -9223372036854775807L;
                while (true) {
                    if (xVar.a() >= 188) {
                        byte[] bArr = xVar.a;
                        int i10 = xVar.b;
                        while (true) {
                            if (i10 < i7) {
                                j10 = -9223372036854775807L;
                                if (bArr[i10] != 71) {
                                    i10++;
                                }
                            } else {
                                j10 = -9223372036854775807L;
                            }
                        }
                        int i11 = i10 + qs.S2;
                        if (i11 <= i7) {
                            long a10 = c8.o9.a(xVar, i10, this.b);
                            if (a10 != j10) {
                                long b10 = ((h2.k0) this.c).b(a10);
                                if (b10 > j3) {
                                    return j13 == j10 ? new f3.h(b10, -1, position2) : new f3.h(-9223372036854775807L, 0, position2 + j12);
                                }
                                if (100000 + b10 > j3) {
                                    return new f3.h(-9223372036854775807L, 0, position2 + i10);
                                }
                                j13 = b10;
                                j12 = i10;
                            }
                            xVar.N(i11);
                            j11 = i11;
                        }
                    } else {
                        j10 = -9223372036854775807L;
                    }
                }
                return j13 != j10 ? new f3.h(j13, -2, position2 + j11) : f3.h.d;
        }
    }

    public void b(int i7, int i10) {
        int i11 = (i10 << 16) + i7;
        boolean z9 = this.b != i11;
        this.b = i11;
        for (int i12 = 0; i12 < bg.i.y; i12++) {
            if (z9 || ((Bitmap[]) this.d)[i12] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i12];
                if (bitmap != null) {
                    Utilities.e.c(new a3.f(bitmap, 12));
                }
                ((Bitmap[]) this.d)[i12] = Bitmap.createBitmap(i10, i7, Bitmap.Config.ARGB_8888);
            }
            bg.d0[] d0VarArr = (bg.d0[]) this.c;
            if (d0VarArr[i12] == null) {
                d0VarArr[i12] = new bg.d0(i10 * i7 * 2);
            }
        }
    }

    public void c() {
        m.c3 c3Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m.m1.a(drawable);
        }
        if (drawable == null || (c3Var = (m.c3) this.d) == null) {
            return;
        }
        m.r.d(drawable, c3Var, imageView.getDrawableState());
    }

    public h9.y1 d(boolean z9) {
        h9.k0 k0Var;
        h9.k0 k0Var2;
        if (z9 && (k0Var2 = (h9.k0) this.d) != null) {
            throw k0Var2.a();
        }
        h9.y1 g10 = h9.y1.g(this.b, (Object[]) this.c, this);
        if (!z9 || (k0Var = (h9.k0) this.d) == null) {
            return g10;
        }
        throw k0Var.a();
    }

    public h9.l0 e() {
        return d(false);
    }

    public void f(int i7) {
        int i10 = this.b;
        if (i7 == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        sb2.append(i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        sb2.append(" expected, but got ");
        sb2.append(i7 != 0 ? i7 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb2.toString());
    }

    public void i(h2.j jVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            x2.j0 j0Var = (x2.j0) it.next();
            h2.m0.W(j0Var.a, new u9.f(27, jVar, j0Var.b));
        }
    }

    public void j(int i7, e2.u uVar, int i10, Object obj, long j3) {
        i(new org.telegram.ui.web.a0(24, this, new x2.c0(1, i7, uVar, i10, obj, h2.m0.h0(j3), -9223372036854775807L)));
    }

    public long k(f3.p pVar) {
        int i7;
        f3.s sVar = (f3.s) this.d;
        f3.u uVar = (f3.u) this.c;
        while (pVar.l() < pVar.getLength() - 6) {
            int i10 = this.b;
            long l10 = pVar.l();
            h2.x xVar = new h2.x(17);
            int i11 = 0;
            boolean a10 = false;
            pVar.b(0, 2, xVar.a);
            if (xVar.g(0, ByteOrder.BIG_ENDIAN) != i10) {
                pVar.q();
                pVar.m((int) (l10 - pVar.getPosition()));
            } else {
                byte[] bArr = xVar.a;
                while (i11 < 15 && (i7 = pVar.i(2 + i11, 15 - i11, bArr)) != -1) {
                    i11 += i7;
                }
                xVar.M(i11 + 2);
                pVar.q();
                pVar.m((int) (l10 - pVar.getPosition()));
                a10 = f3.b.a(xVar, uVar, i10, sVar);
            }
            if (a10) {
                break;
            }
            pVar.m(1);
        }
        if (pVar.l() < pVar.getLength() - 6) {
            return sVar.a;
        }
        pVar.m((int) (pVar.getLength() - pVar.l()));
        return uVar.j;
    }

    public Object l(int i7) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i10 = this.b;
            if (i10 <= 0 || i7 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i7 >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    public String m() {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = this.b + 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = ((Object[]) this.c)[i10];
            if (obj instanceof me.d) {
                me.d dVar = (me.d) obj;
                if (!kotlin.jvm.internal.j.a(dVar.e(), me.f.c)) {
                    int i11 = ((int[]) this.d)[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(dVar.g(i11));
                    }
                } else if (((int[]) this.d)[i10] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.d)[i10]);
                    sb2.append("]");
                }
            } else if (obj != qe.g.a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "toString(...)");
        return sb3;
    }

    public boolean n() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void o(x2.u uVar, int i7, int i10, e2.u uVar2, int i11, Object obj, long j3, long j10) {
        i(new x2.i0(this, uVar, new x2.c0(i7, i10, uVar2, i11, obj, h2.m0.h0(j3), h2.m0.h0(j10)), 1));
    }

    @Override // m9.t
    public void onSuccess(Object obj) {
        List list = (List) obj;
        p4.d0 d0Var = ((p4.m0) this.d).h;
        Handler handler = d0Var.l;
        p4.v vVar = (p4.v) this.c;
        h2.m0.W(handler, new org.telegram.ui.web.w(d0Var, vVar, new pp0(this, this.b, list, vVar, 21)));
    }

    public void p(x2.u uVar, int i7, int i10, e2.u uVar2, int i11, Object obj, long j3, long j10) {
        i(new x2.i0(this, uVar, new x2.c0(i7, i10, uVar2, i11, obj, h2.m0.h0(j3), h2.m0.h0(j10)), 0));
    }

    public void q(x2.u uVar, int i7, int i10, e2.u uVar2, int i11, Object obj, long j3, long j10, IOException iOException, boolean z9) {
        i(new yl(this, uVar, new x2.c0(i7, i10, uVar2, i11, obj, h2.m0.h0(j3), h2.m0.h0(j10)), iOException, z9));
    }

    public void r(x2.u uVar, int i7, IOException iOException, boolean z9) {
        q(uVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z9);
    }

    public void s(AttributeSet attributeSet, int i7) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) x10.c;
        r0.i0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) x10.c, i7);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = b5.a.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m.m1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(x10.o(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(m.m1.b(typedArray.getInt(3, -1), null));
            }
            x10.C();
        } catch (Throwable th2) {
            x10.C();
            throw th2;
        }
    }

    public void t(x2.u uVar, int i7, int i10, e2.u uVar2, int i11, Object obj, long j3, long j10, int i12) {
        i(new bg.f0(this, uVar, new x2.c0(i7, i10, uVar2, i11, obj, h2.m0.h0(j3), h2.m0.h0(j10)), i12, 11));
    }

    public String toString() {
        switch (this.a) {
            case 21:
                return m();
            default:
                return super.toString();
        }
    }

    public wa v(Object obj, Object obj2) {
        int i7 = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i7 > objArr.length) {
            this.c = Arrays.copyOf(objArr, h9.c0.b(objArr.length, i7));
        }
        h9.o.f(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i10 = this.b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.b = i10 + 1;
        return this;
    }

    public wa w(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, h9.c0.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            v(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void x(int i7) {
        y(i7, 200L, xq.f);
    }

    public void y(int i7, long j3, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i7);
        this.c = ofInt;
        ofInt.addUpdateListener(new de(24, this, iArr));
        ((ValueAnimator) this.c).addListener(new bi.y4(this, i7, iArr, 2));
        ((ValueAnimator) this.c).setDuration(j3);
        ((ValueAnimator) this.c).setInterpolator(interpolator);
        ((ValueAnimator) this.c).start();
    }

    public List z(CharSequence charSequence) {
        charSequence.getClass();
        d6.i iVar = (d6.i) this.d;
        iVar.getClass();
        g9.t tVar = new g9.t(iVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (tVar.hasNext()) {
            arrayList.add((String) tVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public wa(int i7, int i10) {
        this.a = i10;
        switch (i10) {
            case 10:
                this.c = new Object[i7 * 2];
                this.b = 0;
                break;
            default:
                this.b = i7;
                break;
        }
    }

    public wa(int i7, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 7;
        this.b = i7;
        this.d = str;
        this.c = arrayList;
    }

    public wa(b8 b8Var, int i7) {
        this.a = 0;
        this.d = new s9();
        this.c = b8Var;
        bb.b();
        this.b = i7;
    }

    public wa(ab.b0 b0Var, int i7) {
        this.a = 27;
        this.d = new s9();
        this.c = b0Var;
        y7.h9.b();
        this.b = i7;
    }

    public wa(ga.d dVar, int i7) {
        this.a = 2;
        this.d = new s9();
        this.c = dVar;
        xf.b();
        this.b = i7;
    }

    public wa(pj0 pj0Var) {
        this.a = 19;
        this.d = pj0Var;
    }

    public wa(ByteBuffer byteBuffer, int i7, RectF rectF) {
        this.a = 22;
        this.c = rectF;
        this.b = i7;
        try {
            this.d = File.createTempFile("paint", ".bin", org.telegram.messenger.t0.b.getCacheDir());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    private final /* synthetic */ void u() {
    }

    @Override // m9.t
    public void h(Throwable th2) {
    }

    public wa(ImageView imageView) {
        this.a = 13;
        this.b = 0;
        this.c = imageView;
    }

    public wa(v0.j jVar) {
        this.a = 26;
        this.c = new SparseArray();
        this.d = jVar;
        this.b = -1;
    }

    public wa(Shader shader, ColorStateList colorStateList, int i7) {
        this.a = 9;
        this.c = shader;
        this.d = colorStateList;
        this.b = i7;
    }

    public wa(String str) {
        this.a = 6;
        this.c = str;
        this.d = null;
        this.b = 0;
    }

    public wa(f3.u uVar, int i7) {
        this.a = 12;
        this.c = uVar;
        this.b = i7;
        this.d = new f3.s();
    }

    public wa(int i7, h2.k0 k0Var) {
        this.a = 15;
        this.b = i7;
        this.c = k0Var;
        this.d = new h2.x();
    }

    public wa(byte[] bArr) {
        this.a = 6;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.c = null;
        this.b = 1;
    }

    public wa(j2.g gVar) {
        this.a = 16;
        bg.w0 w0Var = new bg.w0();
        w0Var.c = new w7.s(5, false);
        w0Var.b = 3;
        this.d = w0Var;
        this.c = gVar;
        this.b = 1;
    }

    public wa(d6.i iVar) {
        this.a = 8;
        g9.b bVar = g9.b.f;
        this.d = iVar;
        this.c = bVar;
        this.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public wa(CopyOnWriteArrayList copyOnWriteArrayList, int i7, x2.g0 g0Var) {
        this.a = 25;
        this.d = copyOnWriteArrayList;
        this.b = i7;
        this.c = g0Var;
    }

    public wa(int i7, byte b10) {
        this.a = i7;
        switch (i7) {
            case 3:
                this.c = DesugarCollections.synchronizedMap(new a0.f(0));
                this.b = 0;
                break;
            case 17:
                this.c = new ih.a();
                break;
            case 24:
                this.c = new Object[8];
                this.b = 0;
                break;
            default:
                int i10 = bg.i.y;
                this.c = new bg.d0[i10];
                this.d = new Bitmap[i10];
                break;
        }
    }

    public wa(e2.u uVar, int i7, String str) {
        this.a = 14;
        this.c = uVar;
        this.b = i7;
        this.d = str;
    }

    public wa(p4.m0 m0Var, p4.v vVar, int i7) {
        this.a = 20;
        this.d = m0Var;
        this.c = vVar;
        this.b = i7;
    }
}
