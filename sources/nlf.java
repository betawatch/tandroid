// default package

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class nlf {
    public static final he6 a = new he6("MediaSessionUtils", null);

    public static ArrayList a(uxd uxdVar) {
        try {
            Parcel T = uxdVar.T(uxdVar.R(), 3);
            ArrayList createTypedArrayList = T.createTypedArrayList(vm7.CREATOR);
            T.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", uxd.class.getSimpleName()};
            he6 he6Var = a;
            Log.e(he6Var.a, he6Var.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(uxd uxdVar) {
        try {
            Parcel T = uxdVar.T(uxdVar.R(), 4);
            int[] createIntArray = T.createIntArray();
            T.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", uxd.class.getSimpleName()};
            he6 he6Var = a;
            Log.e(he6Var.a, he6Var.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
