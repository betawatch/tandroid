package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new hv6(3);
    public final Parcelable b;
    public mi5 c;
    public final Object a = new Object();
    public aac d = null;

    public MediaSessionCompat$Token(Parcelable parcelable, d dVar) {
        this.b = parcelable;
        this.c = dVar;
    }

    public final mi5 a() {
        mi5 mi5Var;
        synchronized (this.a) {
            mi5Var = this.c;
        }
        return mi5Var;
    }

    public final void b(mi5 mi5Var) {
        synchronized (this.a) {
            this.c = mi5Var;
        }
    }

    public final void c(aac aacVar) {
        synchronized (this.a) {
            this.d = aacVar;
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
