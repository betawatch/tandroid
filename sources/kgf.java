// default package

import android.content.Context;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kgf {
    public static WeakReference b;
    public final ua4 a;

    public kgf(Context context) {
        this.a = new ua4(context, gvd.a, wo.g, new fgf((byte) 19));
    }

    public static synchronized kgf a(LaunchActivity launchActivity) {
        kgf kgfVar;
        synchronized (kgf.class) {
            WeakReference weakReference = b;
            kgfVar = weakReference == null ? null : (kgf) weakReference.get();
            if (kgfVar == null) {
                kgfVar = new kgf(launchActivity.getApplicationContext());
                b = new WeakReference(kgfVar);
            }
        }
        return kgfVar;
    }
}
