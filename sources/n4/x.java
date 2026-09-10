package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(7);
    public final MediaSession.Token b;
    public h c;
    public final Object a = new Object();
    public y4.d d = null;

    public x(MediaSession.Token token, q qVar) {
        this.b = token;
        this.c = qVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.a) {
            hVar = this.c;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.a) {
            this.c = hVar;
        }
    }

    public final void c(y4.d dVar) {
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
        if (obj instanceof x) {
            return this.b.equals(((x) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.b, i10);
    }
}
