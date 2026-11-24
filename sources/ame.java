// default package

import android.util.Log;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ame {
    public static void a(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            if (Log.isLoggable("Vision", 3)) {
                Log.e("Vision", String.format(str, objArr), exc);
                return;
            }
            String format = String.format(str, objArr);
            String valueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(valueOf.length() + format.length() + 2);
            sb.append(format);
            sb.append(": ");
            sb.append(valueOf);
            Log.e("Vision", sb.toString());
        }
    }
}
