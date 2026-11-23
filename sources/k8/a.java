package k8;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.j;
import c8.e1;
import c8.k1;
import c8.s9;
import l8.d;
import n6.f;
import q6.m;
import v7.e;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class a {
    public static boolean a = false;
    public static int b = 1;

    public static synchronized int a(Context context) {
        synchronized (a.class) {
            try {
                m.i(context, "Context is null");
                Log.d("a", "preferredRenderer: ".concat("null"));
                if (a) {
                    return 0;
                }
                try {
                    d a10 = k1.a(context);
                    try {
                        l8.a x12 = a10.x1();
                        m.h(x12);
                        e1.a = x12;
                        e z12 = a10.z1();
                        if (s9.a == null) {
                            m.i(z12, "delegate must not be null");
                            s9.a = z12;
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
                            Log.e("a", "Failed to retrieve renderer type or log initialization.", e10);
                        }
                        int i7 = b;
                        Log.d("a", "loadedRenderer: ".concat(i7 != 1 ? i7 != 2 ? "null" : "LATEST" : "LEGACY"));
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
