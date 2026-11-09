package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class v1 extends a implements x3 {
    public final z0 x1(a7.b bVar, y6 y6Var) {
        z0 z0Var;
        Parcel p12 = p1();
        int i7 = g0.a;
        p12.writeStrongBinder(bVar);
        p12.writeInt(1);
        y6Var.writeToParcel(p12, 0);
        Parcel r12 = r1(p12, 1);
        IBinder readStrongBinder = r12.readStrongBinder();
        if (readStrongBinder == null) {
            z0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            z0Var = queryLocalInterface instanceof z0 ? (z0) queryLocalInterface : new z0(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 0);
        }
        r12.recycle();
        return z0Var;
    }
}
