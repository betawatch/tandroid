package n4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new m8.h(6);
    public ResultReceiver a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        this.a.writeToParcel(parcel, i10);
    }
}
