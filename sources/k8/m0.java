package k8;

import android.os.Parcel;
import android.os.Parcelable;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m0 extends a6.a implements j8.g {
    public static final Parcelable.Creator<m0> CREATOR = new c(27);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public m0(int i10, String str, String str2, byte[] bArr) {
        this.a = i10;
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
        return a4.w.q(sb2, obj, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.b);
        com.google.android.gms.internal.cast.o.c(parcel, 4, this.c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
