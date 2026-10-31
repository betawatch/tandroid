package h8;

import a9.w;
import ad.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import i8.e;
import java.util.ArrayList;
import k6.f;
import n6.l;
import v7.n8;
import v7.t7;
import v7.z7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class a {
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
        synchronized (a.class) {
            try {
                l.h(context, "Context is null");
                Log.d("a", "preferredRenderer: ".concat("null"));
                if (a) {
                    return 0;
                }
                try {
                    e a2 = z7.a(context);
                    try {
                        i8.a X0 = a2.X0();
                        l.g(X0);
                        t7.a = X0;
                        s7.e Z0 = a2.Z0();
                        if (n8.a == null) {
                            l.h(Z0, "delegate must not be null");
                            n8.a = Z0;
                        }
                        a = true;
                        try {
                            Parcel O0 = a2.O0(a2.P0(), 9);
                            int readInt = O0.readInt();
                            O0.recycle();
                            if (readInt == 2) {
                                b = 2;
                            }
                            x6.b bVar = new x6.b(context);
                            Parcel P0 = a2.P0();
                            s7.b.c(P0, bVar);
                            P0.writeInt(0);
                            a2.T0(P0, 10);
                        } catch (RemoteException e) {
                            Log.e("a", "Failed to retrieve renderer type or log initialization.", e);
                        }
                        int i10 = b;
                        Log.d("a", "loadedRenderer: ".concat(i10 != 1 ? i10 != 2 ? "null" : "LATEST" : "LEGACY"));
                        return 0;
                    } catch (RemoteException e7) {
                        throw new d(e7);
                    }
                } catch (f e10) {
                    return e10.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
