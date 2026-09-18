package f0;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
