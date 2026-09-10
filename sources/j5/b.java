package j5;

import a6.i;
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
import k5.c;
import k5.f;
import k5.g;
import k5.h;
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
import ka.d;
import m5.e;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.r6;
import w7.i6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b implements e {
    public final i a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final u5.a e;
    public final u5.a f;
    public final int g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        d dVar = new d();
        c cVar = c.a;
        dVar.m(o.class, cVar);
        dVar.m(k5.i.class, cVar);
        f fVar = f.a;
        dVar.m(s.class, fVar);
        dVar.m(l.class, fVar);
        k5.d dVar2 = k5.d.a;
        dVar.m(q.class, dVar2);
        dVar.m(j.class, dVar2);
        k5.b bVar = k5.b.a;
        dVar.m(k5.a.class, bVar);
        dVar.m(h.class, bVar);
        k5.e eVar = k5.e.a;
        dVar.m(r.class, eVar);
        dVar.m(k.class, eVar);
        g gVar = g.a;
        dVar.m(v.class, gVar);
        dVar.m(n.class, gVar);
        dVar.d = true;
        this.a = new i(dVar, 28);
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
            throw new IllegalArgumentException(r6.i("Invalid url: ", str), e);
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
                i6.b("CctTransportBackend", "Unable to find version code for package", e);
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
