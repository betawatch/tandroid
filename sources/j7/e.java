package j7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new b(3);
    public final boolean a;

    public e(boolean z9) {
        this.a = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.q(dest, 1, 4);
        dest.writeInt(this.a ? 1 : 0);
        xb.s(dest, r10);
    }
}
