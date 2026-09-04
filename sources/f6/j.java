package f6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import e6.q;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class j {
    public static final g6.b a = new g6.b("MediaSessionUtils", null);

    public static ArrayList a(q qVar) {
        try {
            Parcel Q0 = qVar.Q0(qVar.O0(), 3);
            ArrayList createTypedArrayList = Q0.createTypedArrayList(e6.d.CREATOR);
            Q0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e7) {
            Object[] objArr = {"getNotificationActions", q.class.getSimpleName()};
            g6.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e7);
            return null;
        }
    }

    public static int[] b(q qVar) {
        try {
            Parcel Q0 = qVar.Q0(qVar.O0(), 4);
            int[] createIntArray = Q0.createIntArray();
            Q0.recycle();
            return createIntArray;
        } catch (RemoteException e7) {
            Object[] objArr = {"getCompactViewActionIndices", q.class.getSimpleName()};
            g6.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e7);
            return null;
        }
    }
}
