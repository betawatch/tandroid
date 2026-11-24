// default package

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hz8 implements Parcelable {
    public static final Parcelable.Creator<hz8> CREATOR = new hv6((byte) 12);
    public final int a;
    public final float b;
    public Rating c;

    public hz8(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static hz8 c(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new hz8(6, f);
        }
        lad.c("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static hz8 d(float f, int i) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                lad.c("Rating", "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new hz8(i, f);
        }
        lad.c("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i = this.a;
        if ((i == 3 || i == 4 || i == 5) && b()) {
            return this.b;
        }
        return -1.0f;
    }

    public final boolean b() {
        return this.b >= 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
