package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class eb extends a implements gb {
    public final db x1(a7.b bVar, ib ibVar) {
        db dbVar;
        Parcel p12 = p1();
        int i7 = g0.a;
        p12.writeStrongBinder(bVar);
        p12.writeInt(1);
        ibVar.writeToParcel(p12, 0);
        Parcel r12 = r1(p12, 1);
        IBinder readStrongBinder = r12.readStrongBinder();
        if (readStrongBinder == null) {
            dbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            dbVar = queryLocalInterface instanceof db ? (db) queryLocalInterface : new db(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 0);
        }
        r12.recycle();
        return dbVar;
    }
}
