package da;

import a4.m;
import a6.i;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import ci.q9;
import ci.y6;
import com.google.firebase.messaging.n;
import ei.d5;
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
import k5.l;
import k5.t;
import k5.u;
import k5.w;
import l5.h;
import l5.o;
import m.p3;
import m1.j;
import m5.e;
import org.json.JSONObject;
import org.telegram.ui.kv0;
import s5.g;
import w7.f6;
import y9.b0;
import y9.k0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        StringBuilder v = a4.a.v(str);
        v.append(jSONObject.toString());
        String sb2 = v.toString();
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
            str = w.c.g(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = w.c.g(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = w.c.g(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = w.c.g(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = w.c.g(str, " timestamp");
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
            str = w.c.g(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = w.c.g(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = w.c.g(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = w.c.g(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = w.c.g(str, " state");
        }
        if (((String) this.h) == null) {
            str = w.c.g(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = w.c.g(str, " modelClass");
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
                JSONObject B0 = ((m) this.e).B0();
                if (B0 != null) {
                    a Q = ((i) this.c).Q(B0);
                    f("Loaded cached settings: ", B0);
                    ((na.d) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.b(3, i10) || Q.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return Q;
                        } catch (Exception e) {
                            e = e;
                            aVar = Q;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(l5.i iVar, int i10) {
        byte[] bArr;
        long j3;
        m5.a aVar;
        String str;
        m5.a aVar2;
        int i11;
        ii.b0 c10;
        String str2;
        Integer num;
        p3 p3Var;
        int i12;
        final b bVar = this;
        final l5.i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        t5.c cVar = (t5.c) bVar.f;
        e a2 = ((m5.d) bVar.b).a(iVar2.a);
        long j10 = 0;
        while (true) {
            final int i13 = 0;
            g gVar = (g) cVar;
            if (!((Boolean) gVar.f(new t5.b(bVar) { // from class: r5.e
                public final /* synthetic */ da.b b;

                {
                    this.b = bVar;
                }

                @Override // t5.b
                public final Object i() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            l5.i iVar3 = iVar2;
                            g gVar2 = (g) ((s5.d) this.b.c);
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
                            g gVar3 = (g) ((s5.d) this.b.c);
                            gVar3.getClass();
                            return (Iterable) gVar3.c(new kv0(29, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.f(new q9(bVar, iVar2, j10, 7));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) gVar.f(new t5.b(bVar) { // from class: r5.e
                public final /* synthetic */ da.b b;

                {
                    this.b = bVar;
                }

                @Override // t5.b
                public final Object i() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            l5.i iVar3 = iVar2;
                            g gVar2 = (g) ((s5.d) this.b.c);
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
                            g gVar3 = (g) ((s5.d) this.b.c);
                            gVar3.getClass();
                            return (Iterable) gVar3.c(new kv0(29, gVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                f6.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new m5.a(3, -1L);
                bArr = bArr2;
                j3 = j10;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((s5.b) it.next()).c);
                }
                if (bArr2 != null) {
                    s5.c cVar2 = (s5.c) bVar.i;
                    Objects.requireNonNull(cVar2);
                    o5.a aVar3 = (o5.a) gVar.f(new le.b(cVar2, 29));
                    n nVar = new n();
                    nVar.f = new HashMap();
                    nVar.d = Long.valueOf(((u5.a) bVar.g).q());
                    nVar.e = Long.valueOf(((u5.a) bVar.h).q());
                    nVar.a = "GDT_CLIENT_METRICS";
                    i5.c cVar3 = new i5.c("proto");
                    aVar3.getClass();
                    aa.a aVar4 = o.a;
                    aVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        aVar4.j(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    nVar.c = new l5.m(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((j5.b) a2).a(nVar.g()));
                }
                j5.b bVar2 = (j5.b) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
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
                    long q6 = bVar2.f.q();
                    long q10 = bVar2.e.q();
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
                        l5.m mVar = hVar3.c;
                        byte[] bArr3 = bArr2;
                        i5.c cVar4 = mVar.a;
                        byte[] bArr4 = mVar.b;
                        long j11 = j10;
                        if (cVar4.equals(new i5.c("proto"))) {
                            p3Var = new p3();
                            p3Var.d = bArr4;
                        } else if (cVar4.equals(new i5.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            p3 p3Var2 = new p3();
                            p3Var2.e = str4;
                            p3Var = p3Var2;
                        } else {
                            String c11 = f6.c("CctTransportBackend");
                            if (Log.isLoggable(c11, 5)) {
                                Log.w(c11, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j10 = j11;
                        }
                        p3Var.a = Long.valueOf(hVar3.d);
                        p3Var.c = Long.valueOf(hVar3.e);
                        String str5 = (String) hVar3.f.get("tz-offset");
                        p3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        p3Var.h = new k5.n((u) u.a.get(hVar3.b("net-type")), (t) t.a.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.b;
                        if (num2 != null) {
                            p3Var.b = num2;
                        }
                        String str6 = ((Long) p3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) p3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) p3Var.f) == null) {
                            str6 = w.c.g(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new k(((Long) p3Var.a).longValue(), (Integer) p3Var.b, ((Long) p3Var.c).longValue(), (byte[]) p3Var.d, (String) p3Var.e, ((Long) p3Var.f).longValue(), (k5.n) p3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        j10 = j11;
                    }
                    arrayList3.add(new l(q6, q10, jVar, num, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j3 = j10;
                k5.i iVar3 = new k5.i(arrayList3);
                URL url = bVar2.d;
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
                    int i16 = 21;
                    aa.a aVar5 = new aa.a(url, iVar3, str, i16);
                    d5 d5Var = new d5(bVar2, 28);
                    int i17 = 5;
                    do {
                        c10 = d5Var.c(aVar5);
                        URL url2 = (URL) c10.c;
                        if (url2 != null) {
                            f6.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            aVar5 = new aa.a(url2, (k5.i) aVar5.d, (String) aVar5.b, i16);
                        } else {
                            aVar5 = null;
                        }
                        if (aVar5 == null) {
                            break;
                        } else {
                            i17--;
                        }
                    } while (i17 >= 1);
                    int i18 = c10.a;
                    if (i18 == 200) {
                        aVar2 = new m5.a(1, c10.b);
                    } else {
                        if (i18 >= 500 || i18 == 404) {
                            aVar = new m5.a(2, -1L);
                        } else if (i18 == 400) {
                            try {
                                aVar = new m5.a(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                f6.b("CctTransportBackend", "Could not make request to the backend", e);
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
                gVar.f(new y6(this, iterable, iVar, j3, 4));
                ((lf.i) this.d).V(iVar, i10 + 1, true);
                return;
            }
            bVar = this;
            iVar2 = iVar;
            j10 = j3;
            int i19 = 1;
            gVar.f(new kv0(26, bVar, iterable));
            if (i12 == 1) {
                j10 = Math.max(j10, aVar2.b);
                if (bArr != null) {
                    gVar.f(new r5.d(bVar, i19));
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
                gVar.f(new kv0(27, bVar, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
