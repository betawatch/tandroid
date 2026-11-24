// default package

import android.content.Context;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
