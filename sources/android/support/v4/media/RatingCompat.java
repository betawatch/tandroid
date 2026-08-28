package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new w.a(5);
    public final int a;
    public final float b;
    public Object c;

    public RatingCompat(int i9, float f10) {
        this.a = i9;
        this.b = f10;
    }

    public final float a() {
        if (this.a == 6 && d()) {
            return this.b;
        }
        return -1.0f;
    }

    public final float b() {
        int i9 = this.a;
        if ((i9 == 3 || i9 == 4 || i9 == 5) && d()) {
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
        float f10 = this.b;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
