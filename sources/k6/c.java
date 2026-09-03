package k6;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
