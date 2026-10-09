package da;

import a1.g;
import a4.l;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import ci.q9;
import ci.y6;
import com.google.firebase.messaging.n;
import ei.c5;
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
import k5.t;
import k5.u;
import l5.i;
import la.h;
import m.q3;
import m1.j;
import m4.w;
import org.json.JSONObject;
import qg.x1;
import sc.v;
import w7.i6;
import y9.b0;
import y9.k0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c {
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
        StringBuilder v = g.v(str);
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
            str = v.v(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = v.v(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = v.v(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = v.v(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = v.v(str, " timestamp");
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
            str = v.v(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = v.v(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = v.v(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = v.v(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = v.v(str, " state");
        }
        if (((String) this.h) == null) {
            str = v.v(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = v.v(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.a).intValue(), (String) this.b, ((Integer) this.c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f).booleanValue(), ((Integer) this.g).intValue(), (String) this.h, (String) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public b c(int i10) {
        b bVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject b02 = ((pb.c) this.e).b0();
                if (b02 != null) {
                    b U = ((l) this.c).U(b02);
                    f("Loaded cached settings: ", b02);
                    ((rb.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.b(3, i10) || U.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return U;
                        } catch (Exception e7) {
                            e = e7;
                            bVar = U;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
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

    public b d() {
        return (b) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(i iVar, int i10) {
        byte[] bArr;
        long j3;
        m5.a aVar;
        String str;
        m5.a aVar2;
        int i11;
        ii.b0 d;
        String str2;
        Integer num;
        q3 q3Var;
        int i12;
        final c cVar = this;
        final i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        t5.c cVar2 = (t5.c) cVar.f;
        m5.e a2 = ((m5.d) cVar.b).a(iVar2.a);
        long j10 = 0;
        while (true) {
            final int i13 = 0;
            s5.g gVar = (s5.g) cVar2;
            if (!((Boolean) gVar.f(new t5.b(cVar) { // from class: r5.e
                public final /* synthetic */ da.c b;

                {
                    this.b = cVar;
                }

                @Override // t5.b
                public final Object i() {
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
                            return (Iterable) gVar3.c(new x1(4, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.f(new q9(cVar, iVar2, j10, 7));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) gVar.f(new t5.b(cVar) { // from class: r5.e
                public final /* synthetic */ da.c b;

                {
                    this.b = cVar;
                }

                @Override // t5.b
                public final Object i() {
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
                            return (Iterable) gVar3.c(new x1(4, gVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                i6.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
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
                    s5.c cVar3 = (s5.c) cVar.i;
                    Objects.requireNonNull(cVar3);
                    o5.a aVar3 = (o5.a) gVar.f(new w(cVar3, 29));
                    n nVar = new n();
                    nVar.f = new HashMap();
                    nVar.d = Long.valueOf(((u5.a) cVar.g).Z());
                    nVar.e = Long.valueOf(((u5.a) cVar.h).Z());
                    nVar.a = "GDT_CLIENT_METRICS";
                    i5.c cVar4 = new i5.c("proto");
                    aVar3.getClass();
                    h hVar = l5.n.a;
                    hVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        hVar.z(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    nVar.c = new l5.l(cVar4, byteArrayOutputStream.toByteArray());
                    arrayList.add(((j5.b) a2).a(nVar.g()));
                }
                j5.b bVar = (j5.b) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    l5.h hVar2 = (l5.h) obj;
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
                    l5.h hVar3 = (l5.h) ((List) entry.getValue()).get(0);
                    k5.w wVar = k5.w.a;
                    long Z = bVar.f.Z();
                    long Z2 = bVar.e.Z();
                    k5.j jVar = new k5.j(new k5.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (l5.h hVar4 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        l5.l lVar = hVar4.c;
                        byte[] bArr3 = bArr2;
                        i5.c cVar5 = lVar.a;
                        byte[] bArr4 = lVar.b;
                        long j11 = j10;
                        if (cVar5.equals(new i5.c("proto"))) {
                            q3Var = new q3();
                            q3Var.d = bArr4;
                        } else if (cVar5.equals(new i5.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            q3 q3Var2 = new q3();
                            q3Var2.e = str4;
                            q3Var = q3Var2;
                        } else {
                            String c10 = i6.c("CctTransportBackend");
                            if (Log.isLoggable(c10, 5)) {
                                Log.w(c10, "Received event of unsupported encoding " + cVar5 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j10 = j11;
                        }
                        q3Var.a = Long.valueOf(hVar4.d);
                        q3Var.c = Long.valueOf(hVar4.e);
                        String str5 = (String) hVar4.f.get("tz-offset");
                        q3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        q3Var.h = new k5.n((u) u.a.get(hVar4.b("net-type")), (t) t.a.get(hVar4.b("mobile-subtype")));
                        Integer num2 = hVar4.b;
                        if (num2 != null) {
                            q3Var.b = num2;
                        }
                        String str6 = ((Long) q3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) q3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) q3Var.f) == null) {
                            str6 = v.v(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new k(((Long) q3Var.a).longValue(), (Integer) q3Var.b, ((Long) q3Var.c).longValue(), (byte[]) q3Var.d, (String) q3Var.e, ((Long) q3Var.f).longValue(), (k5.n) q3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        j10 = j11;
                    }
                    arrayList3.add(new k5.l(Z, Z2, jVar, num, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j3 = j10;
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
                    int i16 = 21;
                    aa.a aVar4 = new aa.a(url, iVar3, str, i16);
                    c5 c5Var = new c5(bVar, 28);
                    int i17 = 5;
                    do {
                        d = c5Var.d(aVar4);
                        URL url2 = (URL) d.c;
                        if (url2 != null) {
                            i6.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            aVar4 = new aa.a(url2, (k5.i) aVar4.d, (String) aVar4.b, i16);
                        } else {
                            aVar4 = null;
                        }
                        if (aVar4 == null) {
                            break;
                        } else {
                            i17--;
                        }
                    } while (i17 >= 1);
                    int i18 = d.a;
                    if (i18 == 200) {
                        aVar2 = new m5.a(1, d.b);
                    } else {
                        if (i18 >= 500 || i18 == 404) {
                            aVar = new m5.a(2, -1L);
                        } else if (i18 == 400) {
                            try {
                                aVar = new m5.a(4, -1L);
                            } catch (IOException e7) {
                                e = e7;
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
                    }
                } catch (IOException e10) {
                    e = e10;
                }
            }
            i11 = 2;
            i12 = aVar2.a;
            if (i12 != i11) {
                gVar.f(new y6(this, iterable, iVar, j3, 4));
                ((h) this.d).W(iVar, i10 + 1, true);
                return;
            }
            cVar = this;
            iVar2 = iVar;
            j10 = j3;
            int i19 = 1;
            gVar.f(new x1(i19, cVar, iterable));
            if (i12 == 1) {
                j10 = Math.max(j10, aVar2.b);
                if (bArr != null) {
                    gVar.f(new r5.d(cVar, i19));
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
                gVar.f(new x1(2, cVar, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
