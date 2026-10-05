package a9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class s extends Binder implements IInterface {
    public s(String str) {
        attachInterface(this, str);
    }

    public abstract boolean a(int i10, Parcel parcel, Parcel parcel2, int i11);

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return a(i10, parcel, parcel2, i11);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
