package d2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends Binder {
    public final g9.i0 a;

    public h(List list) {
        this.a = g9.i0.q(list);
    }

    public static g9.i0 a(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof h) {
            return ((h) iBinder).a;
        }
        g9.f0 p10 = g9.i0.p();
        int i3 = 0;
        int i10 = 1;
        while (i10 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i3);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            p10.c(readBundle);
                            i3++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i10 = readInt;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                obtain2.recycle();
                obtain.recycle();
                throw th2;
            }
        }
        return p10.f();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i10);
        }
        if (parcel2 == null) {
            return false;
        }
        g9.i0 i0Var = this.a;
        int size = i0Var.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < m.a) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) i0Var.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }
}
