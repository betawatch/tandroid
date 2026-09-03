package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new b0(2);
    public final Object b;
    public d c;
    public final Object a = new Object();
    public l2.d d = null;

    public MediaSessionCompat$Token(Object obj, u uVar) {
        this.b = obj;
        this.c = uVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.a) {
            dVar = this.c;
        }
        return dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(d dVar) {
        synchronized (this.a) {
            this.c = dVar;
        }
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

    public final void f(l2.d dVar) {
        synchronized (this.a) {
            this.d = dVar;
        }
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable((Parcelable) this.b, i10);
    }
}
