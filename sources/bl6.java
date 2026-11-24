// default package

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bl6 {
    public final k7d a;

    public bl6(k7d k7dVar) {
        ite.h(k7dVar);
        this.a = k7dVar;
    }

    public final void a(nl9 nl9Var) {
        k7d k7dVar = this.a;
        try {
            xk5 xk5Var = (xk5) nl9Var.b;
            sjf sjfVar = (sjf) k7dVar;
            Parcel R = sjfVar.R();
            tid.c(R, xk5Var);
            sjfVar.V(R, 18);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bl6)) {
            return false;
        }
        try {
            k7d k7dVar = this.a;
            k7d k7dVar2 = ((bl6) obj).a;
            sjf sjfVar = (sjf) k7dVar;
            Parcel R = sjfVar.R();
            tid.c(R, k7dVar2);
            Parcel Q = sjfVar.Q(R, 16);
            boolean z = Q.readInt() != 0;
            Q.recycle();
            return z;
        } catch (RemoteException e) {
            i2d.h(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            sjf sjfVar = (sjf) this.a;
            Parcel Q = sjfVar.Q(sjfVar.R(), 17);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            i2d.h(e);
            return 0;
        }
    }
}
