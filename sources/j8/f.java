package j8;

import a6.i;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import n6.l;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            s7.i iVar = (s7.i) aVar;
            Parcel O0 = iVar.O0();
            s7.b.c(O0, aVar2);
            Parcel N0 = iVar.N0(O0, 16);
            boolean z10 = N0.readInt() != 0;
            N0.recycle();
            return z10;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final int hashCode() {
        try {
            s7.i iVar = (s7.i) this.a;
            Parcel N0 = iVar.N0(iVar.O0(), 17);
            int readInt = N0.readInt();
            N0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
