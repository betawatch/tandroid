package la;

import android.os.Build;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final a b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.e(appId, "appId");
        kotlin.jvm.internal.j.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.j.e(osVersion, "osVersion");
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
        if (!kotlin.jvm.internal.j.a(this.a, bVar.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!kotlin.jvm.internal.j.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return kotlin.jvm.internal.j.a(str2, str2) && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((o.b.hashCode() + l.d.e((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 46672439) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + o.b + ", androidAppInfo=" + this.b + ')';
    }
}
