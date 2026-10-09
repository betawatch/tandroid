package n4;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class y {
    public static final boolean c = c0.b;
    public Context a;
    public ContentResolver b;

    public final boolean a(b0 b0Var, String str) {
        Context context = this.a;
        int i10 = b0Var.b;
        return i10 < 0 ? context.getPackageManager().checkPermission(str, b0Var.a) == 0 : context.checkPermission(str, i10, b0Var.c) == 0;
    }
}
