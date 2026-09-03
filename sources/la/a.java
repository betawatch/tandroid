package la;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final p d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.a = str;
        this.b = versionName;
        this.c = appBuildVersion;
        this.d = pVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.a) || !kotlin.jvm.internal.j.a(this.b, aVar.b) || !kotlin.jvm.internal.j.a(this.c, aVar.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return kotlin.jvm.internal.j.a(str, str) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + l.d.e(l.d.e(l.d.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
