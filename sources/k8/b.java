package k8;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.j;
import c8.d1;
import c8.q9;
import c8.z0;
import l8.d;
import n6.f;
import q6.m;
import v7.e;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class b {
    public static boolean a = false;
    public static int b = 1;

    public static synchronized int a(Context context) {
        synchronized (b.class) {
            try {
                m.h(context, "Context is null");
                Log.d("b", "preferredRenderer: ".concat("null"));
                if (a) {
                    return 0;
                }
                try {
                    d a10 = d1.a(context);
                    try {
                        l8.a x12 = a10.x1();
                        m.g(x12);
                        z0.a = x12;
                        e z12 = a10.z1();
                        if (q9.a == null) {
                            m.h(z12, "delegate must not be null");
                            q9.a = z12;
                        }
                        a = true;
                        try {
                            Parcel o12 = a10.o1(a10.p1(), 9);
                            int readInt = o12.readInt();
                            o12.recycle();
                            if (readInt == 2) {
                                b = 2;
                            }
                            a7.b bVar = new a7.b(context);
                            Parcel p12 = a10.p1();
                            v7.b.c(p12, bVar);
                            p12.writeInt(0);
                            a10.t1(p12, 10);
                        } catch (RemoteException e10) {
                            Log.e("b", "Failed to retrieve renderer type or log initialization.", e10);
                        }
                        int i7 = b;
                        Log.d("b", "loadedRenderer: ".concat(i7 != 1 ? i7 != 2 ? "null" : "LATEST" : "LEGACY"));
                        return 0;
                    } catch (RemoteException e11) {
                        throw new j(e11);
                    }
                } catch (f e12) {
                    return e12.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
