// default package

import android.util.Log;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class caf {
    public static o3f a;

    public static synchronized q8f a(y7f y7fVar) {
        q8f q8fVar;
        synchronized (caf.class) {
            o3f o3fVar = a;
            if (o3fVar == null) {
                o3fVar = new o3f((byte) 2);
                a = o3fVar;
            }
            q8fVar = (q8f) o3fVar.c(y7fVar);
        }
        return q8fVar;
    }

    public static void b(String str) {
        if (Log.isLoggable("FirebaseAppIndex", 3) ? true : Log.isLoggable("FirebaseAppIndex", 3)) {
            Log.d("FirebaseAppIndex", str);
        }
    }

    public static synchronized q8f c() {
        q8f a2;
        synchronized (caf.class) {
            a2 = a(new y7f());
        }
        return a2;
    }
}
