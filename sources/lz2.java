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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lz2 {
    public static final gi3 a;

    static {
        qu5 qu5Var = new qu5();
        s50 s50Var = s50.a;
        qu5Var.a(hz2.class, s50Var);
        qu5Var.a(a80.class, s50Var);
        a60 a60Var = a60.a;
        qu5Var.a(gz2.class, a60Var);
        qu5Var.a(l80.class, a60Var);
        x50 x50Var = x50.a;
        qu5Var.a(oy2.class, x50Var);
        qu5Var.a(m80.class, x50Var);
        y50 y50Var = y50.a;
        qu5Var.a(ny2.class, y50Var);
        qu5Var.a(n80.class, y50Var);
        q60 q60Var = q60.a;
        qu5Var.a(fz2.class, q60Var);
        qu5Var.a(l90.class, q60Var);
        p60 p60Var = p60.a;
        qu5Var.a(ez2.class, p60Var);
        qu5Var.a(k90.class, p60Var);
        z50 z50Var = z50.a;
        qu5Var.a(py2.class, z50Var);
        qu5Var.a(p80.class, z50Var);
        k60 k60Var = k60.a;
        qu5Var.a(dz2.class, k60Var);
        qu5Var.a(r80.class, k60Var);
        b60 b60Var = b60.a;
        qu5Var.a(xy2.class, b60Var);
        qu5Var.a(t80.class, b60Var);
        d60 d60Var = d60.a;
        qu5Var.a(vy2.class, d60Var);
        qu5Var.a(u80.class, d60Var);
        g60 g60Var = g60.a;
        qu5Var.a(uy2.class, g60Var);
        qu5Var.a(y80.class, g60Var);
        h60 h60Var = h60.a;
        qu5Var.a(ty2.class, h60Var);
        qu5Var.a(a90.class, h60Var);
        e60 e60Var = e60.a;
        qu5Var.a(ry2.class, e60Var);
        qu5Var.a(w80.class, e60Var);
        q50 q50Var = q50.a;
        qu5Var.a(hy2.class, q50Var);
        qu5Var.a(d80.class, q50Var);
        p50 p50Var = p50.a;
        qu5Var.a(gy2.class, p50Var);
        qu5Var.a(e80.class, p50Var);
        v50 v50Var = v50.a;
        qu5Var.a(my2.class, v50Var);
        qu5Var.a(i80.class, v50Var);
        w50 w50Var = w50.a;
        qu5Var.a(ly2.class, w50Var);
        qu5Var.a(j80.class, w50Var);
        f60 f60Var = f60.a;
        qu5Var.a(sy2.class, f60Var);
        qu5Var.a(x80.class, f60Var);
        c60 c60Var = c60.a;
        qu5Var.a(qy2.class, c60Var);
        qu5Var.a(v80.class, c60Var);
        r50 r50Var = r50.a;
        qu5Var.a(iy2.class, r50Var);
        qu5Var.a(f80.class, r50Var);
        i60 i60Var = i60.a;
        qu5Var.a(wy2.class, i60Var);
        qu5Var.a(b90.class, i60Var);
        j60 j60Var = j60.a;
        qu5Var.a(yy2.class, j60Var);
        qu5Var.a(d90.class, j60Var);
        l60 l60Var = l60.a;
        qu5Var.a(zy2.class, l60Var);
        qu5Var.a(e90.class, l60Var);
        o60 o60Var = o60.a;
        qu5Var.a(cz2.class, o60Var);
        qu5Var.a(i90.class, o60Var);
        m60 m60Var = m60.a;
        qu5Var.a(bz2.class, m60Var);
        qu5Var.a(g90.class, m60Var);
        n60 n60Var = n60.a;
        qu5Var.a(az2.class, n60Var);
        qu5Var.a(h90.class, n60Var);
        t50 t50Var = t50.a;
        qu5Var.a(ky2.class, t50Var);
        qu5Var.a(g80.class, t50Var);
        u50 u50Var = u50.a;
        qu5Var.a(jy2.class, u50Var);
        qu5Var.a(h80.class, u50Var);
        qu5Var.d = true;
        a = new gi3(qu5Var);
    }

    public static d80 a(JsonReader jsonReader) {
        c80 c80Var = new c80();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    c80Var.i = b(jsonReader, new k32((byte) 27));
                    break;
                case "pid":
                    c80Var.a = jsonReader.nextInt();
                    c80Var.j = (byte) (c80Var.j | 1);
                    break;
                case "pss":
                    c80Var.e = jsonReader.nextLong();
                    c80Var.j = (byte) (c80Var.j | 8);
                    break;
                case "rss":
                    c80Var.f = jsonReader.nextLong();
                    c80Var.j = (byte) (c80Var.j | 16);
                    break;
                case "timestamp":
                    c80Var.g = jsonReader.nextLong();
                    c80Var.j = (byte) (c80Var.j | 32);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        fvc.f("Null processName");
                        return null;
                    }
                    c80Var.b = nextString;
                    break;
                case "reasonCode":
                    c80Var.c = jsonReader.nextInt();
                    c80Var.j = (byte) (c80Var.j | 2);
                    break;
                case "traceFile":
                    c80Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    c80Var.d = jsonReader.nextInt();
                    c80Var.j = (byte) (c80Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c80Var.a();
    }

    public static List b(JsonReader jsonReader, kz2 kz2Var) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(kz2Var.a(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static f80 c(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    fvc.f("Null key");
                    return null;
                }
            } else if (nextName.equals("value")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    fvc.f("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new f80(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        sc8.j(ir2.o("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x027f, code lost:
    
        if (r5 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0281, code lost:
    
        r0.append(" name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0286, code lost:
    
        if (r6 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0288, code lost:
    
        r0.append(" code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x028e, code lost:
    
        if ((r4 & 1) != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0290, code lost:
    
        r0.append(" address");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0295, code lost:
    
        sc8.j(ir2.o("Missing required properties:", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x029c, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02bd, code lost:
    
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02c2, code lost:
    
        if (r26 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02c4, code lost:
    
        r0.append(" signal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02c9, code lost:
    
        if (r27 != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02cb, code lost:
    
        r0.append(" binaries");
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02d0, code lost:
    
        sc8.j(ir2.o("Missing required properties:", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02d7, code lost:
    
        return r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [r80] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [w80] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3, types: [w80] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [my2] */
    /* JADX WARN: Type inference failed for: r25v2, types: [i80] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r80 d(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        q80 q80Var = new q80();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            byte b = 0;
            byte b2 = 1;
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
                    c90 c90Var = new c90();
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
                                c90Var.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                c90Var.b = jsonReader.nextInt();
                                c90Var.g = (byte) (c90Var.g | 1);
                                break;
                            case 2:
                                c90Var.d = jsonReader.nextInt();
                                c90Var.g = (byte) (c90Var.g | 4);
                                break;
                            case 3:
                                c90Var.f = jsonReader.nextLong();
                                c90Var.g = (byte) (c90Var.g | 16);
                                break;
                            case 4:
                                c90Var.e = jsonReader.nextLong();
                                c90Var.g = (byte) (c90Var.g | 8);
                                break;
                            case 5:
                                c90Var.c = jsonReader.nextBoolean();
                                c90Var.g = (byte) (c90Var.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    q80Var.d = c90Var.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            list = b(jsonReader, new k32((byte) 29));
                            if (list == null) {
                                fvc.f("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        sc8.j("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    q80Var.f = new i90(list);
                    break;
                case 2:
                    jsonReader.beginObject();
                    u80 u80Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    b90 b90Var = null;
                    List list4 = null;
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        ?? r19 = obj;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (z && u80Var != null) {
                                q80Var.c = new t80(u80Var, list2, list3, bool, b90Var, list4, i);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                if (u80Var == null) {
                                    sb.append(" execution");
                                }
                                if (!z) {
                                    sb.append(" uiOrientation");
                                }
                                sc8.j(ir2.o("Missing required properties:", sb));
                                return r19;
                            }
                        } else {
                            String nextName4 = jsonReader.nextName();
                            nextName4.getClass();
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
                                    ?? r23 = list5;
                                    d80 d80Var = r23;
                                    ?? r25 = d80Var;
                                    x80 x80Var = r25;
                                    ?? r27 = x80Var;
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
                                                d80Var = a(jsonReader);
                                                break;
                                            case 1:
                                                list5 = b(jsonReader, new jz2(b));
                                                break;
                                            case 2:
                                                jsonReader.beginObject();
                                                long j = 0;
                                                byte b3 = 0;
                                                String str = r19;
                                                String str2 = str;
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
                                                            b3 = (byte) (b3 | 1);
                                                            j = jsonReader.nextLong();
                                                            break;
                                                        case 1:
                                                            str2 = jsonReader.nextString();
                                                            if (str2 != null) {
                                                                break;
                                                            } else {
                                                                fvc.f("Null code");
                                                                return r19;
                                                            }
                                                        case 2:
                                                            str = jsonReader.nextString();
                                                            if (str != null) {
                                                                break;
                                                            } else {
                                                                fvc.f("Null name");
                                                                return r19;
                                                            }
                                                        default:
                                                            jsonReader.skipValue();
                                                            break;
                                                    }
                                                }
                                                jsonReader.endObject();
                                                if (b3 == 1 && str != null && str2 != null) {
                                                    x80Var = new x80(j, str, str2);
                                                    break;
                                                }
                                                break;
                                            case 3:
                                                r27 = b(jsonReader, new jz2(b2));
                                                if (r27 != 0) {
                                                    break;
                                                } else {
                                                    fvc.f("Null binaries");
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
                                    }
                                    jsonReader.endObject();
                                    if (x80Var != null && r27 != 0) {
                                        u80Var = new u80(list5, r23, d80Var, r25, x80Var, r27);
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
                                    b90Var = g(jsonReader);
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
                                fvc.f("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 == null) {
                        sc8.j("Missing required properties: content");
                        return null;
                    }
                    q80Var.e = new e90(str3);
                    break;
                case 4:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        fvc.f("Null type");
                        return null;
                    }
                    q80Var.b = nextString;
                    break;
                case 5:
                    q80Var.a = jsonReader.nextLong();
                    q80Var.g = (byte) (q80Var.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return q80Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0047, code lost:
    
        if (r3.equals("reason") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w80 e(JsonReader jsonReader) {
        jsonReader.beginObject();
        byte b = 0;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        w80 w80Var = null;
        while (true) {
            char c = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new w80(str, str2, list, w80Var, i);
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
                sc8.j(ir2.o("Missing required properties:", sb));
                return null;
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            byte b2 = 2;
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
                    list = b(jsonReader, new jz2(b2));
                    if (list != null) {
                        break;
                    } else {
                        fvc.f("Null frames");
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
                        fvc.f("Null type");
                        return null;
                    }
                case 3:
                    w80Var = e(jsonReader);
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

    public static a90 f(JsonReader jsonReader) {
        z80 z80Var = new z80();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    z80Var.d = jsonReader.nextLong();
                    z80Var.f = (byte) (z80Var.f | 2);
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        fvc.f("Null symbol");
                        return null;
                    }
                    z80Var.b = nextString;
                    break;
                case "pc":
                    z80Var.a = jsonReader.nextLong();
                    z80Var.f = (byte) (z80Var.f | 1);
                    break;
                case "file":
                    z80Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    z80Var.e = jsonReader.nextInt();
                    z80Var.f = (byte) (z80Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return z80Var.a();
    }

    public static b90 g(JsonReader jsonReader) {
        zb5 zb5Var = new zb5();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    zb5Var.a = jsonReader.nextInt();
                    zb5Var.d = (byte) (zb5Var.d | 1);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        fvc.f("Null processName");
                        return null;
                    }
                    zb5Var.e = nextString;
                    break;
                case "defaultProcess":
                    zb5Var.c = jsonReader.nextBoolean();
                    zb5Var.d = (byte) (zb5Var.d | 4);
                    break;
                case "importance":
                    zb5Var.b = jsonReader.nextInt();
                    zb5Var.d = (byte) (zb5Var.d | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zb5Var.a();
    }

    public static i80 h(JsonReader jsonReader) {
        jsonReader.beginObject();
        j80 j80Var = null;
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
                    sc8.j("Missing required properties: trigger");
                    return null;
                }
                j80Var = new j80(i);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (j80Var != null) {
            return new i80(j80Var);
        }
        sc8.j("Missing required properties: profilingTrigger");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a80 i(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        boolean z;
        boolean z2;
        Charset charset = hz2.a;
        z70 z70Var = new z70();
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
                            list = b(jsonReader, new k32((byte) 28));
                            if (list == null) {
                                fvc.f("Null files");
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
                        sc8.j("Missing required properties: files");
                        return null;
                    }
                    z70Var.k = new g80(str, list);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        fvc.f("Null sdkVersion");
                        return null;
                    }
                    z70Var.a = nextString;
                    break;
                case 2:
                    z70Var.g = jsonReader.nextString();
                    break;
                case 3:
                    z70Var.l = a(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        fvc.f("Null buildVersion");
                        return null;
                    }
                    z70Var.h = nextString2;
                    break;
                case 5:
                    z70Var.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        fvc.f("Null gmpAppId");
                        return null;
                    }
                    z70Var.b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        fvc.f("Null installationUuid");
                        return null;
                    }
                    z70Var.d = nextString4;
                    break;
                case '\b':
                    z70Var.e = jsonReader.nextString();
                    break;
                case '\t':
                    z70Var.c = jsonReader.nextInt();
                    z70Var.m = (byte) (z70Var.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        fvc.f("Null displayVersion");
                        return null;
                    }
                    z70Var.i = nextString5;
                    break;
                case 11:
                    k80 k80Var = new k80();
                    k80Var.f = false;
                    k80Var.m = (byte) (k80Var.m | 2);
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
                                k80Var.d = jsonReader.nextLong();
                                k80Var.m = (byte) (k80Var.m | 1);
                                break;
                            case 1:
                                k80Var.c = jsonReader.nextString();
                                break;
                            case 2:
                                k80Var.b = new String(Base64.decode(jsonReader.nextString(), 2), hz2.a);
                                break;
                            case 3:
                                k80Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                o80 o80Var = new o80();
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
                                            o80Var.f = jsonReader.nextBoolean();
                                            o80Var.j = (byte) (o80Var.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                fvc.f("Null manufacturer");
                                                return null;
                                            }
                                            o80Var.h = nextString6;
                                            break;
                                        case 2:
                                            o80Var.d = jsonReader.nextLong();
                                            o80Var.j = (byte) (o80Var.j | 4);
                                            break;
                                        case 3:
                                            o80Var.a = jsonReader.nextInt();
                                            o80Var.j = (byte) (o80Var.j | 1);
                                            break;
                                        case 4:
                                            o80Var.e = jsonReader.nextLong();
                                            o80Var.j = (byte) (o80Var.j | 8);
                                            break;
                                        case 5:
                                            o80Var.c = jsonReader.nextInt();
                                            o80Var.j = (byte) (o80Var.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                fvc.f("Null model");
                                                return null;
                                            }
                                            o80Var.b = nextString7;
                                            break;
                                        case 7:
                                            o80Var.g = jsonReader.nextInt();
                                            o80Var.j = (byte) (o80Var.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                fvc.f("Null modelClass");
                                                return null;
                                            }
                                            o80Var.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                k80Var.j = o80Var.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                k80Var.k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                j90 j90Var = new j90();
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
                                                fvc.f("Null buildVersion");
                                                return null;
                                            }
                                            j90Var.c = nextString9;
                                            break;
                                        case true:
                                            j90Var.d = jsonReader.nextBoolean();
                                            j90Var.e = (byte) (j90Var.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                fvc.f("Null version");
                                                return null;
                                            }
                                            j90Var.b = nextString10;
                                            break;
                                        case true:
                                            j90Var.a = jsonReader.nextInt();
                                            j90Var.e = (byte) (j90Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                k80Var.i = j90Var.a();
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
                                                z2 = false;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                z2 = true;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                z2 = 2;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                z2 = 3;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                z2 = 4;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                z2 = 5;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        default:
                                            z2 = -1;
                                            break;
                                    }
                                    switch (z2) {
                                        case false:
                                            str7 = jsonReader.nextString();
                                            if (str7 != null) {
                                                break;
                                            } else {
                                                fvc.f("Null identifier");
                                                return null;
                                            }
                                        case true:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str2 = jsonReader.nextString();
                                            if (str2 != null) {
                                                break;
                                            } else {
                                                fvc.f("Null version");
                                                return null;
                                            }
                                        case true:
                                            str4 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str3 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str7 != null && str2 != null) {
                                    k80Var.g = new m80(str7, str2, str3, str4, str5, str6);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (str7 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str2 == null) {
                                        sb.append(" version");
                                    }
                                    sc8.j(ir2.o("Missing required properties:", sb));
                                    return null;
                                }
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            fvc.f("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 == null) {
                                    sc8.j("Missing required properties: identifier");
                                    return null;
                                }
                                k80Var.h = new l90(str8);
                                break;
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    fvc.f("Null generator");
                                    return null;
                                }
                                k80Var.a = nextString11;
                                break;
                            case '\n':
                                k80Var.f = jsonReader.nextBoolean();
                                k80Var.m = (byte) (k80Var.m | 2);
                                break;
                            case 11:
                                k80Var.l = jsonReader.nextInt();
                                k80Var.m = (byte) (k80Var.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    z70Var.j = k80Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return z70Var.a();
    }

    public static a80 j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                a80 i = i(jsonReader);
                jsonReader.close();
                return i;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
