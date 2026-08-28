package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements d {
    public IBinder a;

    @Override // android.support.v4.media.session.d
    public final void F() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.a.transact(18, obtain, obtain2, 0)) {
                int i9 = v.b;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat G() {
        throw null;
    }

    @Override // android.support.v4.media.session.d
    public final void J(b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder((g) bVar);
            if (!this.a.transact(4, obtain, obtain2, 0)) {
                int i9 = v.b;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.a.transact(28, obtain, obtain2, 0)) {
                int i9 = v.b;
            }
            obtain2.readException();
            PlaybackStateCompat createFromParcel = obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return createFromParcel;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.support.v4.media.session.d
    public final void k(b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder((g) bVar);
            if (!this.a.transact(3, obtain, obtain2, 0)) {
                int i9 = v.b;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.support.v4.media.session.d
    public final void m0() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.a.transact(13, obtain, obtain2, 0)) {
                int i9 = v.b;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.support.v4.media.session.d
    public final List o0() {
        throw null;
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent s() {
        throw null;
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.a.transact(19, obtain, obtain2, 0)) {
                int i9 = v.b;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
