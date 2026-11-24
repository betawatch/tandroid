// default package

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class dl5 extends e1d {
    public dl5() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", (byte) 1);
    }

    public abstract void T(Status status);

    @Override // e1d
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) g4d.a(parcel, Status.CREATOR);
        g4d.d(parcel);
        T(status);
        return true;
    }
}
