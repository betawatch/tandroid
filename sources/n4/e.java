package n4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e extends Binder implements b {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    @Override // n4.b
    public final void h(int i10) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // n4.b
    public final void onRepeatModeChanged(int i10) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            t(parcel.readInt() != 0 ? y.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i10 == 9) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            onRepeatModeChanged(parcel.readInt());
            return true;
        }
        if (i10 == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.a;
        switch (i10) {
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                if (weakReference.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                h(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (weakReference.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // n4.b
    public final void t(y yVar) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
