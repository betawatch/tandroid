package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new hx6(3);
    public final Parcelable b;
    public lk5 c;
    public final Object a = new Object();
    public bcc d = null;

    public MediaSessionCompat$Token(Parcelable parcelable, d dVar) {
        this.b = parcelable;
        this.c = dVar;
    }

    public final lk5 a() {
        lk5 lk5Var;
        synchronized (this.a) {
            lk5Var = this.c;
        }
        return lk5Var;
    }

    public final void b(lk5 lk5Var) {
        synchronized (this.a) {
            this.c = lk5Var;
        }
    }

    public final void c(bcc bccVar) {
        synchronized (this.a) {
            this.d = bccVar;
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
