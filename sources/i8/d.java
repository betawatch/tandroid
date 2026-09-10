package i8;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.p;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import m.r3;
import n6.l;
import n7.a1;
import qb.m;
import z7.ce;
import z7.fb;
import z7.gb;
import z7.hb;
import z7.wf;
import z7.yf;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class d {
    public static zzd a(ac.e eVar) {
        bc.b bVar = (bc.b) qb.g.c().a(bc.b.class);
        bc.f fVar = (bc.f) bVar.a.O0(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        wf b10 = yf.b();
        zzd zzdVar = new zzd(fVar, executor);
        r3 r3Var = new r3();
        r3Var.c = fb.b;
        a1 a1Var = new a1(29, (byte) 0);
        a1Var.c = eVar.a();
        a1Var.b = gb.b;
        r3Var.d = new ce(a1Var);
        m.a.execute(new p(b10, new a5.a(r3Var, 1), hb.N4, b10.c(), 8));
        return zzdVar;
    }

    public static Parcelable b(String str, Bundle bundle) {
        ClassLoader classLoader = d.class.getClassLoader();
        l.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void c(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable b10 = b("MapOptions", bundle);
        if (b10 != null) {
            d(bundle2, "MapOptions", b10);
        }
        Parcelable b11 = b("StreetViewPanoramaOptions", bundle);
        if (b11 != null) {
            d(bundle2, "StreetViewPanoramaOptions", b11);
        }
        Parcelable b12 = b("camera", bundle);
        if (b12 != null) {
            d(bundle2, "camera", b12);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void d(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = d.class.getClassLoader();
        l.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
