package n4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i extends Binder implements f {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public i() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    @Override // n4.f
    public final void h(int i10) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // n4.f
    public final void onRepeatModeChanged(int i10) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i10) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                }
                t0(readString);
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                throw new AssertionError();
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                t(parcel.readInt() != 0 ? h0.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    m.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.createTypedArrayList(v.CREATOR);
                throw new AssertionError();
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    e0.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onRepeatModeChanged(parcel.readInt());
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                if (this.a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                h(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (this.a.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // n4.f
    public final void t(h0 h0Var) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // n4.f
    public final void t0(String str) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
