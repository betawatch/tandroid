// default package

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ba0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ta0 ta0Var, int i) {
        byte[] bArr;
        long j;
        x70 x70Var;
        String str;
        x70 x70Var2;
        int i2;
        sd1 d;
        String str2;
        Integer num;
        ba0 ba0Var;
        String str3;
        final ba0 ba0Var2 = this;
        final ta0 ta0Var2 = ta0Var;
        byte[] bArr2 = ta0Var2.b;
        ds9 ds9Var = (ds9) ba0Var2.f;
        d5c a = ((vf7) ba0Var2.b).a(ta0Var2.a);
        long j2 = 0;
        while (true) {
            final byte b = 0;
            if (!((Boolean) ds9Var.f(new sgb(ba0Var2) { // from class: pac
                public final /* synthetic */ ba0 b;

                {
                    this.b = ba0Var2;
                }

                @Override // sgb
                public final Object g() {
                    Boolean bool;
                    byte b2 = b;
                    ta0 ta0Var3 = ta0Var2;
                    ba0 ba0Var3 = this.b;
                    switch (b2) {
                        case 0:
                            ds9 ds9Var2 = (ds9) ba0Var3.c;
                            SQLiteDatabase a2 = ds9Var2.a();
                            a2.beginTransaction();
                            try {
                                Long b3 = ds9.b(a2, ta0Var3);
                                if (b3 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = ds9Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a2.endTransaction();
                            }
                        default:
                            ds9 ds9Var3 = (ds9) ba0Var3.c;
                            ds9Var3.getClass();
                            return (Iterable) ds9Var3.c(new m88(ds9Var3, ta0Var3, (byte) 29));
                    }
                }
            })).booleanValue()) {
                ds9Var.f(new ps0((Object) ba0Var2, (Object) ta0Var2, j2, (byte) 11));
                return;
            }
            final byte b2 = 1;
            Iterable iterable = (Iterable) ds9Var.f(new sgb(ba0Var2) { // from class: pac
                public final /* synthetic */ ba0 b;

                {
                    this.b = ba0Var2;
                }

                @Override // sgb
                public final Object g() {
                    Boolean bool;
                    byte b22 = b2;
                    ta0 ta0Var3 = ta0Var2;
                    ba0 ba0Var3 = this.b;
                    switch (b22) {
                        case 0:
                            ds9 ds9Var2 = (ds9) ba0Var3.c;
                            SQLiteDatabase a2 = ds9Var2.a();
                            a2.beginTransaction();
                            try {
                                Long b3 = ds9.b(a2, ta0Var3);
                                if (b3 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = ds9Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a2.endTransaction();
                            }
                        default:
                            ds9 ds9Var3 = (ds9) ba0Var3.c;
                            ds9Var3.getClass();
                            return (Iterable) ds9Var3.c(new m88(ds9Var3, ta0Var3, (byte) 29));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a == null) {
                pse.a(ta0Var2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                x70Var2 = new x70(3, -1L);
                bArr = bArr2;
                j = j2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ga0) it.next()).c);
                }
                if (bArr2 != null) {
                    ds9 ds9Var2 = (ds9) ba0Var2.i;
                    Objects.requireNonNull(ds9Var2);
                    ij2 ij2Var = (ij2) ds9Var.f(new oac(ds9Var2, b));
                    q90 q90Var = new q90();
                    q90Var.h = new HashMap();
                    q90Var.f = Long.valueOf(((pj2) ba0Var2.g).e());
                    q90Var.g = Long.valueOf(((pj2) ba0Var2.h).e());
                    q90Var.a = "GDT_CLIENT_METRICS";
                    n34 n34Var = new n34("proto");
                    ij2Var.getClass();
                    rw8 rw8Var = kw8.a;
                    rw8Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        rw8Var.b(ij2Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    q90Var.e = new j34(n34Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((td1) a).a(q90Var.b()));
                }
                td1 td1Var = (td1) a;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    r90 r90Var = (r90) obj;
                    String str4 = r90Var.a;
                    if (hashMap.containsKey(str4)) {
                        ((List) hashMap.get(str4)).add(r90Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(r90Var);
                        hashMap.put(str4, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    r90 r90Var2 = (r90) ((List) entry.getValue()).get(0);
                    py8 py8Var = py8.a;
                    long e = td1Var.f.e();
                    long e2 = td1Var.e.e();
                    z70 z70Var = new z70(new w70(Integer.valueOf(r90Var2.b("sdk-version")), r90Var2.a("model"), r90Var2.a("hardware"), r90Var2.a("device"), r90Var2.a("product"), r90Var2.a("os-uild"), r90Var2.a("manufacturer"), r90Var2.a("fingerprint"), r90Var2.a("locale"), r90Var2.a("country"), r90Var2.a("mcc_mnc"), r90Var2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (r90 r90Var3 : (List) entry.getValue()) {
                        j34 j34Var = r90Var3.c;
                        byte[] bArr3 = bArr2;
                        byte[] bArr4 = r90Var3.j;
                        n34 n34Var2 = j34Var.a;
                        byte[] bArr5 = j34Var.b;
                        long j3 = j2;
                        if (n34Var2.equals(new n34("proto"))) {
                            ba0Var = new ba0();
                            ba0Var.f = bArr5;
                        } else if (n34Var2.equals(new n34("json"))) {
                            String str5 = new String(bArr5, Charset.forName("UTF-8"));
                            ba0 ba0Var3 = new ba0();
                            ba0Var3.g = str5;
                            ba0Var = ba0Var3;
                        } else {
                            String c = pse.c("CctTransportBackend");
                            if (Log.isLoggable(c, 5)) {
                                Log.w(c, "Received event of unsupported encoding " + n34Var2 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                        ba0Var.a = Long.valueOf(r90Var3.d);
                        ba0Var.b = Long.valueOf(r90Var3.e);
                        String str6 = (String) r90Var3.f.get("tz-offset");
                        ba0Var.c = Long.valueOf(str6 == null ? 0L : Long.valueOf(str6).longValue());
                        ba0Var.h = new fa0((fl7) fl7.a.get(r90Var3.b("net-type")), (el7) el7.a.get(r90Var3.b("mobile-subtype")));
                        Integer num2 = r90Var3.b;
                        if (num2 != null) {
                            ba0Var.d = num2;
                        }
                        Integer num3 = r90Var3.g;
                        if (num3 != null) {
                            v90 v90Var = new v90(new u90(num3));
                            aq2 aq2Var = aq2.a;
                            ba0Var.e = new a80(v90Var);
                        }
                        byte[] bArr6 = r90Var3.i;
                        if (bArr6 == null) {
                            if (bArr4 != null) {
                                bArr6 = null;
                            }
                            str3 = ((Long) ba0Var.a) != null ? " eventTimeMs" : "";
                            if (((Long) ba0Var.b) == null) {
                                str3 = str3.concat(" eventUptimeMs");
                            }
                            if (((Long) ba0Var.c) == null) {
                                str3 = str3.concat(" timezoneOffsetSeconds");
                            }
                            if (str3.isEmpty()) {
                                grb.i("Missing required properties:".concat(str3));
                                return;
                            } else {
                                arrayList4.add(new ca0(((Long) ba0Var.a).longValue(), (Integer) ba0Var.d, (a80) ba0Var.e, ((Long) ba0Var.b).longValue(), (byte[]) ba0Var.f, (String) ba0Var.g, ((Long) ba0Var.c).longValue(), (fa0) ba0Var.h, (t90) ba0Var.i));
                                bArr2 = bArr3;
                                j2 = j3;
                            }
                        }
                        ba0Var.i = new t90(bArr6, bArr4 != null ? bArr4 : null);
                        if (((Long) ba0Var.a) != null) {
                        }
                        if (((Long) ba0Var.b) == null) {
                        }
                        if (((Long) ba0Var.c) == null) {
                        }
                        if (str3.isEmpty()) {
                        }
                    }
                    arrayList3.add(new da0(e, e2, z70Var, num, str2, arrayList4));
                }
                bArr = bArr2;
                j = j2;
                y70 y70Var = new y70(arrayList3);
                URL url = td1Var.d;
                if (bArr != null) {
                    try {
                        q51 a2 = q51.a(bArr);
                        String str7 = a2.b;
                        if (str7 == null) {
                            str7 = null;
                        }
                        String str8 = a2.a;
                        if (str8 != null) {
                            url = td1.b(str8);
                        }
                        str = str7;
                    } catch (IllegalArgumentException unused3) {
                        x70Var = new x70(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    rx6 rx6Var = new rx6(url, y70Var, str, false, (byte) 16);
                    rd1 rd1Var = new rd1((Object) td1Var, (byte) 0);
                    rx6 rx6Var2 = rx6Var;
                    int i4 = 5;
                    do {
                        d = rd1Var.d(rx6Var2);
                        URL url2 = (URL) d.c;
                        if (url2 != null) {
                            pse.a(url2, "CctTransportBackend", "Following redirect to: %s");
                            rx6Var2 = new rx6(url2, (y70) rx6Var2.c, (String) rx6Var2.d, false, (byte) 16);
                        } else {
                            rx6Var2 = null;
                        }
                        if (rx6Var2 == null) {
                            break;
                        } else {
                            i4--;
                        }
                    } while (i4 >= 1);
                    int i5 = d.a;
                    if (i5 == 200) {
                        x70Var2 = new x70(1, d.b);
                    } else {
                        x70Var = (i5 >= 500 || i5 == 404) ? new x70(2, -1L) : i5 == 400 ? new x70(4, -1L) : new x70(3, -1L);
                        x70Var2 = x70Var;
                    }
                } catch (IOException e3) {
                    pse.b("CctTransportBackend", "Could not make request to the backend", e3);
                    i2 = 2;
                    x70Var2 = new x70(2, -1L);
                }
            }
            i2 = 2;
            int i6 = x70Var2.a;
            if (i6 == i2) {
                ds9Var.f(new jn1((Object) this, (Object) iterable, (Object) ta0Var, j, (byte) 9));
                ((pm3) this.d).E(ta0Var, i + 1, true);
                return;
            }
            ba0Var2 = this;
            ta0Var2 = ta0Var;
            j2 = j;
            ds9Var.f(new yw9(ba0Var2, iterable, (byte) 20));
            if (i6 == 1) {
                j2 = Math.max(j2, x70Var2.b);
                if (bArr != null) {
                    ds9Var.f(new ftb(ba0Var2, (byte) 5));
                }
            } else if (i6 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str9 = ((ga0) it2.next()).c.a;
                    if (hashMap2.containsKey(str9)) {
                        hashMap2.put(str9, Integer.valueOf(((Integer) hashMap2.get(str9)).intValue() + 1));
                    } else {
                        hashMap2.put(str9, 1);
                    }
                }
                ds9Var.f(new yw9(ba0Var2, hashMap2, (byte) 21));
            }
            bArr2 = bArr;
        }
    }
}
