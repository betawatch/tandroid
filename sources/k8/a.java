package k8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import o6.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public final t7.h a;

    public a(t7.h hVar) {
        l.h(hVar);
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            t7.h hVar = this.a;
            t7.h hVar2 = ((a) obj).a;
            t7.f fVar = (t7.f) hVar;
            Parcel N0 = fVar.N0();
            t7.b.c(N0, hVar2);
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
            t7.f fVar = (t7.f) this.a;
            Parcel M0 = fVar.M0(fVar.N0(), 18);
            int readInt = M0.readInt();
            M0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
