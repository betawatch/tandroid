package b9;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(0);
    public int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final boolean f;

    public a() {
        this.a = 0;
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb.append(this.a);
        sb.append("' } { uploadable: '");
        sb.append(this.b);
        sb.append("' } ");
        String str = this.c;
        if (str != null) {
            sb.append("{ completionToken: '");
            sb.append(str);
            sb.append("' } ");
        }
        String str2 = this.d;
        if (str2 != null) {
            sb.append("{ accountName: '");
            sb.append(str2);
            sb.append("' } ");
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            sb.append("{ ssbContext: [ ");
            for (byte b10 : bArr) {
                sb.append("0x");
                sb.append(Integer.toHexString(b10));
                sb.append(" ");
            }
            sb.append("] } ");
        }
        sb.append("{ contextOnly: '");
        sb.append(this.f);
        sb.append("' } }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.a;
        f5.s(parcel, 1, 4);
        parcel.writeInt(i11);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        f5.l(parcel, 3, this.c);
        f5.l(parcel, 4, this.d);
        f5.c(parcel, 5, this.e);
        f5.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        f5.r(parcel, q10);
    }

    public a(int i10, boolean z4, String str, String str2, byte[] bArr, boolean z10) {
        this.a = i10;
        this.b = z4;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = z10;
    }
}
