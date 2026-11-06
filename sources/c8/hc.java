package c8;

import android.util.Log;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class hc {
    public static void a(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            if (Log.isLoggable("Vision", 3)) {
                Log.e("Vision", String.format(str, objArr), exc);
                return;
            }
            String format = String.format(str, objArr);
            String valueOf = String.valueOf(exc);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + format.length() + 2);
            sb2.append(format);
            sb2.append(": ");
            sb2.append(valueOf);
            Log.e("Vision", sb2.toString());
        }
    }
}
