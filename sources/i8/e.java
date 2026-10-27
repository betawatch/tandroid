package i8;

import a8.dd;
import a8.od;
import a8.vc;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Date;
import o6.l;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class e {
    public static boolean a = false;
    public static int b = 1;

    public static long a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date b(long j10) {
        return new Date((j10 - 2082844800) * 1000);
    }

    public static synchronized int c(Context context) {
        synchronized (e.class) {
            try {
                l.i(context, "Context is null");
                Log.d("e", "preferredRenderer: ".concat(BuildConfig.BETA_URL));
                if (a) {
                    return 0;
                }
                try {
                    j8.e a2 = dd.a(context);
                    try {
                        j8.a V0 = a2.V0();
                        l.h(V0);
                        vc.a = V0;
                        t7.e X0 = a2.X0();
                        if (od.a == null) {
                            l.i(X0, "delegate must not be null");
                            od.a = X0;
                        }
                        a = true;
                        try {
                            Parcel M0 = a2.M0(a2.N0(), 9);
                            int readInt = M0.readInt();
                            M0.recycle();
                            if (readInt == 2) {
                                b = 2;
                            }
                            y6.b bVar = new y6.b(context);
                            Parcel N0 = a2.N0();
                            t7.b.c(N0, bVar);
                            N0.writeInt(0);
                            a2.R0(N0, 10);
                        } catch (RemoteException e) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e);
                        }
                        int i10 = b;
                        Log.d("e", "loadedRenderer: ".concat(i10 != 1 ? i10 != 2 ? BuildConfig.BETA_URL : "LATEST" : "LEGACY"));
                        return 0;
                    } catch (RemoteException e10) {
                        throw new androidx.car.app.j(e10);
                    }
                } catch (l6.f e11) {
                    return e11.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
