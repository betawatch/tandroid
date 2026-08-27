package i7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o1 extends c7.a implements q3 {
    public final r0 U0(i6.b bVar, s6 s6Var) {
        r0 r0Var;
        Parcel M0 = M0();
        int i10 = c0.a;
        M0.writeStrongBinder(bVar);
        M0.writeInt(1);
        s6Var.writeToParcel(M0, 0);
        Parcel O0 = O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            r0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            r0Var = queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new r0(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 5);
        }
        O0.recycle();
        return r0Var;
    }
}
