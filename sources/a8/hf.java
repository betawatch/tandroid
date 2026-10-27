package a8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class hf {
    public static p6.b a(byte[] bArr, Parcelable.Creator creator) {
        o6.l.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        p6.b bVar = (p6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
