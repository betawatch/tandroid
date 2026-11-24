// default package

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kv6 implements Parcelable {
    public static final Parcelable.Creator<kv6> CREATOR = new hv6(2);
    public final MediaSession.Token b;
    public li5 c;
    public final Object a = new Object();
    public aac d = null;

    public kv6(MediaSession.Token token, av6 av6Var) {
        this.b = token;
        this.c = av6Var;
    }

    public final li5 a() {
        li5 li5Var;
        synchronized (this.a) {
            li5Var = this.c;
        }
        return li5Var;
    }

    public final void b(li5 li5Var) {
        synchronized (this.a) {
            this.c = li5Var;
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
        if (obj instanceof kv6) {
            return this.b.equals(((kv6) obj).b);
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
