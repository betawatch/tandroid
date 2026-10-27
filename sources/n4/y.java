package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new x(1);
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Bundle d;

    public y(String str, int i10, Bundle bundle) {
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

    public y(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.b = charSequence;
        this.c = parcel.readInt();
        this.d = parcel.readBundle(s.class.getClassLoader());
    }
}
