package da;

import a4.m;
import a6.i;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import ci.p9;
import ci.y6;
import com.google.firebase.messaging.n;
import ei.f;
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
import l5.o;
import la.h;
import m.p3;
import m1.j;
import m5.e;
import org.json.JSONObject;
import org.telegram.ui.fs0;
import r2.s;
import rg.x;
import s5.g;
import w7.h6;
import y9.b0;
import y9.k0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
        StringBuilder u10 = a4.a.u(str);
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
            str = t8.b.v(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = t8.b.v(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = t8.b.v(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = t8.b.v(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = t8.b.v(str, " timestamp");
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
            str = t8.b.v(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = t8.b.v(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = t8.b.v(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = t8.b.v(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = t8.b.v(str, " state");
        }
        if (((String) this.h) == null) {
            str = t8.b.v(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = t8.b.v(str, " modelClass");
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
                JSONObject A0 = ((m) this.e).A0();
                if (A0 != null) {
                    a P = ((i) this.c).P(A0);
                    f("Loaded cached settings: ", A0);
                    ((na.d) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.b(3, i10) || P.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return P;
                        } catch (Exception e7) {
                            e = e7;
                            aVar = P;
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

    public a d() {
        return (a) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(l5.i iVar, int i10) {
        byte[] bArr;
        long j3;
        m5.a aVar;
        String str;
        int i11;
        ii.b0 c10;
        String str2;
        Integer num;
        Iterator it;
        p3 p3Var;
        ArrayList arrayList;
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
            if (!((Boolean) gVar.f(new t5.b(bVar) { // from class: r5.d
                public final /* synthetic */ da.b b;

                {
                    this.b = bVar;
                }

                @Override // t5.b
                public final Object h() {
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
                            return (Iterable) gVar3.c(new x(1, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.f(new p9(bVar, iVar2, j10, 7));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) gVar.f(new t5.b(bVar) { // from class: r5.d
                public final /* synthetic */ da.b b;

                {
                    this.b = bVar;
                }

                @Override // t5.b
                public final Object h() {
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
                            return (Iterable) gVar3.c(new x(1, gVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                h6.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar = new m5.a(3, -1L);
                bArr = bArr2;
                j3 = j10;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((s5.b) it2.next()).c);
                }
                if (bArr2 != null) {
                    s5.c cVar2 = (s5.c) bVar.i;
                    Objects.requireNonNull(cVar2);
                    o5.a aVar2 = (o5.a) gVar.f(new s(cVar2, i14));
                    n nVar = new n();
                    nVar.f = new HashMap();
                    nVar.d = Long.valueOf(((u5.a) bVar.g).q());
                    nVar.e = Long.valueOf(((u5.a) bVar.h).q());
                    nVar.a = "GDT_CLIENT_METRICS";
                    i5.c cVar3 = new i5.c("proto");
                    aVar2.getClass();
                    h hVar = o.a;
                    hVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        hVar.y(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    nVar.c = new l5.m(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList2.add(((j5.b) a2).a(nVar.g()));
                }
                j5.b bVar2 = (j5.b) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList2.get(i15);
                    i15++;
                    l5.h hVar2 = (l5.h) obj;
                    String str3 = hVar2.a;
                    if (hashMap.containsKey(str3)) {
                        arrayList = arrayList2;
                        ((List) hashMap.get(str3)).add(hVar2);
                    } else {
                        arrayList = arrayList2;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(hVar2);
                        hashMap.put(str3, arrayList3);
                    }
                    arrayList2 = arrayList;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    l5.h hVar3 = (l5.h) ((List) entry.getValue()).get(0);
                    w wVar = w.a;
                    long q6 = bVar2.f.q();
                    long q10 = bVar2.e.q();
                    k5.j jVar = new k5.j(new k5.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (l5.h hVar4 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        l5.m mVar = hVar4.c;
                        long j11 = j10;
                        i5.c cVar4 = mVar.a;
                        byte[] bArr4 = mVar.b;
                        if (cVar4.equals(new i5.c("proto"))) {
                            p3Var = new p3();
                            p3Var.d = bArr4;
                            it = it3;
                        } else {
                            it = it3;
                            if (cVar4.equals(new i5.c("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                p3 p3Var2 = new p3();
                                p3Var2.e = str4;
                                p3Var = p3Var2;
                            } else {
                                String c11 = h6.c("CctTransportBackend");
                                if (Log.isLoggable(c11, 5)) {
                                    Log.w(c11, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                                }
                                bArr2 = bArr3;
                                j10 = j11;
                                it3 = it;
                            }
                        }
                        p3Var.a = Long.valueOf(hVar4.d);
                        p3Var.c = Long.valueOf(hVar4.e);
                        String str5 = (String) hVar4.f.get("tz-offset");
                        p3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        p3Var.h = new k5.n((u) u.a.get(hVar4.b("net-type")), (t) t.a.get(hVar4.b("mobile-subtype")));
                        Integer num2 = hVar4.b;
                        if (num2 != null) {
                            p3Var.b = num2;
                        }
                        String str6 = ((Long) p3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) p3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) p3Var.f) == null) {
                            str6 = t8.b.v(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList5.add(new k(((Long) p3Var.a).longValue(), (Integer) p3Var.b, ((Long) p3Var.c).longValue(), (byte[]) p3Var.d, (String) p3Var.e, ((Long) p3Var.f).longValue(), (k5.n) p3Var.h));
                        bArr2 = bArr3;
                        j10 = j11;
                        it3 = it;
                    }
                    arrayList4.add(new l(q6, q10, jVar, num, str2, arrayList5));
                }
                bArr = bArr2;
                j3 = j10;
                k5.i iVar3 = new k5.i(arrayList4);
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
                    aa.a aVar3 = new aa.a(url, iVar3, str, i16);
                    f fVar = new f(bVar2, 29);
                    int i17 = 5;
                    do {
                        c10 = fVar.c(aVar3);
                        URL url2 = (URL) c10.c;
                        if (url2 != null) {
                            h6.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            aVar3 = new aa.a(url2, (k5.i) aVar3.d, (String) aVar3.b, i16);
                        } else {
                            aVar3 = null;
                        }
                        if (aVar3 == null) {
                            break;
                        } else {
                            i17--;
                        }
                    } while (i17 >= 1);
                    int i18 = c10.a;
                    if (i18 == 200) {
                        aVar = new m5.a(1, c10.b);
                    } else if (i18 >= 500 || i18 == 404) {
                        aVar = new m5.a(2, -1L);
                    } else if (i18 == 400) {
                        try {
                            aVar = new m5.a(4, -1L);
                        } catch (IOException e7) {
                            e = e7;
                            h6.b("CctTransportBackend", "Could not make request to the backend", e);
                            i11 = 2;
                            aVar = new m5.a(2, -1L);
                            i12 = aVar.a;
                            if (i12 != i11) {
                            }
                        }
                    } else {
                        aVar = new m5.a(3, -1L);
                    }
                } catch (IOException e10) {
                    e = e10;
                }
            }
            i11 = 2;
            i12 = aVar.a;
            if (i12 != i11) {
                gVar.f(new y6(this, iterable, iVar, j3, 4));
                ((h) this.d).V(iVar, i10 + 1, true);
                return;
            }
            bVar = this;
            long j12 = j3;
            gVar.f(new fs0(28, bVar, iterable));
            if (i12 == 1) {
                j10 = Math.max(j12, aVar.b);
                if (bArr != null) {
                    gVar.f(new s(bVar, 3));
                }
            } else {
                if (i12 == 4) {
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
                    gVar.f(new fs0(29, bVar, hashMap2));
                }
                j10 = j12;
            }
            iVar2 = iVar;
            bArr2 = bArr;
        }
    }
}
