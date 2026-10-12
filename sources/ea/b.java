package ea;

import a1.g;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.firebase.messaging.m;
import di.p9;
import di.w6;
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
import ji.m5;
import k5.t;
import k5.w;
import k6.h;
import l5.i;
import l5.l;
import l5.n;
import li.k;
import m.q3;
import m1.j;
import m5.e;
import org.json.JSONObject;
import org.telegram.ui.web.c0;
import t7.u;
import w7.l6;
import z9.b0;
import z9.k0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
            str = t8.b.u(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = t8.b.u(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = t8.b.u(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = t8.b.u(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = t8.b.u(str, " timestamp");
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
            str = t8.b.u(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = t8.b.u(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = t8.b.u(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = t8.b.u(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = t8.b.u(str, " state");
        }
        if (((String) this.h) == null) {
            str = t8.b.u(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = t8.b.u(str, " modelClass");
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
                JSONObject d02 = ((qb.c) this.e).d0();
                if (d02 != null) {
                    a q6 = ((h) this.c).q(d02);
                    f("Loaded cached settings: ", d02);
                    ((u) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.b(3, i10) || q6.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return q6;
                        } catch (Exception e) {
                            e = e;
                            aVar = q6;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03f5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(i iVar, int i10) {
        byte[] bArr;
        long j10;
        m5.a aVar;
        String str;
        int i11;
        j5.b b10;
        String str2;
        Integer num;
        Iterator it;
        q3 q3Var;
        ArrayList arrayList;
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
                public final Object h() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            i iVar3 = iVar2;
                            s5.g gVar2 = (s5.g) ((s5.d) this.b.c);
                            SQLiteDatabase a10 = gVar2.a();
                            a10.beginTransaction();
                            try {
                                Long b11 = s5.g.b(a10, iVar3);
                                if (b11 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = gVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b11.toString()});
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
                            return (Iterable) gVar3.c(new c0(7, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.f(new p9(bVar, iVar2, j11, 7));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) gVar.f(new t5.b(bVar) { // from class: r5.d
                public final /* synthetic */ ea.b b;

                {
                    this.b = bVar;
                }

                @Override // t5.b
                public final Object h() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            i iVar3 = iVar2;
                            s5.g gVar2 = (s5.g) ((s5.d) this.b.c);
                            SQLiteDatabase a10 = gVar2.a();
                            a10.beginTransaction();
                            try {
                                Long b11 = s5.g.b(a10, iVar3);
                                if (b11 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = gVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b11.toString()});
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
                            return (Iterable) gVar3.c(new c0(7, gVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                l6.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar = new m5.a(3, -1L);
                bArr = bArr2;
                j10 = j11;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((s5.b) it2.next()).c);
                }
                if (bArr2 != null) {
                    s5.c cVar2 = (s5.c) bVar.i;
                    Objects.requireNonNull(cVar2);
                    o5.a aVar2 = (o5.a) gVar.f(new m5(cVar2, 23));
                    m mVar = new m();
                    mVar.f = new HashMap();
                    mVar.d = Long.valueOf(((u5.a) bVar.g).d());
                    mVar.e = Long.valueOf(((u5.a) bVar.h).d());
                    mVar.a = "GDT_CLIENT_METRICS";
                    i5.c cVar3 = new i5.c("proto");
                    aVar2.getClass();
                    k kVar = n.a;
                    kVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar.x(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    mVar.c = new l(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList2.add(((j5.c) a2).a(mVar.g()));
                }
                j5.c cVar4 = (j5.c) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList2.get(i15);
                    i15++;
                    l5.h hVar = (l5.h) obj;
                    String str3 = hVar.a;
                    if (hashMap.containsKey(str3)) {
                        arrayList = arrayList2;
                        ((List) hashMap.get(str3)).add(hVar);
                    } else {
                        arrayList = arrayList2;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(hVar);
                        hashMap.put(str3, arrayList3);
                    }
                    arrayList2 = arrayList;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    l5.h hVar2 = (l5.h) ((List) entry.getValue()).get(0);
                    w wVar = w.a;
                    long d = cVar4.f.d();
                    long d10 = cVar4.e.d();
                    k5.j jVar = new k5.j(new k5.h(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a("model"), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a("manufacturer"), hVar2.a("fingerprint"), hVar2.a("locale"), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (l5.h hVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        l lVar = hVar3.c;
                        long j12 = j11;
                        i5.c cVar5 = lVar.a;
                        byte[] bArr4 = lVar.b;
                        if (cVar5.equals(new i5.c("proto"))) {
                            q3Var = new q3();
                            q3Var.d = bArr4;
                            it = it3;
                        } else {
                            it = it3;
                            if (cVar5.equals(new i5.c("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                q3 q3Var2 = new q3();
                                q3Var2.e = str4;
                                q3Var = q3Var2;
                            } else {
                                String c10 = l6.c("CctTransportBackend");
                                if (Log.isLoggable(c10, 5)) {
                                    Log.w(c10, "Received event of unsupported encoding " + cVar5 + ". Skipping...");
                                }
                                bArr2 = bArr3;
                                j11 = j12;
                                it3 = it;
                            }
                        }
                        q3Var.a = Long.valueOf(hVar3.d);
                        q3Var.c = Long.valueOf(hVar3.e);
                        String str5 = (String) hVar3.f.get("tz-offset");
                        q3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        q3Var.h = new k5.n((k5.u) k5.u.a.get(hVar3.b("net-type")), (t) t.a.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.b;
                        if (num2 != null) {
                            q3Var.b = num2;
                        }
                        String str6 = ((Long) q3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) q3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) q3Var.f) == null) {
                            str6 = t8.b.u(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList5.add(new k5.k(((Long) q3Var.a).longValue(), (Integer) q3Var.b, ((Long) q3Var.c).longValue(), (byte[]) q3Var.d, (String) q3Var.e, ((Long) q3Var.f).longValue(), (k5.n) q3Var.h));
                        bArr2 = bArr3;
                        j11 = j12;
                        it3 = it;
                    }
                    arrayList4.add(new k5.l(d, d10, jVar, num, str2, arrayList5));
                }
                bArr = bArr2;
                j10 = j11;
                k5.i iVar3 = new k5.i(arrayList4);
                URL url = cVar4.d;
                if (bArr != null) {
                    try {
                        j5.a a10 = j5.a.a(bArr);
                        str = a10.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a10.a;
                        if (str7 != null) {
                            url = j5.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new m5.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i16 = 22;
                    androidx.biometric.e eVar = new androidx.biometric.e(url, iVar3, str, i16);
                    f1.a aVar3 = new f1.a(cVar4, 21);
                    int i17 = 5;
                    do {
                        b10 = aVar3.b(eVar);
                        URL url2 = (URL) b10.c;
                        if (url2 != null) {
                            l6.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            eVar = new androidx.biometric.e(url2, (k5.i) eVar.c, (String) eVar.d, i16);
                        } else {
                            eVar = null;
                        }
                        if (eVar == null) {
                            break;
                        } else {
                            i17--;
                        }
                    } while (i17 >= 1);
                    int i18 = b10.b;
                    if (i18 == 200) {
                        aVar = new m5.a(1, b10.a);
                    } else if (i18 >= 500 || i18 == 404) {
                        aVar = new m5.a(2, -1L);
                    } else if (i18 == 400) {
                        try {
                            aVar = new m5.a(4, -1L);
                        } catch (IOException e) {
                            e = e;
                            l6.b("CctTransportBackend", "Could not make request to the backend", e);
                            i11 = 2;
                            aVar = new m5.a(2, -1L);
                            i12 = aVar.a;
                            if (i12 != i11) {
                            }
                        }
                    } else {
                        aVar = new m5.a(3, -1L);
                    }
                } catch (IOException e7) {
                    e = e7;
                }
            }
            i11 = 2;
            i12 = aVar.a;
            if (i12 != i11) {
                gVar.f(new w6(this, iterable, iVar, j10, 4));
                ((k) this.d).U(iVar, i10 + 1, true);
                return;
            }
            bVar = this;
            long j13 = j10;
            gVar.f(new c0(3, bVar, iterable));
            if (i12 == 1) {
                j11 = Math.max(j13, aVar.b);
                if (bArr != null) {
                    gVar.f(new m5(bVar, 25));
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
                    gVar.f(new c0(4, bVar, hashMap2));
                }
                j11 = j13;
            }
            iVar2 = iVar;
            bArr2 = bArr;
        }
    }
}
