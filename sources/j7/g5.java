package j7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class g5 {
    public static c6.b a(byte[] bArr, Parcelable.Creator creator) {
        b6.m.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        c6.b bVar = (c6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
