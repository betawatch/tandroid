package m6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF8("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("cross-platform");

    public static final Parcelable.Creator<c> CREATOR = new h5.h(16);
    public final String a;

    c(String str) {
        this.a = str;
    }

    public static c a(String str) {
        for (c cVar : values()) {
            if (str.equals(cVar.a)) {
                return cVar;
            }
        }
        throw new b(aa.d.o("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.a);
    }
}
