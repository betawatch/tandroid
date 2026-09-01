package h4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import h5.d0;
import h5.w;
import j3.d1;
import j3.n0;
import java.util.Arrays;
import r8.d;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new o(4);
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;
    public final byte[] n;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.h = i14;
        this.n = bArr;
    }

    public static a a(w wVar) {
        int g10 = wVar.g();
        String s6 = wVar.s(wVar.g(), d.a);
        String s9 = wVar.s(wVar.g(), d.c);
        int g11 = wVar.g();
        int g12 = wVar.g();
        int g13 = wVar.g();
        int g14 = wVar.g();
        int g15 = wVar.g();
        byte[] bArr = new byte[g15];
        wVar.e(0, g15, bArr);
        return new a(g10, s6, s9, g11, g12, g13, g14, bArr);
    }

    @Override // e4.b
    public final /* synthetic */ n0 b() {
        return null;
    }

    @Override // e4.b
    public final void c(d1 d1Var) {
        d1Var.a(this.a, this.n);
    }

    @Override // e4.b
    public final /* synthetic */ byte[] d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.h == aVar.h && Arrays.equals(this.n, aVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.n) + ((((((((l.d.e(l.d.e((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.n);
    }

    public a(Parcel parcel) {
        this.a = parcel.readInt();
        String readString = parcel.readString();
        int i10 = d0.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.h = parcel.readInt();
        this.n = parcel.createByteArray();
    }
}
