package e2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g extends Binder {
    public final h9.i0 a;

    public g(List list) {
        this.a = h9.i0.q(list);
    }

    public static h9.i0 a(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof g) {
            return ((g) iBinder).a;
        }
        h9.f0 p10 = h9.i0.p();
        int i7 = 0;
        int i10 = 1;
        while (i10 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i7);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            p10.c(readBundle);
                            i7++;
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
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i10);
        }
        if (parcel2 == null) {
            return false;
        }
        h9.i0 i0Var = this.a;
        int size = i0Var.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < l.a) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) i0Var.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }
}
