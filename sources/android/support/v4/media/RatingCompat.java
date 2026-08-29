package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new w.a(8);
    public final int a;
    public final float b;
    public Object c;

    public RatingCompat(int i10, float f9) {
        this.a = i10;
        this.b = f9;
    }

    public final float a() {
        if (this.a == 6 && d()) {
            return this.b;
        }
        return -1.0f;
    }

    public final float b() {
        int i10 = this.a;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && d()) {
            return this.b;
        }
        return -1.0f;
    }

    public final boolean c() {
        return this.a == 1 && this.b == 1.0f;
    }

    public final boolean d() {
        return this.b >= 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final boolean e() {
        return this.a == 2 && this.b == 1.0f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.a);
        sb2.append(" rating=");
        float f9 = this.b;
        sb2.append(f9 < 0.0f ? "unrated" : String.valueOf(f9));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
