package d9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class p extends Binder implements IInterface {
    public p(String str) {
        attachInterface(this, str);
    }

    public abstract boolean a(int i7, Parcel parcel, Parcel parcel2, int i10);

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i10)) {
            return true;
        }
        return a(i7, parcel, parcel2, i10);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
