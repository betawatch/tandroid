package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import f7.h0;
import g7.p8;
import j3.r0;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends y5.a {
    public static final Parcelable.Creator<l> CREATOR = new o(3);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final l h;
    public final v n;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(int i9, int i10, String str, String str2, String str3, int i11, List list, l lVar) {
        w wVar;
        w wVar2;
        v vVar;
        this.a = i9;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i11;
        t tVar = v.b;
        if (list instanceof s) {
            vVar = (v) ((s) list);
            if (vVar.p()) {
                Object[] array = vVar.toArray(s.a);
                int length = array.length;
                if (length == 0) {
                    wVar2 = w.e;
                    vVar = wVar2;
                } else {
                    wVar = new w(length, array);
                    vVar = wVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                if (array2[i12] == null) {
                    throw new NullPointerException(r0.l(i12, "at index "));
                }
            }
            if (length2 == 0) {
                wVar2 = w.e;
                vVar = wVar2;
            } else {
                wVar = new w(length2, array2);
                vVar = wVar;
            }
        }
        this.n = vVar;
        this.h = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b == lVar.b && this.e == lVar.e && this.c.equals(lVar.c) && h0.a(this.d, lVar.d) && h0.a(this.f, lVar.f) && h0.a(this.h, lVar.h) && this.n.equals(lVar.n);
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        p8.l(parcel, 3, this.c);
        p8.l(parcel, 4, this.d);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        p8.l(parcel, 6, this.f);
        p8.k(parcel, 7, this.h, i9);
        p8.p(parcel, 8, this.n);
        p8.r(parcel, q10);
    }
}
