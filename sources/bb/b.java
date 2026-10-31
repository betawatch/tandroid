package bb;

import android.os.Build;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final a b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.i.e(osVersion, "osVersion");
        this.a = appId;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!kotlin.jvm.internal.i.a(this.a, bVar.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!kotlin.jvm.internal.i.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return kotlin.jvm.internal.i.a(str2, str2) && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((p.b.hashCode() + a1.g.f((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 46672439) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + p.b + ", androidAppInfo=" + this.b + ')';
    }
}
