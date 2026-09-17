package j8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import n6.l;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        } catch (RemoteException e7) {
            throw new j(e7);
        }
    }

    public final int hashCode() {
        try {
            s7.f fVar = (s7.f) this.a;
            Parcel N0 = fVar.N0(fVar.O0(), 18);
            int readInt = N0.readInt();
            N0.recycle();
            return readInt;
        } catch (RemoteException e7) {
            throw new j(e7);
        }
    }
}
