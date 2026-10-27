package aa;

import a8.of;
import aa.b0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.r3;
import m5.i;
import org.json.JSONObject;
import org.telegram.ui.Components.b10;
import org.telegram.ui.bh1;
import t5.g;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder u10 = a1.g.u(str);
        u10.append(jSONObject.toString());
        String sb2 = u10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public c0 a() {
        String str = ((Integer) this.a) == null ? " pid" : "";
        if (((String) this.b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.c) == null) {
            str = b10.u(str, " reasonCode");
        }
        if (((Integer) this.f) == null) {
            str = b10.u(str, " importance");
        }
        if (((Long) this.d) == null) {
            str = b10.u(str, " pss");
        }
        if (((Long) this.e) == null) {
            str = b10.u(str, " rss");
        }
        if (((Long) this.h) == null) {
            str = b10.u(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new c0(((Integer) this.a).intValue(), (String) this.b, ((Integer) this.c).intValue(), ((Integer) this.f).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Long) this.h).longValue(), (String) this.g, (List) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public l0 b() {
        String str = ((Integer) this.a) == null ? " arch" : "";
        if (((String) this.b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.c) == null) {
            str = b10.u(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = b10.u(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = b10.u(str, " diskSpace");
        }
        if (((Boolean) this.h) == null) {
            str = b10.u(str, " simulator");
        }
        if (((Integer) this.f) == null) {
            str = b10.u(str, " state");
        }
        if (((String) this.g) == null) {
            str = b10.u(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = b10.u(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new l0(((Integer) this.a).intValue(), (String) this.b, ((Integer) this.c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.h).booleanValue(), ((Integer) this.f).intValue(), (String) this.g, (String) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public fa.a c(int i10) {
        fa.a aVar = null;
        try {
            if (!m1.j.b(2, i10)) {
                JSONObject H = ((a4.l) this.g).H();
                if (H != null) {
                    fa.a b02 = ((b6.i) this.f).b0(H);
                    f("Loaded cached settings: ", H);
                    ((sb.b) this.b).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (m1.j.b(3, i10) || b02.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return b02;
                        } catch (Exception e) {
                            e = e;
                            aVar = b02;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public fa.a d() {
        return (fa.a) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(m5.i iVar, int i10) {
        byte[] bArr;
        long j10;
        n5.a aVar;
        String str;
        n5.a aVar2;
        int i11;
        k5.b f7;
        String str2;
        Integer num;
        r3 r3Var;
        int i12;
        final b0 b0Var = this;
        final m5.i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        u5.c cVar = (u5.c) b0Var.d;
        n5.e a2 = ((n5.d) b0Var.c).a(iVar2.a);
        long j11 = 0;
        while (true) {
            final int i13 = 0;
            t5.g gVar = (t5.g) cVar;
            if (!((Boolean) gVar.f(new u5.b(b0Var) { // from class: s5.d
                public final /* synthetic */ b0 b;

                {
                    this.b = b0Var;
                }

                @Override // u5.b
                public final Object f() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            i iVar3 = iVar2;
                            g gVar2 = (g) ((t5.d) this.b.f);
                            SQLiteDatabase a10 = gVar2.a();
                            a10.beginTransaction();
                            try {
                                Long b10 = g.b(a10, iVar3);
                                if (b10 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = gVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b10.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th2) {
                                        rawQuery.close();
                                        throw th2;
                                    }
                                }
                                a10.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a10.endTransaction();
                            }
                        default:
                            g gVar3 = (g) ((t5.d) this.b.f);
                            gVar3.getClass();
                            return (Iterable) gVar3.c(new bh1(14, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.f(new bi.i(b0Var, iVar2, j11, 9));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) gVar.f(new u5.b(b0Var) { // from class: s5.d
                public final /* synthetic */ b0 b;

                {
                    this.b = b0Var;
                }

                @Override // u5.b
                public final Object f() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            i iVar3 = iVar2;
                            g gVar2 = (g) ((t5.d) this.b.f);
                            SQLiteDatabase a10 = gVar2.a();
                            a10.beginTransaction();
                            try {
                                Long b10 = g.b(a10, iVar3);
                                if (b10 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = gVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b10.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th2) {
                                        rawQuery.close();
                                        throw th2;
                                    }
                                }
                                a10.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a10.endTransaction();
                            }
                        default:
                            g gVar3 = (g) ((t5.d) this.b.f);
                            gVar3.getClass();
                            return (Iterable) gVar3.c(new bh1(14, gVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                of.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new n5.a(3, -1L);
                bArr = bArr2;
                j10 = j11;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t5.b) it.next()).c);
                }
                if (bArr2 != null) {
                    t5.c cVar2 = (t5.c) b0Var.i;
                    Objects.requireNonNull(cVar2);
                    p5.a aVar3 = (p5.a) gVar.f(new org.telegram.ui.Components.voip.j1(cVar2, 6));
                    m0 m0Var = new m0();
                    m0Var.f = new HashMap();
                    m0Var.a = Long.valueOf(((v5.a) b0Var.e).o());
                    m0Var.e = Long.valueOf(((v5.a) b0Var.h).o());
                    m0Var.b = "GDT_CLIENT_METRICS";
                    j5.c cVar3 = new j5.c("proto");
                    aVar3.getClass();
                    k6.c cVar4 = m5.o.a;
                    cVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        cVar4.s(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    m0Var.d = new m5.m(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((k5.c) a2).a(m0Var.h()));
                }
                k5.c cVar5 = (k5.c) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    m5.h hVar = (m5.h) obj;
                    String str3 = hVar.a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(hVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = hashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    m5.h hVar2 = (m5.h) ((List) entry.getValue()).get(0);
                    l5.w wVar = l5.w.a;
                    long o10 = cVar5.f.o();
                    long o11 = cVar5.e.o();
                    l5.j jVar = new l5.j(new l5.h(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a("model"), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a("manufacturer"), hVar2.a("fingerprint"), hVar2.a("locale"), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (m5.h hVar3 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        m5.m mVar = hVar3.c;
                        byte[] bArr3 = bArr2;
                        j5.c cVar6 = mVar.a;
                        byte[] bArr4 = mVar.b;
                        long j12 = j11;
                        if (cVar6.equals(new j5.c("proto"))) {
                            r3Var = new r3();
                            r3Var.d = bArr4;
                        } else if (cVar6.equals(new j5.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            r3 r3Var2 = new r3();
                            r3Var2.e = str4;
                            r3Var = r3Var2;
                        } else {
                            String c10 = of.c("CctTransportBackend");
                            if (Log.isLoggable(c10, 5)) {
                                Log.w(c10, "Received event of unsupported encoding " + cVar6 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j11 = j12;
                        }
                        r3Var.a = Long.valueOf(hVar3.d);
                        r3Var.c = Long.valueOf(hVar3.e);
                        String str5 = (String) hVar3.f.get("tz-offset");
                        r3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        r3Var.h = new l5.n((l5.u) l5.u.a.get(hVar3.b("net-type")), (l5.t) l5.t.a.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.b;
                        if (num2 != null) {
                            r3Var.b = num2;
                        }
                        String str6 = ((Long) r3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) r3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) r3Var.f) == null) {
                            str6 = b10.u(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new l5.k(((Long) r3Var.a).longValue(), (Integer) r3Var.b, ((Long) r3Var.c).longValue(), (byte[]) r3Var.d, (String) r3Var.e, ((Long) r3Var.f).longValue(), (l5.n) r3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        j11 = j12;
                    }
                    arrayList3.add(new l5.l(o10, o11, jVar, num, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j10 = j11;
                l5.i iVar3 = new l5.i(arrayList3);
                URL url = cVar5.d;
                if (bArr != null) {
                    try {
                        k5.a a10 = k5.a.a(bArr);
                        str = a10.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a10.a;
                        if (str7 != null) {
                            url = k5.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new n5.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i16 = 29;
                    a8.h0 h0Var = new a8.h0(url, iVar3, str, i16);
                    jg.e1 e1Var = new jg.e1(cVar5, 5);
                    int i17 = 5;
                    do {
                        f7 = e1Var.f(h0Var);
                        URL url2 = (URL) f7.c;
                        if (url2 != null) {
                            of.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            h0Var = new a8.h0(url2, (l5.i) h0Var.c, (String) h0Var.d, i16);
                        } else {
                            h0Var = null;
                        }
                        if (h0Var == null) {
                            break;
                        } else {
                            i17--;
                        }
                    } while (i17 >= 1);
                    int i18 = f7.b;
                    if (i18 == 200) {
                        aVar2 = new n5.a(1, f7.a);
                    } else {
                        if (i18 >= 500 || i18 == 404) {
                            aVar = new n5.a(2, -1L);
                        } else if (i18 == 400) {
                            try {
                                aVar = new n5.a(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                of.b("CctTransportBackend", "Could not make request to the backend", e);
                                i11 = 2;
                                aVar2 = new n5.a(2, -1L);
                                i12 = aVar2.a;
                                if (i12 != i11) {
                                }
                            }
                        } else {
                            aVar = new n5.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e10) {
                    e = e10;
                }
            }
            i11 = 2;
            i12 = aVar2.a;
            if (i12 != i11) {
                gVar.f(new ag.j0(this, iterable, iVar, j10, 6));
                ((s4.d) this.b).t(iVar, i10 + 1, true);
                return;
            }
            b0Var = this;
            iVar2 = iVar;
            j11 = j10;
            gVar.f(new bh1(10, b0Var, iterable));
            if (i12 == 1) {
                j11 = Math.max(j11, aVar2.b);
                if (bArr != null) {
                    gVar.f(new org.telegram.ui.Components.voip.j1(b0Var, 8));
                }
            } else if (i12 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str8 = ((t5.b) it4.next()).c.a;
                    if (hashMap2.containsKey(str8)) {
                        hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                    } else {
                        hashMap2.put(str8, 1);
                    }
                }
                gVar.f(new bh1(11, b0Var, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
