package n4;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new m8.h(11);
    public final int a;
    public final float b;
    public Rating c;

    public i0(int i10, float f7) {
        this.a = i10;
        this.b = f7;
    }

    public static i0 c(float f7) {
        if (f7 >= 0.0f && f7 <= 100.0f) {
            return new i0(6, f7);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static i0 d(float f7, int i10) {
        float f10;
        if (i10 == 3) {
            f10 = 3.0f;
        } else if (i10 == 4) {
            f10 = 4.0f;
        } else {
            if (i10 != 5) {
                Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
                return null;
            }
            f10 = 5.0f;
        }
        if (f7 >= 0.0f && f7 <= f10) {
            return new i0(i10, f7);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i10 = this.a;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && b()) {
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
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.a);
        sb2.append(" rating=");
        float f7 = this.b;
        sb2.append(f7 < 0.0f ? "unrated" : String.valueOf(f7));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
