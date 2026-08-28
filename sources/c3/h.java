package c3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.firebase.messaging.m;
import g9.b0;
import g9.k0;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h {
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
        StringBuilder n10 = e2.c.n(str);
        n10.append(jSONObject.toString());
        String sb2 = n10.toString();
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
            str = ta.b.j(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = ta.b.j(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = ta.b.j(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = ta.b.j(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = ta.b.j(str, " timestamp");
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
            str = ta.b.j(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = ta.b.j(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = ta.b.j(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = ta.b.j(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = ta.b.j(str, " state");
        }
        if (((String) this.h) == null) {
            str = ta.b.j(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = ta.b.j(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.a).intValue(), (String) this.b, ((Integer) this.c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f).booleanValue(), ((Integer) this.g).intValue(), (String) this.h, (String) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public l9.a c(int i9) {
        l9.a aVar = null;
        try {
            if (!j.a(2, i9)) {
                JSONObject Q = ((android.support.v4.media.c) this.e).Q();
                if (Q != null) {
                    l9.a N = ((i) this.c).N(Q);
                    f("Loaded cached settings: ", Q);
                    ((ya.b) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.a(3, i9) || N.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return N;
                        } catch (Exception e10) {
                            e = e10;
                            aVar = N;
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
        } catch (Exception e11) {
            e = e11;
        }
    }

    public l9.a d() {
        return (l9.a) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(w2.i iVar, int i9) {
        byte[] bArr;
        long j10;
        x2.a aVar;
        String str;
        x2.a aVar2;
        int i10;
        x0 c10;
        String str2;
        Integer num;
        t3 t3Var;
        int i11;
        final h hVar = this;
        final w2.i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        e3.c cVar = (e3.c) hVar.f;
        x2.e a2 = ((x2.d) hVar.b).a(iVar2.a);
        long j11 = 0;
        while (true) {
            final int i12 = 0;
            d3.h hVar2 = (d3.h) cVar;
            if (!((Boolean) hVar2.f(new e3.b(hVar) { // from class: c3.f
                public final /* synthetic */ h b;

                {
                    this.b = hVar;
                }

                @Override // e3.b
                public final Object j() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            w2.i iVar3 = iVar2;
                            d3.h hVar3 = (d3.h) ((d3.d) this.b.c);
                            SQLiteDatabase a3 = hVar3.a();
                            a3.beginTransaction();
                            try {
                                Long b10 = d3.h.b(a3, iVar3);
                                if (b10 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar3.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b10.toString()});
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
                            d3.h hVar4 = (d3.h) ((d3.d) this.b.c);
                            hVar4.getClass();
                            return (Iterable) hVar4.c(new b5.d(14, hVar4, iVar2));
                    }
                }
            })).booleanValue()) {
                hVar2.f(new b9.a(hVar, iVar2, j11, 1));
                return;
            }
            final int i13 = 1;
            Iterable iterable = (Iterable) hVar2.f(new e3.b(hVar) { // from class: c3.f
                public final /* synthetic */ h b;

                {
                    this.b = hVar;
                }

                @Override // e3.b
                public final Object j() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            w2.i iVar3 = iVar2;
                            d3.h hVar3 = (d3.h) ((d3.d) this.b.c);
                            SQLiteDatabase a3 = hVar3.a();
                            a3.beginTransaction();
                            try {
                                Long b10 = d3.h.b(a3, iVar3);
                                if (b10 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar3.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b10.toString()});
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
                            d3.h hVar4 = (d3.h) ((d3.d) this.b.c);
                            hVar4.getClass();
                            return (Iterable) hVar4.c(new b5.d(14, hVar4, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i14 = 9;
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
                    d3.c cVar2 = (d3.c) hVar.i;
                    Objects.requireNonNull(cVar2);
                    z2.a aVar3 = (z2.a) hVar2.f(new a1.c(cVar2, i14));
                    m mVar = new m();
                    mVar.f = new HashMap();
                    mVar.d = Long.valueOf(((f3.a) hVar.g).d());
                    mVar.e = Long.valueOf(((f3.a) hVar.h).d());
                    mVar.a = "GDT_CLIENT_METRICS";
                    t2.c cVar3 = new t2.c("proto");
                    aVar3.getClass();
                    t5.c cVar4 = n.a;
                    cVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        cVar4.c(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    mVar.c = new l(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((u2.b) a2).a(mVar.i()));
                }
                u2.b bVar = (u2.b) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    w2.h hVar3 = (w2.h) obj;
                    String str3 = hVar3.a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(hVar3);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar3);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = hashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    w2.h hVar4 = (w2.h) ((List) entry.getValue()).get(0);
                    w wVar = w.a;
                    long d = bVar.f.d();
                    long d9 = bVar.e.d();
                    v2.j jVar = new v2.j(new v2.h(Integer.valueOf(hVar4.b("sdk-version")), hVar4.a("model"), hVar4.a("hardware"), hVar4.a("device"), hVar4.a("product"), hVar4.a("os-uild"), hVar4.a("manufacturer"), hVar4.a("fingerprint"), hVar4.a("locale"), hVar4.a("country"), hVar4.a("mcc_mnc"), hVar4.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (w2.h hVar5 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        l lVar = hVar5.c;
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
                        t3Var.a = Long.valueOf(hVar5.d);
                        t3Var.c = Long.valueOf(hVar5.e);
                        String str5 = (String) hVar5.f.get("tz-offset");
                        t3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        t3Var.h = new v2.n((u) u.a.get(hVar5.b("net-type")), (t) t.a.get(hVar5.b("mobile-subtype")));
                        Integer num2 = hVar5.b;
                        if (num2 != null) {
                            t3Var.b = num2;
                        }
                        String str6 = ((Long) t3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) t3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) t3Var.f) == null) {
                            str6 = ta.b.j(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new k(((Long) t3Var.a).longValue(), (Integer) t3Var.b, ((Long) t3Var.c).longValue(), (byte[]) t3Var.d, (String) t3Var.e, ((Long) t3Var.f).longValue(), (v2.n) t3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        j11 = j12;
                    }
                    arrayList3.add(new v2.l(d, d9, jVar, num, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j10 = j11;
                v2.i iVar3 = new v2.i(arrayList3);
                URL url = bVar.d;
                if (bArr != null) {
                    try {
                        u2.a a3 = u2.a.a(bArr);
                        str = a3.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a3.a;
                        if (str7 != null) {
                            url = u2.b.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new x2.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    t5.c cVar6 = new t5.c(url, iVar3, str);
                    t0.c cVar7 = new t0.c(bVar, 2);
                    int i16 = 5;
                    do {
                        c10 = cVar7.c(cVar6);
                        URL url2 = (URL) c10.c;
                        if (url2 != null) {
                            a.a.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            cVar6 = new t5.c(url2, (v2.i) cVar6.d, (String) cVar6.c);
                        } else {
                            cVar6 = null;
                        }
                        if (cVar6 == null) {
                            break;
                        } else {
                            i16--;
                        }
                    } while (i16 >= 1);
                    int i17 = c10.b;
                    if (i17 == 200) {
                        aVar2 = new x2.a(1, c10.a);
                    } else {
                        if (i17 >= 500 || i17 == 404) {
                            aVar = new x2.a(2, -1L);
                        } else if (i17 == 400) {
                            try {
                                aVar = new x2.a(4, -1L);
                            } catch (IOException e10) {
                                e = e10;
                                a.a.b("CctTransportBackend", "Could not make request to the backend", e);
                                i10 = 2;
                                aVar2 = new x2.a(2, -1L);
                                i11 = aVar2.a;
                                if (i11 != i10) {
                                }
                            }
                        } else {
                            aVar = new x2.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            }
            i10 = 2;
            i11 = aVar2.a;
            if (i11 != i10) {
                hVar2.f(new g(this, iterable, iVar, j10, 0));
                ((a5.m) this.d).A(iVar, i9 + 1, true);
                return;
            }
            hVar = this;
            iVar2 = iVar;
            j11 = j10;
            hVar2.f(new b5.d(8, hVar, iterable));
            if (i11 == 1) {
                j11 = Math.max(j11, aVar2.b);
                if (bArr != null) {
                    hVar2.f(new a1.c(hVar, 11));
                }
            } else if (i11 == 4) {
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
                hVar2.f(new b5.d(9, hVar, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
