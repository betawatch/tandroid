package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new w.a(21);
    public final String a;

    public o0(String str) {
        n6.l.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            return this.a.equals(((o0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.a);
        w7.f0.r(parcel, q6);
    }
}
