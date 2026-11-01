package f6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import e6.o;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class j {
    public static final g6.b a = new g6.b("MediaSessionUtils", null);

    public static ArrayList a(o oVar) {
        try {
            Parcel R0 = oVar.R0(oVar.P0(), 3);
            ArrayList createTypedArrayList = R0.createTypedArrayList(e6.d.CREATOR);
            R0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", o.class.getSimpleName()};
            g6.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(o oVar) {
        try {
            Parcel R0 = oVar.R0(oVar.P0(), 4);
            int[] createIntArray = R0.createIntArray();
            R0.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", o.class.getSimpleName()};
            g6.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
