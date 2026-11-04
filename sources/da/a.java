package da;

import android.util.Base64;
import android.util.JsonReader;
import ca.a0;
import ca.a1;
import ca.a2;
import ca.b;
import ca.b0;
import ca.b1;
import ca.b2;
import ca.c;
import ca.c0;
import ca.c1;
import ca.c2;
import ca.d0;
import ca.d1;
import ca.d2;
import ca.e;
import ca.e0;
import ca.e1;
import ca.e2;
import ca.f;
import ca.f0;
import ca.f1;
import ca.f2;
import ca.g;
import ca.g0;
import ca.g1;
import ca.g2;
import ca.h;
import ca.h0;
import ca.h1;
import ca.h2;
import ca.i;
import ca.i0;
import ca.i1;
import ca.i2;
import ca.j;
import ca.j0;
import ca.j1;
import ca.j2;
import ca.k;
import ca.k0;
import ca.k1;
import ca.k2;
import ca.l;
import ca.l0;
import ca.l1;
import ca.l2;
import ca.m;
import ca.m0;
import ca.m1;
import ca.m2;
import ca.n;
import ca.n0;
import ca.n1;
import ca.n2;
import ca.o;
import ca.o0;
import ca.o1;
import ca.o2;
import ca.p;
import ca.p0;
import ca.p2;
import ca.q;
import ca.q0;
import ca.q2;
import ca.r;
import ca.r0;
import ca.r2;
import ca.s;
import ca.s0;
import ca.s2;
import ca.t;
import ca.t0;
import ca.t1;
import ca.t2;
import ca.u;
import ca.u1;
import ca.u2;
import ca.v;
import ca.v0;
import ca.v1;
import ca.w;
import ca.w0;
import ca.w1;
import ca.x;
import ca.x0;
import ca.x1;
import ca.y;
import ca.y0;
import ca.y1;
import ca.z;
import ca.z0;
import ca.z1;
import hi.d;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public static final d a;

    static {
        oa.d dVar = new oa.d();
        ca.d dVar2 = ca.d.a;
        dVar.c(u2.class, dVar2);
        dVar.c(d0.class, dVar2);
        l lVar = l.a;
        dVar.c(t2.class, lVar);
        dVar.c(n0.class, lVar);
        i iVar = i.a;
        dVar.c(b2.class, iVar);
        dVar.c(o0.class, iVar);
        j jVar = j.a;
        dVar.c(a2.class, jVar);
        dVar.c(p0.class, jVar);
        b0 b0Var = b0.a;
        dVar.c(s2.class, b0Var);
        dVar.c(o1.class, b0Var);
        a0 a0Var = a0.a;
        dVar.c(r2.class, a0Var);
        dVar.c(n1.class, a0Var);
        k kVar = k.a;
        dVar.c(c2.class, kVar);
        dVar.c(r0.class, kVar);
        v vVar = v.a;
        dVar.c(q2.class, vVar);
        dVar.c(t0.class, vVar);
        m mVar = m.a;
        dVar.c(k2.class, mVar);
        dVar.c(v0.class, mVar);
        o oVar = o.a;
        dVar.c(i2.class, oVar);
        dVar.c(w0.class, oVar);
        r rVar = r.a;
        dVar.c(h2.class, rVar);
        dVar.c(a1.class, rVar);
        s sVar = s.a;
        dVar.c(g2.class, sVar);
        dVar.c(c1.class, sVar);
        p pVar = p.a;
        dVar.c(e2.class, pVar);
        dVar.c(y0.class, pVar);
        b bVar = b.a;
        dVar.c(u1.class, bVar);
        dVar.c(f0.class, bVar);
        ca.a aVar = ca.a.a;
        dVar.c(t1.class, aVar);
        dVar.c(g0.class, aVar);
        g gVar = g.a;
        dVar.c(z1.class, gVar);
        dVar.c(k0.class, gVar);
        h hVar = h.a;
        dVar.c(y1.class, hVar);
        dVar.c(l0.class, hVar);
        q qVar = q.a;
        dVar.c(f2.class, qVar);
        dVar.c(z0.class, qVar);
        n nVar = n.a;
        dVar.c(d2.class, nVar);
        dVar.c(x0.class, nVar);
        c cVar = c.a;
        dVar.c(v1.class, cVar);
        dVar.c(h0.class, cVar);
        t tVar = t.a;
        dVar.c(j2.class, tVar);
        dVar.c(e1.class, tVar);
        u uVar = u.a;
        dVar.c(l2.class, uVar);
        dVar.c(g1.class, uVar);
        w wVar = w.a;
        dVar.c(m2.class, wVar);
        dVar.c(h1.class, wVar);
        z zVar = z.a;
        dVar.c(p2.class, zVar);
        dVar.c(l1.class, zVar);
        x xVar = x.a;
        dVar.c(o2.class, xVar);
        dVar.c(j1.class, xVar);
        y yVar = y.a;
        dVar.c(n2.class, yVar);
        dVar.c(k1.class, yVar);
        e eVar = e.a;
        dVar.c(x1.class, eVar);
        dVar.c(i0.class, eVar);
        f fVar = f.a;
        dVar.c(w1.class, fVar);
        dVar.c(j0.class, fVar);
        dVar.d = true;
        a = new d(dVar, 19);
    }

    public static c1 a(JsonReader jsonReader) {
        b1 b1Var = new b1();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    b1Var.d = jsonReader.nextLong();
                    b1Var.f = (byte) (b1Var.f | 2);
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    b1Var.b = nextString;
                    break;
                case "pc":
                    b1Var.a = jsonReader.nextLong();
                    b1Var.f = (byte) (b1Var.f | 1);
                    break;
                case "file":
                    b1Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    b1Var.e = jsonReader.nextInt();
                    b1Var.f = (byte) (b1Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b1Var.a();
    }

    public static h0 b(JsonReader jsonReader) {
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
        if (str != null && str2 != null) {
            return new h0(str, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(" key");
        }
        if (str2 == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }

    public static f0 c(JsonReader jsonReader) {
        e0 e0Var = new e0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    e0Var.i = d(jsonReader, new d2.t1(1));
                    break;
                case "pid":
                    e0Var.a = jsonReader.nextInt();
                    e0Var.j = (byte) (e0Var.j | 1);
                    break;
                case "pss":
                    e0Var.e = jsonReader.nextLong();
                    e0Var.j = (byte) (e0Var.j | 8);
                    break;
                case "rss":
                    e0Var.f = jsonReader.nextLong();
                    e0Var.j = (byte) (e0Var.j | 16);
                    break;
                case "timestamp":
                    e0Var.g = jsonReader.nextLong();
                    e0Var.j = (byte) (e0Var.j | 32);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    e0Var.b = nextString;
                    break;
                case "reasonCode":
                    e0Var.c = jsonReader.nextInt();
                    e0Var.j = (byte) (e0Var.j | 2);
                    break;
                case "traceFile":
                    e0Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    e0Var.d = jsonReader.nextInt();
                    e0Var.j = (byte) (e0Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return e0Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static List d(JsonReader jsonReader, d2.t1 t1Var) {
        Object g0Var;
        boolean z10;
        Object j0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str = null;
            switch (t1Var.a) {
                case 1:
                    jsonReader.beginObject();
                    String str2 = null;
                    String str3 = null;
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
                                str2 = jsonReader.nextString();
                                if (str2 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                break;
                            case true:
                                String nextString = jsonReader.nextString();
                                if (nextString == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                str = nextString;
                                break;
                            case true:
                                str3 = jsonReader.nextString();
                                if (str3 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (str == null || str2 == null || str3 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        if (str == null) {
                            sb2.append(" arch");
                        }
                        if (str2 == null) {
                            sb2.append(" libraryName");
                        }
                        if (str3 == null) {
                            sb2.append(" buildId");
                        }
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
                    }
                    g0Var = new g0(str, str2, str3);
                    continue;
                    arrayList.add(g0Var);
                    break;
                case 2:
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
                            str = nextString2;
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
                    if (str != null && bArr != null) {
                        j0Var = new j0(str, bArr);
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        if (str == null) {
                            sb3.append(" filename");
                        }
                        if (bArr == null) {
                            sb3.append(" contents");
                        }
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb3));
                    }
                    break;
                case 3:
                    i1 i1Var = new i1();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    z11 = false;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    z11 = 2;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
                                    z11 = 3;
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
                                String nextString3 = jsonReader.nextString();
                                if (nextString3 == null) {
                                    throw new NullPointerException("Null parameterKey");
                                }
                                i1Var.b = nextString3;
                                break;
                            case true:
                                i1Var.d = jsonReader.nextLong();
                                i1Var.e = (byte) (i1Var.e | 1);
                                break;
                            case true:
                                jsonReader.beginObject();
                                String str4 = null;
                                String str5 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    if (nextName4.equals("variantId")) {
                                        str5 = jsonReader.nextString();
                                        if (str5 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    } else if (nextName4.equals("rolloutId")) {
                                        str4 = jsonReader.nextString();
                                        if (str4 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str4 != null && str5 != null) {
                                    i1Var.a = new k1(str4, str5);
                                    break;
                                } else {
                                    StringBuilder sb4 = new StringBuilder();
                                    if (str4 == null) {
                                        sb4.append(" rolloutId");
                                    }
                                    if (str5 == null) {
                                        sb4.append(" variantId");
                                    }
                                    throw new IllegalStateException(t4.c.g("Missing required properties:", sb4));
                                }
                            case true:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 == null) {
                                    throw new NullPointerException("Null parameterValue");
                                }
                                i1Var.c = nextString4;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    g0Var = i1Var.a();
                    continue;
                    arrayList.add(g0Var);
                    break;
                case 4:
                    jsonReader.beginObject();
                    List list = null;
                    byte b10 = 0;
                    int i3 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -1266514778:
                                if (nextName5.equals("frames")) {
                                    z12 = false;
                                    break;
                                }
                                z12 = -1;
                                break;
                            case 3373707:
                                if (nextName5.equals("name")) {
                                    z12 = true;
                                    break;
                                }
                                z12 = -1;
                                break;
                            case 2125650548:
                                if (nextName5.equals("importance")) {
                                    z12 = 2;
                                    break;
                                }
                                z12 = -1;
                                break;
                            default:
                                z12 = -1;
                                break;
                        }
                        switch (z12) {
                            case false:
                                list = d(jsonReader, new d2.t1(6));
                                if (list == null) {
                                    throw new NullPointerException("Null frames");
                                }
                            case true:
                                str = jsonReader.nextString();
                                if (str == null) {
                                    throw new NullPointerException("Null name");
                                }
                            case true:
                                i3 = jsonReader.nextInt();
                                b10 = (byte) (b10 | 1);
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (b10 == 1 && str != null && list != null) {
                        j0Var = new a1(str, i3, list);
                        break;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        if (str == null) {
                            sb5.append(" name");
                        }
                        if ((b10 & 1) == 0) {
                            sb5.append(" importance");
                        }
                        if (list == null) {
                            sb5.append(" frames");
                        }
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb5));
                    }
                    break;
                case 5:
                    jsonReader.beginObject();
                    String str6 = null;
                    String str7 = null;
                    byte b11 = 0;
                    long j10 = 0;
                    long j11 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case 3373707:
                                if (nextName6.equals("name")) {
                                    z13 = false;
                                    break;
                                }
                                z13 = -1;
                                break;
                            case 3530753:
                                if (nextName6.equals("size")) {
                                    z13 = true;
                                    break;
                                }
                                z13 = -1;
                                break;
                            case 3601339:
                                if (nextName6.equals("uuid")) {
                                    z13 = 2;
                                    break;
                                }
                                z13 = -1;
                                break;
                            case 1153765347:
                                if (nextName6.equals("baseAddress")) {
                                    z13 = 3;
                                    break;
                                }
                                z13 = -1;
                                break;
                            default:
                                z13 = -1;
                                break;
                        }
                        switch (z13) {
                            case false:
                                String nextString5 = jsonReader.nextString();
                                if (nextString5 == null) {
                                    throw new NullPointerException("Null name");
                                }
                                str6 = nextString5;
                                break;
                            case true:
                                b11 = (byte) (b11 | 2);
                                j11 = jsonReader.nextLong();
                                break;
                            case true:
                                str7 = new String(Base64.decode(jsonReader.nextString(), 2), u2.a);
                                break;
                            case true:
                                b11 = (byte) (b11 | 1);
                                j10 = jsonReader.nextLong();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b11 != 3 || str6 == null) {
                        StringBuilder sb6 = new StringBuilder();
                        if ((b11 & 1) == 0) {
                            sb6.append(" baseAddress");
                        }
                        if ((b11 & 2) == 0) {
                            sb6.append(" size");
                        }
                        if (str6 == null) {
                            sb6.append(" name");
                        }
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb6));
                    }
                    g0Var = new x0(str6, str7, j10, j11);
                    continue;
                    arrayList.add(g0Var);
                    break;
                default:
                    g0Var = a(jsonReader);
                    continue;
                    arrayList.add(g0Var);
            }
            g0Var = j0Var;
            arrayList.add(g0Var);
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static t0 e(JsonReader jsonReader) {
        char c2;
        char c10;
        List d;
        int i3;
        int i10;
        char c11;
        s0 s0Var = new s0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i11 = 5;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals(TeXSymbolParser.TYPE_ATTR)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
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
                    f1 f1Var = new f1();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
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
                                f1Var.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                f1Var.b = jsonReader.nextInt();
                                f1Var.g = (byte) (f1Var.g | 1);
                                break;
                            case 2:
                                f1Var.d = jsonReader.nextInt();
                                f1Var.g = (byte) (f1Var.g | 4);
                                break;
                            case 3:
                                f1Var.f = jsonReader.nextLong();
                                f1Var.g = (byte) (f1Var.g | 16);
                                break;
                            case 4:
                                f1Var.e = jsonReader.nextLong();
                                f1Var.g = (byte) (f1Var.g | 8);
                                break;
                            case 5:
                                f1Var.c = jsonReader.nextBoolean();
                                f1Var.g = (byte) (f1Var.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    s0Var.d = f1Var.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            d = d(jsonReader, new d2.t1(3));
                            if (d == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                        } else {
                            jsonReader.skipValue();
                            d = list;
                        }
                        list = d;
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                    s0Var.f = new l1(list);
                    break;
                case 2:
                    jsonReader.beginObject();
                    byte b10 = 0;
                    w0 w0Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    e1 e1Var = null;
                    List list4 = null;
                    int i12 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    i3 = 0;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    i3 = 1;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    i3 = 2;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    i3 = 3;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    i3 = 4;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    i3 = i11;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    i3 = 6;
                                    break;
                                }
                                i3 = -1;
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                        switch (i3) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list4 = DesugarCollections.unmodifiableList(arrayList);
                                i11 = 5;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                i11 = 5;
                            case 2:
                                jsonReader.beginObject();
                                List list5 = null;
                                y0 y0Var = null;
                                f0 f0Var = null;
                                k0 k0Var = null;
                                z0 z0Var = null;
                                List list6 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                i10 = 0;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                i10 = 1;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                i10 = 2;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                i10 = 3;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        case 1467719157:
                                            if (nextName5.equals("profilingManagerInfo")) {
                                                i10 = 4;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                i10 = i11;
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
                                            f0Var = c(jsonReader);
                                            i11 = 5;
                                        case 1:
                                            list5 = d(jsonReader, new d2.t1(4));
                                            i11 = 5;
                                        case 2:
                                            jsonReader.beginObject();
                                            long j10 = 0;
                                            String str = null;
                                            byte b11 = 0;
                                            String str2 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c11 = 0;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c11 = 1;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c11 = 2;
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
                                                        j10 = jsonReader.nextLong();
                                                        b11 = (byte) (b11 | 1);
                                                        break;
                                                    case 1:
                                                        str2 = jsonReader.nextString();
                                                        if (str2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                    case 2:
                                                        str = jsonReader.nextString();
                                                        if (str == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b11 != 1 || str == null || str2 == null) {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (str == null) {
                                                    sb2.append(" name");
                                                }
                                                if (str2 == null) {
                                                    sb2.append(" code");
                                                }
                                                if ((b11 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
                                            }
                                            z0Var = new z0(j10, str, str2);
                                            i11 = 5;
                                            break;
                                        case 3:
                                            list6 = d(jsonReader, new d2.t1(i11));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            i11 = 5;
                                        case 4:
                                            k0Var = h(jsonReader);
                                            i11 = 5;
                                        case 5:
                                            y0Var = f(jsonReader);
                                            i11 = 5;
                                        default:
                                            jsonReader.skipValue();
                                            i11 = 5;
                                    }
                                }
                                jsonReader.endObject();
                                if (z0Var == null || list6 == null) {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (z0Var == null) {
                                        sb3.append(" signal");
                                    }
                                    if (list6 == null) {
                                        sb3.append(" binaries");
                                    }
                                    throw new IllegalStateException(t4.c.g("Missing required properties:", sb3));
                                }
                                w0Var = new w0(list5, y0Var, f0Var, k0Var, z0Var, list6);
                                i11 = 5;
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = DesugarCollections.unmodifiableList(arrayList2);
                                i11 = 5;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = DesugarCollections.unmodifiableList(arrayList3);
                                i11 = 5;
                            case 5:
                                i12 = jsonReader.nextInt();
                                b10 = (byte) 1;
                                i11 = 5;
                            case 6:
                                e1Var = g(jsonReader);
                                i11 = 5;
                            default:
                                jsonReader.skipValue();
                                i11 = 5;
                        }
                    }
                    jsonReader.endObject();
                    if (b10 == 1 && w0Var != null) {
                        s0Var.c = new v0(w0Var, list2, list3, bool, e1Var, list4, i12);
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        if (w0Var == null) {
                            sb4.append(" execution");
                        }
                        if (b10 == 0) {
                            sb4.append(" uiOrientation");
                        }
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb4));
                    }
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null content");
                            }
                            str3 = nextString;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 == null) {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                    s0Var.e = new h1(str3);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    s0Var.b = nextString2;
                    break;
                case 5:
                    s0Var.a = jsonReader.nextLong();
                    s0Var.g = (byte) (s0Var.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return s0Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004a, code lost:
    
        if (r2.equals("reason") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y0 f(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i3 = 0;
        String str = null;
        String str2 = null;
        List list = null;
        y0 y0Var = null;
        byte b10 = 0;
        while (true) {
            char c2 = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b10 == 1 && str != null && list != null) {
                    return new y0(str, str2, list, y0Var, i3);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(" type");
                }
                if (list == null) {
                    sb2.append(" frames");
                }
                if ((b10 & 1) == 0) {
                    sb2.append(" overflowCount");
                }
                throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -934964668:
                    break;
                case 3575610:
                    if (nextName.equals(TeXSymbolParser.TYPE_ATTR)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c2 = 4;
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
                    List d = d(jsonReader, new d2.t1(6));
                    if (d == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = d;
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = nextString;
                    break;
                case 3:
                    y0Var = f(jsonReader);
                    break;
                case 4:
                    i3 = jsonReader.nextInt();
                    b10 = (byte) (b10 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static e1 g(JsonReader jsonReader) {
        d1 d1Var = new d1();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    d1Var.b = jsonReader.nextInt();
                    d1Var.e = (byte) (d1Var.e | 1);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    d1Var.a = nextString;
                    break;
                case "defaultProcess":
                    d1Var.d = jsonReader.nextBoolean();
                    d1Var.e = (byte) (d1Var.e | 4);
                    break;
                case "importance":
                    d1Var.c = jsonReader.nextInt();
                    d1Var.e = (byte) (d1Var.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return d1Var.a();
    }

    public static k0 h(JsonReader jsonReader) {
        jsonReader.beginObject();
        l0 l0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("profilingTrigger")) {
                jsonReader.beginObject();
                byte b10 = 0;
                int i3 = 0;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("trigger")) {
                        i3 = jsonReader.nextInt();
                        b10 = (byte) 1;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (b10 != 1) {
                    throw new IllegalStateException("Missing required properties: trigger");
                }
                l0Var = new l0(i3);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (l0Var != null) {
            return new k0(l0Var);
        }
        throw new IllegalStateException("Missing required properties: profilingTrigger");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d0 i(JsonReader jsonReader) {
        char c2;
        char c10;
        char c11;
        boolean z10;
        char c12;
        Charset charset = u2.a;
        c0 c0Var = new c0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
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
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = d(jsonReader, new d2.t1(2));
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
                    if (list == null) {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                    c0Var.k = new i0(str, list);
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    c0Var.a = nextString;
                    break;
                case 2:
                    c0Var.g = jsonReader.nextString();
                    break;
                case 3:
                    c0Var.l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    c0Var.h = nextString2;
                    break;
                case 5:
                    c0Var.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    c0Var.b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    c0Var.d = nextString4;
                    break;
                case '\b':
                    c0Var.e = jsonReader.nextString();
                    break;
                case '\t':
                    c0Var.c = jsonReader.nextInt();
                    c0Var.m = (byte) (c0Var.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    c0Var.i = nextString5;
                    break;
                case 11:
                    m0 m0Var = new m0();
                    m0Var.f = false;
                    m0Var.m = (byte) (m0Var.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c10 = 11;
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
                                m0Var.d = jsonReader.nextLong();
                                m0Var.m = (byte) (m0Var.m | 1);
                                break;
                            case 1:
                                m0Var.c = jsonReader.nextString();
                                break;
                            case 2:
                                m0Var.b = new String(Base64.decode(jsonReader.nextString(), 2), u2.a);
                                break;
                            case 3:
                                m0Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                q0 q0Var = new q0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c11 = 6;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c11 = 7;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c11 = '\b';
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
                                            q0Var.f = jsonReader.nextBoolean();
                                            q0Var.j = (byte) (q0Var.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            q0Var.h = nextString6;
                                            break;
                                        case 2:
                                            q0Var.d = jsonReader.nextLong();
                                            q0Var.j = (byte) (q0Var.j | 4);
                                            break;
                                        case 3:
                                            q0Var.a = jsonReader.nextInt();
                                            q0Var.j = (byte) (q0Var.j | 1);
                                            break;
                                        case 4:
                                            q0Var.e = jsonReader.nextLong();
                                            q0Var.j = (byte) (q0Var.j | 8);
                                            break;
                                        case 5:
                                            q0Var.c = jsonReader.nextInt();
                                            q0Var.j = (byte) (q0Var.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            q0Var.b = nextString7;
                                            break;
                                        case 7:
                                            q0Var.g = jsonReader.nextInt();
                                            q0Var.j = (byte) (q0Var.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            q0Var.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                m0Var.j = q0Var.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                m0Var.k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                m1 m1Var = new m1();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z10 = false;
                                                break;
                                            }
                                            z10 = -1;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z10 = true;
                                                break;
                                            }
                                            z10 = -1;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z10 = 2;
                                                break;
                                            }
                                            z10 = -1;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z10 = 3;
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
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            m1Var.c = nextString9;
                                            break;
                                        case true:
                                            m1Var.d = jsonReader.nextBoolean();
                                            m1Var.e = (byte) (m1Var.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            m1Var.b = nextString10;
                                            break;
                                        case true:
                                            m1Var.a = jsonReader.nextInt();
                                            m1Var.e = (byte) (m1Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                m0Var.i = m1Var.a();
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
                                            str2 = jsonReader.nextString();
                                            if (str2 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                        case 1:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str7 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str3 = jsonReader.nextString();
                                            if (str3 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                        case 4:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str4 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str2 != null && str3 != null) {
                                    m0Var.g = new o0(str2, str3, str4, str5, str6, str7);
                                    break;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (str2 == null) {
                                        sb2.append(" identifier");
                                    }
                                    if (str3 == null) {
                                        sb2.append(" version");
                                    }
                                    throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
                                }
                                break;
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 == null) {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                                m0Var.h = new o1(str8);
                                break;
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                m0Var.a = nextString11;
                                break;
                            case '\n':
                                m0Var.f = jsonReader.nextBoolean();
                                m0Var.m = (byte) (m0Var.m | 2);
                                break;
                            case 11:
                                m0Var.l = jsonReader.nextInt();
                                m0Var.m = (byte) (m0Var.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0Var.j = m0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0Var.a();
    }

    public static d0 j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                d0 i3 = i(jsonReader);
                jsonReader.close();
                return i3;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
