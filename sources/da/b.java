package da;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import bi.a8;
import bi.bb;
import com.google.firebase.messaging.n;
import hi.c0;
import hi.y1;
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
import k5.w;
import l5.h;
import l5.i;
import l5.l;
import m.e3;
import m.r3;
import m1.j;
import m5.e;
import org.json.JSONObject;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.fz0;
import s5.g;
import w7.i6;
import y9.b0;
import y9.k0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            str = r6.t(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = r6.t(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = r6.t(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = r6.t(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = r6.t(str, " timestamp");
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
            str = r6.t(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = r6.t(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = r6.t(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = r6.t(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = r6.t(str, " state");
        }
        if (((String) this.h) == null) {
            str = r6.t(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = r6.t(str, " modelClass");
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
                JSONObject B0 = ((xa.c) this.e).B0();
                if (B0 != null) {
                    a x10 = ((pb.c) this.c).x(B0);
                    f("Loaded cached settings: ", B0);
                    ((na.d) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.b(3, i10) || x10.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return x10;
                        } catch (Exception e) {
                            e = e;
                            aVar = x10;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03ed A[SYNTHETIC] */
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
        c0 h;
        String str2;
        Integer num;
        r3 r3Var;
        int i12;
        final b bVar = this;
        final i iVar2 = iVar;
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
                public final Object g() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            i iVar3 = iVar2;
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
                            return (Iterable) gVar3.c(new fz0(25, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.f(new bb(bVar, iVar2, j10, 7));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) gVar.f(new t5.b(bVar) { // from class: r5.d
                public final /* synthetic */ da.b b;

                {
                    this.b = bVar;
                }

                @Override // t5.b
                public final Object g() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            i iVar3 = iVar2;
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
                            return (Iterable) gVar3.c(new fz0(25, gVar3, iVar2));
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
                    s5.c cVar2 = (s5.c) bVar.i;
                    Objects.requireNonNull(cVar2);
                    o5.a aVar3 = (o5.a) gVar.f(new org.telegram.tgnet.j(cVar2, 19));
                    n nVar = new n();
                    nVar.f = new HashMap();
                    nVar.d = Long.valueOf(((u5.a) bVar.g).u());
                    nVar.e = Long.valueOf(((u5.a) bVar.h).u());
                    nVar.a = "GDT_CLIENT_METRICS";
                    i5.c cVar3 = new i5.c("proto");
                    aVar3.getClass();
                    aa.a aVar4 = l5.n.a;
                    aVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        aVar4.j(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    nVar.c = new l(cVar3, byteArrayOutputStream.toByteArray());
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
                    long u10 = bVar2.f.u();
                    long u11 = bVar2.e.u();
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
                        l lVar = hVar3.c;
                        byte[] bArr3 = bArr2;
                        i5.c cVar4 = lVar.a;
                        byte[] bArr4 = lVar.b;
                        long j11 = j10;
                        if (cVar4.equals(new i5.c("proto"))) {
                            r3Var = new r3();
                            r3Var.d = bArr4;
                        } else if (cVar4.equals(new i5.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            r3 r3Var2 = new r3();
                            r3Var2.e = str4;
                            r3Var = r3Var2;
                        } else {
                            String c10 = i6.c("CctTransportBackend");
                            if (Log.isLoggable(c10, 5)) {
                                Log.w(c10, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j10 = j11;
                        }
                        r3Var.a = Long.valueOf(hVar3.d);
                        r3Var.c = Long.valueOf(hVar3.e);
                        String str5 = (String) hVar3.f.get("tz-offset");
                        r3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        r3Var.h = new k5.n((u) u.a.get(hVar3.b("net-type")), (t) t.a.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.b;
                        if (num2 != null) {
                            r3Var.b = num2;
                        }
                        String str6 = ((Long) r3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) r3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) r3Var.f) == null) {
                            str6 = r6.t(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new k(((Long) r3Var.a).longValue(), (Integer) r3Var.b, ((Long) r3Var.c).longValue(), (byte[]) r3Var.d, (String) r3Var.e, ((Long) r3Var.f).longValue(), (k5.n) r3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        j10 = j11;
                    }
                    arrayList3.add(new k5.l(u10, u11, jVar, num, str2, arrayList4));
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
                    aa.a aVar5 = new aa.a(url, iVar3, str, 21);
                    y1 y1Var = new y1(bVar2, 20);
                    int i16 = 5;
                    do {
                        h = y1Var.h(aVar5);
                        URL url2 = (URL) h.c;
                        if (url2 != null) {
                            i6.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            aVar5 = new aa.a(url2, (k5.i) aVar5.d, (String) aVar5.b, 21);
                        } else {
                            aVar5 = null;
                        }
                        if (aVar5 == null) {
                            break;
                        } else {
                            i16--;
                        }
                    } while (i16 >= 1);
                    int i17 = h.a;
                    if (i17 == 200) {
                        aVar2 = new m5.a(1, h.b);
                    } else {
                        if (i17 >= 500 || i17 == 404) {
                            aVar = new m5.a(2, -1L);
                        } else if (i17 == 400) {
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
                    }
                } catch (IOException e7) {
                    e = e7;
                }
            }
            i11 = 2;
            i12 = aVar2.a;
            if (i12 != i11) {
                gVar.f(new a8(this, iterable, iVar, j3, 4));
                ((e3) this.d).U(iVar, i10 + 1, true);
                return;
            }
            bVar = this;
            iVar2 = iVar;
            j10 = j3;
            gVar.f(new fz0(23, bVar, iterable));
            if (i12 == 1) {
                j10 = Math.max(j10, aVar2.b);
                if (bArr != null) {
                    gVar.f(new org.telegram.tgnet.j(bVar, 21));
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
                gVar.f(new fz0(24, bVar, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
