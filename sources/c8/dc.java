package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class dc {
    public static r6.b a(byte[] bArr, Parcelable.Creator creator) {
        q6.m.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        r6.b bVar = (r6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
