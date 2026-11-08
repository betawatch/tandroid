package m8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import q6.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
            Parcel p12 = fVar.p1();
            v7.b.c(p12, hVar2);
            Parcel o12 = fVar.o1(p12, 17);
            boolean z9 = o12.readInt() != 0;
            o12.recycle();
            return z9;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public final int hashCode() {
        try {
            v7.f fVar = (v7.f) this.a;
            Parcel o12 = fVar.o1(fVar.p1(), 18);
            int readInt = o12.readInt();
            o12.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }
}
