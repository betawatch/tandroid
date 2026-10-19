package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public enum c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF8("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("cross-platform");

    public static final Parcelable.Creator<c> CREATOR = new w.a(16);
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
        throw new b(a1.g.p("Attachment ", str, " not supported"));
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
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
    }
}
