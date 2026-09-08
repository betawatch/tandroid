package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new w.a(15);
    public b a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
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

    public void a(int i10, Bundle bundle) {
    }
}
