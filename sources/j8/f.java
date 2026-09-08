package j8;

import a6.i;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import n6.l;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f {
    public final s7.a a;

    public f(s7.a aVar) {
        l.h(aVar);
        this.a = aVar;
    }

    public final void a(i iVar) {
        s7.a aVar = this.a;
        try {
            x6.a aVar2 = (x6.a) iVar.b;
            s7.i iVar2 = (s7.i) aVar;
            Parcel O0 = iVar2.O0();
            s7.b.c(O0, aVar2);
            iVar2.S0(O0, 18);
        } catch (RemoteException e7) {
            throw new j(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            s7.a aVar = this.a;
            s7.a aVar2 = ((f) obj).a;
            s7.i iVar = (s7.i) aVar;
            Parcel O0 = iVar.O0();
            s7.b.c(O0, aVar2);
            Parcel N0 = iVar.N0(O0, 16);
            boolean z10 = N0.readInt() != 0;
            N0.recycle();
            return z10;
        } catch (RemoteException e7) {
            throw new j(e7);
        }
    }

    public final int hashCode() {
        try {
            s7.i iVar = (s7.i) this.a;
            Parcel N0 = iVar.N0(iVar.O0(), 17);
            int readInt = N0.readInt();
            N0.recycle();
            return readInt;
        } catch (RemoteException e7) {
            throw new j(e7);
        }
    }
}
