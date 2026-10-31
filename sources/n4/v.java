package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.i(7);
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Bundle d;

    public v(String str, int i10, Bundle bundle) {
        this.a = str;
        this.b = "";
        this.c = i10;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.b) + ", mIcon=" + this.c + ", mExtras=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i10);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.b = charSequence;
        this.c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
