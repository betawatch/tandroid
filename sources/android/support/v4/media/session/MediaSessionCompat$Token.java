package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new mx6(3);
    public final Parcelable b;
    public ok5 c;
    public final Object a = new Object();
    public aec d = null;

    public MediaSessionCompat$Token(Parcelable parcelable, d dVar) {
        this.b = parcelable;
        this.c = dVar;
    }

    public final ok5 a() {
        ok5 ok5Var;
        synchronized (this.a) {
            ok5Var = this.c;
        }
        return ok5Var;
    }

    public final void b(ok5 ok5Var) {
        synchronized (this.a) {
            this.c = ok5Var;
        }
    }

    public final void c(aec aecVar) {
        synchronized (this.a) {
            this.d = aecVar;
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
        Parcelable parcelable = ((MediaSessionCompat$Token) obj).b;
        Parcelable parcelable2 = this.b;
        if (parcelable2 == null) {
            return parcelable == null;
        }
        if (parcelable == null) {
            return false;
        }
        return parcelable2.equals(parcelable);
    }

    public final int hashCode() {
        Parcelable parcelable = this.b;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
