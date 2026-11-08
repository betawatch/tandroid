package ea;

import android.util.Base64;
import android.util.JsonReader;
import da.a0;
import da.a1;
import da.a2;
import da.b;
import da.b0;
import da.b1;
import da.b2;
import da.c;
import da.c0;
import da.c1;
import da.c2;
import da.d0;
import da.d1;
import da.d2;
import da.e;
import da.e0;
import da.e1;
import da.e2;
import da.f;
import da.f0;
import da.f1;
import da.f2;
import da.g;
import da.g0;
import da.g1;
import da.g2;
import da.h;
import da.h0;
import da.h1;
import da.h2;
import da.i;
import da.i0;
import da.i1;
import da.i2;
import da.j;
import da.j0;
import da.j1;
import da.j2;
import da.k;
import da.k0;
import da.k1;
import da.k2;
import da.l;
import da.l0;
import da.l1;
import da.l2;
import da.m;
import da.m0;
import da.m1;
import da.m2;
import da.n0;
import da.n1;
import da.n2;
import da.o;
import da.o0;
import da.o1;
import da.o2;
import da.p;
import da.p0;
import da.p2;
import da.q;
import da.q0;
import da.q2;
import da.r;
import da.r0;
import da.r2;
import da.s;
import da.s0;
import da.s2;
import da.t;
import da.t0;
import da.t1;
import da.t2;
import da.u;
import da.u1;
import da.u2;
import da.v;
import da.v0;
import da.v1;
import da.w;
import da.w0;
import da.w1;
import da.x;
import da.x0;
import da.x1;
import da.y;
import da.y0;
import da.y1;
import da.z;
import da.z0;
import da.z1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Components.n;
import pa.d;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a {
    public static final n a;

    static {
        d dVar = new d();
        da.d dVar2 = da.d.a;
        dVar.b(u2.class, dVar2);
        dVar.b(d0.class, dVar2);
        l lVar = l.a;
        dVar.b(t2.class, lVar);
        dVar.b(n0.class, lVar);
        i iVar = i.a;
        dVar.b(b2.class, iVar);
        dVar.b(o0.class, iVar);
        j jVar = j.a;
        dVar.b(a2.class, jVar);
        dVar.b(p0.class, jVar);
        b0 b0Var = b0.a;
        dVar.b(s2.class, b0Var);
        dVar.b(o1.class, b0Var);
        a0 a0Var = a0.a;
        dVar.b(r2.class, a0Var);
        dVar.b(n1.class, a0Var);
        k kVar = k.a;
        dVar.b(c2.class, kVar);
        dVar.b(r0.class, kVar);
        v vVar = v.a;
        dVar.b(q2.class, vVar);
        dVar.b(t0.class, vVar);
        m mVar = m.a;
        dVar.b(k2.class, mVar);
        dVar.b(v0.class, mVar);
        o oVar = o.a;
        dVar.b(i2.class, oVar);
        dVar.b(w0.class, oVar);
        r rVar = r.a;
        dVar.b(h2.class, rVar);
        dVar.b(a1.class, rVar);
        s sVar = s.a;
        dVar.b(g2.class, sVar);
        dVar.b(c1.class, sVar);
        p pVar = p.a;
        dVar.b(e2.class, pVar);
        dVar.b(y0.class, pVar);
        b bVar = b.a;
        dVar.b(u1.class, bVar);
        dVar.b(f0.class, bVar);
        da.a aVar = da.a.a;
        dVar.b(t1.class, aVar);
        dVar.b(g0.class, aVar);
        g gVar = g.a;
        dVar.b(z1.class, gVar);
        dVar.b(k0.class, gVar);
        h hVar = h.a;
        dVar.b(y1.class, hVar);
        dVar.b(l0.class, hVar);
        q qVar = q.a;
        dVar.b(f2.class, qVar);
        dVar.b(z0.class, qVar);
        da.n nVar = da.n.a;
        dVar.b(d2.class, nVar);
        dVar.b(x0.class, nVar);
        c cVar = c.a;
        dVar.b(v1.class, cVar);
        dVar.b(h0.class, cVar);
        t tVar = t.a;
        dVar.b(j2.class, tVar);
        dVar.b(e1.class, tVar);
        u uVar = u.a;
        dVar.b(l2.class, uVar);
        dVar.b(g1.class, uVar);
        w wVar = w.a;
        dVar.b(m2.class, wVar);
        dVar.b(h1.class, wVar);
        z zVar = z.a;
        dVar.b(p2.class, zVar);
        dVar.b(l1.class, zVar);
        x xVar = x.a;
        dVar.b(o2.class, xVar);
        dVar.b(j1.class, xVar);
        y yVar = y.a;
        dVar.b(n2.class, yVar);
        dVar.b(k1.class, yVar);
        e eVar = e.a;
        dVar.b(x1.class, eVar);
        dVar.b(i0.class, eVar);
        f fVar = f.a;
        dVar.b(w1.class, fVar);
        dVar.b(j0.class, fVar);
        dVar.d = true;
        a = new n(dVar);
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
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }

    public static f0 c(JsonReader jsonReader) {
        e0 e0Var = new e0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    e0Var.i = d(jsonReader, new di.a1(11));
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
    public static List d(JsonReader jsonReader, di.a1 a1Var) {
        Object g0Var;
        boolean z9;
        Object j0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str = null;
            switch (a1Var.a) {
                case 11:
                    jsonReader.beginObject();
                    String str2 = null;
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -609862170:
                                if (nextName.equals("libraryName")) {
                                    z9 = false;
                                    break;
                                }
                                z9 = -1;
                                break;
                            case 3002454:
                                if (nextName.equals("arch")) {
                                    z9 = true;
                                    break;
                                }
                                z9 = -1;
                                break;
                            case 230943785:
                                if (nextName.equals("buildId")) {
                                    z9 = 2;
                                    break;
                                }
                                z9 = -1;
                                break;
                            default:
                                z9 = -1;
                                break;
                        }
                        switch (z9) {
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
                        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
                    }
                    g0Var = new g0(str, str2, str3);
                    continue;
                    arrayList.add(g0Var);
                    break;
                case 12:
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
                        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb3));
                    }
                    break;
                case 13:
                    i1 i1Var = new i1();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    z10 = false;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    z10 = 2;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
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
                                    throw new IllegalStateException(a8.p0.q("Missing required properties:", sb4));
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
                case 14:
                    jsonReader.beginObject();
                    List list = null;
                    byte b10 = 0;
                    int i7 = 0;
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
                                list = d(jsonReader, new di.a1(16));
                                if (list == null) {
                                    throw new NullPointerException("Null frames");
                                }
                            case true:
                                str = jsonReader.nextString();
                                if (str == null) {
                                    throw new NullPointerException("Null name");
                                }
                            case true:
                                i7 = jsonReader.nextInt();
                                b10 = (byte) (b10 | 1);
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (b10 == 1 && str != null && list != null) {
                        j0Var = new a1(str, i7, list);
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
                        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb5));
                    }
                    break;
                case 15:
                    jsonReader.beginObject();
                    String str6 = null;
                    String str7 = null;
                    byte b11 = 0;
                    long j3 = 0;
                    long j10 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case 3373707:
                                if (nextName6.equals("name")) {
                                    z12 = false;
                                    break;
                                }
                                z12 = -1;
                                break;
                            case 3530753:
                                if (nextName6.equals("size")) {
                                    z12 = true;
                                    break;
                                }
                                z12 = -1;
                                break;
                            case 3601339:
                                if (nextName6.equals("uuid")) {
                                    z12 = 2;
                                    break;
                                }
                                z12 = -1;
                                break;
                            case 1153765347:
                                if (nextName6.equals("baseAddress")) {
                                    z12 = 3;
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
                                String nextString5 = jsonReader.nextString();
                                if (nextString5 == null) {
                                    throw new NullPointerException("Null name");
                                }
                                str6 = nextString5;
                                break;
                            case true:
                                b11 = (byte) (b11 | 2);
                                j10 = jsonReader.nextLong();
                                break;
                            case true:
                                str7 = new String(Base64.decode(jsonReader.nextString(), 2), u2.a);
                                break;
                            case true:
                                b11 = (byte) (b11 | 1);
                                j3 = jsonReader.nextLong();
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
                        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb6));
                    }
                    g0Var = new x0(str6, str7, j3, j10);
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
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        s0 s0Var = new s0();
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
                    f1 f1Var = new f1();
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
                            List d = d(jsonReader, new di.a1(13));
                            if (d == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                            list = d;
                        } else {
                            jsonReader.skipValue();
                        }
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
                    int i7 = 0;
                    w0 w0Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    e1 e1Var = null;
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
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
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
                                        case 1467719157:
                                            if (nextName5.equals("profilingManagerInfo")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c13 = 5;
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
                                            f0Var = c(jsonReader);
                                        case 1:
                                            list5 = d(jsonReader, new di.a1(14));
                                        case 2:
                                            jsonReader.beginObject();
                                            long j3 = 0;
                                            byte b11 = 0;
                                            String str = null;
                                            String str2 = null;
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
                                                        b11 = (byte) (b11 | 1);
                                                        j3 = jsonReader.nextLong();
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
                                                throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
                                            }
                                            z0Var = new z0(j3, str, str2);
                                            break;
                                        case 3:
                                            list6 = d(jsonReader, new di.a1(15));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                        case 4:
                                            k0Var = h(jsonReader);
                                        case 5:
                                            y0Var = f(jsonReader);
                                        default:
                                            jsonReader.skipValue();
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
                                    throw new IllegalStateException(a8.p0.q("Missing required properties:", sb3));
                                }
                                w0Var = new w0(list5, y0Var, f0Var, k0Var, z0Var, list6);
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = DesugarCollections.unmodifiableList(arrayList2);
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = DesugarCollections.unmodifiableList(arrayList3);
                            case 5:
                                i7 = jsonReader.nextInt();
                                b10 = (byte) 1;
                            case 6:
                                e1Var = g(jsonReader);
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (b10 == 1 && w0Var != null) {
                        s0Var.c = new v0(w0Var, list2, list3, bool, e1Var, list4, i7);
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        if (w0Var == null) {
                            sb4.append(" execution");
                        }
                        if (b10 == 0) {
                            sb4.append(" uiOrientation");
                        }
                        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb4));
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
        int i7 = 0;
        String str = null;
        String str2 = null;
        List list = null;
        y0 y0Var = null;
        byte b10 = 0;
        while (true) {
            char c10 = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b10 == 1 && str != null && list != null) {
                    return new y0(str, str2, list, y0Var, i7);
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
                throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -934964668:
                    break;
                case 3575610:
                    if (nextName.equals(TeXSymbolParser.TYPE_ATTR)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
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
                    List d = d(jsonReader, new di.a1(16));
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
                    i7 = jsonReader.nextInt();
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
                int i7 = 0;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("trigger")) {
                        i7 = jsonReader.nextInt();
                        b10 = (byte) 1;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (b10 != 1) {
                    throw new IllegalStateException("Missing required properties: trigger");
                }
                l0Var = new l0(i7);
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
        char c10;
        char c11;
        char c12;
        boolean z9;
        char c13;
        Charset charset = u2.a;
        c0 c0Var = new c0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
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
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
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
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = d(jsonReader, new di.a1(12));
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
                                                z9 = false;
                                                break;
                                            }
                                            z9 = -1;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z9 = true;
                                                break;
                                            }
                                            z9 = -1;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z9 = 2;
                                                break;
                                            }
                                            z9 = -1;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z9 = 3;
                                                break;
                                            }
                                            z9 = -1;
                                            break;
                                        default:
                                            z9 = -1;
                                            break;
                                    }
                                    switch (z9) {
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
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c13 = 5;
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
                                    throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
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
                d0 i7 = i(jsonReader);
                jsonReader.close();
                return i7;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
