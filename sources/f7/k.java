package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import j7.g5;
import j7.l7;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k extends c6.a {
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
                    throw new NullPointerException(l.d.j(i13, "at index "));
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
        return this.a == kVar.a && this.b == kVar.b && this.e == kVar.e && this.c.equals(kVar.c) && l7.a(this.d, kVar.d) && l7.a(this.f, kVar.f) && l7.a(this.h, kVar.h) && this.n.equals(kVar.n);
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
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (str2.startsWith(str)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.f;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        g5.l(parcel, 3, this.c);
        g5.l(parcel, 4, this.d);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        g5.l(parcel, 6, this.f);
        g5.k(parcel, 7, this.h, i10);
        g5.p(parcel, 8, this.n);
        g5.r(parcel, q10);
    }
}
