package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new w.a(14);
    public final int a;
    public final Intent b;

    public a(Intent intent, int i7) {
        this.a = i7;
        this.b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.a;
        sb2.append(i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.b);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.a);
        Intent intent = this.b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }

    public a(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
