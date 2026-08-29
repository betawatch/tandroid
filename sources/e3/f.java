package e3;

import a9.s;
import ag.o1;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import bg.c2;
import f3.h;
import h7.j5;
import i9.b0;
import i9.k0;
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
import l4.y0;
import m.s3;
import m1.j;
import org.json.JSONObject;
import sf.f1;
import x2.k;
import x2.t;
import x2.u;
import x2.w;
import y2.i;
import y2.l;
import y2.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f {
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
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str);
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
            str = u3.c.k(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = u3.c.k(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = u3.c.k(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = u3.c.k(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = u3.c.k(str, " timestamp");
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
            str = u3.c.k(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = u3.c.k(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = u3.c.k(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = u3.c.k(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = u3.c.k(str, " state");
        }
        if (((String) this.h) == null) {
            str = u3.c.k(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = u3.c.k(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.a).intValue(), (String) this.b, ((Integer) this.c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f).booleanValue(), ((Integer) this.g).intValue(), (String) this.h, (String) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public n9.a c(int i10) {
        n9.a aVar = null;
        try {
            if (!j.a(2, i10)) {
                JSONObject G = ((za.c) this.e).G();
                if (G != null) {
                    n9.a j10 = ((o1) this.c).j(G);
                    f("Loaded cached settings: ", G);
                    ((ya.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.a(3, i10) || j10.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return j10;
                        } catch (Exception e10) {
                            e = e10;
                            aVar = j10;
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

    public n9.a d() {
        return (n9.a) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(i iVar, int i10) {
        byte[] bArr;
        long j10;
        z2.a aVar;
        String str;
        z2.a aVar2;
        int i11;
        y0 c3;
        String str2;
        Integer num;
        s3 s3Var;
        int i12;
        final f fVar = this;
        final i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        g3.c cVar = (g3.c) fVar.f;
        z2.e a2 = ((z2.d) fVar.b).a(iVar2.a);
        long j11 = 0;
        while (true) {
            final int i13 = 0;
            h hVar = (h) cVar;
            if (!((Boolean) hVar.f(new g3.b(fVar) { // from class: e3.e
                public final /* synthetic */ f b;

                {
                    this.b = fVar;
                }

                @Override // g3.b
                public final Object f() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            i iVar3 = iVar2;
                            h hVar2 = (h) ((f3.d) this.b.c);
                            SQLiteDatabase a10 = hVar2.a();
                            a10.beginTransaction();
                            try {
                                Long b10 = h.b(a10, iVar3);
                                if (b10 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b10.toString()});
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
                            h hVar3 = (h) ((f3.d) this.b.c);
                            hVar3.getClass();
                            return (Iterable) hVar3.c(new s(16, hVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                hVar.f(new d9.a(fVar, iVar2, j11, 1));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) hVar.f(new g3.b(fVar) { // from class: e3.e
                public final /* synthetic */ f b;

                {
                    this.b = fVar;
                }

                @Override // g3.b
                public final Object f() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            i iVar3 = iVar2;
                            h hVar2 = (h) ((f3.d) this.b.c);
                            SQLiteDatabase a10 = hVar2.a();
                            a10.beginTransaction();
                            try {
                                Long b10 = h.b(a10, iVar3);
                                if (b10 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b10.toString()});
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
                            h hVar3 = (h) ((f3.d) this.b.c);
                            hVar3.getClass();
                            return (Iterable) hVar3.c(new s(16, hVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                j5.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new z2.a(3, -1L);
                bArr = bArr2;
                j10 = j11;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f3.b) it.next()).c);
                }
                if (bArr2 != null) {
                    f3.c cVar2 = (f3.c) fVar.i;
                    Objects.requireNonNull(cVar2);
                    b3.a aVar3 = (b3.a) hVar.f(new a1.c(cVar2, 23));
                    c2 c2Var = new c2();
                    c2Var.f = new HashMap();
                    c2Var.d = Long.valueOf(((h3.a) fVar.g).e());
                    c2Var.e = Long.valueOf(((h3.a) fVar.h).e());
                    c2Var.a = "GDT_CLIENT_METRICS";
                    v2.c cVar3 = new v2.c("proto");
                    aVar3.getClass();
                    v5.c cVar4 = n.a;
                    cVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        cVar4.e(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c2Var.c = new l(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((w2.b) a2).a(c2Var.i()));
                }
                w2.b bVar = (w2.b) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    y2.h hVar2 = (y2.h) obj;
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
                    y2.h hVar3 = (y2.h) ((List) entry.getValue()).get(0);
                    w wVar = w.a;
                    long e10 = bVar.f.e();
                    long e11 = bVar.e.e();
                    x2.j jVar = new x2.j(new x2.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (y2.h hVar4 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        l lVar = hVar4.c;
                        byte[] bArr3 = bArr2;
                        v2.c cVar5 = lVar.a;
                        byte[] bArr4 = lVar.b;
                        long j12 = j11;
                        if (cVar5.equals(new v2.c("proto"))) {
                            s3Var = new s3();
                            s3Var.d = bArr4;
                        } else if (cVar5.equals(new v2.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            s3 s3Var2 = new s3();
                            s3Var2.e = str4;
                            s3Var = s3Var2;
                        } else {
                            String c6 = j5.c("CctTransportBackend");
                            if (Log.isLoggable(c6, 5)) {
                                Log.w(c6, "Received event of unsupported encoding " + cVar5 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j11 = j12;
                        }
                        s3Var.a = Long.valueOf(hVar4.d);
                        s3Var.c = Long.valueOf(hVar4.e);
                        String str5 = (String) hVar4.f.get("tz-offset");
                        s3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        s3Var.h = new x2.n((u) u.a.get(hVar4.b("net-type")), (t) t.a.get(hVar4.b("mobile-subtype")));
                        Integer num2 = hVar4.b;
                        if (num2 != null) {
                            s3Var.b = num2;
                        }
                        String str6 = ((Long) s3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) s3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) s3Var.f) == null) {
                            str6 = u3.c.k(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new k(((Long) s3Var.a).longValue(), (Integer) s3Var.b, ((Long) s3Var.c).longValue(), (byte[]) s3Var.d, (String) s3Var.e, ((Long) s3Var.f).longValue(), (x2.n) s3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        j11 = j12;
                    }
                    arrayList3.add(new x2.l(e10, e11, jVar, num, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j10 = j11;
                x2.i iVar3 = new x2.i(arrayList3);
                URL url = bVar.d;
                if (bArr != null) {
                    try {
                        w2.a a10 = w2.a.a(bArr);
                        str = a10.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a10.a;
                        if (str7 != null) {
                            url = w2.b.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new z2.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    v5.c cVar6 = new v5.c(url, iVar3, str);
                    f1 f1Var = new f1(bVar, 14);
                    int i16 = 5;
                    do {
                        c3 = f1Var.c(cVar6);
                        URL url2 = (URL) c3.c;
                        if (url2 != null) {
                            j5.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            cVar6 = new v5.c(url2, (x2.i) cVar6.d, (String) cVar6.c);
                        } else {
                            cVar6 = null;
                        }
                        if (cVar6 == null) {
                            break;
                        } else {
                            i16--;
                        }
                    } while (i16 >= 1);
                    int i17 = c3.b;
                    if (i17 == 200) {
                        aVar2 = new z2.a(1, c3.a);
                    } else {
                        if (i17 >= 500 || i17 == 404) {
                            aVar = new z2.a(2, -1L);
                        } else if (i17 == 400) {
                            try {
                                aVar = new z2.a(4, -1L);
                            } catch (IOException e12) {
                                e = e12;
                                j5.b("CctTransportBackend", "Could not make request to the backend", e);
                                i11 = 2;
                                aVar2 = new z2.a(2, -1L);
                                i12 = aVar2.a;
                                if (i12 != i11) {
                                }
                            }
                        } else {
                            aVar = new z2.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            }
            i11 = 2;
            i12 = aVar2.a;
            if (i12 != i11) {
                hVar.f(new b9.d(this, iterable, iVar, j10, 2));
                ((androidx.biometric.e) this.d).A(iVar, i10 + 1, true);
                return;
            }
            fVar = this;
            iVar2 = iVar;
            j11 = j10;
            hVar.f(new s(9, fVar, iterable));
            if (i12 == 1) {
                j11 = Math.max(j11, aVar2.b);
                if (bArr != null) {
                    hVar.f(new a1.c(fVar, 25));
                }
            } else if (i12 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str8 = ((f3.b) it4.next()).c.a;
                    if (hashMap2.containsKey(str8)) {
                        hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                    } else {
                        hashMap2.put(str8, 1);
                    }
                }
                hVar.f(new s(10, fVar, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
