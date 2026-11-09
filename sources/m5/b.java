package m5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import c8.cc;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import n5.a0;
import n5.b0;
import n5.c;
import n5.c0;
import n5.d0;
import n5.e0;
import n5.f;
import n5.f0;
import n5.g;
import n5.g0;
import n5.h;
import n5.h0;
import n5.i;
import n5.i0;
import n5.j;
import n5.k;
import n5.l;
import n5.m;
import n5.o;
import n5.p;
import n5.q;
import n5.r;
import n5.s;
import n5.t;
import n5.v;
import n5.w;
import n5.y;
import org.telegram.ui.Components.n;
import p5.e;
import pa.d;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b implements e {
    public final n a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final x5.a e;
    public final x5.a f;
    public final int g;

    public b(Context context, x5.a aVar, x5.a aVar2) {
        d dVar = new d();
        c cVar = c.a;
        dVar.b(w.class, cVar);
        dVar.b(m.class, cVar);
        j jVar = j.a;
        dVar.b(f0.class, jVar);
        dVar.b(t.class, jVar);
        n5.d dVar2 = n5.d.a;
        dVar.b(y.class, dVar2);
        dVar.b(n5.n.class, dVar2);
        n5.b bVar = n5.b.a;
        dVar.b(n5.a.class, bVar);
        dVar.b(l.class, bVar);
        i iVar = i.a;
        dVar.b(e0.class, iVar);
        dVar.b(s.class, iVar);
        n5.e eVar = n5.e.a;
        dVar.b(a0.class, eVar);
        dVar.b(o.class, eVar);
        h hVar = h.a;
        dVar.b(d0.class, hVar);
        dVar.b(r.class, hVar);
        g gVar = g.a;
        dVar.b(c0.class, gVar);
        dVar.b(q.class, gVar);
        k kVar = k.a;
        dVar.b(i0.class, kVar);
        dVar.b(v.class, kVar);
        f fVar = f.a;
        dVar.b(b0.class, fVar);
        dVar.b(p.class, fVar);
        dVar.d = true;
        this.a = new n(dVar);
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
            throw new IllegalArgumentException(rf.b.i("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (((n5.g0) n5.g0.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o5.h a(o5.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        h2.e0 c10 = hVar.c();
        int i7 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c10.f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i7));
        c10.a("model", Build.MODEL);
        c10.a("hardware", Build.HARDWARE);
        c10.a("device", Build.DEVICE);
        c10.a("product", Build.PRODUCT);
        c10.a("os-uild", Build.ID);
        c10.a("manufacturer", Build.MANUFACTURER);
        c10.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c10.f;
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
        HashMap hashMap4 = (HashMap) c10.f;
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
            hashMap = (HashMap) c10.f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c10.a("country", Locale.getDefault().getCountry());
            c10.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c10.a("mcc_mnc", simOperator);
            try {
                i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                cc.b("CctTransportBackend", "Unable to find version code for package", e10);
            }
            c10.a("application_build", Integer.toString(i10));
            return c10.b();
        }
        SparseArray sparseArray3 = g0.a;
        subtype = 0;
        hashMap = (HashMap) c10.f;
        if (hashMap != null) {
        }
    }
}
