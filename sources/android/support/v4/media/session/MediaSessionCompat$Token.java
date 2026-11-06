package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new z(2);
    public final Object b;
    public d c;
    public final Object a = new Object();
    public b5.d d = null;

    public MediaSessionCompat$Token(Object obj, t tVar) {
        this.b = obj;
        this.c = tVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.a) {
            dVar = this.c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.a) {
            this.c = dVar;
        }
    }

    public final void c(b5.d dVar) {
        synchronized (this.a) {
            this.d = dVar;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).b;
        Object obj3 = this.b;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable((Parcelable) this.b, i7);
    }
}
