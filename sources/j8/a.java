package j8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import n6.l;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a {
    public final s7.h a;

    public a(s7.h hVar) {
        l.h(hVar);
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            s7.h hVar = this.a;
            s7.h hVar2 = ((a) obj).a;
            s7.f fVar = (s7.f) hVar;
            Parcel N0 = fVar.N0();
            s7.b.c(N0, hVar2);
            Parcel M0 = fVar.M0(N0, 17);
            boolean z10 = M0.readInt() != 0;
            M0.recycle();
            return z10;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final int hashCode() {
        try {
            s7.f fVar = (s7.f) this.a;
            Parcel M0 = fVar.M0(fVar.N0(), 18);
            int readInt = M0.readInt();
            M0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
