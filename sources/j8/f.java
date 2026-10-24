package j8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import n6.l;
import s7.i;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class f {
    public final s7.a a;

    public f(s7.a aVar) {
        l.h(aVar);
        this.a = aVar;
    }

    public final void a(z2.b bVar) {
        s7.a aVar = this.a;
        try {
            x6.a aVar2 = (x6.a) bVar.a;
            i iVar = (i) aVar;
            Parcel N0 = iVar.N0();
            s7.b.c(N0, aVar2);
            iVar.R0(N0, 18);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            s7.a aVar = this.a;
            s7.a aVar2 = ((f) obj).a;
            i iVar = (i) aVar;
            Parcel N0 = iVar.N0();
            s7.b.c(N0, aVar2);
            Parcel M0 = iVar.M0(N0, 16);
            boolean z10 = M0.readInt() != 0;
            M0.recycle();
            return z10;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.a;
            Parcel M0 = iVar.M0(iVar.N0(), 17);
            int readInt = M0.readInt();
            M0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
