package i6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h6.p;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class i {
    public static final j6.b a = new j6.b("MediaSessionUtils", null);

    public static ArrayList a(p pVar) {
        try {
            Parcel R0 = pVar.R0(pVar.P0(), 3);
            ArrayList createTypedArrayList = R0.createTypedArrayList(h6.d.CREATOR);
            R0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e10) {
            Object[] objArr = {"getNotificationActions", p.class.getSimpleName()};
            j6.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }

    public static int[] b(p pVar) {
        try {
            Parcel R0 = pVar.R0(pVar.P0(), 4);
            int[] createIntArray = R0.createIntArray();
            R0.recycle();
            return createIntArray;
        } catch (RemoteException e10) {
            Object[] objArr = {"getCompactViewActionIndices", p.class.getSimpleName()};
            j6.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }
}
