package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends Binder implements b {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
        attachInterface(this, b.h);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        String str = b.h;
        if (i9 >= 1 && i9 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i9 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i9 != 1) {
            return super.onTransact(i9, parcel, parcel2, i10);
        }
        this.a.a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
