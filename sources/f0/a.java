package f0;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
