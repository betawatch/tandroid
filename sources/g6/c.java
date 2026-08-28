package g6;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public static final c b;
    public b a;

    static {
        c cVar = new c();
        cVar.a = null;
        b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = b;
        synchronized (cVar) {
            try {
                if (cVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.a = new b(context, 0);
                }
                bVar = cVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
