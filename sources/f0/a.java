package f0;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
