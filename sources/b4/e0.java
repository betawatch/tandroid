package b4;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.animation.Interpolator;
import com.google.android.gms.common.api.internal.s1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j3.n1;
import j7.f8;
import j7.g8;
import j7.h9;
import j7.n6;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
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
import k7.b7;
import k7.u6;
import l7.j0;
import l7.o9;
import l7.oa;
import l7.v7;
import l7.w0;
import lh.k3;
import lh.p6;
import m.s3;
import n7.ag;
import n7.jb;
import n7.xe;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.sl0;
import org.xmlpull.v1.XmlPullParserException;
import s8.n0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e0 implements r3.e {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public /* synthetic */ e0(char c3, int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e8, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e0, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e2, code lost:
    
        r0 = new f7.b(r13, r7);
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
    
        return new b4.e0(r11, (android.content.res.ColorStateList) null, 0);
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
    
        r0 = new f7.b(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
    
        r0 = new f7.b(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e0 e(Resources resources, int i10, Resources.Theme theme) {
        int next;
        float f10;
        int i11;
        float f11;
        int i12;
        float f12;
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
                return new e0((Shader) null, b10, b10.getDefaultColor());
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
        int i13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", TeXSymbolParser.TYPE_ATTR) != null ? f13.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f13.getColor(0, 0) : 0;
        boolean z4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f13.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f10 = f14;
            i11 = f13.getColor(1, 0);
        } else {
            f10 = f14;
            i11 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f11 = f15;
            i12 = f13.getInt(6, 0);
        } else {
            f11 = f15;
            i12 = 0;
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

    public void A(o4.r rVar) {
        o4.v vVar = (o4.v) this.c;
        vVar.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.a, new androidx.car.app.utils.c(this, yVar.b, vVar, rVar, 16));
        }
    }

    public void B(String str, y5.c cVar) {
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

    public void C(String str, com.google.android.gms.common.api.internal.l lVar) {
        Map map = (Map) this.c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(android.support.v4.media.a.o("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lVar);
        if (this.b > 0) {
            new a7.e(Looper.getMainLooper(), 0).post(new s1(this, lVar, str, 0));
        }
    }

    public byte[] D() {
        j7.k kVar;
        u9.d dVar;
        j0 j0Var;
        u9.d dVar2;
        n7.y yVar;
        u9.d dVar3;
        switch (this.a) {
            case 10:
                h9 h9Var = h9.c;
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.c;
                ((f8) this.d).h = false;
                f8 f8Var = (f8) this.d;
                f8Var.f = Boolean.FALSE;
                rVar.b = new g8(f8Var);
                try {
                    h9.b();
                    n6 n6Var = new n6(rVar);
                    androidx.biometric.e eVar = new androidx.biometric.e(20);
                    h9Var.a(eVar);
                    HashMap hashMap = new HashMap((HashMap) eVar.b);
                    HashMap hashMap2 = new HashMap((HashMap) eVar.c);
                    j7.j jVar = (j7.j) eVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar = new j7.k(byteArrayOutputStream, hashMap, hashMap2, jVar);
                        dVar = (u9.d) hashMap.get(n6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar == null) {
                        throw new u9.b("No encoder for ".concat(String.valueOf(n6.class)));
                    }
                    dVar.a(n6Var, kVar);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 11:
            default:
                ag agVar = ag.c;
                s3 s3Var = (s3) this.c;
                ((f8) this.d).h = false;
                f8 f8Var2 = (f8) this.d;
                f8Var2.f = Boolean.FALSE;
                s3Var.a = new xe(f8Var2);
                try {
                    ag.b();
                    jb jbVar = new jb(s3Var);
                    w0 w0Var = new w0(7);
                    agVar.a(w0Var);
                    HashMap hashMap3 = new HashMap((HashMap) w0Var.b);
                    HashMap hashMap4 = new HashMap((HashMap) w0Var.c);
                    n7.x xVar = (n7.x) w0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        yVar = new n7.y(byteArrayOutputStream2, hashMap3, hashMap4, xVar);
                        dVar3 = (u9.d) hashMap3.get(jb.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar3 == null) {
                        throw new u9.b("No encoder for ".concat(String.valueOf(jb.class)));
                    }
                    dVar3.a(jbVar, yVar);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e6) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e6);
                }
            case 12:
                oa oaVar = oa.c;
                a9.a aVar = (a9.a) this.c;
                ((f8) this.d).h = false;
                f8 f8Var3 = (f8) this.d;
                f8Var3.f = Boolean.FALSE;
                aVar.a = new o9(f8Var3);
                try {
                    oa.b();
                    v7 v7Var = new v7(aVar);
                    androidx.biometric.e eVar2 = new androidx.biometric.e(29);
                    oaVar.a(eVar2);
                    HashMap hashMap5 = new HashMap((HashMap) eVar2.b);
                    HashMap hashMap6 = new HashMap((HashMap) eVar2.c);
                    l7.i0 i0Var = (l7.i0) eVar2.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        j0Var = new j0(byteArrayOutputStream3, hashMap5, hashMap6, i0Var);
                        dVar2 = (u9.d) hashMap5.get(v7.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar2 == null) {
                        throw new u9.b("No encoder for ".concat(String.valueOf(v7.class)));
                    }
                    dVar2.a(v7Var, j0Var);
                    return byteArrayOutputStream3.toByteArray();
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
        }
    }

    public void E(Bundle bundle) {
        this.b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            ((com.google.android.gms.common.api.internal.l) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void F(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((com.google.android.gms.common.api.internal.l) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public void a(int i10, int i11) {
        int i12 = (i11 << 16) + i10;
        boolean z4 = this.b != i12;
        this.b = i12;
        for (int i13 = 0; i13 < lf.g.y; i13++) {
            if (z4 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new ef.e(bitmap, 28));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            lf.c0[] c0VarArr = (lf.c0[]) this.c;
            if (c0VarArr[i13] == null) {
                c0VarArr[i13] = new lf.c0(i11 * i10 * 2);
            }
        }
    }

    public ea.b b() {
        if ("".isEmpty()) {
            return new ea.b((String) this.c, ((Long) this.d).longValue(), this.b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019b  */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0 c() {
        char c3;
        char c10;
        char c11;
        short[] sArr;
        boolean z4;
        n0 n0Var;
        s8.w wVar = (s8.w) this.d;
        if (wVar != null) {
            throw wVar.a();
        }
        int i10 = this.b;
        Object[] objArr = (Object[]) this.c;
        if (i10 == 0) {
            n0Var = n0.h;
        } else {
            int i11 = 1;
            Object obj = null;
            if (i10 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                n0Var = new n0(null, objArr, 1);
            } else {
                b7.d(i10, objArr.length >> 1);
                int s6 = s8.z.s(i10);
                if (i10 == 1) {
                    Objects.requireNonNull(objArr[0]);
                    Objects.requireNonNull(objArr[1]);
                    c3 = 1;
                    c10 = 0;
                } else {
                    int i12 = s6 - 1;
                    if (s6 <= 128) {
                        byte[] bArr = new byte[s6];
                        Arrays.fill(bArr, (byte) -1);
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < i10) {
                            int i15 = i13 * 2;
                            int i16 = i14 * 2;
                            Object obj2 = objArr[i15];
                            Objects.requireNonNull(obj2);
                            Object obj3 = objArr[i15 ^ i11];
                            Objects.requireNonNull(obj3);
                            int m9 = s8.l.m(obj2.hashCode());
                            while (true) {
                                int i17 = m9 & i12;
                                int i18 = bArr[i17] & 255;
                                if (i18 == 255) {
                                    bArr[i17] = (byte) i16;
                                    if (i14 < i13) {
                                        objArr[i16] = obj2;
                                        objArr[i16 ^ 1] = obj3;
                                    }
                                    i14++;
                                } else {
                                    if (obj2.equals(objArr[i18])) {
                                        int i19 = i18 ^ 1;
                                        Object obj4 = objArr[i19];
                                        Objects.requireNonNull(obj4);
                                        obj = new s8.w(obj2, obj3, obj4);
                                        objArr[i19] = obj3;
                                        break;
                                    }
                                    m9 = i17 + 1;
                                }
                            }
                            i13++;
                            i11 = 1;
                        }
                        c3 = 1;
                        c10 = 0;
                        if (i14 == i10) {
                            obj = bArr;
                        } else {
                            sArr = new Object[]{bArr, Integer.valueOf(i14), obj};
                            obj = sArr;
                        }
                    } else {
                        c3 = 1;
                        c10 = 0;
                        if (s6 <= 32768) {
                            sArr = new short[s6];
                            Arrays.fill(sArr, (short) -1);
                            int i20 = 0;
                            for (int i21 = 0; i21 < i10; i21++) {
                                int i22 = i21 * 2;
                                int i23 = i20 * 2;
                                Object obj5 = objArr[i22];
                                Objects.requireNonNull(obj5);
                                Object obj6 = objArr[i22 ^ 1];
                                Objects.requireNonNull(obj6);
                                int m10 = s8.l.m(obj5.hashCode());
                                while (true) {
                                    int i24 = m10 & i12;
                                    int i25 = sArr[i24] & 65535;
                                    if (i25 == 65535) {
                                        sArr[i24] = (short) i23;
                                        if (i20 < i21) {
                                            objArr[i23] = obj5;
                                            objArr[i23 ^ 1] = obj6;
                                        }
                                        i20++;
                                    } else {
                                        if (obj5.equals(objArr[i25])) {
                                            int i26 = i25 ^ 1;
                                            Object obj7 = objArr[i26];
                                            Objects.requireNonNull(obj7);
                                            obj = new s8.w(obj5, obj6, obj7);
                                            objArr[i26] = obj6;
                                            break;
                                        }
                                        m10 = i24 + 1;
                                    }
                                }
                            }
                            if (i20 != i10) {
                                obj = new Object[]{sArr, Integer.valueOf(i20), obj};
                            }
                            obj = sArr;
                        } else {
                            int[] iArr = new int[s6];
                            Arrays.fill(iArr, -1);
                            int i27 = 0;
                            for (int i28 = 0; i28 < i10; i28++) {
                                int i29 = i28 * 2;
                                int i30 = i27 * 2;
                                Object obj8 = objArr[i29];
                                Objects.requireNonNull(obj8);
                                Object obj9 = objArr[i29 ^ 1];
                                Objects.requireNonNull(obj9);
                                int m11 = s8.l.m(obj8.hashCode());
                                while (true) {
                                    int i31 = m11 & i12;
                                    int i32 = iArr[i31];
                                    if (i32 == -1) {
                                        iArr[i31] = i30;
                                        if (i27 < i28) {
                                            objArr[i30] = obj8;
                                            objArr[i30 ^ 1] = obj9;
                                        }
                                        i27++;
                                    } else {
                                        if (obj8.equals(objArr[i32])) {
                                            int i33 = i32 ^ 1;
                                            Object obj10 = objArr[i33];
                                            Objects.requireNonNull(obj10);
                                            obj = new s8.w(obj8, obj9, obj10);
                                            objArr[i33] = obj9;
                                            break;
                                        }
                                        m11 = i31 + 1;
                                    }
                                }
                            }
                            c11 = 2;
                            obj = i27 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i27), obj};
                            z4 = obj instanceof Object[];
                            Object obj11 = obj;
                            if (z4) {
                                Object[] objArr2 = (Object[]) obj;
                                this.d = (s8.w) objArr2[c11];
                                Object obj12 = objArr2[c10];
                                int intValue = ((Integer) objArr2[c3]).intValue();
                                objArr = Arrays.copyOf(objArr, intValue * 2);
                                obj11 = obj12;
                                i10 = intValue;
                            }
                            n0Var = new n0(obj11, objArr, i10);
                        }
                    }
                }
                c11 = 2;
                z4 = obj instanceof Object[];
                Object obj112 = obj;
                if (z4) {
                }
                n0Var = new n0(obj112, objArr, i10);
            }
        }
        s8.w wVar2 = (s8.w) this.d;
        if (wVar2 == null) {
            return n0Var;
        }
        throw wVar2.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        if (r13 == r16) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fc, code lost:
    
        r11 = new r3.d(-2, r13, r5 + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0107, code lost:
    
        return r3.d.d;
     */
    @Override // r3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r3.d d(r3.l lVar, long j10) {
        long j11;
        switch (this.a) {
            case 0:
                long position = lVar.getPosition();
                int min = (int) Math.min(112800, lVar.getLength() - position);
                h5.w wVar = (h5.w) this.d;
                wVar.C(min);
                lVar.c(0, min, wVar.a);
                int i10 = wVar.c;
                long j12 = -1;
                long j13 = -1;
                long j14 = -9223372036854775807L;
                while (true) {
                    if (wVar.a() < 188) {
                        j11 = -9223372036854775807L;
                        break;
                    } else {
                        byte[] bArr = wVar.a;
                        int i11 = wVar.b;
                        while (true) {
                            if (i11 < i10) {
                                j11 = -9223372036854775807L;
                                if (bArr[i11] != 71) {
                                    i11++;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        int i12 = i11 + 188;
                        if (i12 > i10) {
                            break;
                        } else {
                            long a2 = j7.c0.a(wVar, i11, this.b);
                            if (a2 != j11) {
                                long b10 = ((h5.c0) this.c).b(a2);
                                if (b10 > j10) {
                                    if (j14 != j11) {
                                        r3.d dVar = new r3.d(0, -9223372036854775807L, position + j13);
                                        break;
                                    } else {
                                        return new r3.d(-1, b10, position);
                                    }
                                } else {
                                    if (100000 + b10 > j10) {
                                        return new r3.d(0, -9223372036854775807L, position + i11);
                                    }
                                    j14 = b10;
                                    j13 = i11;
                                }
                            }
                            wVar.F(i12);
                            j12 = i12;
                        }
                    }
                }
            default:
                long position2 = lVar.getPosition();
                long i13 = i(lVar);
                long i14 = lVar.i();
                lVar.n(Math.max(6, ((r3.o) this.c).c));
                long i15 = i(lVar);
                return (i13 > j10 || i15 <= j10) ? i15 <= j10 ? new r3.d(-2, i15, lVar.i()) : new r3.d(-1, i13, position2) : new r3.d(0, -9223372036854775807L, i14);
        }
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

    public void g(int i10, j3.n0 n0Var, int i11, Object obj, long j10) {
        h(new o4.r(1, i10, n0Var, i11, obj, h5.d0.S(j10), -9223372036854775807L));
    }

    public void h(o4.r rVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.a, new p6(this, yVar.b, rVar, 11));
        }
    }

    public long i(r3.l lVar) {
        int f10;
        org.telegram.ui.Components.jb jbVar = (org.telegram.ui.Components.jb) this.d;
        r3.o oVar = (r3.o) this.c;
        while (lVar.i() < lVar.getLength() - 6) {
            int i10 = this.b;
            long i11 = lVar.i();
            byte[] bArr = new byte[2];
            int i12 = 0;
            boolean a2 = false;
            lVar.c(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                lVar.t();
                lVar.n((int) (i11 - lVar.getPosition()));
            } else {
                h5.w wVar = new h5.w(16);
                System.arraycopy(bArr, 0, wVar.a, 0, 2);
                byte[] bArr2 = wVar.a;
                while (i12 < 14 && (f10 = lVar.f(2 + i12, 14 - i12, bArr2)) != -1) {
                    i12 += f10;
                }
                wVar.E(i12);
                lVar.t();
                lVar.n((int) (i11 - lVar.getPosition()));
                a2 = u6.a(wVar, oVar, i10, jbVar);
            }
            if (a2) {
                break;
            }
            lVar.n(1);
        }
        if (lVar.i() < lVar.getLength() - 6) {
            return jbVar.a;
        }
        lVar.n((int) (lVar.getLength() - lVar.i()));
        return oVar.j;
    }

    public Object j(int i10) {
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

    public boolean k() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void l(o4.j jVar, int i10, int i11, j3.n0 n0Var, int i12, Object obj, long j10, long j11) {
        m(jVar, new o4.r(i10, i11, n0Var, i12, obj, h5.d0.S(j10), h5.d0.S(j11)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o4.z] */
    public void m(o4.j jVar, o4.r rVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.a, new o4.x(this, yVar.b, jVar, rVar, 1));
        }
    }

    public void n(o4.j jVar, int i10, int i11, j3.n0 n0Var, int i12, Object obj, long j10, long j11) {
        p(jVar, new o4.r(i10, i11, n0Var, i12, obj, h5.d0.S(j10), h5.d0.S(j11)));
    }

    @Override // r3.e
    public void o() {
        switch (this.a) {
            case 0:
                h5.w wVar = (h5.w) this.d;
                byte[] bArr = h5.d0.f;
                wVar.getClass();
                wVar.D(bArr.length, bArr);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o4.z] */
    public void p(o4.j jVar, o4.r rVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.a, new o4.x(this, yVar.b, jVar, rVar, 0));
        }
    }

    public void q(o4.j jVar, int i10, int i11, j3.n0 n0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z4) {
        s(jVar, new o4.r(i10, i11, n0Var, i12, obj, h5.d0.S(j10), h5.d0.S(j11)), iOException, z4);
    }

    public void r(o4.j jVar, int i10, IOException iOException, boolean z4) {
        q(jVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z4);
    }

    public void s(o4.j jVar, o4.r rVar, IOException iOException, boolean z4) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.a, new n1(this, yVar.b, jVar, rVar, iOException, z4, 1));
        }
    }

    public void t(o4.j jVar, int i10, int i11, j3.n0 n0Var, int i12, Object obj, long j10, long j11) {
        u(jVar, new o4.r(i10, i11, n0Var, i12, obj, h5.d0.S(j10), h5.d0.S(j11)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o4.z] */
    public void u(o4.j jVar, o4.r rVar) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            o4.y yVar = (o4.y) it.next();
            h5.d0.K(yVar.a, new o4.x(this, yVar.b, jVar, rVar, 2));
        }
    }

    public void w(Object obj, Object obj2) {
        int i10 = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i10 > objArr.length) {
            this.c = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i10));
        }
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
        Object[] objArr2 = (Object[]) this.c;
        int i11 = this.b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.b = i11 + 1;
    }

    public void x(int i10) {
        y(i10, 200L, nr.f);
    }

    public void y(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.c = ofInt;
        ofInt.addUpdateListener(new ag.a(23, this, iArr));
        ((ValueAnimator) this.c).addListener(new k3(this, i10, iArr, 2));
        ((ValueAnimator) this.c).setDuration(j10);
        ((ValueAnimator) this.c).setInterpolator(interpolator);
        ((ValueAnimator) this.c).start();
    }

    public List z(CharSequence charSequence) {
        charSequence.getClass();
        qk0 qk0Var = (qk0) this.d;
        qk0Var.getClass();
        r8.h hVar = new r8.h(qk0Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public e0(int i10, int i11) {
        this.a = i11;
        switch (i11) {
            case 22:
                this.c = new Object[i10 * 2];
                this.b = 0;
                break;
            default:
                this.b = i10;
                break;
        }
    }

    public /* synthetic */ e0(Object obj, int i10, Serializable serializable, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = serializable;
    }

    public e0(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.c = new Object[8];
                this.b = 0;
                break;
            case 13:
                int i11 = lf.g.y;
                this.c = new lf.c0[i11];
                this.d = new Bitmap[i11];
                break;
            case 17:
                this.c = new tg.a();
                break;
            default:
                this.c = DesugarCollections.synchronizedMap(new a0.f(0));
                this.b = 0;
                break;
        }
    }

    public e0(a9.a aVar, int i10) {
        this.a = 12;
        this.d = new f8();
        this.c = aVar;
        oa.b();
        this.b = i10;
    }

    public e0(com.google.firebase.messaging.r rVar, int i10) {
        this.a = 10;
        this.d = new f8();
        this.c = rVar;
        h9.b();
        this.b = i10;
    }

    public e0(String str, String[] strArr) {
        String sb;
        this.a = 5;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.d = sb;
        this.c = str;
        int i10 = 2;
        b6.m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.c, i10)) {
            i10++;
        }
        this.b = i10;
    }

    private final /* synthetic */ void v() {
    }

    public e0(s3 s3Var, int i10) {
        this.a = 14;
        this.d = new f8();
        this.c = s3Var;
        ag.b();
        this.b = i10;
    }

    public e0(sl0 sl0Var) {
        this.a = 19;
        this.d = sl0Var;
    }

    public e0(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.a = 1;
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public e0(nh.e eVar) {
        this.a = 16;
        this.c = new SparseArray();
        this.d = eVar;
        this.b = -1;
    }

    public e0(Shader shader, ColorStateList colorStateList, int i10) {
        this.a = 7;
        this.c = shader;
        this.d = colorStateList;
        this.b = i10;
    }

    public e0(r3.o oVar, int i10) {
        this.a = 23;
        this.c = oVar;
        this.b = i10;
        this.d = new org.telegram.ui.Components.jb();
    }

    public e0(int i10, h5.c0 c0Var) {
        this.a = 0;
        this.b = i10;
        this.c = c0Var;
        this.d = new h5.w();
    }

    public e0(qk0 qk0Var) {
        this.a = 20;
        this.d = qk0Var;
        this.c = r8.c.a;
        this.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public e0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, o4.v vVar) {
        this.a = 15;
        this.d = copyOnWriteArrayList;
        this.b = i10;
        this.c = vVar;
    }
}
