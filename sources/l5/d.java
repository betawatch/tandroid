package l5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import m5.a0;
import m5.b0;
import m5.c0;
import m5.d0;
import m5.e0;
import m5.f;
import m5.f0;
import m5.g;
import m5.g0;
import m5.h;
import m5.h0;
import m5.i;
import m5.i0;
import m5.j;
import m5.k;
import m5.l;
import m5.m;
import m5.n;
import m5.o;
import m5.p;
import m5.q;
import m5.r;
import m5.s;
import m5.t;
import m5.v;
import m5.w;
import m5.y;
import o5.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements e {
    public final hi.d a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final w5.a e;
    public final w5.a f;
    public final int g;

    public d(Context context, w5.a aVar, w5.a aVar2) {
        oa.d dVar = new oa.d();
        m5.c cVar = m5.c.a;
        dVar.c(w.class, cVar);
        dVar.c(m.class, cVar);
        j jVar = j.a;
        dVar.c(f0.class, jVar);
        dVar.c(t.class, jVar);
        m5.d dVar2 = m5.d.a;
        dVar.c(y.class, dVar2);
        dVar.c(n.class, dVar2);
        m5.b bVar = m5.b.a;
        dVar.c(m5.a.class, bVar);
        dVar.c(l.class, bVar);
        i iVar = i.a;
        dVar.c(e0.class, iVar);
        dVar.c(s.class, iVar);
        m5.e eVar = m5.e.a;
        dVar.c(a0.class, eVar);
        dVar.c(o.class, eVar);
        h hVar = h.a;
        dVar.c(d0.class, hVar);
        dVar.c(r.class, hVar);
        g gVar = g.a;
        dVar.c(c0.class, gVar);
        dVar.c(q.class, gVar);
        k kVar = k.a;
        dVar.c(i0.class, kVar);
        dVar.c(v.class, kVar);
        f fVar = f.a;
        dVar.c(b0.class, fVar);
        dVar.c(p.class, fVar);
        dVar.d = true;
        this.a = new hi.d(dVar, 19);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.c);
        this.e = aVar2;
        this.f = aVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(t4.c.f("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (((m5.g0) m5.g0.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n5.h a(n5.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        g2.f0 c2 = hVar.c();
        int i3 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c2.f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i3));
        c2.a("model", Build.MODEL);
        c2.a("hardware", Build.HARDWARE);
        c2.a("device", Build.DEVICE);
        c2.a("product", Build.PRODUCT);
        c2.a("os-uild", Build.ID);
        c2.a("manufacturer", Build.MANUFACTURER);
        c2.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c2.f;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i10 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = h0.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c2.f;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = g0.a;
                subtype = 100;
            }
            hashMap = (HashMap) c2.f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c2.a("country", Locale.getDefault().getCountry());
            c2.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c2.a("mcc_mnc", simOperator);
            try {
                i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                x7.m.b("CctTransportBackend", "Unable to find version code for package", e10);
            }
            c2.a("application_build", Integer.toString(i10));
            return c2.b();
        }
        SparseArray sparseArray3 = g0.a;
        subtype = 0;
        hashMap = (HashMap) c2.f;
        if (hashMap != null) {
        }
    }
}
