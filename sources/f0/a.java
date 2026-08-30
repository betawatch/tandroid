package f0;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class a {
    public static int a(Context context, int i10) {
        return context.getColor(i10);
    }

    public static Object b(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    public static String c(Context context, Class cls) {
        return context.getSystemServiceName(cls);
    }
}
