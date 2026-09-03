package b9;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
import w8.h;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d {
    public static WeakReference b;
    public final a8.e a;

    public d(Context context) {
        this.a = new a8.e(context, d7.d.a, com.google.android.gms.common.api.b.i, new h(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        synchronized (d.class) {
            WeakReference weakReference = b;
            d dVar = weakReference == null ? null : (d) weakReference.get();
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d(launchActivity.getApplicationContext());
            b = new WeakReference(dVar2);
            return dVar2;
        }
    }

    public final void a(b bVar) {
        bVar.e.a = 2;
        this.a.e(1, new c(new b[]{bVar}));
    }
}
