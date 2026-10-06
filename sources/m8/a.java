package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.g0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String a;
    public final byte[] b;
    public final int c;

    public a(String str, byte[] bArr, int i10) {
        this.a = str;
        this.b = bArr;
        this.c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.a);
        g0.c(parcel, 3, this.b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        g0.r(parcel, q6);
    }
}
