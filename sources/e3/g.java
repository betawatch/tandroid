package e3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import f3.h;
import j$.util.Objects;
import j7.j0;
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
import k9.b0;
import k9.k0;
import m.r3;
import m1.j;
import o4.h0;
import org.json.JSONObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.web.e0;
import s5.m;
import x2.k;
import x2.t;
import x2.u;
import x2.w;
import y2.i;
import y2.l;
import y2.n;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        StringBuilder l10 = e2.c.l(str);
        l10.append(jSONObject.toString());
        String sb = l10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb, null);
        }
    }

    public b0 a() {
        String str = ((Integer) this.a) == null ? " pid" : "";
        if (((String) this.b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.c) == null) {
            str = w.c.e(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = w.c.e(str, " importance");
        }
        if (((Long) this.e) == null) {
            str = w.c.e(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = w.c.e(str, " rss");
        }
        if (((Long) this.g) == null) {
            str = w.c.e(str, " timestamp");
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
            str = w.c.e(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = w.c.e(str, " ram");
        }
        if (((Long) this.e) == null) {
            str = w.c.e(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = w.c.e(str, " simulator");
        }
        if (((Integer) this.g) == null) {
            str = w.c.e(str, " state");
        }
        if (((String) this.h) == null) {
            str = w.c.e(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = w.c.e(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new k0(((Integer) this.a).intValue(), (String) this.b, ((Integer) this.c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f).booleanValue(), ((Integer) this.g).intValue(), (String) this.h, (String) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public p9.a c(int i10) {
        p9.a aVar = null;
        try {
            if (!j.b(2, i10)) {
                JSONObject O = ((f1) this.e).O();
                if (O != null) {
                    p9.a i11 = ((e0) this.c).i(O);
                    f("Loaded cached settings: ", O);
                    ((db.a) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j.b(3, i10) || i11.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return i11;
                        } catch (Exception e6) {
                            e = e6;
                            aVar = i11;
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

    public p9.a d() {
        return (p9.a) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03ea A[SYNTHETIC] */
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
        h0 b10;
        String str2;
        Integer num;
        r3 r3Var;
        int i12;
        final g gVar = this;
        final i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        g3.c cVar = (g3.c) gVar.f;
        z2.f a2 = ((z2.e) gVar.b).a(iVar2.a);
        long j11 = 0;
        while (true) {
            final int i13 = 0;
            h hVar = (h) cVar;
            if (!((Boolean) hVar.f(new g3.b(gVar) { // from class: e3.e
                public final /* synthetic */ g b;

                {
                    this.b = gVar;
                }

                @Override // g3.b
                public final Object g() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            i iVar3 = iVar2;
                            h hVar2 = (h) ((f3.d) this.b.c);
                            SQLiteDatabase a10 = hVar2.a();
                            a10.beginTransaction();
                            try {
                                Long b11 = h.b(a10, iVar3);
                                if (b11 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b11.toString()});
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
                            return (Iterable) hVar3.c(new c1.b(8, hVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                hVar.f(new f(gVar, iVar2, j11, 0));
                return;
            }
            final int i14 = 1;
            Iterable iterable = (Iterable) hVar.f(new g3.b(gVar) { // from class: e3.e
                public final /* synthetic */ g b;

                {
                    this.b = gVar;
                }

                @Override // g3.b
                public final Object g() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            i iVar3 = iVar2;
                            h hVar2 = (h) ((f3.d) this.b.c);
                            SQLiteDatabase a10 = hVar2.a();
                            a10.beginTransaction();
                            try {
                                Long b11 = h.b(a10, iVar3);
                                if (b11 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b11.toString()});
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
                            return (Iterable) hVar3.c(new c1.b(8, hVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                j0.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
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
                    f3.c cVar2 = (f3.c) gVar.i;
                    Objects.requireNonNull(cVar2);
                    b3.a aVar3 = (b3.a) hVar.f(new a1.c(cVar2, 13));
                    a9.a aVar4 = new a9.a();
                    aVar4.f = new HashMap();
                    aVar4.d = Long.valueOf(((h3.a) gVar.g).W());
                    aVar4.e = Long.valueOf(((h3.a) gVar.h).W());
                    aVar4.b = "GDT_CLIENT_METRICS";
                    v2.c cVar3 = new v2.c("proto");
                    aVar3.getClass();
                    m mVar = n.a;
                    mVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        mVar.g(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    aVar4.c = new l(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((w2.b) a2).a(aVar4.j()));
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
                    long W = bVar.f.W();
                    long W2 = bVar.e.W();
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
                        v2.c cVar4 = lVar.a;
                        byte[] bArr4 = lVar.b;
                        long j12 = j11;
                        if (cVar4.equals(new v2.c("proto"))) {
                            r3Var = new r3();
                            r3Var.d = bArr4;
                        } else if (cVar4.equals(new v2.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            r3 r3Var2 = new r3();
                            r3Var2.e = str4;
                            r3Var = r3Var2;
                        } else {
                            String c3 = j0.c("CctTransportBackend");
                            if (Log.isLoggable(c3, 5)) {
                                Log.w(c3, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j11 = j12;
                        }
                        r3Var.a = Long.valueOf(hVar4.d);
                        r3Var.c = Long.valueOf(hVar4.e);
                        String str5 = (String) hVar4.f.get("tz-offset");
                        r3Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        r3Var.h = new x2.n((u) u.a.get(hVar4.b("net-type")), (t) t.a.get(hVar4.b("mobile-subtype")));
                        Integer num2 = hVar4.b;
                        if (num2 != null) {
                            r3Var.b = num2;
                        }
                        String str6 = ((Long) r3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) r3Var.c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) r3Var.f) == null) {
                            str6 = w.c.e(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new k(((Long) r3Var.a).longValue(), (Integer) r3Var.b, ((Long) r3Var.c).longValue(), (byte[]) r3Var.d, (String) r3Var.e, ((Long) r3Var.f).longValue(), (x2.n) r3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        j11 = j12;
                    }
                    arrayList3.add(new x2.l(W, W2, jVar, num, str2, arrayList4));
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
                    m mVar2 = new m(url, iVar3, str, 6);
                    sf.g gVar2 = new sf.g(bVar, 10);
                    int i16 = 5;
                    do {
                        b10 = gVar2.b(mVar2);
                        URL url2 = (URL) b10.c;
                        if (url2 != null) {
                            j0.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            mVar2 = new m(url2, (x2.i) mVar2.c, (String) mVar2.d, 6);
                        } else {
                            mVar2 = null;
                        }
                        if (mVar2 == null) {
                            break;
                        } else {
                            i16--;
                        }
                    } while (i16 >= 1);
                    int i17 = b10.a;
                    if (i17 == 200) {
                        aVar2 = new z2.a(1, b10.b);
                    } else {
                        if (i17 >= 500 || i17 == 404) {
                            aVar = new z2.a(2, -1L);
                        } else if (i17 == 400) {
                            try {
                                aVar = new z2.a(4, -1L);
                            } catch (IOException e6) {
                                e = e6;
                                j0.b("CctTransportBackend", "Could not make request to the backend", e);
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
                } catch (IOException e10) {
                    e = e10;
                }
            }
            i11 = 2;
            i12 = aVar2.a;
            if (i12 != i11) {
                hVar.f(new d9.c(this, iterable, iVar, j10, 2));
                ((androidx.biometric.e) this.d).A(iVar, i10 + 1, true);
                return;
            }
            gVar = this;
            iVar2 = iVar;
            j11 = j10;
            hVar.f(new c1.b(5, gVar, iterable));
            if (i12 == 1) {
                j11 = Math.max(j11, aVar2.b);
                if (bArr != null) {
                    hVar.f(new a1.c(gVar, 15));
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
                hVar.f(new c1.b(6, gVar, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
