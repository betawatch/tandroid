package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import g7.i0;
import h7.r8;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k extends z5.a {
    public static final Parcelable.Creator<k> CREATOR = new n(3);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final k h;
    public final u n;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(int i10, int i11, String str, String str2, String str3, int i12, List list, k kVar) {
        v vVar;
        v vVar2;
        u uVar;
        this.a = i10;
        this.b = i11;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i12;
        s sVar = u.b;
        if (list instanceof r) {
            uVar = (u) ((r) list);
            if (uVar.p()) {
                Object[] array = uVar.toArray(r.a);
                int length = array.length;
                if (length == 0) {
                    vVar2 = v.e;
                    uVar = vVar2;
                } else {
                    vVar = new v(length, array);
                    uVar = vVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i13 = 0; i13 < length2; i13++) {
                if (array2[i13] == null) {
                    throw new NullPointerException(i0.a.k(i13, "at index "));
                }
            }
            if (length2 == 0) {
                vVar2 = v.e;
                uVar = vVar2;
            } else {
                vVar = new v(length2, array2);
                uVar = vVar;
            }
        }
        this.n = uVar;
        this.h = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && this.e == kVar.e && this.c.equals(kVar.c) && i0.a(this.d, kVar.d) && i0.a(this.f, kVar.f) && i0.a(this.h, kVar.h) && this.n.equals(kVar.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.a);
        sb2.append("/");
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (str2.startsWith(str)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        r8.l(parcel, 3, this.c);
        r8.l(parcel, 4, this.d);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        r8.l(parcel, 6, this.f);
        r8.k(parcel, 7, this.h, i10);
        r8.p(parcel, 8, this.n);
        r8.r(parcel, q6);
    }
}
