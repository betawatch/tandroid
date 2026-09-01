package j7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class h5 {
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
