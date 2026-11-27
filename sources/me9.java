// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class me9 implements Parcelable {
    public static final Parcelable.Creator<me9> CREATOR = new mx6(18);
    public cl5 a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            cl5 cl5Var = this.a;
            if (cl5Var == null) {
                cl5Var = new le9(this);
                this.a = cl5Var;
            }
            parcel.writeStrongBinder(cl5Var.asBinder());
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
