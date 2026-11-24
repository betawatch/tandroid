// default package

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fh2 {
    public final iwe a;

    public fh2(iwe iweVar) {
        fre.h(iweVar);
        this.a = iweVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fh2)) {
            return false;
        }
        try {
            iwe iweVar = this.a;
            iwe iweVar2 = ((fh2) obj).a;
            ome omeVar = (ome) iweVar;
            Parcel R = omeVar.R();
            sgd.c(R, iweVar2);
            Parcel Q = omeVar.Q(R, 17);
            boolean z = Q.readInt() != 0;
            Q.recycle();
            return z;
        } catch (RemoteException e) {
            fvc.g(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            ome omeVar = (ome) this.a;
            Parcel Q = omeVar.Q(omeVar.R(), 18);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            fvc.g(e);
            return 0;
        }
    }
}
