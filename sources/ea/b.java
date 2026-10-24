package ea;

import a1.g;
import a4.l;
import ai.f;
import ai.y3;
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
import k5.k;
import k5.n;
import k5.t;
import k5.w;
import l5.h;
import l5.i;
import l5.m;
import l5.o;
import m.g3;
import m.s3;
import m1.j;
import m5.e;
import org.json.JSONObject;
import org.telegram.ui.Wallet.e8;
import qg.g0;
import si.o0;
import t7.u;
import w7.i6;
import z9.b0;
import z9.k0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b {
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
        StringBuilder u10 = g.u(str);
        u10.append(jSONObject.toString());
        String sb2 = u10.toString();
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
            str = o0.u(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = o0.u(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = o0.u(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = o0.u(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = o0.u(str, " timestamp");
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
            str = o0.u(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = o0.u(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = o0.u(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = o0.u(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = o0.u(str, " state");
        }
        if (((String) this.h) == null) {
            str = o0.u(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = o0.u(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.a).intValue(), (String) this.b, ((Integer) this.c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f).booleanValue(), ((Integer) this.g).intValue(), (String) this.h, (String) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a c(int i10) {
        a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject v = ((qb.c) this.e).v();
                if (v != null) {
                    a Y = ((l) this.c).Y(v);
                    f("Loaded cached settings: ", v);
                    ((u) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.b(3, i10) || Y.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return Y;
                        } catch (Exception e) {
                            e = e;
                            aVar = Y;
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
        } catch (Exception e7) {
            e = e7;
        }
    }

    public a d() {
        return (a) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03e9 A[SYNTHETIC] */
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
        j5.c f7;
        String str2;
        Integer num;
        s3 s3Var;
        int i12;
        final b bVar = this;
        final i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        t5.c cVar = (t5.c) bVar.f;
        e a2 = ((m5.d) bVar.b).a(iVar2.a);
        long j11 = 0;
        while (true) {
            final int i13 = 0;
            s5.g gVar = (s5.g) cVar;
            if (!((Boolean) gVar.f(new t5.b(bVar) { // from class: r5.d
                public final /* synthetic */ ea.b b;

                {
                    this.b = bVar;
                }

                @Override // t5.b
                public final Object j() {
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
                            return (Iterable) gVar3.c(new e8(10, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.f(new f(bVar, iVar2, j11, 9));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) gVar.f(new t5.b(bVar) { // from class: r5.d
                public final /* synthetic */ ea.b b;

                {
                    this.b = bVar;
                }

                @Override // t5.b
                public final Object j() {
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
                            return (Iterable) gVar3.c(new e8(10, gVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i15 = 2;
            if (a2 == null) {
                i6.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new m5.a(3, -1L);
                bArr = bArr2;
                j10 = j11;
                i11 = 2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((s5.b) it.next()).c);
                }
                if (bArr2 != null) {
                    s5.c cVar2 = (s5.c) bVar.i;
                    Objects.requireNonNull(cVar2);
                    o5.a aVar3 = (o5.a) gVar.f(new g0(cVar2, i15));
                    com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
                    lVar.f = new HashMap();
                    lVar.d = Long.valueOf(((u5.a) bVar.g).d());
                    lVar.e = Long.valueOf(((u5.a) bVar.h).d());
                    lVar.a = "GDT_CLIENT_METRICS";
                    i5.c cVar3 = new i5.c("proto");
                    aVar3.getClass();
                    g3 g3Var = o.a;
                    g3Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        g3Var.z(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    lVar.c = new m(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((j5.d) a2).a(lVar.f()));
                }
                j5.d dVar = (j5.d) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    h hVar = (h) obj;
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
                    h hVar2 = (h) ((List) entry.getValue()).get(0);
                    w wVar = w.a;
                    long d = dVar.f.d();
                    long d10 = dVar.e.d();
                    k5.j jVar = new k5.j(new k5.h(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a("model"), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a("manufacturer"), hVar2.a("fingerprint"), hVar2.a("locale"), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (h hVar3 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        m mVar = hVar3.c;
                        byte[] bArr3 = bArr2;
                        i5.c cVar4 = mVar.a;
                        byte[] bArr4 = mVar.b;
                        long j12 = j11;
                        if (cVar4.equals(new i5.c("proto"))) {
                            s3Var = new s3();
                            s3Var.d = bArr4;
                        } else if (cVar4.equals(new i5.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            s3 s3Var2 = new s3();
                            s3Var2.e = str4;
                            s3Var = s3Var2;
                        } else {
                            String c10 = i6.c("CctTransportBackend");
                            if (Log.isLoggable(c10, 5)) {
                                Log.w(c10, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j11 = j12;
                        }
                        s3Var.a = Long.valueOf(hVar3.d);
                        s3Var.c = Long.valueOf(hVar3.e);
                        String str5 = (String) hVar3.f.get("tz-offset");
                        s3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        s3Var.h = new n((k5.u) k5.u.a.get(hVar3.b("net-type")), (t) t.a.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.b;
                        if (num2 != null) {
                            s3Var.b = num2;
                        }
                        String str6 = ((Long) s3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) s3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) s3Var.f) == null) {
                            str6 = o0.u(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new k(((Long) s3Var.a).longValue(), (Integer) s3Var.b, ((Long) s3Var.c).longValue(), (byte[]) s3Var.d, (String) s3Var.e, ((Long) s3Var.f).longValue(), (n) s3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        j11 = j12;
                    }
                    arrayList3.add(new k5.l(d, d10, jVar, num, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j10 = j11;
                k5.i iVar3 = new k5.i(arrayList3);
                URL url = dVar.d;
                if (bArr != null) {
                    try {
                        j5.a a10 = j5.a.a(bArr);
                        str = a10.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a10.a;
                        if (str7 != null) {
                            url = j5.d.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new m5.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i17 = 22;
                    androidx.biometric.e eVar = new androidx.biometric.e(url, iVar3, str, i17);
                    j5.b bVar2 = new j5.b(dVar, 0);
                    int i18 = 5;
                    do {
                        f7 = bVar2.f(eVar);
                        URL url2 = (URL) f7.c;
                        if (url2 != null) {
                            i6.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            eVar = new androidx.biometric.e(url2, (k5.i) eVar.c, (String) eVar.d, i17);
                        } else {
                            eVar = null;
                        }
                        if (eVar == null) {
                            break;
                        } else {
                            i18--;
                        }
                    } while (i18 >= 1);
                    int i19 = f7.b;
                    if (i19 == 200) {
                        aVar2 = new m5.a(1, f7.a);
                        i11 = 2;
                    } else {
                        if (i19 >= 500 || i19 == 404) {
                            aVar = new m5.a(2, -1L);
                        } else if (i19 == 400) {
                            try {
                                aVar = new m5.a(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                i6.b("CctTransportBackend", "Could not make request to the backend", e);
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
                        i11 = 2;
                    }
                } catch (IOException e7) {
                    e = e7;
                }
            }
            i12 = aVar2.a;
            if (i12 != i11) {
                gVar.f(new y3(this, iterable, iVar, j10, 5));
                ((g3) this.d).U(iVar, i10 + 1, true);
                return;
            }
            bVar = this;
            iVar2 = iVar;
            j11 = j10;
            gVar.f(new e8(6, bVar, iterable));
            if (i12 == 1) {
                j11 = Math.max(j11, aVar2.b);
                if (bArr != null) {
                    gVar.f(new g0(bVar, 4));
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
                gVar.f(new e8(7, bVar, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
