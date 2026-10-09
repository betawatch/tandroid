package h8;

import a9.w;
import ae.x;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import n6.l;
import v7.h8;
import v7.u7;
import v7.u8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
            w wVar = (w) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", wVar.a);
            bundle.putLong("event_timestamp", wVar.b);
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
                    i8.e a2 = h8.a(context);
                    try {
                        i8.a V0 = a2.V0();
                        l.h(V0);
                        u7.a = V0;
                        s7.e X0 = a2.X0();
                        if (u8.a == null) {
                            l.i(X0, "delegate must not be null");
                            u8.a = X0;
                        }
                        a = true;
                        try {
                            Parcel M0 = a2.M0(a2.N0(), 9);
                            int readInt = M0.readInt();
                            M0.recycle();
                            if (readInt == 2) {
                                b = 2;
                            }
                            x6.b bVar = new x6.b(context);
                            Parcel N0 = a2.N0();
                            s7.b.c(N0, bVar);
                            N0.writeInt(0);
                            a2.R0(N0, 10);
                        } catch (RemoteException e7) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e7);
                        }
                        int i10 = b;
                        Log.d("e", "loadedRenderer: ".concat(i10 != 1 ? i10 != 2 ? "null" : "LATEST" : "LEGACY"));
                        return 0;
                    } catch (RemoteException e10) {
                        throw new x(e10);
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
