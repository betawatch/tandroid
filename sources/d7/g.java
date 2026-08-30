package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public final String a;
    public final k b;
    public final int c;
    public final byte[] d;
    public static final int e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new b9.e(9);

    static {
        ArrayList arrayList = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, k kVar, int i10, byte[] bArr) {
        String str2;
        String str3;
        String str4 = null;
        boolean z4 = true;
        int i11 = e;
        if (i10 != i11) {
            if (i10 >= 0) {
                String[] strArr = j.a;
                if (i10 < 10) {
                    str3 = strArr[i10];
                    if (str3 == null) {
                        z4 = false;
                    }
                }
            } else {
                String[] strArr2 = j.a;
            }
            str3 = null;
            if (str3 == null) {
            }
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i10);
        b6.m.a(sb.toString(), z4);
        this.a = str;
        this.b = kVar;
        this.c = i10;
        this.d = bArr;
        if (i10 != i11) {
            if (i10 >= 0) {
                String[] strArr3 = j.a;
                if (i10 < 10) {
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        StringBuilder sb2 = new StringBuilder(32);
                        sb2.append("Invalid section type ");
                        sb2.append(i10);
                        str4 = sb2.toString();
                        if (str4 == null) {
                            throw new IllegalArgumentException(str4);
                        }
                        return;
                    }
                }
            } else {
                String[] strArr4 = j.a;
            }
            str2 = null;
            if (str2 == null) {
            }
        }
        if (str != null && bArr != null) {
            str4 = "Both content and blobContent set";
        }
        if (str4 == null) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.a);
        f5.k(parcel, 3, this.b, i10);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        f5.c(parcel, 5, this.d);
        f5.r(parcel, q10);
    }
}
