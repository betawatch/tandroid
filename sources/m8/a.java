package m8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import q6.m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a {
    public final v7.h a;

    public a(v7.h hVar) {
        m.g(hVar);
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            v7.h hVar = this.a;
            v7.h hVar2 = ((a) obj).a;
            v7.f fVar = (v7.f) hVar;
            Parcel P0 = fVar.P0();
            v7.b.c(P0, hVar2);
            Parcel O0 = fVar.O0(P0, 17);
            boolean z9 = O0.readInt() != 0;
            O0.recycle();
            return z9;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public final int hashCode() {
        try {
            v7.f fVar = (v7.f) this.a;
            Parcel O0 = fVar.O0(fVar.P0(), 18);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }
}
