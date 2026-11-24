// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cc8 implements Parcelable {
    public static final Parcelable.Creator<cc8> CREATOR = new hv6((byte) 11);
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Bundle d;

    public cc8(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.b = charSequence;
        this.c = parcel.readInt();
        this.d = parcel.readBundle(lv6.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.b) + ", mIcon=" + this.c + ", mExtras=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.d);
    }
}
