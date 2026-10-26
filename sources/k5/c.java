package k5;

import a8.of;
import aa.m0;
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
import l5.f;
import l5.g;
import l5.h;
import l5.i;
import l5.j;
import l5.k;
import l5.l;
import l5.n;
import l5.o;
import l5.q;
import l5.r;
import l5.s;
import l5.t;
import l5.u;
import l5.v;
import li.h5;
import ma.d;
import n5.e;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c implements e {
    public final h5 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final v5.a e;
    public final v5.a f;
    public final int g;

    public c(Context context, v5.a aVar, v5.a aVar2) {
        d dVar = new d();
        l5.c cVar = l5.c.a;
        dVar.d(o.class, cVar);
        dVar.d(i.class, cVar);
        f fVar = f.a;
        dVar.d(s.class, fVar);
        dVar.d(l.class, fVar);
        l5.d dVar2 = l5.d.a;
        dVar.d(q.class, dVar2);
        dVar.d(j.class, dVar2);
        l5.b bVar = l5.b.a;
        dVar.d(l5.a.class, bVar);
        dVar.d(h.class, bVar);
        l5.e eVar = l5.e.a;
        dVar.d(r.class, eVar);
        dVar.d(k.class, eVar);
        g gVar = g.a;
        dVar.d(v.class, gVar);
        dVar.d(n.class, gVar);
        dVar.d = true;
        this.a = new h5(dVar);
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
            throw new IllegalArgumentException(b10.j("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (((l5.t) l5.t.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m5.h a(m5.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        m0 c10 = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c10.f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i10));
        c10.b("model", Build.MODEL);
        c10.b("hardware", Build.HARDWARE);
        c10.b("device", Build.DEVICE);
        c10.b("product", Build.PRODUCT);
        c10.b("os-uild", Build.ID);
        c10.b("manufacturer", Build.MANUFACTURER);
        c10.b("fingerprint", Build.FINGERPRINT);
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
            c10.b("country", Locale.getDefault().getCountry());
            c10.b("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            c10.b("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                of.b("CctTransportBackend", "Unable to find version code for package", e);
            }
            c10.b("application_build", Integer.toString(i11));
            return c10.h();
        }
        SparseArray sparseArray3 = t.a;
        subtype = 0;
        hashMap = (HashMap) c10.f;
        if (hashMap != null) {
        }
    }
}
