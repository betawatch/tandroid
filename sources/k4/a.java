package k4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.d1;
import j3.n0;
import j8.t;
import java.util.Arrays;
import kf.k0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new t(11);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public a(String str, byte[] bArr, int i10, int i11) {
        this.a = str;
        this.b = bArr;
        this.c = i10;
        this.d = i11;
    }

    @Override // e4.b
    public final /* synthetic */ n0 b() {
        return null;
    }

    @Override // e4.b
    public final /* synthetic */ byte[] d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && Arrays.equals(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + k0.e(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String m9;
        byte[] bArr = this.b;
        int i10 = this.d;
        if (i10 == 1) {
            m9 = d0.m(bArr);
        } else if (i10 == 23) {
            int i11 = d0.a;
            h5.a.f(bArr.length == 4);
            m9 = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)));
        } else if (i10 != 67) {
            m9 = d0.R(bArr);
        } else {
            int i12 = d0.a;
            h5.a.f(bArr.length == 4);
            m9 = String.valueOf(bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8));
        }
        return android.support.v4.media.a.p(this.a, ", value=", m9, new StringBuilder("mdta: key="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.a;
        this.a = readString;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // e4.b
    public final /* synthetic */ void c(d1 d1Var) {
    }
}
