package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new w.a(22);
    public b a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new c(this);
                }
                parcel.writeStrongBinder(this.a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(int i7, Bundle bundle) {
    }
}
