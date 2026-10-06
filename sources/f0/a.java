package f0;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
