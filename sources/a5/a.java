package a5;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.animation.Interpolator;
import b2.s;
import bi.k8;
import bi.t2;
import c3.h;
import c3.i;
import c3.p;
import c3.u;
import c5.v;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.c0;
import com.google.firebase.messaging.n;
import di.s7;
import e2.b0;
import e9.f1;
import e9.j0;
import e9.k0;
import e9.m0;
import fg.f;
import g2.g;
import i9.r;
import ia.d;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import ji.b5;
import m.p3;
import m2.t;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ua0;
import org.telegram.ui.web.g1;
import org.xmlpull.v1.XmlPullParserException;
import sg.p0;
import u2.f0;
import u2.h0;
import u2.i0;
import v7.a6;
import v7.c8;
import v7.d8;
import v7.d9;
import v7.j;
import v7.k6;
import v7.q8;
import v7.t6;
import x7.d0;
import x7.e0;
import x7.i9;
import x7.ia;
import x7.p7;
import yf.a0;
import yf.e;
import z7.ib;
import z7.we;
import z7.x;
import z7.y;
import z7.zf;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class a implements i, r {
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
    
        r0 = new pf.b(r13, r7);
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
    
        r0 = new pf.b(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
    
        r0 = new pf.b(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a e(Resources resources, int i10, Resources.Theme theme) {
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
                ColorStateList b10 = h0.c.b(resources, xml, asAttributeSet, theme);
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

    public void A(String str, l lVar) {
        Map map = (Map) this.c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(a4.a.p("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lVar);
        if (this.b > 0) {
            new c0(Looper.getMainLooper(), 4).post(new v(this, lVar, str, false, 5));
        }
    }

    public byte[] B() {
        j jVar;
        d dVar;
        e0 e0Var;
        d dVar2;
        y yVar;
        d dVar3;
        switch (this.a) {
            case 22:
                d9 d9Var = d9.c;
                f fVar = (f) this.c;
                ((c8) this.d).h = false;
                c8 c8Var = (c8) this.d;
                c8Var.f = Boolean.FALSE;
                fVar.a = new d8(c8Var);
                try {
                    d9.b();
                    k6 k6Var = new k6(fVar);
                    t tVar = new t(27);
                    d9Var.a(tVar);
                    HashMap hashMap = new HashMap((HashMap) tVar.b);
                    HashMap hashMap2 = new HashMap((HashMap) tVar.c);
                    v7.i iVar = (v7.i) tVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jVar = new j(byteArrayOutputStream, hashMap, hashMap2, iVar);
                        dVar = (d) hashMap.get(k6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar == null) {
                        throw new ia.b("No encoder for ".concat(String.valueOf(k6.class)));
                    }
                    dVar.a(k6Var, jVar);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e7) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
                }
            case 23:
            default:
                zf zfVar = zf.c;
                p3 p3Var = (p3) this.c;
                ((c8) this.d).h = false;
                c8 c8Var2 = (c8) this.d;
                c8Var2.f = Boolean.FALSE;
                p3Var.a = new we(c8Var2);
                try {
                    zf.b();
                    ib ibVar = new ib(p3Var);
                    a6 a6Var = new a6(10);
                    zfVar.a(a6Var);
                    HashMap hashMap3 = new HashMap((HashMap) a6Var.b);
                    HashMap hashMap4 = new HashMap((HashMap) a6Var.c);
                    x xVar = (x) a6Var.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        yVar = new y(byteArrayOutputStream2, hashMap3, hashMap4, xVar);
                        dVar3 = (d) hashMap3.get(ib.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar3 == null) {
                        throw new ia.b("No encoder for ".concat(String.valueOf(ib.class)));
                    }
                    dVar3.a(ibVar, yVar);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 24:
                ia iaVar = ia.c;
                n nVar = (n) this.c;
                ((c8) this.d).h = false;
                c8 c8Var3 = (c8) this.d;
                c8Var3.f = Boolean.FALSE;
                nVar.a = new i9(c8Var3);
                try {
                    ia.b();
                    p7 p7Var = new p7(nVar);
                    a6 a6Var2 = new a6(4);
                    iaVar.a(a6Var2);
                    HashMap hashMap5 = new HashMap((HashMap) a6Var2.b);
                    HashMap hashMap6 = new HashMap((HashMap) a6Var2.c);
                    d0 d0Var = (d0) a6Var2.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        e0Var = new e0(byteArrayOutputStream3, hashMap5, hashMap6, d0Var);
                        dVar2 = (d) hashMap5.get(p7.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar2 == null) {
                        throw new ia.b("No encoder for ".concat(String.valueOf(p7.class)));
                    }
                    dVar2.a(p7Var, e0Var);
                    return byteArrayOutputStream3.toByteArray();
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
        }
    }

    public void C(Bundle bundle) {
        this.b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            ((l) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void D(Bundle bundle) {
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
        for (int i13 = 0; i13 < e.y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new p0(bitmap, 14));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            a0[] a0VarArr = (a0[]) this.c;
            if (a0VarArr[i13] == null) {
                a0VarArr[i13] = new a0(i11 * i10 * 2);
            }
        }
    }

    public sa.b b() {
        if ("".isEmpty()) {
            return new sa.b((String) this.c, ((Long) this.d).longValue(), this.b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public k0 c() {
        f1 f1Var;
        j0 j0Var = (j0) this.d;
        if (j0Var != null) {
            throw j0Var.a();
        }
        int i10 = this.b;
        Object[] objArr = (Object[]) this.c;
        if (i10 == 0) {
            f1Var = f1.h;
        } else if (i10 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            f1Var = new f1(null, objArr, 1);
        } else {
            t6.e(i10, objArr.length >> 1);
            Object f7 = f1.f(objArr, i10, m0.t(i10), 0);
            if (f7 instanceof Object[]) {
                Object[] objArr2 = (Object[]) f7;
                this.d = (j0) objArr2[2];
                Object obj = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                f7 = obj;
                i10 = intValue;
            }
            f1Var = new f1(f7, objArr, i10);
        }
        j0 j0Var2 = (j0) this.d;
        if (j0Var2 == null) {
            return f1Var;
        }
        throw j0Var2.a();
    }

    public void d(int i10) {
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

    public void f(String str, Object... objArr) {
        if (this.b <= 3) {
            String str2 = (String) this.c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    @Override // c3.i
    public h g(p pVar, long j3) {
        long j10;
        switch (this.a) {
            case 8:
                long position = pVar.getPosition();
                long k10 = k(pVar);
                long k11 = pVar.k();
                pVar.l(Math.max(6, ((u) this.c).c));
                long k12 = k(pVar);
                return (k10 > j3 || k12 <= j3) ? k12 <= j3 ? new h(-2, k12, pVar.k()) : new h(-1, k10, position) : new h(0, -9223372036854775807L, k11);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                e2.v vVar = (e2.v) this.d;
                vVar.G(min);
                pVar.b(0, min, vVar.a);
                int i10 = vVar.c;
                long j11 = -1;
                long j12 = -1;
                long j13 = -9223372036854775807L;
                while (true) {
                    if (vVar.a() >= 188) {
                        byte[] bArr = vVar.a;
                        int i11 = vVar.b;
                        while (true) {
                            if (i11 < i10) {
                                j10 = -9223372036854775807L;
                                if (bArr[i11] != 71) {
                                    i11++;
                                }
                            } else {
                                j10 = -9223372036854775807L;
                            }
                        }
                        int i12 = i11 + 188;
                        if (i12 <= i10) {
                            long a2 = q8.a(vVar, i11, this.b);
                            if (a2 != j10) {
                                long b10 = ((b0) this.c).b(a2);
                                if (b10 > j3) {
                                    return j13 == j10 ? new h(-1, b10, position2) : new h(0, -9223372036854775807L, position2 + j12);
                                }
                                j13 = b10;
                                if (100000 + j13 > j3) {
                                    return new h(0, -9223372036854775807L, position2 + i11);
                                }
                                j12 = i11;
                            }
                            vVar.J(i12);
                            j11 = i12;
                        }
                    } else {
                        j10 = -9223372036854775807L;
                    }
                }
                return j13 != j10 ? new h(-2, j13, position2 + j11) : h.d;
        }
    }

    public void i(e2.h hVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            u2.j0 j0Var = (u2.j0) it.next();
            e2.d0.U(j0Var.a, new g1(23, hVar, j0Var.b));
        }
    }

    public void j(int i10, s sVar, int i11, Object obj, long j3) {
        i(new t2(11, this, new u2.b0(1, i10, sVar, i11, obj, e2.d0.e0(j3), -9223372036854775807L)));
    }

    public long k(p pVar) {
        int h;
        c3.s sVar = (c3.s) this.d;
        u uVar = (u) this.c;
        while (pVar.k() < pVar.getLength() - 6) {
            int i10 = this.b;
            long k10 = pVar.k();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean b10 = false;
            pVar.b(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                pVar.q();
                pVar.l((int) (k10 - pVar.getPosition()));
            } else {
                e2.v vVar = new e2.v(16);
                System.arraycopy(bArr, 0, vVar.a, 0, 2);
                byte[] bArr2 = vVar.a;
                while (i11 < 14 && (h = pVar.h(2 + i11, 14 - i11, bArr2)) != -1) {
                    i11 += h;
                }
                vVar.I(i11);
                pVar.q();
                pVar.l((int) (k10 - pVar.getPosition()));
                b10 = c3.b.b(vVar, uVar, i10, sVar);
            }
            if (b10) {
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

    public Object l(int i10) {
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

    public boolean m() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void n(u2.t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        i(new h0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), 1));
    }

    public void o(u2.t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10) {
        i(new h0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), 0));
    }

    @Override // i9.r
    public void onSuccess(Object obj) {
        List list = (List) obj;
        m4.a0 a0Var = ((m4.k0) this.d).g;
        Handler handler = a0Var.l;
        m4.r rVar = (m4.r) this.c;
        e2.d0.U(handler, new b5(a0Var, rVar, new k8(this, this.b, list, rVar, 6)));
    }

    public void p(u2.t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, IOException iOException, boolean z10) {
        i(new i0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), iOException, z10));
    }

    public void q(u2.t tVar, int i10, IOException iOException, boolean z10) {
        p(tVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void r(u2.t tVar, int i10, int i11, s sVar, int i12, Object obj, long j3, long j10, int i13) {
        i(new ua0(this, tVar, new u2.b0(i10, i11, sVar, i12, obj, e2.d0.e0(j3), e2.d0.e0(j10)), i13, 1));
    }

    public a t(Object obj, Object obj2) {
        int i10 = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i10 > objArr.length) {
            this.c = Arrays.copyOf(objArr, w.h(objArr.length, i10));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = (Object[]) this.c;
        int i11 = this.b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.b = i11 + 1;
        return this;
    }

    public void u(int i10) {
        v(i10, 200L, pr.f);
    }

    public void v(int i10, long j3, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.c = ofInt;
        ofInt.addUpdateListener(new ah.m0(25, this, iArr));
        ((ValueAnimator) this.c).addListener(new gi(this, i10, iArr, 1));
        ((ValueAnimator) this.c).setDuration(j3);
        ((ValueAnimator) this.c).setInterpolator(interpolator);
        ((ValueAnimator) this.c).start();
    }

    @Override // c3.i
    public void w() {
        switch (this.a) {
            case 8:
                break;
            default:
                e2.v vVar = (e2.v) this.d;
                byte[] bArr = e2.d0.b;
                vVar.getClass();
                vVar.H(bArr.length, bArr);
                break;
        }
    }

    public List x(CharSequence charSequence) {
        charSequence.getClass();
        xa.c cVar = (xa.c) this.d;
        cVar.getClass();
        d9.i iVar = new d9.i(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (iVar.hasNext()) {
            arrayList.add((String) iVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void y(int i10, long j3, long j10) {
        u2.b0 b0Var = new u2.b0(1, i10, null, 3, null, e2.d0.e0(j3), e2.d0.e0(j10));
        f0 f0Var = (f0) this.c;
        f0Var.getClass();
        i(new s7(this, f0Var, b0Var, 3));
    }

    public void z(String str, k6.c cVar) {
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
            case 13:
                this.c = new hh.a();
                break;
            case 19:
                this.c = new Object[8];
                this.b = 0;
                break;
            case 25:
                int i11 = e.y;
                this.c = new a0[i11];
                this.d = new Bitmap[i11];
                break;
            default:
                this.c = DesugarCollections.synchronizedMap(new a0.f(0));
                this.b = 0;
                break;
        }
    }

    public a(n nVar, int i10) {
        this.a = 24;
        this.d = new c8();
        this.c = nVar;
        ia.b();
        this.b = i10;
    }

    public a(f fVar, int i10) {
        this.a = 22;
        this.d = new c8();
        this.c = fVar;
        d9.b();
        this.b = i10;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.a = 16;
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

    private final /* synthetic */ void s() {
    }

    @Override // i9.r
    public void h(Throwable th2) {
    }

    public a(p3 p3Var, int i10) {
        this.a = 26;
        this.d = new c8();
        this.c = p3Var;
        zf.b();
        this.b = i10;
    }

    public a(ll0 ll0Var) {
        this.a = 15;
        this.d = ll0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.a = 17;
        this.c = rectF;
        this.b = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e7) {
            FileLog.e(e7);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public a(org.telegram.ui.web.n nVar) {
        this.a = 21;
        this.c = new SparseArray();
        this.d = nVar;
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
        this.d = new c3.s();
    }

    public a(int i10, b0 b0Var) {
        this.a = 10;
        this.b = i10;
        this.c = b0Var;
        this.d = new e2.v();
    }

    public a(byte[] bArr) {
        this.a = 0;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.c = null;
        this.b = 1;
    }

    public a(g gVar) {
        this.a = 11;
        b2.p pVar = new b2.p(6);
        pVar.c = new rb.a(28);
        this.d = pVar;
        this.c = gVar;
        this.b = 1;
    }

    public a(xa.c cVar) {
        this.a = 4;
        this.d = cVar;
        this.c = d9.c.a;
        this.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public a(m4.k0 k0Var, m4.r rVar, int i10) {
        this.a = 12;
        this.d = k0Var;
        this.c = rVar;
        this.b = i10;
    }
}
