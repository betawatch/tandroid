package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class o0 extends View.BaseSavedState {
    public static final Parcelable.Creator<o0> CREATOR = new j7.b(28);
    public boolean a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }
}
