package n4;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
