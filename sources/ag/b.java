package ag;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends Binder implements IInterface {
    public final Handler a;
    public final /* synthetic */ nb.a b;

    public b(nb.a aVar) {
        this.b = aVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        Handler handler = this.a;
        if (i3 == 2) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i3 == 3) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, 1));
            parcel2.writeNoException();
            return true;
        }
        if (i3 == 4) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i3 != 5) {
            if (i3 != 1598968902) {
                return super.onTransact(i3, parcel, parcel2, i10);
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        handler.post(new a(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, 3));
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
