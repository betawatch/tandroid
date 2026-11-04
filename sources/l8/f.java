package l8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import gi.v5;
import p6.m;
import u7.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f {
    public final u7.a a;

    public f(u7.a aVar) {
        m.g(aVar);
        this.a = aVar;
    }

    public final void a(v5 v5Var) {
        u7.a aVar = this.a;
        try {
            z6.a aVar2 = (z6.a) v5Var.b;
            i iVar = (i) aVar;
            Parcel P0 = iVar.P0();
            u7.b.c(P0, aVar2);
            iVar.T0(P0, 18);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            u7.a aVar = this.a;
            u7.a aVar2 = ((f) obj).a;
            i iVar = (i) aVar;
            Parcel P0 = iVar.P0();
            u7.b.c(P0, aVar2);
            Parcel O0 = iVar.O0(P0, 16);
            boolean z10 = O0.readInt() != 0;
            O0.recycle();
            return z10;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.a;
            Parcel O0 = iVar.O0(iVar.P0(), 17);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }
}
