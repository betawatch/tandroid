package ia;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import c8.dc;
import com.google.android.gms.internal.vision.e2;
import di.h;
import h2.e0;
import hi.l0;
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
import n5.g0;
import n5.h0;
import n5.j0;
import n5.l;
import n5.n;
import n5.p;
import n5.q;
import n5.r;
import n5.t;
import n5.v;
import n5.z;
import o5.i;
import o5.m;
import o5.o;
import org.json.JSONObject;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.ld0;
import p1.g;
import tg.z1;
import w7.s;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        StringBuilder m10 = e2.m(str);
        m10.append(jSONObject.toString());
        String sb2 = m10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b a(int i7) {
        b bVar = null;
        try {
            if (!g.b(2, i7)) {
                JSONObject U = ((l0) this.e).U();
                if (U != null) {
                    b S = ((d) this.c).S(U);
                    d("Loaded cached settings: ", U);
                    ((s) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (g.b(3, i7) || S.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return S;
                        } catch (Exception e10) {
                            e = e10;
                            bVar = S;
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x043c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(i iVar, int i7) {
        byte[] bArr;
        long j3;
        p5.a aVar;
        String str;
        p5.a aVar2;
        int i10;
        m5.b c10;
        String str2;
        Integer num;
        c cVar;
        int i11;
        final c cVar2 = this;
        final i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        w5.c cVar3 = (w5.c) cVar2.f;
        p5.e a10 = ((p5.d) cVar2.b).a(iVar2.a);
        long j10 = 0;
        while (true) {
            final int i12 = 0;
            v5.g gVar = (v5.g) cVar3;
            if (!((Boolean) gVar.f(new w5.b(cVar2) { // from class: u5.d
                public final /* synthetic */ ia.c b;

                {
                    this.b = cVar2;
                }

                @Override // w5.b
                public final Object g() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            i iVar3 = iVar2;
                            v5.g gVar2 = (v5.g) ((v5.d) this.b.c);
                            SQLiteDatabase a11 = gVar2.a();
                            a11.beginTransaction();
                            try {
                                Long b10 = v5.g.b(a11, iVar3);
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
                            v5.g gVar3 = (v5.g) ((v5.d) this.b.c);
                            gVar3.getClass();
                            return (Iterable) gVar3.c(new k8(22, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.f(new h(cVar2, iVar2, j10, 9));
                return;
            }
            final int i13 = 1;
            Iterable iterable = (Iterable) gVar.f(new w5.b(cVar2) { // from class: u5.d
                public final /* synthetic */ ia.c b;

                {
                    this.b = cVar2;
                }

                @Override // w5.b
                public final Object g() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            i iVar3 = iVar2;
                            v5.g gVar2 = (v5.g) ((v5.d) this.b.c);
                            SQLiteDatabase a11 = gVar2.a();
                            a11.beginTransaction();
                            try {
                                Long b10 = v5.g.b(a11, iVar3);
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
                            v5.g gVar3 = (v5.g) ((v5.d) this.b.c);
                            gVar3.getClass();
                            return (Iterable) gVar3.c(new k8(22, gVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i14 = 2;
            if (a10 == null) {
                dc.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new p5.a(3, -1L);
                bArr = bArr2;
                j3 = j10;
                i10 = 2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((v5.b) it.next()).c);
                }
                if (bArr2 != null) {
                    v5.c cVar4 = (v5.c) cVar2.i;
                    Objects.requireNonNull(cVar4);
                    r5.a aVar3 = (r5.a) gVar.f(new z1(cVar4, i14));
                    e0 e0Var = new e0();
                    e0Var.f = new HashMap();
                    e0Var.d = Long.valueOf(((x5.a) cVar2.g).s());
                    e0Var.e = Long.valueOf(((x5.a) cVar2.h).s());
                    e0Var.a = "GDT_CLIENT_METRICS";
                    l5.c cVar5 = new l5.c("proto");
                    aVar3.getClass();
                    ld0 ld0Var = o.a;
                    ld0Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ld0Var.q(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    e0Var.c = new m(cVar5, byteArrayOutputStream.toByteArray());
                    arrayList.add(((m5.c) a10).a(e0Var.b()));
                }
                m5.c cVar6 = (m5.c) a10;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    o5.h hVar = (o5.h) obj;
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
                    o5.h hVar2 = (o5.h) ((List) entry.getValue()).get(0);
                    j0 j0Var = j0.a;
                    long s5 = cVar6.f.s();
                    long s9 = cVar6.e.s();
                    n nVar = new n(new l(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a("model"), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a("manufacturer"), hVar2.a("fingerprint"), hVar2.a("locale"), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (o5.h hVar3 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        m mVar = hVar3.c;
                        byte[] bArr3 = bArr2;
                        byte[] bArr4 = hVar3.j;
                        l5.c cVar7 = mVar.a;
                        byte[] bArr5 = mVar.b;
                        long j11 = j10;
                        if (cVar7.equals(new l5.c("proto"))) {
                            cVar = new c();
                            cVar.e = bArr5;
                        } else if (cVar7.equals(new l5.c("json"))) {
                            String str4 = new String(bArr5, Charset.forName("UTF-8"));
                            c cVar8 = new c();
                            cVar8.f = str4;
                            cVar = cVar8;
                        } else {
                            String c11 = dc.c("CctTransportBackend");
                            if (Log.isLoggable(c11, 5)) {
                                Log.w(c11, "Received event of unsupported encoding " + cVar7 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            j10 = j11;
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
                            cVar.c = new n5.o(rVar);
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
                            str6 = r.b.v(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new n5.s(((Long) cVar.a).longValue(), (Integer) cVar.b, (n5.o) cVar.c, ((Long) cVar.d).longValue(), (byte[]) cVar.e, (String) cVar.f, ((Long) cVar.g).longValue(), (v) cVar.h, (p) cVar.i));
                        it2 = it3;
                        bArr2 = bArr3;
                        j10 = j11;
                    }
                    arrayList3.add(new t(s5, s9, nVar, num, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j3 = j10;
                n5.m mVar2 = new n5.m(arrayList3);
                URL url = cVar6.d;
                if (bArr != null) {
                    try {
                        m5.a a11 = m5.a.a(bArr);
                        String str7 = a11.b;
                        if (str7 == null) {
                            str7 = null;
                        }
                        String str8 = a11.a;
                        if (str8 != null) {
                            url = m5.c.b(str8);
                        }
                        str = str7;
                    } catch (IllegalArgumentException unused3) {
                        aVar = new p5.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    h6.m mVar3 = new h6.m(url, mVar2, str, false, 13);
                    ki.e eVar = new ki.e(cVar6, 15);
                    int i16 = 5;
                    h6.m mVar4 = mVar3;
                    do {
                        c10 = eVar.c(mVar4);
                        URL url2 = (URL) c10.c;
                        if (url2 != null) {
                            dc.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            mVar4 = new h6.m(url2, (n5.m) mVar4.c, (String) mVar4.d, false, 13);
                        } else {
                            mVar4 = null;
                        }
                        if (mVar4 == null) {
                            break;
                        } else {
                            i16--;
                        }
                    } while (i16 >= 1);
                    int i17 = c10.b;
                    if (i17 == 200) {
                        aVar2 = new p5.a(1, c10.a);
                        i10 = 2;
                    } else {
                        if (i17 >= 500 || i17 == 404) {
                            aVar = new p5.a(2, -1L);
                        } else if (i17 == 400) {
                            try {
                                aVar = new p5.a(4, -1L);
                            } catch (IOException e10) {
                                e = e10;
                                dc.b("CctTransportBackend", "Could not make request to the backend", e);
                                i10 = 2;
                                aVar2 = new p5.a(2, -1L);
                                i11 = aVar2.a;
                                if (i11 != i10) {
                                }
                            }
                        } else {
                            aVar = new p5.a(3, -1L);
                        }
                        aVar2 = aVar;
                        i10 = 2;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            }
            i11 = aVar2.a;
            if (i11 != i10) {
                gVar.f(new bg.e0(this, iterable, iVar, j3, 6));
                ((ld0) this.d).H(iVar, i7 + 1, true);
                return;
            }
            cVar2 = this;
            iVar2 = iVar;
            j10 = j3;
            gVar.f(new k8(17, cVar2, iterable));
            if (i11 == 1) {
                j10 = Math.max(j10, aVar2.b);
                if (bArr != null) {
                    gVar.f(new z1(cVar2, 4));
                }
            } else if (i11 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str9 = ((v5.b) it4.next()).c.a;
                    if (hashMap2.containsKey(str9)) {
                        hashMap2.put(str9, Integer.valueOf(((Integer) hashMap2.get(str9)).intValue() + 1));
                    } else {
                        hashMap2.put(str9, 1);
                    }
                }
                gVar.f(new k8(18, cVar2, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
