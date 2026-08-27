package b6;

import a0.f;
import a9.p;
import ag.t2;
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
import c2.t0;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.gms.common.api.internal.q1;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.t;
import d5.f0;
import d5.g0;
import d5.z;
import f2.r;
import g7.e8;
import g7.f8;
import g7.g9;
import g7.j;
import g7.k;
import g7.m6;
import gf.d0;
import gf.h;
import h0.b;
import h0.c;
import h7.z7;
import hh.l3;
import i7.i0;
import i7.j0;
import i7.n9;
import i7.na;
import i7.u7;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j4.w0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.Deflater;
import k7.ib;
import k7.we;
import k7.x;
import k7.y;
import k7.zf;
import m.t3;
import m3.d;
import m3.e;
import m3.l;
import m3.n;
import m5.o;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zk0;
import org.xmlpull.v1.XmlPullParserException;
import p8.a0;
import p8.c0;
import p8.q0;
import p8.w;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements e {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
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
    
        r0 = new g5.b(r13, r7);
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
    
        return new b6.a(r11, (android.content.res.ColorStateList) null, 0);
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
    
        r0 = new g5.b(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
    
        r0 = new g5.b(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a d(Resources resources, int i10, Resources.Theme theme) {
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
                ColorStateList b10 = c.b(resources, xml, asAttributeSet, theme);
                return new a((Shader) null, b10, b10.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f13 = b.f(resources, theme, asAttributeSet, d0.a.d);
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? f13.getFloat(8, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f13.getFloat(9, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f13.getFloat(10, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f13.getFloat(11, 0.0f) : 0.0f;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? f13.getFloat(3, 0.0f) : 0.0f;
        float f19 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f13.getFloat(4, 0.0f) : 0.0f;
        int i13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", TeXSymbolParser.TYPE_ATTR) != null ? f13.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f13.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
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
                TypedArray f23 = b.f(resources, theme, asAttributeSet, d0.a.e);
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

    @Override // m3.e
    public d P1(l lVar, long j10) {
        long j11;
        switch (this.a) {
            case 20:
                long position = lVar.getPosition();
                long f10 = f(lVar);
                long i10 = lVar.i();
                lVar.j(Math.max(6, ((FlacStreamMetadata) this.b).minFrameSize));
                long f11 = f(lVar);
                return (f10 > j10 || f11 <= j10) ? f11 <= j10 ? new d(-2, f11, lVar.i()) : new d(-1, f10, position) : new d(0, -9223372036854775807L, i10);
            default:
                long position2 = lVar.getPosition();
                int min = (int) Math.min(112800, lVar.getLength() - position2);
                z zVar = (z) this.d;
                zVar.z(min);
                lVar.b(0, min, zVar.a);
                int i11 = zVar.c;
                long j12 = -1;
                long j13 = -1;
                long j14 = -9223372036854775807L;
                while (true) {
                    if (zVar.a() >= 188) {
                        byte[] bArr = zVar.a;
                        int i12 = zVar.b;
                        while (true) {
                            if (i12 < i11) {
                                j11 = -9223372036854775807L;
                                if (bArr[i12] != 71) {
                                    i12++;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        int i13 = i12 + 188;
                        if (i13 <= i11) {
                            long a2 = z7.a(zVar, i12, this.c);
                            if (a2 != j11) {
                                long b10 = ((f0) this.b).b(a2);
                                if (b10 > j10) {
                                    return j14 == j11 ? new d(-1, b10, position2) : new d(0, -9223372036854775807L, position2 + j13);
                                }
                                j14 = b10;
                                if (100000 + j14 > j10) {
                                    return new d(0, -9223372036854775807L, position2 + i12);
                                }
                                j13 = i12;
                            }
                            zVar.C(i13);
                            j12 = i13;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                }
                return j14 != j11 ? new d(-2, j14, position2 + j12) : d.d;
        }
    }

    public void a(int i10, int i11) {
        int i12 = (i11 << 16) + i10;
        boolean z10 = this.c != i12;
        this.c = i12;
        for (int i13 = 0; i13 < h.y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new r(bitmap, 2));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            d0[] d0VarArr = (d0[]) this.b;
            if (d0VarArr[i13] == null) {
                d0VarArr[i13] = new d0(i11 * i10 * 2);
            }
        }
    }

    public ba.b b() {
        if ("".isEmpty()) {
            return new ba.b((String) this.b, ((Long) this.d).longValue(), this.c);
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
    public q0 c() {
        char c10;
        char c11;
        char c12;
        short[] sArr;
        boolean z10;
        q0 q0Var;
        a0 a0Var = (a0) this.d;
        if (a0Var != null) {
            throw a0Var.a();
        }
        int i10 = this.c;
        Object[] objArr = (Object[]) this.b;
        if (i10 == 0) {
            q0Var = q0.h;
        } else {
            int i11 = 1;
            Object obj = null;
            if (i10 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                q0Var = new q0(null, objArr, 1);
            } else {
                h7.f0.c(i10, objArr.length >> 1);
                int s10 = c0.s(i10);
                if (i10 == 1) {
                    Objects.requireNonNull(objArr[0]);
                    Objects.requireNonNull(objArr[1]);
                    c10 = 1;
                    c11 = 0;
                } else {
                    int i12 = s10 - 1;
                    if (s10 <= 128) {
                        byte[] bArr = new byte[s10];
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
                            int o10 = p8.l.o(obj2.hashCode());
                            while (true) {
                                int i17 = o10 & i12;
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
                                        obj = new a0(obj2, obj3, obj4);
                                        objArr[i19] = obj3;
                                        break;
                                    }
                                    o10 = i17 + 1;
                                }
                            }
                            i13++;
                            i11 = 1;
                        }
                        c10 = 1;
                        c11 = 0;
                        if (i14 == i10) {
                            obj = bArr;
                        } else {
                            sArr = new Object[]{bArr, Integer.valueOf(i14), obj};
                            obj = sArr;
                        }
                    } else {
                        c10 = 1;
                        c11 = 0;
                        if (s10 <= 32768) {
                            sArr = new short[s10];
                            Arrays.fill(sArr, (short) -1);
                            int i20 = 0;
                            for (int i21 = 0; i21 < i10; i21++) {
                                int i22 = i21 * 2;
                                int i23 = i20 * 2;
                                Object obj5 = objArr[i22];
                                Objects.requireNonNull(obj5);
                                Object obj6 = objArr[i22 ^ 1];
                                Objects.requireNonNull(obj6);
                                int o11 = p8.l.o(obj5.hashCode());
                                while (true) {
                                    int i24 = o11 & i12;
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
                                            obj = new a0(obj5, obj6, obj7);
                                            objArr[i26] = obj6;
                                            break;
                                        }
                                        o11 = i24 + 1;
                                    }
                                }
                            }
                            if (i20 != i10) {
                                obj = new Object[]{sArr, Integer.valueOf(i20), obj};
                            }
                            obj = sArr;
                        } else {
                            int[] iArr = new int[s10];
                            Arrays.fill(iArr, -1);
                            int i27 = 0;
                            for (int i28 = 0; i28 < i10; i28++) {
                                int i29 = i28 * 2;
                                int i30 = i27 * 2;
                                Object obj8 = objArr[i29];
                                Objects.requireNonNull(obj8);
                                Object obj9 = objArr[i29 ^ 1];
                                Objects.requireNonNull(obj9);
                                int o12 = p8.l.o(obj8.hashCode());
                                while (true) {
                                    int i31 = o12 & i12;
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
                                            obj = new a0(obj8, obj9, obj10);
                                            objArr[i33] = obj9;
                                            break;
                                        }
                                        o12 = i31 + 1;
                                    }
                                }
                            }
                            c12 = 2;
                            obj = i27 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i27), obj};
                            z10 = obj instanceof Object[];
                            Object obj11 = obj;
                            if (z10) {
                                Object[] objArr2 = (Object[]) obj;
                                this.d = (a0) objArr2[c12];
                                Object obj12 = objArr2[c11];
                                int intValue = ((Integer) objArr2[c10]).intValue();
                                objArr = Arrays.copyOf(objArr, intValue * 2);
                                obj11 = obj12;
                                i10 = intValue;
                            }
                            q0Var = new q0(obj11, objArr, i10);
                        }
                    }
                }
                c12 = 2;
                z10 = obj instanceof Object[];
                Object obj112 = obj;
                if (z10) {
                }
                q0Var = new q0(obj112, objArr, i10);
            }
        }
        a0 a0Var2 = (a0) this.d;
        if (a0Var2 == null) {
            return q0Var;
        }
        throw a0Var2.a();
    }

    public void e(String str, Object... objArr) {
        if (this.c <= 3) {
            String str2 = (String) this.b;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public long f(l lVar) {
        int e9;
        n nVar = (n) this.d;
        FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.b;
        while (lVar.i() < lVar.getLength() - 6) {
            int i10 = this.c;
            long i11 = lVar.i();
            byte[] bArr = new byte[2];
            int i12 = 0;
            boolean a2 = false;
            lVar.b(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                lVar.q();
                lVar.j((int) (i11 - lVar.getPosition()));
            } else {
                z zVar = new z(16);
                System.arraycopy(bArr, 0, zVar.a, 0, 2);
                byte[] bArr2 = zVar.a;
                while (i12 < 14 && (e9 = lVar.e(2 + i12, 14 - i12, bArr2)) != -1) {
                    i12 += e9;
                }
                zVar.B(i12);
                lVar.q();
                lVar.j((int) (i11 - lVar.getPosition()));
                a2 = h7.r.a(zVar, flacStreamMetadata, i10, nVar);
            }
            if (a2) {
                break;
            }
            lVar.j(1);
        }
        if (lVar.i() < lVar.getLength() - 6) {
            return nVar.a;
        }
        lVar.j((int) (lVar.getLength() - lVar.i()));
        return flacStreamMetadata.totalSamples;
    }

    @Override // m3.e
    public void f2() {
        switch (this.a) {
            case 20:
                break;
            default:
                z zVar = (z) this.d;
                byte[] bArr = g0.f;
                zVar.getClass();
                zVar.A(bArr.length, bArr);
                break;
        }
    }

    public Object g(int i10) {
        SparseArray sparseArray = (SparseArray) this.b;
        if (this.c == -1) {
            this.c = 0;
        }
        while (true) {
            int i11 = this.c;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.c--;
        }
        while (this.c < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.c + 1)) {
            this.c++;
        }
        return sparseArray.valueAt(this.c);
    }

    public boolean h() {
        ColorStateList colorStateList;
        return ((Shader) this.b) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void j(Object obj, Object obj2) {
        int i10 = (this.c + 1) * 2;
        Object[] objArr = (Object[]) this.b;
        if (i10 > objArr.length) {
            this.b = Arrays.copyOf(objArr, w.d(objArr.length, i10));
        }
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(valueOf);
            throw new NullPointerException(sb2.toString());
        }
        if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 26);
            sb3.append("null value in entry: ");
            sb3.append(valueOf2);
            sb3.append("=null");
            throw new NullPointerException(sb3.toString());
        }
        Object[] objArr2 = (Object[]) this.b;
        int i11 = this.c;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.c = i11 + 1;
    }

    public void k(int i10) {
        l(i10, 200L, er.f);
    }

    public void l(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.b;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.b).cancel();
        }
        int[] iArr = new int[1];
        this.c = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.b = ofInt;
        ofInt.addUpdateListener(new t2(21, this, iArr));
        ((ValueAnimator) this.b).addListener(new l3(this, i10, iArr, 2));
        ((ValueAnimator) this.b).setDuration(j10);
        ((ValueAnimator) this.b).setInterpolator(interpolator);
        ((ValueAnimator) this.b).start();
    }

    public List m(CharSequence charSequence) {
        charSequence.getClass();
        o oVar = (o) this.d;
        oVar.getClass();
        o8.h hVar = new o8.h(oVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void n(String str, v5.c cVar) {
        int i10 = this.c + 1;
        Object[] objArr = (Object[]) this.b;
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
            this.b = Arrays.copyOf(objArr, i12);
        }
        Object[] objArr2 = (Object[]) this.b;
        int i13 = this.c;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.c = i13 + 1;
    }

    public void o(String str, com.google.android.gms.common.api.internal.l lVar) {
        Map map = (Map) this.b;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(p.m("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lVar);
        if (this.c > 0) {
            new t0(Looper.getMainLooper(), 6).post(new q1(this, lVar, str, 0));
        }
    }

    public byte[] p() {
        k kVar;
        r9.d dVar;
        j0 j0Var;
        r9.d dVar2;
        y yVar;
        r9.d dVar3;
        switch (this.a) {
            case 7:
                g9 g9Var = g9.c;
                t tVar = (t) this.b;
                ((e8) this.d).h = false;
                e8 e8Var = (e8) this.d;
                e8Var.f = Boolean.FALSE;
                tVar.b = new f8(e8Var);
                try {
                    g9.b();
                    m6 m6Var = new m6(tVar);
                    a5.n nVar = new a5.n(13);
                    g9Var.a(nVar);
                    HashMap hashMap = new HashMap((HashMap) nVar.b);
                    HashMap hashMap2 = new HashMap((HashMap) nVar.c);
                    j jVar = (j) nVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar = new k(byteArrayOutputStream, hashMap, hashMap2, jVar);
                        dVar = (r9.d) hashMap.get(m6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar == null) {
                        throw new r9.b("No encoder for ".concat(String.valueOf(m6.class)));
                    }
                    dVar.a(m6Var, kVar);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e9) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e9);
                }
            case 11:
                na naVar = na.c;
                m mVar = (m) this.b;
                ((e8) this.d).h = false;
                e8 e8Var2 = (e8) this.d;
                e8Var2.f = Boolean.FALSE;
                mVar.a = new n9(e8Var2);
                try {
                    na.b();
                    u7 u7Var = new u7(mVar);
                    a5.n nVar2 = new a5.n(21);
                    naVar.a(nVar2);
                    HashMap hashMap3 = new HashMap((HashMap) nVar2.b);
                    HashMap hashMap4 = new HashMap((HashMap) nVar2.c);
                    i0 i0Var = (i0) nVar2.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        j0Var = new j0(byteArrayOutputStream2, hashMap3, hashMap4, i0Var);
                        dVar2 = (r9.d) hashMap3.get(u7.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 == null) {
                        throw new r9.b("No encoder for ".concat(String.valueOf(u7.class)));
                    }
                    dVar2.a(u7Var, j0Var);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            default:
                zf zfVar = zf.c;
                t3 t3Var = (t3) this.b;
                ((e8) this.d).h = false;
                e8 e8Var3 = (e8) this.d;
                e8Var3.f = Boolean.FALSE;
                t3Var.a = new we(e8Var3);
                try {
                    zf.b();
                    ib ibVar = new ib(t3Var);
                    j9.a aVar = new j9.a(2);
                    zfVar.a(aVar);
                    HashMap hashMap5 = new HashMap((HashMap) aVar.c);
                    HashMap hashMap6 = new HashMap((HashMap) aVar.d);
                    x xVar = (x) aVar.b;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar3 = (r9.d) hashMap5.get(ib.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 == null) {
                        throw new r9.b("No encoder for ".concat(String.valueOf(ib.class)));
                    }
                    dVar3.a(ibVar, yVar);
                    return byteArrayOutputStream3.toByteArray();
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
        }
    }

    public void q(Bundle bundle) {
        this.c = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            ((com.google.android.gms.common.api.internal.l) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void r(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((com.google.android.gms.common.api.internal.l) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public a(int i10, int i11) {
        this.a = i11;
        switch (i11) {
            case 21:
                this.b = new Object[i10 * 2];
                this.c = 0;
                break;
            default:
                this.c = i10;
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = i10;
        this.b = obj2;
    }

    public a(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 5:
                this.b = new Object[8];
                this.c = 0;
                break;
            case 8:
                int i11 = h.y;
                this.b = new d0[i11];
                this.d = new Bitmap[i11];
                break;
            case 17:
                this.b = new pg.a();
                break;
            default:
                this.b = DesugarCollections.synchronizedMap(new f(0));
                this.c = 0;
                break;
        }
    }

    public a(m mVar, int i10) {
        this.a = 11;
        this.d = new e8();
        this.b = mVar;
        na.b();
        this.c = i10;
    }

    public a(t tVar, int i10) {
        this.a = 7;
        this.d = new e8();
        this.b = tVar;
        g9.b();
        this.c = i10;
    }

    public a(String str, String[] strArr) {
        String sb2;
        this.a = 0;
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
        this.b = str;
        int i10 = 2;
        y5.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.b, i10)) {
            i10++;
        }
        this.c = i10;
    }

    private final /* synthetic */ void i() {
    }

    public a(t3 t3Var, int i10) {
        this.a = 13;
        this.d = new e8();
        this.b = t3Var;
        zf.b();
        this.c = i10;
    }

    public a(zk0 zk0Var) {
        this.a = 19;
        this.d = zk0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.a = 23;
        this.b = rectF;
        this.c = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e9) {
            FileLog.e(e9);
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

    public a(w0 w0Var) {
        this.a = 12;
        this.b = new SparseArray();
        this.d = w0Var;
        this.c = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.a = 9;
        this.b = shader;
        this.d = colorStateList;
        this.c = i10;
    }

    public a(FlacStreamMetadata flacStreamMetadata, int i10) {
        this.a = 20;
        this.b = flacStreamMetadata;
        this.c = i10;
        this.d = new n();
    }

    public a(int i10, f0 f0Var) {
        this.a = 22;
        this.c = i10;
        this.b = f0Var;
        this.d = new z();
    }

    public a(o oVar) {
        this.a = 16;
        this.d = oVar;
        this.b = o8.c.a;
        this.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
    }
}
