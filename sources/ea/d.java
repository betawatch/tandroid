package ea;

import a1.g;
import a4.l;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.media.session.a0;
import android.util.Log;
import bi.d0;
import ig.c0;
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
import k5.t;
import k5.w;
import k6.h;
import l5.i;
import l5.n;
import li.k;
import m.p3;
import m1.j;
import org.json.JSONObject;
import org.telegram.ui.vg;
import t7.u;
import w7.n6;
import z9.b0;
import z9.k0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d {
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
        StringBuilder t10 = g.t(str);
        t10.append(jSONObject.toString());
        String sb2 = t10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b0 a() {
        String str = ((Integer) this.a) == null ? " pid" : "";
        if (((String) this.b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.c) == null) {
            str = sc.e.A(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = sc.e.A(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = sc.e.A(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = sc.e.A(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = sc.e.A(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new b0(((Integer) this.a).intValue(), (String) this.b, ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f).longValue(), ((Long) this.g).longValue(), (String) this.h, (List) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k0 b() {
        String str = ((Integer) this.a) == null ? " arch" : "";
        if (((String) this.b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.c) == null) {
            str = sc.e.A(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = sc.e.A(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = sc.e.A(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = sc.e.A(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = sc.e.A(str, " state");
        }
        if (((String) this.h) == null) {
            str = sc.e.A(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = sc.e.A(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.a).intValue(), (String) this.b, ((Integer) this.c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f).booleanValue(), ((Integer) this.g).intValue(), (String) this.h, (String) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public c c(int i10) {
        c cVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject A = ((h) this.e).A();
                if (A != null) {
                    c z10 = ((l) this.c).z(A);
                    f("Loaded cached settings: ", A);
                    ((u) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.b(3, i10) || z10.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return z10;
                        } catch (Exception e) {
                            e = e;
                            cVar = z10;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return cVar;
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
        } catch (Exception e7) {
            e = e7;
        }
    }

    public c d() {
        return (c) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(i iVar, int i10) {
        byte[] bArr;
        long j10;
        m5.a aVar;
        String str;
        m5.a aVar2;
        int i11;
        d0 k10;
        String str2;
        Integer num;
        p3 p3Var;
        int i12;
        final d dVar = this;
        final i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        t5.c cVar = (t5.c) dVar.f;
        m5.f a2 = ((m5.d) dVar.b).a(iVar2.a);
        long j11 = 0;
        while (true) {
            final int i13 = 0;
            s5.g gVar = (s5.g) cVar;
            if (!((Boolean) gVar.f(new t5.b(dVar) { // from class: r5.e
                public final /* synthetic */ ea.d b;

                {
                    this.b = dVar;
                }

                @Override // t5.b
                public final Object g() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            i iVar3 = iVar2;
                            s5.g gVar2 = (s5.g) ((s5.d) this.b.c);
                            SQLiteDatabase a10 = gVar2.a();
                            a10.beginTransaction();
                            try {
                                Long b10 = s5.g.b(a10, iVar3);
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
                            s5.g gVar3 = (s5.g) ((s5.d) this.b.c);
                            gVar3.getClass();
                            return (Iterable) gVar3.c(new org.telegram.ui.web.k0(15, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.f(new org.telegram.messenger.voip.d0(dVar, iVar2, j11, 6));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) gVar.f(new t5.b(dVar) { // from class: r5.e
                public final /* synthetic */ ea.d b;

                {
                    this.b = dVar;
                }

                @Override // t5.b
                public final Object g() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            i iVar3 = iVar2;
                            s5.g gVar2 = (s5.g) ((s5.d) this.b.c);
                            SQLiteDatabase a10 = gVar2.a();
                            a10.beginTransaction();
                            try {
                                Long b10 = s5.g.b(a10, iVar3);
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
                            s5.g gVar3 = (s5.g) ((s5.d) this.b.c);
                            gVar3.getClass();
                            return (Iterable) gVar3.c(new org.telegram.ui.web.k0(15, gVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                n6.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new m5.a(3, -1L);
                bArr = bArr2;
                j10 = j11;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((s5.b) it.next()).c);
                }
                int i15 = 23;
                if (bArr2 != null) {
                    s5.c cVar2 = (s5.c) dVar.i;
                    Objects.requireNonNull(cVar2);
                    o5.a aVar3 = (o5.a) gVar.f(new mg.l(cVar2, i15));
                    j2.f fVar = new j2.f();
                    fVar.f = new HashMap();
                    fVar.d = Long.valueOf(((u5.a) dVar.g).g());
                    fVar.e = Long.valueOf(((u5.a) dVar.h).g());
                    fVar.a = "GDT_CLIENT_METRICS";
                    i5.c cVar3 = new i5.c("proto");
                    aVar3.getClass();
                    k kVar = n.a;
                    kVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar.q(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    fVar.c = new l5.l(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((j5.b) a2).a(fVar.f()));
                }
                j5.b bVar = (j5.b) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    l5.h hVar = (l5.h) obj;
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
                    l5.h hVar2 = (l5.h) ((List) entry.getValue()).get(0);
                    w wVar = w.a;
                    long g10 = bVar.f.g();
                    long g11 = bVar.e.g();
                    k5.j jVar = new k5.j(new k5.h(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a("model"), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a("manufacturer"), hVar2.a("fingerprint"), hVar2.a("locale"), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (l5.h hVar3 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        l5.l lVar = hVar3.c;
                        byte[] bArr3 = bArr2;
                        i5.c cVar4 = lVar.a;
                        byte[] bArr4 = lVar.b;
                        long j12 = j11;
                        if (cVar4.equals(new i5.c("proto"))) {
                            p3Var = new p3();
                            p3Var.d = bArr4;
                        } else if (cVar4.equals(new i5.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            p3 p3Var2 = new p3();
                            p3Var2.e = str4;
                            p3Var = p3Var2;
                        } else {
                            String c10 = n6.c("CctTransportBackend");
                            if (Log.isLoggable(c10, 5)) {
                                Log.w(c10, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j11 = j12;
                        }
                        p3Var.a = Long.valueOf(hVar3.d);
                        p3Var.c = Long.valueOf(hVar3.e);
                        String str5 = (String) hVar3.f.get("tz-offset");
                        p3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        p3Var.h = new k5.n((k5.u) k5.u.a.get(hVar3.b("net-type")), (t) t.a.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.b;
                        if (num2 != null) {
                            p3Var.b = num2;
                        }
                        String str6 = ((Long) p3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) p3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) p3Var.f) == null) {
                            str6 = sc.e.A(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new k5.k(((Long) p3Var.a).longValue(), (Integer) p3Var.b, ((Long) p3Var.c).longValue(), (byte[]) p3Var.d, (String) p3Var.e, ((Long) p3Var.f).longValue(), (k5.n) p3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        j11 = j12;
                    }
                    arrayList3.add(new k5.l(g10, g11, jVar, num, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j10 = j11;
                k5.i iVar3 = new k5.i(arrayList3);
                URL url = bVar.d;
                if (bArr != null) {
                    try {
                        j5.a a10 = j5.a.a(bArr);
                        str = a10.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a10.a;
                        if (str7 != null) {
                            url = j5.b.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new m5.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    a0 a0Var = new a0(url, iVar3, str, 23);
                    c0 c0Var = new c0(bVar, 8);
                    int i17 = 5;
                    do {
                        k10 = c0Var.k(a0Var);
                        URL url2 = (URL) k10.c;
                        if (url2 != null) {
                            n6.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            a0Var = new a0(url2, (k5.i) a0Var.c, (String) a0Var.d, 23);
                        } else {
                            a0Var = null;
                        }
                        if (a0Var == null) {
                            break;
                        } else {
                            i17--;
                        }
                    } while (i17 >= 1);
                    int i18 = k10.a;
                    if (i18 == 200) {
                        aVar2 = new m5.a(1, k10.b);
                    } else {
                        if (i18 >= 500 || i18 == 404) {
                            aVar = new m5.a(2, -1L);
                        } else if (i18 == 400) {
                            try {
                                aVar = new m5.a(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                n6.b("CctTransportBackend", "Could not make request to the backend", e);
                                i11 = 2;
                                aVar2 = new m5.a(2, -1L);
                                i12 = aVar2.a;
                                if (i12 != i11) {
                                }
                            }
                        } else {
                            aVar = new m5.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e7) {
                    e = e7;
                }
            }
            i11 = 2;
            i12 = aVar2.a;
            if (i12 != i11) {
                gVar.f(new vg(this, iterable, iVar, j10, 3));
                ((q5.d) this.d).x(iVar, i10 + 1, true);
                return;
            }
            dVar = this;
            iVar2 = iVar;
            j11 = j10;
            gVar.f(new org.telegram.ui.web.k0(10, dVar, iterable));
            if (i12 == 1) {
                j11 = Math.max(j11, aVar2.b);
                if (bArr != null) {
                    gVar.f(new mg.l(dVar, 25));
                }
            } else if (i12 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str8 = ((s5.b) it4.next()).c.a;
                    if (hashMap2.containsKey(str8)) {
                        hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                    } else {
                        hashMap2.put(str8, 1);
                    }
                }
                gVar.f(new org.telegram.ui.web.k0(11, dVar, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
