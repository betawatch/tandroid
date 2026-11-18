package m8;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.j;
import hi.u5;
import q6.m;
import v7.i;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class f {
    public final v7.a a;

    public f(v7.a aVar) {
        m.h(aVar);
        this.a = aVar;
    }

    public final void a(u5 u5Var) {
        v7.a aVar = this.a;
        try {
            a7.a aVar2 = (a7.a) u5Var.b;
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
