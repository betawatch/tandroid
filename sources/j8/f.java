package j8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import ii.n4;
import n6.l;
import s7.i;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class f {
    public final s7.a a;

    public f(s7.a aVar) {
        l.h(aVar);
        this.a = aVar;
    }

    public final void a(n4 n4Var) {
        s7.a aVar = this.a;
        try {
            x6.a aVar2 = (x6.a) n4Var.b;
            i iVar = (i) aVar;
            Parcel O0 = iVar.O0();
            s7.b.c(O0, aVar2);
            iVar.S0(O0, 18);
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
            i iVar = (i) aVar;
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
            i iVar = (i) this.a;
            Parcel N0 = iVar.N0(iVar.O0(), 17);
            int readInt = N0.readInt();
            N0.recycle();
            return readInt;
        } catch (RemoteException e7) {
            throw new j(e7);
        }
    }
}
