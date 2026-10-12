package f6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import e6.p;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class i {
    public static final g6.b a = new g6.b("MediaSessionUtils", null);

    public static ArrayList a(p pVar) {
        try {
            Parcel P0 = pVar.P0(pVar.N0(), 3);
            ArrayList createTypedArrayList = P0.createTypedArrayList(e6.d.CREATOR);
            P0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", p.class.getSimpleName()};
            g6.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(p pVar) {
        try {
            Parcel P0 = pVar.P0(pVar.N0(), 4);
            int[] createIntArray = P0.createIntArray();
            P0.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", p.class.getSimpleName()};
            g6.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
