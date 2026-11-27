// default package

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class di4 {
    public final Context a;

    public final PackageInfo a(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }
}
