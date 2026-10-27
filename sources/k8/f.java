package k8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import jg.i;
import o6.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f {
    public final t7.a a;

    public f(t7.a aVar) {
        l.h(aVar);
        this.a = aVar;
    }

    public final void a(i iVar) {
        t7.a aVar = this.a;
        try {
            y6.a aVar2 = (y6.a) iVar.a;
            t7.i iVar2 = (t7.i) aVar;
            Parcel N0 = iVar2.N0();
            t7.b.c(N0, aVar2);
            iVar2.R0(N0, 18);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            t7.a aVar = this.a;
            t7.a aVar2 = ((f) obj).a;
            t7.i iVar = (t7.i) aVar;
            Parcel N0 = iVar.N0();
            t7.b.c(N0, aVar2);
            Parcel M0 = iVar.M0(N0, 16);
            boolean z10 = M0.readInt() != 0;
            M0.recycle();
            return z10;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final int hashCode() {
        try {
            t7.i iVar = (t7.i) this.a;
            Parcel M0 = iVar.M0(iVar.N0(), 17);
            int readInt = M0.readInt();
            M0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
