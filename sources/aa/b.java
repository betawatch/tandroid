package aa;

import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.cast.z5;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import ki.t1;
import la.d;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import v7.d8;
import z9.a0;
import z9.a1;
import z9.a2;
import z9.b0;
import z9.b2;
import z9.c;
import z9.c0;
import z9.c2;
import z9.d0;
import z9.d2;
import z9.e;
import z9.e0;
import z9.e2;
import z9.f;
import z9.f0;
import z9.f1;
import z9.g;
import z9.g0;
import z9.g1;
import z9.h;
import z9.h0;
import z9.h1;
import z9.i;
import z9.i0;
import z9.i1;
import z9.j;
import z9.j0;
import z9.j1;
import z9.k;
import z9.k0;
import z9.k1;
import z9.l;
import z9.l0;
import z9.l1;
import z9.m;
import z9.m0;
import z9.m1;
import z9.n;
import z9.n0;
import z9.n1;
import z9.o;
import z9.o0;
import z9.o1;
import z9.p;
import z9.p0;
import z9.p1;
import z9.q;
import z9.q0;
import z9.q1;
import z9.r;
import z9.r0;
import z9.r1;
import z9.s;
import z9.s0;
import z9.s1;
import z9.t;
import z9.t0;
import z9.u;
import z9.u0;
import z9.u1;
import z9.v;
import z9.v0;
import z9.v1;
import z9.w;
import z9.w0;
import z9.w1;
import z9.x;
import z9.x0;
import z9.x1;
import z9.y;
import z9.y0;
import z9.y1;
import z9.z;
import z9.z0;
import z9.z1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class b {
    public static final t1 a;

    static {
        d dVar = new d();
        z9.d dVar2 = z9.d.a;
        dVar.a(e2.class, dVar2);
        dVar.a(a0.class, dVar2);
        j jVar = j.a;
        dVar.a(d2.class, jVar);
        dVar.a(h0.class, jVar);
        g gVar = g.a;
        dVar.a(l1.class, gVar);
        dVar.a(i0.class, gVar);
        h hVar = h.a;
        dVar.a(k1.class, hVar);
        dVar.a(j0.class, hVar);
        z zVar = z.a;
        dVar.a(c2.class, zVar);
        dVar.a(a1.class, zVar);
        y yVar = y.a;
        dVar.a(b2.class, yVar);
        dVar.a(z0.class, yVar);
        i iVar = i.a;
        dVar.a(m1.class, iVar);
        dVar.a(k0.class, iVar);
        t tVar = t.a;
        dVar.a(a2.class, tVar);
        dVar.a(l0.class, tVar);
        k kVar = k.a;
        dVar.a(u1.class, kVar);
        dVar.a(m0.class, kVar);
        m mVar = m.a;
        dVar.a(s1.class, mVar);
        dVar.a(n0.class, mVar);
        p pVar = p.a;
        dVar.a(r1.class, pVar);
        dVar.a(r0.class, pVar);
        q qVar = q.a;
        dVar.a(q1.class, qVar);
        dVar.a(s0.class, qVar);
        n nVar = n.a;
        dVar.a(o1.class, nVar);
        dVar.a(p0.class, nVar);
        z9.b bVar = z9.b.a;
        dVar.a(g1.class, bVar);
        dVar.a(b0.class, bVar);
        z9.a aVar = z9.a.a;
        dVar.a(f1.class, aVar);
        dVar.a(c0.class, aVar);
        o oVar = o.a;
        dVar.a(p1.class, oVar);
        dVar.a(q0.class, oVar);
        l lVar = l.a;
        dVar.a(n1.class, lVar);
        dVar.a(o0.class, lVar);
        c cVar = c.a;
        dVar.a(h1.class, cVar);
        dVar.a(d0.class, cVar);
        r rVar = r.a;
        dVar.a(z9.t1.class, rVar);
        dVar.a(t0.class, rVar);
        s sVar = s.a;
        dVar.a(v1.class, sVar);
        dVar.a(u0.class, sVar);
        u uVar = u.a;
        dVar.a(w1.class, uVar);
        dVar.a(v0.class, uVar);
        x xVar = x.a;
        dVar.a(z1.class, xVar);
        dVar.a(y0.class, xVar);
        v vVar = v.a;
        dVar.a(y1.class, vVar);
        dVar.a(w0.class, vVar);
        w wVar = w.a;
        dVar.a(x1.class, wVar);
        dVar.a(x0.class, wVar);
        e eVar = e.a;
        dVar.a(j1.class, eVar);
        dVar.a(e0.class, eVar);
        f fVar = f.a;
        dVar.a(i1.class, fVar);
        dVar.a(f0.class, fVar);
        dVar.d = true;
        a = new t1(dVar, 4);
    }

    public static s0 a(JsonReader jsonReader) {
        z5 z5Var = new z5();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    z5Var.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    z5Var.a = nextString;
                    break;
                case "pc":
                    z5Var.b = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    z5Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    z5Var.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return z5Var.p();
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
        int i10;
        ea.b bVar = new ea.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            i10 = 0;
            switch (nextName) {
                case "buildIdMappingForArch":
                    bVar.i = d(jsonReader, new a(i10));
                    break;
                case "pid":
                    bVar.a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    bVar.e = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    bVar.f = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVar.g = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    bVar.b = nextString;
                    break;
                case "reasonCode":
                    bVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVar.h = jsonReader.nextString();
                    break;
                case "importance":
                    bVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static List d(JsonReader jsonReader, a aVar) {
        String str;
        Object c0Var;
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
            switch (aVar.a) {
                case 0:
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
                        str = r4.c.u(str, " buildId");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    c0Var = new c0(str2, str5, str6);
                    continue;
                    arrayList.add(c0Var);
                case 1:
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
                case 2:
                    qi.e eVar = new qi.e();
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
                                eVar.b = nextString3;
                                break;
                            case 1:
                                eVar.d = Long.valueOf(jsonReader.nextLong());
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
                                eVar.a = new x0(str7, str8);
                                break;
                            case 3:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 == null) {
                                    throw new NullPointerException("Null parameterValue");
                                }
                                eVar.c = nextString4;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0Var = eVar.h();
                    continue;
                    arrayList.add(c0Var);
                case 3:
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
                                list = d(jsonReader, new a(5));
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
                        str10 = r4.c.u(str10, " frames");
                    }
                    if (!str10.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str10));
                    }
                    obj = new r0(str3, num.intValue(), list);
                    break;
                case 4:
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
                                str12 = new String(Base64.decode(jsonReader.nextString(), 2), e2.a);
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
                        str = r4.c.u(str, " name");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    c0Var = new o0(str11, l4.longValue(), l10.longValue(), str12);
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
        char c10;
        char c11;
        String str;
        int i10;
        t0 t0Var;
        int i11;
        t0 t0Var2;
        char c12;
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i12 = 4;
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
                    com.google.firebase.messaging.l lVar2 = new com.google.firebase.messaging.l();
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
                                lVar2.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                lVar2.b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 2:
                                lVar2.d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 3:
                                lVar2.f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                lVar2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 5:
                                lVar2.c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    lVar.d = lVar2.l();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            List d = d(jsonReader, new a(2));
                            if (d == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                            list = d;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    str = list == null ? " rolloutAssignments" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    lVar.f = new y0(list);
                    break;
                case 2:
                    jsonReader.beginObject();
                    n0 n0Var = null;
                    List list2 = null;
                    t0 t0Var3 = null;
                    List list3 = null;
                    Integer num = null;
                    List list4 = null;
                    Boolean bool = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    i10 = 0;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    i10 = 1;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    i10 = 2;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    i10 = 3;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    i10 = i12;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    i10 = 5;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    i10 = 6;
                                    break;
                                }
                                i10 = -1;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                        switch (i10) {
                            case 0:
                                t0Var = t0Var3;
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = DesugarCollections.unmodifiableList(arrayList);
                                t0Var3 = t0Var;
                                i12 = 4;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                i12 = 4;
                            case 2:
                                jsonReader.beginObject();
                                List list5 = null;
                                p0 p0Var = null;
                                b0 b0Var = null;
                                q0 q0Var = null;
                                List list6 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                i11 = 0;
                                                break;
                                            }
                                            i11 = -1;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                i11 = 1;
                                                break;
                                            }
                                            i11 = -1;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                i11 = 2;
                                                break;
                                            }
                                            i11 = -1;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                i11 = 3;
                                                break;
                                            }
                                            i11 = -1;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                i11 = i12;
                                                break;
                                            }
                                            i11 = -1;
                                            break;
                                        default:
                                            i11 = -1;
                                            break;
                                    }
                                    switch (i11) {
                                        case 0:
                                            t0Var2 = t0Var3;
                                            b0Var = c(jsonReader);
                                            t0Var3 = t0Var2;
                                            i12 = 4;
                                        case 1:
                                            t0Var2 = t0Var3;
                                            list5 = d(jsonReader, new a(3));
                                            t0Var3 = t0Var2;
                                            i12 = 4;
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
                                                str4 = r4.c.u(str4, " address");
                                            }
                                            if (!str4.isEmpty()) {
                                                throw new IllegalStateException("Missing required properties:".concat(str4));
                                            }
                                            t0Var2 = t0Var3;
                                            q0Var = new q0(l4.longValue(), str2, str3);
                                            t0Var3 = t0Var2;
                                            i12 = 4;
                                        case 3:
                                            list6 = d(jsonReader, new a(i12));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            t0Var2 = t0Var3;
                                            t0Var3 = t0Var2;
                                            i12 = 4;
                                        case 4:
                                            p0Var = f(jsonReader);
                                            t0Var2 = t0Var3;
                                            t0Var3 = t0Var2;
                                            i12 = 4;
                                        default:
                                            jsonReader.skipValue();
                                            t0Var2 = t0Var3;
                                            t0Var3 = t0Var2;
                                            i12 = 4;
                                    }
                                }
                                t0Var = t0Var3;
                                jsonReader.endObject();
                                String str5 = q0Var == null ? " signal" : "";
                                if (list6 == null) {
                                    str5 = str5.concat(" binaries");
                                }
                                if (!str5.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str5));
                                }
                                n0Var = new n0(list5, p0Var, b0Var, q0Var, list6);
                                t0Var3 = t0Var;
                                i12 = 4;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list4 = DesugarCollections.unmodifiableList(arrayList2);
                                i12 = 4;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = DesugarCollections.unmodifiableList(arrayList3);
                                i12 = 4;
                            case 5:
                                num = Integer.valueOf(jsonReader.nextInt());
                                i12 = 4;
                            case 6:
                                t0Var3 = g(jsonReader);
                                i12 = 4;
                            default:
                                jsonReader.skipValue();
                                i12 = 4;
                        }
                    }
                    t0 t0Var4 = t0Var3;
                    jsonReader.endObject();
                    str = n0Var == null ? " execution" : "";
                    if (num == null) {
                        str = str.concat(" uiOrientation");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    lVar.c = new m0(n0Var, list2, list4, bool, t0Var4, list3, num.intValue());
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
                    lVar.e = new v0(str6);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    lVar.b = nextString2;
                    break;
                case 5:
                    lVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return lVar.k();
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
                    List d = d(jsonReader, new a(5));
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
            str3 = r4.c.u(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            return new p0(str, str2, list, p0Var, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static t0 g(JsonReader jsonReader) {
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(13, false);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    rVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    rVar.b = nextString;
                    break;
                case "defaultProcess":
                    rVar.c = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case "importance":
                    rVar.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return rVar.c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a0 h(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
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
                            list = d(jsonReader, new a(1));
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
                                g0Var.d = Long.valueOf(jsonReader.nextLong());
                            case 1:
                                g0Var.c = jsonReader.nextString();
                            case 2:
                                g0Var.b = new String(Base64.decode(jsonReader.nextString(), 2), e2.a);
                            case 3:
                                g0Var.e = Long.valueOf(jsonReader.nextLong());
                            case 4:
                                ea.b bVar = new ea.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c12 = 6;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c12 = 7;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c12 = '\b';
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
                                            bVar.f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            bVar.h = nextString6;
                                            break;
                                        case 2:
                                            bVar.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            bVar.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            bVar.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            bVar.c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            bVar.b = nextString7;
                                            break;
                                        case 7:
                                            bVar.g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            bVar.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g0Var.j = bVar.b();
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                g0Var.k = DesugarCollections.unmodifiableList(arrayList);
                            case 6:
                                com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(14, z10);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c13 = 3;
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
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            rVar.e = nextString9;
                                            break;
                                        case 1:
                                            rVar.c = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            rVar.b = nextString10;
                                            break;
                                        case 3:
                                            rVar.d = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g0Var.i = rVar.d();
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
                                                c14 = 0;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c14 = 1;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c14 = 2;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c14 = 3;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c14 = 4;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c14 = 5;
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
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
