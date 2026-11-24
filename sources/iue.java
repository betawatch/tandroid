// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class iue extends b4 {
    public static final Parcelable.Creator<iue> CREATOR = new sje(26);
    public final String a;
    public final sef b;
    public final int c;
    public final byte[] d;

    static {
        ArrayList arrayList = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iue(String str, sef sefVar, int i, byte[] bArr) {
        String str2;
        String str3;
        String str4;
        boolean z = true;
        if (i != -1) {
            if (i >= 0) {
                String[] strArr = pbf.a;
                if (i < 10) {
                    str4 = strArr[i];
                    if (str4 == null) {
                        z = false;
                    }
                }
            } else {
                String[] strArr2 = pbf.a;
            }
            str4 = null;
            if (str4 == null) {
            }
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        ite.a(sb.toString(), z);
        this.a = str;
        this.b = sefVar;
        this.c = i;
        this.d = bArr;
        if (i != -1) {
            if (i >= 0) {
                String[] strArr3 = pbf.a;
                if (i < 10) {
                    str3 = strArr3[i];
                    if (str3 == null) {
                        StringBuilder sb2 = new StringBuilder(32);
                        sb2.append("Invalid section type ");
                        sb2.append(i);
                        str2 = sb2.toString();
                        if (str2 != null) {
                            return;
                        }
                        u36.j(str2);
                        throw null;
                    }
                }
            } else {
                String[] strArr4 = pbf.a;
            }
            str3 = null;
            if (str3 == null) {
            }
        }
        str2 = (str == null || bArr == null) ? null : "Both content and blobContent set";
        if (str2 != null) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.k(parcel, 3, this.b, i);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.c(parcel, 5, this.d);
        mve.s(parcel, r);
    }
}
