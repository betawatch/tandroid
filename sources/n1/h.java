package n1;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.y;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import k1.l;
import kotlin.jvm.internal.j;
import m1.i;
import m1.k;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h {
    public static final h a = new h();

    public final b a(FileInputStream fileInputStream) {
        try {
            m1.f l10 = m1.f.l(fileInputStream);
            b bVar = new b(false);
            f[] pairs = (f[]) Arrays.copyOf(new f[0], 0);
            j.e(pairs, "pairs");
            if (bVar.b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            if (pairs.length > 0) {
                f fVar = pairs[0];
                throw null;
            }
            Map j10 = l10.j();
            j.d(j10, "preferencesProto.preferencesMap");
            for (Map.Entry entry : j10.entrySet()) {
                String name = (String) entry.getKey();
                k value = (k) entry.getValue();
                j.d(name, "name");
                j.d(value, "value");
                int x8 = value.x();
                switch (x8 == 0 ? -1 : g.a[m1.j.b(x8)]) {
                    case -1:
                        throw new k1.a("Value case is null.", null);
                    case 0:
                    default:
                        throw new a7.c();
                    case 1:
                        bVar.b(new e(name), Boolean.valueOf(value.p()));
                        break;
                    case 2:
                        bVar.b(new e(name), Float.valueOf(value.s()));
                        break;
                    case 3:
                        bVar.b(new e(name), Double.valueOf(value.r()));
                        break;
                    case 4:
                        bVar.b(new e(name), Integer.valueOf(value.t()));
                        break;
                    case 5:
                        bVar.b(new e(name), Long.valueOf(value.u()));
                        break;
                    case 6:
                        e eVar = new e(name);
                        String v = value.v();
                        j.d(v, "value.string");
                        bVar.b(eVar, v);
                        break;
                    case 7:
                        e eVar2 = new e(name);
                        y k10 = value.w().k();
                        j.d(k10, "value.stringSet.stringsList");
                        bVar.b(eVar2, qc.g.p(k10));
                        break;
                    case 8:
                        throw new k1.a("Value not set.", null);
                }
            }
            Map unmodifiableMap = DesugarCollections.unmodifiableMap(bVar.a);
            j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
            return new b(new LinkedHashMap(unmodifiableMap), true);
        } catch (b0 e9) {
            throw new k1.a("Unable to parse preferences proto.", e9);
        }
    }

    public final void b(Object obj, l lVar) {
        w a2;
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) obj).a);
        j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        m1.d k10 = m1.f.k();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.a;
            if (value instanceof Boolean) {
                i y10 = k.y();
                boolean booleanValue = ((Boolean) value).booleanValue();
                y10.c();
                k.m((k) y10.b, booleanValue);
                a2 = y10.a();
            } else if (value instanceof Float) {
                i y11 = k.y();
                float floatValue = ((Number) value).floatValue();
                y11.c();
                k.n((k) y11.b, floatValue);
                a2 = y11.a();
            } else if (value instanceof Double) {
                i y12 = k.y();
                double doubleValue = ((Number) value).doubleValue();
                y12.c();
                k.l((k) y12.b, doubleValue);
                a2 = y12.a();
            } else if (value instanceof Integer) {
                i y13 = k.y();
                int intValue = ((Number) value).intValue();
                y13.c();
                k.o((k) y13.b, intValue);
                a2 = y13.a();
            } else if (value instanceof Long) {
                i y14 = k.y();
                long longValue = ((Number) value).longValue();
                y14.c();
                k.i((k) y14.b, longValue);
                a2 = y14.a();
            } else if (value instanceof String) {
                i y15 = k.y();
                y15.c();
                k.j((k) y15.b, (String) value);
                a2 = y15.a();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(j.g(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                i y16 = k.y();
                m1.g l10 = m1.h.l();
                l10.c();
                m1.h.i((m1.h) l10.b, (Set) value);
                y16.c();
                k.k((k) y16.b, l10);
                a2 = y16.a();
            }
            k10.getClass();
            k10.c();
            m1.f.i((m1.f) k10.b).put(str, (k) a2);
        }
        m1.f fVar = (m1.f) k10.a();
        int a3 = fVar.a();
        Logger logger = androidx.datastore.preferences.protobuf.k.h;
        if (a3 > 4096) {
            a3 = 4096;
        }
        androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k(lVar, a3);
        fVar.c(kVar);
        if (kVar.f > 0) {
            kVar.B();
        }
    }
}
