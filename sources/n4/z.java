package n4;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
