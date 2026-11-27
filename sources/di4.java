// default package

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class di4 {
    public final Context a;

    public final PackageInfo a(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }
}
