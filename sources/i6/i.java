package i6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h6.p;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class i {
    public static final j6.b a = new j6.b("MediaSessionUtils", null);

    public static ArrayList a(p pVar) {
        try {
            Parcel r12 = pVar.r1(pVar.p1(), 3);
            ArrayList createTypedArrayList = r12.createTypedArrayList(h6.d.CREATOR);
            r12.recycle();
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
            Parcel r12 = pVar.r1(pVar.p1(), 4);
            int[] createIntArray = r12.createIntArray();
            r12.recycle();
            return createIntArray;
        } catch (RemoteException e10) {
            Object[] objArr = {"getCompactViewActionIndices", p.class.getSimpleName()};
            j6.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }
}
