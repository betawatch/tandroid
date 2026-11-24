// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class nve {
    public static zq9 a(byte[] bArr, Parcelable.Creator creator) {
        ite.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        zq9 zq9Var = (zq9) creator.createFromParcel(obtain);
        obtain.recycle();
        return zq9Var;
    }
}
