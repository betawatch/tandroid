package n4;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
