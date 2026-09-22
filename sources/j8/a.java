package j8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import n6.l;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            Parcel O0 = fVar.O0();
            s7.b.c(O0, hVar2);
            Parcel N0 = fVar.N0(O0, 17);
            boolean z10 = N0.readInt() != 0;
            N0.recycle();
            return z10;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final int hashCode() {
        try {
            s7.f fVar = (s7.f) this.a;
            Parcel N0 = fVar.N0(fVar.O0(), 18);
            int readInt = N0.readInt();
            N0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
