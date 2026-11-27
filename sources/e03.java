// default package

import android.util.Base64;
import android.util.JsonReader;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class e03 {
    public static final kj4 a;

    static {
        vw5 vw5Var = new vw5();
        u50 u50Var = u50.a;
        vw5Var.a(c03.class, u50Var);
        vw5Var.a(c80.class, u50Var);
        c60 c60Var = c60.a;
        vw5Var.a(b03.class, c60Var);
        vw5Var.a(n80.class, c60Var);
        z50 z50Var = z50.a;
        vw5Var.a(jz2.class, z50Var);
        vw5Var.a(o80.class, z50Var);
        a60 a60Var = a60.a;
        vw5Var.a(iz2.class, a60Var);
        vw5Var.a(p80.class, a60Var);
        s60 s60Var = s60.a;
        vw5Var.a(a03.class, s60Var);
        vw5Var.a(n90.class, s60Var);
        r60 r60Var = r60.a;
        vw5Var.a(zz2.class, r60Var);
        vw5Var.a(m90.class, r60Var);
        b60 b60Var = b60.a;
        vw5Var.a(kz2.class, b60Var);
        vw5Var.a(r80.class, b60Var);
        m60 m60Var = m60.a;
        vw5Var.a(yz2.class, m60Var);
        vw5Var.a(t80.class, m60Var);
        d60 d60Var = d60.a;
        vw5Var.a(sz2.class, d60Var);
        vw5Var.a(v80.class, d60Var);
        f60 f60Var = f60.a;
        vw5Var.a(qz2.class, f60Var);
        vw5Var.a(w80.class, f60Var);
        i60 i60Var = i60.a;
        vw5Var.a(pz2.class, i60Var);
        vw5Var.a(a90.class, i60Var);
        j60 j60Var = j60.a;
        vw5Var.a(oz2.class, j60Var);
        vw5Var.a(c90.class, j60Var);
        g60 g60Var = g60.a;
        vw5Var.a(mz2.class, g60Var);
        vw5Var.a(y80.class, g60Var);
        s50 s50Var = s50.a;
        vw5Var.a(cz2.class, s50Var);
        vw5Var.a(f80.class, s50Var);
        r50 r50Var = r50.a;
        vw5Var.a(bz2.class, r50Var);
        vw5Var.a(g80.class, r50Var);
        x50 x50Var = x50.a;
        vw5Var.a(hz2.class, x50Var);
        vw5Var.a(k80.class, x50Var);
        y50 y50Var = y50.a;
        vw5Var.a(gz2.class, y50Var);
        vw5Var.a(l80.class, y50Var);
        h60 h60Var = h60.a;
        vw5Var.a(nz2.class, h60Var);
        vw5Var.a(z80.class, h60Var);
        e60 e60Var = e60.a;
        vw5Var.a(lz2.class, e60Var);
        vw5Var.a(x80.class, e60Var);
        t50 t50Var = t50.a;
        vw5Var.a(dz2.class, t50Var);
        vw5Var.a(h80.class, t50Var);
        k60 k60Var = k60.a;
        vw5Var.a(rz2.class, k60Var);
        vw5Var.a(d90.class, k60Var);
        l60 l60Var = l60.a;
        vw5Var.a(tz2.class, l60Var);
        vw5Var.a(f90.class, l60Var);
        n60 n60Var = n60.a;
        vw5Var.a(uz2.class, n60Var);
        vw5Var.a(g90.class, n60Var);
        q60 q60Var = q60.a;
        vw5Var.a(xz2.class, q60Var);
        vw5Var.a(k90.class, q60Var);
        o60 o60Var = o60.a;
        vw5Var.a(wz2.class, o60Var);
        vw5Var.a(i90.class, o60Var);
        p60 p60Var = p60.a;
        vw5Var.a(vz2.class, p60Var);
        vw5Var.a(j90.class, p60Var);
        v50 v50Var = v50.a;
        vw5Var.a(fz2.class, v50Var);
        vw5Var.a(i80.class, v50Var);
        w50 w50Var = w50.a;
        vw5Var.a(ez2.class, w50Var);
        vw5Var.a(j80.class, w50Var);
        vw5Var.d = true;
        a = new kj4((Object) vw5Var, (byte) 10);
    }

    public static f80 a(JsonReader jsonReader) {
        e80 e80Var = new e80();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    e80Var.i = b(jsonReader, new uy2((byte) 2));
                    break;
                case "pid":
                    e80Var.a = jsonReader.nextInt();
                    e80Var.j = (byte) (e80Var.j | 1);
                    break;
                case "pss":
                    e80Var.e = jsonReader.nextLong();
                    e80Var.j = (byte) (e80Var.j | 8);
                    break;
                case "rss":
                    e80Var.f = jsonReader.nextLong();
                    e80Var.j = (byte) (e80Var.j | 16);
                    break;
                case "timestamp":
                    e80Var.g = jsonReader.nextLong();
                    e80Var.j = (byte) (e80Var.j | 32);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        p3d.h("Null processName");
                        return null;
                    }
                    e80Var.b = nextString;
                    break;
                case "reasonCode":
                    e80Var.c = jsonReader.nextInt();
                    e80Var.j = (byte) (e80Var.j | 2);
                    break;
                case "traceFile":
                    e80Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    e80Var.d = jsonReader.nextInt();
                    e80Var.j = (byte) (e80Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return e80Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x022a, code lost:
    
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x022f, code lost:
    
        if (r3 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0231, code lost:
    
        r2.append(" rolloutId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0236, code lost:
    
        if (r4 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0238, code lost:
    
        r2.append(" variantId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x023d, code lost:
    
        grb.i(bs2.o("Missing required properties:", r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List b(JsonReader jsonReader, uy2 uy2Var) {
        char c;
        char c2;
        char c3;
        Object obj;
        char c4;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            Object obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            switch (uy2Var.a) {
                case 2:
                    jsonReader.beginObject();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (true) {
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (str != null && str2 != null && str3 != null) {
                                obj2 = new g80(str, str2, str3);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                if (str == null) {
                                    sb.append(" arch");
                                }
                                if (str2 == null) {
                                    sb.append(" libraryName");
                                }
                                if (str3 == null) {
                                    sb.append(" buildId");
                                }
                                grb.i(bs2.o("Missing required properties:", sb));
                                break;
                            }
                        } else {
                            String nextName = jsonReader.nextName();
                            nextName.getClass();
                            switch (nextName.hashCode()) {
                                case -609862170:
                                    if (nextName.equals("libraryName")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3002454:
                                    if (nextName.equals("arch")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 230943785:
                                    if (nextName.equals("buildId")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        p3d.h("Null libraryName");
                                        break;
                                    }
                                case 1:
                                    str = jsonReader.nextString();
                                    if (str == null) {
                                        p3d.h("Null arch");
                                        break;
                                    }
                                case 2:
                                    str3 = jsonReader.nextString();
                                    if (str3 == null) {
                                        p3d.h("Null buildId");
                                        break;
                                    }
                                default:
                                    jsonReader.skipValue();
                            }
                        }
                    }
                case 3:
                    jsonReader.beginObject();
                    String str4 = null;
                    byte[] bArr = null;
                    while (true) {
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (str4 != null && bArr != null) {
                                obj2 = new j80(str4, bArr);
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                if (str4 == null) {
                                    sb2.append(" filename");
                                }
                                if (bArr == null) {
                                    sb2.append(" contents");
                                }
                                grb.i(bs2.o("Missing required properties:", sb2));
                                break;
                            }
                        } else {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            if (nextName2.equals("filename")) {
                                str4 = jsonReader.nextString();
                                if (str4 == null) {
                                    p3d.h("Null filename");
                                    break;
                                }
                            } else if (nextName2.equals("contents")) {
                                bArr = Base64.decode(jsonReader.nextString(), 2);
                                if (bArr == null) {
                                    p3d.h("Null contents");
                                    break;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                case 4:
                    h90 h90Var = new h90();
                    jsonReader.beginObject();
                    while (true) {
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            obj2 = h90Var.a();
                            break;
                        } else {
                            String nextName3 = jsonReader.nextName();
                            nextName3.getClass();
                            switch (nextName3.hashCode()) {
                                case -1536268810:
                                    if (nextName3.equals("parameterKey")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1027290370:
                                    if (nextName3.equals("templateVersion")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1098747284:
                                    if (nextName3.equals("rolloutVariant")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1124454216:
                                    if (nextName3.equals("parameterValue")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    String nextString = jsonReader.nextString();
                                    if (nextString == null) {
                                        p3d.h("Null parameterKey");
                                        break;
                                    } else {
                                        h90Var.b = nextString;
                                    }
                                case 1:
                                    h90Var.d = jsonReader.nextLong();
                                    h90Var.e = (byte) (h90Var.e | 1);
                                case 2:
                                    jsonReader.beginObject();
                                    String str5 = null;
                                    String str6 = null;
                                    while (true) {
                                        if (!jsonReader.hasNext()) {
                                            jsonReader.endObject();
                                            if (str5 != null && str6 != null) {
                                                h90Var.a = new j90(str5, str6);
                                                break;
                                            }
                                        } else {
                                            String nextName4 = jsonReader.nextName();
                                            nextName4.getClass();
                                            if (nextName4.equals("variantId")) {
                                                str6 = jsonReader.nextString();
                                                if (str6 == null) {
                                                    p3d.h("Null variantId");
                                                    break;
                                                }
                                            } else if (nextName4.equals("rolloutId")) {
                                                str5 = jsonReader.nextString();
                                                if (str5 == null) {
                                                    p3d.h("Null rolloutId");
                                                    break;
                                                }
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    String nextString2 = jsonReader.nextString();
                                    if (nextString2 == null) {
                                        p3d.h("Null parameterValue");
                                        break;
                                    } else {
                                        h90Var.c = nextString2;
                                    }
                                default:
                                    jsonReader.skipValue();
                            }
                        }
                    }
                    break;
                case 5:
                    jsonReader.beginObject();
                    byte b = 0;
                    int i = 0;
                    String str7 = null;
                    List list = null;
                    while (true) {
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (b == 1 && str7 != null && list != null) {
                                obj2 = new a90(str7, i, list);
                                break;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                if (str7 == null) {
                                    sb3.append(" name");
                                }
                                if ((b & 1) == 0) {
                                    sb3.append(" importance");
                                }
                                if (list == null) {
                                    sb3.append(" frames");
                                }
                                grb.i(bs2.o("Missing required properties:", sb3));
                                break;
                            }
                        } else {
                            String nextName5 = jsonReader.nextName();
                            nextName5.getClass();
                            switch (nextName5.hashCode()) {
                                case -1266514778:
                                    if (nextName5.equals("frames")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3373707:
                                    if (nextName5.equals("name")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2125650548:
                                    if (nextName5.equals("importance")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    list = b(jsonReader, new uy2((byte) 7));
                                    if (list == null) {
                                        p3d.h("Null frames");
                                        break;
                                    }
                                case 1:
                                    str7 = jsonReader.nextString();
                                    if (str7 == null) {
                                        p3d.h("Null name");
                                        break;
                                    }
                                case 2:
                                    i = jsonReader.nextInt();
                                    b = (byte) (b | 1);
                                default:
                                    jsonReader.skipValue();
                            }
                        }
                    }
                case 6:
                    jsonReader.beginObject();
                    byte b2 = 0;
                    String str8 = null;
                    String str9 = null;
                    long j = 0;
                    long j2 = 0;
                    while (true) {
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (b2 == 3 && str8 != null) {
                                obj2 = new x80(str8, str9, j, j2);
                                break;
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                if ((b2 & 1) == 0) {
                                    sb4.append(" baseAddress");
                                }
                                if ((b2 & 2) == 0) {
                                    sb4.append(" size");
                                }
                                if (str8 == null) {
                                    sb4.append(" name");
                                }
                                grb.i(bs2.o("Missing required properties:", sb4));
                                break;
                            }
                        } else {
                            String nextName6 = jsonReader.nextName();
                            nextName6.getClass();
                            switch (nextName6.hashCode()) {
                                case 3373707:
                                    if (nextName6.equals("name")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 3530753:
                                    if (nextName6.equals("size")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 3601339:
                                    if (nextName6.equals("uuid")) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1153765347:
                                    if (nextName6.equals("baseAddress")) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            switch (c4) {
                                case 0:
                                    str8 = jsonReader.nextString();
                                    if (str8 == null) {
                                        p3d.h("Null name");
                                        break;
                                    }
                                case 1:
                                    b2 = (byte) (b2 | 2);
                                    j2 = jsonReader.nextLong();
                                case 2:
                                    str9 = new String(Base64.decode(jsonReader.nextString(), 2), c03.a);
                                case 3:
                                    b2 = (byte) (b2 | 1);
                                    j = jsonReader.nextLong();
                                default:
                                    jsonReader.skipValue();
                            }
                        }
                    }
                default:
                    obj = f(jsonReader);
                    continue;
            }
            obj = obj2;
            arrayList.add(obj);
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static h80 c(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    p3d.h("Null key");
                    return null;
                }
            } else if (nextName.equals("value")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    p3d.h("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new h80(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0281, code lost:
    
        if (r4 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0283, code lost:
    
        r0.append(" name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0288, code lost:
    
        if (r8 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x028a, code lost:
    
        r0.append(" code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0290, code lost:
    
        if ((r6 & 1) != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0292, code lost:
    
        r0.append(" address");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0297, code lost:
    
        grb.i(bs2.o("Missing required properties:", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x029e, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02bf, code lost:
    
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02c4, code lost:
    
        if (r26 != null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02c6, code lost:
    
        r0.append(" signal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02cb, code lost:
    
        if (r27 != 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02cd, code lost:
    
        r0.append(" binaries");
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02d2, code lost:
    
        grb.i(bs2.o("Missing required properties:", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02d9, code lost:
    
        return r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [t80] */
    /* JADX WARN: Type inference failed for: r23v1, types: [y80] */
    /* JADX WARN: Type inference failed for: r23v2, types: [y80] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [cz2] */
    /* JADX WARN: Type inference failed for: r24v2, types: [f80] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v1, types: [hz2] */
    /* JADX WARN: Type inference failed for: r25v2, types: [k80] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t80 d(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        s80 s80Var = new s80();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (nextName.equals(TeXSymbolParser.TYPE_ATTR)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Object obj = null;
            switch (c) {
                case 0:
                    e90 e90Var = new e90();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                e90Var.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                e90Var.b = jsonReader.nextInt();
                                e90Var.g = (byte) (e90Var.g | 1);
                                break;
                            case 2:
                                e90Var.d = jsonReader.nextInt();
                                e90Var.g = (byte) (e90Var.g | 4);
                                break;
                            case 3:
                                e90Var.f = jsonReader.nextLong();
                                e90Var.g = (byte) (e90Var.g | 16);
                                break;
                            case 4:
                                e90Var.e = jsonReader.nextLong();
                                e90Var.g = (byte) (e90Var.g | 8);
                                break;
                            case 5:
                                e90Var.c = jsonReader.nextBoolean();
                                e90Var.g = (byte) (e90Var.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    s80Var.d = e90Var.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            list = b(jsonReader, new uy2((byte) 4));
                            if (list == null) {
                                p3d.h("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        grb.i("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    s80Var.f = new k90(list);
                    break;
                case 2:
                    jsonReader.beginObject();
                    w80 w80Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    d90 d90Var = null;
                    List list4 = null;
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        ?? r19 = obj;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (z && w80Var != null) {
                                s80Var.c = new v80(w80Var, list2, list3, bool, d90Var, list4, i);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                if (w80Var == null) {
                                    sb.append(" execution");
                                }
                                if (!z) {
                                    sb.append(" uiOrientation");
                                }
                                grb.i(bs2.o("Missing required properties:", sb));
                                return r19;
                            }
                        } else {
                            String nextName4 = jsonReader.nextName();
                            nextName4.getClass();
                            byte b = 6;
                            switch (nextName4.hashCode()) {
                                case -1405314732:
                                    if (nextName4.equals("appProcessDetails")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1332194002:
                                    if (nextName4.equals("background")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1090974952:
                                    if (nextName4.equals("execution")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -80231855:
                                    if (nextName4.equals("internalKeys")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 555169704:
                                    if (nextName4.equals("customAttributes")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 928737948:
                                    if (nextName4.equals("uiOrientation")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1847730860:
                                    if (nextName4.equals("currentProcessDetails")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    ArrayList arrayList = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add(g(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list4 = DesugarCollections.unmodifiableList(arrayList);
                                    break;
                                case 1:
                                    bool = Boolean.valueOf(jsonReader.nextBoolean());
                                    break;
                                case 2:
                                    jsonReader.beginObject();
                                    List list5 = r19;
                                    List list6 = list5;
                                    ?? r24 = list6;
                                    z80 z80Var = r24;
                                    z80 z80Var2 = z80Var;
                                    ?? r27 = z80Var2;
                                    ?? r23 = list6;
                                    ?? r25 = z80Var;
                                    while (jsonReader.hasNext()) {
                                        String nextName5 = jsonReader.nextName();
                                        nextName5.getClass();
                                        switch (nextName5.hashCode()) {
                                            case -1375141843:
                                                if (nextName5.equals("appExitInfo")) {
                                                    c4 = 0;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case -1337936983:
                                                if (nextName5.equals("threads")) {
                                                    c4 = 1;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case -902467928:
                                                if (nextName5.equals("signal")) {
                                                    c4 = 2;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 937615455:
                                                if (nextName5.equals("binaries")) {
                                                    c4 = 3;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 1467719157:
                                                if (nextName5.equals("profilingManagerInfo")) {
                                                    c4 = 4;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 1481625679:
                                                if (nextName5.equals("exception")) {
                                                    c4 = 5;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            default:
                                                c4 = 65535;
                                                break;
                                        }
                                        switch (c4) {
                                            case 0:
                                                r24 = a(jsonReader);
                                                break;
                                            case 1:
                                                list5 = b(jsonReader, new uy2((byte) 5));
                                                break;
                                            case 2:
                                                jsonReader.beginObject();
                                                long j = 0;
                                                String str = r19;
                                                String str2 = str;
                                                byte b2 = 0;
                                                while (jsonReader.hasNext()) {
                                                    String nextName6 = jsonReader.nextName();
                                                    nextName6.getClass();
                                                    switch (nextName6.hashCode()) {
                                                        case -1147692044:
                                                            if (nextName6.equals("address")) {
                                                                c5 = 0;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        case 3059181:
                                                            if (nextName6.equals("code")) {
                                                                c5 = 1;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        case 3373707:
                                                            if (nextName6.equals("name")) {
                                                                c5 = 2;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        default:
                                                            c5 = 65535;
                                                            break;
                                                    }
                                                    switch (c5) {
                                                        case 0:
                                                            j = jsonReader.nextLong();
                                                            b2 = (byte) (b2 | 1);
                                                            break;
                                                        case 1:
                                                            str2 = jsonReader.nextString();
                                                            if (str2 != null) {
                                                                break;
                                                            } else {
                                                                p3d.h("Null code");
                                                                return r19;
                                                            }
                                                        case 2:
                                                            str = jsonReader.nextString();
                                                            if (str != null) {
                                                                break;
                                                            } else {
                                                                p3d.h("Null name");
                                                                return r19;
                                                            }
                                                        default:
                                                            jsonReader.skipValue();
                                                            break;
                                                    }
                                                }
                                                jsonReader.endObject();
                                                if (b2 == 1 && str != null && str2 != null) {
                                                    z80Var2 = new z80(j, str, str2);
                                                    break;
                                                }
                                                break;
                                            case 3:
                                                r27 = b(jsonReader, new uy2(b));
                                                if (r27 != 0) {
                                                    break;
                                                } else {
                                                    p3d.h("Null binaries");
                                                    return r19;
                                                }
                                            case 4:
                                                r25 = h(jsonReader);
                                                break;
                                            case 5:
                                                r23 = e(jsonReader);
                                                break;
                                            default:
                                                jsonReader.skipValue();
                                                break;
                                        }
                                        b = 6;
                                        r23 = r23;
                                        r25 = r25;
                                        r27 = r27;
                                    }
                                    jsonReader.endObject();
                                    if (z80Var2 != null && r27 != 0) {
                                        w80Var = new w80(list5, r23, r24, r25, z80Var2, r27);
                                        break;
                                    }
                                    break;
                                case 3:
                                    ArrayList arrayList2 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList2.add(c(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list3 = DesugarCollections.unmodifiableList(arrayList2);
                                    break;
                                case 4:
                                    ArrayList arrayList3 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList3.add(c(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list2 = DesugarCollections.unmodifiableList(arrayList3);
                                    break;
                                case 5:
                                    i = jsonReader.nextInt();
                                    z = true;
                                    break;
                                case 6:
                                    d90Var = g(jsonReader);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                            obj = r19;
                        }
                    }
                    break;
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
                                p3d.h("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 == null) {
                        grb.i("Missing required properties: content");
                        return null;
                    }
                    s80Var.e = new g90(str3);
                    break;
                case 4:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        p3d.h("Null type");
                        return null;
                    }
                    s80Var.b = nextString;
                    break;
                case 5:
                    s80Var.a = jsonReader.nextLong();
                    s80Var.g = (byte) (s80Var.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return s80Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0046, code lost:
    
        if (r3.equals("reason") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y80 e(JsonReader jsonReader) {
        jsonReader.beginObject();
        byte b = 0;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        y80 y80Var = null;
        while (true) {
            char c = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new y80(str, str2, list, y80Var, i);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" type");
                }
                if (list == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                grb.i(bs2.o("Missing required properties:", sb));
                return null;
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -934964668:
                    break;
                case 3575610:
                    if (nextName.equals(TeXSymbolParser.TYPE_ATTR)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    list = b(jsonReader, new uy2((byte) 7));
                    if (list != null) {
                        break;
                    } else {
                        p3d.h("Null frames");
                        return null;
                    }
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    if (str != null) {
                        break;
                    } else {
                        p3d.h("Null type");
                        return null;
                    }
                case 3:
                    y80Var = e(jsonReader);
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static c90 f(JsonReader jsonReader) {
        b90 b90Var = new b90();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    b90Var.d = jsonReader.nextLong();
                    b90Var.f = (byte) (b90Var.f | 2);
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        p3d.h("Null symbol");
                        return null;
                    }
                    b90Var.b = nextString;
                    break;
                case "pc":
                    b90Var.a = jsonReader.nextLong();
                    b90Var.f = (byte) (b90Var.f | 1);
                    break;
                case "file":
                    b90Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    b90Var.e = jsonReader.nextInt();
                    b90Var.f = (byte) (b90Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b90Var.a();
    }

    public static d90 g(JsonReader jsonReader) {
        ae5 ae5Var = new ae5();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    ae5Var.a = jsonReader.nextInt();
                    ae5Var.d = (byte) (ae5Var.d | 1);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        p3d.h("Null processName");
                        return null;
                    }
                    ae5Var.e = nextString;
                    break;
                case "defaultProcess":
                    ae5Var.c = jsonReader.nextBoolean();
                    ae5Var.d = (byte) (ae5Var.d | 4);
                    break;
                case "importance":
                    ae5Var.b = jsonReader.nextInt();
                    ae5Var.d = (byte) (ae5Var.d | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return ae5Var.a();
    }

    public static k80 h(JsonReader jsonReader) {
        jsonReader.beginObject();
        l80 l80Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("profilingTrigger")) {
                jsonReader.beginObject();
                boolean z = false;
                int i = 0;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("trigger")) {
                        i = jsonReader.nextInt();
                        z = true;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (!z) {
                    grb.i("Missing required properties: trigger");
                    return null;
                }
                l80Var = new l80(i);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (l80Var != null) {
            return new k80(l80Var);
        }
        grb.i("Missing required properties: profilingTrigger");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c80 i(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        boolean z;
        char c4;
        Charset charset = c03.a;
        b80 b80Var = new b80();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = b(jsonReader, new uy2((byte) 3));
                            if (list == null) {
                                p3d.h("Null files");
                                return null;
                            }
                        } else if (nextName2.equals("orgId")) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        grb.i("Missing required properties: files");
                        return null;
                    }
                    b80Var.k = new i80(str, list);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        p3d.h("Null sdkVersion");
                        return null;
                    }
                    b80Var.a = nextString;
                    break;
                case 2:
                    b80Var.g = jsonReader.nextString();
                    break;
                case 3:
                    b80Var.l = a(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        p3d.h("Null buildVersion");
                        return null;
                    }
                    b80Var.h = nextString2;
                    break;
                case 5:
                    b80Var.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        p3d.h("Null gmpAppId");
                        return null;
                    }
                    b80Var.b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        p3d.h("Null installationUuid");
                        return null;
                    }
                    b80Var.d = nextString4;
                    break;
                case '\b':
                    b80Var.e = jsonReader.nextString();
                    break;
                case '\t':
                    b80Var.c = jsonReader.nextInt();
                    b80Var.m = (byte) (b80Var.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        p3d.h("Null displayVersion");
                        return null;
                    }
                    b80Var.i = nextString5;
                    break;
                case 11:
                    m80 m80Var = new m80();
                    m80Var.f = false;
                    m80Var.m = (byte) (m80Var.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                m80Var.d = jsonReader.nextLong();
                                m80Var.m = (byte) (m80Var.m | 1);
                                break;
                            case 1:
                                m80Var.c = jsonReader.nextString();
                                break;
                            case 2:
                                m80Var.b = new String(Base64.decode(jsonReader.nextString(), 2), c03.a);
                                break;
                            case 3:
                                m80Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                q80 q80Var = new q80();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            q80Var.f = jsonReader.nextBoolean();
                                            q80Var.j = (byte) (q80Var.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                p3d.h("Null manufacturer");
                                                return null;
                                            }
                                            q80Var.h = nextString6;
                                            break;
                                        case 2:
                                            q80Var.d = jsonReader.nextLong();
                                            q80Var.j = (byte) (q80Var.j | 4);
                                            break;
                                        case 3:
                                            q80Var.a = jsonReader.nextInt();
                                            q80Var.j = (byte) (q80Var.j | 1);
                                            break;
                                        case 4:
                                            q80Var.e = jsonReader.nextLong();
                                            q80Var.j = (byte) (q80Var.j | 8);
                                            break;
                                        case 5:
                                            q80Var.c = jsonReader.nextInt();
                                            q80Var.j = (byte) (q80Var.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                p3d.h("Null model");
                                                return null;
                                            }
                                            q80Var.b = nextString7;
                                            break;
                                        case 7:
                                            q80Var.g = jsonReader.nextInt();
                                            q80Var.j = (byte) (q80Var.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                p3d.h("Null modelClass");
                                                return null;
                                            }
                                            q80Var.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                m80Var.j = q80Var.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                m80Var.k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                l90 l90Var = new l90();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z = false;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z = true;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z = 2;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z = 3;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        default:
                                            z = -1;
                                            break;
                                    }
                                    switch (z) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                p3d.h("Null buildVersion");
                                                return null;
                                            }
                                            l90Var.c = nextString9;
                                            break;
                                        case true:
                                            l90Var.d = jsonReader.nextBoolean();
                                            l90Var.e = (byte) (l90Var.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                p3d.h("Null version");
                                                return null;
                                            }
                                            l90Var.b = nextString10;
                                            break;
                                        case true:
                                            l90Var.a = jsonReader.nextInt();
                                            l90Var.e = (byte) (l90Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                m80Var.i = l90Var.a();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c4 = 4;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c4 = 5;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    switch (c4) {
                                        case 0:
                                            str7 = jsonReader.nextString();
                                            if (str7 != null) {
                                                break;
                                            } else {
                                                p3d.h("Null identifier");
                                                return null;
                                            }
                                        case 1:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str2 = jsonReader.nextString();
                                            if (str2 != null) {
                                                break;
                                            } else {
                                                p3d.h("Null version");
                                                return null;
                                            }
                                        case 4:
                                            str4 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str3 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str7 != null && str2 != null) {
                                    m80Var.g = new o80(str7, str2, str3, str4, str5, str6);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (str7 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str2 == null) {
                                        sb.append(" version");
                                    }
                                    grb.i(bs2.o("Missing required properties:", sb));
                                    return null;
                                }
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            p3d.h("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 == null) {
                                    grb.i("Missing required properties: identifier");
                                    return null;
                                }
                                m80Var.h = new n90(str8);
                                break;
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    p3d.h("Null generator");
                                    return null;
                                }
                                m80Var.a = nextString11;
                                break;
                            case '\n':
                                m80Var.f = jsonReader.nextBoolean();
                                m80Var.m = (byte) (m80Var.m | 2);
                                break;
                            case 11:
                                m80Var.l = jsonReader.nextInt();
                                m80Var.m = (byte) (m80Var.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    b80Var.j = m80Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b80Var.a();
    }

    public static c80 j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                c80 i = i(jsonReader);
                jsonReader.close();
                return i;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
