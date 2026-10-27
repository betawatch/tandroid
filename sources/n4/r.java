package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new h8.j(29);
    public final MediaSession.Token b;
    public d c;
    public final Object a = new Object();
    public z4.d d = null;

    public r(MediaSession.Token token, m mVar) {
        this.b = token;
        this.c = mVar;
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

    public final void c(z4.d dVar) {
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
        if (obj instanceof r) {
            return this.b.equals(((r) obj).b);
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
