package h8;

import a9.v;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import n6.l;
import v7.j8;
import v7.s8;
import v7.w7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class e {
    public static boolean a = false;
    public static int b = 1;

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", vVar.a);
            bundle.putLong("event_timestamp", vVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static synchronized int b(Context context) {
        synchronized (e.class) {
            try {
                l.i(context, "Context is null");
                Log.d("e", "preferredRenderer: ".concat("null"));
                if (a) {
                    return 0;
                }
                try {
                    i8.e a2 = j8.a(context);
                    try {
                        i8.a W0 = a2.W0();
                        l.h(W0);
                        w7.a = W0;
                        s7.e Y0 = a2.Y0();
                        if (s8.a == null) {
                            l.i(Y0, "delegate must not be null");
                            s8.a = Y0;
                        }
                        a = true;
                        try {
                            Parcel N0 = a2.N0(a2.O0(), 9);
                            int readInt = N0.readInt();
                            N0.recycle();
                            if (readInt == 2) {
                                b = 2;
                            }
                            x6.b bVar = new x6.b(context);
                            Parcel O0 = a2.O0();
                            s7.b.c(O0, bVar);
                            O0.writeInt(0);
                            a2.S0(O0, 10);
                        } catch (RemoteException e7) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e7);
                        }
                        int i10 = b;
                        Log.d("e", "loadedRenderer: ".concat(i10 != 1 ? i10 != 2 ? "null" : "LATEST" : "LEGACY"));
                        return 0;
                    } catch (RemoteException e10) {
                        throw new androidx.car.app.j(e10);
                    }
                } catch (k6.f e11) {
                    return e11.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
