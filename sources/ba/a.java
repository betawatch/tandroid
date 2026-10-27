package ba;

import a8.ff;
import a8.me;
import aa.a0;
import aa.a1;
import aa.a2;
import aa.b;
import aa.b0;
import aa.b1;
import aa.b2;
import aa.c;
import aa.c0;
import aa.c1;
import aa.c2;
import aa.d0;
import aa.d2;
import aa.e;
import aa.e0;
import aa.e2;
import aa.f;
import aa.f0;
import aa.f2;
import aa.g;
import aa.g0;
import aa.g2;
import aa.h;
import aa.h0;
import aa.h1;
import aa.i;
import aa.i0;
import aa.i1;
import aa.j;
import aa.j0;
import aa.j1;
import aa.k;
import aa.k0;
import aa.k1;
import aa.l;
import aa.l0;
import aa.l1;
import aa.m;
import aa.m0;
import aa.m1;
import aa.n;
import aa.n0;
import aa.n1;
import aa.o;
import aa.o0;
import aa.o1;
import aa.p;
import aa.p0;
import aa.p1;
import aa.q;
import aa.q0;
import aa.q1;
import aa.r;
import aa.r0;
import aa.r1;
import aa.s;
import aa.s0;
import aa.s1;
import aa.t;
import aa.t0;
import aa.t1;
import aa.u;
import aa.u0;
import aa.u1;
import aa.v;
import aa.v0;
import aa.v1;
import aa.w;
import aa.w0;
import aa.w1;
import aa.x;
import aa.x0;
import aa.x1;
import aa.y;
import aa.y0;
import aa.y1;
import aa.z;
import aa.z0;
import aa.z1;
import android.util.Base64;
import android.util.JsonReader;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import li.h5;
import ma.d;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public static final h5 a;

    static {
        d dVar = new d();
        aa.d dVar2 = aa.d.a;
        dVar.d(g2.class, dVar2);
        dVar.d(a0.class, dVar2);
        j jVar = j.a;
        dVar.d(f2.class, jVar);
        dVar.d(i0.class, jVar);
        g gVar = g.a;
        dVar.d(n1.class, gVar);
        dVar.d(j0.class, gVar);
        h hVar = h.a;
        dVar.d(m1.class, hVar);
        dVar.d(k0.class, hVar);
        z zVar = z.a;
        dVar.d(e2.class, zVar);
        dVar.d(c1.class, zVar);
        y yVar = y.a;
        dVar.d(d2.class, yVar);
        dVar.d(b1.class, yVar);
        i iVar = i.a;
        dVar.d(o1.class, iVar);
        dVar.d(l0.class, iVar);
        t tVar = t.a;
        dVar.d(c2.class, tVar);
        dVar.d(n0.class, tVar);
        k kVar = k.a;
        dVar.d(w1.class, kVar);
        dVar.d(o0.class, kVar);
        m mVar = m.a;
        dVar.d(u1.class, mVar);
        dVar.d(p0.class, mVar);
        p pVar = p.a;
        dVar.d(t1.class, pVar);
        dVar.d(t0.class, pVar);
        q qVar = q.a;
        dVar.d(s1.class, qVar);
        dVar.d(u0.class, qVar);
        n nVar = n.a;
        dVar.d(q1.class, nVar);
        dVar.d(r0.class, nVar);
        b bVar = b.a;
        dVar.d(i1.class, bVar);
        dVar.d(c0.class, bVar);
        aa.a aVar = aa.a.a;
        dVar.d(h1.class, aVar);
        dVar.d(d0.class, aVar);
        o oVar = o.a;
        dVar.d(r1.class, oVar);
        dVar.d(s0.class, oVar);
        l lVar = l.a;
        dVar.d(p1.class, lVar);
        dVar.d(q0.class, lVar);
        c cVar = c.a;
        dVar.d(j1.class, cVar);
        dVar.d(e0.class, cVar);
        r rVar = r.a;
        dVar.d(v1.class, rVar);
        dVar.d(v0.class, rVar);
        s sVar = s.a;
        dVar.d(x1.class, sVar);
        dVar.d(w0.class, sVar);
        u uVar = u.a;
        dVar.d(y1.class, uVar);
        dVar.d(x0.class, uVar);
        x xVar = x.a;
        dVar.d(b2.class, xVar);
        dVar.d(a1.class, xVar);
        v vVar = v.a;
        dVar.d(a2.class, vVar);
        dVar.d(y0.class, vVar);
        w wVar = w.a;
        dVar.d(z1.class, wVar);
        dVar.d(z0.class, wVar);
        e eVar = e.a;
        dVar.d(l1.class, eVar);
        dVar.d(f0.class, eVar);
        f fVar = f.a;
        dVar.d(k1.class, fVar);
        dVar.d(g0.class, fVar);
        dVar.d = true;
        a = new h5(dVar);
    }

    public static u0 a(JsonReader jsonReader) {
        me meVar = new me();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    meVar.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    meVar.b = nextString;
                    break;
                case "pc":
                    meVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    meVar.c = jsonReader.nextString();
                    break;
                case "importance":
                    meVar.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return meVar.r();
    }

    public static e0 b(JsonReader jsonReader) {
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
            return new e0(str, str2);
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static c0 c(JsonReader jsonReader) {
        b0 b0Var = new b0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    b0Var.i = d(jsonReader, new ag.w(12));
                    break;
                case "pid":
                    b0Var.a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    b0Var.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    b0Var.e = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    b0Var.h = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    b0Var.b = nextString;
                    break;
                case "reasonCode":
                    b0Var.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    b0Var.g = jsonReader.nextString();
                    break;
                case "importance":
                    b0Var.f = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b0Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static List d(JsonReader jsonReader, ag.w wVar) {
        String str;
        Object d0Var;
        boolean z10;
        char c10;
        Object obj;
        boolean z11;
        char c11;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str2 = null;
            Long l4 = null;
            String str3 = null;
            String str4 = null;
            switch (wVar.a) {
                case 12:
                    jsonReader.beginObject();
                    String str5 = null;
                    String str6 = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -609862170:
                                if (nextName.equals("libraryName")) {
                                    z10 = false;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 3002454:
                                if (nextName.equals("arch")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 230943785:
                                if (nextName.equals("buildId")) {
                                    z10 = 2;
                                    break;
                                }
                                z10 = -1;
                                break;
                            default:
                                z10 = -1;
                                break;
                        }
                        switch (z10) {
                            case false:
                                str5 = jsonReader.nextString();
                                if (str5 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                break;
                            case true:
                                String nextString = jsonReader.nextString();
                                if (nextString == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                str2 = nextString;
                                break;
                            case true:
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
                        str = b10.u(str, " buildId");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    d0Var = new d0(str2, str5, str6);
                    continue;
                    arrayList.add(d0Var);
                case 13:
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
                    obj = new g0(str4, bArr);
                    break;
                case 14:
                    com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
                                    c10 = 3;
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
                                String nextString3 = jsonReader.nextString();
                                if (nextString3 == null) {
                                    throw new NullPointerException("Null parameterKey");
                                }
                                qVar.a = nextString3;
                                break;
                            case 1:
                                qVar.d = Long.valueOf(jsonReader.nextLong());
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
                                qVar.b = new z0(str7, str8);
                                break;
                            case 3:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 == null) {
                                    throw new NullPointerException("Null parameterValue");
                                }
                                qVar.c = nextString4;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    d0Var = qVar.e();
                    continue;
                    arrayList.add(d0Var);
                case 15:
                    jsonReader.beginObject();
                    Integer num = null;
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -1266514778:
                                if (nextName5.equals("frames")) {
                                    z11 = false;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case 3373707:
                                if (nextName5.equals("name")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case 2125650548:
                                if (nextName5.equals("importance")) {
                                    z11 = 2;
                                    break;
                                }
                                z11 = -1;
                                break;
                            default:
                                z11 = -1;
                                break;
                        }
                        switch (z11) {
                            case false:
                                list = d(jsonReader, new ag.w(17));
                                if (list == null) {
                                    throw new NullPointerException("Null frames");
                                }
                            case true:
                                String nextString5 = jsonReader.nextString();
                                if (nextString5 == null) {
                                    throw new NullPointerException("Null name");
                                }
                                str3 = nextString5;
                            case true:
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
                        str10 = b10.u(str10, " frames");
                    }
                    if (!str10.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str10));
                    }
                    obj = new t0(str3, num.intValue(), list);
                    break;
                case 16:
                    jsonReader.beginObject();
                    Long l10 = null;
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
                                l10 = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 2:
                                str12 = new String(Base64.decode(jsonReader.nextString(), 2), g2.a);
                                break;
                            case 3:
                                l4 = Long.valueOf(jsonReader.nextLong());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    str = l4 == null ? " baseAddress" : "";
                    if (l10 == null) {
                        str = str.concat(" size");
                    }
                    if (str11 == null) {
                        str = b10.u(str, " name");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    d0Var = new q0(str11, l4.longValue(), l10.longValue(), str12);
                    continue;
                    arrayList.add(d0Var);
                default:
                    d0Var = a(jsonReader);
                    continue;
                    arrayList.add(d0Var);
            }
            d0Var = obj;
            arrayList.add(d0Var);
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static n0 e(JsonReader jsonReader) {
        char c10;
        char c11;
        String str;
        char c12;
        List list;
        char c13;
        List list2;
        List list3;
        char c14;
        m0 m0Var = new m0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals(TeXSymbolParser.TYPE_ATTR)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 5;
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
                    m0 m0Var2 = new m0();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c11 = 5;
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
                                m0Var2.b = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                m0Var2.c = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 2:
                                m0Var2.e = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 3:
                                m0Var2.f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                m0Var2.a = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 5:
                                m0Var2.d = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    m0Var.d = m0Var2.g();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            List d = d(jsonReader, new ag.w(14));
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
                    m0Var.f = new a1(list4);
                    break;
                case 2:
                    jsonReader.beginObject();
                    char c15 = 5;
                    p0 p0Var = null;
                    List list5 = null;
                    List list6 = null;
                    Boolean bool = null;
                    v0 v0Var = null;
                    List list7 = null;
                    Integer num = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c12 = 3;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c12 = 4;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c12 = c15;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c12 = 6;
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
                                c15 = 5;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                list5 = list5;
                                c15 = 5;
                            case 2:
                                jsonReader.beginObject();
                                List list9 = null;
                                r0 r0Var = null;
                                c0 c0Var = null;
                                s0 s0Var = null;
                                List list10 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            list2 = list5;
                                            list3 = list6;
                                            c0Var = c(jsonReader);
                                            list5 = list2;
                                            list6 = list3;
                                        case 1:
                                            list2 = list5;
                                            list3 = list6;
                                            list9 = d(jsonReader, new ag.w(15));
                                            list5 = list2;
                                            list6 = list3;
                                        case 2:
                                            jsonReader.beginObject();
                                            String str2 = null;
                                            String str3 = null;
                                            Long l4 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c14 = 0;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c14 = 1;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c14 = 2;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    default:
                                                        c14 = 65535;
                                                        break;
                                                }
                                                switch (c14) {
                                                    case 0:
                                                        l4 = Long.valueOf(jsonReader.nextLong());
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
                                            if (l4 == null) {
                                                str4 = b10.u(str4, " address");
                                            }
                                            if (!str4.isEmpty()) {
                                                throw new IllegalStateException("Missing required properties:".concat(str4));
                                            }
                                            list2 = list5;
                                            list3 = list6;
                                            s0Var = new s0(l4.longValue(), str2, str3);
                                            list5 = list2;
                                            list6 = list3;
                                        case 3:
                                            list10 = d(jsonReader, new ag.w(16));
                                            if (list10 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            list2 = list5;
                                            list3 = list6;
                                            list5 = list2;
                                            list6 = list3;
                                        case 4:
                                            r0Var = f(jsonReader);
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
                                String str5 = s0Var == null ? " signal" : "";
                                if (list10 == null) {
                                    str5 = str5.concat(" binaries");
                                }
                                if (!str5.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str5));
                                }
                                list5 = list11;
                                p0Var = new p0(list9, r0Var, c0Var, s0Var, list10);
                                list6 = list;
                                c15 = 5;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list6 = DesugarCollections.unmodifiableList(arrayList2);
                                c15 = 5;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list5 = DesugarCollections.unmodifiableList(arrayList3);
                                c15 = 5;
                            case 5:
                                num = Integer.valueOf(jsonReader.nextInt());
                                c15 = 5;
                            case 6:
                                v0Var = g(jsonReader);
                                c15 = 5;
                            default:
                                jsonReader.skipValue();
                                c15 = 5;
                        }
                    }
                    List list12 = list5;
                    List list13 = list6;
                    jsonReader.endObject();
                    str = p0Var == null ? " execution" : "";
                    if (num == null) {
                        str = str.concat(" uiOrientation");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    m0Var.c = new o0(p0Var, list12, list13, bool, v0Var, list7, num.intValue());
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
                    m0Var.e = new x0(str6);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    m0Var.b = nextString2;
                    break;
                case 5:
                    m0Var.a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m0Var.f();
    }

    public static r0 f(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        r0 r0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "frames":
                    List d = d(jsonReader, new ag.w(17));
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
                    r0Var = f(jsonReader);
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
            str3 = b10.u(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            return new r0(str, str2, list, r0Var, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static v0 g(JsonReader jsonReader) {
        ti.e eVar = new ti.e(1, false);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    eVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    eVar.b = nextString;
                    break;
                case "defaultProcess":
                    eVar.e = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case "importance":
                    eVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return eVar.c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a0 h(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        Charset charset = g2.a;
        ff ffVar = new ff();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i10 = 2;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = '\n';
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
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = d(jsonReader, new ag.w(13));
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
                    ffVar.j = new f0(str, list);
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    ffVar.a = nextString;
                    break;
                case 2:
                    ffVar.f = jsonReader.nextString();
                    break;
                case 3:
                    ffVar.k = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    ffVar.g = nextString2;
                    break;
                case 5:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    ffVar.b = nextString3;
                    break;
                case 6:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    ffVar.d = nextString4;
                    break;
                case 7:
                    ffVar.e = jsonReader.nextString();
                    break;
                case '\b':
                    ffVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case '\t':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    ffVar.h = nextString5;
                    break;
                case '\n':
                    h0 h0Var = new h0();
                    h0Var.f = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c11 = 11;
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
                                h0Var.d = Long.valueOf(jsonReader.nextLong());
                            case 1:
                                h0Var.c = jsonReader.nextString();
                            case 2:
                                h0Var.b = new String(Base64.decode(jsonReader.nextString(), 2), g2.a);
                            case 3:
                                h0Var.e = Long.valueOf(jsonReader.nextLong());
                            case 4:
                                b0 b0Var = new b0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c13 = 5;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c13 = 6;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c13 = 7;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c13 = '\b';
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            b0Var.h = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            b0Var.g = nextString6;
                                            break;
                                        case 2:
                                            b0Var.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            b0Var.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            b0Var.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            b0Var.c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            b0Var.b = nextString7;
                                            break;
                                        case 7:
                                            b0Var.f = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            b0Var.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                h0Var.j = b0Var.b();
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                h0Var.k = DesugarCollections.unmodifiableList(arrayList);
                            case 6:
                                ti.e eVar = new ti.e(i10, false);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c14 = 0;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c14 = 1;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c14 = 2;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c14 = 3;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        default:
                                            c14 = 65535;
                                            break;
                                    }
                                    switch (c14) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            eVar.d = nextString9;
                                            break;
                                        case 1:
                                            eVar.e = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            eVar.c = nextString10;
                                            break;
                                        case 3:
                                            eVar.b = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                h0Var.i = eVar.d();
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
                                h0Var.g = new j0(str3, str4, str5, str6, str7, str8);
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
                                h0Var.h = new c1(str10);
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                h0Var.a = nextString11;
                            case '\n':
                                h0Var.f = Boolean.valueOf(jsonReader.nextBoolean());
                            case 11:
                                h0Var.l = Integer.valueOf(jsonReader.nextInt());
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    ffVar.i = h0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return ffVar.a();
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
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
