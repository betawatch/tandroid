package n4;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class z {
    public static final boolean c = d0.b;
    public Context a;
    public ContentResolver b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.a;
        int i10 = c0Var.b;
        return i10 < 0 ? context.getPackageManager().checkPermission(str, c0Var.a) == 0 : context.checkPermission(str, i10, c0Var.c) == 0;
    }
}
