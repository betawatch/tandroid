// default package

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kx6 implements Parcelable {
    public static final Parcelable.Creator<kx6> CREATOR = new hx6(2);
    public final MediaSession.Token b;
    public kk5 c;
    public final Object a = new Object();
    public bcc d = null;

    public kx6(MediaSession.Token token, ax6 ax6Var) {
        this.b = token;
        this.c = ax6Var;
    }

    public final kk5 a() {
        kk5 kk5Var;
        synchronized (this.a) {
            kk5Var = this.c;
        }
        return kk5Var;
    }

    public final void b(kk5 kk5Var) {
        synchronized (this.a) {
            this.c = kk5Var;
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
        if (obj instanceof kx6) {
            return this.b.equals(((kx6) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
