package j5;

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
import k5.d;
import k5.g;
import k5.h;
import k5.i;
import k5.j;
import k5.k;
import k5.l;
import k5.n;
import k5.o;
import k5.q;
import k5.r;
import k5.s;
import k5.t;
import k5.u;
import k5.v;
import ka.c;
import ka.e;
import m5.f;
import org.telegram.messenger.MediaDataController;
import v7.j0;
import w7.h6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class b implements f {
    public final c a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final u5.a e;
    public final u5.a f;
    public final int g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        e eVar = new e();
        k5.c cVar = k5.c.a;
        eVar.m(o.class, cVar);
        eVar.m(i.class, cVar);
        k5.f fVar = k5.f.a;
        eVar.m(s.class, fVar);
        eVar.m(l.class, fVar);
        d dVar = d.a;
        eVar.m(q.class, dVar);
        eVar.m(j.class, dVar);
        k5.b bVar = k5.b.a;
        eVar.m(k5.a.class, bVar);
        eVar.m(h.class, bVar);
        k5.e eVar2 = k5.e.a;
        eVar.m(r.class, eVar2);
        eVar.m(k.class, eVar2);
        g gVar = g.a;
        eVar.m(v.class, gVar);
        eVar.m(n.class, gVar);
        eVar.d = true;
        this.a = new c(eVar, 0);
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
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(j0.g("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (((k5.t) k5.t.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l5.h a(l5.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        com.google.firebase.messaging.n c10 = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c10.f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i10));
        c10.c("model", Build.MODEL);
        c10.c("hardware", Build.HARDWARE);
        c10.c("device", Build.DEVICE);
        c10.c("product", Build.PRODUCT);
        c10.c("os-uild", Build.ID);
        c10.c("manufacturer", Build.MANUFACTURER);
        c10.c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / MediaDataController.MAX_STYLE_RUNS_COUNT;
        HashMap hashMap3 = (HashMap) c10.f;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.a;
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
                SparseArray sparseArray2 = t.a;
                subtype = 100;
            }
            hashMap = (HashMap) c10.f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c10.c("country", Locale.getDefault().getCountry());
            c10.c("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            c10.c("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                h6.b("CctTransportBackend", "Unable to find version code for package", e);
            }
            c10.c("application_build", Integer.toString(i11));
            return c10.g();
        }
        SparseArray sparseArray3 = t.a;
        subtype = 0;
        hashMap = (HashMap) c10.f;
        if (hashMap != null) {
        }
    }
}
