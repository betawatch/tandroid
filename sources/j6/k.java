package j6;

import android.os.Parcel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k extends c7.a {
    public final i6.a U0(i6.b bVar, String str, int i10, i6.b bVar2) {
        Parcel M0 = M0();
        x6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i10);
        x6.a.c(M0, bVar2);
        Parcel K0 = K0(M0, 2);
        i6.a J0 = i6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }

    public final i6.a V0(i6.b bVar, String str, int i10, i6.b bVar2) {
        Parcel M0 = M0();
        x6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i10);
        x6.a.c(M0, bVar2);
        Parcel K0 = K0(M0, 3);
        i6.a J0 = i6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }
}
