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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                        l8.a X0 = a10.X0();
                        m.g(X0);
                        z0.a = X0;
                        e Z0 = a10.Z0();
                        if (q9.a == null) {
                            m.h(Z0, "delegate must not be null");
                            q9.a = Z0;
                        }
                        a = true;
                        try {
                            Parcel O0 = a10.O0(a10.P0(), 9);
                            int readInt = O0.readInt();
                            O0.recycle();
                            if (readInt == 2) {
                                b = 2;
                            }
                            a7.b bVar = new a7.b(context);
                            Parcel P0 = a10.P0();
                            v7.b.c(P0, bVar);
                            P0.writeInt(0);
                            a10.T0(P0, 10);
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
