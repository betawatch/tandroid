// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fse extends b4 {
    public static final Parcelable.Creator<fse> CREATOR = new rhe(26);
    public final String a;
    public final rcf b;
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
    public fse(String str, rcf rcfVar, int i, byte[] bArr) {
        String str2;
        String str3;
        String str4;
        boolean z = true;
        if (i != -1) {
            if (i >= 0) {
                String[] strArr = n9f.a;
                if (i < 10) {
                    str4 = strArr[i];
                    if (str4 == null) {
                        z = false;
                    }
                }
            } else {
                String[] strArr2 = n9f.a;
            }
            str4 = null;
            if (str4 == null) {
            }
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        fre.a(sb.toString(), z);
        this.a = str;
        this.b = rcfVar;
        this.c = i;
        this.d = bArr;
        if (i != -1) {
            if (i >= 0) {
                String[] strArr3 = n9f.a;
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
                        w26.j(str2);
                        throw null;
                    }
                }
            } else {
                String[] strArr4 = n9f.a;
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
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.k(parcel, 3, this.b, i);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.c(parcel, 5, this.d);
        jte.s(parcel, r);
    }
}
