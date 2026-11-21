package m8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import hi.t5;
import q6.m;
import v7.i;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class f {
    public final v7.a a;

    public f(v7.a aVar) {
        m.h(aVar);
        this.a = aVar;
    }

    public final void a(t5 t5Var) {
        v7.a aVar = this.a;
        try {
            a7.a aVar2 = (a7.a) t5Var.b;
            i iVar = (i) aVar;
            Parcel p12 = iVar.p1();
            v7.b.c(p12, aVar2);
            iVar.t1(p12, 18);
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
            Parcel p12 = iVar.p1();
            v7.b.c(p12, aVar2);
            Parcel o12 = iVar.o1(p12, 16);
            boolean z10 = o12.readInt() != 0;
            o12.recycle();
            return z10;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.a;
            Parcel o12 = iVar.o1(iVar.p1(), 17);
            int readInt = o12.readInt();
            o12.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }
}
