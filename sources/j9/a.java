package j9;

import android.util.Base64;
import android.util.JsonReader;
import h7.d8;
import i9.a0;
import i9.a1;
import i9.a2;
import i9.b;
import i9.b0;
import i9.b2;
import i9.c;
import i9.c0;
import i9.c2;
import i9.d0;
import i9.d2;
import i9.e;
import i9.e0;
import i9.e2;
import i9.f;
import i9.f0;
import i9.f1;
import i9.g;
import i9.g0;
import i9.g1;
import i9.h;
import i9.h0;
import i9.h1;
import i9.i;
import i9.i0;
import i9.i1;
import i9.j;
import i9.j0;
import i9.j1;
import i9.k;
import i9.k0;
import i9.k1;
import i9.l;
import i9.l0;
import i9.l1;
import i9.m;
import i9.m0;
import i9.m1;
import i9.n;
import i9.n0;
import i9.n1;
import i9.o;
import i9.o0;
import i9.o1;
import i9.p;
import i9.p0;
import i9.p1;
import i9.q;
import i9.q0;
import i9.q1;
import i9.r;
import i9.r0;
import i9.r1;
import i9.s;
import i9.s0;
import i9.s1;
import i9.t;
import i9.t0;
import i9.t1;
import i9.u;
import i9.u0;
import i9.u1;
import i9.v;
import i9.v0;
import i9.v1;
import i9.w;
import i9.w0;
import i9.w1;
import i9.x;
import i9.x0;
import i9.x1;
import i9.y;
import i9.y0;
import i9.y1;
import i9.z;
import i9.z0;
import i9.z1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import u9.d;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public static final o1.a a;

    static {
        d dVar = new d();
        i9.d dVar2 = i9.d.a;
        dVar.i(e2.class, dVar2);
        dVar.i(a0.class, dVar2);
        j jVar = j.a;
        dVar.i(d2.class, jVar);
        dVar.i(h0.class, jVar);
        g gVar = g.a;
        dVar.i(l1.class, gVar);
        dVar.i(i0.class, gVar);
        h hVar = h.a;
        dVar.i(k1.class, hVar);
        dVar.i(j0.class, hVar);
        z zVar = z.a;
        dVar.i(c2.class, zVar);
        dVar.i(a1.class, zVar);
        y yVar = y.a;
        dVar.i(b2.class, yVar);
        dVar.i(z0.class, yVar);
        i iVar = i.a;
        dVar.i(m1.class, iVar);
        dVar.i(k0.class, iVar);
        t tVar = t.a;
        dVar.i(a2.class, tVar);
        dVar.i(l0.class, tVar);
        k kVar = k.a;
        dVar.i(u1.class, kVar);
        dVar.i(m0.class, kVar);
        m mVar = m.a;
        dVar.i(s1.class, mVar);
        dVar.i(n0.class, mVar);
        p pVar = p.a;
        dVar.i(r1.class, pVar);
        dVar.i(r0.class, pVar);
        q qVar = q.a;
        dVar.i(q1.class, qVar);
        dVar.i(s0.class, qVar);
        n nVar = n.a;
        dVar.i(o1.class, nVar);
        dVar.i(p0.class, nVar);
        b bVar = b.a;
        dVar.i(g1.class, bVar);
        dVar.i(b0.class, bVar);
        i9.a aVar = i9.a.a;
        dVar.i(f1.class, aVar);
        dVar.i(c0.class, aVar);
        o oVar = o.a;
        dVar.i(p1.class, oVar);
        dVar.i(q0.class, oVar);
        l lVar = l.a;
        dVar.i(n1.class, lVar);
        dVar.i(o0.class, lVar);
        c cVar = c.a;
        dVar.i(h1.class, cVar);
        dVar.i(d0.class, cVar);
        r rVar = r.a;
        dVar.i(t1.class, rVar);
        dVar.i(t0.class, rVar);
        s sVar = s.a;
        dVar.i(v1.class, sVar);
        dVar.i(u0.class, sVar);
        u uVar = u.a;
        dVar.i(w1.class, uVar);
        dVar.i(v0.class, uVar);
        x xVar = x.a;
        dVar.i(z1.class, xVar);
        dVar.i(y0.class, xVar);
        v vVar = v.a;
        dVar.i(y1.class, vVar);
        dVar.i(w0.class, vVar);
        w wVar = w.a;
        dVar.i(x1.class, wVar);
        dVar.i(x0.class, wVar);
        e eVar = e.a;
        dVar.i(j1.class, eVar);
        dVar.i(e0.class, eVar);
        f fVar = f.a;
        dVar.i(i1.class, fVar);
        dVar.i(f0.class, fVar);
        dVar.d = true;
        a = new o1.a(dVar, 27);
    }

    public static s0 a(JsonReader jsonReader) {
        a5.j jVar = new a5.j();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    jVar.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    jVar.b = nextString;
                    break;
                case "pc":
                    jVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    jVar.c = jsonReader.nextString();
                    break;
                case "importance":
                    jVar.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return jVar.i();
    }

    public static d0 b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (nextName.equals("value")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " key" : "";
        if (str2 == null) {
            str3 = str3.concat(" value");
        }
        if (str3.isEmpty()) {
            return new d0(str, str2);
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static b0 c(JsonReader jsonReader) {
        e3.f fVar = new e3.f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    fVar.i = d(jsonReader, new j3.d0(15));
                    break;
                case "pid":
                    fVar.a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    fVar.e = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    fVar.f = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    fVar.g = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    fVar.b = nextString;
                    break;
                case "reasonCode":
                    fVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    fVar.h = jsonReader.nextString();
                    break;
                case "importance":
                    fVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return fVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static List d(JsonReader jsonReader, j3.d0 d0Var) {
        String str;
        Object c0Var;
        char c3;
        char c6;
        Object obj;
        char c10;
        char c11;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            boolean z10 = false;
            String str2 = null;
            Long l10 = null;
            String str3 = null;
            String str4 = null;
            switch (d0Var.a) {
                case 15:
                    jsonReader.beginObject();
                    String str5 = null;
                    String str6 = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -609862170:
                                if (nextName.equals("libraryName")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3002454:
                                if (nextName.equals("arch")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 230943785:
                                if (nextName.equals("buildId")) {
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
                                str5 = jsonReader.nextString();
                                if (str5 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                break;
                            case 1:
                                String nextString = jsonReader.nextString();
                                if (nextString == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                str2 = nextString;
                                break;
                            case 2:
                                str6 = jsonReader.nextString();
                                if (str6 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    str = str2 == null ? " arch" : "";
                    if (str5 == null) {
                        str = str.concat(" libraryName");
                    }
                    if (str6 == null) {
                        str = u3.c.k(str, " buildId");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    c0Var = new c0(str2, str5, str6);
                    continue;
                    arrayList.add(c0Var);
                case 16:
                    jsonReader.beginObject();
                    byte[] bArr = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("filename")) {
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 == null) {
                                throw new NullPointerException("Null filename");
                            }
                            str4 = nextString2;
                        } else if (nextName2.equals("contents")) {
                            bArr = Base64.decode(jsonReader.nextString(), 2);
                            if (bArr == null) {
                                throw new NullPointerException("Null contents");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    str = str4 == null ? " filename" : "";
                    if (bArr == null) {
                        str = str.concat(" contents");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    obj = new f0(str4, bArr);
                    break;
                case 17:
                    com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(11, z10);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            default:
                                c6 = 65535;
                                break;
                        }
                        switch (c6) {
                            case 0:
                                String nextString3 = jsonReader.nextString();
                                if (nextString3 == null) {
                                    throw new NullPointerException("Null parameterKey");
                                }
                                sVar.b = nextString3;
                                break;
                            case 1:
                                sVar.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 2:
                                jsonReader.beginObject();
                                String str7 = null;
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    if (nextName4.equals("variantId")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    } else if (nextName4.equals("rolloutId")) {
                                        str7 = jsonReader.nextString();
                                        if (str7 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str9 = str7 == null ? " rolloutId" : "";
                                if (str8 == null) {
                                    str9 = str9.concat(" variantId");
                                }
                                if (!str9.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str9));
                                }
                                sVar.c = new x0(str7, str8);
                                break;
                            case 3:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 == null) {
                                    throw new NullPointerException("Null parameterValue");
                                }
                                sVar.d = nextString4;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0Var = sVar.l();
                    continue;
                    arrayList.add(c0Var);
                case 18:
                    jsonReader.beginObject();
                    Integer num = null;
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -1266514778:
                                if (nextName5.equals("frames")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3373707:
                                if (nextName5.equals("name")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2125650548:
                                if (nextName5.equals("importance")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                list = d(jsonReader, new j3.d0(20));
                                if (list == null) {
                                    throw new NullPointerException("Null frames");
                                }
                            case 1:
                                String nextString5 = jsonReader.nextString();
                                if (nextString5 == null) {
                                    throw new NullPointerException("Null name");
                                }
                                str3 = nextString5;
                            case 2:
                                num = Integer.valueOf(jsonReader.nextInt());
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str10 = str3 != null ? "" : " name";
                    if (num == null) {
                        str10 = str10.concat(" importance");
                    }
                    if (list == null) {
                        str10 = u3.c.k(str10, " frames");
                    }
                    if (!str10.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str10));
                    }
                    obj = new r0(str3, num.intValue(), list);
                    break;
                case 19:
                    jsonReader.beginObject();
                    Long l11 = null;
                    String str11 = null;
                    String str12 = null;
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case 3373707:
                                if (nextName6.equals("name")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3530753:
                                if (nextName6.equals("size")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3601339:
                                if (nextName6.equals("uuid")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1153765347:
                                if (nextName6.equals("baseAddress")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                String nextString6 = jsonReader.nextString();
                                if (nextString6 == null) {
                                    throw new NullPointerException("Null name");
                                }
                                str11 = nextString6;
                                break;
                            case 1:
                                l11 = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 2:
                                str12 = new String(Base64.decode(jsonReader.nextString(), 2), e2.a);
                                break;
                            case 3:
                                l10 = Long.valueOf(jsonReader.nextLong());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    str = l10 == null ? " baseAddress" : "";
                    if (l11 == null) {
                        str = str.concat(" size");
                    }
                    if (str11 == null) {
                        str = u3.c.k(str, " name");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    c0Var = new o0(str11, l10.longValue(), l11.longValue(), str12);
                    continue;
                    arrayList.add(c0Var);
                default:
                    c0Var = a(jsonReader);
                    continue;
                    arrayList.add(c0Var);
            }
            c0Var = obj;
            arrayList.add(c0Var);
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static l0 e(JsonReader jsonReader) {
        char c3;
        char c6;
        String str;
        char c10;
        List list;
        char c11;
        List list2;
        List list3;
        char c12;
        bg.c2 c2Var = new bg.c2();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals(TeXSymbolParser.TYPE_ATTR)) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c3 = 5;
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
                    bg.c2 c2Var2 = new bg.c2();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c6 = 4;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c6 = 5;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            default:
                                c6 = 65535;
                                break;
                        }
                        switch (c6) {
                            case 0:
                                c2Var2.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                c2Var2.b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 2:
                                c2Var2.d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 3:
                                c2Var2.f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                c2Var2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 5:
                                c2Var2.c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c2Var.d = c2Var2.h();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            List d = d(jsonReader, new j3.d0(17));
                            if (d == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                            list4 = d;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    str = list4 == null ? " rolloutAssignments" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    c2Var.f = new y0(list4);
                    break;
                case 2:
                    jsonReader.beginObject();
                    n0 n0Var = null;
                    List list5 = null;
                    List list6 = null;
                    Boolean bool = null;
                    t0 t0Var = null;
                    List list7 = null;
                    Integer num = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                List list8 = list5;
                                list = list6;
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list7 = DesugarCollections.unmodifiableList(arrayList);
                                list5 = list8;
                                list6 = list;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                list5 = list5;
                            case 2:
                                jsonReader.beginObject();
                                List list9 = null;
                                p0 p0Var = null;
                                b0 b0Var = null;
                                q0 q0Var = null;
                                List list10 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                            list2 = list5;
                                            list3 = list6;
                                            b0Var = c(jsonReader);
                                            list5 = list2;
                                            list6 = list3;
                                        case 1:
                                            list2 = list5;
                                            list3 = list6;
                                            list9 = d(jsonReader, new j3.d0(18));
                                            list5 = list2;
                                            list6 = list3;
                                        case 2:
                                            jsonReader.beginObject();
                                            String str2 = null;
                                            String str3 = null;
                                            Long l10 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c12 = 0;
                                                            break;
                                                        }
                                                        c12 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c12 = 1;
                                                            break;
                                                        }
                                                        c12 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c12 = 2;
                                                            break;
                                                        }
                                                        c12 = 65535;
                                                        break;
                                                    default:
                                                        c12 = 65535;
                                                        break;
                                                }
                                                switch (c12) {
                                                    case 0:
                                                        l10 = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case 1:
                                                        str3 = jsonReader.nextString();
                                                        if (str3 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                    case 2:
                                                        str2 = jsonReader.nextString();
                                                        if (str2 == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            String str4 = str2 == null ? " name" : "";
                                            if (str3 == null) {
                                                str4 = str4.concat(" code");
                                            }
                                            if (l10 == null) {
                                                str4 = u3.c.k(str4, " address");
                                            }
                                            if (!str4.isEmpty()) {
                                                throw new IllegalStateException("Missing required properties:".concat(str4));
                                            }
                                            list2 = list5;
                                            list3 = list6;
                                            q0Var = new q0(l10.longValue(), str2, str3);
                                            list5 = list2;
                                            list6 = list3;
                                        case 3:
                                            list10 = d(jsonReader, new j3.d0(19));
                                            if (list10 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            list2 = list5;
                                            list3 = list6;
                                            list5 = list2;
                                            list6 = list3;
                                        case 4:
                                            p0Var = f(jsonReader);
                                            list2 = list5;
                                            list3 = list6;
                                            list5 = list2;
                                            list6 = list3;
                                        default:
                                            jsonReader.skipValue();
                                            list2 = list5;
                                            list3 = list6;
                                            list5 = list2;
                                            list6 = list3;
                                    }
                                }
                                List list11 = list5;
                                list = list6;
                                jsonReader.endObject();
                                String str5 = q0Var == null ? " signal" : "";
                                if (list10 == null) {
                                    str5 = str5.concat(" binaries");
                                }
                                if (!str5.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str5));
                                }
                                list5 = list11;
                                n0Var = new n0(list9, p0Var, b0Var, q0Var, list10);
                                list6 = list;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list6 = DesugarCollections.unmodifiableList(arrayList2);
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list5 = DesugarCollections.unmodifiableList(arrayList3);
                            case 5:
                                num = Integer.valueOf(jsonReader.nextInt());
                            case 6:
                                t0Var = g(jsonReader);
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    List list12 = list5;
                    List list13 = list6;
                    jsonReader.endObject();
                    str = n0Var == null ? " execution" : "";
                    if (num == null) {
                        str = str.concat(" uiOrientation");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    c2Var.c = new m0(n0Var, list12, list13, bool, t0Var, list7, num.intValue());
                    break;
                case 3:
                    jsonReader.beginObject();
                    String str6 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null content");
                            }
                            str6 = nextString;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    str = str6 == null ? " content" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    c2Var.e = new v0(str6);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    c2Var.b = nextString2;
                    break;
                case 5:
                    c2Var.a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c2Var.g();
    }

    public static p0 f(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        p0 p0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "frames":
                    List d = d(jsonReader, new j3.d0(20));
                    if (d == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = d;
                    break;
                case "reason":
                    str2 = jsonReader.nextString();
                    break;
                case "type":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = nextString;
                    break;
                case "causedBy":
                    p0Var = f(jsonReader);
                    break;
                case "overflowCount":
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " type" : "";
        if (list == null) {
            str3 = str3.concat(" frames");
        }
        if (num == null) {
            str3 = u3.c.k(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            return new p0(str, str2, list, p0Var, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static t0 g(JsonReader jsonReader) {
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(10, false);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    sVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    sVar.b = nextString;
                    break;
                case "defaultProcess":
                    sVar.c = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case "importance":
                    sVar.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return sVar.k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a0 h(JsonReader jsonReader) {
        char c3;
        char c6;
        char c10;
        char c11;
        char c12;
        Charset charset = e2.a;
        d8 d8Var = new d8();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            boolean z10 = false;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c3 = '\n';
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
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = d(jsonReader, new j3.d0(16));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else if (nextName2.equals("orgId")) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str2 = list == null ? " files" : "";
                    if (!str2.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str2));
                    }
                    d8Var.h = new e0(str, list);
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    d8Var.a = nextString;
                    break;
                case 2:
                    d8Var.e = jsonReader.nextString();
                    break;
                case 3:
                    d8Var.j = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    d8Var.k = nextString2;
                    break;
                case 5:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    d8Var.b = nextString3;
                    break;
                case 6:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    d8Var.c = nextString4;
                    break;
                case 7:
                    d8Var.d = jsonReader.nextString();
                    break;
                case '\b':
                    d8Var.i = Integer.valueOf(jsonReader.nextInt());
                    break;
                case '\t':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    d8Var.f = nextString5;
                    break;
                case '\n':
                    g0 g0Var = new g0();
                    g0Var.f = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c6 = 4;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c6 = 5;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c6 = 6;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c6 = 7;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c6 = '\b';
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c6 = '\t';
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c6 = '\n';
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c6 = 11;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            default:
                                c6 = 65535;
                                break;
                        }
                        switch (c6) {
                            case 0:
                                g0Var.d = Long.valueOf(jsonReader.nextLong());
                            case 1:
                                g0Var.c = jsonReader.nextString();
                            case 2:
                                g0Var.b = new String(Base64.decode(jsonReader.nextString(), 2), e2.a);
                            case 3:
                                g0Var.e = Long.valueOf(jsonReader.nextLong());
                            case 4:
                                e3.f fVar = new e3.f();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c10 = 2;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            fVar.f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            fVar.h = nextString6;
                                            break;
                                        case 2:
                                            fVar.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            fVar.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            fVar.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            fVar.c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            fVar.b = nextString7;
                                            break;
                                        case 7:
                                            fVar.g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            fVar.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g0Var.j = fVar.b();
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                g0Var.k = DesugarCollections.unmodifiableList(arrayList);
                            case 6:
                                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(12, z10);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            sVar.e = nextString9;
                                            break;
                                        case 1:
                                            sVar.c = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            sVar.b = nextString10;
                                            break;
                                        case 3:
                                            sVar.d = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g0Var.i = sVar.m();
                            case 7:
                                jsonReader.beginObject();
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            str3 = jsonReader.nextString();
                                            if (str3 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                        case 1:
                                            str7 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str8 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str4 = jsonReader.nextString();
                                            if (str4 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                        case 4:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str5 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                String str9 = str3 == null ? " identifier" : "";
                                if (str4 == null) {
                                    str9 = str9.concat(" version");
                                }
                                if (!str9.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str9));
                                }
                                g0Var.g = new i0(str3, str4, str5, str6, str7, str8);
                            case '\b':
                                jsonReader.beginObject();
                                String str10 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str10 = jsonReader.nextString();
                                        if (str10 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str11 = str10 == null ? " identifier" : "";
                                if (!str11.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str11));
                                }
                                g0Var.h = new a1(str10);
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                g0Var.a = nextString11;
                            case '\n':
                                g0Var.f = Boolean.valueOf(jsonReader.nextBoolean());
                            case 11:
                                g0Var.l = Integer.valueOf(jsonReader.nextInt());
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    d8Var.g = g0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return d8Var.a();
    }

    public static a0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                a0 h = h(jsonReader);
                jsonReader.close();
                return h;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
