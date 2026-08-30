package i4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j3.d1;
import j3.n0;
import java.util.Arrays;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c implements e4.b {
    public static final Parcelable.Creator<c> CREATOR = new o(7);
    public final byte[] a;
    public final String b;
    public final String c;

    public c(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // e4.b
    public final /* synthetic */ n0 b() {
        return null;
    }

    @Override // e4.b
    public final void c(d1 d1Var) {
        String str = this.b;
        if (str != null) {
            d1Var.a = str;
        }
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return android.support.v4.media.a.m(this.a.length, "\"", yh.m("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.a = createByteArray;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
