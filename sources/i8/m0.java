package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m0 extends y5.a implements h8.g {
    public static final Parcelable.Creator<m0> CREATOR = new c(27);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public m0(int i9, String str, String str2, byte[] bArr) {
        this.a = i9;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        byte[] bArr = this.c;
        String obj = (bArr == null ? BuildConfig.BETA_URL : Integer.valueOf(bArr.length)).toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.a);
        sb2.append(",");
        sb2.append(this.b);
        sb2.append(", size=");
        return aa.d.r(sb2, obj, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        p8.l(parcel, 3, this.b);
        p8.c(parcel, 4, this.c);
        p8.l(parcel, 5, this.d);
        p8.r(parcel, q10);
    }
}
