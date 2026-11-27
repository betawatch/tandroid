// default package

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dl6 {
    public final bad a;

    public dl6(bad badVar) {
        xve.h(badVar);
        this.a = badVar;
    }

    public final void a(zm9 zm9Var) {
        bad badVar = this.a;
        try {
            al5 al5Var = (al5) zm9Var.b;
            hmf hmfVar = (hmf) badVar;
            Parcel R = hmfVar.R();
            jld.c(R, al5Var);
            hmfVar.V(R, 18);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dl6)) {
            return false;
        }
        try {
            bad badVar = this.a;
            bad badVar2 = ((dl6) obj).a;
            hmf hmfVar = (hmf) badVar;
            Parcel R = hmfVar.R();
            jld.c(R, badVar2);
            Parcel Q = hmfVar.Q(R, 16);
            boolean z = Q.readInt() != 0;
            Q.recycle();
            return z;
        } catch (RemoteException e) {
            p3d.i(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            hmf hmfVar = (hmf) this.a;
            Parcel Q = hmfVar.Q(hmfVar.R(), 17);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            p3d.i(e);
            return 0;
        }
    }
}
