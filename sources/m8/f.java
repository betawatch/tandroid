package m8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import q6.m;
import v7.i;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class f {
    public final v7.a a;

    public f(v7.a aVar) {
        m.g(aVar);
        this.a = aVar;
    }

    public final void a(k8.a aVar) {
        v7.a aVar2 = this.a;
        try {
            a7.a aVar3 = aVar.a;
            i iVar = (i) aVar2;
            Parcel P0 = iVar.P0();
            v7.b.c(P0, aVar3);
            iVar.T0(P0, 18);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            v7.a aVar = this.a;
            v7.a aVar2 = ((f) obj).a;
            i iVar = (i) aVar;
            Parcel P0 = iVar.P0();
            v7.b.c(P0, aVar2);
            Parcel O0 = iVar.O0(P0, 16);
            boolean z9 = O0.readInt() != 0;
            O0.recycle();
            return z9;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.a;
            Parcel O0 = iVar.O0(iVar.P0(), 17);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }
}
