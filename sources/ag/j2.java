package ag;

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
import bg.b3;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import h7.d8;
import h7.e8;
import h7.f9;
import h7.l6;
import i7.p6;
import i7.s8;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j7.o9;
import j7.oa;
import j7.v7;
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
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import jh.l3;
import l7.ib;
import l7.we;
import l7.zf;
import m.s3;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j2 implements o3.e {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public /* synthetic */ j2(char c3, int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new g9.l(r13, r7);
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
    
        return new ag.j2(r11, (android.content.res.ColorStateList) null, 0);
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
    
        r0 = new g9.l(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new g9.l(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j2 e(Resources resources, int i10, Resources.Theme theme) {
        int next;
        float f9;
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
                return new j2((Shader) null, b10, b10.getDefaultColor());
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
            f9 = f13;
            i11 = f12.getColor(1, 0);
        } else {
            f9 = f13;
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

    public void a(int i10, int i11) {
        int i12 = (i11 << 16) + i10;
        boolean z10 = this.b != i12;
        this.b = i12;
        for (int i13 = 0; i13 < jf.g.y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new cg.m2(bitmap, 27));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            jf.c0[] c0VarArr = (jf.c0[]) this.c;
            if (c0VarArr[i13] == null) {
                c0VarArr[i13] = new jf.c0(i11 * i10 * 2);
            }
        }
    }

    public ca.b b() {
        if ("".isEmpty()) {
            return new ca.b((String) this.c, ((Long) this.d).longValue(), this.b);
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
    public q8.q0 c() {
        char c3;
        char c6;
        char c10;
        short[] sArr;
        boolean z10;
        q8.q0 q0Var;
        q8.a0 a0Var = (q8.a0) this.d;
        if (a0Var != null) {
            throw a0Var.a();
        }
        int i10 = this.b;
        Object[] objArr = (Object[]) this.c;
        if (i10 == 0) {
            q0Var = q8.q0.h;
        } else {
            int i11 = 1;
            Object obj = null;
            if (i10 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                q0Var = new q8.q0(null, objArr, 1);
            } else {
                p6.c(i10, objArr.length >> 1);
                int s10 = q8.c0.s(i10);
                if (i10 == 1) {
                    Objects.requireNonNull(objArr[0]);
                    Objects.requireNonNull(objArr[1]);
                    c3 = 1;
                    c6 = 0;
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
                            int o10 = q8.l.o(obj2.hashCode());
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
                                        obj = new q8.a0(obj2, obj3, obj4);
                                        objArr[i19] = obj3;
                                        break;
                                    }
                                    o10 = i17 + 1;
                                }
                            }
                            i13++;
                            i11 = 1;
                        }
                        c3 = 1;
                        c6 = 0;
                        if (i14 == i10) {
                            obj = bArr;
                        } else {
                            sArr = new Object[]{bArr, Integer.valueOf(i14), obj};
                            obj = sArr;
                        }
                    } else {
                        c3 = 1;
                        c6 = 0;
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
                                int o11 = q8.l.o(obj5.hashCode());
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
                                            obj = new q8.a0(obj5, obj6, obj7);
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
                                int o12 = q8.l.o(obj8.hashCode());
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
                                            obj = new q8.a0(obj8, obj9, obj10);
                                            objArr[i33] = obj9;
                                            break;
                                        }
                                        o12 = i31 + 1;
                                    }
                                }
                            }
                            c10 = 2;
                            obj = i27 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i27), obj};
                            z10 = obj instanceof Object[];
                            Object obj11 = obj;
                            if (z10) {
                                Object[] objArr2 = (Object[]) obj;
                                this.d = (q8.a0) objArr2[c10];
                                Object obj12 = objArr2[c6];
                                int intValue = ((Integer) objArr2[c3]).intValue();
                                objArr = Arrays.copyOf(objArr, intValue * 2);
                                obj11 = obj12;
                                i10 = intValue;
                            }
                            q0Var = new q8.q0(obj11, objArr, i10);
                        }
                    }
                }
                c10 = 2;
                z10 = obj instanceof Object[];
                Object obj112 = obj;
                if (z10) {
                }
                q0Var = new q8.q0(obj112, objArr, i10);
            }
        }
        q8.a0 a0Var2 = (q8.a0) this.d;
        if (a0Var2 == null) {
            return q0Var;
        }
        throw a0Var2.a();
    }

    @Override // o3.e
    public o3.d d(o3.l lVar, long j10) {
        long j11;
        switch (this.a) {
            case 22:
                long position = lVar.getPosition();
                long h = h(lVar);
                long h10 = lVar.h();
                lVar.i(Math.max(6, ((FlacStreamMetadata) this.c).minFrameSize));
                long h11 = h(lVar);
                return (h > j10 || h11 <= j10) ? h11 <= j10 ? new o3.d(-2, h11, lVar.h()) : new o3.d(-1, h, position) : new o3.d(0, -9223372036854775807L, h10);
            default:
                long position2 = lVar.getPosition();
                int min = (int) Math.min(112800, lVar.getLength() - position2);
                f5.w wVar = (f5.w) this.d;
                wVar.z(min);
                lVar.a(0, min, wVar.a);
                int i10 = wVar.c;
                long j12 = -1;
                long j13 = -1;
                long j14 = -9223372036854775807L;
                while (true) {
                    if (wVar.a() >= 188) {
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
                        if (i12 <= i10) {
                            long a2 = s8.a(wVar, i11, this.b);
                            if (a2 != j11) {
                                long b10 = ((f5.c0) this.c).b(a2);
                                if (b10 > j10) {
                                    return j14 == j11 ? new o3.d(-1, b10, position2) : new o3.d(0, -9223372036854775807L, position2 + j13);
                                }
                                j14 = b10;
                                if (100000 + j14 > j10) {
                                    return new o3.d(0, -9223372036854775807L, position2 + i11);
                                }
                                j13 = i11;
                            }
                            wVar.C(i12);
                            j12 = i12;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                }
                return j14 != j11 ? new o3.d(-2, j14, position2 + j12) : o3.d.d;
        }
    }

    @Override // o3.e
    public void f() {
        switch (this.a) {
            case 22:
                break;
            default:
                f5.w wVar = (f5.w) this.d;
                byte[] bArr = f5.d0.f;
                wVar.getClass();
                wVar.A(bArr.length, bArr);
                break;
        }
    }

    public void g(String str, Object... objArr) {
        if (this.b <= 3) {
            String str2 = (String) this.c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public long h(o3.l lVar) {
        int d;
        o3.n nVar = (o3.n) this.d;
        FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.c;
        while (lVar.h() < lVar.getLength() - 6) {
            int i10 = this.b;
            long h = lVar.h();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean a2 = false;
            lVar.a(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                lVar.s();
                lVar.i((int) (h - lVar.getPosition()));
            } else {
                f5.w wVar = new f5.w(16);
                System.arraycopy(bArr, 0, wVar.a, 0, 2);
                byte[] bArr2 = wVar.a;
                while (i11 < 14 && (d = lVar.d(2 + i11, 14 - i11, bArr2)) != -1) {
                    i11 += d;
                }
                wVar.B(i11);
                lVar.s();
                lVar.i((int) (h - lVar.getPosition()));
                a2 = i7.i0.a(wVar, flacStreamMetadata, i10, nVar);
            }
            if (a2) {
                break;
            }
            lVar.i(1);
        }
        if (lVar.h() < lVar.getLength() - 6) {
            return nVar.a;
        }
        lVar.i((int) (lVar.getLength() - lVar.h()));
        return flacStreamMetadata.totalSamples;
    }

    public Object i(int i10) {
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

    public boolean j() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void l(Object obj, Object obj2) {
        int i10 = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i10 > objArr.length) {
            this.c = Arrays.copyOf(objArr, q8.w.d(objArr.length, i10));
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
        Object[] objArr2 = (Object[]) this.c;
        int i11 = this.b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.b = i11 + 1;
    }

    public void m(int i10) {
        n(i10, 200L, jr.f);
    }

    public void n(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.c).cancel();
        }
        int[] iArr = new int[1];
        this.b = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.c = ofInt;
        ofInt.addUpdateListener(new b3(22, this, iArr));
        ((ValueAnimator) this.c).addListener(new l3(this, i10, iArr, 2));
        ((ValueAnimator) this.c).setDuration(j10);
        ((ValueAnimator) this.c).setInterpolator(interpolator);
        ((ValueAnimator) this.c).start();
    }

    public List o(CharSequence charSequence) {
        charSequence.getClass();
        org.telegram.ui.Components.n nVar = (org.telegram.ui.Components.n) this.d;
        nVar.getClass();
        p8.h hVar = new p8.h(nVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void p(String str, w5.c cVar) {
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

    public void q(String str, com.google.android.gms.common.api.internal.l lVar) {
        Map map = (Map) this.c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(a4.w.n("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lVar);
        if (this.b > 0) {
            new c2.v0(Looper.getMainLooper(), 6).post(new com.google.android.gms.common.api.internal.q1(this, lVar, str, 0));
        }
    }

    public byte[] r() {
        h7.k kVar;
        s9.d dVar;
        j7.j0 j0Var;
        s9.d dVar2;
        l7.y yVar;
        s9.d dVar3;
        switch (this.a) {
            case 9:
                f9 f9Var = f9.c;
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.c;
                ((d8) this.d).h = false;
                d8 d8Var = (d8) this.d;
                d8Var.f = Boolean.FALSE;
                sVar.b = new e8(d8Var);
                try {
                    f9.b();
                    l6 l6Var = new l6(sVar);
                    androidx.biometric.e eVar = new androidx.biometric.e(13);
                    f9Var.a(eVar);
                    HashMap hashMap = new HashMap((HashMap) eVar.b);
                    HashMap hashMap2 = new HashMap((HashMap) eVar.c);
                    h7.j jVar = (h7.j) eVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar = new h7.k(byteArrayOutputStream, hashMap, hashMap2, jVar);
                        dVar = (s9.d) hashMap.get(l6.class);
                    } catch (IOException unused) {
                    }
                    if (dVar == null) {
                        throw new s9.b("No encoder for ".concat(String.valueOf(l6.class)));
                    }
                    dVar.a(l6Var, kVar);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 10:
                oa oaVar = oa.c;
                bg.c2 c2Var = (bg.c2) this.c;
                ((d8) this.d).h = false;
                d8 d8Var2 = (d8) this.d;
                d8Var2.f = Boolean.FALSE;
                c2Var.a = new o9(d8Var2);
                try {
                    oa.b();
                    v7 v7Var = new v7(c2Var);
                    androidx.biometric.e eVar2 = new androidx.biometric.e(21);
                    oaVar.a(eVar2);
                    HashMap hashMap3 = new HashMap((HashMap) eVar2.b);
                    HashMap hashMap4 = new HashMap((HashMap) eVar2.c);
                    j7.i0 i0Var = (j7.i0) eVar2.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        j0Var = new j7.j0(byteArrayOutputStream2, hashMap3, hashMap4, i0Var);
                        dVar2 = (s9.d) hashMap3.get(v7.class);
                    } catch (IOException unused2) {
                    }
                    if (dVar2 == null) {
                        throw new s9.b("No encoder for ".concat(String.valueOf(v7.class)));
                    }
                    dVar2.a(v7Var, j0Var);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
            default:
                zf zfVar = zf.c;
                s3 s3Var = (s3) this.c;
                ((d8) this.d).h = false;
                d8 d8Var3 = (d8) this.d;
                d8Var3.f = Boolean.FALSE;
                s3Var.a = new we(d8Var3);
                try {
                    zf.b();
                    ib ibVar = new ib(s3Var);
                    l3.g0 g0Var = new l3.g0(2);
                    zfVar.a(g0Var);
                    HashMap hashMap5 = new HashMap((HashMap) g0Var.b);
                    HashMap hashMap6 = new HashMap((HashMap) g0Var.c);
                    l7.x xVar = (l7.x) g0Var.d;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        yVar = new l7.y(byteArrayOutputStream3, hashMap5, hashMap6, xVar);
                        dVar3 = (s9.d) hashMap5.get(ib.class);
                    } catch (IOException unused3) {
                    }
                    if (dVar3 == null) {
                        throw new s9.b("No encoder for ".concat(String.valueOf(ib.class)));
                    }
                    dVar3.a(ibVar, yVar);
                    return byteArrayOutputStream3.toByteArray();
                } catch (UnsupportedEncodingException e12) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
                }
        }
    }

    public void s(Bundle bundle) {
        this.b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            ((com.google.android.gms.common.api.internal.l) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void t(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((com.google.android.gms.common.api.internal.l) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public j2(int i10, int i11) {
        this.a = i11;
        switch (i11) {
            case 21:
                this.c = new Object[i10 * 2];
                this.b = 0;
                break;
            default:
                this.b = i10;
                break;
        }
    }

    public j2(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 6:
                this.c = new Object[8];
                this.b = 0;
                break;
            case 11:
                int i11 = jf.g.y;
                this.c = new jf.c0[i11];
                this.d = new Bitmap[i11];
                break;
            case 16:
                this.c = new rg.a();
                break;
            default:
                this.c = DesugarCollections.synchronizedMap(new a0.f(0));
                this.b = 0;
                break;
        }
    }

    public j2(bg.c2 c2Var, int i10) {
        this.a = 10;
        this.d = new d8();
        this.c = c2Var;
        oa.b();
        this.b = i10;
    }

    public j2(com.google.firebase.messaging.s sVar, int i10) {
        this.a = 9;
        this.d = new d8();
        this.c = sVar;
        f9.b();
        this.b = i10;
    }

    public j2(String str, String[] strArr) {
        String sb2;
        this.a = 1;
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
        z5.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.c, i10)) {
            i10++;
        }
        this.b = i10;
    }

    private final /* synthetic */ void k() {
    }

    public j2(s3 s3Var, int i10) {
        this.a = 14;
        this.d = new d8();
        this.c = s3Var;
        zf.b();
        this.b = i10;
    }

    public j2(jl0 jl0Var) {
        this.a = 18;
        this.d = jl0Var;
    }

    public j2(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.a = 0;
        this.c = rectF;
        this.b = i10;
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

    public j2(l4.x0 x0Var) {
        this.a = 13;
        this.c = new SparseArray();
        this.d = x0Var;
        this.b = -1;
    }

    public j2(Shader shader, ColorStateList colorStateList, int i10) {
        this.a = 8;
        this.c = shader;
        this.d = colorStateList;
        this.b = i10;
    }

    public j2(FlacStreamMetadata flacStreamMetadata, int i10) {
        this.a = 22;
        this.c = flacStreamMetadata;
        this.b = i10;
        this.d = new o3.n();
    }

    public j2(int i10, f5.c0 c0Var) {
        this.a = 23;
        this.b = i10;
        this.c = c0Var;
        this.d = new f5.w();
    }

    public j2(org.telegram.ui.Components.n nVar) {
        this.a = 19;
        this.d = nVar;
        this.c = p8.c.a;
        this.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public j2(CopyOnWriteArrayList copyOnWriteArrayList, int i10, l4.c0 c0Var) {
        this.a = 15;
        this.d = copyOnWriteArrayList;
        this.b = i10;
        this.c = c0Var;
    }

    public j2(j3.t0 t0Var, int i10, String str) {
        this.a = 12;
        this.c = t0Var;
        this.b = i10;
        this.d = str;
    }
}
