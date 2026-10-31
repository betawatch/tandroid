package j8;

import android.os.Parcel;
import android.os.RemoteException;
import k6.h;
import n6.l;
import s7.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e {
    public final s7.a a;

    public e(s7.a aVar) {
        l.g(aVar);
        this.a = aVar;
    }

    public final void a(h hVar) {
        s7.a aVar = this.a;
        try {
            x6.a aVar2 = (x6.a) hVar.b;
            i iVar = (i) aVar;
            Parcel P0 = iVar.P0();
            s7.b.c(P0, aVar2);
            iVar.T0(P0, 18);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        try {
            s7.a aVar = this.a;
            s7.a aVar2 = ((e) obj).a;
            i iVar = (i) aVar;
            Parcel P0 = iVar.P0();
            s7.b.c(P0, aVar2);
            Parcel O0 = iVar.O0(P0, 16);
            boolean z10 = O0.readInt() != 0;
            O0.recycle();
            return z10;
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.a;
            Parcel O0 = iVar.O0(iVar.P0(), 17);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }
}
