package k6;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public bb.b a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static bb.b a(Context context) {
        bb.b bVar;
        b bVar2 = b;
        synchronized (bVar2) {
            try {
                if (bVar2.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.a = new bb.b(context, 21);
                }
                bVar = bVar2.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
