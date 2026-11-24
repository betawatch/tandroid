// default package

import android.content.Context;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jef {
    public static WeakReference b;
    public final u84 a;

    public jef(Context context) {
        this.a = new u84(context, dtd.a, vn.g, new eef((byte) 19));
    }

    public static synchronized jef a(LaunchActivity launchActivity) {
        jef jefVar;
        synchronized (jef.class) {
            WeakReference weakReference = b;
            jefVar = weakReference == null ? null : (jef) weakReference.get();
            if (jefVar == null) {
                jefVar = new jef(launchActivity.getApplicationContext());
                b = new WeakReference(jefVar);
            }
        }
        return jefVar;
    }
}
