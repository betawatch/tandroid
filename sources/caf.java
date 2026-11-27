// default package

import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
