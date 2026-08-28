package a6;

import a0.f;
import a5.m;
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
import c2.u0;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.gms.common.api.internal.q1;
import com.google.firebase.messaging.t;
import d5.e0;
import d5.f0;
import d5.y;
import f2.g;
import f7.f8;
import f7.g8;
import f7.h9;
import f7.j;
import f7.k;
import f7.m6;
import ff.d0;
import ff.h;
import g7.a8;
import g7.r;
import gh.m3;
import h0.b;
import h0.c;
import h7.i0;
import h7.j0;
import h7.n9;
import h7.na;
import h7.u7;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j7.ib;
import j7.we;
import j7.x;
import j7.zf;
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
import m.t3;
import m3.d;
import m3.e;
import m3.l;
import m3.n;
import o8.a0;
import o8.c0;
import o8.q0;
import o8.w;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wk0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements e {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public Object d;

    public /* synthetic */ a(char c10, int i9) {
        this.a = i9;
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
    
        return new a6.a(r11, (android.content.res.ColorStateList) null, 0);
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
    public static a d(Resources resources, int i9, Resources.Theme theme) {
        int next;
        float f10;
        int i10;
        float f11;
        int i11;
        float f12;
        XmlResourceParser xml = resources.getXml(i9);
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
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", TeXSymbolParser.TYPE_ATTR) != null ? f13.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f13.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
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
    public d Q1(l lVar, long j10) {
        long j11;
        switch (this.a) {
            case 21:
                long position = lVar.getPosition();
                long f10 = f(lVar);
                long k10 = lVar.k();
                lVar.n(Math.max(6, ((FlacStreamMetadata) this.b).minFrameSize));
                long f11 = f(lVar);
                return (f10 > j10 || f11 <= j10) ? f11 <= j10 ? new d(-2, f11, lVar.k()) : new d(-1, f10, position) : new d(0, -9223372036854775807L, k10);
            default:
                long position2 = lVar.getPosition();
                int min = (int) Math.min(112800, lVar.getLength() - position2);
                y yVar = (y) this.d;
                yVar.z(min);
                lVar.c(0, min, yVar.a);
                int i9 = yVar.c;
                long j12 = -1;
                long j13 = -1;
                long j14 = -9223372036854775807L;
                while (true) {
                    if (yVar.a() >= 188) {
                        byte[] bArr = yVar.a;
                        int i10 = yVar.b;
                        while (true) {
                            if (i10 < i9) {
                                j11 = -9223372036854775807L;
                                if (bArr[i10] != 71) {
                                    i10++;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        int i11 = i10 + 188;
                        if (i11 <= i9) {
                            long a2 = a8.a(yVar, i10, this.c);
                            if (a2 != j11) {
                                long b10 = ((e0) this.b).b(a2);
                                if (b10 > j10) {
                                    return j14 == j11 ? new d(-1, b10, position2) : new d(0, -9223372036854775807L, position2 + j13);
                                }
                                j14 = b10;
                                if (100000 + j14 > j10) {
                                    return new d(0, -9223372036854775807L, position2 + i10);
                                }
                                j13 = i10;
                            }
                            yVar.C(i11);
                            j12 = i11;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                }
                return j14 != j11 ? new d(-2, j14, position2 + j12) : d.d;
        }
    }

    public void a(int i9, int i10) {
        int i11 = (i10 << 16) + i9;
        boolean z10 = this.c != i11;
        this.c = i11;
        for (int i12 = 0; i12 < h.y; i12++) {
            if (z10 || ((Bitmap[]) this.d)[i12] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i12];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new af.e(bitmap, 25));
                }
                ((Bitmap[]) this.d)[i12] = Bitmap.createBitmap(i10, i9, Bitmap.Config.ARGB_8888);
            }
            d0[] d0VarArr = (d0[]) this.b;
            if (d0VarArr[i12] == null) {
                d0VarArr[i12] = new d0(i10 * i9 * 2);
            }
        }
    }

    public aa.b b() {
        if ("".isEmpty()) {
            return new aa.b((String) this.b, ((Long) this.d).longValue(), this.c);
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
        int i9 = this.c;
        Object[] objArr = (Object[]) this.b;
        if (i9 == 0) {
            q0Var = q0.h;
        } else {
            int i10 = 1;
            Object obj = null;
            if (i9 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                q0Var = new q0(null, objArr, 1);
            } else {
                g7.d0.c(i9, objArr.length >> 1);
                int s10 = c0.s(i9);
                if (i9 == 1) {
                    Objects.requireNonNull(objArr[0]);
                    Objects.requireNonNull(objArr[1]);
                    c10 = 1;
                    c11 = 0;
                } else {
                    int i11 = s10 - 1;
                    if (s10 <= 128) {
                        byte[] bArr = new byte[s10];
                        Arrays.fill(bArr, (byte) -1);
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < i9) {
                            int i14 = i12 * 2;
                            int i15 = i13 * 2;
                            Object obj2 = objArr[i14];
                            Objects.requireNonNull(obj2);
                            Object obj3 = objArr[i14 ^ i10];
                            Objects.requireNonNull(obj3);
                            int o6 = o8.l.o(obj2.hashCode());
                            while (true) {
                                int i16 = o6 & i11;
                                int i17 = bArr[i16] & 255;
                                if (i17 == 255) {
                                    bArr[i16] = (byte) i15;
                                    if (i13 < i12) {
                                        objArr[i15] = obj2;
                                        objArr[i15 ^ 1] = obj3;
                                    }
                                    i13++;
                                } else {
                                    if (obj2.equals(objArr[i17])) {
                                        int i18 = i17 ^ 1;
                                        Object obj4 = objArr[i18];
                                        Objects.requireNonNull(obj4);
                                        obj = new a0(obj2, obj3, obj4);
                                        objArr[i18] = obj3;
                                        break;
                                    }
                                    o6 = i16 + 1;
                                }
                            }
                            i12++;
                            i10 = 1;
                        }
                        c10 = 1;
                        c11 = 0;
                        if (i13 == i9) {
                            obj = bArr;
                        } else {
                            sArr = new Object[]{bArr, Integer.valueOf(i13), obj};
                            obj = sArr;
                        }
                    } else {
                        c10 = 1;
                        c11 = 0;
                        if (s10 <= 32768) {
                            sArr = new short[s10];
                            Arrays.fill(sArr, (short) -1);
                            int i19 = 0;
                            for (int i20 = 0; i20 < i9; i20++) {
                                int i21 = i20 * 2;
                                int i22 = i19 * 2;
                                Object obj5 = objArr[i21];
                                Objects.requireNonNull(obj5);
                                Object obj6 = objArr[i21 ^ 1];
                                Objects.requireNonNull(obj6);
                                int o9 = o8.l.o(obj5.hashCode());
                                while (true) {
                                    int i23 = o9 & i11;
                                    int i24 = sArr[i23] & 65535;
                                    if (i24 == 65535) {
                                        sArr[i23] = (short) i22;
                                        if (i19 < i20) {
                                            objArr[i22] = obj5;
                                            objArr[i22 ^ 1] = obj6;
                                        }
                                        i19++;
                                    } else {
                                        if (obj5.equals(objArr[i24])) {
                                            int i25 = i24 ^ 1;
                                            Object obj7 = objArr[i25];
                                            Objects.requireNonNull(obj7);
                                            obj = new a0(obj5, obj6, obj7);
                                            objArr[i25] = obj6;
                                            break;
                                        }
                                        o9 = i23 + 1;
                                    }
                                }
                            }
                            if (i19 != i9) {
                                obj = new Object[]{sArr, Integer.valueOf(i19), obj};
                            }
                            obj = sArr;
                        } else {
                            int[] iArr = new int[s10];
                            Arrays.fill(iArr, -1);
                            int i26 = 0;
                            for (int i27 = 0; i27 < i9; i27++) {
                                int i28 = i27 * 2;
                                int i29 = i26 * 2;
                                Object obj8 = objArr[i28];
                                Objects.requireNonNull(obj8);
                                Object obj9 = objArr[i28 ^ 1];
                                Objects.requireNonNull(obj9);
                                int o10 = o8.l.o(obj8.hashCode());
                                while (true) {
                                    int i30 = o10 & i11;
                                    int i31 = iArr[i30];
                                    if (i31 == -1) {
                                        iArr[i30] = i29;
                                        if (i26 < i27) {
                                            objArr[i29] = obj8;
                                            objArr[i29 ^ 1] = obj9;
                                        }
                                        i26++;
                                    } else {
                                        if (obj8.equals(objArr[i31])) {
                                            int i32 = i31 ^ 1;
                                            Object obj10 = objArr[i32];
                                            Objects.requireNonNull(obj10);
                                            obj = new a0(obj8, obj9, obj10);
                                            objArr[i32] = obj9;
                                            break;
                                        }
                                        o10 = i30 + 1;
                                    }
                                }
                            }
                            c12 = 2;
                            obj = i26 == i9 ? iArr : new Object[]{iArr, Integer.valueOf(i26), obj};
                            z10 = obj instanceof Object[];
                            Object obj11 = obj;
                            if (z10) {
                                Object[] objArr2 = (Object[]) obj;
                                this.d = (a0) objArr2[c12];
                                Object obj12 = objArr2[c11];
                                int intValue = ((Integer) objArr2[c10]).intValue();
                                objArr = Arrays.copyOf(objArr, intValue * 2);
                                obj11 = obj12;
                                i9 = intValue;
                            }
                            q0Var = new q0(obj11, objArr, i9);
                        }
                    }
                }
                c12 = 2;
                z10 = obj instanceof Object[];
                Object obj112 = obj;
                if (z10) {
                }
                q0Var = new q0(obj112, objArr, i9);
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
        int e10;
        n nVar = (n) this.d;
        FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.b;
        while (lVar.k() < lVar.getLength() - 6) {
            int i9 = this.c;
            long k10 = lVar.k();
            byte[] bArr = new byte[2];
            int i10 = 0;
            boolean a2 = false;
            lVar.c(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i9) {
                lVar.t();
                lVar.n((int) (k10 - lVar.getPosition()));
            } else {
                y yVar = new y(16);
                System.arraycopy(bArr, 0, yVar.a, 0, 2);
                byte[] bArr2 = yVar.a;
                while (i10 < 14 && (e10 = lVar.e(2 + i10, 14 - i10, bArr2)) != -1) {
                    i10 += e10;
                }
                yVar.B(i10);
                lVar.t();
                lVar.n((int) (k10 - lVar.getPosition()));
                a2 = r.a(yVar, flacStreamMetadata, i9, nVar);
            }
            if (a2) {
                break;
            }
            lVar.n(1);
        }
        if (lVar.k() < lVar.getLength() - 6) {
            return nVar.a;
        }
        lVar.n((int) (lVar.getLength() - lVar.k()));
        return flacStreamMetadata.totalSamples;
    }

    public Object g(int i9) {
        SparseArray sparseArray = (SparseArray) this.b;
        if (this.c == -1) {
            this.c = 0;
        }
        while (true) {
            int i10 = this.c;
            if (i10 <= 0 || i9 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.c--;
        }
        while (this.c < sparseArray.size() - 1 && i9 >= sparseArray.keyAt(this.c + 1)) {
            this.c++;
        }
        return sparseArray.valueAt(this.c);
    }

    public boolean h() {
        ColorStateList colorStateList;
        return ((Shader) this.b) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    @Override // m3.e
    public void i2() {
        switch (this.a) {
            case 21:
                break;
            default:
                y yVar = (y) this.d;
                byte[] bArr = f0.f;
                yVar.getClass();
                yVar.A(bArr.length, bArr);
                break;
        }
    }

    public void j(Object obj, Object obj2) {
        int i9 = (this.c + 1) * 2;
        Object[] objArr = (Object[]) this.b;
        if (i9 > objArr.length) {
            this.b = Arrays.copyOf(objArr, w.d(objArr.length, i9));
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
        int i10 = this.c;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.c = i10 + 1;
    }

    public void k(int i9) {
        l(i9, 200L, gr.f);
    }

    public void l(int i9, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.b;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.b).cancel();
        }
        int[] iArr = new int[1];
        this.c = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i9);
        this.b = ofInt;
        ofInt.addUpdateListener(new g(20, this, iArr));
        ((ValueAnimator) this.b).addListener(new m3(this, i9, iArr, 2));
        ((ValueAnimator) this.b).setDuration(j10);
        ((ValueAnimator) this.b).setInterpolator(interpolator);
        ((ValueAnimator) this.b).start();
    }

    public List m(CharSequence charSequence) {
        charSequence.getClass();
        n5.e0 e0Var = (n5.e0) this.d;
        e0Var.getClass();
        n8.h hVar = new n8.h(e0Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void n(String str, u5.c cVar) {
        int i9 = this.c + 1;
        Object[] objArr = (Object[]) this.b;
        int length = objArr.length;
        int i10 = i9 + i9;
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
            this.b = Arrays.copyOf(objArr, i11);
        }
        Object[] objArr2 = (Object[]) this.b;
        int i12 = this.c;
        int i13 = i12 + i12;
        objArr2[i13] = str;
        objArr2[i13 + 1] = cVar;
        this.c = i12 + 1;
    }

    public void o(String str, com.google.android.gms.common.api.internal.l lVar) {
        Map map = (Map) this.b;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(aa.d.o("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lVar);
        if (this.c > 0) {
            new u0(Looper.getMainLooper(), 6).post(new q1(this, lVar, str, 0));
        }
    }

    public byte[] p() {
        k kVar;
        q9.d dVar;
        j0 j0Var;
        q9.d dVar2;
        j7.y yVar;
        q9.d dVar3;
        switch (this.a) {
            case 7:
                h9 h9Var = h9.c;
                t tVar = (t) this.b;
                ((f8) this.d).h = false;
                f8 f8Var = (f8) this.d;
                f8Var.f = Boolean.FALSE;
                tVar.b = new g8(f8Var);
                try {
                    h9.b();
                    m6 m6Var = new m6(tVar);
                    m mVar = new m(12);
                    h9Var.a(mVar);
                    HashMap hashMap = new HashMap((HashMap) mVar.b);
                    HashMap hashMap2 = new HashMap((HashMap) mVar.c);
                    j jVar = (j) mVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar = new k(byteArrayOutputStream, hashMap, hashMap2, jVar);
                        dVar = (q9.d) hashMap.get(m6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar == null) {
                        throw new q9.b("No encoder for ".concat(String.valueOf(m6.class)));
                    }
                    dVar.a(m6Var, kVar);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 10:
                na naVar = na.c;
                com.google.firebase.messaging.m mVar2 = (com.google.firebase.messaging.m) this.b;
                ((f8) this.d).h = false;
                f8 f8Var2 = (f8) this.d;
                f8Var2.f = Boolean.FALSE;
                mVar2.a = new n9(f8Var2);
                try {
                    na.b();
                    u7 u7Var = new u7(mVar2);
                    m mVar3 = new m(21);
                    naVar.a(mVar3);
                    HashMap hashMap3 = new HashMap((HashMap) mVar3.b);
                    HashMap hashMap4 = new HashMap((HashMap) mVar3.c);
                    i0 i0Var = (i0) mVar3.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        j0Var = new j0(byteArrayOutputStream2, hashMap3, hashMap4, i0Var);
                        dVar2 = (q9.d) hashMap3.get(u7.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 == null) {
                        throw new q9.b("No encoder for ".concat(String.valueOf(u7.class)));
                    }
                    dVar2.a(u7Var, j0Var);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
            default:
                zf zfVar = zf.c;
                t3 t3Var = (t3) this.b;
                ((f8) this.d).h = false;
                f8 f8Var3 = (f8) this.d;
                f8Var3.f = Boolean.FALSE;
                t3Var.a = new we(f8Var3);
                try {
                    zf.b();
                    ib ibVar = new ib(t3Var);
                    j4.c cVar = new j4.c(1);
                    zfVar.a(cVar);
                    HashMap hashMap5 = new HashMap((HashMap) cVar.b);
                    HashMap hashMap6 = new HashMap((HashMap) cVar.c);
                    x xVar = (x) cVar.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new j7.y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar3 = (q9.d) hashMap5.get(ib.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 == null) {
                        throw new q9.b("No encoder for ".concat(String.valueOf(ib.class)));
                    }
                    dVar3.a(ibVar, yVar);
                    return byteArrayOutputStream3.toByteArray();
                } catch (UnsupportedEncodingException e12) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
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

    public a(int i9, int i10) {
        this.a = i10;
        switch (i10) {
            case 17:
                this.b = new Object[i9 * 2];
                this.c = 0;
                break;
            default:
                this.c = i9;
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = i9;
        this.b = obj2;
    }

    public a(int i9, byte b10) {
        this.a = i9;
        switch (i9) {
            case 5:
                this.b = new Object[8];
                this.c = 0;
                break;
            case 8:
                int i10 = h.y;
                this.b = new d0[i10];
                this.d = new Bitmap[i10];
                break;
            case 18:
                this.b = new og.a();
                break;
            default:
                this.b = DesugarCollections.synchronizedMap(new f(0));
                this.c = 0;
                break;
        }
    }

    public a(com.google.firebase.messaging.m mVar, int i9) {
        this.a = 10;
        this.d = new f8();
        this.b = mVar;
        na.b();
        this.c = i9;
    }

    public a(t tVar, int i9) {
        this.a = 7;
        this.d = new f8();
        this.b = tVar;
        h9.b();
        this.c = i9;
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
        int i9 = 2;
        x5.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i9 <= 7 && !Log.isLoggable((String) this.b, i9)) {
            i9++;
        }
        this.c = i9;
    }

    private final /* synthetic */ void i() {
    }

    public a(t3 t3Var, int i9) {
        this.a = 13;
        this.d = new f8();
        this.b = t3Var;
        zf.b();
        this.c = i9;
    }

    public a(wk0 wk0Var) {
        this.a = 20;
        this.d = wk0Var;
    }

    public a(ByteBuffer byteBuffer, int i9, RectF rectF) {
        this.a = 23;
        this.b = rectF;
        this.c = i9;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e10) {
            FileLog.e(e10);
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
            FileLog.e(e11);
        }
    }

    public a(ih.e eVar) {
        this.a = 12;
        this.b = new SparseArray();
        this.d = eVar;
        this.c = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i9) {
        this.a = 9;
        this.b = shader;
        this.d = colorStateList;
        this.c = i9;
    }

    public a(FlacStreamMetadata flacStreamMetadata, int i9) {
        this.a = 21;
        this.b = flacStreamMetadata;
        this.c = i9;
        this.d = new n();
    }

    public a(int i9, e0 e0Var) {
        this.a = 22;
        this.c = i9;
        this.b = e0Var;
        this.d = new y();
    }

    public a(n5.e0 e0Var) {
        this.a = 16;
        this.d = e0Var;
        this.b = n8.c.a;
        this.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
    }
}
