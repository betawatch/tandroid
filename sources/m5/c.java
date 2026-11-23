package m5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import c8.hc;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import n5.a0;
import n5.b0;
import n5.c0;
import n5.d0;
import n5.e;
import n5.e0;
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
import n5.n;
import n5.o;
import n5.p;
import n5.q;
import n5.r;
import n5.s;
import n5.t;
import n5.v;
import n5.w;
import n5.y;
import org.telegram.ui.ActionBar.i5;
import p5.f;
import pa.d;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c implements f {
    public final i5 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final x5.a e;
    public final x5.a f;
    public final int g;

    public c(Context context, x5.a aVar, x5.a aVar2) {
        d dVar = new d();
        n5.c cVar = n5.c.a;
        dVar.c(w.class, cVar);
        dVar.c(m.class, cVar);
        j jVar = j.a;
        dVar.c(f0.class, jVar);
        dVar.c(t.class, jVar);
        n5.d dVar2 = n5.d.a;
        dVar.c(y.class, dVar2);
        dVar.c(n.class, dVar2);
        n5.b bVar = n5.b.a;
        dVar.c(n5.a.class, bVar);
        dVar.c(l.class, bVar);
        i iVar = i.a;
        dVar.c(e0.class, iVar);
        dVar.c(s.class, iVar);
        e eVar = e.a;
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
        n5.f fVar = n5.f.a;
        dVar.c(b0.class, fVar);
        dVar.c(p.class, fVar);
        dVar.d = true;
        this.a = new i5(dVar);
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
            throw new IllegalArgumentException(p5.c.k("Invalid url: ", str), e10);
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
                hc.b("CctTransportBackend", "Unable to find version code for package", e10);
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
