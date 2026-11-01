package j8;

import android.os.Parcel;
import android.os.RemoteException;
import n6.l;
import s7.h;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a {
    public final h a;

    public a(h hVar) {
        l.g(hVar);
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            h hVar = this.a;
            h hVar2 = ((a) obj).a;
            s7.f fVar = (s7.f) hVar;
            Parcel P0 = fVar.P0();
            s7.b.c(P0, hVar2);
            Parcel O0 = fVar.O0(P0, 17);
            boolean z10 = O0.readInt() != 0;
            O0.recycle();
            return z10;
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final int hashCode() {
        try {
            s7.f fVar = (s7.f) this.a;
            Parcel O0 = fVar.O0(fVar.P0(), 18);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }
}
