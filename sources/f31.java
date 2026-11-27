// default package

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class f31 extends Binder {
    public final po5 a;

    public f31(List list) {
        this.a = po5.q(list);
    }

    public static po5 a(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof f31) {
            return ((f31) iBinder).a;
        }
        mo5 p = po5.p();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            p.c(readBundle);
                            i++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i2 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return p.f();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        po5 po5Var = this.a;
        int size = po5Var.size();
        int readInt = parcel.readInt();
        while (true) {
            if (readInt < size) {
                if (parcel2.dataSize() >= o51.a) {
                    i3 = 2;
                    break;
                }
                parcel2.writeInt(1);
                parcel2.writeBundle((Bundle) po5Var.get(readInt));
                readInt++;
            } else {
                break;
            }
        }
        parcel2.writeInt(i3);
        return true;
    }
}
