package i8;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.i;
import n6.l;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r8 > 4611686018427387903L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(int i10, ae.c unit) {
        i.e(unit, "unit");
        if (unit.compareTo(ae.c.d) <= 0) {
            long a2 = l9.b.a(i10, unit, ae.c.b) << 1;
            int i11 = ae.a.d;
            int i12 = ae.b.a;
            return a2;
        }
        long j10 = i10;
        ae.c cVar = ae.c.b;
        long a10 = l9.b.a(4611686018426999999L, cVar, unit);
        if ((-a10) <= j10 && j10 <= a10) {
            long a11 = l9.b.a(j10, unit, cVar) << 1;
            int i13 = ae.a.d;
            int i14 = ae.b.a;
            return a11;
        }
        ae.c targetUnit = ae.c.c;
        i.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j10, unit.a);
        long j11 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j11;
        long j12 = (convert << 1) + 1;
        int i15 = ae.a.d;
        int i16 = ae.b.a;
        return j12;
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
