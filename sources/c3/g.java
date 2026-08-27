package c3;

import ag.h0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.firebase.messaging.m;
import d3.h;
import h9.b0;
import h9.k0;
import j$.util.Objects;
import j4.x0;
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
import k5.i;
import m.t3;
import m1.j;
import org.json.JSONObject;
import v2.k;
import v2.t;
import v2.u;
import v2.w;
import w2.l;
import w2.n;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g {
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
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o(str);
        o10.append(jSONObject.toString());
        String sb2 = o10.toString();
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
            str = s3.c.l(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = s3.c.l(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = s3.c.l(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = s3.c.l(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = s3.c.l(str, " timestamp");
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
            str = s3.c.l(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = s3.c.l(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = s3.c.l(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = s3.c.l(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = s3.c.l(str, " state");
        }
        if (((String) this.h) == null) {
            str = s3.c.l(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = s3.c.l(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.a).intValue(), (String) this.b, ((Integer) this.c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f).booleanValue(), ((Integer) this.g).intValue(), (String) this.h, (String) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public m9.a c(int i10) {
        m9.a aVar = null;
        try {
            if (!j.a(2, i10)) {
                JSONObject F = ((i) this.e).F();
                if (F != null) {
                    m9.a h = ((ga.c) this.c).h(F);
                    f("Loaded cached settings: ", F);
                    ((ab.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.a(3, i10) || h.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return h;
                        } catch (Exception e9) {
                            e = e9;
                            aVar = h;
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

    public m9.a d() {
        return (m9.a) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(w2.i iVar, int i10) {
        byte[] bArr;
        long j10;
        x2.a aVar;
        String str;
        x2.a aVar2;
        int i11;
        x0 c10;
        Integer num;
        String str2;
        t3 t3Var;
        int i12;
        final g gVar = this;
        final w2.i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        e3.c cVar = (e3.c) gVar.f;
        x2.e a2 = ((x2.d) gVar.b).a(iVar2.a);
        long j11 = 0;
        while (true) {
            final int i13 = 0;
            h hVar = (h) cVar;
            if (!((Boolean) hVar.f(new e3.b(gVar) { // from class: c3.e
                public final /* synthetic */ g b;

                {
                    this.b = gVar;
                }

                @Override // e3.b
                public final Object i() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            w2.i iVar3 = iVar2;
                            h hVar2 = (h) ((d3.d) this.b.c);
                            SQLiteDatabase a3 = hVar2.a();
                            a3.beginTransaction();
                            try {
                                Long b10 = h.b(a3, iVar3);
                                if (b10 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b10.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a3.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a3.endTransaction();
                            }
                        default:
                            h hVar3 = (h) ((d3.d) this.b.c);
                            hVar3.getClass();
                            return (Iterable) hVar3.c(new h0(14, hVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                hVar.f(new f(gVar, iVar2, j11, 0));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) hVar.f(new e3.b(gVar) { // from class: c3.e
                public final /* synthetic */ g b;

                {
                    this.b = gVar;
                }

                @Override // e3.b
                public final Object i() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            w2.i iVar3 = iVar2;
                            h hVar2 = (h) ((d3.d) this.b.c);
                            SQLiteDatabase a3 = hVar2.a();
                            a3.beginTransaction();
                            try {
                                Long b10 = h.b(a3, iVar3);
                                if (b10 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b10.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a3.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a3.endTransaction();
                            }
                        default:
                            h hVar3 = (h) ((d3.d) this.b.c);
                            hVar3.getClass();
                            return (Iterable) hVar3.c(new h0(14, hVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i15 = 3;
            if (a2 == null) {
                a.a.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new x2.a(3, -1L);
                bArr = bArr2;
                j10 = j11;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d3.b) it.next()).c);
                }
                if (bArr2 != null) {
                    d3.c cVar2 = (d3.c) gVar.i;
                    Objects.requireNonNull(cVar2);
                    z2.a aVar3 = (z2.a) hVar.f(new a1.c(cVar2, i15));
                    m mVar = new m();
                    mVar.f = new HashMap();
                    mVar.d = Long.valueOf(((f3.a) gVar.g).E());
                    mVar.e = Long.valueOf(((f3.a) gVar.h).E());
                    mVar.a = "GDT_CLIENT_METRICS";
                    t2.c cVar3 = new t2.c("proto");
                    aVar3.getClass();
                    u2.b bVar = n.a;
                    bVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bVar.e(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    mVar.c = new l(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((u2.c) a2).a(mVar.i()));
                }
                u2.c cVar4 = (u2.c) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    w2.h hVar2 = (w2.h) obj;
                    String str3 = hVar2.a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = hashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    w2.h hVar3 = (w2.h) ((List) entry.getValue()).get(0);
                    w wVar = w.a;
                    long E = cVar4.f.E();
                    long E2 = cVar4.e.E();
                    v2.j jVar = new v2.j(new v2.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        str2 = null;
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                    } catch (NumberFormatException unused2) {
                        num = null;
                        str2 = (String) entry.getKey();
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (w2.h hVar4 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        l lVar = hVar4.c;
                        byte[] bArr3 = bArr2;
                        t2.c cVar5 = lVar.a;
                        byte[] bArr4 = lVar.b;
                        long j12 = j11;
                        if (cVar5.equals(new t2.c("proto"))) {
                            t3Var = new t3();
                            t3Var.d = bArr4;
                        } else if (cVar5.equals(new t2.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            t3 t3Var2 = new t3();
                            t3Var2.e = str4;
                            t3Var = t3Var2;
                        } else {
                            String c11 = a.a.c("CctTransportBackend");
                            if (Log.isLoggable(c11, 5)) {
                                Log.w(c11, "Received event of unsupported encoding " + cVar5 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j11 = j12;
                        }
                        t3Var.a = Long.valueOf(hVar4.d);
                        t3Var.c = Long.valueOf(hVar4.e);
                        String str5 = (String) hVar4.f.get("tz-offset");
                        t3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        t3Var.h = new v2.n((u) u.a.get(hVar4.b("net-type")), (t) t.a.get(hVar4.b("mobile-subtype")));
                        Integer num2 = hVar4.b;
                        if (num2 != null) {
                            t3Var.b = num2;
                        }
                        String str6 = ((Long) t3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) t3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) t3Var.f) == null) {
                            str6 = s3.c.l(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new k(((Long) t3Var.a).longValue(), (Integer) t3Var.b, ((Long) t3Var.c).longValue(), (byte[]) t3Var.d, (String) t3Var.e, ((Long) t3Var.f).longValue(), (v2.n) t3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        j11 = j12;
                    }
                    arrayList3.add(new v2.l(E, E2, jVar, num, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j10 = j11;
                v2.i iVar3 = new v2.i(arrayList3);
                URL url = cVar4.d;
                if (bArr != null) {
                    try {
                        u2.a a3 = u2.a.a(bArr);
                        str = a3.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a3.a;
                        if (str7 != null) {
                            url = u2.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new x2.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    u2.b bVar2 = new u2.b(url, iVar3, str, 0);
                    t0.c cVar6 = new t0.c(cVar4, 1);
                    int i17 = 5;
                    do {
                        c10 = cVar6.c(bVar2);
                        URL url2 = (URL) c10.c;
                        if (url2 != null) {
                            a.a.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            bVar2 = new u2.b(url2, (v2.i) bVar2.d, (String) bVar2.b, 0);
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            break;
                        } else {
                            i17--;
                        }
                    } while (i17 >= 1);
                    int i18 = c10.b;
                    if (i18 == 200) {
                        aVar2 = new x2.a(1, c10.a);
                    } else {
                        if (i18 >= 500 || i18 == 404) {
                            aVar = new x2.a(2, -1L);
                        } else if (i18 == 400) {
                            try {
                                aVar = new x2.a(4, -1L);
                            } catch (IOException e9) {
                                e = e9;
                                a.a.b("CctTransportBackend", "Could not make request to the backend", e);
                                i11 = 2;
                                aVar2 = new x2.a(2, -1L);
                                i12 = aVar2.a;
                                if (i12 != i11) {
                                }
                            }
                        } else {
                            aVar = new x2.a(3, -1L);
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
                hVar.f(new a9.d(this, iterable, iVar, j10, 2));
                ((a5.n) this.d).y(iVar, i10 + 1, true);
                return;
            }
            gVar = this;
            iVar2 = iVar;
            long j13 = j10;
            hVar.f(new h0(4, gVar, iterable));
            if (i12 == 1) {
                j11 = Math.max(j13, aVar2.b);
                if (bArr != null) {
                    hVar.f(new a1.c(gVar, 5));
                }
            } else {
                if (i12 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        String str8 = ((d3.b) it4.next()).c.a;
                        if (hashMap2.containsKey(str8)) {
                            hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                        } else {
                            hashMap2.put(str8, 1);
                        }
                    }
                    hVar.f(new h0(5, gVar, hashMap2));
                }
                j11 = j13;
            }
            bArr2 = bArr;
        }
    }
}
