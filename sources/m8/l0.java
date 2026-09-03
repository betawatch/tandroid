package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l0 extends c6.a implements l8.g {
    public static final Parcelable.Creator<l0> CREATOR = new c(27);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public l0(int i10, String str, String str2, byte[] bArr) {
        this.a = i10;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        byte[] bArr = this.c;
        String obj = (bArr == null ? BuildConfig.BETA_URL : Integer.valueOf(bArr.length)).toString();
        StringBuilder sb = new StringBuilder("MessageEventParcelable[");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        sb.append(", size=");
        return android.support.v4.media.a.r(sb, obj, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        f5.l(parcel, 3, this.b);
        f5.c(parcel, 4, this.c);
        f5.l(parcel, 5, this.d);
        f5.r(parcel, q10);
    }
}
