package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new w.a(13);
    public final int a;
    public final float b;

    public RatingCompat(int i7, float f10) {
        this.a = i7;
        this.b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
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
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
