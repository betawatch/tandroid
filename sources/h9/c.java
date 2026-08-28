package h9;

import android.util.Base64;
import android.util.JsonReader;
import f7.f8;
import fh.y5;
import g9.a0;
import g9.a1;
import g9.a2;
import g9.b0;
import g9.b2;
import g9.c0;
import g9.c2;
import g9.d0;
import g9.d2;
import g9.e;
import g9.e0;
import g9.e2;
import g9.f;
import g9.f0;
import g9.f1;
import g9.g;
import g9.g0;
import g9.g1;
import g9.h;
import g9.h0;
import g9.h1;
import g9.i;
import g9.i0;
import g9.i1;
import g9.j;
import g9.j0;
import g9.j1;
import g9.k;
import g9.k0;
import g9.k1;
import g9.l;
import g9.l0;
import g9.l1;
import g9.m;
import g9.m0;
import g9.m1;
import g9.n;
import g9.n0;
import g9.n1;
import g9.o;
import g9.o0;
import g9.o1;
import g9.p0;
import g9.p1;
import g9.q;
import g9.q0;
import g9.q1;
import g9.r;
import g9.r0;
import g9.r1;
import g9.s;
import g9.s0;
import g9.s1;
import g9.t;
import g9.t0;
import g9.t1;
import g9.u;
import g9.u0;
import g9.u1;
import g9.v;
import g9.v0;
import g9.v1;
import g9.w;
import g9.w0;
import g9.w1;
import g9.x;
import g9.x0;
import g9.x1;
import g9.y;
import g9.y0;
import g9.y1;
import g9.z;
import g9.z0;
import g9.z1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import n2.p;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import s9.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public static final p a;

    static {
        d dVar = new d();
        g9.d dVar2 = g9.d.a;
        dVar.l(e2.class, dVar2);
        dVar.l(a0.class, dVar2);
        j jVar = j.a;
        dVar.l(d2.class, jVar);
        dVar.l(h0.class, jVar);
        g gVar = g.a;
        dVar.l(l1.class, gVar);
        dVar.l(i0.class, gVar);
        h hVar = h.a;
        dVar.l(k1.class, hVar);
        dVar.l(j0.class, hVar);
        z zVar = z.a;
        dVar.l(c2.class, zVar);
        dVar.l(a1.class, zVar);
        y yVar = y.a;
        dVar.l(b2.class, yVar);
        dVar.l(z0.class, yVar);
        i iVar = i.a;
        dVar.l(m1.class, iVar);
        dVar.l(k0.class, iVar);
        t tVar = t.a;
        dVar.l(a2.class, tVar);
        dVar.l(l0.class, tVar);
        k kVar = k.a;
        dVar.l(u1.class, kVar);
        dVar.l(m0.class, kVar);
        m mVar = m.a;
        dVar.l(s1.class, mVar);
        dVar.l(n0.class, mVar);
        g9.p pVar = g9.p.a;
        dVar.l(r1.class, pVar);
        dVar.l(r0.class, pVar);
        q qVar = q.a;
        dVar.l(q1.class, qVar);
        dVar.l(s0.class, qVar);
        n nVar = n.a;
        dVar.l(o1.class, nVar);
        dVar.l(p0.class, nVar);
        g9.b bVar = g9.b.a;
        dVar.l(g1.class, bVar);
        dVar.l(b0.class, bVar);
        g9.a aVar = g9.a.a;
        dVar.l(f1.class, aVar);
        dVar.l(c0.class, aVar);
        o oVar = o.a;
        dVar.l(p1.class, oVar);
        dVar.l(q0.class, oVar);
        l lVar = l.a;
        dVar.l(n1.class, lVar);
        dVar.l(o0.class, lVar);
        g9.c cVar = g9.c.a;
        dVar.l(h1.class, cVar);
        dVar.l(d0.class, cVar);
        r rVar = r.a;
        dVar.l(t1.class, rVar);
        dVar.l(t0.class, rVar);
        s sVar = s.a;
        dVar.l(v1.class, sVar);
        dVar.l(u0.class, sVar);
        u uVar = u.a;
        dVar.l(w1.class, uVar);
        dVar.l(v0.class, uVar);
        x xVar = x.a;
        dVar.l(z1.class, xVar);
        dVar.l(y0.class, xVar);
        v vVar = v.a;
        dVar.l(y1.class, vVar);
        dVar.l(w0.class, vVar);
        w wVar = w.a;
        dVar.l(x1.class, wVar);
        dVar.l(x0.class, wVar);
        e eVar = e.a;
        dVar.l(j1.class, eVar);
        dVar.l(e0.class, eVar);
        f fVar = f.a;
        dVar.l(i1.class, fVar);
        dVar.l(f0.class, fVar);
        dVar.d = true;
        a = new p(dVar, 21);
    }

    public static s0 a(JsonReader jsonReader) {
        b3.b bVar = new b3.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    bVar.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    bVar.b = nextString;
                    break;
                case "pc":
                    bVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    bVar.c = jsonReader.nextString();
                    break;
                case "importance":
                    bVar.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.k();
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
        c3.h hVar = new c3.h();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    hVar.i = d(jsonReader, new y5(28));
                    break;
                case "pid":
                    hVar.a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    hVar.e = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    hVar.f = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    hVar.g = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    hVar.b = nextString;
                    break;
                case "reasonCode":
                    hVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    hVar.h = jsonReader.nextString();
                    break;
                case "importance":
                    hVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return hVar.a();
    }

    public static List d(JsonReader jsonReader, b bVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.a(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static l0 e(JsonReader jsonReader) {
        char c10;
        char c11;
        String str;
        char c12;
        char c13;
        char c14;
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i9 = 2;
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
                    com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
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
                                mVar2.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                mVar2.b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 2:
                                mVar2.d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 3:
                                mVar2.f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                mVar2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 5:
                                mVar2.c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    mVar.d = mVar2.h();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            List d = d(jsonReader, new a(0));
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
                    mVar.f = new y0(list);
                    break;
                case 2:
                    jsonReader.beginObject();
                    n0 n0Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    t0 t0Var = null;
                    Integer num = null;
                    List list4 = null;
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
                                    c12 = 5;
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
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list4 = DesugarCollections.unmodifiableList(arrayList);
                                i9 = 2;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                i9 = 2;
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
                                            b0Var = c(jsonReader);
                                            i9 = 2;
                                        case 1:
                                            list5 = d(jsonReader, new a(1));
                                            i9 = 2;
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
                                                str4 = ta.b.j(str4, " address");
                                            }
                                            if (!str4.isEmpty()) {
                                                throw new IllegalStateException("Missing required properties:".concat(str4));
                                            }
                                            q0Var = new q0(l10.longValue(), str2, str3);
                                            i9 = 2;
                                        case 3:
                                            list6 = d(jsonReader, new a(i9));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            i9 = 2;
                                        case 4:
                                            p0Var = f(jsonReader);
                                            i9 = 2;
                                        default:
                                            jsonReader.skipValue();
                                            i9 = 2;
                                    }
                                }
                                jsonReader.endObject();
                                String str5 = q0Var == null ? " signal" : "";
                                if (list6 == null) {
                                    str5 = str5.concat(" binaries");
                                }
                                if (!str5.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str5));
                                }
                                n0Var = new n0(list5, p0Var, b0Var, q0Var, list6);
                                i9 = 2;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = DesugarCollections.unmodifiableList(arrayList2);
                                i9 = 2;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = DesugarCollections.unmodifiableList(arrayList3);
                                i9 = 2;
                            case 5:
                                num = Integer.valueOf(jsonReader.nextInt());
                                i9 = 2;
                            case 6:
                                t0Var = g(jsonReader);
                                i9 = 2;
                            default:
                                jsonReader.skipValue();
                                i9 = 2;
                        }
                    }
                    jsonReader.endObject();
                    str = n0Var == null ? " execution" : "";
                    if (num == null) {
                        str = str.concat(" uiOrientation");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    mVar.c = new m0(n0Var, list2, list3, bool, t0Var, list4, num.intValue());
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
                    mVar.e = new v0(str6);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    mVar.b = nextString2;
                    break;
                case 5:
                    mVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return mVar.g();
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
                    List d = d(jsonReader, new a(3));
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
            str3 = ta.b.j(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            return new p0(str, str2, list, p0Var, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static t0 g(JsonReader jsonReader) {
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(8, false);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    tVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    tVar.b = nextString;
                    break;
                case "defaultProcess":
                    tVar.c = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case "importance":
                    tVar.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return tVar.k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a0 h(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        Charset charset = e2.a;
        f8 f8Var = new f8();
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
                            list = d(jsonReader, new y5(29));
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
                    f8Var.h = new e0(str, list);
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    f8Var.a = nextString;
                    break;
                case 2:
                    f8Var.e = jsonReader.nextString();
                    break;
                case 3:
                    f8Var.j = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    f8Var.k = nextString2;
                    break;
                case 5:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    f8Var.b = nextString3;
                    break;
                case 6:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    f8Var.c = nextString4;
                    break;
                case 7:
                    f8Var.d = jsonReader.nextString();
                    break;
                case '\b':
                    f8Var.i = Integer.valueOf(jsonReader.nextInt());
                    break;
                case '\t':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    f8Var.f = nextString5;
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
                                c3.h hVar = new c3.h();
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
                                            hVar.f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            hVar.h = nextString6;
                                            break;
                                        case 2:
                                            hVar.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            hVar.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            hVar.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            hVar.c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            hVar.b = nextString7;
                                            break;
                                        case 7:
                                            hVar.g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            hVar.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g0Var.j = hVar.b();
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                g0Var.k = DesugarCollections.unmodifiableList(arrayList);
                            case 6:
                                com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(10, z10);
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
                                            tVar.e = nextString9;
                                            break;
                                        case 1:
                                            tVar.c = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            tVar.b = nextString10;
                                            break;
                                        case 3:
                                            tVar.d = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g0Var.i = tVar.m();
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
                    f8Var.g = g0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return f8Var.a();
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
