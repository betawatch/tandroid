package ha;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import cg.d0;
import g2.f0;
import gi.v5;
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
import k4.j;
import m5.g0;
import m5.h0;
import m5.j0;
import m5.o;
import m5.p;
import m5.q;
import m5.r;
import m5.s;
import m5.t;
import m5.v;
import m5.z;
import n5.h;
import n5.i;
import n5.l;
import n5.n;
import o1.g;
import org.json.JSONObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.na1;
import x7.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public static void d(String str, JSONObject jSONObject) {
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
        l10.append(jSONObject.toString());
        String sb2 = l10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b a(int i3) {
        b bVar = null;
        try {
            if (!g.b(2, i3)) {
                JSONObject n02 = ((android.support.v4.media.c) this.e).n0();
                if (n02 != null) {
                    b k02 = ((v5) this.c).k0(n02);
                    d("Loaded cached settings: ", n02);
                    ((nb.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (g.b(3, i3) || k02.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return k02;
                        } catch (Exception e10) {
                            e = e10;
                            bVar = k02;
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
        } catch (Exception e11) {
            e = e11;
        }
    }

    public b b() {
        return (b) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0420 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(i iVar, int i3) {
        byte[] bArr;
        long j10;
        o5.a aVar;
        String str;
        o5.a aVar2;
        int i10;
        l5.c c2;
        String str2;
        Integer num;
        c cVar;
        int i11;
        final c cVar2 = this;
        final i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        v5.c cVar3 = (v5.c) cVar2.f;
        o5.e a10 = ((o5.d) cVar2.b).a(iVar2.a);
        long j11 = 0;
        while (true) {
            final int i12 = 0;
            u5.g gVar = (u5.g) cVar3;
            if (!((Boolean) gVar.f(new v5.b(cVar2) { // from class: t5.d
                public final /* synthetic */ ha.c b;

                {
                    this.b = cVar2;
                }

                @Override // v5.b
                public final Object d() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            i iVar3 = iVar2;
                            u5.g gVar2 = (u5.g) ((u5.d) this.b.c);
                            SQLiteDatabase a11 = gVar2.a();
                            a11.beginTransaction();
                            try {
                                Long b10 = u5.g.b(a11, iVar3);
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
                                a11.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a11.endTransaction();
                            }
                        default:
                            u5.g gVar3 = (u5.g) ((u5.d) this.b.c);
                            gVar3.getClass();
                            return (Iterable) gVar3.c(new na1(15, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.f(new ci.i(cVar2, iVar2, j11, 9));
                return;
            }
            final int i13 = 1;
            Iterable iterable = (Iterable) gVar.f(new v5.b(cVar2) { // from class: t5.d
                public final /* synthetic */ ha.c b;

                {
                    this.b = cVar2;
                }

                @Override // v5.b
                public final Object d() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            i iVar3 = iVar2;
                            u5.g gVar2 = (u5.g) ((u5.d) this.b.c);
                            SQLiteDatabase a11 = gVar2.a();
                            a11.beginTransaction();
                            try {
                                Long b10 = u5.g.b(a11, iVar3);
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
                                a11.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a11.endTransaction();
                            }
                        default:
                            u5.g gVar3 = (u5.g) ((u5.d) this.b.c);
                            gVar3.getClass();
                            return (Iterable) gVar3.c(new na1(15, gVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a10 == null) {
                m.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new o5.a(3, -1L);
                bArr = bArr2;
                j10 = j11;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((u5.b) it.next()).c);
                }
                if (bArr2 != null) {
                    u5.c cVar4 = (u5.c) cVar2.i;
                    Objects.requireNonNull(cVar4);
                    q5.a aVar3 = (q5.a) gVar.f(new e3(cVar4, 11));
                    f0 f0Var = new f0();
                    f0Var.f = new HashMap();
                    f0Var.d = Long.valueOf(((w5.a) cVar2.g).o());
                    f0Var.e = Long.valueOf(((w5.a) cVar2.h).o());
                    f0Var.a = "GDT_CLIENT_METRICS";
                    k5.c cVar5 = new k5.c("proto");
                    aVar3.getClass();
                    p7.d dVar = n.a;
                    dVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        dVar.l(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    f0Var.c = new l(cVar5, byteArrayOutputStream.toByteArray());
                    arrayList.add(((l5.d) a10).a(f0Var.b()));
                }
                l5.d dVar2 = (l5.d) a10;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
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
                    j0 j0Var = j0.a;
                    long o10 = dVar2.f.o();
                    long o11 = dVar2.e.o();
                    m5.n nVar = new m5.n(new m5.l(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a("model"), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a("manufacturer"), hVar2.a("fingerprint"), hVar2.a("locale"), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
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
                        l lVar = hVar3.c;
                        byte[] bArr3 = bArr2;
                        byte[] bArr4 = hVar3.j;
                        k5.c cVar6 = lVar.a;
                        byte[] bArr5 = lVar.b;
                        long j12 = j11;
                        if (cVar6.equals(new k5.c("proto"))) {
                            cVar = new c();
                            cVar.e = bArr5;
                        } else if (cVar6.equals(new k5.c("json"))) {
                            String str4 = new String(bArr5, Charset.forName("UTF-8"));
                            c cVar7 = new c();
                            cVar7.f = str4;
                            cVar = cVar7;
                        } else {
                            String c10 = m.c("CctTransportBackend");
                            if (Log.isLoggable(c10, 5)) {
                                Log.w(c10, "Received event of unsupported encoding " + cVar6 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j11 = j12;
                        }
                        cVar.a = Long.valueOf(hVar3.d);
                        cVar.d = Long.valueOf(hVar3.e);
                        String str5 = (String) hVar3.f.get("tz-offset");
                        cVar.g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        cVar.h = new v((h0) h0.a.get(hVar3.b("net-type")), (g0) g0.a.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.b;
                        if (num2 != null) {
                            cVar.b = num2;
                        }
                        Integer num3 = hVar3.g;
                        if (num3 != null) {
                            r rVar = new r(new q(num3));
                            z zVar = z.a;
                            cVar.c = new o(rVar);
                        }
                        byte[] bArr6 = hVar3.i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            cVar.i = new p(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String str6 = ((Long) cVar.a) == null ? " eventTimeMs" : "";
                        if (((Long) cVar.d) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) cVar.g) == null) {
                            str6 = t4.c.q(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new s(((Long) cVar.a).longValue(), (Integer) cVar.b, (o) cVar.c, ((Long) cVar.d).longValue(), (byte[]) cVar.e, (String) cVar.f, ((Long) cVar.g).longValue(), (v) cVar.h, (p) cVar.i));
                        it2 = it3;
                        bArr2 = bArr3;
                        j11 = j12;
                    }
                    arrayList3.add(new t(o10, o11, nVar, num, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j10 = j11;
                m5.m mVar = new m5.m(arrayList3);
                URL url = dVar2.d;
                if (bArr != null) {
                    try {
                        l5.a a11 = l5.a.a(bArr);
                        str = a11.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a11.a;
                        if (str7 != null) {
                            url = l5.d.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new o5.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    j jVar = new j(url, mVar, str);
                    l5.b bVar = new l5.b(dVar2, 0);
                    int i15 = 5;
                    do {
                        c2 = bVar.c(jVar);
                        URL url2 = (URL) c2.c;
                        if (url2 != null) {
                            m.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            jVar = new j(url2, (m5.m) jVar.b, (String) jVar.c);
                        } else {
                            jVar = null;
                        }
                        if (jVar == null) {
                            break;
                        } else {
                            i15--;
                        }
                    } while (i15 >= 1);
                    int i16 = c2.b;
                    if (i16 == 200) {
                        aVar2 = new o5.a(1, c2.a);
                    } else {
                        if (i16 >= 500 || i16 == 404) {
                            aVar = new o5.a(2, -1L);
                        } else if (i16 == 400) {
                            try {
                                aVar = new o5.a(4, -1L);
                            } catch (IOException e10) {
                                e = e10;
                                m.b("CctTransportBackend", "Could not make request to the backend", e);
                                i10 = 2;
                                aVar2 = new o5.a(2, -1L);
                                i11 = aVar2.a;
                                if (i11 != i10) {
                                }
                            }
                        } else {
                            aVar = new o5.a(3, -1L);
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
                gVar.f(new d0(this, iterable, iVar, j10, 6));
                ((p7.d) this.d).E(iVar, i3 + 1, true);
                return;
            }
            cVar2 = this;
            iVar2 = iVar;
            j11 = j10;
            gVar.f(new na1(12, cVar2, iterable));
            int i17 = 13;
            if (i11 == 1) {
                j11 = Math.max(j11, aVar2.b);
                if (bArr != null) {
                    gVar.f(new e3(cVar2, i17));
                }
            } else if (i11 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str8 = ((u5.b) it4.next()).c.a;
                    if (hashMap2.containsKey(str8)) {
                        hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                    } else {
                        hashMap2.put(str8, 1);
                    }
                }
                gVar.f(new na1(i17, cVar2, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
