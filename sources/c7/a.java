package c7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r6.e;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {
    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        e eVar = (e) this;
        if (i10 == 1) {
            eVar.init(l6.b.J0(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 2) {
            String readString = parcel.readString();
            int i12 = b.a;
            boolean booleanFlagValue = eVar.getBooleanFlagValue(readString, parcel.readInt() != 0, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        if (i10 == 3) {
            int intFlagValue = eVar.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
            return true;
        }
        if (i10 == 4) {
            long longFlagValue = eVar.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        String stringFlagValue = eVar.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeString(stringFlagValue);
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
